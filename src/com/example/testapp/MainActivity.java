package com.example.testapp;

import java.util.Date;

import org.json.JSONObject;

import com.mixpanel.android.mpmetrics.MixpanelAPI;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		MixpanelAPI mMixpanel = MixpanelAPI.getInstance(this, "056a356d11dfda93b770f2120d83306b");
	    MixpanelAPI.People people = mMixpanel.getPeople();
	    people.identify("12148");
	    JSONObject obj;
	    try{
	    	obj = new JSONObject();
	    	obj.put("$email", "jsmith@example.com");
	    	obj.put("$created", "2011-03-16 16:53:54");
			obj.put("$last_login", new Date().toString());
			obj.put("credits", 150);                 
			obj.put("gender", "Male");
		    people.set(obj);
	    } catch(Exception e){
	    	
	    }
	    mMixpanel.track("Foo", null);
	    people.initPushHandling("773193239160");
	}
}
