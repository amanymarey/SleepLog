package io.github.jacobkrantz.sleeplog.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import io.github.jacobkrantz.sleeplog.R;

public class MainActivity extends AppCompatActivity {
    //private boolean switchOnOff;
    private int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //switchOnOff = false;
        counter = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button enterDataButton = (Button) findViewById(R.id.enterDataButton);
        enterDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter == 3){
                    Toast.makeText(MainActivity.this, "Hello!", Toast.LENGTH_SHORT).show();
                }
                counter+=1;
            }
        });

    }
}
