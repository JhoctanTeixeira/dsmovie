package com.jhowdevsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhowdevsuperior.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
