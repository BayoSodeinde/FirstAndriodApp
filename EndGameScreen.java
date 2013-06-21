package com.david.chesthunter2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class EndGameScreen extends Activity {

	public String[] pl1;
	public String[] pl2;
	public int counter;
	public int[] gold;
	public int score1 = 0;
	public int score2 = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_end_game_screen);
		
	
		
		Intent i = getIntent();
		this.counter = i.getIntExtra("counter", 0);
		this.gold = i.getIntArrayExtra("gold");
		this.pl1 = i.getStringArrayExtra("pl1");
		this.pl2 = i.getStringArrayExtra("pl2");
		
		
		
		for(int j = 0; j < 6; j++) {
			
		if(pl1[j].equals("Chest 1")) {
			this.score1 += gold[0];
			} 
		if(pl1[j].equals("Chest 2")) {
			this.score1 += gold[1];
			} 
		if(pl1[j].equals("Chest 3")) {
			this.score1 += gold[2];
			} 
		if(pl1[j].equals("Chest 4")) {
			
			score1 = score1 + gold[3];
			} 
		//if(pl1[j].equals("Chest 5")) {
		//	score1 += gold[4];
			//} 
	//	if(pl1[j].equals("Chest 6")) {
			//score1 += gold[5];
		//	} 
	/*	if(pl2[j].equals("Chest 1")) {
			score2 += gold[0];
			} 
		if(pl2[j].equals("Chest 2")) {
			score2 += gold[1];
			} 
		if(pl2[j].equals("Chest 3")) {
			score2 += gold[2];
			} 
		if(pl2[j].equals("Chest 4")) {
			score2 += gold[3];
			} 
		if(pl2[j].equals("Chest 5")) {
			score2 += gold[4];
			} 
		if(pl2[j].equals("Chest 6")) {
					score2 += gold[5]; 
				}
		
		*/
		} 
		
		TextView t = (TextView) findViewById(R.id.textView1);
		if(score1 > score2) {
			t.setText("Player 1");
		} else {
			t.setText("Player 2");
		
			
		}
		
	}
	
	
	public void playAgain(View view) {
		Intent intent = new Intent(this,FrontPage.class);
		startActivity(intent);
		finish();
		
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.end_game_screen, menu);
		return true;
	}

}
