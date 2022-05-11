package com.Phone.buildDesignPattern;




public class BuilderPhone  {

    private String os;
    private int ram;
    private String processor;
    private float size;
    private String battery;

    public BuilderPhone setOs(String os) {
        this.os = os;
        return this;
    }

    public BuilderPhone setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public BuilderPhone setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public BuilderPhone setSize(float size) {
        this.size = size;
        return this;
    }

    public BuilderPhone setBattery(String battery) {
        this.battery = battery;
        return this;
    }

    public Phone getPhone(){
       return new Phone(os,ram,processor,size,battery);
    }
}
