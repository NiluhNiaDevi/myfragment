package com.f55121058niluhniadevi.myapplication;

import androidx.fragment.app.Fragment;

public interface ViewAdapter {
    int getCount();

    void AddFragment(Fragment fragment, String Title);
}
