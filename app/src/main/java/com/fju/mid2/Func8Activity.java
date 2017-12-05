package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Func8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func8);
        Button button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent();
                intent.setClass(Func8Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void func8(View view){
        finish();
    }
}
