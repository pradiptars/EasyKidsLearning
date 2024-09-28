package com.sikder.kidslearning;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter1 extends FragmentStateAdapter {
    public ViewPagerAdapter1(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new BigFragment();
            case 1:
                return new SmallFragment();
            default:
                return new BigFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}