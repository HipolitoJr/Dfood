package com.example.hipolito.dfood;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hipolito.dfood.adapters.PedidoRVAdapter;
import com.example.hipolito.dfood.models.Pedido;
import com.example.hipolito.dfood.models.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class PedidoFragment extends Fragment {

    private RecyclerView rvPedidos;
    private PedidoRVAdapter pedidoRVAdapter;
    private List<Pedido> pedidos;

    public PedidoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pedido, container, false);
        rvPedidos = view.findViewById(R.id.rvPedidos);
        setupViews();
        return view;
    }

    public void setupViews(){
        pedidos = new ArrayList<Pedido>();
        povoaLista();
        atualizaLista();
    }

    public List<Pedido> povoaLista(){
        Pedido pedido = new Pedido("001","Novo Point da Picanha", "Finalizado");
        pedidos.add(pedido);
        Pedido pedido1 = new Pedido("375","McDonald's", "Aguardando");
        pedidos.add(pedido1);
        Pedido pedido2 = new Pedido("250","Altas Horas","Aguardando");
        pedidos.add(pedido2);
        Pedido pedido3 = new Pedido("963","Novo Point da Picanha", "Cancelado");
        pedidos.add(pedido3);
        Pedido pedido4 = new Pedido("121","Altas Horas", "Finalizado");
        pedidos.add(pedido4);
        Pedido pedido5 = new Pedido("223","Pizza Hut", "Finalizado");
        pedidos.add(pedido5);
        Pedido pedido6 = new Pedido("500","Barney Burguer's", "Finalizado");
        pedidos.add(pedido6);

        return pedidos;
    }

    public void atualizaLista(){
        pedidoRVAdapter = new PedidoRVAdapter(pedidos,this.getContext());

        rvPedidos.setAdapter(pedidoRVAdapter);
        rvPedidos.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.getContext(),LinearLayoutManager.VERTICAL, false);
        rvPedidos.setLayoutManager(linearLayoutManager);

    }

    public static PedidoFragment newInstance() {
        return new PedidoFragment();
    }


}
