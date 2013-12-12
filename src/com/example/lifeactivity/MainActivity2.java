package com.example.lifeactivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends Activity {
	
	private Button btnChuyenActivity;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity2);
		btnChuyenActivity = (Button) findViewById(R.id.btnChuyenActivity);
		btnChuyenActivity.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				startActivity(new Intent(MainActivity2.this, MainActivity.class));
			}
		});
		Toast.makeText(this, "onCreateActivity2", Toast.LENGTH_LONG).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity2, menu);
		return true;
	}
	

    @Override
	protected void onStart() {
		Toast.makeText(this, "onStartActivity2", Toast.LENGTH_LONG).show();
		super.onStart();
	}

	@Override
	protected void onResume() {
		Toast.makeText(this, "onResumeActivity2", Toast.LENGTH_LONG).show();
		super.onResume();
	}

	@Override
	protected void onPause() {
		Toast.makeText(this, "onPauseActivity2", Toast.LENGTH_LONG).show();
		super.onPause();
	}

	@Override
	protected void onStop() {
		Toast.makeText(this, "onStopActivity2", Toast.LENGTH_LONG).show();
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		Toast.makeText(this, "onDestroyActivity2", Toast.LENGTH_LONG).show();
		super.onDestroy();
	}
}
