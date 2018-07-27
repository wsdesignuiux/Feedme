package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.wolfsoft2.food7.R;

import java.util.ArrayList;

import model.FavoriteModel;

/**
 * Created by wolfsoft3 on 16/7/18.
 */

public class FavAdapterRecycler extends RecyclerView.Adapter<FavAdapterRecycler.ViewHolder> {

    private Context context;
    private ArrayList<FavoriteModel> modelRecyclerArrayList;

    public FavAdapterRecycler(Context context, ArrayList<FavoriteModel> modelRecyclerArrayList) {
        this.context = context;
        this.modelRecyclerArrayList = modelRecyclerArrayList;
    }

    @Override
    public FavAdapterRecycler.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_favorites,parent,false);

        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FavAdapterRecycler.ViewHolder holder, int position) {
        holder.textrecycler.setText(modelRecyclerArrayList.get(position).getTxt1());
        holder.txt2.setText(modelRecyclerArrayList.get(position).getTxt2());
        holder.txt3.setText(modelRecyclerArrayList.get(position).getTxt3());

//        Glide.with(context)
//                .load(modelRecyclerArrayList.get(position).getImage())
//                .into(holder.img);
        holder.img.setImageResource(modelRecyclerArrayList.get(position).getImage());


    }

    @Override
    public int getItemCount() {
        return modelRecyclerArrayList.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textrecycler,txt2,txt3;
        ImageView img;
        public ViewHolder(View itemView) {
            super(itemView);
            textrecycler = itemView.findViewById(R.id.textrecycler);
            txt2 = itemView.findViewById(R.id.textrecycler1);
            txt3 = itemView.findViewById(R.id.textrecycler2);
            img = itemView.findViewById(R.id.img1);





        }
    }
}
