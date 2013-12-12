package com.example.lifeactivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends Activity {
	
	private Button btnChuyenActivity;
	private Button btnChuyenDialogActivity;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btnChuyenActivity = (Button) findViewById(R.id.btnChuyenActivity);
		btnChuyenActivity.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this, MainActivity2.class));
			}
		});
		
		btnChuyenDialogActivity = (Button) findViewById(R.id.btnChuyenDialogActivity);
		btnChuyenDialogActivity.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this, DialogActivity.class));
			}
		});
		Toast.makeText(this, "onCreateActivity1", Toast.LENGTH_LONG).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
	protected void onStart() {
		Toast.makeText(this, "onStartActivity1", Toast.LENGTH_LONG).show();
		super.onStart();
	}
	
	@Override
	protected void onResume() {
		Toast.makeText(this, "onResumeActivity1", Toast.LENGTH_LONG).show();
		super.onResume();
	}
	
	@Override
	protected void onPause() {
		Toast.makeText(this, "onPauseActivity1", Toast.LENGTH_LONG).show();
		super.onPause();
	}
	
	@Override
	protected void onStop() {
		Toast.makeText(this, "onStopActivity1", Toast.LENGTH_LONG).show();
		super.onStop();
	}
	
	@Override
	protected void onDestroy() {
		Toast.makeText(this, "onDestroyActivity1", Toast.LENGTH_LONG).show();
		super.onDestroy();
	}
}
