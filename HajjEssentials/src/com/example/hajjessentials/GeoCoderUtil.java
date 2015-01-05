package com.example.hajjessentials;

import java.io.IOException;
import java.util.List;

import com.google.android.gms.maps.model.LatLng;

import android.content.Context;
import android.location.Geocoder;
import android.util.Log;

public class GeoCoderUtil {

	public static String getAddress(LatLng latLng, Context context) {
		  Geocoder geocoder = new Geocoder(context);
		  double latitude = latLng.latitude;
		  double longitude = latLng.longitude;

		  String address = "";

		  try {
		   Log.i("Address Info", "Address based opn geocoder");
		   List<android.location.Address> addresses = geocoder.getFromLocation(latitude,
		     longitude, 1);
		   
		   int len = addresses.size();
		   //Log.i("total size", String.valueOf(len));

		   if (addresses != null && !addresses.isEmpty()) {
		    android.location.Address returnedAddress = addresses.get(0);
		    StringBuilder strReturnedAddress = new StringBuilder();
		    int addressLineIndex = returnedAddress.getMaxAddressLineIndex();

		    int addressLinesToShow = 2;
		    // To get address in limited lines
		    if (addressLineIndex < 2) {
		     addressLinesToShow = addressLineIndex;
		    }
		    for (int p = 0; p < addressLinesToShow; p++) {
		     strReturnedAddress
		       .append(returnedAddress.getAddressLine(p)).append(
		         "\n");
		    }
		    address = strReturnedAddress.toString();
		   } else {
		    address = "Address not available";

		   }
		  } catch (IOException e) {
		   e.printStackTrace();
		   address = "Address not available";
		   Log.e("Address not found", "Unable to get Address in info window");
		  }
		  return address;
}
}
