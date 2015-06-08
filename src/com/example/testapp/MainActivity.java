package com.example.testapp;

import com.elementwave.android.ElementWave;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		ElementWave.init(this, "1050338525390", "aacac109", "0f5f07dc24");
		
		String web = getIntent().getStringExtra(ElementWave.NOTIFICATION_WEB);
		if(web != null){
			Intent deep = new Intent(this, DeepLink.class);
			deep.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(deep);
		}
		
		setContentView(R.layout.activity_main);
	}
	
	@Override
	public void onResume()
	{
	   super.onResume();
	   ElementWave.onResume();
	}

	@Override
	public void onPause()
	{
	   super.onPause();
	   ElementWave.onPause();
	}
}
