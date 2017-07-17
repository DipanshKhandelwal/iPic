package com.example.dipanshkhandelwal.ipic;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    private static final int REQUEST_TAKE_PHOTO = 0;
    private static final int REQUEST_SELECT_IMAGE = 1;
    private Uri uriPhoto;

    Button bTakePhoto;
    Button bFromGallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bTakePhoto = (Button) findViewById(R.id.bTakePhoto);
        bFromGallery = (Button) findViewById(R.id.bFromGallery);
    }
}
