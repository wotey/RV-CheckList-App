package com.example.wotey.trying;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity  {

    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    HashMap<String, List<String>> expandableListDetail;
    Button add_item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add_item = (Button) findViewById(R.id.btnAddItem);



        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        expandableListDetail = ItemsData.getData();
        expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());
        final ArrayList<String> custom = new ArrayList<String>();
        expandableListAdapter = new ListAdapter(this, expandableListTitle, expandableListDetail,custom );
        expandableListView.setAdapter(expandableListAdapter);
        add_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText newItem = (EditText) findViewById(R.id.etNewItem);
                String text = newItem.getText().toString();
                ItemsData.addItem(text);
                
                newItem.setText("");

            }
        });
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {




            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        expandableListTitle.get(groupPosition) + " List opened.",
                        Toast.LENGTH_SHORT).show();
            }
        });


        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                Toast.makeText(
                        getApplicationContext(),
                        expandableListTitle.get(groupPosition)
                                + expandableListDetail.get(
                                expandableListTitle.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT
                ).show();
                return false;
            }
        });



    }



}
