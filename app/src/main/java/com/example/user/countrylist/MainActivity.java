package com.example.user.countrylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView simplelist;
    String arraylist[]={"India","USA","Germany","UAE","Nepal","Switzerland","London","Canada",
            "Germany","France","south koria","South africa","Japan","China"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simplelist =(ListView) findViewById(R.id.listviewcontainer);
        ArrayAdapter<String> arrayAdapter =new ArrayAdapter<String>(this,R.layout.listview,R.id
                .textviewobj,arraylist);
        simplelist.setAdapter(arrayAdapter);
    }
}
