package com.valerie.customlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Hero> herolist;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        herolist= new ArrayList<>();


        herolist.add(new Hero(R.drawable.spideman, "spideman", "Avengers"));
        herolist.add(new Hero(R.drawable.batman, "batman", "justiceLeague"));
        herolist.add(new Hero(R.drawable.cap,"cap", "Captain America"));
        herolist.add(new Hero(R.drawable.doctorstrange, "doctor", "Doctor strange"));
        herolist.add(new Hero(R.drawable.ironman, "ironman", "Iron Man"));
        herolist.add(new Hero(R.drawable.joker, "joker", "Joker"));




        listView = findViewById(R.id.listview);

        MyCustomListAdapter adapter = new
                MyCustomListAdapter(this, R.layout.my_list_item, herolist);


        listView.setAdapter(adapter);


    }
}
