package com.example.learnjava.Submenu;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListView;

import com.example.learnjava.Adapters.ExpandableListAdapter;
import com.example.learnjava.R;
import com.example.learnjava.TutorialView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ActivityTututlit extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mian);



        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);


        // Listview on child click listener
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
               /* Toast.makeText(
                        getApplicationContext(),
                        listDataHeader.get(groupPosition)
                                + " : "
                                + listDataChild.get(
                                listDataHeader.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT)


                        .show();


                        */


                String [] strings = getResources().getStringArray(R.array.tuto_url_list_);
                int pos= childPosition;
                Intent intent = new Intent(ActivityTututlit.this, TutorialView.class);

                intent.putExtra("position",pos);
                intent.putExtra("url",strings[pos]);
                setSharedPref(pos);
                startActivity(intent);
                return false;





            }






        });

    }

    private void setSharedPref(int pos)
    {
        SharedPreferences sharedPreferences = getSharedPreferences("detail", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("position",pos);
        editor.commit();
    }
    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Introduction");
        listDataHeader.add("Setup & Basic Program");
        listDataHeader.add("Variables & Data Types");
        listDataHeader.add("Operators & Expressions");
        listDataHeader.add("Flow Control");
        listDataHeader.add("Classes,Objects & Methods");
        listDataHeader.add("Arrays,String & Vector");
        listDataHeader.add("Interfaces");
        listDataHeader.add("Packages");
        listDataHeader.add("Multithreaded Programming");
        listDataHeader.add("Errors & Exceptions");
        listDataHeader.add("Applets");
        listDataHeader.add("File Management ");



        // Adding child data
        List<String> introduction = new ArrayList<String>();
        introduction.add("1.1 Introduction");
        introduction.add("1.2 Features");
        introduction.add("1.3 Pros & cons");


        List<String> setup = new ArrayList<String>();
        setup.add("2.1 Environmental Setup");
        setup.add("2.3 First Program");


        List<String> variables = new ArrayList<String>();
        variables.add("3.1 Variables ");
        variables.add("3.2 Data Type");
        variables.add("3.3 Variable Scope");
        variables.add("3.4 Typecasting");



        List<String> operators = new ArrayList<String>();
        operators.add("4.1 Operators");
        operators.add("4.2 Expressions");
        operators.add("4.3 Operator Precedence");



        List<String>  flow = new ArrayList<String>();
        flow.add("5.1 If Statement ");
        flow.add("5.2 Switch Statement ");
        flow.add("5.3 While Loop");
        flow.add("5.4 Do While Loop");
        flow.add("5.5 For Loop");



        List<String> classes = new ArrayList<String>();
        classes.add("6.1 Classes Basics");
        classes.add("6.2 Classes Objects");
        classes.add("6.3 Constructors");
        classes.add("6.4 Method Overloading ");
        classes.add("6.5 Method Overriding ");
        classes.add("6.6 Static Keyword");
        classes.add("6.7 Inheritance");
        classes.add("6.8 Types of Inheritance");
        classes.add("6.9 Final Keyword");
        classes.add("6.10 Abstraction");


        List<String> array = new ArrayList<String>();
        array.add("7.1 Arrays ");
        array.add("7.2 String ");
        array.add("7.3 Vectors ");
        array.add("7.4 Wrapper Classes ");

        List<String> interfaces = new ArrayList<String>();
        interfaces.add("8.1 Defining Interfaces ");
        interfaces.add("8.2 Extending Interfaces ");
        interfaces.add("8.3 Implementing Interfaces ");
        interfaces.add("8.4 Accesing Interfaces ");

        List<String> packages = new ArrayList<String>();
        packages.add("9.1 Introduction to Packages  ");
        packages.add("9.2 Java API Package");
        packages.add("9.3 System Package  ");

        List<String> multi = new ArrayList<String>();
        multi.add("10.1 Creating Thread  ");
        multi.add("10.2 Stopping & Blocking");
        multi.add("10.3 Life Cycle  ");
        multi.add("10.4 Exception & Priority  ");
        multi.add("10.5 Synchronisation ");
        multi.add("10.6 Runnable Interface ");

        List<String> error = new ArrayList<String>();
        error.add("11.1 Exceptions  ");
        error.add("11.2 Try Catch");
        error.add("11.3 Custom Exception  ");


        List<String> applets = new ArrayList<String>();
        applets.add("12.1 Introduction  ");
        applets.add("12.2 Life Cycle");
        applets.add("12.3 Creating an Executable Applet  ");
        applets.add("12.4 Designing a Web Page");
        applets.add("12.5 Running an Applet  ");


        List<String> files = new ArrayList<String>();
        files.add("13.1 Stream Classes ");
        files.add("13.2 Byte Stream");
        files.add("13.3 Character Stream  ");
        files.add("13.4 Standard Stream  ");
        files.add("13.5 File ");
        files.add("13.6 Directory  ");











        listDataChild.put(listDataHeader.get(0), introduction); // Header, Child data
        listDataChild.put(listDataHeader.get(1), setup);
        listDataChild.put(listDataHeader.get(2), variables);
        listDataChild.put(listDataHeader.get(3), operators);
        listDataChild.put(listDataHeader.get(4), flow);
        listDataChild.put(listDataHeader.get(5), classes);
        listDataChild.put(listDataHeader.get(6), array);
        listDataChild.put(listDataHeader.get(7), interfaces);
        listDataChild.put(listDataHeader.get(8), packages);
        listDataChild.put(listDataHeader.get(9), multi);
        listDataChild.put(listDataHeader.get(10), error);
        listDataChild.put(listDataHeader.get(11), applets);
        listDataChild.put(listDataHeader.get(12), files);


    }

}
