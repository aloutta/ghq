package com.github.aloutta.ghq.persistence.mapper;

import com.github.aloutta.ghq.persistence.entity.Country;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CountryMapper {
  CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);

  Country map(com.github.aloutta.ghq.persistence.model.Country model);

  com.github.aloutta.ghq.persistence.model.Country map(Country entity);
}
