package com.ipl.cricket.sb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ipl.cricket.sb.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Long>{

}
