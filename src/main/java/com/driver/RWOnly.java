package com.driver;

import javax.sound.midi.Sequencer;

public class RWOnly {
    private String name;
    public void setter(String val){
        this.name=val;
    }
    public String getter(){
        return name;
    }
}
