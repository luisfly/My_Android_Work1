package com.example.luisfly.java_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/* This is a test project */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* Test the logout  */
        Log.d("MainActivity","onCreate success");
        /* connect to the button in the layout xml */
        Button sayhello = (Button) findViewById(R.id.sayhello);
        /* connect to the textview int the layout xml */
        final TextView hello = (TextView) findViewById(R.id.hello);

        sayhello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hello.setVisibility(View.VISIBLE);
                /* using Toast test*/
                Toast.makeText(MainActivity.this, "You click hello world.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
