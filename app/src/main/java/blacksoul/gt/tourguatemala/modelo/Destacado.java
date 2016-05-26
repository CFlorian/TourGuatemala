package blacksoul.gt.tourguatemala.modelo;

import blacksoul.gt.tourguatemala.R;

public class Destacado {

    private String nombre;
    private int idDrawable;
    public Destacado(String nombre, int idDrawable) {
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

    public static Destacado[] ITEMS = {
            new Destacado("Lago de Amatitlan", R.mipmap.amatitlan),
            new Destacado("Puerto de San José", R.mipmap.puerto_jose),
            new Destacado("San Marcos la Laguna", R.mipmap.san_marcos),
            new Destacado("Volcan Acatenango", R.mipmap.acate),
            new Destacado("Hobbitenango", R.mipmap.hobbitenango),
            new Destacado("Parque Pino Dulce", R.mipmap.pino_dulce),
            new Destacado("San Juan la Laguna", R.mipmap.san_juan),
            new Destacado("Parque Nacional Tiakl", R.mipmap.tikal),
            new Destacado("San Pedro la Laguna", R.mipmap.san_pedro),
            new Destacado("Parque Zaculeu", R.mipmap.zaculeu),
            new Destacado("Semuc Champey", R.mipmap.semuc),
            new Destacado("Volcan Pacaya", R.mipmap.volcan_pacaya),
            new Destacado("San Pablo la Laguna", R.mipmap.san_pablo),
            new Destacado("Quetzaltenango", R.mipmap.xela),
            new Destacado("Atitlan", R.mipmap.atitlan),
    };

    /**
     * Obtiene item basado en su identificador
     *
     * @param id identificador
     *
     */
    public static Destacado getItem(int id) {
        for (Destacado item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }


}
