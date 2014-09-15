package com.thenewboston.travis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Data extends Activity implements OnClickListener{

	Button start, startFor;
	EditText sendET;
	TextView gotAnswer;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.get);
		
		initialize();
	}


	private void initialize() {
		// TODO Auto-generated method stub
		start = (Button) findViewById(R.id.bSA);
		startFor = (Button) findViewById(R.id.bSAFR);
		sendET = (EditText) findViewById(R.id.etSend);
		gotAnswer = (TextView) findViewById(R.id.tvGot);
		
		start.setOnClickListener(this);
		startFor.setOnClickListener(this);
	}


	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch (arg0.getId()){
		case R.id.bSA:
			String bread = sendET.getText().toString(); //creo Stringa
			Bundle basket = new Bundle();				//creo un bundle chiamato Basket
			basket.putString("key", bread); 			//metto bread nel basket "key" � il nome del file?? Che vuol dire???
			Intent a = new Intent(Data.this, OpenedClass.class); //creo intent...
			a.putExtras(basket);								// e metto il basket nell'intent
			startActivity(a);									//e faccio partire l'intent
			
			break;
			
		case R.id.bSAFR:
			break;
			
		
		}
		
		}
	}


