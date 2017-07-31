package com.kinji.menupedia;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.widget.ListView;
import android.widget.TextView;
import com.kinji.menupedia.components.HomeListAdapter;
import com.kinji.menupedia.components.StoreAdapter;
import com.kinji.menupedia.components.StoreDecorator;
import com.kinji.menupedia.data.Store;

import java.util.ArrayList;
import java.util.List;

public class Home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_home);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title_bar);
        final TextView title = findViewById(R.id.custom_title);
        title.setText(R.string.home_title);
        RecyclerView storeView = findViewById(R.id.home_recyclerView);
        storeView.setHasFixedSize(true);
        storeView.setLayoutManager(new LinearLayoutManager(this));
        storeView.addItemDecoration(new StoreDecorator(20));
        List<Bitmap> storesBitmap;
        List<Store> stores = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            storesBitmap = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                storesBitmap.add(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
            }
            stores.add(new Store("Rumah Kayu", "Jln. Gigi Gajah sekitar Bunderan Gajah", storesBitmap));
        }
        RecyclerView.Adapter storesAdapter = new StoreAdapter(stores, this);
        storeView.setAdapter(storesAdapter);
        // DRAWER LAYOUT
        String[] strings = getResources().getStringArray(R.array.drawer_item);
        ListView drawerItem = findViewById(R.id.home_listDrawer);
        drawerItem.setAdapter(new HomeListAdapter(this, R.layout.inflate_drawer_list, R.id.inflateDrawer_item, strings));
    }
}