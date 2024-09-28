package com.sikder.kidslearning;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;



public class ViewPagerAdpter2 extends FragmentStateAdapter {
    public ViewPagerAdpter2(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new Kobita_1Fragment();
            case 1:
                return new Kobita_2Fragment();
            case 2:
                return new Kobita_3Fragment();
            case 3:
                return new Kobita_4Fragment();
            case 4:
                return new Kobita_5Fragment();
            default:
                return new Kobita_1Fragment();
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
