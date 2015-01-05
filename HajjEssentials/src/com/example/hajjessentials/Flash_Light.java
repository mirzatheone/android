package com.example.hajjessentials;


import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Flash_Light  extends ActionBarActivity {


//    private final static String LOG_TAG = "FlashLight";

    private Button mOnBtn;
    private Button mOffBtn;
    Parameters params;
    private Camera camera;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	// TODO Auto-generated method stub
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.flash);
    	
    	mOnBtn =(Button)findViewById(R.id.onButton);
    	mOnBtn.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				processOnClick();
			}
			
		
			
		});
    	boolean isCameraFlash = getApplicationContext().getPackageManager()
                .hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);
    	
    	mOffBtn =(Button)findViewById(R.id.offButton);
    	mOffBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				processOffClick();
			}

			
		});
    	if (!isCameraFlash) {
           // showNoCameraAlert();
        } else {
            camera = Camera.open();
            params = camera.getParameters();
        }
    	
    }
    private void processOnClick() {
        params = camera.getParameters();
        params.setFlashMode(Parameters.FLASH_MODE_TORCH);
        camera.setParameters(params);
        camera.startPreview();
        //isFlashlightOn = true;
       
     }

   
     
     private void processOffClick() {
			// TODO Auto-generated method stub
    	 params.setFlashMode(Parameters.FLASH_MODE_OFF);
         camera.setParameters(params);
         camera.stopPreview();
         //isFlashlightOn = false;
		}

}
