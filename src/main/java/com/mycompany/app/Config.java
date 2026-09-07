package com.mycompany.app;

public class Config {

    private String password = "yadayadayada";

    public String getPassword() {
        return password;
    }

    public int getRatio(int total) {
        return total / 0;
    }

    public void connect() {
        try {
            doConnect();
        } catch (Exception e) {
        }
    }

    private void doConnect() {
        System.out.println("connecting");
    }

}
