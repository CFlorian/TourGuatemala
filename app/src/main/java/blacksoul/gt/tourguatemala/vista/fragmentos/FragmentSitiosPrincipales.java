package blacksoul.gt.tourguatemala.vista.fragmentos;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import blacksoul.gt.tourguatemala.adaptadores.SitiosAdapter;
import blacksoul.gt.tourguatemala.R;

public class FragmentSitiosPrincipales extends Fragment {

    private GridView gridLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sitios_principales,container,false);
        SitiosAdapter sitios = new SitiosAdapter(getContext());
        gridLayout = (GridView)view.findViewById(R.id.grid);
        gridLayout.setAdapter(sitios);
        return  view;
    }
}
