package com.david.chesthunter2;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;


public class FrontPage extends Activity {

 	public String[] pl1 = new String[6];
	public String[] pl2 = new String[6];
	public String[] tradearray = new String[6];
	public String[] tradearray2 = new String[6]; 
	public int counter = 0;
	public int goldclaim = 0;
	public int[] gold = new int[6];
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);
        
        	Random rand = new Random();
        	
        	for(int o = 0; o < tradearray.length; o++) {
    			tradearray[o] = " ";
    		}
        	
        	for(int p = 0; p < tradearray.length; p++) {
    			tradearray2[p] = " ";
    		}
        	
        	
        	gold[0] = rand.nextInt(100);
        	gold[1] = rand.nextInt((100 - gold[0]));
        	gold[2] = 100 - gold[0] - gold[1];
        	gold[3] = rand.nextInt(100);
        	gold[4] = rand.nextInt((100 - gold[3]));
        	gold[5] = 100 - gold[3] - gold[4];
        	
        	
        	
        	pl1[0] = "Chest 1";
      		pl1[1] = "Chest 2";
      		pl1[2] = "Chest 3";
      		pl1[3] = "Key 4";
      		pl1[4] = "Key 5";
      		pl1[5] = "Key 6";
      		pl2[0] = "Chest 4";
      		pl2[1] = "Chest 5";
      		pl2[2] = "Chest 6";
      		pl2[3] = "Key 1";
      		pl2[4] = "Key 2";
      		pl2[5] = "Key 3";
        } 

    
    public void startGame(View view) {
    	Intent intent = new Intent(this,RuleScreen.class);
    	intent.putExtra("gold", gold);
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
        getMenuInflater().inflate(R.menu.front_page, menu);
        return true;
    }
    
}
