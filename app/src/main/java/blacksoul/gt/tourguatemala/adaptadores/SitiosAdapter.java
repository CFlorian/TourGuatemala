package blacksoul.gt.tourguatemala.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import blacksoul.gt.tourguatemala.modelo.Destacado;
import blacksoul.gt.tourguatemala.R;

public class SitiosAdapter extends BaseAdapter {

    private Context context;

    public SitiosAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return Destacado.ITEMS.length;
    }

    @Override
    public Object getItem(int position) {
        return Destacado.ITEMS[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.grid_item, parent, false);
        }

        ImageView imagenCoche = (ImageView) convertView.findViewById(R.id.imagen_coche);
        TextView nombreCoche = (TextView) convertView.findViewById(R.id.nombre_coche);

        final Destacado item = (Destacado)getItem(position);
        imagenCoche.setImageResource(item.getIdDrawable());
        nombreCoche.setText(item.getNombre());

        return convertView;
    }
}
