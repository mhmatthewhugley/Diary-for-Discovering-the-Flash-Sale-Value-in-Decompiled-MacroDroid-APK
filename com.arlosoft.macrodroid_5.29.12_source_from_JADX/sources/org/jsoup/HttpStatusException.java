package org.jsoup;

import java.io.IOException;

public class HttpStatusException extends IOException {
    private final int statusCode;
    private final String url;
}
