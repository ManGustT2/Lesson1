package com.example.hp.lesson1.structure.base;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.example.hp.lesson1.R;

import java.util.List;

public abstract class BaseRecyclerViewAdapter<T> extends RecyclerView.Adapter<BaseRecyclerViewAdapter.ViewHolder> {
    private List<T> list;

    public BaseRecyclerViewAdapter(List<T> list){
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lesson_number, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView lesson;
        public TextView number;
        public LinearLayout linearLayout;

       public ViewHolder(View itemView) {
           super(itemView);
           lesson = (TextView) itemView.findViewById(R.id.lesson);
           lesson = (TextView) itemView.findViewById(R.id.number);
           linearLayout = (LinearLayout) itemView.findViewById(R.id.ItemContainer);
       }
   }
}
