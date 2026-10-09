CREATE TABLE IF NOT EXISTS reviewdecision (

    id UUID,


    generationRunId UUID,


    reviewer VARCHAR(255),


    decision VARCHAR(255),


    comment TEXT,


    decidedAt TIMESTAMP

);