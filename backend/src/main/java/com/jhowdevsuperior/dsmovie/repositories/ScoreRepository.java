package com.jhowdevsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhowdevsuperior.dsmovie.entities.Score;
import com.jhowdevsuperior.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
