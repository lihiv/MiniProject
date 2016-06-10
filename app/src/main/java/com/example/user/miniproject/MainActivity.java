package com.example.user.miniproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user selects the Send button */
    public void startGame(View view) {
        // Create an Intent to start the second activity
        Intent intent = new Intent(this, Levels.class);
        // Start the intended activity
        startActivity(intent);
    }
}
