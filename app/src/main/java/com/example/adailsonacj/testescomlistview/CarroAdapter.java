package com.example.adailsonacj.testescomlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import android.graphics.Color;

public class CarroAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Carro> lista;

    public CarroAdapter(Context context, ArrayList<Carro> lista) {
        this.context = context;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Carro carro = lista.get(position);
        View layout;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            layout = inflater.inflate(R.layout.item_list, null);
        } else {
            layout = convertView;
        }


        TextView modelo = (TextView) layout.findViewById(R.id.twModelo);
        modelo.setText(carro.getModelo());

        TextView marca = (TextView) layout.findViewById(R.id.twMarca);
        marca.setText(carro.getMarca());

        if (position % 2 == 0) {
            layout.setBackgroundColor(Color.YELLOW);
        }

        return layout;
    }

}
