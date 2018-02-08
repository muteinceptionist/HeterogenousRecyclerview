package com.example.delaroy.heterogenousrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.delaroy.heterogenousrecyclerview.adapter.MainAdapter;
import com.example.delaroy.heterogenousrecyclerview.pojos.SingleHorizontal;
import com.example.delaroy.heterogenousrecyclerview.pojos.SingleVertical;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Object> objects = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_View);
        MainAdapter adapter = new MainAdapter(this, getObject());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private ArrayList<Object> getObject() {
        objects.add(getVerticalData().get(0));
        objects.add(getHorizontalData().get(0));
        return objects;
    }

    public static ArrayList<SingleVertical> getVerticalData() {
        ArrayList<SingleVertical> singleVerticals = new ArrayList<>();
        singleVerticals.add(new SingleVertical("Engr. Hassan Mujtaba", "Engr. Hassan Mujtaba is currently Managing Directing Officer at IT Empire Pvt. Ltd. He is a Chemical Engineer by profession and has served in corporate organization in Pakistan at top management levels for over last 10 years.", R.mipmap.sir_hasan));
        singleVerticals.add(new SingleVertical("Kamran Ismail", "Kamran Ismail is a Managing Associate and Founder of IT Empire Business and Consulting.", R.mipmap.kamran));
        singleVerticals.add(new SingleVertical("Abdul Rehman Jami", "Abdul Rehman Jami is a youthful, energetic, upcoming and resourceful young graduate. He takes care of all the logistical support as well as vendor relations.", R.mipmap.ar2));
        return singleVerticals;
    }


    public static ArrayList<SingleHorizontal> getHorizontalData() {
        ArrayList<SingleHorizontal> singleHorizontals = new ArrayList<>();
        singleHorizontals.add(new SingleHorizontal(R.mipmap.sir_hasan, "Engr. Hassan Mujtaba", "Engr. Hassan Mujtaba is currently Director at IT Empire.He served in corporate organization in Pakistan at top management levels for over last 10 years.", "2018/2/8"));
        singleHorizontals.add(new SingleHorizontal(R.mipmap.kamran, "Kamran Ismail", "Kamran Ismail is a Managing Associate and Founder of IT Empire Business and Consulting. He takes care of all the logistical support as well as vendor relations.", "2018/2/8"));
        singleHorizontals.add(new SingleHorizontal(R.mipmap.ar2, "Abdul Rehman Jami", "Abdul Rehman Jami is a youthful, energetic, upcoming and resourceful young graduate. He takes care of all the logistical support as well as vendor relations.", "2018/2/8"));
        return singleHorizontals;
    }


}
