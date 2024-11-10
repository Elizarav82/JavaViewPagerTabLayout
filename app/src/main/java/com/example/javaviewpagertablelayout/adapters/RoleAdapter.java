package com.example.javaviewpagertablelayout.adapters;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.javaviewpagertablelayout.models.Role;
import com.example.javaviewpagertablelayout.ui.ViewPagerFragment;

import java.util.List;

public class RoleAdapter extends FragmentStateAdapter {
    private final List<Role> roleList;

    public RoleAdapter(@NonNull FragmentActivity fragment, List<Role> roleList) {
        super(fragment);
        this.roleList = roleList;
    }

    @Override
    public int getItemCount() {
        return roleList.size();
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        ViewPagerFragment fragment = new ViewPagerFragment();
        Bundle args = new Bundle();
        args.putSerializable("roleList", roleList.get(position));
        fragment.setArguments(args);
        return fragment;
    }
}


