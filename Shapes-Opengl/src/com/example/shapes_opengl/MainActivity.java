package com.example.shapes_opengl;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;


public class MainActivity extends Activity {

	GLSurfaceView surface;
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        surface=new GLSurfaceView(this);
        surface.setRenderer(new GLRenderer());
        setContentView(surface);
    }

	
	protected void onPause() {
		
		super.onPause();
		surface.onPause();
	}

	
	protected void onResume() {
		
		super.onResume();
		surface.onResume();
	}



}
