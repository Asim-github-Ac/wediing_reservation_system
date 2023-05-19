package com.fyp.e_laboratory.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fyp.e_laboratory.Model.Hotellist;
import com.fyp.e_laboratory.R;
import com.fyp.e_laboratory.UserAdapters.RecyclerViewAdapter;

import java.util.ArrayList;

public class HotelList_fragment extends Fragment {


    public HotelList_fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View  view = inflater.inflate(R.layout.fragment_hotel_list_fragment, container, false);
      gethotellist(view);
        return view;
    }
    private void gethotellist(View view){
        RecyclerView recyclerView;
        recyclerView=view.findViewById(R.id.recycleviewid);
        RecyclerViewAdapter adapter;
        ArrayList<Hotellist> list=new ArrayList<>();
        list.add(new Hotellist(R.drawable.hotelmarque,"Shahroz"));
        list.add(new Hotellist(R.drawable.hotelmarque,"Shahroz"));
        list.add(new Hotellist(R.drawable.hotelmarque,"Shahroz"));
        list.add(new Hotellist(R.drawable.hotelmarque,"Shahroz"));
        adapter=new RecyclerViewAdapter(getContext(),list);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

    }
}