package com.example.sharuck.myapplicationn;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = findViewById(R.id.textview);
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this, textview);
                popupMenu.getMenuInflater().inflate(R.menu.popupmenu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        int id = item.getItemId();
                        if (id == R.id.black) {

                            textview.setTextColor(Color.BLACK);
                        }
                        if (id == R.id.yellow) {

                            textview.setTextColor(Color.YELLOW);
                        }
                        if (id == R.id.red) {

                            textview.setTextColor(Color.RED);
                        }
                        return true;


                    }
                });
                popupMenu.show();
            }
        });
    }
}

