package com.david.chesthunter2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class Gold2 extends Activity {
	public String[] pl1;
	public String[] pl2;
	public String[] tradearray;
	public String[] tradearray2; 
	public int counter;
	public int goldclaim;
	public int gold[];

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gold2);
		Intent i = getIntent();
		this.pl1 = i.getStringArrayExtra("pl1");
		this.pl2 = i.getStringArrayExtra("pl2");
		this.gold = i.getIntArrayExtra("gold");
		this.tradearray = i.getStringArrayExtra("tradearray");
		this.tradearray2 = i.getStringArrayExtra("tradearray2");
		this.goldclaim = i.getIntExtra("goldclaim", 0);
		this.counter = i.getIntExtra("counter", 0);
		
		
		
		TextView t = (TextView) findViewById(R.id.textView5);
		t.setText(String.valueOf(gold[3]));
		t = (TextView) findViewById(R.id.textView6);
		t.setText(String.valueOf(gold[4]));
		t = (TextView) findViewById(R.id.textView7);
		t.setText(String.valueOf(gold[5]));
		
	}

	
	public void OK(View view) {
		Intent intent = new Intent(this,GamePlayScreen.class);
		intent.putExtra("pl1", pl1);
		intent.putExtra("pl2", pl2);
		intent.putExtra("counter", counter);
		intent.putExtra("tradearray", tradearray);
		intent.putExtra("tradearray2", tradearray2);
		intent.putExtra("goldclaim", goldclaim);
		intent.putExtra("gold", gold);
		startActivity(intent);
		
		
		
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.gold2, menu);
		return true;
	}

}