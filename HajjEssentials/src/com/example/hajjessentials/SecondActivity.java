package com.example.hajjessentials;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends ActionBarActivity {

	SQLiteConnector sqlConnect;
	HajjIndicator listitem1;
	List<HajjIndicator> listitem;
	TextView tvst1,tvst2;
    ListView lv;
    int i = 1;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.common);
	
		getActionBar().setDisplayHomeAsUpEnabled(true);
		android.app.ActionBar actionBar = getActionBar();
		actionBar.setTitle("হা জ্ জ  সম্পর্কিত নির্দেশনা");
		
		tvst1 = (TextView) findViewById(R.id.tvSt1);
		
		tvst2 = (TextView) findViewById(R.id.tvSt2);
		tvst2.setMovementMethod(new ScrollingMovementMethod());
		lv = (ListView) findViewById(R.id.lv);
		listitem = new ArrayList<HajjIndicator>();

		sqlConnect = new SQLiteConnector(this);

		
		listitem1=new HajjIndicator();


		listitem = sqlConnect.getAllHajjRecord();
		
		//Toast.makeText(getApplicationContext(), listitem.get(0).getIndication_detail(), Toast.LENGTH_SHORT).show();
		
		
		if (i == listitem.size()) {

//			HajjIndicatorAdapter adapter1 = new HajjIndicatorAdapter(this,
//					listitem);

			// lv.setAdapter(adapter1);

			tvst1.setTextSize((float) 30.0);
			tvst1.setTextColor(Color.rgb(200, 0, 0));
			tvst1.setText(listitem.get(0).getIndication_title());

			tvst2.setTextSize((float) 20.0);
			tvst2.setText(listitem.get(0).getIndication_detail());

		}
		
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

