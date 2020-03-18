package com.example.wtww;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView wordTxt;
    TextView wordMeaningTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wordTxt = findViewById(R.id.wordNameView);
        wordMeaningTxt = findViewById(R.id.wordMeaningView);

        wordTxt.setText("Smonday");
        wordMeaningTxt.setText("The moment when Sunday stops feeling like a Sunday and the anxiety of Monday kicks in.");

    }

    public void displayWeirdWord(View view) {
        String[] word = weirdWordDeck.shuffleAndPick();
        wordTxt.setText(word[0]);
        wordMeaningTxt.setText(word[1]);
    }
}
