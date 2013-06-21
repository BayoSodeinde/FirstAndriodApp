package com.david.chesthunter2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class QuickScreen extends Activity {
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
		Intent j;
		Intent i = getIntent();
		this.gold = i.getIntArrayExtra("gold");
		this.pl1 = i.getStringArrayExtra("pl1");
		this.pl2 = i.getStringArrayExtra("pl2");
		this.tradearray = i.getStringArrayExtra("tradearray");
		this.tradearray2 = i.getStringArrayExtra("tradearray2");
		this.goldclaim = i.getIntExtra("goldclaim", 0);
		this.counter = i.getIntExtra("counter", 0);
		this.foo = i.getIntExtra("foo", 0);
		
		
		if(foo == 3){
			j = new Intent(this,EndGameScreen.class);
			j.putExtra("pl1", pl1);
			j.putExtra("pl2", pl2);
			j.putExtra("gold", gold);
			j.putExtra("counter", counter);
			j.putExtra("tradearray", tradearray);
			j.putExtra("tradearray2", tradearray2);
			j.putExtra("goldclaim", goldclaim);
			
		} else {
			j = new Intent(this,GamePlayScreen.class);
			j.putExtra("pl1", pl1);
			j.putExtra("pl2", pl2);
			j.putExtra("gold", gold);
			j.putExtra("counter", counter);
			j.putExtra("tradearray", tradearray);
			j.putExtra("tradearray2", tradearray2);
			j.putExtra("goldclaim", goldclaim);
		}
		startActivity(j);
		finish();
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.quick_screen, menu);
		return true;
	}

}
