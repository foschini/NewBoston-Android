package com.thenewboston.travis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class OpenedClass extends Activity implements OnClickListener, OnCheckedChangeListener{

	TextView question, test;
	Button returnData;
	RadioGroup selectionList;
	String gotBread;
	String sendData;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.send);
		initialize();
		//commentate le 3 righe sotto altrimenti  va in errore.
		//Bundle gotBasket = getIntent().getExtras(); 
		//gotBread = gotBasket.getString("key");
		//question.setText(gotBread);
		
		
	}
	private void initialize() {
		// TODO Auto-generated method stub
		question = (TextView) findViewById(R.id.tvQuestion);
		test = (TextView) findViewById(R.id.tvTest);
		returnData =(Button) findViewById(R.id.bReturn);
		selectionList =(RadioGroup) findViewById(R.id.rgAnswers);
		returnData.setOnClickListener(this);
		selectionList.setOnCheckedChangeListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent person = new Intent();
		Bundle backpack = new Bundle();
		backpack.putString("answer", sendData);
		person.putExtras(backpack);
		setResult(RESULT_OK,person);
		finish();
	}
	@Override
	public void onCheckedChanged(RadioGroup arg0, int arg1) {
		// TODO Auto-generated method stub
		switch(arg1){
		case R.id.rCrazy:
		sendData ="Probably right!";
			break;
		case R.id.rSexy:
			sendData ="Definitely right!";
			break;
		case R.id.rBoth:
			sendData ="Spot On!";
			break;
		}
		test.setText(sendData);
	}

	
}
