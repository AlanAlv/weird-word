package com.example.wtww;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView wordTxt;
    TextView wordMeaningTxt;
    RelativeLayout relativeLyt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wordTxt = findViewById(R.id.wordNameView);
        wordMeaningTxt = findViewById(R.id.wordMeaningView);
        relativeLyt = findViewById(R.id.relativeLyt);

        wordTxt.setText("Smonday");
        wordMeaningTxt.setText("The moment when Sunday stops feeling like a Sunday and the anxiety of Monday kicks in.");
        relativeLyt.setBackgroundColor(ColorPopper.pickColor());
    }

    public void displayWeirdWord(View view) {
        String[] word = WeirdWordDeck.shuffleAndPick();
        wordTxt.setText(word[0]);
        wordMeaningTxt.setText(word[1]);
        relativeLyt.setBackgroundColor(ColorPopper.pickColor());
    }
}
