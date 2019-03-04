package com.example.learnjava.Submenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import com.example.learnjava.Adapters.QuestionAdapter;
import com.example.learnjava.R;

public class Questions extends AppCompatActivity {

    ExpandableListView expandableListView;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);


        expandableListView=(ExpandableListView)findViewById(R.id.idexpanques);

        QuestionAdapter questionAdapter=new QuestionAdapter(Questions.this);
        expandableListView.setAdapter(questionAdapter);

    }


}
