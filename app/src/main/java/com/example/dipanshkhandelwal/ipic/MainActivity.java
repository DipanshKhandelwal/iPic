package com.example.dipanshkhandelwal.ipic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_SELECT_IMAGE = 0;
    private Button bSelectImage;
    private ImageView ivImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bSelectImage = (Button) findViewById(R.id.bSelectImage);
        ivImage = (ImageView) findViewById(R.id.ivImage);

        bSelectImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivityForResult(intent, REQUEST_SELECT_IMAGE);
            }
        });
    }
}
