package com.example.hipolito.dfood;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class HomeActivity extends AppCompatActivity {

    private BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initComponents();
        getSupportActionBar().setTitle("Restaurantes");
        Fragment restaurantesFragment = RestauranteFragment.newInstance();
        openFragment(restaurantesFragment);
    }

    public void initComponents(){

        navigationView = findViewById(R.id.navigationView);
        navigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                        switch (menuItem.getItemId()) {
                            case R.id.navigation_restaurantes:
                                getSupportActionBar().setTitle("Restaurantes");
                                Fragment restaurantesFragment = RestauranteFragment.newInstance();
                                openFragment(restaurantesFragment);
                                break;

                            case R.id.navigation_pedidos:
                                getSupportActionBar().setTitle("Meus Pedidos");
                                Fragment pedidosFragment = PedidoFragment.newInstance();
                                openFragment(pedidosFragment);
                                break;

                            case R.id.navigation_conta:
                                getSupportActionBar().setTitle("Minha conta");
                                SettingsFragment settingsFragment = SettingsFragment.newInstance();
                                openFragment(settingsFragment);
                                break;

                        }
                        return true;                    }
                }
        );
    }
    private void openFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
