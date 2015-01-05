                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                package com.example.hajjessentials;

import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button Hajj, Number, Time, Location, Video,FlashLight;
	ConnectionDetector connection;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		  android.app.ActionBar actionBar = getActionBar();
		  actionBar.setTitle("হা জ্ জ  সহায়িকা");
		  connection= new ConnectionDetector(this);
		
		Hajj = (Button) findViewById(R.id.Hajj);
		Hajj.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,
						Hajj_Details.class);
				startActivity(intent);

			}
		});

		Number = (Button) findViewById(R.id.Number);

		Number.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,
						ThirdActivity.class);
				startActivity(intent);

			}
		});

		Time = (Button) findViewById(R.id.Time);

		Time.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,
						FourthActivity.class);
				startActivity(intent);

			}
		});

		Location = (Button) findViewById(R.id.Location);

		Location.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
//				Intent intent = new Intent(MainActivity.this,
//						FifthActivity.class);
//				startActivity(intent);
				
				
				if(!connection.isConnectingToInternet()){
				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
				         MainActivity.this);

				       // set title
				       alertDialogBuilder.setTitle("No Internet Access");

				       // set dialog message
				       alertDialogBuilder
				         .setMessage(
				           "Please Check Internet Connection")
				         .setCancelable(false)
				         .setPositiveButton(
				           "OK",
				           new DialogInterface.OnClickListener() {
				            public void onClick(
				              DialogInterface dialog,
				              int id) {
				            	
//				             MainActivity.this.finish();
				            }
				           });

				       // create alert dialog
				       AlertDialog alertDialog = alertDialogBuilder
				         .create();

				       // show it
				       alertDialog.show();
				      }
				else 
				{
					Intent intent = new Intent(MainActivity.this,
					FifthActivity.class);
			startActivity(intent);
				}
			}

			
		});

		Video = (Button) findViewById(R.id.Video);

		Video.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent =new Intent(MainActivity.this,SixthActivity.class);
				startActivity(intent);
				
			}

//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				Intent intent = new Intent(MainActivity.this,
//						AndroidGridLayoutActivity.class);
//				startActivity(intent);
//
//			}
		});
		
	
		FlashLight = (Button) findViewById(R.id.FlashLight);

		FlashLight.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent =new Intent(MainActivity.this,Flash_Light.class);
				startActivity(intent);
				
			}

//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				Intent intent = new Intent(MainActivity.this,
//						AndroidGridLayoutActivity.class);
//				startActivity(intent);
//
//			}
		});
		
		
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
//		MenuInflater inflater = getMenuInflater();
//	    inflater.inflate(R.menu.main_activity_actions, menu);
	getMenuInflater().inflate(R.menu.main, menu);
	
	
	return true;
	}
	
	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case R.id.aboutus:
        	Intent aboutUs= new Intent(MainActivity.this,AboutUs.class);
	 		startActivity(aboutUs);
	 		break;
            
         
       }
        
        return true;
    }
		
		
		
		
		
		
}