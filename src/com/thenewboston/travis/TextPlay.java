package com.thenewboston.travis;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class TextPlay extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.text);
		Button chkCmd =(Button) findViewById(R.id.bResults);
		final ToggleButton  passTog = (ToggleButton) findViewById(R.id.tbPassword);
		// MODIFICATORE FINAL
		//il modificatore final può essere utilizzato, per definire una variabile che di fatto diverrà una costante
		//per l'istanza della classe. Final può essere applicato anche ai metodi di una 
		//determinata classe e un metodo definito come final (finale non modificabile) implica 
		//che se eredito la classe che contiene il metodo su questo non potrà essere eseguito l'override. 
		//Anche per quanto riguarda una classe questa può essere definita come final e di conseguenza 
		//una classe definita in questo modo non potrà essere ereditata. Ciò è logicamente comprensibile 
		//in quanto se dichiaro una classe con il modificatore final intendo una classe finale ovvero 
		//una classe completa che non necessita di specializzazioni o estensioni e dunque è più che 
		//logico che non sia possibile ereditarla.
		final EditText input = (EditText) findViewById(R.id.etCommands);
		TextView display = (TextView) findViewById(R.id.tvDisplay);
		passTog.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (passTog.isChecked()){
					input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);//modifico il tipo di testo mascherando l'input
				} else{
					input.setInputType(InputType.TYPE_CLASS_TEXT);
				}
				
			
			}
		});
		chkCmd.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String check = input.getText().toString();
				if (check.contentEquals("left")){
					
				} else if(check.contentEquals("center")){
					
				} else if (check.contentEquals("right")){
					
				}
			}
		});
	}

}
