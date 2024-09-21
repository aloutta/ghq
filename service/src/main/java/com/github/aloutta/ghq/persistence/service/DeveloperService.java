package com.github.aloutta.ghq.persistence.service;

import com.github.aloutta.ghq.persistence.mapper.DeveloperMapper;
import com.github.aloutta.ghq.persistence.repository.DeveloperRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeveloperService {

  private static final DeveloperMapper DEVELOPER_MAPPER = DeveloperMapper.INSTANCE;
  private final DeveloperRepository developerRepository;
}
