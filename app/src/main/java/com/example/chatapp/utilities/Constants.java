package com.example.chatapp.utilities;

import java.util.HashMap;

public class Constants {

    public static final String KEY_COLLECTION_USERS ="users";
    public static final String KEY_NAME ="name";
    public static final String KEY_EMAIL ="email";
    public static final String KEY_PASSWORD ="password";
    public static final String KEY_PREFERENCE_NAME ="chatAppPreference";
    public static final String KEY_IS_SIGNED_IN ="isSignedIn";
    public static final String KEY_USER_ID ="userId";
    public static final String KEY_IMAGE ="image";
    public static final String KEY_FCM_Token = "fcmToken";
    public static final String KEY_USER = "user";
    public static final String KEY_COLLECTION_CHAT = "chat";
    public static final String KEY_SENDER_ID = "senderId";
    public static final String KEY_RECEIVER_ID = "receiverId";
    public static final String KEY_MESSAGE  = "message";
    public static final String KEY_TIMESTAMP = "timestamp";
    public static final String KEY_COLLECTION_CONVERSATION = "conversations";
    public static final String KEY_SENDER_NAME = "senderName";
    public static final String KEY_RECEIVER_NAME = "receiverName";
    public static final String KEY_SENDER_IMAGE = "senderImage";
    public static final String KEY_RECEIVER_IMAGE = "receiverImage";
    public static final String KEY_LAST_MESSAGE = "lastMessage";
    public static final String KEY_AVAILABILITY = "availability";
    public static final String REMOTE_MSG_AUTHORIZATION = "authorization";
    public static final String REMOTE_MSG_CONTENT_TYPE = "Content-Type";
    public static final String REMOTE_MSG_DATA = "data";
    public static final String REMOTE_MSG_REGISTRATION_IDS = "registration_ids";

    public static HashMap<String, String> remoteMsgHeaders = null;

    public static HashMap<String,String> getRemoteMsgHeaders(){

        if (remoteMsgHeaders == null){

            remoteMsgHeaders = new HashMap<>();
            remoteMsgHeaders.put(
                    REMOTE_MSG_AUTHORIZATION,
                    "key=AAAAyk6wH9Y:APA91bH_VbhSmIRBFc-GVwMbrqb1eNrAcnf6JFO4BM43SP_A2PpmCFj5MCI6pCfFaZsLBfwECVYWndivgboA0mBeHNzAcaU43YE5EVM1r65ep1M8P9oTuB0H_NrR7nhQ3QigRfgB30ov"
            );

            remoteMsgHeaders.put(
                    REMOTE_MSG_CONTENT_TYPE,
                    "application/json"
            );

        }

        return remoteMsgHeaders;

    }

}
