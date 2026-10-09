package com.example.mapper;

import com.example.dto.GenerationRunRequestDto;
import com.example.dto.GenerationRunResponseDto;
import com.example.entity.GenerationRun;

public class GenerationRunMapper {
    public GenerationRun toEntity(GenerationRunRequestDto dto) {
        return new GenerationRun();
    }

    public GenerationRunResponseDto toResponse(GenerationRun entity) {
        return new GenerationRunResponseDto();
    }
}
