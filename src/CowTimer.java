
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.applet.AudioClip;
import java.io.IOException;
import javax.swing.JApplet;

public class CowTimer {
	/*
	 * This is an advanced recipe. There may be more than one line of code for each
	 * instruction. Work in seconds when testing, then change to minutes
	 */
	static CowTimer a = new CowTimer();

	public static void main(String[] args) throws InterruptedException {
		/* 1. Make a CowTimer, set the time and start it. */

		a.setTime(5);
		a.start();
	}

	private int minutes;

	public void setTime(int minutes) {
		this.minutes = minutes;
		System.out.println("Cow set to " + minutes + " minutes.");
	}

	String minutesString = Integer.toString(this.minutes);

	public void start() throws InterruptedException {
		
		while (minutes > 0) {
			minutes--;
			System.out.println(minutes);
			Thread.sleep(1000);
		}

		if (this.minutes == 0) {
			
			System.out.println("Done");
		}
		

		/*
		 * 2. Count down the minutes, print the current minute then sleep for 60
		 * 
		 * seconds using Thread.sleep(int milliseconds).
		 */

		/*
		 * 3. When the timer is finished, use the playSound method to play a moo sound.
		 * You can use the .wav file in the default package, or you can download one
		 * from freesound.org, then drag it intothe default package.
		 */

	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	private void speak(String stuffToSay) {
		try {
			Runtime.getRuntime().exec("say " + stuffToSay).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
