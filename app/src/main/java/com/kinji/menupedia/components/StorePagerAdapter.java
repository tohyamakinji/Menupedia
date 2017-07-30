package com.kinji.menupedia.components;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.kinji.menupedia.R;

import java.util.List;

public class StorePagerAdapter extends PagerAdapter {

    private List<Bitmap> bitmapsStore;
    private Context context;

    StorePagerAdapter(Context context, List<Bitmap> bitmapsStore) {
        this.bitmapsStore = bitmapsStore;
        this.context = context;
    }

    @Override
    public int getCount() {
        return bitmapsStore.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.inflate_store_pager, container, false);
        ImageView storeImage = view.findViewById(R.id.inflateStore_image);
        storeImage.setImageBitmap(bitmapsStore.get(position));
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}