package blacksoul.gt.tourguatemala.vista.actividades;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

import blacksoul.gt.tourguatemala.adaptadores.MainAdapter;
import blacksoul.gt.tourguatemala.R;
import blacksoul.gt.tourguatemala.utilidades.Internet;
import blacksoul.gt.tourguatemala.vista.fragmentos.FragmentAyudaAsistencia;
import blacksoul.gt.tourguatemala.vista.fragmentos.FragmentTabLayout;

import static blacksoul.gt.tourguatemala.R.mipmap.ic_launcher;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener {

    private ImageButton bActionBar;
    private DrawerLayout drawerLayout;
    private NavigationView navView;
    private FragmentManager mFragmentManager;
    private FragmentTransaction mFragmentTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        if (!Internet.isNetworkAvailable(this)) {
            showAlertDialog("Sin Conexion", "Algunas caracteristicas no estaran disponibles sin conexion a internet", true);
        }
        recuperaRecursos();



    }

    private void recuperaRecursos() {
        bActionBar = (ImageButton)findViewById(R.id.bActionBar);
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer);
        navView = (NavigationView)findViewById(R.id.nav_view);
        bActionBar.setOnClickListener(this);
        navView.setNavigationItemSelectedListener(this);
        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.containerView, new FragmentTabLayout()).commit();
    }


    public void showAlertDialog(String title, String message, Boolean status) {
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle(title);
        alertDialog.setMessage(message);
        //alertDialog.setIcon(R.drawable.ic_assignment_white_24dp);

        alertDialog.show();

    }

    @Override
    public void onClick(View v) {
        drawerLayout.openDrawer(Gravity.LEFT);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.pasos:
                break;
            case R.id.ayudaAsistencia:
                Intent ayuda = new Intent(getApplicationContext(), AyudaAsistencia.class);
                startActivity(ayuda);
                break;
            case R.id.ajustes:
                Intent ajuste = new Intent(getApplicationContext(), Ajustes.class);
                startActivity(ajuste);
                break;
            case R.id.terminosCondiciones:
                Intent terminos = new Intent(getApplicationContext(), TerminosCondiciones.class);
                startActivity(terminos);
                break;
            case R.id.creditos:
                Intent credito = new Intent(getApplicationContext(), Creditos.class);
                startActivity(credito);
                break;
        }
        drawerLayout.closeDrawers();
        return false;
    }
}
