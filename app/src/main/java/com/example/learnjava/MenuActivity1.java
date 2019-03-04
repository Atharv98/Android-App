package com.example.learnjava;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.learnjava.Adapters.MenuAdapter;
import com.example.learnjava.Pojo.Menuitems;

import java.util.ArrayList;

public class MenuActivity1 extends Activity {

    ArrayList<Menuitems> menuitems=new ArrayList<>();

    RecyclerView mrecyclerView;
    RecyclerView.LayoutManager mlayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);


        mrecyclerView=findViewById(R.id.idrecyclermenu);
        mlayoutManager =new LinearLayoutManager(this);
        mrecyclerView.setLayoutManager(mlayoutManager);


        Menuitems menu1= new Menuitems();
        menu1.setContentname("Tutorial");
        menu1.setImage(R.drawable.tutorial);
        menu1.setDecription("Theoretical java");

        Menuitems menu2= new Menuitems();
        menu2.setContentname("Codes");
        menu2.setImage(R.drawable.code);
        menu2.setDecription("Some java programs");

        Menuitems menu3= new Menuitems();
        menu3.setContentname("Important Question");
        menu3.setImage(R.drawable.ques48);
        menu3.setDecription("Prepare for interview");

        Menuitems menu4= new Menuitems();
        menu4.setContentname("Share");
        menu4.setImage(R.drawable.share1);


        Menuitems menu5= new Menuitems();
        menu5.setContentname("Coding Area");
        menu5.setImage(R.drawable.compile);
        menu5.setDecription("Test Using compiler");


        menuitems.add(menu1);
        menuitems.add(menu2);
        menuitems.add(menu3);
        menuitems.add(menu4);
        menuitems.add(menu5);














        MenuAdapter menuAdapter = new MenuAdapter(MenuActivity1.this,menuitems);
        mrecyclerView.setAdapter(menuAdapter);





    }
}
