package com.devi.staticfragemt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    TextView tp;
    Button btn,svs,iit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView=(BottomNavigationView) findViewById(R.id.bottomnavigate);

       // btn=(Button)findViewById(R.id.clickaro);
      //  svs=(Button)findViewById(R.id.sbs);
      //  iit=(Button)findViewById(R.id.iit);
    //    frage();


        // sbs


      bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
          @Override
          public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

              switch (menuItem.getItemId())
              {

                  case R.id.home:
                      sbs();
                      Toast.makeText(MainActivity.this, "Home Menu are Clicked ", Toast.LENGTH_SHORT).show();
                      break;
                  case  R.id.call:
                      iit();
                      Toast.makeText(MainActivity.this, "Call Item are Clicked", Toast.LENGTH_SHORT).show();
                      break;
                  case  R.id.camera:
                      Toast.makeText(MainActivity.this, "Camera Item are Clicked", Toast.LENGTH_SHORT).show();
                      break;
                  case  R.id.music:
                      frage();
                      Toast.makeText(MainActivity.this, "Music are clicked", Toast.LENGTH_SHORT).show();
                      break;
              }

              return true;
          }
      });


    }

  public void frage()
    {
        FragmentManager fragmentManager=getSupportFragmentManager();// decliared the trancscation
        FragmentTransaction transaction= fragmentManager.beginTransaction(); // now trancsaction will be started
        newfragement newfrageme= new newfragement();
        transaction.add(R.id.fragemetmanager1,newfrageme);
        transaction.commit();


    }
    public void sbs()
    {

        FragmentManager fragmentManager = getSupportFragmentManager(); // get support fragment mangager is the support many device in phone
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction(); // beagin tranaction is start to transcation.
        sbsfragment sbsfragment= new sbsfragment();
        fragmentTransaction.add(R.id.fragemetmanager1,sbsfragment);
        fragmentTransaction.commit();
        // now our transaction are commited..

    }

    public  void iit()
    {
        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        iitframgent iitframgent= new iitframgent();
        fragmentTransaction.add(R.id.fragemetmanager1,iitframgent);
        fragmentTransaction.commit();
    }


}