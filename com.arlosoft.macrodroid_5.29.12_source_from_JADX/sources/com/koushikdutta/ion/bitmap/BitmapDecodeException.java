package com.koushikdutta.ion.bitmap;

public class BitmapDecodeException extends Exception {
    public final int height;
    public final int width;

    public String toString() {
        return super.toString() + " size=" + this.width + 'x' + this.height;
    }
}
