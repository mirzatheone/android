package com.example.hajjessentials;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.webkit.WebView;

public class FourthActivity extends ActionBarActivity{
	
	WebView prayer_time;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.prayer_time);
		
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		android.app.ActionBar actionBar = getActionBar();
		actionBar.setTitle("নামাজের সময়সূচী  ");
		
		prayer_time=(WebView)findViewById(R.id.prayer_time);
		prayer_time.loadUrl("http://www.islamicfinder.org/cityPrayerNew.php?country=Bangladesh");
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
