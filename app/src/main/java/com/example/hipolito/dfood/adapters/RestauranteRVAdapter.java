package com.example.hipolito.dfood.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.hipolito.dfood.HomeActivity;
import com.example.hipolito.dfood.PedidoListActivity;
import com.example.hipolito.dfood.R;
import com.example.hipolito.dfood.models.Restaurante;

import java.util.List;

public class RestauranteRVAdapter extends RecyclerView.Adapter<RestauranteRVAdapter.ViewHolder> {

    private List<Restaurante> restaurantes;
    private Context mContext;
    private ProgressBar mProgressBar;

    public RestauranteRVAdapter(List<Restaurante> restaurantes, Context mContext){
        this.restaurantes = restaurantes;
        this.mContext = mContext;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtNomeRestaurante;
        TextView txtLocalizacao;
        ImageView imgStatus;
        TextView txtStatus;
        ImageView star1;
        ImageView star2;
        ImageView star3;
        ImageView star4;
        ImageView star5;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNomeRestaurante = itemView.findViewById(R.id.txtNomeRestaurante);
            txtLocalizacao = itemView.findViewById(R.id.txtLocalizacao);
            imgStatus = itemView.findViewById(R.id.imgStatus);
            txtStatus = itemView.findViewById(R.id.txtStatus);
            star1 = itemView.findViewById(R.id.star1);
            star2 = itemView.findViewById(R.id.star2);
            star3 = itemView.findViewById(R.id.star3);
            star4 = itemView.findViewById(R.id.star4);
            star5 = itemView.findViewById(R.id.star5);

        }
    }

    @NonNull
    @Override
    public RestauranteRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.item_lista_restaurantes, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final RestauranteRVAdapter.ViewHolder viewHolder, int i) {
        final Restaurante restaurante = restaurantes.get(i);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(mContext.getApplicationContext(), PedidoListActivity.class);
                intent.putExtra("nomeRestaurante", restaurante.getNome());
                mContext.startActivity(intent);
            }
        });

        viewHolder.txtNomeRestaurante.setText(restaurante.getNome());
        viewHolder.txtLocalizacao.setText(restaurante.getLocalizacao());
        viewHolder.txtStatus.setText(restaurante.getStatus());

        switch (restaurante.getStatus()){
            case "Aberto":
                viewHolder.imgStatus.setImageResource(R.drawable.ic_check_circle_light_green_a700_18dp);
                break;
            case "Fechado":
                viewHolder.imgStatus.setImageResource(R.drawable.ic_cancel_red_500_18dp);
                break;
        }

        switch (restaurante.getClassificacao()) {
            case 1:
                viewHolder.star1.setVisibility(View.VISIBLE);
                break;
            case 2:
                viewHolder.star1.setVisibility(View.VISIBLE);
                viewHolder.star2.setVisibility(View.VISIBLE);
                break;
            case 3:
                viewHolder.star1.setVisibility(View.VISIBLE);
                viewHolder.star3.setVisibility(View.VISIBLE);
                viewHolder.star2.setVisibility(View.VISIBLE);
                break;
            case 4:
                viewHolder.star1.setVisibility(View.VISIBLE);
                viewHolder.star2.setVisibility(View.VISIBLE);
                viewHolder.star3.setVisibility(View.VISIBLE);
                viewHolder.star4.setVisibility(View.VISIBLE);
                break;
            case 5:
                viewHolder.star1.setVisibility(View.VISIBLE);
                viewHolder.star2.setVisibility(View.VISIBLE);
                viewHolder.star3.setVisibility(View.VISIBLE);
                viewHolder.star4.setVisibility(View.VISIBLE);
                viewHolder.star5.setVisibility(View.VISIBLE);



        }

    }

    @Override
    public int getItemCount() {
        return restaurantes.size();
    }
}
