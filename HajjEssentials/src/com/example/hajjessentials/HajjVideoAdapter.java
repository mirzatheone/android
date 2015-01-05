package com.example.hajjessentials;

import java.util.List;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class HajjVideoAdapter extends ArrayAdapter<HajjVideo> {

	private Context context;
	private LayoutInflater inflater;
	public HajjVideoAdapter(Context context, List<HajjVideo> hajjvideo){
		super(context,0,hajjvideo);
		this.context=context;
		inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if(convertView==null){
			convertView=
					inflater.inflate(R.layout.hajjvideoadapter,null);
		}
		HajjVideo hajjvideo=getItem(position);
		
		TextView video_type=(TextView) convertView.findViewById(R.id.video_type);
		video_type.setText(hajjvideo. getVideo_type() );
		video_type.setTextSize((float) 20.0);
		video_type.setTextColor(Color.rgb(0,0,0));
		
		TextView video_link=(TextView) convertView.findViewById(R.id.video_link);
		video_link.setText(hajjvideo.getVideo_link());
		
		video_link.setTextSize((float) 15.0);
		video_link.setTextColor(Color.rgb(30,144,255));
		
		return convertView;
}

	
}