package com.example.makeupapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class Dashboard extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;
    private List<Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialisation de la liste des articles
        itemList = new ArrayList<>();
        itemList.add(new Item("Mascara", 20.0, R.drawable.mascara));
        itemList.add(new Item("Rouge ", 15.0, R.drawable.rouge));
        itemList.add(new Item("fond", 25.0, R.drawable.fond));
        itemList.add(new Item("Blush", 35.0, R.drawable.blush));
        itemList.add(new Item("Poudre", 40.0, R.drawable.poudre));
        itemList.add(new Item("Pinceau", 45.0, R.drawable.pinco));


        // Initialise l'adaptateur avec la liste des articles
        itemAdapter = new ItemAdapter(itemList);
        recyclerView.setAdapter(itemAdapter);
    }
}
