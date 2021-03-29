package com.chenangela.vcare.ui.favorites;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.chenangela.vcare.R;

public class FavoritesFragment extends Fragment {

    private FavoritesViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(FavoritesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_favorites, container, false);
        //final TextView textView = root.findViewById(R.id.text_dashboard);
        //final TextView favorites_title = root.findViewById(R.id.favorites_title);

        /*dashboardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                favorites_title.setText(s);
            }
        });*/
        return root;
    }
}