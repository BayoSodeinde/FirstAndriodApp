package com.david.chesthunter2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class TradingScreen2 extends Activity implements OnItemSelectedListener {
	
	String[] pl1;
	String[] pl2;
	int counter;
	String itemsel;
	String[] tradearray;
	String[] tradearray2;
	int co = 0;
	int goldclaim;
	int[] gold;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_trading_screen2);
		
		String[] basearray;
		
		Intent i = getIntent();
		this.gold = i.getIntArrayExtra("gold");
		String[] pl1 = i.getStringArrayExtra("pl1");
		String[] pl2 = i.getStringArrayExtra("pl2");
		int counter = i.getIntExtra("counter", 0);
		String [] tradearray = i.getStringArrayExtra("tradearray");
		String[] tradearray2 = i.getStringArrayExtra("tradearray2");
		this.goldclaim = i.getIntExtra("goldclaim", 0);
		this.tradearray = tradearray;
		this.tradearray2 = tradearray2;
		this.pl1 = pl1;
		this.pl2 = pl2;
		this.counter = counter;
		
		Spinner spinner = (Spinner) findViewById(R.id.spinner1);
		if(counter % 2 != 0) {
			basearray = pl1;
		} else {
			basearray = pl2;
		}
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, basearray);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter(adapter);
		spinner.setOnItemSelectedListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.trading_screen2, menu);
		return true;
	}

	public void onItemSelected(AdapterView<?> parent, View view, 
            int pos, long id) {
		
	this.itemsel = parent.getItemAtPosition(pos).toString();
		
	}
	
	public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
	
	public void addChoice(View view) {
		if(co == 6) {
			co = 0;
		}
		if(counter % 2 != 0) {
			tradearray[co] = this.itemsel;
		} else {
		tradearray2[co] = this.itemsel;
		}
		TextView t = (TextView) findViewById(R.id.textView1);
		switch(co) {
		case 0: t.setText(itemsel);
				co++;
				break;
		case 1: t = (TextView) findViewById(R.id.textView2);
				t.setText(itemsel);
				co++;
				break;
		case 2: t = (TextView) findViewById(R.id.textView3);
				t.setText(itemsel);
				co++;
				break;
		case 3: t = (TextView) findViewById(R.id.textView4);
				t.setText(itemsel);
				co++; 
				break;
		case 4: t = (TextView) findViewById(R.id.textView5);
				t.setText(itemsel);
				co++;
				break;
		case 5: t = (TextView) findViewById(R.id.textView6);
				t.setText(itemsel);
				co++;
				break;
		default: return;
		
				
		}
		
		
	}
	
	
	
	public void passScreen(View view) {
		
		
		Intent intent = new Intent(this,PassScreen2.class);
		intent.putExtra("gold", gold);
		intent.putExtra("pl1", pl1);
		intent.putExtra("pl2", pl2);
		intent.putExtra("counter", counter);
		intent.putExtra("tradearray", tradearray);
		intent.putExtra("tradearray2", tradearray2);
		intent.putExtra("goldclaim", goldclaim);
		startActivity(intent);
		//pass the intent the two offers
		
	}
}
