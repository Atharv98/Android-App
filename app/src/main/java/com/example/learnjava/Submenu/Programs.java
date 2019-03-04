package com.example.learnjava.Submenu;

import android.app.SearchManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.Toolbar;

import com.example.learnjava.Adapters.ProgramlistAdapter;
import com.example.learnjava.Pojo.Programitems;
import com.example.learnjava.R;

import java.util.ArrayList;
import java.util.List;

public class Programs extends AppCompatActivity   {

    String[] programlist={"Hello world","Addition","If Else","While Loop","Do While Loop","For Loop","Switch Case"
            ,"Even or Odd","Large",
            "Prime Number","Palindrome number ","Find Factorial","Factorial using Recursion","Area of Circle","Area Rectangle","Bitwise Additon",
                "GCD &LCM","Leap Year","Armstrong Number","Swapping Two no","Swapping without 3rd Variable","Floyd Triangle","Pascal Triangle","Binary to Decimal","Decimal to Binary","Decimal to Hex","Decimal to Octal","Hex to Decimal",
                "Octal to Decimal","Constructor Example","Thread Example","User Defined Exception","Palindrome String","String Change Case",
                "String Length","String Compare","String Concat","String Reverse","String Trim","Remove Vowels","String Remove Char","Reverse String Array","Char Array to string ",
    "Largest and Smallest","Average of Array","Array Copy","Delete element from Array","2D Array example","Matrix multiplication","Matrix Tranpose",
    "Interface example","Linear search","Binary search","Bubble sort","Selection sort","Insertion sort","Quick sort","Merge sort","Multiple catch","Create File",
    "Create Directory","List contents of directory","Delete directory","Last Modification Time","Date time","Display IP address"};

   ArrayList<Programitems> programitems=new ArrayList<>();
    ArrayList<Programitems> programitemsfiltered =new ArrayList<>();
    int i;
    Programitems[] prog=new Programitems[100];


    SearchView searchView;
    RecyclerView mrecyclerView;
    RecyclerView.LayoutManager mlayoutManager;
    ProgramlistAdapter programlistAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);

        mrecyclerView=findViewById(R.id.idrecyclerprograms);
        mlayoutManager =new LinearLayoutManager(this);
        mrecyclerView.setLayoutManager(mlayoutManager);


        for(i=0;i<programlist.length;i++)
        {
            Programitems programitems1  = new Programitems();           //Adding and Setting Item

            programitems1.setProgramname(programlist[i]);
            programitems.add(programitems1);

        }




        ProgramlistAdapter programlistAdapter = new ProgramlistAdapter(Programs.this,programitems);
        mrecyclerView.setAdapter(programlistAdapter);




    }




 /*   @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {

        String userInput = s.toLowerCase();
        List<Programitems>  newlist = new ArrayList<>();


        for (Programitems row : programitems)
        {
            if (row.getProgramname().toLowerCase().contains(userInput))
            {
                    newlist.add(row);
            }
        }
        programlistAdapter.updatelist(newlist);
        return true;
    }
    */

  /*  @Override    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search, menu);
        final MenuItem myActionMenuItem = menu.findItem(R.id.menu_search);
        searchView = (SearchView) myActionMenuItem.getActionView();
        ((EditText) searchView.findViewById(
                android.support.v7.appcompat.R.id.search_src_text)).
                setHintTextColor(getResources().getColor(R.color.white));
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override            public boolean onQueryTextSubmit(String query) {
                if (!searchView.isIconified()) {
                    searchView.setIconified(true);
                }
                myActionMenuItem.collapseActionView();
                return false;
            }
            @Override            public boolean onQueryTextChange(String newText) {
                final  List<Programitems> filtermodelist=filter(programitems,newText);
                programlistAdapter.setfilter(filtermodelist);
                return true;
            }
        });
        return true;
    }
    private List<Programitems> filter(List<Programitems> pl,String query)
    {
        query=query.toLowerCase();
        final List<Programitems> filteredModeList=new ArrayList<>();
        for (Programitems model:pl)
        {
            final String text=model.getProgramname().toLowerCase();
            if (text.startsWith(query))
            {
                filteredModeList.add(model);
            }
        }
        return filteredModeList;
    }
    */
}
