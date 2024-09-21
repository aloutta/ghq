package com.github.aloutta.ghq.persistence.service;

import com.github.aloutta.ghq.persistence.mapper.PlatformMapper;
import com.github.aloutta.ghq.persistence.repository.PlatformRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlatformService {

  private static final PlatformMapper PLATFORM_MAPPER = PlatformMapper.INSTANCE;
  private final PlatformRepository platformRepository;
}
