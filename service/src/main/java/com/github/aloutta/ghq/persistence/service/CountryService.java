package com.github.aloutta.ghq.persistence.service;

import com.github.aloutta.ghq.persistence.api.CountriesApiDelegate;
import com.github.aloutta.ghq.persistence.mapper.CountryMapper;
import com.github.aloutta.ghq.persistence.model.Country;
import com.github.aloutta.ghq.persistence.model.CountryPage;
import com.github.aloutta.ghq.persistence.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CountryService implements CountriesApiDelegate {

  private static final CountryMapper COUNTRY_MAPPER = CountryMapper.INSTANCE;
  private final CountryRepository countryRepository;

  @Override
  public ResponseEntity<Country> getCountry(Long countryId) {
    var country = countryRepository.findById(countryId).orElse(null);
    return ResponseEntity.ok(COUNTRY_MAPPER.map(country));
  }

  @Override
  public ResponseEntity<CountryPage> listCountries(Pageable pageable) {
    var countryPage = countryRepository.findAll(pageable).map(COUNTRY_MAPPER::map);
    return ResponseEntity.ok(
        new CountryPage()
            .content(countryPage.getContent())
            .pageable(countryPage.getPageable())
            .totalElements(countryPage.getTotalElements())
            .totalPages(countryPage.getTotalPages())
            .sort(countryPage.getSort())
            .first(countryPage.isFirst())
            .last(countryPage.isLast())
            .number(countryPage.getNumber())
            .numberOfElements(countryPage.getNumberOfElements())
            .size(countryPage.getSize())
            .empty(countryPage.isEmpty()));
  }
}
