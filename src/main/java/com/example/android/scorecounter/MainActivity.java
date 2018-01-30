package com.example.android.scorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int rightTeamGoals=0;
    int rightTeamYellowCards=0;
    int rightTeamRedCards=0;
    int leftTeamGoals=0;
    int leftTeamYellowcards=0;
    int leftTeamRedCards=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void leftSideGoalIncrement(View view){
        leftTeamGoals++;
        displayleftteamgoals(leftTeamGoals);


    }

    public void leftSideYellowCardIncrement(View view){
        leftTeamYellowcards++;
        displayleftteamyellocards(leftTeamYellowcards);

    }

    public void leftSideRedCardIncrement(View view){
        leftTeamRedCards++;
        displayleftteamredcards(leftTeamRedCards);

    }
    public void rightSideGoalIncrement(View view){
        rightTeamGoals++;
       displayrighttteamgoals(rightTeamGoals);

    }

    public void rightSideYellowCardIncrement(View view){
        rightTeamYellowCards++;
        displayrightteamgyellowcards(rightTeamYellowCards);

    }

    public void rightSideRedCardIncrement(View view){
        rightTeamRedCards++;
        displayrightteamgredcards(rightTeamRedCards);

    }

    public void displayleftteamgoals(int value){
        TextView leftTeamScoorTextView = (TextView) findViewById(R.id.leftteam_goal_textview);
        leftTeamScoorTextView.setText(String.valueOf(leftTeamGoals));
    }
    public void displayleftteamyellocards(int value){
        TextView leftTeamYellowCardTextView = (TextView) findViewById(R.id.leftteam_yellowcard_textview);
        leftTeamYellowCardTextView.setText(String.valueOf(leftTeamYellowcards));
    }
    public void displayleftteamredcards(int value){
        TextView leftTeamRedCardTextView = (TextView) findViewById(R.id.leftteam_redcard_textview);
        leftTeamRedCardTextView.setText(String.valueOf(leftTeamRedCards));
    }
    public void displayrighttteamgoals(int value){
        TextView rightTeamScoorTextView = (TextView) findViewById(R.id.rightteam_goal_textview);
        rightTeamScoorTextView.setText(String.valueOf(rightTeamGoals));
    }
    public void displayrightteamgyellowcards(int value){
        TextView rightTeamYellowCardTextView = (TextView) findViewById(R.id.rightteam_yellowcard_textview);
        rightTeamYellowCardTextView.setText(String.valueOf(rightTeamYellowCards));
    }
    public void displayrightteamgredcards(int value){
        TextView rightTeamRedCardTextView = (TextView) findViewById(R.id.rightteam_redcard_textview);
        rightTeamRedCardTextView.setText(String.valueOf(rightTeamRedCards));
    }


    public void resetFunction (View view){
        rightTeamGoals=0;
         rightTeamYellowCards=0;
         rightTeamRedCards=0;
         leftTeamGoals=0;
         leftTeamYellowcards=0;
         leftTeamRedCards=0;
         displayrighttteamgoals(0);
         displayleftteamgoals(0);
         displayrightteamgredcards(0);
         displayrightteamgyellowcards(0);
         displayleftteamredcards(0);
        displayleftteamyellocards(0);


    }
}
