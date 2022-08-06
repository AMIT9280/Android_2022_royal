package com.hw_login_page.Activitys;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.hw_login_page.fragments.calls_Fragment;
import com.hw_login_page.fragments.chat_Fragment;
import com.hw_login_page.fragments.status_Fragment;

public class MyPagerAdapter extends FragmentStatePagerAdapter {
    int tabCount;
    public MyPagerAdapter(FragmentManager supportFragmentManager, int tabCount) {
        super(supportFragmentManager);
        this.tabCount = tabCount;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                chat_Fragment chat_fragment = new chat_Fragment();
                return chat_fragment ;
            case 1 :
                status_Fragment status_fragment = new status_Fragment();
                return status_fragment ;
            case 2 :
                calls_Fragment call = new calls_Fragment();
                return call ;
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
