package com.example.hajjessentials;

import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class FifthActivity extends FragmentActivity {

	GoogleMap map;
	MarkerOptions marker;
	Marker mr;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.location);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		android.app.ActionBar actionBar = getActionBar();
		actionBar.setTitle("আপনার অবস্থান  ");
		
		LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
		Criteria criteria = new Criteria();
		String provider = locationManager.getBestProvider(criteria, true);
		Location myLocation = locationManager.getLastKnownLocation(provider);

		double latitude = myLocation.getLatitude();
		
		double longitude = myLocation.getLongitude();

		LatLng latLng = new LatLng(latitude, longitude);

		String Address = GeoCoderUtil.getAddress(latLng, FifthActivity.this);

		if (map == null) {
			map = ((MapFragment) getFragmentManager()
					.findFragmentById(R.id.map)).getMap();

			if (map != null) {
				map.clear();
			}
		}

		marker = new MarkerOptions()
				.position(latLng)
				.snippet("")
				.title("Current Location")
				.icon(BitmapDescriptorFactory
						.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));
		map.addMarker(marker);

		map.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 13.0f));

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
