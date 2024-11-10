package com.example.javaviewpagertablelayout.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.javaviewpagertablelayout.R;
import com.example.javaviewpagertablelayout.models.Role;

public class ViewPagerFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_view_pager, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView fragmentTV = view.findViewById(R.id.fragmentTV);
        Role viewPagerItem = null;
        if (getArguments() != null) {
            viewPagerItem = (Role) getArguments().getSerializable("roleList");
        }
        if (viewPagerItem != null) {
            fragmentTV.setText(viewPagerItem.getName());
        }
    }
}