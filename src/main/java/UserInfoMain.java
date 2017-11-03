package com.example;

import twitter4j.*;

public class UserInfoMain {
    public static void main(String[] args) throws TwitterException {

        Twitter twitter = TwitterFactory.getSingleton();
        User user = twitter.verifyCredentials();
        System.out.println(user.getName());
        System.out.println(user.getScreenName());
        System.out.println(user.getFriendsCount());
        System.out.println(user.getFollowersCount());

        Status status = twitter.updateStatus("test twit");
    }
}