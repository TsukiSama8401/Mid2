package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Func3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func3);
        Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent();
                intent.setClass(Func3Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void func3(View view){
        finish();
    }
}
