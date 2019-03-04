package com.example.learnjava.Adapters;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.learnjava.Interface.ItemClickListener;
import com.example.learnjava.MenuActivity1;
import com.example.learnjava.R;
import com.example.learnjava.Pojo.Menuitems;
import com.example.learnjava.Submenu.Compiler;
import com.example.learnjava.Submenu.Programs;
import com.example.learnjava.Submenu.Questions;
import com.example.learnjava.Submenu.TutorialList;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MyviewHolder> {

    MenuActivity1 menuActivity;
    ArrayList<Menuitems> menuitems;


    public MenuAdapter(MenuActivity1 menuActivity, ArrayList<Menuitems> menuitems) {
        this.menuActivity=menuActivity;
        this.menuitems=menuitems;

    }




    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(menuActivity).inflate(R.layout.items,viewGroup,false);
        MyviewHolder myviewHolder =new MyviewHolder(view);


        return myviewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder myviewHolder, int i) {

        ImageView componentimg=myviewHolder.componentimg;
        TextView componentname=myviewHolder.componentname;
        TextView decription = myviewHolder.description;


        componentimg.setImageResource(menuitems.get(i).getImage());
        componentname.setText(menuitems.get(i).getContentname());
        decription.setText(menuitems.get(i).getDecription());

        myviewHolder.setItemClickListener(new ItemClickListener() {

            String [] strings = menuActivity.getResources().getStringArray(R.array.url_list);
            @Override
            public void onItemClick(View v, int pos) {
                if(menuitems.get(pos).getContentname().equals("Codes"))
                {
                    Intent intent=new Intent(v.getContext(), Programs.class);

                    v.getContext().startActivity(intent);
                }
                else if ( menuitems.get(pos).getContentname().equals("Share"))
                {
                    Intent share=new Intent(Intent.ACTION_SEND);
                    share.setType("text/plain");
                    String sharebody="Your body here";
                    String shareSub="Your Subject here";
                    share.putExtra(Intent.EXTRA_SUBJECT,sharebody);
                    share.putExtra(Intent.EXTRA_SUBJECT,shareSub);

                    v.getContext().startActivity(Intent.createChooser(share,"Share"));

                }
                else if(menuitems.get(pos).getContentname().equals("Tutorial"))
                {
                    Intent tutorialintent=new Intent(v.getContext(), TutorialList.class);
                    v.getContext().startActivity(tutorialintent);

                }

                else if(menuitems.get(pos).getContentname().equals("Important Question"))
                {
                    Intent questionintent=new Intent(v.getContext(), Questions.class);
                    v.getContext().startActivity(questionintent);

                }

                else if(menuitems.get(pos).getContentname().equals("Coding Area"))
                {
                    Intent coding=new Intent(v.getContext(), Compiler.class);
                    v.getContext().startActivity(coding);

                }




            }
        });





    }

    @Override
    public int getItemCount() {
        return menuitems.size();
    }




    public class MyviewHolder extends RecyclerView.ViewHolder implements View.OnClickListener  {

            ImageView componentimg;
            TextView componentname,description;
            ItemClickListener itemClickListener;

            public MyviewHolder(@NonNull View itemView) {





                super(itemView);


                componentimg=itemView.findViewById(R.id.idcomponentimg);
                componentname=itemView.findViewById(R.id.idcomponentname);
                description=itemView.findViewById(R.id.iddescription);


                itemView.setOnClickListener(this);





               /* itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        }
                    }
                });
                */









            }

        @Override
        public void onClick(View view) {
                this.itemClickListener.onItemClick(view,getLayoutPosition());

        }

        public void  setItemClickListener(ItemClickListener ic) {
                this.itemClickListener=ic;

        }
    }




}
