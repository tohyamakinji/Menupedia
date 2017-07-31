package com.kinji.menupedia.components;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.kinji.menupedia.R;

public class HomeListAdapter extends ArrayAdapter<String> {

    private int[] images = {R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};

    public HomeListAdapter(Context context, int resource, int textViewResourceId, String[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.inflate_drawer_list, parent, false);
            holder = new ViewHolder();
            holder.itemName = convertView.findViewById(R.id.inflateDrawer_item);
            holder.itemImage = convertView.findViewById(R.id.inflateDrawer_image);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.itemImage.setImageResource(images[position]);
        holder.itemName.setText(getItem(position));
        return convertView;
    }

    @Override
    public String getItem(int position) {
        return super.getItem(position);
    }

    private static class ViewHolder {
        TextView itemName;
        ImageView itemImage;
    }
}