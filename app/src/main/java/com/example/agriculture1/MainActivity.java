package com.example.agriculture1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
GridView gridView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.grid);

        List<Integer> images=new ArrayList<>();
        List<String> names=new ArrayList<>();
       images.add(R.drawable.agro1);
        images.add(R.drawable.agro4);
        images.add(R.drawable.agro3);
        images.add(R.drawable.agro);


        names.add("Rice");
        names.add("Apples");
        names.add("Wheat");
        names.add("Tomato");

        cropAdapter adapter=new cropAdapter(this,images,names);
        gridView.setAdapter(adapter);

}
}
