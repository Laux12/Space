package com.zetcode;

import java.io.Serializable;

public class HighScore implements Serializable {
	private static final long serialVersionUID = 1L;
	private int score;

	// OOP concept getter
	// setter for setter
	public void setScore(int score) {
		this.score = score;
	}

	// OOP concept getter
	// getter that returns score
	public int getScore() {
		return this.score;

	}
}
