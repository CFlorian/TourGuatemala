package blacksoul.gt.tourguatemala.modelo;

import blacksoul.gt.tourguatemala.R;

/**
 * Created by GT on 24/05/2016.
 */
public class Transporte {

    private String nombre;
    private int idDrawable;
    public Transporte(String nombre, int idDrawable) {
        this.nombre = nombre;
        this.idDrawable = idDrawable;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    public int getId() {
        return nombre.hashCode();
    }

    public static Transporte[] ITEMS = {
            new Transporte("Guatemala-Atitlan", R.mipmap.transporte),
            new Transporte("Guatemala-Antigua", R.mipmap.transporte),
            new Transporte("Guatemala-Tikal", R.mipmap.transporte),
            new Transporte("Guatemala-Pacaya", R.mipmap.transporte),
            new Transporte("Guatemala-Puerto", R.mipmap.transporte),
            new Transporte("Guatemala-Semuc Champey", R.mipmap.transporte),
    };

    public static Transporte getItem(int id) {
        for (Transporte item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
