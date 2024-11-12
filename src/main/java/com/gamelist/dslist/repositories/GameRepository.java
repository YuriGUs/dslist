package com.gamelist.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gamelist.dslist.entities.Game;

// Acessando os dados
// 1. Acessou os dados
public interface GameRepository extends JpaRepository<Game, Long> {

}
