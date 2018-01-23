package com.example.android.scorekeeper;

import android.content.pm.ActivityInfo;
import android.support.constraint.solver.Goal;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Defining the blue team variables
    int goalBlue = 0;
    int foulBlue = 0;
    int yellowCardBlue = 0;
    int redCardBlue = 0;


    // Defining the Red variables
    int goalRed = 0;
    int foulRed = 0;
    int yellowCardRed = 0;
    int redCardRed = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     }


    // This method saves the current state of the data.
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("goalBlue", goalBlue);
        outState.putInt("goalRed", goalRed);
        outState.putInt("foulBlue", foulBlue);
        outState.putInt("foulRed", foulRed);
        outState.putInt("yellowCardBlue", yellowCardBlue);
        outState.putInt("yellowCardRed", yellowCardRed);
        outState.putInt("redCardBlue", yellowCardBlue);
        outState.putInt("redCardRed", redCardRed);

    }



    public void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);

        goalBlue = savedInstanceState.getInt("goalBlue");
        goalRed = savedInstanceState.getInt("goalRed");
        foulBlue = savedInstanceState.getInt("foulBlue");
        foulRed = savedInstanceState.getInt("foulRed");
        yellowCardBlue = savedInstanceState.getInt("yellowCardBlue");
        yellowCardRed = savedInstanceState.getInt("yellowCardRed");
        redCardBlue = savedInstanceState.getInt("redCardBlue");
        redCardRed = savedInstanceState.getInt("redCardRed");

        displayChelseaGoals(goalBlue);
        displayArsenalGoals(goalRed);
        displayChelseaFouls(foulBlue);
        displayArsenalFouls(foulRed);
        displayChelseaYellowCards(yellowCardBlue);
        displayArsenalYellowCards(yellowCardRed);
        displayChelseaRedCards(redCardBlue);
        displayArsenalRedCards(redCardRed);


    }

    /*
     * Increment chelsea score by 1
     */

    public void addGoalChelsea(View v) {
        goalBlue = goalBlue + 1;
        displayChelseaGoals(goalBlue);
    }

    /*
     * Increment Arsenal score by 1
     */
    public void addGoalArsenal(View v) {
        goalRed = goalRed + 1;
        displayArsenalGoals(goalRed);
    }

    /*
     * Increment chelsea foul by 1
     */

    public void addFoulChelsea(View v) {
        foulBlue = foulBlue + 1;
        displayChelseaFouls(foulBlue);
    }

    /*
     * Increment Arsenal foul by 1
     */

    public void addFoulArsenal(View v) {
        foulRed = foulRed + 1;
        displayArsenalFouls(foulRed);
    }

    /*
     * Increment Chelsea yellow card by 1
     */
    public void addYellowCardChelsea(View v) {
        yellowCardBlue = yellowCardBlue + 1;
        displayChelseaYellowCards(yellowCardBlue);
    }

    /*
     * Increment Arsenal yellow card by 1
     */
    public void addYellowCardArsenal(View v) {
        yellowCardRed = yellowCardRed + 1;
        displayArsenalYellowCards(yellowCardRed);
    }

    /*
     * Increment Chelsea Red card by 1
     */
    public void addRedCardChelsea(View v) {
        redCardBlue = redCardBlue + 1;
        displayChelseaRedCards(redCardBlue);
    }

    /*
     * Increment Chelsea Red card by 1
     */
    public void addRedCardArsenal(View v) {
        redCardRed = redCardRed + 1;
        displayArsenalRedCards(redCardRed);
    }

    /**
     * Display Chelsea Goals
     */
    public void displayChelseaGoals(int score) {
        TextView scoreView = (TextView) findViewById(R.id.chelsea_score);
        scoreView.setText(String.valueOf(score));
    }


    /*
     * Display Arsenal Goals
     */
    public void displayArsenalGoals(int score) {
        TextView scoreView = (TextView) findViewById(R.id.arsenal_score);
        scoreView.setText(String.valueOf(score));
    }

    /*
     * Display Chelsea Fouls
     */
    public void displayChelseaFouls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.chelsea_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /*
     * Display Arsenal Fouls
     */
    public void displayArsenalFouls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.arsenal_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /*
     * Display Chelsea Yellow Cards
     */
    public void displayChelseaYellowCards(int score) {
        TextView scoreView = (TextView) findViewById(R.id.chelsea_yellow_cards);
        scoreView.setText(String.valueOf(score));
    }


    /*
     * Display Arsenal Yellow Cards
     */
    public void displayArsenalYellowCards(int score) {
        TextView scoreView = (TextView) findViewById(R.id.arsenal_yellow_cards);
        scoreView.setText(String.valueOf(score));
    }

    /*
     * Display Chelsea Red Cards
     */

    public void displayChelseaRedCards(int score) {
        TextView scoreView = (TextView) findViewById(R.id.chelsea_red_cards);
        scoreView.setText(String.valueOf(score));
    }


    /*
     * Display Arsenal Red Cards
     */
    public void displayArsenalRedCards(int score) {
        TextView scoreView = (TextView) findViewById(R.id.arsenal_red_cards);
        scoreView.setText(String.valueOf(score));
    }


    /*
     *  Reset all the results
     */
    public void resetScore(View view) {
        goalBlue = 0;
        goalRed = 0;
        foulBlue = 0;
        foulRed = 0;
        yellowCardBlue = 0;
        yellowCardRed = 0;
        redCardBlue = 0;
        redCardRed = 0;

        displayChelseaGoals(goalBlue);
        displayArsenalGoals(goalRed);
        displayChelseaFouls(foulBlue);
        displayArsenalFouls(foulRed);
        displayChelseaYellowCards(yellowCardBlue);
        displayArsenalYellowCards(yellowCardRed);
        displayChelseaRedCards(redCardBlue);
        displayArsenalRedCards(redCardRed);
    }

}
