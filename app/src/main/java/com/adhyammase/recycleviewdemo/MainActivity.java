package com.adhyammase.recycleviewdemo;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;


import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerview;

    private String[] names;
    private TypedArray profile_pics;
    private String[] emails;

    private List<Member> memberList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        names = getResources().getStringArray(R.array.names);
        profile_pics = getResources().obtainTypedArray(R.array.profile_pics);
        emails = getResources().getStringArray(R.array.email);

        memberList=new ArrayList<Member>();
        for (int i = 0; i < names.length; i++) {
            Member member = new Member(names[i], emails[i], profile_pics.getResourceId(i, -1));
            memberList.add(member);
        }

        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);

        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

     //   GridLayoutManager layoutManager =new GridLayoutManager(this,2);
      //  StaggeredGridLayoutManager;
      //  GridLayoutManager gridLayoutManager


        recyclerview.setLayoutManager(layoutManager);

        RVAdapter adapter = new RVAdapter(memberList,MainActivity.this);
        recyclerview.setAdapter(adapter);

    }

}
