package com.devhome.eduardobastos.joguedado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //criando referencias

    private Button butoonJogar;
    private AdView mAdView;
    private AdView mAdView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Configurando Banner
        MobileAds.initialize(this, "ca-app-pub-8069899346555474/7430643825");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);





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

