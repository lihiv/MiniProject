package com.example.user.miniproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Riddles _riddles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        _riddles=new Riddles();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user selects the Send button */
    public void startGame(View view) {
        Intent intent = new Intent(this, Levels.class);
        startActivity(intent);
    }
}
