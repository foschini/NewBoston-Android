package com.thenewboston.travis;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;



public class Splash extends Activity {
	
	MediaPlayer ourSong;
	@Override
	protected void onCreate(Bundle TravisLoveBacon) {
		// TODO Auto-generated method stub
		super.onCreate(TravisLoveBacon);
		setContentView(R.layout.splash);
		
		ourSong = MediaPlayer.create(Splash.this, R.raw.splashsound);
		ourSong.start();
		
		
		
		Thread timer = new Thread(){
			
			public void run(){
				try{
					sleep(50);
					//sleep(5000);
				} catch(InterruptedException e){
					e.printStackTrace();
				} finally{
					
					Intent openStartingPoint = new Intent("com.thenewboston.travis.MENU");
					startActivity(openStartingPoint);
					} 
				}
			
		};
		timer.start();
		
		
		
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		
		ourSong.release();
		
		finish(); //termina l'activity SPLASH appena perde il focus (perciò dopo 5 secondi)
	}

	
	
}
