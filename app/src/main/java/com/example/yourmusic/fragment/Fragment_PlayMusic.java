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

public class Fragment_PlayMusic extends Fragment {
    private Context context;

    public Fragment_PlayMusic(Context context) {
        this.context = context;
    }

    public Fragment_PlayMusic(int contentLayoutId, Context context) {
        super(contentLayoutId);
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View listplay = LayoutInflater.from(context).inflate(R.layout.activity_list_playsong,container,false);

        return listplay;
    }
}
