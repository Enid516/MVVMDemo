package com.example.mvvmdemo.list;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.android.databinding.library.baseAdapters.BR;
import com.example.mvvmdemo.Message;
import com.example.mvvmdemo.R;
import com.example.mvvmdemo.User;
import com.example.mvvmdemo.databinding.ActivityListBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Enid on 2017/5/11.
 */

public class UserListActivity extends AppCompatActivity {

    private List<User> userList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();

    }

    private void initData() {
        ActivityListBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_list);

        //init user list
        userList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            User user = new User("user", "ho" + i, "https://b-ssl.duitang.com/uploads/item/201407/16/20140716214907_hzMQh.jpeg");
            userList.add(user);
        }

        //init message list
        List<Message> messageList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Message message = new Message("title","this is content");
            messageList.add(message);
        }

        //创建user list Adapter
        CommonAdapter userAdapter = new CommonAdapter(this, userList, R.layout.lv_item_user, BR.user);
        binding.setLvAdapter(userAdapter);


        //创建message list Adapter
        CommonAdapter messageAdapter = new CommonAdapter(this, messageList, R.layout.lv_item_message, BR.message);
        binding.setMessageAdapter(messageAdapter);
    }

    public void onUpdate(View view) {
        updateUserListData();
    }

    private void updateUserListData() {
        User user = new User("user", "ho" + "add", "https://b-ssl.duitang.com/uploads/item/201407/16/20140716214907_hzMQh.jpeg");
        userList.add(user);
    }
}
