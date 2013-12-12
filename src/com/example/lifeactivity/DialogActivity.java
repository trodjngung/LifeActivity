package com.example.lifeactivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class DialogActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dialog);
		
		Toast.makeText(this, "onCreateDialog", Toast.LENGTH_LONG).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dialog, menu);
		return true;
	}
	
	protected void onStart()
	{
		Toast.makeText(this, "onStartDialog", Toast.LENGTH_LONG).show();
		super.onStart();
	}
	
	protected void onResume()
	{
		Toast.makeText(this, "onResumeDialog", Toast.LENGTH_LONG).show();
		super.onResume();
	}
	
	protected void onPause()
	{
		Toast.makeText(this, "onPauseDialog", Toast.LENGTH_LONG).show();
		super.onPause();
	}
	
	protected void onStop()
	{
		Toast.makeText(this, "onStopDialog", Toast.LENGTH_LONG).show();
		super.onStop();
	}
	
	protected void onDestroy()
	{
		Toast.makeText(this, "onDestroyDialog", Toast.LENGTH_LONG).show();
		super.onDestroy();
	}

}
