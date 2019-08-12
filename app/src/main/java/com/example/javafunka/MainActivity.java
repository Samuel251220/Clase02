package com.example.javafunka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView miCaja;
    private Double parse;
    private Button miboton;
    private int numPrueba = 12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miboton =(Button) findViewById(R.id.button_id);
        miCaja = (TextView)findViewById(R.id.editText);

        miboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parse = Double.parseDouble(miCaja.getText().toString());

                if (parse>60){
                    Toast.makeText(getApplicationContext(), "Vuelva a intentarlo", Toast.LENGTH_LONG).show();
                }else if (parse<=40){
                    Toast.makeText(getApplicationContext(), "El salario es: " +  parse * 40 , Toast.LENGTH_LONG).show();
                }else if (parse>40 && parse<=50){
                    double parse2 = parse-40;
                    parse2 = parse2 * 80;
                    Toast.makeText(getApplicationContext(), "El salario es: " +  (40 * 40) + parse2 , Toast.LENGTH_LONG).show();
                }
                else if (parse>=51 && parse<=60){
                    double parse2 = parse-40;
                    parse2 = parse2 * 80;
                    Toast.makeText(getApplicationContext(), "El salario es: " +  (40 * 120) + parse2 , Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
