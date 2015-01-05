package com.example.hajjessentials;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Hajj_Details extends ActionBarActivity {

	Button Hajj, Stuffs, Ihram, IhramNo, IhramNes, Kafela;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hajj_details);
		
		getActionBar().setDisplayHomeAsUpEnabled(true);
		android.app.ActionBar actionBar = getActionBar();
		actionBar.setTitle("হা জ্ জ  সম্পর্কিত নির্দেশনা");
		
		Hajj = (Button) findViewById(R.id.Hajj);
	    Hajj.setOnClickListener(new OnClickListener() 
	
	{

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Hajj_Details.this,
						SecondActivity.class);
				startActivity(intent);

			}
		});

		Stuffs = (Button) findViewById(R.id.Stuffs);

		Stuffs.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Hajj_Details.this,
						ActivityStuff.class);
				startActivity(intent);

			}
		});

		Ihram = (Button) findViewById(R.id.Ihram);

		Ihram.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Hajj_Details.this,
						Ihram.class);
				startActivity(intent);

			}
		});

		IhramNo = (Button) findViewById(R.id.IhramNo);

		IhramNo.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Hajj_Details.this,
						IhramNo.class);
				startActivity(intent);

			}
		});

		IhramNes = (Button) findViewById(R.id.IhramNes);

	IhramNes.setOnClickListener(new OnClickListener() {

			@Override
		public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Hajj_Details.this,
						IhramNes.class);
				startActivity(intent);

			}
			
	});

			// public void onClick(View v) {
			// // TODO Auto-generated method stub
			// Intent intent = new Intent(MainActivity.this,
			// AndroidGridLayoutActivity.class);
			// startActivity(intent);
			//
			// }
		

		Kafela = (Button) findViewById(R.id.Kafela);
		Kafela.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
//				TODO Auto-generated method stub
				Intent intent = new Intent(Hajj_Details.this,
						Kafela.class);
				startActivity(intent);

			}
		});

	}
	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case android.R.id.home:
            NavUtils.navigateUpFromSameTask(this);
            return true;
        default:
            return super.onOptionsItemSelected(item);
        }
    }
}
