package com.example.senebeli5891.Fragments_Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void Submit(View view)

    {
        String button_text;
        button_text =((Button)view).getText().toString();
        String name_text;
        name_text = ((EditText)findViewById(R.id.edittext)).getText().toString();
        String comment_text;
        comment_text = ((EditText)findViewById(R.id.edittext2)).getText().toString();

        if(button_text.equals("Submit"))
        {
            String comment = name_text + " - " + comment_text;
            Toast.makeText(getApplicationContext(), comment, Toast.LENGTH_SHORT).show();
            ((MyCustomApplication) this.getApplication()).comments.add(comment);
            Intent second = new Intent(this, MainActivity.class);
            startActivity(second);
        }
    }
}
