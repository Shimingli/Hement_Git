package com.shiming.hement.utils;

/**
 * <p>
 *  事件的累计
 * </p>
 *
 * @author shiming
 * @version v1.0
 * @since 2018/12/4 20:23
 */

public class Events {

    private final String mMsg;

    public Events(String msg) {
        mMsg = msg;
    }

    public static class TapEvent {

    }

    public static class AutoEvent {

    }

    @Override
    public String toString() {
        return "Events="+mMsg;
    }
}
