package com.example.opengl;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.GLSurfaceView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private GLSurfaceView glSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        glSurfaceView= new GLSurfaceView(this);
        glSurfaceView.setRenderer(new GLRender());
        setContentView(glSurfaceView);
    }
}