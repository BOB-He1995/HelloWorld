package com.example.helloworld;

import java.util.Set;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		Button button1=(Button) findViewById(R.id.button_1);
		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "你会看到我传递的数据", Toast.LENGTH_SHORT).show();
				Intent intent_1=new Intent("Action_1");
				startActivityForResult(intent_1,1);
				
				
			}
		});
		
		Button button2=(Button) findViewById(R.id.button_2);
		button2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "Pls be ready for dailing", Toast.LENGTH_SHORT).show();
				Intent intent_2=new Intent(Intent.ACTION_DIAL);
				startActivity(intent_2);				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		return true;
	}
	
	@Override
	protected void onActivityResult (int requestCode, int resultCode, Intent data){
		switch(requestCode){
		case 1:
			if(resultCode==RESULT_OK){
			String returnedData=data.getStringExtra("jian");
			Toast.makeText(MainActivity.this,returnedData, Toast.LENGTH_SHORT).show();
		}
		break;
	default:
	}
	}
	
	
	
	
}
			
