package com.example.mapper;

import com.example.dto.UsageEstimateRequestDto;
import com.example.dto.UsageEstimateResponseDto;
import com.example.entity.UsageEstimate;

public class UsageEstimateMapper {
    public UsageEstimate toEntity(UsageEstimateRequestDto dto) {
        return new UsageEstimate();
    }

    public UsageEstimateResponseDto toResponse(UsageEstimate entity) {
        return new UsageEstimateResponseDto();
    }
}
