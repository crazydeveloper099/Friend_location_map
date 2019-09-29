package com.anubhav.friend_map;

import android.app.Application;

import com.anubhav.friend_map.models.User;


public class UserClient extends Application {

    private User user = null;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
