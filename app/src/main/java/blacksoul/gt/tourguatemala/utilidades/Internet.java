package blacksoul.gt.tourguatemala.utilidades;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

public class Internet  {

    /**
     * Método para consultar la conexión a internet
     * @param context El contexto desde donde se consulta
     * @return verdadero si hay conexión
     */
    public static boolean isNetworkAvailable(Context context) {
        boolean connected = false;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context
                    .getSystemService(Context.CONNECTIVITY_SERVICE);

            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            connected = networkInfo != null && networkInfo.isAvailable() && networkInfo.isConnected();
            return connected;
        } catch (Exception e) {
            Log.i("Colazo", "isNetworkAvailable: false:" + e.toString());
        }
        return connected;
    }

}
