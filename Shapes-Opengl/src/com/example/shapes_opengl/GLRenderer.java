package com.example.shapes_opengl;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.opengl.GLSurfaceView.Renderer;
import android.opengl.GLU;

public class GLRenderer implements Renderer{

	//GLSpaceShip ss;
	GLCube cube;
	
	public GLRenderer(){
		cube=new GLCube();
	//	ss= new GLSpaceShip();
		
	}
	
	public void onSurfaceCreated(GL10 gl, EGLConfig eglConfig) {
		gl.glDisable(GL10.GL_DITHER);
		gl.glHint(GL10.GL_PERSPECTIVE_CORRECTION_HINT, GL10.GL_FASTEST);
		gl.glClearColor(0.8f, 0.0f, 0.2f, 1f);
		gl.glClearDepthf(1f);
	}
	
	
	public void onDrawFrame(GL10 gl) {
		
		gl.glDisable(GL10.GL_DITHER);
		gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT );
		
		gl.glMatrixMode(GL10.GL_MODELVIEW);
		gl.glLoadIdentity();
		GLU.gluLookAt(gl, 0, 10, -5, 0, 0, 0, 0, 2, 0);
		
		//ss.draw(gl);
		cube.draw(gl);
	}

	
	public void onSurfaceChanged(GL10 gl, int width, int height) {
		
		gl.glViewport(0, 0, width, height);
		float ratio = (float) width/height;
		gl.glMatrixMode(GL10.GL_PROJECTION);
		gl.glLoadIdentity();
		gl.glFrustumf(-ratio,  ratio, -1, 1f , 1, 15);
	}


}
