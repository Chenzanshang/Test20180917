package tw.edu.tut.mis.test20180917;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
        String TAG = "First MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG,"13245689");
        Log.v(TAG,"13245689");
        Log.e(TAG,"13245689");
        Log.d(TAG,"13245689");
    }
}
