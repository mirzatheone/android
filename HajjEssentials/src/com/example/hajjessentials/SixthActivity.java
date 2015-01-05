package com.example.hajjessentials;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class SixthActivity extends Activity {

	SQLiteConnector sqlConnect;
	HajjVideo listitem1;
	List<HajjVideo> listitem;
	ListView lv1;
	int i = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getActionBar().setDisplayHomeAsUpEnabled(true);

		android.app.ActionBar actionBar = getActionBar();
		actionBar.setTitle("ভিডিও ");

		setContentView(R.layout.activity_six);
		lv1 = (ListView) findViewById(R.id.lv1);
		listitem = new ArrayList<HajjVideo>();

		sqlConnect = new SQLiteConnector(this);

		listitem1 = new HajjVideo();

		listitem = sqlConnect.getAllRecordvid();

		if (i < listitem.size()) {
			/* listitem1 = listitem.get(i); */

			/*
			 * ArrayAdapter<HajjIndicator> adapter = new
			 * ArrayAdapter<HajjIndicator>(this,
			 * android.R.layout.simple_list_item_1,listitem);
			 */
			HajjVideoAdapter adapter1 = new HajjVideoAdapter(
					SixthActivity.this, listitem);

			lv1.setAdapter(adapter1);
		}

		lv1.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				HajjVideo item = (HajjVideo) arg0.getItemAtPosition(arg2);

				String value = item.getVideo_link().toString();
				// System.out.println("M  "+value);

				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(value)));

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// MenuInflater inflater = getMenuInflater();
		// inflater.inflate(R.menu.main_activity_actions, menu);
		getMenuInflater().inflate(R.menu.activityvid, menu);
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
			// Toast.makeText(this, "Settings clicked",
			// Toast.LENGTH_SHORT).show();
			switch (item.getItemId()) {

			case R.id.submenu_aboutus:
				Toast.makeText(getApplicationContext(), "submenu pressed",
						Toast.LENGTH_SHORT).show();
				Intent aboutUs = new Intent(SixthActivity.this, AboutUs.class);
				startActivity(aboutUs);
				break;

			}
			return true;

		case R.id.mapMenu:
			Intent mapIntent = new Intent(SixthActivity.this,
					FifthActivity.class);
			startActivity(mapIntent);
			break;
		case R.id.dialMenu:
			Intent callIntent = new Intent(Intent.ACTION_DIAL);
			startActivity(callIntent);
			break;
		}

		return true;
	}
}
