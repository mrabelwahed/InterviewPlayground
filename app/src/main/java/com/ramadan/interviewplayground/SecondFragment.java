package com.ramadan.interviewplayground;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment {
    final static  String FRAG = "second_fragment";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e(FRAG,"onCreateView");
        return inflater.inflate(R.layout.fragment_first,container,false);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.e(FRAG,"onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(FRAG,"onCreate");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(FRAG,"onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(FRAG,"onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(FRAG,"onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(FRAG,"onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(FRAG,"onStop");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(FRAG,"onDetach");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(FRAG,"onDestroyView");
    }
}
