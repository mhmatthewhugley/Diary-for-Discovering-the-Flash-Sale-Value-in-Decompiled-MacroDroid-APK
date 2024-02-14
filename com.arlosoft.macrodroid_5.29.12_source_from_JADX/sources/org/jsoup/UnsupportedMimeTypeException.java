package org.jsoup;

import java.io.IOException;

public class UnsupportedMimeTypeException extends IOException {
    private final String mimeType;
    private final String url;

    public String toString() {
        return super.toString() + ". Mimetype=" + this.mimeType + ", URL=" + this.url;
    }
}
