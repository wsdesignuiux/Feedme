package adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.wolfsoft2.food7.R;

import java.util.ArrayList;

import model.BookatableModel;

/**
 * Created by wolfsoft4 on 24/7/18.
 */

public class BookatableAdapter extends RecyclerView.Adapter<BookatableAdapter.ViewHolder> {

    Context context;
    private ArrayList<BookatableModel> bookATableArrayList;
    int myPos = 0;

    public BookatableAdapter(Context context, ArrayList<BookatableModel> bookATableArrayList) {
        this.context = context;
        this.bookATableArrayList = bookATableArrayList;
    }

    @NonNull
    @Override
    public BookatableAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.bookatableitemview,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull BookatableAdapter.ViewHolder holder, final int position) {
        holder.txttime.setText(bookATableArrayList.get(position).getTxttime());
        if (myPos == position){
            holder.txttime.setTextColor(Color.parseColor("#ffffff"));

            holder.txttime.setBackgroundResource(R.drawable.rectanglebtn);
        }else {

            holder.txttime.setTextColor(Color.parseColor("#000000"));
            holder.txttime.setBackgroundColor(Color.parseColor("#00000000"));
        }


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPos = position;
                notifyDataSetChanged();

            }
        });
    }

    @Override
    public int getItemCount() {
        return bookATableArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txttime;


        public ViewHolder(View itemView) {
            super(itemView);
            txttime=itemView.findViewById(R.id.txttime);

        }
    }
}
