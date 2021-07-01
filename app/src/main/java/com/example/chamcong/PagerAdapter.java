package com.example.chamcong;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    PagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }
    @Override
    public Fragment getItem(int position) {
        Fragment frag = null;
        switch (position){
            case 0:
                frag = new LichSuChamCongNgayFragment();
                break;
            case 1:
                frag = new LichSuChamCongTuanFragment();
                break;
            case 2:
                frag = new LichSuChamCongThangFragment();
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = "NGÀY";
                break;
            case 1:
                title = "TUẦN";
                break;
            case 2:
                title = "THÁNG";
                break;
        }
        return title;
    }
}