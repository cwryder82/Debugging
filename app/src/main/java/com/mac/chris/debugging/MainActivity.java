package com.mac.chris.debugging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.mac.chris.debugging.TP.FT_Math;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FT_Math fM = new FT_Math();

        int rt = fM.ftAdd(3,4);
        Toast.makeText(MainActivity.this, "3 + 4 = "+ rt, Toast.LENGTH_LONG).show();

        rt = fM.ftAdd(3,4);
        Toast.makeText(MainActivity.this, "3 + 4 = "+ rt, Toast.LENGTH_LONG).show();

    }
}
