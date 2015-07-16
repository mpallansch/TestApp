package com.example.testapp;

import com.adobe.mobile.Analytics;
import com.adobe.mobile.Config;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Config.setContext(getApplicationContext());
		Analytics.trackAction("Application Launched", null);
	}
	
	@Override
	protected void onResume(){
		super.onResume();
		Config.collectLifecycleData(this);
	}
}
