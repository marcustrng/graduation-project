package com.uth.ums.career.service;

import com.uth.ums.career.model.dto.UniversityClassDto;

import java.util.List;

public interface UniversityClassService {
    List<UniversityClassDto> getAll();
    UniversityClassDto getById(Long id);
    UniversityClassDto createNew(UniversityClassDto dto);
    UniversityClassDto update(Long id, UniversityClassDto dto);
    void delete(Long id);
}
