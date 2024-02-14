package com.google.firebase.storage.network.connection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public interface HttpURLConnectionFactory {
    @Nullable
    /* renamed from: a */
    HttpURLConnection mo63749a(@NonNull URL url) throws IOException;
}
