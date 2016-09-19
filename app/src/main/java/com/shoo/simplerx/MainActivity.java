package com.shoo.simplerx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.shoo.simplerx.rx.Observable;
import com.shoo.simplerx.rx.Subscriber;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Subscriber<Integer> subscriber = new Subscriber<Integer>() {
            @Override
            public void onNext(Integer integer) {
                Log.d(TAG, "onNext() called with: " + "integer = [" + integer + "]");
            }
        };
        Observable.just(100).subscribe(subscriber);
    }
}
