package com.example.mapper;

import com.example.dto.GeneratedArtifactRequestDto;
import com.example.dto.GeneratedArtifactResponseDto;
import com.example.entity.GeneratedArtifact;

public class GeneratedArtifactMapper {
    public GeneratedArtifact toEntity(GeneratedArtifactRequestDto dto) {
        return new GeneratedArtifact();
    }

    public GeneratedArtifactResponseDto toResponse(GeneratedArtifact entity) {
        return new GeneratedArtifactResponseDto();
    }
}
