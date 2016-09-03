package com.erfanatic.philosophyexpress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity  {
    Toolbar toolbar;
    Button button ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        toolbar.setTitle("Philosophy Express");
        setSupportActionBar(toolbar);

        button = (Button) findViewById(R.id.ib_logic);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.ib_logic:
                        Toast.makeText(view.getContext(),"Logic",Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return true;
    }
}

