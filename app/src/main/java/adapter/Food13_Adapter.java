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

import model.Food13_Model;

public class Food13_Adapter extends RecyclerView.Adapter<Food13_Adapter.ViewHolder> {

    private Context context;
    private ArrayList<Food13_Model> modelArrayList;

    public Food13_Adapter(Context context, ArrayList<Food13_Model> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food13_items, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Food13_Model food13_model = modelArrayList.get(position);

        holder.Food13_RestaurantName_Id.setText(food13_model.getFood13_RestaurantName_Id());
        holder.Food13_Address_Id.setText(food13_model.getFood13_Address_Id());

        holder.Food_13_Image_Id.setImageResource(food13_model.getFood_13_Image_Id());



    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView Food13_RestaurantName_Id, Food13_Address_Id;
        ImageView Food_13_Image_Id;

        public ViewHolder(View itemView) {
            super(itemView);

            Food13_RestaurantName_Id = itemView.findViewById(R.id.Food13_RestaurantName_Id);
            Food13_Address_Id = itemView.findViewById(R.id.Food13_Address_Id);

            Food_13_Image_Id = itemView.findViewById(R.id.Food_13_Image_Id);
        }
    }
}
