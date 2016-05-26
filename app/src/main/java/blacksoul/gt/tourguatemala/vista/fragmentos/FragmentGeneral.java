package blacksoul.gt.tourguatemala.vista.fragmentos;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import blacksoul.gt.tourguatemala.R;
import blacksoul.gt.tourguatemala.adaptadores.TodoAdapter;
import blacksoul.gt.tourguatemala.modelo.Todo;

public class FragmentGeneral extends Fragment {

    private GridView gridLayout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_general,container,false);
        TodoAdapter categoria = new TodoAdapter(getContext());
        gridLayout = (GridView)view.findViewById(R.id.grid2);
        gridLayout.setAdapter(categoria);
        return  view;
    }


    /**

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBottomBar = BottomBar.attach(getActivity(), savedInstanceState);
        mBottomBar.setItemsFromMenu(R.menu.bottombar_menu, new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int menuItemId) {
                if (menuItemId == R.id.bottomBarItemOne) {
                }
            }

            @Override
            public void onMenuTabReSelected(@IdRes int menuItemId) {
                if (menuItemId == R.id.bottomBarItemOne) {
                    // The user reselected item number one, scroll your content to top.
                }
            }
        });

        // Setting colors for different tabs when there's more than three of them.
        // You can set colors for tabs in three different ways as shown below.
        //mBottomBar.mapColorForTab(0, ContextCompat.getColor(getActivity(), R.color.colorAccent));
        //mBottomBar.mapColorForTab(1, R.color.colorPrimaryDark);
        //mBottomBar.mapColorForTab(2, R.color.tabsScrollColor);
        //mBottomBar.mapColorForTab(3, R.color.bb_darkBackgroundColor);


    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Necessary to restore the BottomBar's state, otherwise we would
        // lose the current tab on orientation change.
        mBottomBar.onSaveInstanceState(outState);
    }
    */

}
