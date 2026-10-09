import { useState } from 'react';

type View = 'overview' | 'projects' | 'new-project' | 'reviews' | 'costs';

const navItems: { id: View; label: string; icon: string }[] = [
  { id: 'overview', label: 'Overview', icon: 'âŒ‚' },
  { id: 'projects', label: 'Projects', icon: 'â—ˆ' },
  { id: 'new-project', label: 'New generation', icon: '+' },
  { id: 'reviews', label: 'Review queue', icon: 'âœ“' },
  { id: 'costs', label: 'Usage & cost', icon: 'â—Œ' },
];

const projects = [
  { name: 'AI Engineering Platform AI Platform', stack: 'Java Â· Spring Boot Â· React', status: 'In review', time: '12 min ago', tone: 'purple' },
  { name: 'MedFlow Inventory', stack: 'Java Â· PostgreSQL Â· Kafka', status: 'Approved', time: 'Yesterday', tone: 'green' },
  { name: 'Knowledge Assistant', stack: 'Python Â· FastAPI Â· pgvector', status: 'Draft', time: 'Oct 06, 2026', tone: 'orange' },
];

function App() {
  const [activeView, setActiveView] = useState<View>('overview');
  const [notice, setNotice] = useState('');

  const openView = (view: View) => {
    setActiveView(view);
    setNotice('');
  };

  return (
    <div className="app-shell">
      <aside className="sidebar">
        <div className="brand">
          <div className="brand-mark">F</div>
          <div>
            <strong>ai-engineering-platform</strong>
            <span>AI engineering platform</span>
          </div>
        </div>
        <div className="workspace-picker">
          <span className="workspace-dot" />
          <div><small>Workspace</small><strong>Portfolio lab</strong></div>
          <span className="chevron">âŒ„</span>
        </div>
        <nav>
          <p className="nav-caption">WORKSPACE</p>
          {navItems.map((item) => (
            <button className={`nav-item ${activeView === item.id ? 'active' : ''}`} key={item.id} onClick={() => openView(item.id)}>
              <span className="nav-icon">{item.icon}</span>{item.label}
              {item.id === 'reviews' && <span className="nav-count">3</span>}
            </button>
          ))}
          <p className="nav-caption nav-caption-spaced">INSIGHTS</p>
          <button className="nav-item" onClick={() => setNotice('Observability dashboard is connected to the generation events API.')}>
            <span className="nav-icon">â—‰</span>Observability
          </button>
          <button className="nav-item" onClick={() => setNotice('Documentation hub will publish the generated ADRs and API contracts.')}>
            <span className="nav-icon">â–¤</span>Documentation
          </button>
        </nav>
        <div className="sidebar-bottom">
          <div className="security-note"><span>â—†</span><div><strong>Safe by default</strong><small>Artifacts are untrusted until approved.</small></div></div>
          <div className="profile"><div className="avatar">WV</div><div><strong>whovince</strong><small>Administrator</small></div><span>â€¢â€¢â€¢</span></div>
        </div>
      </aside>

      <main className="main-content">
        <header className="topbar">
          <div className="breadcrumbs"><span>Portfolio lab</span><b>/</b><strong>{navItems.find((item) => item.id === activeView)?.label}</strong></div>
          <div className="top-actions"><button className="icon-button">âŒ•</button><button className="icon-button">?</button><div className="top-avatar">WV</div></div>
        </header>
        <div className="page">
          {notice && <div className="toast" onClick={() => setNotice('')}>âœ“ {notice}</div>}
          {activeView === 'overview' && <Overview onNavigate={openView} />}
          {activeView === 'projects' && <Projects onNavigate={openView} />}
          {activeView === 'new-project' && <NewProject onCreated={() => { setNotice('Generation queued. It will appear in the review queue when ready.'); openView('reviews'); }} />}
          {activeView === 'reviews' && <Reviews onNavigate={openView} />}
          {activeView === 'costs' && <Costs />}
        </div>
      </main>
    </div>
  );
}

function PageHeading({ eyebrow, title, description, action }: { eyebrow: string; title: string; description: string; action?: React.ReactNode }) {
  return <div className="page-heading"><div><p className="eyebrow">{eyebrow}</p><h1>{title}</h1><p className="heading-description">{description}</p></div>{action}</div>;
}

