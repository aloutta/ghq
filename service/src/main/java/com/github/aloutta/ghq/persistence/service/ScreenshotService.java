package com.github.aloutta.ghq.persistence.service;

import com.github.aloutta.ghq.persistence.mapper.ScreenshotMapper;
import com.github.aloutta.ghq.persistence.repository.ScreenshotRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScreenshotService {

  private static final ScreenshotMapper SCREENSHOT_MAPPER = ScreenshotMapper.INSTANCE;
  private final ScreenshotRepository screenshotRepository;
}
