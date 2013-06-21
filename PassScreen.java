package com.david.chesthunter2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class PassScreen extends Activity {
	public String[] pl1;
	public String[] pl2;
	public String[] tradearray;
	public String[] tradearray2; 
	public int counter;
	public int goldclaim;
	@Override
	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pass_screen);
		
		Intent i = getIntent(); 
		this.counter = i.getIntExtra("counter", 0);
		this.pl1 = i.getStringArrayExtra("pl1");
		this.pl2 = i.getStringArrayExtra("pl2");
		this.tradearray = i.getStringArrayExtra("tradearray");
		this.tradearray2 = i.getStringArrayExtra("tradearray2");
		this.goldclaim = i.getIntExtra("goldclaim", 0);
		
		TextView t = (TextView) findViewById(R.id.textView2);
		counter++;
		if(counter % 2 == 0) {
			t.setText("1");
		} else {
			t.setText("2");
		}
	}
	
	
	
	public void nextPage(View view) {
		
		Intent intent = new Intent(this,FinalTradeScreen.class);
		intent.putExtra("pl1", pl1);
		intent.putExtra("pl2", pl2);
		intent.putExtra("counter", counter);
		intent.putExtra("tradearray", tradearray);
		intent.putExtra("tradearray2", tradearray2);
		intent.putExtra("goldclaim", goldclaim);
		startActivity(intent);
		finish();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pass_screen, menu);
		return true;
	}

}
