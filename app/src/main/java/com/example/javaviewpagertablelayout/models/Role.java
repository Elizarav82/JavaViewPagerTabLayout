package com.example.javaviewpagertablelayout.models;

import com.example.javaviewpagertablelayout.R;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Role implements Serializable {
    private String name;
    private int image;

    public Role(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public static List<Role> roles = Arrays.asList(
            new Role("Инженер", R.drawable.ic_engineer),
            new Role("Конструктор", R.drawable.ic_constructor),
            new Role("Технолог", R.drawable.ic_technologist),
            new Role("Энергетик", R.drawable.ic_energy)
    );
}


