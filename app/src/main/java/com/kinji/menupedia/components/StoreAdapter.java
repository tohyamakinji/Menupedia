package com.kinji.menupedia.components;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.kinji.menupedia.R;
import com.kinji.menupedia.data.Store;

import java.util.List;

public class StoreAdapter extends RecyclerView.Adapter<StoreAdapter.ViewHolder> {

    private List<Store> stores;

    public StoreAdapter(List<Store> stores) {
        this.stores = stores;
    }

    @Override
    public StoreAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.inflate_store_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(StoreAdapter.ViewHolder holder, int position) {
        holder.storeName.setText(stores.get(position).getName());
        holder.storeName.setText(stores.get(position).getAddress());
    }

    @Override
    public int getItemCount() {
        return stores.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView storeName, storeAddress;
        Button explore;

        ViewHolder(View itemView) {
            super(itemView);
            storeName = itemView.findViewById(R.id.inflateStore_name);
            storeAddress = itemView.findViewById(R.id.inflateStore_address);
            explore = itemView.findViewById(R.id.inflateStore_explore);
        }
    }
}