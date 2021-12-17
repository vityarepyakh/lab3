package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImgLayout extends AppCompatActivity {
    Button nextAct;
    ImageView image;

    int n = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img_layout);
        nextAct = (Button) findViewById(R.id.btn);
        image = (ImageView) findViewById(R.id.imageView1);

        nextAct = (Button) findViewById(R.id.btn);
        image = (ImageView) findViewById(R.id.imageView1);

        nextAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (n){
                    case 0:image.setImageResource(R.drawable.neo);
                        n++;
                        break;
                    case 1:image.setImageResource(R.drawable.memes2);
                        n++;
                        break;
                    default:image.setImageResource(R.drawable.memes);
                        n = 0;
                        break;
                }
            }
        });
    }
}