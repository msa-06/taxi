package indielabs.sa.taxi;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Hassan on 6/5/16.
 */
public class Landing extends Fragment implements View.OnClickListener {

    private Button sginInBT, registerBT;
    private View view;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.landing_page, container, false);

        sginInBT = (Button) view.findViewById(R.id.sginInBT);
        registerBT = (Button) view.findViewById(R.id.registerBT);
        sginInBT.setOnClickListener(this);
        registerBT.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager;
        FragmentTransaction fragmentTransaction;


        switch (v.getId()){
            case R.id.sginInBT:
                SignIn signIn = new SignIn();
                fragmentManager = getFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.gla_there_come, R.anim.gla_there_gone);
                fragmentTransaction.replace(R.id.placeholder, signIn);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                Log.i("landing.java", "you pressed sgin in");

                break;
            case R.id.registerBT :
                SignUp signUn = new SignUp();
                Log.i("landing.java", "you pressed register");
                 fragmentManager = getFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.gla_there_come, R.anim.gla_there_gone);
                fragmentTransaction.replace(R.id.placeholder, signUn);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
        }
    }







}
