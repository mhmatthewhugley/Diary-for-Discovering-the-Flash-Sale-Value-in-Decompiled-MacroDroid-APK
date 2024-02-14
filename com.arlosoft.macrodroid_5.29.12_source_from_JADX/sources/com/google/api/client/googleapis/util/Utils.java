package com.google.api.client.googleapis.util;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.Beta;

@Beta
public final class Utils {

    private static class JsonFactoryInstanceHolder {

        /* renamed from: a */
        static final JsonFactory f52393a = new JacksonFactory();

        private JsonFactoryInstanceHolder() {
        }
    }

    private static class TransportInstanceHolder {

        /* renamed from: a */
        static final HttpTransport f52394a = new NetHttpTransport();

        private TransportInstanceHolder() {
        }
    }

    private Utils() {
    }
}
