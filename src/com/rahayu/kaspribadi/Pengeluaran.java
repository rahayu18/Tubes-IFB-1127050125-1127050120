package com.rahayu.kaspribadi;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
public class Pengeluaran extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pengeluaran);
		
        Button btnbmx = (Button) findViewById(R.id.button2);
        btnbmx.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
            	Intent nextScreen = new Intent(getApplicationContext(), Awal.class); 
                startActivity(nextScreen);
            }
        }); 
        
        Button btnbmxx = (Button) findViewById(R.id.button1);
        btnbmxx.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
            	Intent nextScreen = new Intent(getApplicationContext(), Awal.class); 
                startActivity(nextScreen);
            }
        }); 
		
	}
}