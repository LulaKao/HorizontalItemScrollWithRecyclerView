package com.quarterlife.horizontalitemscrollwithrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<ItemIconModel> iconList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initial view
        recyclerView = findViewById(R.id.recyclerView);

        loadIcon();
    }

    private void loadIcon() {
        // add data
        iconList.add(new ItemIconModel(R.drawable.item_1,"item"));
        iconList.add(new ItemIconModel(R.drawable.item_2,"item"));
        iconList.add(new ItemIconModel(R.drawable.item_3,"item"));
        iconList.add(new ItemIconModel(R.drawable.item_4,"item"));
        iconList.add(new ItemIconModel(R.drawable.item_5,"item"));
        iconList.add(new ItemIconModel(R.drawable.item_6,"item"));
        iconList.add(new ItemIconModel(R.drawable.item_7,"item"));
        iconList.add(new ItemIconModel(R.drawable.item_1,"item"));
        iconList.add(new ItemIconModel(R.drawable.item_2,"item"));
        iconList.add(new ItemIconModel(R.drawable.item_3,"item"));
        iconList.add(new ItemIconModel(R.drawable.item_4,"item"));
        iconList.add(new ItemIconModel(R.drawable.item_5,"item"));
        iconList.add(new ItemIconModel(R.drawable.item_6,"item"));
        iconList.add(new ItemIconModel(R.drawable.item_7,"item"));

        // set recyclerView
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL); // set orientation
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new ItemIconAdapter(iconList, MainActivity.this));
    }
}