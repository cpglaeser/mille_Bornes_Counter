package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 25 when 25 button is clicked
     */
    public void add25ForTeamA(View view) {
        score = score + 25;
        displayForTeamA(score);
    }

    /**
     * Adds 25 when 25 button is clicked
     */
    public void add25ForTeamB(View view) {
        scoreB = scoreB + 25;
        displayForTeamB(scoreB);
    }

    /**
     * Adds 50 when 50 button is clicked
     */
    public void add50ForTeamA(View view) {
        score = score + 50;
        displayForTeamA(score);
    }

    /**
     * Adds 50 when 50 button is clicked
     */
    public void add50ForTeamB(View view) {
        scoreB = scoreB + 50;
        displayForTeamB(scoreB);
    }

    /**
     * Adds 75 when 75 button is clicked
     */
    public void add75ForTeamA(View view) {
        score = score + 75;
        displayForTeamA(score);
    }

    /**
     * Adds 75 when 75 button is clicked
     */
    public void add75ForTeamB(View view) {
        scoreB = scoreB + 75;
        displayForTeamB(scoreB);
    }

    /**
     * Adds 100 when 100 button is clicked
     */
    public void add100ForTeamA(View view) {
        score = score + 100;
        displayForTeamA(score);
    }

    /**
     * Adds 100 when 100 button is clicked
     */
    public void add100ForTeamB(View view) {
        scoreB = scoreB + 100;
        displayForTeamB(scoreB);
    }

    /**
     * Adds 200 when 200 is clicked
     */
    public void add200ForTeamA(View view) {
        score = score + 200;
        displayForTeamA(score);
    }

    /**
     * Adds 200 when 200 button is clicked
     */
    public void add200ForTeamB(View view) {
        scoreB = scoreB + 200;
        displayForTeamB(scoreB);
    }

    /** Reset scores for Team A and Team B
     *
     */
    public void resetScores(View view) {
        score = 0;
        scoreB = 0;
        displayForTeamA(score);
        displayForTeamB(scoreB);
    }
}
