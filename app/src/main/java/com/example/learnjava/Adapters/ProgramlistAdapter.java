package com.example.learnjava.Adapters;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.learnjava.Interface.ItemClickListener;
import com.example.learnjava.ProglistUI.Basic;
import com.example.learnjava.Pojo.Programitems;
import com.example.learnjava.R;
import com.example.learnjava.Submenu.Programs;

import java.util.ArrayList;
import java.util.List;

import static android.content.Context.MODE_PRIVATE;

public class ProgramlistAdapter extends RecyclerView.Adapter<ProgramlistAdapter.MyViewHolder>  {


    Programs programs;
    private ArrayList<Programitems> programitems;
   private ArrayList<Programitems> programitemsfiltered;


    public ProgramlistAdapter(Programs programs, ArrayList<Programitems> programitems) {

        this.programs= programs;
        this.programitems=programitems;
        this.programitemsfiltered=programitems;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(programs).inflate(R.layout.proglist,viewGroup,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, final int i) {

        TextView programname = myViewHolder.programs;


        programname.setText(programitems.get(i).getProgramname());





        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String [] strings = programs.getResources().getStringArray(R.array.url_list);
                Intent intent = new Intent(programs, Basic.class);

                intent.putExtra("position",i);
                intent.putExtra("url",strings[i]);
                setSharedPref(i);

                programs.startActivity(intent);

            }
        });

    }




    public class MyViewHolder extends RecyclerView.ViewHolder  {

        TextView programs;

        ItemClickListener itemClickListener;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            programs=itemView.findViewById(R.id.idprogram);

        }


    }


    private void setSharedPref(int pos)
    {
        SharedPreferences sharedPreferences = programs.getSharedPreferences("detail", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("position",pos);
        editor.commit();
    }



    @Override
    public int getItemCount() {
        return programitems.size();
    }








    public void setfilter(List<Programitems> listitem)
    {
        programitems=new ArrayList<>();
        programitems.addAll(listitem);
        notifyDataSetChanged();
    }


}
