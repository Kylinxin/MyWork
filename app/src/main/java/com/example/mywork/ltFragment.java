package com.example.mywork;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ltFragment#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class ltFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ltFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ltFragment newInstance(String param1, String param2) {
        ltFragment fragment = new ltFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public ltFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    RecyclerView recyclerView;
    List<Message> messages;
    Context context;
    MessageAdapter messageAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.talks,container,false);

        recyclerView=view.findViewById(R.id.recyclerview);
        messages=new ArrayList();
        initData();

        LinearLayoutManager manager=new LinearLayoutManager(context);

        manager.setOrientation(LinearLayoutManager.VERTICAL);

//        myadapter = new Myadapter(context,messages);
        messageAdapter = new MessageAdapter(messages);
        context=view.getContext();

        recyclerView.setAdapter(messageAdapter);

        recyclerView.setLayoutManager(manager);

        recyclerView.addItemDecoration(new DividerItemDecoration(context,LinearLayoutManager.VERTICAL));
        return view;

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_lt, container, false);
    }

    private void initData(){
        messages.add(new Message("Mom", "Good Morning!Good Morning!Good Morning!", "8:00 AM"));
        messages.add(new Message("Dad", "Did u eat lunch?Did u eat lunch?", "12:00 AM"));
        messages.add(new Message("jzc", "teach me web!teach me web!", "12:05 AM"));
        messages.add(new Message("szf", "e4w?e4w?e4w?e4w?e4w?e4w?", "12:06 AM"));
        messages.add(new Message("dxy", "rrrrrrrrrrrrrrrrrrrrrrrrrr", "12:07 AM"));
        messages.add(new Message("lyh", "ysqdysqdysqdysqdysqdysqd", "12:08 AM"));
        messages.add(new Message("fb", "pwnpwnpwnpwnpwnpwnpwnpwnpwn", "12:09 AM"));
        messages.add(new Message("jg", "bxlbxlbxlbxlbxlbxlbxlbxlbxl", "23:59 PM"));

    }

}