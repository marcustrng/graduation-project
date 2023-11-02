package com.uth.ums.career.service.impl;

import com.uth.ums.career.model.dto.CareerDto;
import com.uth.ums.career.model.mapper.CareerMapper;
import com.uth.ums.career.repository.CareerRepository;
import com.uth.ums.career.service.CareerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CareerServiceImpl implements CareerService {
    private final CareerRepository careerRepository;
    private final CareerMapper careerMapper;

    @Override
    public List<CareerDto> getAll() {
        return careerRepository.findAll().stream().map(careerMapper::toDto).toList();
    }

    @Override
    public CareerDto getById(Long id) {
        return null;
    }

    @Override
    public CareerDto createNew(CareerDto dto) {
        return null;
    }

    @Override
    public CareerDto update(Long id, CareerDto dto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
