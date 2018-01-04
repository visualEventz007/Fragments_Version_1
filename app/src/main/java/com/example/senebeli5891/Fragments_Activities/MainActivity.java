package com.example.senebeli5891.Fragments_Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.list_view);
        List<String> comments = ((MyCustomApplication) this.getApplication()).comments;
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, comments);
        mListView.setAdapter(adapter);
    }

    public void Third_Page(View View)

    {
        String button_text;
        button_text =((Button)View).getText().toString();

        if(button_text.equals("Add Comments"))
        {
            Toast.makeText(getApplicationContext(), "Sydney Enebeli", Toast.LENGTH_SHORT).show();
            Intent second = new Intent(this, SecondActivity.class);
            startActivity(second);
        }

        else if (button_text.equals("Contact Us"))
        {
            Intent third = new Intent(Intent.ACTION_DIAL);
            startActivity(third);

        }

    }

}
