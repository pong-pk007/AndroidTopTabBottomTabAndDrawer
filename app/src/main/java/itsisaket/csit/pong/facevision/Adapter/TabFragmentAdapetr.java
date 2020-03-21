package itsisaket.csit.pong.facevision.Adapter;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import itsisaket.csit.pong.facevision.Fragment.AddNewClassFragment;
import itsisaket.csit.pong.facevision.Fragment.PeopleFragment;

public class TabFragmentAdapetr extends FragmentPagerAdapter {

    private Context context;

    public TabFragmentAdapetr(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }


    @Override
    public Fragment getItem(int position) {
        if(position == 0)
            return PeopleFragment.getInstance();
        else if (position == 1)
            return AddNewClassFragment.getInstance();
        else
            return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:
                return "People List";

            case 1:
                return "Add New People";

        }
        return "";
    }
}
