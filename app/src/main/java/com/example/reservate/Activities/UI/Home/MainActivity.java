package com.example.reservate.Activities.UI.Home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.reservate.Activities.UI.Fragments.FragmentProfile;
import com.example.reservate.Activities.UI.Fragments.FragmentReservas;
import com.example.reservate.Activities.UI.Fragments.FramentHelp;
import com.example.reservate.Activities.UI.Fragments.SalonesFragment;
import com.example.reservate.R;

public class MainActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.salones:
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SalonesFragment()).commit();
                    break;
                case R.id.profile:
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FragmentProfile()).commit();
                    break;
                case R.id.reservas:
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FragmentReservas()).commit();
                    break;
                case R.id.help:
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FramentHelp()).commit();
                    break;
            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


    }
}
