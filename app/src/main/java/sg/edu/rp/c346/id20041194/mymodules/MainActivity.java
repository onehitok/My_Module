package sg.edu.rp.c346.id20041194.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Event handling Step 1
    TextView btnModule1;
    TextView btnModule2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Event handling Step 2
        btnModule1 = findViewById(R.id.btnModule1);
        btnModule2 = findViewById(R.id.btnModule2);

        //Event handling Step 3
        btnModule1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity1.class);
                intent.putExtra("message1", "C346.");
                intent.putExtra("message2", "Android Programming.");
                intent.putExtra("message3", 2020);
                intent.putExtra("message4", 1);
                intent.putExtra("message5", 4);
                intent.putExtra("message6", "W66M");
                startActivity(intent);
            }
        });

        btnModule2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity2.class);
                intent.putExtra("message1", "C349.");
                intent.putExtra("message2", "IPad Programming.");
                intent.putExtra("message3", 2020);
                intent.putExtra("message4", 1);
                intent.putExtra("message5", 6);
                intent.putExtra("message6", "E62E.");
                startActivity(intent);
            }
        });
    }
}