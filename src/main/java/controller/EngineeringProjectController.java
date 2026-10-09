package com.example.controller;

import com.example.entity.EngineeringProject;
import com.example.repository.EngineeringProjectRepository;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/projects")
public class EngineeringProjectController {
    private final EngineeringProjectRepository projects;

    public EngineeringProjectController(EngineeringProjectRepository projects) {
        this.projects = projects;
    }

    @GetMapping
    public List<ProjectResponse> list() {
        return projects.findAll().stream().map(ProjectResponse::from).toList();
    }

    @GetMapping("/{id}")
    public ProjectResponse findById(@PathVariable Long id) {
        return ProjectResponse.from(projects.findById(id).orElseThrow());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProjectResponse create(@RequestBody @Valid ProjectRequest request) {
        return ProjectResponse.from(projects.save(new EngineeringProject(request.name(), request.description())));
    }

    public record ProjectRequest(@NotBlank @Size(min = 3, max = 120) String name, @NotBlank String description) {}
    public record ProjectResponse(Long id, String name, String description, String status, java.time.Instant createdAt) {
        static ProjectResponse from(EngineeringProject project) {
            return new ProjectResponse(project.getId(), project.getName(), project.getDescription(), project.getStatus(), project.getCreatedAt());
        }
    }
}
