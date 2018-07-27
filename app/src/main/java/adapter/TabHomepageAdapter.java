package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import fragment.Nearby;
import fragment.Popular;
import fragment.Recommended;
import fragment.Topreview;

/**
 * Created by wolfsoft3 on 24/7/18.
 */

public class TabHomepageAdapter extends FragmentStatePagerAdapter {
    int numoftabs;

    public TabHomepageAdapter(FragmentManager fm,int  mnumoftabs ) {
        super(fm);
        this.numoftabs = mnumoftabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Nearby tab1 = new Nearby();
                return tab1;

            case 1:
                Popular tab2 = new Popular();
                return tab2;

            case 2:
                Topreview tab3 = new Topreview();
                return tab3;

            case 3:
                Recommended tab4 = new Recommended();
                return tab4;


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
            return numoftabs;
    }
}
