package com.david.chesthunter2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class RuleScreen extends Activity {
	
	public String[] pl1;
	public String[] pl2;
	public String[] tradearray;
	public String[] tradearray2; 
	public int counter;
	public int goldclaim;
	public int[] gold;
	public int foo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rule_screen);
		Intent i = getIntent();
		this.gold = i.getIntArrayExtra("gold");
		this.pl1 = i.getStringArrayExtra("pl1");
		this.pl2 = i.getStringArrayExtra("pl2");
		this.tradearray = i.getStringArrayExtra("tradearray");
		this.tradearray2 = i.getStringArrayExtra("tradearray2");
		this.goldclaim = i.getIntExtra("goldclaim", 0);
		this.counter = i.getIntExtra("counter", 0);
		this.foo = i.getIntExtra("foo", 0);
		
	}
	
	
	
	public void startGame(View view) {
		Intent intent = new Intent(this,GoldShow.class);
		intent.putExtra("pl1", pl1);
		intent.putExtra("pl2", pl2);
		intent.putExtra("gold", gold);
		intent.putExtra("counter", counter);
		intent.putExtra("tradearray", tradearray);
		intent.putExtra("tradearray2", tradearray2);
		intent.putExtra("goldclaim", goldclaim);
		intent.putExtra("foo", foo);
		startActivity(intent);
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.rule_screen, menu);
		return true;
	}

}
