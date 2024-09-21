package com.github.aloutta.ghq.persistence.service;

import com.github.aloutta.ghq.persistence.mapper.ReleaseMapper;
import com.github.aloutta.ghq.persistence.repository.ReleaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReleaseService {

  private static final ReleaseMapper RELEASE_MAPPER = ReleaseMapper.INSTANCE;
  private final ReleaseRepository releaseRepository;
}
