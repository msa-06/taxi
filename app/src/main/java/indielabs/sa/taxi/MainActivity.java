package indielabs.sa.taxi;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Hassan on 6/5/16.
 */
public class MainActivity extends Activity {

    protected static Fragment landing, signIn,signUp;
    protected static FragmentManager fragmentManager;
    protected static FragmentTransaction fragmentTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);


        setContentView(R.layout.main_activity);
        landing = new Landing();

        signIn = new SignIn();
        signUp = new SignUp();
        fragmentManager = getFragmentManager();
        fragmentTransaction  = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.placeholder, landing,"landing");
        fragmentTransaction.commit();


    }

}
