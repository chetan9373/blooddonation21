package com.harsh1310.rakkktcharitr;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class faqfrag extends Fragment {
ImageView i1,i2,i3,i4;
    public faqfrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview=inflater.inflate(R.layout.fragment_faqfrag, container, false);
         i1=rootview.findViewById(R.id.p1);
        i2=rootview.findViewById(R.id.p2);
        i3=rootview.findViewById(R.id.p3);
        i4=rootview.findViewById(R.id.p4);
        rootview.setFocusableInTouchMode(true);
        rootview.requestFocus();

        rootview.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN) {
                    if (keyCode == KeyEvent.KEYCODE_BACK) {
                        startActivity(new Intent(getActivity(), MainActivity.class));
                        getActivity().finish();

                        return true;
                    }
                }
                return false;
            }
        });
              return rootview;
    }
}