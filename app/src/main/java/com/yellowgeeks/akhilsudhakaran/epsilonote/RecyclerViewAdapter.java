package com.yellowgeeks.akhilsudhakaran.epsilonote;

/**
 * Created by Akhil Sudhakar on 24-07-2016.
 */
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class RecyclerViewAdapter  extends RecyclerView.Adapter<ViewHolders> {

    private List<ItemObjects> itemList;
    private Context context;

    public RecyclerViewAdapter(Context context, List<ItemObjects> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public ViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.solvent_list, null);
        ViewHolders rcv = new ViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(ViewHolders holder, int position) {
        holder.countryName.setText(itemList.get(position).getName());
        holder.countryPhoto.setImageResource(itemList.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
