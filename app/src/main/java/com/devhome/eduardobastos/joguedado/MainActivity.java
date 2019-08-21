package com.devhome.eduardobastos.joguedado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //criando referencias

    private Button butoonJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butoonJogar = findViewById(R.id.buttonJogar);

        butoonJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);


                int number = new Random().nextInt(5); // gerar 2 numeros a partir do zero (0 - 5)

                intent.putExtra("número", number);


                startActivity(intent);
            }
        });
    }
}

