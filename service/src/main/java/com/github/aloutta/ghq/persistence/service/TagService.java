package com.github.aloutta.ghq.persistence.service;

import com.github.aloutta.ghq.persistence.mapper.TagMapper;
import com.github.aloutta.ghq.persistence.repository.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TagService {

  private static final TagMapper TAG_MAPPER = TagMapper.INSTANCE;
  private final TagRepository tagRepository;
}
