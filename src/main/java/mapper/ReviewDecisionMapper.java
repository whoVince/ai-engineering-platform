package com.example.mapper;

import com.example.dto.ReviewDecisionRequestDto;
import com.example.dto.ReviewDecisionResponseDto;
import com.example.entity.ReviewDecision;

public class ReviewDecisionMapper {
    public ReviewDecision toEntity(ReviewDecisionRequestDto dto) {
        return new ReviewDecision();
    }

    public ReviewDecisionResponseDto toResponse(ReviewDecision entity) {
        return new ReviewDecisionResponseDto();
    }
}
