CREATE TABLE IF NOT EXISTS generatedartifact (

    id UUID,


    generationRunId UUID,


    path VARCHAR(255),


    kind VARCHAR(255),


    contentHash VARCHAR(255),


    validationStatus VARCHAR(255)

);