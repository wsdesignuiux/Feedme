package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.example.wolfsoft2.food7.R;

import java.util.List;

import model.ReviewsModel;

/**
 * Created by wolfsoft3 on 18/7/18.
 */

public class ReviewsAdapter extends RecyclerView.Adapter<ReviewsAdapter.MyViewHolder> {

        Context context;
        private List<ReviewsModel> modelRecyclerFood14List;

        @Override
        public ReviewsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_reviews, parent, false);

                return new ReviewsAdapter.MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ReviewsAdapter.MyViewHolder holder, int position) {
                ReviewsModel modelfoodrecycler = modelRecyclerFood14List.get(position);

                holder.foodtext1.setText(modelfoodrecycler.getFoodtext1());
                holder.foodtext2.setText(modelfoodrecycler.getFoodtext2());
                holder.foodtext3.setText(modelfoodrecycler.getFoodtext3());
                //holder.foodtext4.setText(modelfoodrecycler.getFoodtext4());

                holder.circleviewimg1.setImageResource(modelfoodrecycler.getCircleviewimg1());
                holder.foodimg1.setImageResource(modelfoodrecycler.getFoodimg1());
                holder.foodimg2.setImageResource(modelfoodrecycler.getFoodimg1());
                holder.foodimg3.setImageResource(modelfoodrecycler.getFoodimg1());
                holder.foodimg4.setImageResource(modelfoodrecycler.getFoodimg1());

                if(position==1){
                        holder.ll1.setVisibility(View.VISIBLE);
                }
                else {
                        holder.ll1.setVisibility(View.GONE);
                }

        }

        @Override
        public int getItemCount() {
                return modelRecyclerFood14List.size();
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {
                TextView foodtext1, foodtext2, foodtext3, foodtext4;
                ImageView circleviewimg1, foodimg1, foodimg2, foodimg3, foodimg4;
                LinearLayout ll1;

                public MyViewHolder(View itemView) {
                        super(itemView);
                        foodtext1 = itemView.findViewById(R.id.foodtext1);
                        foodtext2 = itemView.findViewById(R.id.foodtext2);
                        foodtext3 = itemView.findViewById(R.id.foodtext3);
                       // foodtext4 = itemView.findViewById(R.id.foodtext4);
                        circleviewimg1 = itemView.findViewById(R.id.circleviewimg1);
                        foodimg1 = itemView.findViewById(R.id.foodimg1);
                        foodimg2 = itemView.findViewById(R.id.foodimg2);
                        foodimg3 = itemView.findViewById(R.id.foodimg3);
                        foodimg4 = itemView.findViewById(R.id.foodimg4);
                        ll1=itemView.findViewById(R.id.ll1);
                }
        }

        public ReviewsAdapter(Context mainActivityContacts, List<ReviewsModel> offerList) {
                this.modelRecyclerFood14List = offerList;
                this.context = mainActivityContacts;
        }
}
