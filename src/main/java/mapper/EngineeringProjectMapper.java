package com.example.mapper;

import com.example.dto.EngineeringProjectRequestDto;
import com.example.dto.EngineeringProjectResponseDto;
import com.example.entity.EngineeringProject;

public class EngineeringProjectMapper {
    public EngineeringProject toEntity(EngineeringProjectRequestDto dto) {
        return new EngineeringProject();
    }

    public EngineeringProjectResponseDto toResponse(EngineeringProject entity) {
        return new EngineeringProjectResponseDto();
    }
}
