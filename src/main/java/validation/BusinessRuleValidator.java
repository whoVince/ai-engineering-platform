package com.example.validation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

import com.example.entity.EngineeringProject;

import com.example.entity.GenerationRun;

import com.example.entity.GeneratedArtifact;

import com.example.entity.ReviewDecision;

import com.example.entity.UsageEstimate;


public final class BusinessRuleValidator {
    private BusinessRuleValidator() {
    }

    public static void validate(Object entity) {

        if (entity instanceof EngineeringProject typed) {
            validateEngineeringProject(typed);
        }

        if (entity instanceof GenerationRun typed) {
            validateGenerationRun(typed);
        }

        if (entity instanceof GeneratedArtifact typed) {
            validateGeneratedArtifact(typed);
        }

        if (entity instanceof ReviewDecision typed) {
            validateReviewDecision(typed);
        }

        if (entity instanceof UsageEstimate typed) {
            validateUsageEstimate(typed);
        }

    }


    private static void validateEngineeringProject(EngineeringProject entity) {
        List<String> errors = new ArrayList<>();

        if (!errors.isEmpty()) {
            throw new IllegalArgumentException(String.join("; ", errors));
        }
    }


    private static void validateGenerationRun(GenerationRun entity) {
        List<String> errors = new ArrayList<>();

        if (!errors.isEmpty()) {
            throw new IllegalArgumentException(String.join("; ", errors));
        }
    }


    private static void validateGeneratedArtifact(GeneratedArtifact entity) {
        List<String> errors = new ArrayList<>();

        if (!errors.isEmpty()) {
            throw new IllegalArgumentException(String.join("; ", errors));
        }
    }


    private static void validateReviewDecision(ReviewDecision entity) {
        List<String> errors = new ArrayList<>();

        if (!errors.isEmpty()) {
            throw new IllegalArgumentException(String.join("; ", errors));
        }
    }


    private static void validateUsageEstimate(UsageEstimate entity) {
        List<String> errors = new ArrayList<>();

        if (!errors.isEmpty()) {
            throw new IllegalArgumentException(String.join("; ", errors));
        }
    }


}
