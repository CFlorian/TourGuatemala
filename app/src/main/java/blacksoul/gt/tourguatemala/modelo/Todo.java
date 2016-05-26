package blacksoul.gt.tourguatemala.modelo;

import blacksoul.gt.tourguatemala.R;

/**
 * Created by GT on 15/05/2016.
 */
public class Todo {

    private String nombre;
    private int idDrawable;
    public Todo(String nombre, int idDrawable) {
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

    public static Todo[] ITEMS = {
            new Todo("Sitios Arquelogicos", R.mipmap.arquologico),
            new Todo("Reservas Naturales", R.mipmap.reserva),
            new Todo("Lagos o Lagunas", R.mipmap.lago),
            new Todo("Montañas o Volcanes", R.mipmap.volcan),
            new Todo("Playas o Rios", R.mipmap.puerto_jose),
            new Todo("Parques Ecologicos", R.mipmap.parque),
            new Todo("Varios", R.mipmap.varios),

    };

    /**
     * Obtiene item basado en su identificador
     *
     * @param id identificador
     *
     */
    public static Todo getItem(int id) {
        for (Todo item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
