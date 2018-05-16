package com.shaz.chat.activities.listeners;

import io.smooch.core.SmoochCallback;

/**
 * Created by root on 3/12/18.
 */

public interface ChatResponseCallback {
    void loginResponse(Response response);

    void logoutResponse(Response response);

    static class Response {
        int status;
        String error;
        Object data;

        public Response(int status, String error, Object data) {
            this.status = status;
            this.error = error;
            this.data = data;
        }


        public int getStatus() {
            return this.status;
        }

        public String getError() {
            return this.error;
        }

        public Object getData() {
            return this.data;
        }
    }
}
