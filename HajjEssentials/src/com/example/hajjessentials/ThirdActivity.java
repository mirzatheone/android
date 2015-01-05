package com.example.hajjessentials;

import java.util.ArrayList;
import java.util.List;



import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
//import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
//import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends Activity {

	SQLiteConnector sqlConnect;
	HajjNumbers listitem1;
	List<HajjNumbers> listitem;

	ListView lv2;
	int i = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_three);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		 android.app.ActionBar actionBar = getActionBar();
		 actionBar.setTitle("গুরুত্বপূর্ণ  নাম্বার ");


		lv2 = (ListView) findViewById(R.id.lv2);
		listitem = new ArrayList<HajjNumbers>();

		sqlConnect = new SQLiteConnector(this);

		listitem1 = new HajjNumbers();

		listitem = sqlConnect.getAllPhoneNum();

		if (i < listitem.size()) {
			/* listitem1 = listitem.get(i); */

			/*
			 * ArrayAdapter<HajjIndicator> adapter = new
			 * ArrayAdapter<HajjIndicator>(this,
			 * android.R.layout.simple_list_item_1,listitem);
			 */

			HajjNumbersAdapter adapter1 = new HajjNumbersAdapter(
					ThirdActivity.this, listitem);

			lv2.setAdapter(adapter1);
		}

		lv2.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				HajjNumbers item = (HajjNumbers) arg0.getItemAtPosition(arg2);
			    
				String value = item.getContact_phone().toString();
			    //System.out.println("M  "+value);
				
				Intent callIntent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+"+value));
				
				
				
				startActivity(callIntent);
			}
		});
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
//		MenuInflater inflater = getMenuInflater();
//	    inflater.inflate(R.menu.main_activity_actions, menu);
	getMenuInflater().inflate(R.menu.activity_main_actions, menu);
	return true;
	}
	
	
	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case android.R.id.home:
            NavUtils.navigateUpFromSameTask(this);
            return true;
        default:
        case R.id.settings:
        	//Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show();
        	 switch (item.getItemId())  {
        	 
        	 	case R.id.submenu_aboutus:
        	 		Toast.makeText(getApplicationContext(), "submenu pressed",Toast.LENGTH_SHORT).show();
        	 		Intent aboutUs= new Intent(ThirdActivity.this,AboutUs.class);
        	 		startActivity(aboutUs);
        	 		break;
        	 		
        	 
        	 }
        	 return true;
     
            
        case R.id.mapMenu:
        	Intent mapIntent=new Intent(ThirdActivity.this,FifthActivity.class);
        	startActivity(mapIntent);
     	      break;   
        case R.id.dialMenu:
        	Intent callIntent = new Intent(Intent.ACTION_DIAL);
			startActivity(callIntent);
			break;      
       }
        
        return true;
    }

	private void openSettings() {
		// TODO Auto-generated method stub
		
	}
}
