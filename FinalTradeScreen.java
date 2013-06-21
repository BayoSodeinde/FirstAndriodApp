package com.david.chesthunter2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class FinalTradeScreen extends Activity {
	
	
	public String[] pl1;
	public String[] pl2;
	public String[] tradearray;
	public String[] tradearray2; 
	public int counter;
	public int goldclaim;
	public int[] gold;
	int foo = 0;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_final_trade_screen);
		
		
		Intent i = getIntent();
		this.gold = i.getIntArrayExtra("gold");
		this.pl1 = i.getStringArrayExtra("pl1");
		this.pl2 = i.getStringArrayExtra("pl2");
		this.tradearray = i.getStringArrayExtra("tradearray");
		this.tradearray2 = i.getStringArrayExtra("tradearray2");
		this.goldclaim = i.getIntExtra("goldclaim", 0);
		this.counter = i.getIntExtra("counter", 0);
		
		TextView t = (TextView) findViewById(R.id.textView21);
		TextView b = (TextView) findViewById(R.id.textView22);
		if(counter % 2 == 0){
			t.setText("Player 2");
			b.setText("Player 1's");
		} else {
			t.setText("Player 1");
			b.setText("Player 2's");
		}
		
		
		TextView marker = (TextView) findViewById(R.id.textView1);
		marker.setText(tradearray[0]);
		marker = (TextView) findViewById(R.id.textView2);
		marker.setText(tradearray[1]);
		marker = (TextView) findViewById(R.id.textView3);
		marker.setText(tradearray[2]);
		marker = (TextView) findViewById(R.id.textView4);
		marker.setText(tradearray[3]);
		marker = (TextView) findViewById(R.id.textView5);
		marker.setText(tradearray[4]);
		marker = (TextView) findViewById(R.id.textView6);
		marker.setText(tradearray[5]);
		marker = (TextView) findViewById(R.id.textView7);
		marker.setText(tradearray2[0]);
		marker = (TextView) findViewById(R.id.textView8);
		marker.setText(tradearray2[1]);
		marker = (TextView) findViewById(R.id.textView9);
		marker.setText(tradearray2[2]);
		marker = (TextView) findViewById(R.id.textView10);
		marker.setText(tradearray2[3]);
		marker = (TextView) findViewById(R.id.textView11);
		marker.setText(tradearray2[4]);
		marker = (TextView) findViewById(R.id.textView12);
		marker.setText(tradearray2[5]);
		
		
		marker = (TextView) findViewById(R.id.textView14);
		marker.setText(Integer.toString(goldclaim));
		
		
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.final_trade_screen, menu);
		return true;
	}
	
	public void Trade(View view){
		Intent intent1 = new Intent(this,QuickScreen.class);
		
		for(int j = 0; j < 6; j++) {
		for(int i = 0; i < 6; i++) {
			if(tradearray[j].equals(pl1[i])) {
				
				pl1[i] = tradearray2[j];
				
				
				}	
			}
		}
		
		
		
		
			
			for(int f = 0; f < 6; f++){
				for(int k = 0; k < 6; k++) {
					if(tradearray2[f].equals(pl2[k])) {
						
						pl2[k] = tradearray[f];
					}
			}
		}
			
			 for(int i = 0; i < pl1.length; i++) {
				for(int j = 0; j < pl1.length; j++) {
			if(pl1[i].equals("Chest 1") && pl1[j].equals("Key 1")) {
				foo++;
			}
			if(pl1[i].equals("Chest 2") && pl1[j].equals("Key 2")) {
				foo++;
			}
			if(pl1[i].equals("Chest 3") && pl1[j].equals("Key 3")) {
				foo++;
			}
			if(pl1[i].equals("Chest 4") && pl1[j].equals("Key 4")) {
				foo++;
			}
			if(pl1[i].equals("Chest 5") && pl1[j].equals("Key 5")) {
				foo++;
			}
			if(pl1[i].equals("Chest 6") && pl1[j].equals("Key 6")) {
				foo++;
			}
				}
			} 
			
			
			intent1.putExtra("foo", foo);
			intent1.putExtra("pl1", pl1);
			intent1.putExtra("pl2", pl2);
			intent1.putExtra("counter", counter);
			intent1.putExtra("tradearray", tradearray);
			intent1.putExtra("tradearray2", tradearray2);
			intent1.putExtra("goldclaim", goldclaim);
			intent1.putExtra("gold", gold);
			
		
		
		startActivity(intent1);
		finish();
			
	}
	
	
	/* private boolean isItOver() {
		int foo = 0;
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
		if(pl1[i].equals("Chest 1") && pl1[j].equals("Key 1")) {
			foo++;
		}
		if(pl1[i].equals("Chest 2") && pl1[j].equals("Key 2")) {
			foo++;
		}
		if(pl1[i].equals("Chest 3") && pl1[j].equals("Key 3")) {
			foo++;
		}
		if(pl1[i].equals("Chest 4") && pl1[j].equals("Key 4")) {
			foo++;
		}
		if(pl1[i].equals("Chest 5") && pl1[j].equals("Key 5")) {
			foo++;
		}
		if(pl1[i].equals("Chest 6") && pl1[j].equals("Key 6")) {
			foo++;
		}
			}
		}
		
		if(foo == 3) {
			
			return true;
			
		}
		
		
		return false;
	} */
	
	public void movingOn() {
		
		Intent intent2 = new Intent(this,EndGameScreen.class);
		intent2.putExtra("gold", gold);
		startActivity(intent2);
		
		
	}
	
	public void Decline(View view) {
		Intent intent = new Intent(this,GamePlayScreen.class);
		intent.putExtra("gold", gold);
		intent.putExtra("pl1", pl1);
		intent.putExtra("pl2", pl2);
		intent.putExtra("counter", counter);
		intent.putExtra("tradearray", tradearray);
		intent.putExtra("tradearray2", tradearray2);
		intent.putExtra("goldclaim", goldclaim);
		startActivity(intent);
		
	}
		
		
	}


