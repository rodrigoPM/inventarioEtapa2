package com.pdm.sube.cum.inventarioetapa2.menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pdm.sube.cum.inventarioetapa2.R;
import com.pdm.sube.cum.inventarioetapa2.am15005.am15005;
import com.pdm.sube.cum.inventarioetapa2.mm14031.mm14031;
import com.pdm.sube.cum.inventarioetapa2.pm15007.pm15007;
import com.pdm.sube.cum.inventarioetapa2.rl08017.rl08017;
import com.pdm.sube.cum.inventarioetapa2.ts14004.ts14004;

public class Menu extends AppCompatActivity implements IntegranteItemFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    @Override
    public void onListFragmentInteraction(Integrante item) {
        switch (item.getId()){
            case 1:
                startActivity(new Intent(this, am15005.class));
                break;
            case 2:
                startActivity(new Intent(this, mm14031.class));
                break;
            case 3:
                startActivity(new Intent(this, pm15007.class));
                break;
            case 4:
                startActivity(new Intent(this, rl08017.class));
                break;
            case 5:
                startActivity(new Intent(this, ts14004.class));
                break;
        }
    }
}
