package com.li.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "徐咏梅测试onCreate:执行了！ ");
        mButton = (Button) findViewById(R.id.activity_main_button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d(TAG, "徐咏梅测试onClick:执行了！ ");
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "徐咏梅测试onStart:执行了！ ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "徐咏梅测试onResume:执行了！ ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "徐咏梅测试onPause:执行了！ ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "徐咏梅测试onStop:执行了！ ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "徐咏梅测试onDestroy:执行了！ ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "徐咏梅测试onRestart:执行了！ ");
    }
}
