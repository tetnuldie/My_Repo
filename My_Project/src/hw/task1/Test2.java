package com.itacademy.lesson11.hw.task1;

public class Test2 {
    private int param1;
    private String param2;

    public Test2(){
        param1 = 111;
        param2 = "Default_String";
    }
    public Test2(int _param1, String _param2){
        param1 = _param1;
        param2 = _param2;
    }

    public int getParam1(){
        return param1;
    }

    public int setParam1(int _param1){
        param1 = _param1;
        return _param1;
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String _param2) {
        param2 = _param2;
    }
}
