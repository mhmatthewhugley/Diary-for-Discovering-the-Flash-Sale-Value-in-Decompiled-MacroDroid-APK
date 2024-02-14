package com.google.firebase.storage.network.connection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionFactoryImpl implements HttpURLConnectionFactory {
    @Nullable
    /* renamed from: a */
    public HttpURLConnection mo63749a(@NonNull URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }
}
