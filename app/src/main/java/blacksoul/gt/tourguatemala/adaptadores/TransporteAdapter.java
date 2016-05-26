package blacksoul.gt.tourguatemala.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import blacksoul.gt.tourguatemala.R;
import blacksoul.gt.tourguatemala.modelo.Transporte;

/**
 * Created by GT on 24/05/2016.
 */
public class TransporteAdapter extends BaseAdapter {

    private Context context;
    public TransporteAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return Transporte.ITEMS.length;
    }

    @Override
    public Object getItem(int position) {
        return Transporte.ITEMS[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.grid_item, parent, false);
        }
        ImageView imagenLugar = (ImageView) convertView.findViewById(R.id.imagen_coche);
        TextView nombreLugar = (TextView) convertView.findViewById(R.id.nombre_coche);

        final Transporte item = (Transporte)getItem(position);
        imagenLugar.setImageResource(item.getIdDrawable());
        nombreLugar.setText(item.getNombre());
        return convertView;
    }
}
