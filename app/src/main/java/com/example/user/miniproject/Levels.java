package com.example.user.miniproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.List;
import java.util.logging.Level;

public class Levels extends AppCompatActivity {

    private Riddles _riddles;
    private String question;
    private String answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);
        initializeScreen();
    }

    private void initializeScreen(){
        _riddles=new Riddles();
        Intent intent = getIntent();
        String ans =  intent.getStringExtra("id");
        question = _riddles.getRiddleAt(LevelState.getState()).getQuestion();
        answer = _riddles.getRiddleAt(LevelState.getState()).getAnswer();
        TextView txtDisplay = (TextView) findViewById(R.id.txtDisplayID);
        txtDisplay.setText(ans);
    }

    private void answerQuestion(View view){
        if(view.getTag().equals(answer)) {
            LevelState.increaseState();
            Intent intent = new Intent(this, Levels.class);
            startActivity(intent);
        }

    }

}
