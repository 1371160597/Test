package com.example.jason.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.librarydemo.UtilTest;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String s = UtilTest.showLog();
        Toast.makeText(this, "jar的内容是："+s, Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "打包测试1", Toast.LENGTH_SHORT).show();

    }
}
