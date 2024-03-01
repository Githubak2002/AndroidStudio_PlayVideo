package com.eg.video;

import static java.lang.Package.getPackage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView v1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v1 = (VideoView) findViewById(R.id.vid1);

        MediaController m1 = new MediaController(this);
        m1.setAnchorView(v1);
        v1.setMediaController(m1);



        v1.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.deva);
        v1.start();
    }
}