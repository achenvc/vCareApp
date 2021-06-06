package com.chenangela.vcare.ui.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.widget.Button;

import com.chenangela.vcare.R;

public class SettingsFragment extends Fragment {

    private SettingsViewModel settingsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        settingsViewModel = ViewModelProviders.of(this).get(SettingsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_settings, container, false);

        /*Button accInfoButton = root.findViewById(R.id.next_acc_info);
        Button notificationsButton = root.findViewById(R.id.next_notifications);
        Button colorThemeButton = root.findViewById(R.id.next_color_theme);*/

        /*accInfoButton.setOnClickListener(this);      uncomment here!!!!!!!!!!!!!!!!!!!!!
        notificationsButton.setOnClickListener(this);
        colorThemeButton.setOnClickListener(this);*/

        /*final TextView textView = root.findViewById(R.id.text_settings);
        settingsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }
/*  uncomment here!!!!!!!!!!!!!!!!!!!!!
    @Override
    public void onClick(View view) {
        Fragment fragment = null;
        switch (view.getId()) {
            case R.id.next_acc_info:
                fragment = new SettingsAccountFragment();
                replaceFragment(fragment);
                break;

            case R.id.next_notifications:
                fragment = new SettingsNotifications();
                replaceFragment(fragment);
                break;

            case R.id.next_color_theme:
                fragment = new SettingsColorTheme();
                replaceFragment(fragment);
                break;
        }
    }

    public void replaceFragment(Fragment someFragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, someFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }*/

}