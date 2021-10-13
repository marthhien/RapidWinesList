package com.mg153.RapidWinesList;

import com.mg153.RapidWinesList.R;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;


public class NoLabelActivity extends Activity {
 
	   
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nolabel);
	
		
	    }
	
	   @Override
	    public boolean onKeyDown(int keyCode, KeyEvent event) {
	        if ( keyCode == KeyEvent.KEYCODE_MENU ) {

	            /**
	   	      * Nothing
	   	      */ 
	
	        	}
	        return super.onKeyDown(keyCode, event);
	    }
	    
	}
