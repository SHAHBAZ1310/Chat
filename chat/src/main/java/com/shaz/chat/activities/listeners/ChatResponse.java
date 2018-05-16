package ameyo.ameyochatmodule.activities.listeners;

public interface ChatResponse {
    void response(ameyo.ameyochatmodule.activities.listeners.ChatResponse.Response response);


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
