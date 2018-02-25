package com.example.android.mkevindefianto_1202150080_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ROG on 25/02/2018.
 */

public class MinumanAdapter extends RecyclerView.Adapter<MinumanAdapter.MinumanViewHolder>{
    //inisiasi variable
    public ArrayList<MinumanItem> datas;
    //agar data yang ditampung dapat dipanggil dan digunakan
    public MinumanAdapter(ArrayList<MinumanItem> datas) {
        this.datas = datas;


        Log.d("JUMLAH_ARRAYLIST","Items: "+getItemCount());
    }

    @Override //memanggail item menu agar dapat digunakan
    public MinumanViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_menu, parent, false);
        return new MinumanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MinumanViewHolder holder, int position) {
        final MinumanItem item = datas.get(position);
        holder.bindTo(item);
        //Agar nama deskripsi dan gambar dapat ditampilkan sesuai yang dipilih pada daftar menu
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go = new Intent(view.getContext().getApplicationContext(),DetailMenu.class);
                go.putExtra("etitle",item.getNama());
                go.putExtra("edesc",item.getDeskripsi());
                go.putExtra("eimg",item.getGambar());
                view.getContext().startActivity(go);
            }
        });
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    class MinumanViewHolder extends RecyclerView.ViewHolder{
        // menginisiasikan variable

        private TextView mLblMinumanJudul;
        private TextView mLblMinumanInfo;
        private ImageView mLblMinumanImg;
        private Context mContext;
        private MinumanItem mCurrentMinuman;

        public MinumanViewHolder(View itemView) {
            super(itemView);
            //memanggil id yang akan ditampilkan
            mLblMinumanJudul = (TextView)itemView.findViewById(R.id.lblItemJudul);
            mLblMinumanInfo = (TextView)itemView.findViewById(R.id.lblItemDeskripsi);
            mLblMinumanImg = (ImageView)itemView.findViewById(R.id.lblItemImg);
        }

        public void bindTo(MinumanItem minuman){
            //mengirimkan informasi agar ditangkap oleh MinumanItem
            mCurrentMinuman = minuman;
            mLblMinumanImg.setImageResource(minuman.getGambar());
            mLblMinumanJudul.setText(minuman.getNama());
            mLblMinumanInfo.setText(minuman.getInfo());
        }
    }
}

