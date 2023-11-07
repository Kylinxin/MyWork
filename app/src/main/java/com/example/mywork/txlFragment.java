package com.example.mywork;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class txlFragment extends Fragment {
    //获取recyclerView对象并且实例化适配器
    private RecyclerView recyclerView;
    private MyAdapter myAdapter;
    LinearLayout linearLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fra_lx, container, false);
        View view;
        //存所有控件的视图
        view=inflater.inflate(R.layout.item, container, false);
        //调用recycleview控件
        recyclerView=view.findViewById(R.id.itemview);
        linearLayout=view.findViewById(R.id.linearLayout_txl);
        //创建数据
        String[] names={"Pappy","Mommy","Sister","Little Sister","Brother","Little Brother","Roommate"};
        int[] images={R.drawable.baba,R.drawable.mama,R.drawable.jiejie,R.drawable.meimei,R.drawable.gege,
                R.drawable.didi,R.drawable.shiyou1};
        String[] phones={"123456789","123456789","123456789","123456789","123456789",
                "123456789","123456789"};
        String[] regions={"四川 南充","四川 南充","四川 南充","四川 南充","四川 南充","四川 南充","湖北 武汉"};
        String[] tags={"家人","家人","家人","家人","家人","家人","同学"};
        List<Map<String,Object>> items=new ArrayList<Map<String,Object>>();
        for(int i=0;i<names.length;i++){
            Map<String,Object> item=new HashMap<String, Object>();
            item.put("i_name",names[i]);
            item.put("i_image",images[i]);
            item.put("i_phone",phones[i]);
            item.put("i_region",regions[i]);
            item.put("i_tag",tags[i]);
            items.add(item);
        }
        //创建RecycleView实例和设置Adapter
        Context context=getContext();
        myAdapter=new MyAdapter(items,context);
        LinearLayoutManager manager=new LinearLayoutManager(context);
        manager.setOrientation(recyclerView.VERTICAL);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(myAdapter);


//        linearLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getActivity(), txlDetails.class);
////                launcher.launch(intent);
//                startActivity(intent);
//            }
//        });

//        //实现拖拽和左滑删除效果
//        ItemTouchHelper itemTouchHelper=new ItemTouchHelper(new ItemTouchHelper.Callback() {
//            @Override
//            public int getMovementFlags(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
//                int swiped=ItemTouchHelper.LEFT;
//                int dragFlags = ItemTouchHelper.UP | ItemTouchHelper.DOWN;
//                return makeMovementFlags(dragFlags,swiped);
//            }
//
//            @Override
//            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
//                int oldPosition = viewHolder.getAdapterPosition();
//                int newPosition = target.getAdapterPosition();
//                if (oldPosition < newPosition) {
//                    for (int i = oldPosition; i < newPosition; i++) {
//                        // 改变数据集
//                        Collections.swap(items, i, i +1);
//                    }
//                } else {
//                    for (int i = oldPosition; i > newPosition; i--) {
//                        // 改变数据集
//                        Collections.swap(items, i, i - 1);
//                    }
//                }
//                myAdapter.notifyItemMoved(oldPosition, newPosition);
//                return true;
//            }
//
//            @Override
//            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
//                int position = viewHolder.getAdapterPosition();
//                items.remove(position);
//                myAdapter.notifyItemRemoved(position);
//            }
//            @Override
//            public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState) {
//                if (actionState!=ItemTouchHelper.ACTION_STATE_IDLE){
//                    viewHolder.itemView.setBackgroundColor(Color.parseColor("#04BE02"));
//                }
//            }
//            @Override
//            public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
//                super.clearView(recyclerView, viewHolder);
//                viewHolder.itemView.setBackgroundColor(Color.TRANSPARENT);
//            }
//        });
//        //关联recycleView
//        itemTouchHelper.attachToRecyclerView(recyclerView);
        return view;
    }
}