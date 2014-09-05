package com.thenewboston.travis;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity{

	String classes[] = {"StartingPoint","TextPlay","example2","example3","example4","example5","example6"};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1, classes)); //creazione del layout mediante java (no XML)
	
	}
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		Log.i("OnListItemClick generated. Position number","seconda");
		
		
		String cheese = classes[position];
		//Lancio l'activity StartingPoint.
		
		try{
		Class ourClass = Class.forName("com.thenewboston.travis."+ cheese); //definisco Classe con indirizzo risorsa Activity Starting Point
		Intent ourIntent = new Intent(Menu.this, ourClass); //istanzio Intent che lancia l'activity
		startActivity(ourIntent); //lancio l'intent
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}


	
	
}
