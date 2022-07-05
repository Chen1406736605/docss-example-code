package com.example.springbootdockerexample.controller;

/**
 * @author ZhcChen
 * @since 2022-06-27 16:11:33
 */
public class Phone extends Device {

    public Phone(DeviceMode deviceMode) {
        super(deviceMode);
    }

    @Override
    public String send() {
        return deviceMode.mode();
    }
}
