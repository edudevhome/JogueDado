package com.devhome.eduardobastos.joguedado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class ResultadoActivity extends AppCompatActivity {

    private Button buttonVoltar;
    private ImageView imageViewResult;
    private AdView mAdView;
    private AdView mAdView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);


        //Configurando Banner
        MobileAds.initialize(this, "ca-app-pub-8069899346555474/3095318158");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        //Configurando Banner2
        MobileAds.initialize(this, "ca-app-pub-8069899346555474/1452748204");
        mAdView2 = findViewById(R.id.adView2);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        mAdView2.loadAd(adRequest2);



        buttonVoltar = findViewById(R.id.buttonVoltar);
        imageViewResult = findViewById(R.id.imageViewResult);

        //recuperar dados

        Bundle dados = getIntent().getExtras();
        int number = dados.getInt("número");


        if (number == 0){

            imageViewResult.setImageResource(R.drawable.dado1);
        }else if (number == 1){

            imageViewResult.setImageResource(R.drawable.dado2);
        }else if (number == 3){

            imageViewResult.setImageResource(R.drawable.dado3);

        }else if (number == 4){

            imageViewResult.setImageResource(R.drawable.dado4);


        }else if(number == 5){

            imageViewResult.setImageResource(R.drawable.dado5);

        }else {

            imageViewResult.setImageResource(R.drawable.dado6);

        }


        //Evento clique botao voltar

        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });

    }
}

