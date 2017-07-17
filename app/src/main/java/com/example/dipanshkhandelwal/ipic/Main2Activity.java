package com.example.dipanshkhandelwal.ipic;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.io.IOException;

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

    public void takePhoto() {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(intent.resolveActivity(getPackageManager()) != null) {
            // Save the photo taken to a temporary file.
            File storageDir = getExternalFilesDir(Environment.DIRECTORY_PICTURES);
            try {
                File file = File.createTempFile("IMG_", ".jpg", storageDir);
                uriPhoto = Uri.fromFile(file);
                intent.putExtra(MediaStore.EXTRA_OUTPUT, uriPhoto);
                startActivityForResult(intent, REQUEST_TAKE_PHOTO);
            } catch (IOException e) {
            }
        }
    }

    public void selectImageInGallery() {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("image/*");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, REQUEST_SELECT_IMAGE);
        }
    }
}
