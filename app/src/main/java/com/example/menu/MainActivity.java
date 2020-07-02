package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.setting:
                Toast.makeText(this, "Setting selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.privacy:
                Toast.makeText(this, "privacy selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.bc:
                Toast.makeText(this, "Broad cast selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.msg:
                Toast.makeText(this, "Message selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.sub1:
                Toast.makeText(this, "sub1 selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.sub2:
                Toast.makeText(this, "sub2 selected", Toast.LENGTH_SHORT).show();
                return true;

        }

        return super.onOptionsItemSelected(item);
    }
}
