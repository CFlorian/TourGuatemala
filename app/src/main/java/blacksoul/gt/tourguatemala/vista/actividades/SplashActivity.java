package blacksoul.gt.tourguatemala.vista.actividades;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import blacksoul.gt.tourguatemala.R;

/**
 * Created by Usuario
 */


public class SplashActivity extends Activity {

    private static final long TIEMPO = 2500 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    Thread hilo = new Thread(){

        @Override
        public void run() {
            try {

                sleep(TIEMPO);
                Intent intento = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intento);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };


    hilo.start();



    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
