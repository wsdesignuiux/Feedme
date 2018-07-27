package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.wolfsoft2.food7.R;

import java.util.ArrayList;

import model.AllcategoriesModel;

/**
 * Created by wolfsoft4 on 17/7/18.
 */

public class AllcategoriesAdapter extends RecyclerView.Adapter<AllcategoriesAdapter.ViewHolder>{
   private Context context;
    private ArrayList<AllcategoriesModel> allcategoriesModelArrayList;


    @NonNull
    @Override
    public AllcategoriesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.starters,parent,false);
        return new AllcategoriesAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllcategoriesAdapter.ViewHolder holder, int position) {
        AllcategoriesModel arraylists=allcategoriesModelArrayList.get(position);

        holder.itemname.setText(arraylists.getItemname());
        holder.itemprice.setText(arraylists.getItemprice());

        holder.foodimg1.setImageResource(arraylists.getFoodimg1());

    }

    @Override
    public int getItemCount()
    {
        return allcategoriesModelArrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView foodimg1;
        TextView itemname,itemprice;
        public ViewHolder(View view) {
            super(view);

            itemname=(TextView)view.findViewById(R.id.itemname);
            itemprice=(TextView)view.findViewById(R.id.itemprice);
            foodimg1=(ImageView)view.findViewById(R.id.foodimg1);
        }
    }

    public AllcategoriesAdapter(Context mainActivityContacts, ArrayList<AllcategoriesModel> allcategoriesModelArrayList) {
        this.allcategoriesModelArrayList = allcategoriesModelArrayList;
        this.context = mainActivityContacts;
    }

}



