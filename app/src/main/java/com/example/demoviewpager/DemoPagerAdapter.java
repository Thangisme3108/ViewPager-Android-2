package com.example.demoviewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;

public class DemoPagerAdapter extends FragmentStateAdapter {
    int soLuong_tab = 2; // có thể thay đổi tuỳ số lượng fragment

    Frag111 frag111;
    Frag222 frag222;

    public DemoPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
        frag111 = new Frag111();
        frag222 = new Frag222();
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return frag111;
            case 1: return frag222;
            default: return frag111;
        }
    }

    @Override
    public int getItemCount() {
        return soLuong_tab;
    }
}
