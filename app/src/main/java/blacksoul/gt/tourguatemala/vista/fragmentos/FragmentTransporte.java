package blacksoul.gt.tourguatemala.vista.fragmentos;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import blacksoul.gt.tourguatemala.R;
import blacksoul.gt.tourguatemala.adaptadores.TransporteAdapter;

/**
 * Created by Usuario on 23/03/2016.
 */
public class FragmentTransporte extends Fragment {

    private GridView gridLayout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_transporte,container,false);
        TransporteAdapter lugares = new TransporteAdapter(getContext());
        gridLayout = (GridView) view.findViewById(R.id.grid);
        gridLayout.setAdapter(lugares);
        return  view;


    }
}
