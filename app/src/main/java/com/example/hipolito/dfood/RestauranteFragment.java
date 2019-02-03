package com.example.hipolito.dfood;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hipolito.dfood.adapters.RestauranteRVAdapter;
import com.example.hipolito.dfood.models.Restaurante;

import java.util.ArrayList;
import java.util.List;


public class RestauranteFragment extends Fragment {

    private RecyclerView rvRestaurantes;
    private RestauranteRVAdapter restauranteRVAdapter;
    private List<Restaurante> restaurantes;

    public RestauranteFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_restaurante, container, false);
        rvRestaurantes = view.findViewById(R.id.rvRestaurantes);
        setupViews();
        return view;
    }



    public void setupViews(){
        restaurantes = new ArrayList<Restaurante>();
        povoaLista();
        atualizaLista();
    }

    public List<Restaurante> povoaLista(){

        Restaurante restaurante = new Restaurante("Novo Point da Picanha", "Zona Sul","Aberto", 5);
        restaurantes.add(restaurante);
        Restaurante restaurante1 = new Restaurante("Altas Horas", "Zona Sul","Fechado", 4);
        restaurantes.add(restaurante1);
        Restaurante restaurante2 = new Restaurante("Barney Burgueer's", "Zona Leste", "Fechado",2);
        restaurantes.add(restaurante2);


        return restaurantes;
    }

    public void atualizaLista(){
        restauranteRVAdapter = new RestauranteRVAdapter(restaurantes,this.getContext());

        rvRestaurantes.setAdapter(restauranteRVAdapter);
        rvRestaurantes.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.getContext(),LinearLayoutManager.VERTICAL, false);
        rvRestaurantes.setLayoutManager(linearLayoutManager);
    }

    public static RestauranteFragment newInstance() {
        return new RestauranteFragment();
    }

}
