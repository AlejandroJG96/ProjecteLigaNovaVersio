package com.example.danielmartinezg1.ligasantander;

import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.TextView;

        import com.example.danielmartinezg1.ligasantander.NavigationDrawerActivity;
        import com.example.danielmartinezg1.ligasantander.R;

        public class BlankFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_blank, container, false);

        ((NavigationDrawerActivity) getActivity()).getSupportActionBar().setTitle("Partidos");



        return view;
    }

}