package com.shaz.chat.activities;

import android.app.Activity;

import java.util.HashMap;


import io.smooch.core.Message;
import io.smooch.core.Smooch;
import io.smooch.ui.ConversationActivity;

public final class Chat {

    public static String EXTRA_KEY = "key";

    /**
     * It opens the chat screen
     *
     * @param activity
     */
    public static void open(final Activity activity, HashMap<String, Object> extraParam) {
        ConversationActivity.show(activity);

        if (extraParam != null) {

            Smooch.getConversation().sendMessage(new Message(extraParam.get(EXTRA_KEY).toString()));

        }
    }


}
