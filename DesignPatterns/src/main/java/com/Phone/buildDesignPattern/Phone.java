package com.Phone.buildDesignPattern;




public class Phone {
    private String os;
    private int ram;
    private String processor;
    private float size;
    private String battery;

    public Phone(String os, int ram, String processor, float size, String battery) {
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.size = size;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                ", size=" + size +
                ", battery='" + battery + '\'' +
                '}';
    }
}
