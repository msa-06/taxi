package indielabs.sa.taxi;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by Hassan on 6/5/16.
 */
public class SignIn extends Fragment implements View.OnClickListener {

    protected Button facebookBT, sginInBT;
    protected EditText usernameET, passwordET;
    protected View view;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sign_in_page,container ,false);

        return view;
    }

    public void config(){
        facebookBT = (Button) view.findViewById(R.id.withfacebookBT);
        sginInBT = (Button) view.findViewById(R.id.signinBT);
        usernameET = (EditText) view.findViewById(R.id.usernameET);
        facebookBT.setOnClickListener(this);
        sginInBT.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.sginInBT :
                Intent intent = new Intent(this.getActivity().getApplicationContext(),Map.class);
                intent.putExtra("username","whatever");
                startActivity(intent);
                break;
            case R.id.withfacebookBT :
                Intent intent2 = new Intent(this.getActivity().getApplicationContext(),Map.class);
                intent2.putExtra("username","whatever");
                startActivity(intent2);
                break;
        }
    }


}
