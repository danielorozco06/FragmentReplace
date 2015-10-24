package co.com.witz.fragmentreplace;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class Fragment1 extends Fragment {
    View view;

    public Fragment1() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_fragment1, container, false);
        parametros();
        return view;
    }

    //Nuevos parametros para el view del fragmento
    private void parametros(){
        RelativeLayout.LayoutParams params =    new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,RelativeLayout.LayoutParams.MATCH_PARENT);
        params.setMargins(0,100,0,0);
        view.setLayoutParams(params);
    }
}
