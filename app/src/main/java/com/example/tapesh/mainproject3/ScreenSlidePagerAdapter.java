package com.example.tapesh.mainproject3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by TAPESH on 4/17/2016.
 */
public class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
    public ScreenSlidePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        final Bundle bundle = new Bundle();
        bundle.putInt(SlideFragment.EXTRA_POSITION, position);
        final SlideFragment fragment = new SlideFragment();
        fragment.setArguments(bundle);

        return fragment;
    }

    @Override
    public int getCount() {
       //
        return 5;
    }

}
