package com.example.rv;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    ImageView imgV;
    TextView mTitle;
    ItemClickListener itemClickListener;

    MyHolder(@NonNull View itemView){
        super(itemView);

        this.imgV = itemView.findViewById(R.id.utama_mekah);
        this.mTitle = itemView.findViewById(R.id.utamaa_mekah);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClickListener(v, getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener ic){

        this.itemClickListener = ic;
    }
}
