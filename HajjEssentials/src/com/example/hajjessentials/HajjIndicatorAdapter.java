package com.example.hajjessentials;

import java.util.List;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;



public class HajjIndicatorAdapter extends ArrayAdapter<HajjIndicator>{
	private Context context;
	private LayoutInflater inflater;
	public HajjIndicatorAdapter(Context context, List<HajjIndicator> hajjindicator){
		super(context,0,hajjindicator);
		this.context=context;
		inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		}
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			if(convertView==null){
				convertView=
						inflater.inflate(R.layout.hajjindicatoradapter,null);
			}
			HajjIndicator hajjindicator=getItem(position);
			
			TextView indication_id=(TextView) convertView.findViewById(R.id.indication_id);
			indication_id.setText(hajjindicator.getIndication_id() );
			
			TextView indication_title=(TextView) convertView.findViewById(R.id.indication_title);
			indication_title.setText(hajjindicator.getIndication_title());
			
			indication_title.setTextColor(Color.rgb(200,0,0));
			indication_title.setTextSize((float) 30.0);
			
			TextView indication_detail=(TextView) convertView.findViewById(R.id.indication_detail);
			indication_detail.setText(hajjindicator.getIndication_detail());
			
			indication_detail.setTextSize((float) 20.0);
			return convertView;
			
			
		}
	}
