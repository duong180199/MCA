package com.example.mangaapp.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mangaapp.R;
import com.example.mangaapp.databinding.FragmentMangaCategoryBinding;


public class MangaCategoryFragment extends Fragment {
    private FragmentMangaCategoryBinding binding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_manga_category,container,false);
        binding.setLifecycleOwner(this);
        return binding.getRoot();
    }
}