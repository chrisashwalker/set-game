package com.chrisashwalker.set;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static boolean timedGame;
    private static Intent gameModeIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timedGame = false;
        gameModeIntent = new Intent(this, Options.class);
    }

    public void launchGame() {
        gameModeIntent.putExtra(getString(R.string.timed_game), timedGame);
        startActivity(gameModeIntent);
    }

    public void launchClassicGame(View view) {
        timedGame = false;
        launchGame();
    }

    public void launchTimedGame(View view) {
        timedGame = true;
        launchGame();
    }

}
