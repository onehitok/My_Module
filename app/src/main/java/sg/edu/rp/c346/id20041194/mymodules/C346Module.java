package sg.edu.rp.c346.id20041194.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class C346Module extends AppCompatActivity {

    TextView tvAnswer;
    TextView tvAnswer2;
    TextView tvAnswer3;
    TextView tvAnswer4;
    TextView tvAnswer5;
    TextView tvAnswer6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c346_module);

        tvAnswer = findViewById(R.id.textView);
        tvAnswer2 = findViewById(R.id.textView2);
        tvAnswer3 = findViewById(R.id.textView3);
        tvAnswer4 = findViewById(R.id.textView4);
        tvAnswer5 = findViewById(R.id.textView5);
        tvAnswer6 = findViewById(R.id.textView6);


        Intent j = getIntent();
        tvAnswer.setText("Module Code: " + j.getStringExtra("message1"));
        tvAnswer2.setText("Module Name: " + j.getStringExtra("message2"));
        tvAnswer3.setText("Academic Year: " + j.getIntExtra("message3",0));
        tvAnswer4.setText("Semester: " + j.getIntExtra("message4",0));
        tvAnswer5.setText("Module Credit: " + j.getIntExtra("message5",0));
        tvAnswer6.setText("Venue: " + j.getStringExtra("message6"));


    }
}