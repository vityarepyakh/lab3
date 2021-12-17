package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.squareup.otto.Bus;
import com.squareup.otto.Subscribe;

public class MainActivity extends AppCompatActivity {

    private Bus bus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bus = new Bus();
        bus.register(this);
    }
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.ConBut:
                bus.post(new Activator());
                break;
            case R.id.ImgBut:
                bus.post(new ActivatorTwo());
                break;
        }
    }

    @Subscribe
    public void ActivityCont(Activator event){
        Intent intent = new Intent(this, ContrLayout.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    @Subscribe
    public void ActivityImg(ActivatorTwo event){
        Intent intent = new Intent(this, ImgLayout.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}