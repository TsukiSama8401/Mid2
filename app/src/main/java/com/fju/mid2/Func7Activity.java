package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Func7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func7);
        Button button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent();
                intent.setClass(Func7Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void func7(View view){
        finish();
    }
}
