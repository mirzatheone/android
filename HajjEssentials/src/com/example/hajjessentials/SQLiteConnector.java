package com.example.hajjessentials;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * 
 * @author manish.s
 * 
 */

public class SQLiteConnector {

	private SQLiteDatabase database;
	private SQLiteHelper sqlHelper;
	private Cursor cursor;
	// ListitemAdapter listitemadapter;

	private static final String TABLE_RECORD = "hajj_indication";
	private static final String TABLE_RECORD1 = "hajj_video_link";
	private static final String TABLE_RECORD2 = "hajj_contact";

	public SQLiteConnector(Context context) {
		sqlHelper = new SQLiteHelper(context);
	}

	// Getting All records
	public List<HajjIndicator> getAllRecord() {
		List<HajjIndicator> hajjindicator = new ArrayList<HajjIndicator>();
		String selectQuery = "SELECT  * FROM " + TABLE_RECORD;

		database = sqlHelper.getReadableDatabase();
		cursor = database.rawQuery(selectQuery, null);
		if (cursor.moveToFirst()) {
			do {

				// String indication_id = cursor.getString(0);
				String indication_title = cursor.getString(1);
				String indication_detail = cursor.getString(2);

				HajjIndicator item = new HajjIndicator();

				// item.setIndication_id(indication_id );
				item.setIndication_title(indication_title);
				item.setIndication_detail(indication_detail);

				hajjindicator.add(item);

			} while (cursor.moveToNext());
		}
		database.close();
		return hajjindicator;
	}

	// public List<String> getAllRecordnew() {
	// List<String> studentList = new ArrayList<String>();
	// String selectQuery = "SELECT  * FROM " +TABLE_RECORD1;
	//
	// database = sqlHelper.getReadableDatabase();
	// cursor = database.rawQuery(selectQuery, null);
	// if (cursor.moveToFirst()) {
	// do {
	// studentList.add(cursor.getString(1));
	//
	// } while (cursor.moveToNext());
	// }
	// database.close();
	// return studentList;
	// }
	
	
	public List<HajjIndicator> getAllHajjRecord() {
		List<HajjIndicator> hajjindicator = new ArrayList<HajjIndicator>();
		String selectQuery =" SELECT  * FROM hajj_indication WHERE indication_title='হজ্জ কি ?'";

		database = sqlHelper.getReadableDatabase();
		cursor = database.rawQuery(selectQuery, null);
		if (cursor.moveToFirst()) {
			do {

				// String indication_id = cursor.getString(0);
				String indication_title = cursor.getString(1);
				String indication_detail = cursor.getString(2);

				HajjIndicator item = new HajjIndicator();

				// item.setIndication_id(indication_id );
				item.setIndication_title(indication_title);
				item.setIndication_detail(indication_detail);

				hajjindicator.add(item);

			} while (cursor.moveToNext());
		}
		database.close();
		return hajjindicator;
	}
	
	public List<HajjIndicator> getAllStuffs() {
		List<HajjIndicator> hajjindicator = new ArrayList<HajjIndicator>();
		String selectQuery =" SELECT  * FROM hajj_indication WHERE indication_title='প্রয়োজনীয় মালপত্র'";

		database = sqlHelper.getReadableDatabase();
		cursor = database.rawQuery(selectQuery, null);
		if (cursor.moveToFirst()) {
			do {

				// String indication_id = cursor.getString(0);
				String indication_title = cursor.getString(1);
				String indication_detail = cursor.getString(2);

				HajjIndicator item = new HajjIndicator();

				// item.setIndication_id(indication_id );
				item.setIndication_title(indication_title);
				item.setIndication_detail(indication_detail);

				hajjindicator.add(item);

			} while (cursor.moveToNext());
		}
		database.close();
		return hajjindicator;
	}

	
	public List<HajjIndicator> getIhram() {
		List<HajjIndicator> hajjindicator = new ArrayList<HajjIndicator>();
		String selectQuery =" SELECT  * FROM hajj_indication WHERE indication_title='ইহরাম'";

		database = sqlHelper.getReadableDatabase();
		cursor = database.rawQuery(selectQuery, null);
		if (cursor.moveToFirst()) {
			do {

				// String indication_id = cursor.getString(0);
				String indication_title = cursor.getString(1);
				String indication_detail = cursor.getString(2);

				HajjIndicator item = new HajjIndicator();

				// item.setIndication_id(indication_id );
				item.setIndication_title(indication_title);
				item.setIndication_detail(indication_detail);

				hajjindicator.add(item);

			} while (cursor.moveToNext());
		}
		database.close();
		return hajjindicator;
	}
	
	
	
