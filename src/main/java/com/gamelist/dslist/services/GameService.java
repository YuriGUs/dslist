package com.gamelist.dslist.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gamelist.dslist.dto.GameMinDTO;
import com.gamelist.dslist.entities.Game;
import com.gamelist.dslist.repositories.GameRepository;

@Service // Precisa ser injetado como service
public class GameService {
  
  @Autowired // 2. Pega os dados de GameRepository, instanciando com assinatura Autowired
  private GameRepository gameRepository;

  public List<GameMinDTO> findAll() {
    List<Game> result = gameRepository.findAll(); // 3. Acessa a lista de games de gameRepository
    List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList(); // transforma a lista em DTO
    return dto; 
  }
}
