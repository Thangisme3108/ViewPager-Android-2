package com.example.demoviewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class FragCollection01 extends Fragment {
    ViewPager2 pager01;
    TabLayout tabLayout01;
    DemoPagerAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_frag_collection, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Ánh xạ
        pager01 = view.findViewById(R.id.pager01);
        tabLayout01 = view.findViewById(R.id.tabLayout01);
        // Tạo adapter
        adapter = new DemoPagerAdapter(this);
        // Gắn adapter cho viewpager
        pager01.setAdapter(adapter);

        // Hiển thị tab
        TabLayoutMediator mediator = new TabLayoutMediator(tabLayout01, pager01, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0:
                        tab.setText("Tab số 1");
                        break;
                    case 1:
                        tab.setText("Tab số 2");
                        tab.setIcon(android.R.drawable.ic_dialog_map);
                        break;
                }
            }
        });
        // Không quên attach
        mediator.attach();
    }
}
