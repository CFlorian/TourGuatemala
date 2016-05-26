package blacksoul.gt.tourguatemala.vista.fragmentos;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import blacksoul.gt.tourguatemala.R;
import blacksoul.gt.tourguatemala.adaptadores.MainAdapter;

/**
 * Created by Usuario on 4/05/2016.
 */
public class FragmentTabLayout extends Fragment implements TabLayout.OnTabSelectedListener {


    private TextView titulo;
    private ArrayList<String> tituloFragmentos;
    View v;
    private TabLayout tab;
    private ViewPager pager;
    private int icono[] = {R.drawable.home,R.drawable.todo,R.drawable.drive};



    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.tab_layout,null);
        recuperaRecursos(view);
        pager.setAdapter(new MainAdapter(getChildFragmentManager()));
        cargarTabs();
        return view;

    }

    private void recuperaRecursos(View view) {
        tab = (TabLayout) view.findViewById(R.id.tabs);
        pager = (ViewPager) view.findViewById(R.id.viewpager);
        titulo = (TextView)view.findViewById(R.id.titulo_toolbar);
        tituloFragmentos = new ArrayList<>();
        tituloFragmentos.add(getResources().getString(R.string.titulo_1));
        tituloFragmentos.add(getResources().getString(R.string.titulo_2));
        tituloFragmentos.add(getResources().getString(R.string.titulo_3));
        tab.setOnTabSelectedListener(this);
    }

    private void cargarTabs() {
        tab.setupWithViewPager(pager);
        tab.getTabAt(0).setIcon(icono[0]);
        tab.getTabAt(1).setIcon(icono[1]);
        tab.getTabAt(2).setIcon(icono[2]);
    }


    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        pager.setCurrentItem(tab.getPosition());
        titulo.setText(tituloFragmentos.get(tab.getPosition()));
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
        pager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {
        pager.setCurrentItem(tab.getPosition());

    }
}
