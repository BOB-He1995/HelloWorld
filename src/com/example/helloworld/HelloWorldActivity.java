package com.example.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class HelloWorldActivity extends Activity {	//Hello World�̳���Activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {	//����һonCreate()�����ʱ����ִ��
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.hello_world_layout);
        Button button3=(Button) findViewById(R.id.button_3);
        button3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent intent_4=new Intent();
			       intent_4.putExtra("jian","我是helloworldactivity传递的数据");
			       setResult(RESULT_OK,intent_4);
			       finish();
			}
        	
        });
       
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {	//������onCreateOptionsMenu()�����˵�
        // Inflate the menu; this adds items to the action bar if it is present.
        return true;
    }
    
}
