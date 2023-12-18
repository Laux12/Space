package com.zetcode;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class HighScoreControl {
	// file path / file location
	private final String filePath = "HighScore.ser";

	// file handling
	// saved the highscore to file
	public void saveScores(HighScore hScores) throws IOException {

		FileOutputStream fileOut = new FileOutputStream(filePath);
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(hScores);// write score to file
		out.close();
		fileOut.close();
	}

	// load the highscore from the file
	public HighScore loadScores() throws ClassNotFoundException, IOException {
		HighScore hScore = null;
		FileInputStream fileIn = new FileInputStream(filePath);
		ObjectInputStream in = new ObjectInputStream(fileIn);

		hScore = (HighScore) in.readObject();// load score from file
		fileIn.close();
		in.close();

		return hScore;

	}
}