function Overview({ onNavigate }: { onNavigate: (view: View) => void }) {
  return <>
    <PageHeading eyebrow="Wednesday, October 9, 2026" title="Good evening, Vicente." description="Turn engineering intent into reviewable, production-minded software." action={<button className="primary-button" onClick={() => onNavigate('new-project')}>+ Start a generation</button>} />
    <section className="hero-card"><div><span className="hero-label">GENERATION CONTROL PLANE</span><h2>Build with confidence,<br /><em>not black boxes.</em></h2><p>AI Engineering Platform turns requirements into architecture, code, and documentation while keeping humans in control of every generated artifact.</p><button className="dark-button" onClick={() => onNavigate('new-project')}>Create a project <span>â†’</span></button></div><div className="hero-visual"><div className="orbit orbit-one" /><div className="orbit orbit-two" /><div className="core"><span>âœ¦</span><strong>AI</strong><small>ENGINE</small></div><div className="floating-card card-one">âŒ˜ <span>Architecture</span><b>ready</b></div><div className="floating-card card-two">âœ“ <span>Human review</span><b>required</b></div><div className="floating-card card-three">â†— <span>Cost estimate</span><b>$2.84</b></div></div></section>
    <div className="section-heading"><div><h2>Workspace pulse</h2><p>What is happening across your engineering workbench.</p></div><button className="text-button" onClick={() => onNavigate('projects')}>View all projects â†’</button></div>
    <div className="metric-grid"><Metric label="Active projects" value="08" change="+2 this month" icon="â—ˆ" tone="purple" /><Metric label="Pending review" value="03" change="Needs your attention" icon="âœ“" tone="orange" /><Metric label="Artifacts validated" value="94.2%" change="+8.4% vs last month" icon="âŒ" tone="green" /><Metric label="Est. monthly cost" value="$24.80" change="Within your $50 budget" icon="$" tone="blue" /></div>
    <div className="content-grid"><section className="panel"><div className="panel-heading"><div><h3>Recent projects</h3><p>Latest generation activity</p></div><button className="dots">â€¢â€¢â€¢</button></div>{projects.map((project) => <ProjectRow key={project.name} project={project} />)}</section><section className="panel review-panel"><div className="panel-heading"><div><h3>Review queue</h3><p>Human approval is required</p></div><span className="queue-badge">3 waiting</span></div><div className="review-highlight"><div className="review-icon">âœ¦</div><div><strong>AI Engineering Platform AI Platform</strong><p>24 artifacts Â· 3 validation warnings</p><span>Generated 12 min ago</span></div></div><div className="review-actions"><button className="outline-button" onClick={() => onNavigate('reviews')}>Open review</button><button className="ghost-button">Later</button></div></section></div>
  </>;
}

function Metric({ label, value, change, icon, tone }: { label: string; value: string; change: string; icon: string; tone: string }) {
  return <div className="metric-card"><div className={`metric-icon ${tone}`}>{icon}</div><div><p>{label}</p><strong>{value}</strong><small className={change.includes('attention') ? 'warning' : ''}>{change}</small></div></div>;
}

function ProjectRow({ project }: { project: typeof projects[number] }) {
  return <div className="project-row"><div className={`project-logo ${project.tone}`}>{project.name.split(' ').map((part) => part[0]).slice(0, 2).join('')}</div><div className="project-info"><strong>{project.name}</strong><span>{project.stack}</span></div><span className={`status ${project.tone}`}>{project.status}</span><time>{project.time}</time><button className="dots">â€¢â€¢â€¢</button></div>;
}

function Projects({ onNavigate }: { onNavigate: (view: View) => void }) {
  return <><PageHeading eyebrow="WORKSPACE / PROJECTS" title="Your projects" description="A traceable history of every engineering decision and generation." action={<button className="primary-button" onClick={() => onNavigate('new-project')}>+ New project</button>} /><div className="toolbar"><div className="search-box">âŒ• <input placeholder="Search projects..." /></div><button className="filter-button">All statusesâŒ„</button><button className="filter-button">Recently updatedâŒ„</button></div><section className="panel projects-table">{projects.concat([{ name: 'Order Platform', stack: 'Java Â· Spring Boot Â· Kafka', status: 'Approved', time: 'Oct 02, 2026', tone: 'green' as const }]).map((project) => <ProjectRow key={project.name} project={project} />)}</section></>;
}

