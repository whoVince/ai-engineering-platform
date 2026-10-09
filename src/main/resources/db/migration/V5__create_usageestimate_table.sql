CREATE TABLE IF NOT EXISTS usageestimate (

    id UUID,


    generationRunId UUID,


    inputTokens BIGINT,


    outputTokens BIGINT,


    estimatedCost DECIMAL(38,2),


    currency VARCHAR(255)

);