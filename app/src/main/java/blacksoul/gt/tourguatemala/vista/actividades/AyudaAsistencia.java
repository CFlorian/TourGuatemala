package blacksoul.gt.tourguatemala.vista.actividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import blacksoul.gt.tourguatemala.R;

public class AyudaAsistencia extends AppCompatActivity implements View.OnClickListener {

    private ImageButton policia, hospital, auxilios, prevencion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ayuda_asistencia);
        recuperaRecursos();
    }

    private void recuperaRecursos() {
        auxilios = (ImageButton) findViewById(R.id.ibAuxilios);
        policia = (ImageButton) findViewById(R.id.ibPolicia);
        hospital = (ImageButton) findViewById(R.id.ibHopital);
        prevencion = (ImageButton) findViewById(R.id.ibPrevencion);
        auxilios.setOnClickListener(this);
        policia.setOnClickListener(this);
        hospital.setOnClickListener(this);
        prevencion.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ibRegresar:
                Intent back =  new Intent(getApplicationContext(), MainActivity.class);
                startActivity(back);
                break;
            case R.id.ibAuxilios:
                break;
            case R.id.ibHopital:
                break;
            case R.id.ibPolicia:
                Intent policia =  new Intent(getApplicationContext(), Policias.class);
                startActivity(policia);
                break;
            case R.id.ibPrevencion:
                break;
        }
    }
}
