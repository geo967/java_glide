package com.example.glide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    String image="https://cdn.pixabay.com/photo/2016/11/04/11/46/robot-1797548_960_720.png";
    String imageFor2="https://cdn.pixabay.com/photo/2014/02/27/16/10/tree-276014_960_720.jpg";
    ImageView image1,image2,image3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1=findViewById(R.id.image1);
        image2=findViewById(R.id.image2);
        image3=findViewById(R.id.image3);


      //  HttpsTrustManager.allowAllSSL();
        Glide.with(this)
                .load(image)
                .into(image1);
      //  HttpsTrustManager.allowAllSSL();
        Glide.with(this)
                .load(imageFor2)
                .fitCenter()
                .circleCrop()
                .into(image2);
        Glide.with(this)
                .load(image)
                .override(300,400)
                .centerCrop()
                .into(image3);
    }
}