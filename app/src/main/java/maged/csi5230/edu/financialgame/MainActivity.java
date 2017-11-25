package maged.csi5230.edu.financialgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText showGrowth, accountValue = null;
    Button startGame, stopGame, showButton = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showGrowth = (EditText) findViewById(R.id.editTxtShowGrowth);
        accountValue = (EditText) findViewById(R.id.editTxtAccountValue);
        startGame = (Button) findViewById(R.id.startBtn);
        stopGame = (Button) findViewById(R.id.stopBtn);
        showButton = (Button) findViewById(R.id.showGrowthBtn);


        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int number = rand.nextInt(100) + 1;
                String myString = String.valueOf(number);
                accountValue.setText(myString);

                    }
        });



        stopGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });
    }

    public void genereate(View view) {

    }
}


