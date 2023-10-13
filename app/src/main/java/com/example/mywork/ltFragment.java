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

    private RecyclerView recyclerView;
    private List<String> list;
    private Context context;
    private Myadapter myadapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_lt,container,false);
        context=view.getContext();
        recyclerView=view.findViewById(R.id.recyclerview);
        list=new ArrayList();
        initData();

        LinearLayoutManager manager=new LinearLayoutManager(context);

        manager.setOrientation(LinearLayoutManager.VERTICAL);

        myadapter = new Myadapter(context,list);

        recyclerView.setAdapter(myadapter);

        recyclerView.setLayoutManager(manager);


        recyclerView.addItemDecoration(new DividerItemDecoration(context,LinearLayoutManager.VERTICAL));
        return view;

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_lt, container, false);
    }

    private void initData(){
        list.add("网友1:青青园中葵");
        list.add("网友2:朝露待日晞");
        list.add("网友3:阳春布德泽");
        list.add("网友4:万物生光辉");
        list.add("网友5:常恐秋节至");
        list.add("网友6:焜黄华叶衰");
        list.add("网友7:百川东到海");
        list.add("网友8:何时复西归");
        list.add("网友9:少壮不努力");
        list.add("网友10:老大徒伤悲");
    }

}