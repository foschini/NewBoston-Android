package com.thenewboston.travis;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity{

	String classes[] = {"StartingPoint","TextPlay","Email","Camera","Data"};
	
	
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
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		// TODO Auto-generated method stub
		
		super.onCreateOptionsMenu(menu);
		MenuInflater blowUp = getMenuInflater();
		blowUp.inflate(R.menu.cool_menu, menu);
		return true;
				
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId()){
		
		case R.id.aboutUs:
			Intent i = new Intent("com.thenewboston.travis.ABOUT");
			startActivity(i);
			
			break;
		case R.id.preferences:
			
			break;
			
		} 
		return false;
		
	}


	
	
}
