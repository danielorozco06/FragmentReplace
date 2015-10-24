package co.com.witz.fragmentreplace;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {

    @Bind(R.id.fab)FloatingActionButton fab;
    @Bind(R.id.toolbar)Toolbar toolbar;
    @Bind(R.id.frag1)Button frag1Button;
    @Bind(R.id.frag2)Button frag2Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
    }

    //Button llama fragmmen 1
    @OnClick(R.id.frag1)
    public void setFrag1Button(){
        FragmentManager fragmentManager = getFragmentManager();
        Fragment1 fragment1 = new Fragment1();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.layoutActividad,fragment1);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    //Boton llama fragment 2
    @OnClick(R.id.frag2)
    public void setFrag2Button(){
        FragmentManager fragmentManager = getFragmentManager();
        Fragment2 fragment2 = new Fragment2();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.layoutActividad,fragment2);
        transaction.addToBackStack(null);
        transaction.commit();
    }


    //FloatingActionButton
    @OnClick(R.id.fab)
    public void onClick(View view){
        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

}
