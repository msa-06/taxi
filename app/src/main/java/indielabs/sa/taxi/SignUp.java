package indielabs.sa.taxi;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by Hassan on 6/5/16.
 */
public class SignUp extends Fragment implements View.OnClickListener {
    protected Button facebookBT, signUp;
    protected EditText emailET, passwordET,phoneET;
    protected View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.signup_page,container,false);
        confg();
        return view;
    }

    private void confg (){
        facebookBT =(Button) view.findViewById(R.id.withfacebookBT);
        emailET = (EditText) view.findViewById(R.id.usernameET);
        passwordET = (EditText) view.findViewById(R.id.passwordET);
        phoneET = (EditText) view.findViewById(R.id.phoneET);
        signUp = (Button) view.findViewById(R.id.signupBT);
        facebookBT = (Button) view.findViewById(R.id.facebookBT);
        if(facebookBT == null)
            Log.i("singup","facebookBT is null");
        signUp.setOnClickListener(this);
        facebookBT.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.signinBT :
                Intent intent = new Intent(getActivity().getApplicationContext(),Map.class);
                intent.putExtra("username","whatever");
                startActivity(intent);
                break;
            case R.id.facebookBT :
                Intent intent2 = new Intent(getActivity().getApplicationContext(),Map.class);
                intent2.putExtra("username","whatever");
                startActivity(intent2);
                break;
        }

    }
}
