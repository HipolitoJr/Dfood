package com.example.hipolito.dfood.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.hipolito.dfood.R;
import com.example.hipolito.dfood.models.Pedido;

import java.util.List;
import java.util.zip.Inflater;

public class PedidoRVAdapter extends RecyclerView.Adapter<PedidoRVAdapter.ViewHolder> {

    private List<Pedido> pedidos;
    private Context mContext;
    private ProgressBar mProgressBar;

    public PedidoRVAdapter(List<Pedido> pedidos, Context mContext) {
        this.pedidos = pedidos;
        this.mContext = mContext;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView numeroPedido;
        TextView nomeRestaurante;
        ImageView imgStatus;
        TextView txtStatus;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            numeroPedido = itemView.findViewById(R.id.txtNumeroPedido);
            nomeRestaurante = itemView.findViewById(R.id.txtRestaurantePedido);
            imgStatus = itemView.findViewById(R.id.imgStatusPedido);
            txtStatus = itemView.findViewById(R.id.txtStatusPedido);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.item_lista_meus_pedidos, viewGroup,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        final Pedido pedido = pedidos.get(i);
        viewHolder.numeroPedido.setText(pedido.getNumero());
        viewHolder.nomeRestaurante.setText(pedido.getRestaurante());
        viewHolder.txtStatus.setText(pedido.getStatus());

        switch (pedido.getStatus()){
            case "Finalizado":
                viewHolder.imgStatus.setImageResource(R.drawable.ic_check_circle_light_green_a700_24dp);
                break;
            case "Aguardando":
                viewHolder.imgStatus.setImageResource(R.drawable.ic_access_time_grey_600_24dp);
                break;
            case "Cancelado":
                viewHolder.imgStatus.setImageResource(R.drawable.ic_cancel_red_500_24dp);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return pedidos.size();
    }

}
