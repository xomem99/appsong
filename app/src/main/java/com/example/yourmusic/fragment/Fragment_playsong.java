package com.example.yourmusic.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.yourmusic.R;

public class Fragment_playsong extends Fragment {
    private Context context;

    public Fragment_playsong(Context context) {
        this.context = context;
    }

    public Fragment_playsong(int contentLayoutId, Context context) {
        super(contentLayoutId);
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View playsong = LayoutInflater.from(context).inflate(R.layout.activity_play_song,container,false);
        return playsong;
    }
}
