package com.example.rv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRV;
    MyAdapter mA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRV = findViewById(R.id.recycler);
        mRV.setLayoutManager(new LinearLayoutManager(this));

        mA = new MyAdapter(this, getMyList());

        mRV.setAdapter(mA);
    }

    private ArrayList<Model> getMyList(){
        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTulisan("Keutamaan Kota Mekah");
        m.setFoto(R.drawable.keutamaan_mekah);
        models.add(m);

        m = new Model();
        m.setTulisan("Masjidil Haram");
        m.setFoto(R.drawable.masjidil_haram);
        models.add(m);

        m = new Model();
        m.setTulisan("Ka'bah");
        m.setFoto(R.drawable.kakbah);
        models.add(m);

        m = new Model();
        m.setTulisan("Mina");
        m.setFoto(R.drawable.mina);
        models.add(m);

        m = new Model();
        m.setTulisan("Arofah");
        m.setFoto(R.drawable.arofah);
        models.add(m);

        m = new Model();
        m.setTulisan("Muzdalifah");
        m.setFoto(R.drawable.muzdalifah);
        models.add(m);

        m = new Model();
        m.setTulisan("Gua Hira");
        m.setFoto(R.drawable.gua_hira);
        models.add(m);

        m = new Model();
        m.setTulisan("Gua At-tsaur");
        m.setFoto(R.drawable.gua_tsur);
        models.add(m);

        return models;

    }
}
