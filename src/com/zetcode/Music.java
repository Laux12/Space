package com.zetcode;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class Music {
	Clip clip;
	FloatControl volume;
	float currVol = -10f;

	// set the filepath of the music to play
	public void setFile(File file) {
		try {
			AudioInputStream sound = AudioSystem.getAudioInputStream(file);
			clip = AudioSystem.getClip();
			clip.open(sound);
			volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			volume.setValue(currVol);
		} catch (Exception e) {

		}
	}

	// start the music
	public void play() {
		clip.setFramePosition(0);
		clip.start();
	}

	// to loop the music
	public void loop() {
		clip.loop(Clip.LOOP_CONTINUOUSLY);

	}

	// to stop the music
	public void stop() {
		clip.stop();
	}

	// to off the music volume
	public void offMusic() {
		volume.setValue(-80f);
	}

	// of on the music volume
	public void onMusic() {
		volume.setValue(-10f);
	}
}
