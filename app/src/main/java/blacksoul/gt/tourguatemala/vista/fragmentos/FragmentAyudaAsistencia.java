package blacksoul.gt.tourguatemala.vista.fragmentos;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import blacksoul.gt.tourguatemala.R;

/**
 * Created by Usuario on 4/05/2016.
 */
public class FragmentAyudaAsistencia extends Fragment implements View.OnClickListener {

    private ImageButton policia, hospital, auxilios, prevencion;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.ayuda_asistencia,container,false);
        recuperarRecursos(view);
        return view;
    }

    private void recuperarRecursos(View view) {
        auxilios = (ImageButton) view.findViewById(R.id.ibAuxilios);
        policia = (ImageButton) view.findViewById(R.id.ibPolicia);
        hospital = (ImageButton) view.findViewById(R.id.ibHopital);
        prevencion = (ImageButton) view.findViewById(R.id.ibPrevencion);
        auxilios.setOnClickListener(this);
        policia.setOnClickListener(this);
        hospital.setOnClickListener(this);
        prevencion.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ibAuxilios:
                break;
            case R.id.ibHopital:
                break;
            case R.id.ibPolicia:
                break;
            case R.id.ibPrevencion:
                break;
        }

    }
}
