package com.shaz.chat.activities;

import android.app.Application;
import android.util.Log;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import io.smooch.core.Settings;
import io.smooch.core.Smooch;
import io.smooch.core.SmoochCallback;
import io.smooch.core.User;

/**
 * Created by shahbaz on 11/29/17.
 */

public class ChatInitializer {

    /**
     * @param application, application object
     * @param appId, app Id

     * It initialize the Ameyo chat.
     */
    public static void init(Application application, String appId) {

        Smooch.init(application, new Settings(appId), new SmoochCallback() {
            @Override
            public void run(SmoochCallback.Response response) {

                // Your code after init is complete
                //                AppLogger.createLog("response::: "+response.getError());


            }
        });

    }


}
