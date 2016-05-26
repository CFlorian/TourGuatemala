package blacksoul.gt.tourguatemala.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import blacksoul.gt.tourguatemala.R;
import blacksoul.gt.tourguatemala.modelo.Todo;

/**
 * Created by GT on 15/05/2016.
 */
public class TodoAdapter extends BaseAdapter {

    private Context context;
    public TodoAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return Todo.ITEMS.length;
    }

    @Override
    public Object getItem(int position) {
        return Todo.ITEMS[position];
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
            convertView = inflater.inflate(R.layout.grid_item_todo, parent, false);
        }

        ImageView imagenLugar = (ImageView) convertView.findViewById(R.id.imagen_coche2);
        TextView nombreLugar = (TextView) convertView.findViewById(R.id.nombre_coche2);

        final Todo item = (Todo)getItem(position);
        imagenLugar.setImageResource(item.getIdDrawable());
        nombreLugar.setText(item.getNombre());
        return convertView;
    }
}