function NewProject({ onCreated }: { onCreated: () => void }) {
  const [submitted, setSubmitted] = useState(false);
  return <><PageHeading eyebrow="NEW GENERATION" title="What are you building?" description="Start with intent. AI Engineering Platform will help you shape the architecture before writing code." /><div className="generation-layout"><section className="panel generation-form"><div className="step-line"><span className="step active">1</span><span>Project intent</span><i /><span className="step">2</span><span>Stack</span><i /><span className="step">3</span><span>Review</span></div><label>Project name<input defaultValue="AI Engineering Platform" /></label><label>Describe the problem you want to solve<textarea defaultValue="Build an AI-assisted software engineering platform that transforms structured requirements into reviewable architecture and source artifacts." /></label><div className="form-row"><label>Project profile<select defaultValue="Web platform"><option>Web platform</option><option>Mobile app</option><option>API service</option></select></label><label>Generation language<select defaultValue="English"><option>English</option><option>PortuguÃªs</option></select></label></div><div className="form-check"><input type="checkbox" defaultChecked /> <span>Include architecture decisions and technical documentation</span></div><div className="form-check"><input type="checkbox" defaultChecked /> <span>Enable isolated validation before approval</span></div><div className="form-actions"><button className="ghost-button">Save as draft</button><button className="primary-button" onClick={() => { setSubmitted(true); onCreated(); }}>Generate architecture â†’</button></div>{submitted && <p className="success-message">Generation submitted successfully.</p>}</section><aside className="panel intent-aside"><span className="aside-icon">âœ¦</span><h3>Designed for senior decisions</h3><p>The generated result is not a code dump. It includes trade-offs, boundaries, validation checks, and a human approval checkpoint.</p><ul><li>Architecture proposal</li><li>API and database contracts</li><li>Untrusted artifact isolation</li><li>Usage and cost estimate</li></ul></aside></div></>;
}

function Reviews({ onNavigate }: { onNavigate: (view: View) => void }) {
  return <><PageHeading eyebrow="ARTIFACT REVIEW" title="Review queue" description="Nothing reaches accepted status without a human decision." action={<button className="outline-button" onClick={() => onNavigate('projects')}>â† Back to projects</button>} /><div className="review-layout"><section className="panel review-list"><div className="panel-heading"><div><h3>3 generations need attention</h3><p>Sorted by most recent</p></div></div>{['AI Engineering Platform AI Platform', 'MedFlow Inventory', 'Knowledge Assistant'].map((name, index) => <div className="review-row" key={name}><div className={`review-file-icon ${index === 0 ? 'purple' : index === 1 ? 'green' : 'orange'}`}>âœ¦</div><div><strong>{name}</strong><p>{index === 0 ? '24 artifacts Â· 3 warnings' : index === 1 ? '18 artifacts Â· all validated' : '11 artifacts Â· 1 warning'}</p><small>{index === 0 ? 'Generated 12 min ago' : index === 1 ? 'Generated yesterday' : 'Generated Oct 06, 2026'}</small></div><button className="outline-button small">Review â†’</button></div>)}</section><section className="panel checklist"><div className="panel-heading"><div><h3>Approval checklist</h3><p>What reviewers verify</p></div></div>{['Architecture boundaries are explicit', 'No secrets or unsafe execution paths', 'API contracts match the domain', 'Tests cover critical business rules', 'Documentation explains trade-offs'].map((item, index) => <div className="check-row" key={item}><span className={index < 2 ? 'check done' : 'check'}>{index < 2 ? 'âœ“' : ''}</span>{item}</div>)}</section></div></>;
}

function Costs() {
  return <><PageHeading eyebrow="OBSERVABILITY / COST" title="Usage & cost" description="Make model usage visible, predictable, and explainable." action={<button className="outline-button">Export report â†“</button>} /><div className="metric-grid"><Metric label="This month" value="$24.80" change="+12.4% vs September" icon="$" tone="blue" /><Metric label="Input tokens" value="184.2k" change="Across 8 generations" icon="â†“" tone="purple" /><Metric label="Output tokens" value="92.7k" change="Average 11.6k / run" icon="â†‘" tone="green" /><Metric label="Budget remaining" value="$25.20" change="50% of monthly limit" icon="â—Ž" tone="orange" /></div><section className="panel usage-panel"><div className="panel-heading"><div><h3>Generation spend</h3><p>Estimated cost in USD Â· October 2026</p></div><span className="legend"><i /> Estimated cost</span></div><div className="chart"><div className="chart-y"><span>$8</span><span>$6</span><span>$4</span><span>$2</span><span>$0</span></div><div className="chart-area">{[38, 52, 45, 68, 48, 82, 62, 76, 54, 88, 70, 64].map((height, index) => <div className="bar-wrap" key={index}><div className="bar" style={{ height: `${height}%` }} /><small>{index + 1}</small></div>)}</div></div></section></>;
}

export default App;

