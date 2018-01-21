package com.example.android.sciencequiz;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class display_activity extends AppCompatActivity {
    String display_message;
    int score = 0;
    Button share;
    ImageView result_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_activity);
        Intent intent = getIntent();
        display_message = intent.getStringExtra("displayMessage");
        score = intent.getIntExtra("score", 0);
        TextView message = findViewById(R.id.result_text);
        message.setText(display_message);
        result_image = findViewById(R.id.result_image);
        share = findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareIt();
            }
        });
        setImage();
    }
// display an image
    public void setImage() {

        if (score < 5) {
            result_image.setImageResource(R.drawable.crying);
        }
        if (score <= 7 && score >= 5) {
            result_image.setImageResource(R.drawable.blink);
        }
        if (score > 7) {
            result_image.setImageResource(R.drawable.like);
        }
    }
// share
    public void shareIt() {
        Resources res = getResources();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String shareBody = res.getString(R.string.finalMessage1, score) + res.getString(R.string.finalMessage2);
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(sharingIntent,  res.getString(R.string.shareVia)));
    }
}
