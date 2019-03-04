package com.example.learnjava.Fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Toast;

import com.example.learnjava.R;


public class CodeFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    View view;
    WebView webView;
    String[] urlString;
    int position;


    public CodeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CodeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CodeFragment newInstance(String param1, String param2) {
        CodeFragment fragment = new CodeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_code, container, false);
        setWebView();
        return view;

    }

    private void setWebView() {
        urlString = getResources().getStringArray(R.array.url_list);

        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("detail", Context.MODE_PRIVATE);
        position = sharedPreferences.getInt("position", 0);
        System.out.println("postion :" + position);
        webView = view.findViewById(R.id.idwebcode);
        webView.loadUrl(urlString[position]);

    }



}
