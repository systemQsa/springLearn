package com.springlearn.study;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    public void doMyInit(){
        System.out.println("Doing my initialization...");
    }
    public void doMyDestroy(){
        System.out.println("Destroying...finish");
    }
    @Override
    public String getSong() {
        return "Hungarian Rapsody";
    }
}
