package com.example.adailsonacj.testescomlistview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Carro> carros = new ArrayList<Carro>();

        for(int i = 0; i < 100; i++){

            Carro carro = new Carro();
            carro.setModelo("Carro "+(i + 1));
            carro.setMarca("Marca "+(i + 1));

            carros.add(carro);
        }

        ListView lv = (ListView) findViewById(R.id.ListView);
        lv.setAdapter(new CarroAdapter(this, carros));
    }
}