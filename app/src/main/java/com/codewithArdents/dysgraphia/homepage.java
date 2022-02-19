package com.codewithArdents.dysgraphia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class homepage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        CardView cv1 = findViewById(R.id.cardView1);
        CardView cv2 = findViewById(R.id.cardView2);
        CardView cv3 = findViewById(R.id.cardView3);
        TextView v = findViewById(R.id.home_name);
        v.setText(Utility.getName(this));

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();
                cv1.getContext().startActivity(new Intent(cv1.getContext(), alpha_home.class));
            }
        });
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();
                cv2.getContext().startActivity(new Intent(cv2.getContext(), alpha_home.class));
            }
        });
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();
                cv3.getContext().startActivity(new Intent(cv3.getContext(), num_home.class));
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.logout_menu:
                Utility.setName(this,"");
                Utility.setPhoto(this,"");
                Utility.setGender(this,"");
                Utility.setAge(this,0);
                Utility.setValue(this,0);
                startActivity(new Intent(homepage.this,gender.class));
                return true;
            case R.id.help_menu:
                // Do whatever you want to do on logout click.
                startActivity(new Intent(homepage.this,HelpActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }
}