package blacksoul.gt.tourguatemala.vista.actividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageButton;

import blacksoul.gt.tourguatemala.R;
import blacksoul.gt.tourguatemala.adaptadores.MyExpandableListAdapter;
import blacksoul.gt.tourguatemala.modelo.Group;

public class Policias extends AppCompatActivity implements View.OnClickListener {

    SparseArray<Group> groups = new SparseArray<Group>();
    private ImageButton regreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.policias);
        iniciaVars();
        createData();
    }

    private void createData() {
        for (int j= 0; j < 10;j++){
            Group group = new Group("Distrito" + j );
            for (int i = 0; i < 5; i++){
                group.children.add("Sub Item" + i);
            }
            groups.append(j,group);
        }
    }

    private void iniciaVars() {
        regreso = (ImageButton) findViewById(R.id.ibRegresar);
        ExpandableListView listView = (ExpandableListView) findViewById(R.id.listView);
        MyExpandableListAdapter adapter = new MyExpandableListAdapter(this,groups);
        listView.setAdapter(adapter);
        regreso.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent miIntento = new Intent(getApplicationContext(), AyudaAsistencia.class);
        startActivity(miIntento);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
