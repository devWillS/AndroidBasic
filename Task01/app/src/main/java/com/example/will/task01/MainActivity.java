package com.example.will.task01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        boolean testBool = true;
        Log.d("logTestBool", "testBool = " + testBool);

        String testString = "HelloWorld!";
        Log.d("logTestStr", "testString = " + testString);

        int testInteger = 123;
        Log.d("logTestInt", "testInteger = " + testInteger);

        double testDouble = 123.45;
        Log.d("logTestDouble", "testDouble = " + testDouble);
    }
}
