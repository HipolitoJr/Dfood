package com.example.hipolito.dfood.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.hipolito.dfood.R;
import com.example.hipolito.dfood.models.Item;

import java.util.List;

public class ItemPedidoAdapter extends RecyclerView.Adapter<ItemPedidoAdapter.ViewHolder> {

    private List<Item> itens;
    private Context mContext;
    private ProgressBar mProgressBar;

    public ItemPedidoAdapter(List<Item> itens, Context mContext) {
        this.itens = itens;
        this.mContext = mContext;
    }

    public Context getmContext(){
        return mContext;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView itemTitulo;
        TextView itemDescricao;
        TextView itemPreco;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemTitulo = itemView.findViewById(R.id.list_pedido_titulo);
            itemDescricao = itemView.findViewById(R.id.list_pedido_descricao);
            itemPreco = itemView.findViewById(R.id.list_pedido_valor);
        }
    }


    @NonNull
    @Override
    public ItemPedidoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View itemPedidoView = inflater.inflate(R.layout.item_lista_pedido, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(itemPedidoView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemPedidoAdapter.ViewHolder viewHolder, int i) {

        final Item item = itens.get(i);
        viewHolder.itemPreco.setText(item.getPreco());
        viewHolder.itemDescricao.setText(item.getDescricao());
        viewHolder.itemTitulo.setText(item.getTitulo());
    }

    @Override
    public int getItemCount() {
        return itens.size();
    }


}
