package com.pawelozga;

public class Player {

    private boolean isLoad;
    private final String TAG =Singleton.getInstance().getProperty("log.tag");

    public void Play(){
        if(isLoad){
            System.out.println(TAG + "Program działa");
        }
    }

    public void Pause(){}

    public void Stop(){}

    public void Load(){
        isLoad = true;
    }

    public void Reset(){
        isLoad=false;
    }
}
