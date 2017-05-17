package com.example.mvvmdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.mvvmdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding viewDataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("Enid","Ho");
        user.setProfile("https://b-ssl.duitang.com/uploads/item/201407/16/20140716214907_hzMQh.jpeg");
        viewDataBinding.setUser(user);
        viewDataBinding.setImageUrl("https://b-ssl.duitang.com/uploads/item/201407/16/20140716214907_hzMQh.jpeg");

    }
}