	public List<HajjIndicator> getIhramNo() {
		List<HajjIndicator> hajjindicator = new ArrayList<HajjIndicator>();
		String selectQuery ="SELECT  * FROM hajj_indication WHERE indication_id=4";

		database = sqlHelper.getReadableDatabase();
		cursor = database.rawQuery(selectQuery, null);
		if (cursor.moveToFirst()) {
			do {

				// String indication_id = cursor.getString(0);
				String indication_title = cursor.getString(1);
				String indication_detail = cursor.getString(2);

				HajjIndicator item = new HajjIndicator();

				// item.setIndication_id(indication_id );
				item.setIndication_title(indication_title);
				item.setIndication_detail(indication_detail);

				hajjindicator.add(item);

			} while (cursor.moveToNext());
		}
		database.close();
		return hajjindicator;
	}
	
	
	public List<HajjIndicator> getIhramNes() {
		List<HajjIndicator> hajjindicator = new ArrayList<HajjIndicator>();
		String selectQuery ="SELECT  * FROM hajj_indication WHERE indication_id=5";

		database = sqlHelper.getReadableDatabase();
		cursor = database.rawQuery(selectQuery, null);
		if (cursor.moveToFirst()) {
			do {

				// String indication_id = cursor.getString(0);
				String indication_title = cursor.getString(1);
				String indication_detail = cursor.getString(2);

				HajjIndicator item = new HajjIndicator();

				// item.setIndication_id(indication_id );
				item.setIndication_title(indication_title);
				item.setIndication_detail(indication_detail);

				hajjindicator.add(item);

			} while (cursor.moveToNext());
		}
		database.close();
		return hajjindicator;
	}
	
	
	public List<HajjIndicator> getKafela() {
		List<HajjIndicator> hajjindicator = new ArrayList<HajjIndicator>();
		String selectQuery ="SELECT  * FROM hajj_indication WHERE indication_id=6";

		database = sqlHelper.getReadableDatabase();
		cursor = database.rawQuery(selectQuery, null);
		if (cursor.moveToFirst()) {
			do {

				// String indication_id = cursor.getString(0);
				String indication_title = cursor.getString(1);
				String indication_detail = cursor.getString(2);

				HajjIndicator item = new HajjIndicator();

				// item.setIndication_id(indication_id );
				item.setIndication_title(indication_title);
				item.setIndication_detail(indication_detail);

				hajjindicator.add(item);

			} while (cursor.moveToNext());
		}
		database.close();
		return hajjindicator;
	}
	

	public List<HajjVideo> getAllRecordvid() {
		List<HajjVideo> hajjvideo = new ArrayList<HajjVideo>();
		String selectQuery = "SELECT  * FROM " + TABLE_RECORD1;

		database = sqlHelper.getReadableDatabase();
		cursor = database.rawQuery(selectQuery, null);
		if (cursor.moveToFirst()) {
			do {

				// String contact_id = cursor.getString(0);
				
				String video_type = cursor.getString(1);
				
				String video_link = cursor.getString(2);

				HajjVideo item = new HajjVideo();

				// item.setIndication_id(contact_id );
				
				item.setVideo_type(video_type);
				
				item.setVideo_link(video_link);

				hajjvideo.add(item);

			} while (cursor.moveToNext());
		}
		database.close();
		return hajjvideo;
	}

	public List<HajjNumbers> getAllPhoneNum() {
		List<HajjNumbers> hajjnumbers = new ArrayList<HajjNumbers>();
		String selectQuery = "SELECT  * FROM " + TABLE_RECORD2;

		database = sqlHelper.getReadableDatabase();
		cursor = database.rawQuery(selectQuery, null);
		if (cursor.moveToFirst()) {
			do {

				// String contact_id = cursor.getString(0);
				 String contact_address = cursor.getString(1);
				 String contact_phone = cursor.getString(2);

				HajjNumbers item = new HajjNumbers();

				//item.setContact_id(contact_id );
				item.setContact_address(contact_address);
				item. setContact_phone(contact_phone);

				hajjnumbers.add(item);

			} while (cursor.moveToNext());
		}
		database.close();
		return hajjnumbers;
	}

}
