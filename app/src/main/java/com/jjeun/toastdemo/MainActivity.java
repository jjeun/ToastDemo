package com.jjeun.toastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void nameButtonFunction(View view){

        EditText name = (EditText) findViewById(R.id.nameTextField);

        Toast.makeText(MainActivity.this, "Hello there, " + name.getText().toString() + "!", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
