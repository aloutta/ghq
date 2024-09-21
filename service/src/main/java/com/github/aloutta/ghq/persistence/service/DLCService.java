package com.github.aloutta.ghq.persistence.service;

import com.github.aloutta.ghq.persistence.mapper.DLCMapper;
import com.github.aloutta.ghq.persistence.repository.DLCRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DLCService {

  private static final DLCMapper DLC_MAPPER = DLCMapper.INSTANCE;
  private final DLCRepository dlcRepository;
}
