package com.example.android.sciencequiz;


import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText userName;
    RadioButton question1Correct;
    CheckBox question2Correct1, question2Correct2, question2Incorrect, question2Incorrect2;
    EditText question3;
    RadioButton question4Correct;
    RadioButton question5Correct;
    EditText question6;
    RadioButton question7Correct;
    RadioButton question8Correct;
    RadioButton question9Correct;
    CheckBox question10Correct1, question10Correct2, question10Correct3, question10Incorrect;
    RadioGroup group1, group4, group5, group7, group8, group9;
    ScrollView scrollView;
    String name;

    // hide keyboard when click outside

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (getCurrentFocus() != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Hide keyboard when the program starts
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        //Initialize Radio buttons, Check boxes and Edit text
        initialize();

    }

    //Initialize Radio buttons, Check boxes and Edit text
    public void initialize() {
        userName = findViewById(R.id.name_field);
        question1Correct = findViewById(R.id.rb_question1ans1);
        question2Correct1 = findViewById(R.id.cb_question2ans2);
        question2Incorrect = findViewById(R.id.cb_question2ans1);
        question2Incorrect2 = findViewById(R.id.cb_question2ans3);
        question2Correct2 = findViewById(R.id.cb_question2ans4);
        question3 = findViewById(R.id.et_question3);
        question4Correct = findViewById(R.id.rb_question4ans2);
        question5Correct = findViewById(R.id.rb_question5ans1);
        question6 = findViewById(R.id.et_question6);
        question7Correct = findViewById(R.id.rb_question7ans1);
        question8Correct = findViewById(R.id.rb_question8ans4);
        question9Correct = findViewById(R.id.rb_question9ans2);
        question10Correct1 = findViewById(R.id.cb_question10ans1);
        question10Correct2 = findViewById(R.id.cb_question10ans3);
        question10Correct3 = findViewById(R.id.cb_question10ans4);
        question10Incorrect = findViewById(R.id.cb_question10ans2);
        group1 = findViewById(R.id.rb_group1);
        group4 = findViewById(R.id.rb_group4);
        group5 = findViewById(R.id.rb_group5);
        group7 = findViewById(R.id.rb_group7);
        group8 = findViewById(R.id.rb_group8);
        group9 = findViewById(R.id.rb_group9);
        scrollView = findViewById(R.id.scrollView);
    }


    //method used to check the answers and calculate the score
    public int calculateScore() {
        int scoreBefore, scoreAfter = 0;
        String question3ans = question3.getText().toString();
        String question6ans = question6.getText().toString();
        //check question 1
        if (question1Correct.isChecked())
            scoreAfter += 1;
        else {
            scoreAfter = 0;
        }
        scoreBefore = scoreAfter;
        //check question 2
        if ((question2Correct1.isChecked() && question2Correct2.isChecked() &&
                !(question2Incorrect.isChecked()) && !(question2Incorrect2.isChecked()))) {
            scoreAfter += 1;
        } else {
            scoreAfter = scoreBefore;
        }
        scoreBefore = scoreAfter;
        //check question 3 without being case sensitive
        if (question3ans.equalsIgnoreCase(getResources().getString(R.string.question3_answer))) {
            scoreAfter += 1;
        } else {
            scoreAfter = scoreBefore;
        }
        scoreBefore = scoreAfter;
        //check question 4
        if (question4Correct.isChecked()) {
            scoreAfter += 1;
        } else {
            scoreAfter = scoreBefore;
        }
        scoreBefore = scoreAfter;
        //check question 5
        if (question5Correct.isChecked()) {
            scoreAfter += 1;
        } else {
            scoreAfter = scoreBefore;
        }
        scoreBefore = scoreAfter;
        //check question 6, same as question 3
        if (question6ans.equalsIgnoreCase(getResources().getString(R.string.question6_answer))) {
            scoreAfter += 1;
        } else {
            scoreAfter = scoreBefore;
        }
        scoreBefore = scoreAfter;
        //check question 7
        if (question7Correct.isChecked()) {
            scoreAfter += 1;
        } else {
            scoreAfter = scoreBefore;
        }
        scoreBefore = scoreAfter;
        //check question 8
        if (question8Correct.isChecked()) {
            scoreAfter += 1;
        } else {
            scoreAfter = scoreBefore;
        }
        scoreBefore = scoreAfter;
        //check question 9
        if (question9Correct.isChecked()) {
            scoreAfter += 1;
        } else {
            scoreAfter = scoreBefore;
        }
        scoreBefore = scoreAfter;
        //check question 10
        if (question10Correct1.isChecked() && question10Correct2.isChecked()
                && question10Correct3.isChecked() && !(question10Incorrect.isChecked())) {
            scoreAfter += 1;
        } else {
            scoreAfter = scoreBefore;
        }

        return scoreAfter;
    }

    //method used to scroll to top
    public void scrollTop() {
        scrollView.setFocusableInTouchMode(true);
        scrollView.smoothScrollTo(0, 0);
    }

    //mark correct answers
    public void showAnswers(View view) {
        question1Correct.setTextColor(getResources().getColor(R.color.correct));
        question2Correct1.setTextColor(getResources().getColor(R.color.correct));
        question2Correct2.setTextColor(getResources().getColor(R.color.correct));
        question3.setHint(R.string.question3_answer);
        question3.setTextColor(getResources().getColor(R.color.correct));
        question4Correct.setTextColor(getResources().getColor(R.color.correct));
        question5Correct.setTextColor(getResources().getColor(R.color.correct));
        question6.setHint(R.string.question6_answer);
        question6.setTextColor(getResources().getColor(R.color.correct));
        question7Correct.setTextColor(getResources().getColor(R.color.correct));
        question8Correct.setTextColor(getResources().getColor(R.color.correct));
        question9Correct.setTextColor(getResources().getColor(R.color.correct));
        question10Correct1.setTextColor(getResources().getColor(R.color.correct));
        question10Correct2.setTextColor(getResources().getColor(R.color.correct));
        question10Correct3.setTextColor(getResources().getColor(R.color.correct));
        scrollTop();
    }

    //reset colors if showAnswers method was called
    public void reset(View view) {
        question1Correct.setTextColor(getResources().getColor(R.color.textColor));
        question2Correct1.setTextColor(getResources().getColor(R.color.textColor));
        question2Correct2.setTextColor(getResources().getColor(R.color.textColor));
        question3.setTextColor(getResources().getColor(R.color.textColor));
        question4Correct.setTextColor(getResources().getColor(R.color.textColor));
        question5Correct.setTextColor(getResources().getColor(R.color.textColor));
        question6.setTextColor(getResources().getColor(R.color.textColor));
        question7Correct.setTextColor(getResources().getColor(R.color.textColor));
        question8Correct.setTextColor(getResources().getColor(R.color.textColor));
        question9Correct.setTextColor(getResources().getColor(R.color.textColor));
        question10Correct1.setTextColor(getResources().getColor(R.color.textColor));
        question10Correct2.setTextColor(getResources().getColor(R.color.textColor));
        question10Correct3.setTextColor(getResources().getColor(R.color.textColor));
        //reset radio buttons
        group1.clearCheck();
        group4.clearCheck();
        group5.clearCheck();
        group7.clearCheck();
        group8.clearCheck();
        group9.clearCheck();
        //reset texts
        question3.getText().clear();
        question3.setHint(R.string.question3_hint);
        question6.getText().clear();
        question6.setHint(R.string.question6_hint);
        userName.getText().clear();
        //reset check boxes
        question1Correct.setChecked(false);
        question2Correct1.setChecked(false);
        question2Correct2.setChecked(false);
        question2Incorrect.setChecked(false);
        question2Incorrect2.setChecked(false);
        question10Correct1.setChecked(false);
        question10Correct2.setChecked(false);
        question10Correct3.setChecked(false);
        question10Incorrect.setChecked(false);
        scrollTop();
    }

    //method used to display the score
    public String createMessage() {
        String message = "";
        Resources res = getResources();

        if (calculateScore() < 5) {
            message = res.getString(R.string.low, name, calculateScore());
        }
        if (calculateScore() <= 7 && calculateScore() >= 5) {
            message = res.getString(R.string.medium, name, calculateScore());
        }
        if (calculateScore() > 7) {
            message = res.getString(R.string.high, name, calculateScore());
        }

        return message;
    }

    // create custom toast
    public void createCustomToast(String message)

    {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast,
                (ViewGroup) findViewById(R.id.custom_toast_container));
        TextView text = layout.findViewById(R.id.custom_text_toast);
        text.setText(message);
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }

    //send information to display screen
    public void sendMessage(String message, int score) {
        Intent intent = new Intent(this, display_activity.class);
        intent.putExtra("displayMessage", message);
        intent.putExtra("score", score);
        startActivity(intent);

    }

    //method used to display the toast with the score
    public void submit(View view) {
        Resources res = getResources();
        name = userName.getText().toString();
        if (name.equals(""))
            createCustomToast(res.getString(R.string.enterName));
        else
            sendMessage(createMessage(), calculateScore());
    }

}
