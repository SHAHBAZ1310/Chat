package com.shaz.chat.activities;


import android.os.Bundle;

import io.smooch.ui.ConversationActivity;

 class ChatActivity extends ConversationActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        //  requestWindowFeature(Window.FEATURE_NO_TITLE);
        //code that displays the content in full screen mode
      /*  this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);*/

//        setContentView(R.layout.activity_chat);

      /*  ConversationFragment conversationFragment = new ConversationFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.frame, conversationFragment);
        transaction.commit();*/
    }
}
