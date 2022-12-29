package com.example.opengl;

import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class GLRender implements GLSurfaceView.Renderer {
    private native void ndkInitGl();
    private native void ndkPaintGl();
    private native void ndkResizeGl(int width,int height);

    @Override
    public void onSurfaceCreated(GL10 gl10, EGLConfig eglConfig) {
        ndkInitGl();
    }

    @Override
    public void onSurfaceChanged(GL10 gl10, int width, int height) {
        ndkResizeGl(width,height);
    }

    @Override
    public void onDrawFrame(GL10 gl10) {
        ndkPaintGl();
    }

    static {
        System.loadLibrary("GLRender");
    }
}
