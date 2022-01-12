package com.jhowdevsuperior.dsmovie.dto;

public class ScoreDTO {
	
	private Long movieId;
	private String email;
	private Double score;
	
	public ScoreDTO() {
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMoveId(Long moveId) {
		this.movieId = moveId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}
	
	

}
