package com.example.javaviewpagertablelayout;

import static android.app.PendingIntent.getActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.example.javaviewpagertablelayout.adapters.RoleAdapter;
import com.example.javaviewpagertablelayout.models.Role;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Role> roles = Role.roles;

    private RoleAdapter roleAdapter;
    private ViewPager2 viewPager;
    private TabLayout tabLayout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        roleAdapter = new RoleAdapter(this, roles);
        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(roleAdapter);

        tabLayout = findViewById(R.id.tabLayout);
        TabLayoutMediator layoutMediator = new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            String roleName = roles.get(position).getName();
//            tab.setText(roleName);
            tab.setIcon(roles.get(position).getImage());
        });
        layoutMediator.attach();
    }
}