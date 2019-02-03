package com.example.hipolito.dfood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.hipolito.dfood.adapters.ItemPedidoAdapter;
import com.example.hipolito.dfood.models.Item;

import java.util.ArrayList;
import java.util.List;

public class PedidoListActivity extends AppCompatActivity {

    private RecyclerView rcItens;
    private ItemPedidoAdapter itemPedidoAdapter;
    private List<Item> itens;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido_list);

        bindViews();
        setupViews();

    }

    public void bindViews(){
        rcItens = findViewById(R.id.rc_itens_pedido);
    }

    public void setupViews(){
        itens = new ArrayList<Item>();
        povoaLista();
        atualizaLista();
    }

    public List<Item> povoaLista(){

        Item item = new Item("Bufalo do chefe", "Blend de 160g de carne no pão de batata, queijo cheddar, ovo, bacon crocante e maionese caseira. ", "R$ 18.00");
        itens.add(item);
        Item item2 = new Item("Mega Pepper ", "Blend apimentado de 180g de carne no pão de batata, queijo cheddar, cebola caramelizada e o mega molho de requeijão ", "R$ 15.00");
        itens.add(item2);
        Item item3 = new Item("Delicious Crispy", "Blend de 180g de carne no Pão brioche, queijo cheddar, cebola crocante, tiras de bacon e o delicioso molho de requeijão. ", "R$ 20.00");
        itens.add(item3);
        Item item4 = new Item("Super Fraldinha", "Blend de fraldinha de 180g de carne no pão australiano, queijo prato, bacon, cebola caramelizada, e o super molho de parmesão. ", "R$ 22.00");
        itens.add(item4);
        Item item5 = new Item("Double do Chef", "2 blends de 160g de carne, no pão de parmesão e orégano, 2 fatias de queijo cheddar, cebola caramelizada e molho billy especial.", "R$ 25.00");
        itens.add(item5);
        Item item6 = new Item("Coca Zero Lata", " 500 ml", "R$ 7.00");
        itens.add(item6);
        Item item7 = new Item("Guaraná Zero", "1 L", "R$ 4.50");
        itens.add(item7);
        Item item8 = new Item("Guaraná Jesus", "5 L", "R$ 2.99");
        itens.add(item8);

//        for (int i = 1; i <=5;i++){
//            itens.add(item);
//        }
        return itens;
    }

    public void atualizaLista(){

        itemPedidoAdapter = new ItemPedidoAdapter(itens,this);

        rcItens.setAdapter(itemPedidoAdapter);
        rcItens.setHasFixedSize(false);

        LinearLayoutManager linearLayoutManager =  new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);

        linearLayoutManager.scrollToPosition(0);
        rcItens.setLayoutManager(linearLayoutManager);

    }
}
