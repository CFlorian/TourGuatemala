package blacksoul.gt.tourguatemala.adaptadores;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import blacksoul.gt.tourguatemala.vista.fragmentos.FragmentGeneral;
import blacksoul.gt.tourguatemala.vista.fragmentos.FragmentSitiosPrincipales;
import blacksoul.gt.tourguatemala.vista.fragmentos.FragmentTransporte;

public class MainAdapter extends FragmentStatePagerAdapter {

    private static final int NUMEROFRAGMENTOS = 3;

    public MainAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FragmentSitiosPrincipales();
            case 1:
                return new FragmentGeneral();
            case 2:
                return new FragmentTransporte();
            default:
                return null;
        }
    }

    // This method return the titles for the Tabs in the Tab Strip

    @Override
    public CharSequence getPageTitle(int position) {
        return null;
    }

    // This method return the Number of tabs for the tabs Strip

    @Override
    public int getCount() {
        return NUMEROFRAGMENTOS;
    }




}