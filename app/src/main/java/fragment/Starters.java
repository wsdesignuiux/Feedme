package fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.wolfsoft2.food7.R;

import java.util.ArrayList;

import adapter.AllcategoriesAdapter;
import model.AllcategoriesModel;


/**
 * Created by wolfsoft4 on 17/7/18.
 */

public class Starters extends Fragment {



            Integer foodimg1[] = {R.drawable.food,R.drawable.food,R.drawable.food,R.drawable.food,R.drawable.food};
            String itemname[] = {"Popcorn Chicken", "Calamari", "Classic Caesar Salad", "Bloody Mary Meatballs", "Halloumi & Pepper Skewers"};
            String itemprice[] = {"$ 50.00", "$ 45.00", "$ 29.00", "$ 35.00", "$15.00"};

            private ArrayList<AllcategoriesModel> allcategoriesModelArrayList;
            private RecyclerView recyclerView;
            private AllcategoriesAdapter allcategoriesAdapter;



            @Nullable
            @Override
            public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
                View view = inflater.inflate(R.layout.fragment_stater, container, false);

                recyclerView=view.findViewById(R.id.recyclerview);
                 RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());

                allcategoriesModelArrayList=new ArrayList<>();
                for (int i = 0; i < foodimg1.length; i++) {
                    AllcategoriesModel item = new AllcategoriesModel(foodimg1[i],itemname[i],itemprice[i]);
                    allcategoriesModelArrayList.add(item);
                }
                allcategoriesAdapter=new AllcategoriesAdapter(getActivity(),allcategoriesModelArrayList);
                    recyclerView.setAdapter(allcategoriesAdapter);
                    return view;


        }
}
