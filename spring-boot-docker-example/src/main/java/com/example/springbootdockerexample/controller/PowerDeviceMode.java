package com.example.springbootdockerexample.controller;

/**
 * @author ZhcChen
 * @since 2022-06-27 16:10:25
 */
public class PowerDeviceMode implements DeviceMode {
    @Override
    public String mode() {
        return "power device mode";
    }
}
