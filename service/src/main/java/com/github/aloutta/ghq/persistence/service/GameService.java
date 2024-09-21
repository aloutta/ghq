package com.github.aloutta.ghq.persistence.service;

import com.github.aloutta.ghq.persistence.mapper.GameMapper;
import com.github.aloutta.ghq.persistence.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GameService {

  private static final GameMapper GAME_MAPPER = GameMapper.INSTANCE;
  private final GameRepository gameRepository;
}
