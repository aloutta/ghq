package com.github.aloutta.ghq.persistence.service;

import com.github.aloutta.ghq.persistence.mapper.VideoMapper;
import com.github.aloutta.ghq.persistence.repository.VideoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VideoService {

  private static final VideoMapper VIDEO_MAPPER = VideoMapper.INSTANCE;
  private final VideoRepository videoRepository;
}
