package com.example.excesizeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class fragment1 extends Fragment {

    Button btn_coachlist;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment1,null);
        btn_coachlist=(Button)view.findViewById(R.id.btn_coachlist);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
           super.onActivityCreated(savedInstanceState);

        btn_coachlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //创建intent实例
                Intent intent=new Intent(getActivity(),RecyclerviewActivity.class);
                startActivity(intent);
            }
        });
    }

}
