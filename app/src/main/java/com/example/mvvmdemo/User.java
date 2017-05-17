package com.example.mvvmdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.TextureView;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Enid on 2017/5/10.
 */

public class User extends BaseObservable{
    private String firstName;
    private String lastName;
    private String profile;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String firstName, String lastName, String profile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.profile = profile;

    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }


    public void onProfileClick(View view) {
        String name = getFirstName() + getLastName();
        Toast.makeText(view.getContext(), "click "+ name +"'s  profile" + view.getId(), Toast.LENGTH_SHORT).show();
    }

    public boolean onProfileLongClick(View view) {
        Toast.makeText(view.getContext(), "long click profile" , Toast.LENGTH_SHORT).show();
        return true;
    }
}
