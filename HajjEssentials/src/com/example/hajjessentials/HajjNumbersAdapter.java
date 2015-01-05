package com.example.hajjessentials;

import java.util.List;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class HajjNumbersAdapter extends ArrayAdapter<HajjNumbers> {

	private Context context;
	private LayoutInflater inflater;
	public HajjNumbersAdapter(Context context, List<HajjNumbers>hajjnumbers) {
		super(context,0, hajjnumbers);
		this.context=context;
		inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		// TODO Auto-generated constructor stub
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		if(convertView==null){
			convertView=
					inflater.inflate(R.layout.hajjnumbers_adapter,null);
		}
		HajjNumbers hajjNumbers=getItem(position);
		
		TextView contact_id=(TextView) convertView.findViewById(R.id.contact_id);
		contact_id.setText(hajjNumbers.getContact_id());
		
		TextView contact_address=(TextView) convertView.findViewById(R.id.contact_address);
		contact_address.setText(hajjNumbers.getContact_address());
		
		contact_address.setTextSize((float) 18.0);
		contact_address.setTextColor(Color.rgb(60,179,113));
		
		TextView contact_phone=(TextView) convertView.findViewById(R.id.contact_phone);
		contact_phone.setText(hajjNumbers.getContact_phone());
		
		contact_phone.setTextSize((float) 15.0);
		contact_phone.setTextColor(Color.rgb(30,144,255));
		
		return convertView;
}
	
	
	
}
