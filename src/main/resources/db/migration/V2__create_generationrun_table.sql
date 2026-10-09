CREATE TABLE IF NOT EXISTS generationrun (

    id UUID,


    projectId UUID,


    requirementsSnapshot TEXT,


    status VARCHAR(255),


    startedAt TIMESTAMP,


    completedAt TIMESTAMP

);