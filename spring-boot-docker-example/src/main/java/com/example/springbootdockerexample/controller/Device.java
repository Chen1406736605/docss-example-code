package com.example.springbootdockerexample.controller;

/**
 * @author ZhcChen
 * @since 2022-06-27 16:09:12
 */
public abstract class Device {

    protected DeviceMode deviceMode;

    public Device(DeviceMode deviceMode) {
        this.deviceMode = deviceMode;
    }

    public abstract String send();

}
