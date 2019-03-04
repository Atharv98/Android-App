package com.example.learnjava.ProglistUI;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.learnjava.Fragments.CodeFragment;
import com.example.learnjava.Fragments.OutputFragment;
import com.example.learnjava.R;

import static android.content.Context.MODE_PRIVATE;


public class Basic extends AppCompatActivity {

    private TextView mTextMessage;
    private CodeFragment codeFragment;
    private OutputFragment outputFragment;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    int position = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);




        sharedPreferences = this.getSharedPreferences("detail", MODE_PRIVATE);
         editor = sharedPreferences.edit();
        position=sharedPreferences.getInt("position",0);

        mTextMessage = (TextView) findViewById(R.id.message);
        codeFragment= new CodeFragment();
        outputFragment=new OutputFragment();



        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        setFragment(codeFragment);

    }

   /* @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.prevnext, menu);


    }*/

  /*  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
        //inflater.inflate(R.menu.prevnext, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu_prev:
                setPreviousView();
                //Toast.makeText(getActivity(), "Menu Prev", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_next:
                setNextView();
                //oast.makeText(getActivity(), "Menu Prev", Toast.LENGTH_SHORT).show();
                break;


        }
        return true;
    }

    private void setNextView() {
        position = position + 1;

        if (position < urlString.length) {
            webView.loadUrl(urlString[position]);
        } else {
            position = urlString.length - 1;
            Toast.makeText(Basic.this, "Last Page", Toast.LENGTH_SHORT).show();
        }
    }

    private void setPreviousView() {
        position = position - 1;

        if (position >= 0) {
            webView.loadUrl(urlString[position]);
        } else {
            position = 0;
            Toast.makeText(Basic.this, "First Page", Toast.LENGTH_SHORT).show();
        }


    }

*/
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {


                case R.id.navigation_code:

                    setFragment(codeFragment);
                    return true;
                case R.id.navigation_output:
                    setFragment(outputFragment);
                    return true;
                default:
                    setFragment(codeFragment);
            }
            return false;
        }
    };

    private void setFragment(Fragment fragment) {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.idframe,fragment);

        fragmentTransaction.commit();
    }

    private void setSharedPref(int pos)
    {
        SharedPreferences sharedPreferences = this.getSharedPreferences("detail", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("position",pos);
        editor.commit();
    }



}
