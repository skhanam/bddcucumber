package com.quidco.app.utility.Api;

/**
 * Created by ashishmohindroo on 3/20/17.
 */
public class Token {
        private String token;
        private long expiresIn;
        private int userID;

        public Token(){

        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public long getExpiresIn() {
            return expiresIn;
        }

        public void setExpiresIn(long expiresIn) {
            this.expiresIn = expiresIn;
        }

        public int getUserID() {
            return userID;
        }

        public void setUserID(int userID) {
            this.userID = userID;
        }
    }
