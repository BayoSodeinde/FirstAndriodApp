package com.david.chesthunter2;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class GamePlayScreen extends Activity {
	
	
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
		setContentView(R.layout.activity_game_play_screen);
		// Show the Up button in the action bar.
		setupActionBar();
		
		
		Intent i = getIntent();
		this.gold = i.getIntArrayExtra("gold");
		this.pl1 = i.getStringArrayExtra("pl1");
		this.pl2 = i.getStringArrayExtra("pl2");
		this.tradearray = i.getStringArrayExtra("tradearray");
		this.tradearray2 = i.getStringArrayExtra("tradearray2");
		this.goldclaim = i.getIntExtra("goldclaim", 0);
		this.counter = i.getIntExtra("counter", 0);
		this.foo = i.getIntExtra("foo", 0);
		

		
		
		
		
		
		TextView t0 = (TextView) findViewById(R.id.textView111);
		t0.setText(pl1[0]);
		t0 = (TextView) findViewById(R.id.textView2);
		t0.setText(pl1[1]);
		t0 = (TextView) findViewById(R.id.textView3);
		t0.setText(pl1[2]);
		t0 = (TextView) findViewById(R.id.textView4);
		t0.setText(pl1[3]);
		t0 = (TextView) findViewById(R.id.textView5);
		t0.setText(pl1[4]);
		t0 = (TextView) findViewById(R.id.textView6);
		t0.setText(pl1[5]);
		t0 = (TextView) findViewById(R.id.textView23);
		t0.setText(pl2[0]);
		t0 = (TextView) findViewById(R.id.textView8);
		t0.setText(pl2[1]);
		t0 = (TextView) findViewById(R.id.textView22);
		t0.setText(pl2[2]);
		t0 = (TextView) findViewById(R.id.textView10);
		t0.setText(pl2[3]);
		t0 = (TextView) findViewById(R.id.textView11);
		t0.setText(pl2[4]);
		t0 = (TextView) findViewById(R.id.textView12);
		t0.setText(pl2[5]);
		
		
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.game_play_screen, menu);
		return true;
	}
	

	public void doSwap(View view) {
		Intent intent = new Intent(this,TradingScreen.class);
		intent.putExtra("pl1", pl1);
		intent.putExtra("pl2", pl2);
		intent.putExtra("gold", gold);
		intent.putExtra("counter", counter);
		intent.putExtra("tradearray", tradearray);
		intent.putExtra("tradearray2", tradearray2);
		intent.putExtra("goldclaim", goldclaim);
		startActivity(intent);
		finish();
	}
	
	public void endIt(View view) {
		Intent intent = new Intent(this,EndGameScreen.class);
		intent.putExtra("pl1", pl1);
		intent.putExtra("pl2", pl2);
		intent.putExtra("counter", counter);
		intent.putExtra("tradearray", tradearray);
		intent.putExtra("tradearray2", tradearray2);
		intent.putExtra("goldclaim", goldclaim);
		intent.putExtra("gold", gold);
		startActivity(intent);
		finish();
		
		
		
		
	}
	

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
