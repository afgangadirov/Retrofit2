package com.example.retrofitcalismasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private KisilerDaoInterface kisilerDIF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kisilerDIF = ApiUtils.getKisilerDaoInterface();

        //tumKisiler();
        //kisiAra();
        //kisSil();
        //kisEkle();
        //kisiGuncelle();

    }

    public void tumKisiler(){

        kisilerDIF.tumKisiler().enqueue(new Callback<KisilerCavab>() {
            @Override
            public void onResponse(Call<KisilerCavab> call, Response<KisilerCavab> response) {

                List<Kisiler> kisilerList = response.body().getKisiler();

                for (Kisiler k: kisilerList){
                    Log.e("*********","*********");
                    Log.e("kisi_id",k.getKisiId());
                    Log.e("kisi_ad",k.getKisiAd());
                    Log.e("kisi_tel",k.getKisiTel());
                    Log.e("*********","*********");
                }


            }

            @Override
            public void onFailure(Call<KisilerCavab> call, Throwable t) {

            }
        });


    }






    public void kisiAra(){

        kisilerDIF.kisiAra("ya").enqueue(new Callback<KisilerCavab>() {
            @Override
            public void onResponse(Call<KisilerCavab> call, Response<KisilerCavab> response) {

                List<Kisiler> kisilerList = response.body().getKisiler();

                for (Kisiler k: kisilerList){
                    Log.e("*********","*********");
                    Log.e("kisi_id",k.getKisiId());
                    Log.e("kisi_ad",k.getKisiAd());
                    Log.e("kisi_tel",k.getKisiTel());
                    Log.e("*********","*********");
                }


            }

            @Override
            public void onFailure(Call<KisilerCavab> call, Throwable t) {

            }
        });


    }




    public void kisSil(){

        kisilerDIF.kisiSil(34).enqueue(new Callback<CRUDCavab>() {
            @Override
            public void onResponse(Call<CRUDCavab> call, Response<CRUDCavab> response) {
                Log.e("Ugurlu",response.body().getSuccess().toString());
                Log.e("Mesaj",response.body().getMessage().toString());
            }

            @Override
            public void onFailure(Call<CRUDCavab> call, Throwable t) {

            }
        });


    }


    public void kisEkle(){

        kisilerDIF.kisiEkle("Afgan","987654321").enqueue(new Callback<CRUDCavab>() {
            @Override
            public void onResponse(Call<CRUDCavab> call, Response<CRUDCavab> response) {
                Log.e("Ugurlu",response.body().getSuccess().toString());
                Log.e("Mesaj",response.body().getMessage().toString());
            }

            @Override
            public void onFailure(Call<CRUDCavab> call, Throwable t) {

            }
        });

    }




    public void kisiGuncelle(){

        kisilerDIF.kisiGuncelle(14855,"AFGAN","777777777777").enqueue(new Callback<CRUDCavab>() {
            @Override
            public void onResponse(Call<CRUDCavab> call, Response<CRUDCavab> response) {
                Log.e("Ugurlu",response.body().getSuccess().toString());
                Log.e("Mesaj",response.body().getMessage().toString());
            }

            @Override
            public void onFailure(Call<CRUDCavab> call, Throwable t) {

            }
        });

    }




}