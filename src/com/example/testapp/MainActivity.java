package com.example.testapp;

import com.adobe.mobile.Analytics;
import com.adobe.mobile.Config;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Config.setContext(getApplicationContext());
		Analytics.trackAction("Application Launched", null);
	}
}
