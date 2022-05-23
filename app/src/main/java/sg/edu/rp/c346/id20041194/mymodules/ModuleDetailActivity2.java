package sg.edu.rp.c346.id20041194.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity2 extends AppCompatActivity {

    TextView tvAnswer;
    TextView tvAnswer2;
    TextView tvAnswer3;
    TextView tvAnswer4;
    TextView tvAnswer5;
    TextView tvAnswer6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c349_module);

        tvAnswer = findViewById(R.id.textView);
        tvAnswer2 = findViewById(R.id.textView2);
        tvAnswer3 = findViewById(R.id.textView3);
        tvAnswer4 = findViewById(R.id.textView4);
        tvAnswer5 = findViewById(R.id.textView5);
        tvAnswer6 = findViewById(R.id.textView6);

        Intent h = getIntent();
        tvAnswer.setText("Module Code: " + h.getStringExtra("message1"));
        tvAnswer2.setText("Module Name: " + h.getStringExtra("message2"));
        tvAnswer3.setText("Academic Year: " + h.getIntExtra("message3", 0));
        tvAnswer4.setText("Semester: " + h.getIntExtra("message4",0));
        tvAnswer5.setText("Module Credit: " + h.getIntExtra("message5",0));
        tvAnswer6.setText("Venue: " + h.getStringExtra("message6"));

    }
}