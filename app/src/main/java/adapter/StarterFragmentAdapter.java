package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import fragment.Dessert;
import fragment.Mains;
import fragment.Sides;
import fragment.Starters;

/**
 * Created by wolfsoft4 on 18/7/18.
 */

public class StarterFragmentAdapter extends FragmentStatePagerAdapter {
    int mNumofTabs;

    public StarterFragmentAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.mNumofTabs = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Starters tab1 = new Starters();
                return tab1;

            case 1:
                Mains tab2 = new Mains();
                return tab2;

            case 2:
                Sides tab3 = new Sides();
                return tab3;

            case 3:
                Dessert tab4 = new Dessert();
                return tab4;

            default:
                return null;
        }
    }
        @Override
        public int getCount()

        { return mNumofTabs;}

}
