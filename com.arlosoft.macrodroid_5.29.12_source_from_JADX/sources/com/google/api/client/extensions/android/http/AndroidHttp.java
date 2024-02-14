package com.google.api.client.extensions.android.http;

import com.google.api.client.extensions.android.AndroidUtils;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.apache.ApacheHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.util.Beta;

@Beta
public class AndroidHttp {
    private AndroidHttp() {
    }

    /* renamed from: a */
    public static HttpTransport m71648a() {
        return AndroidUtils.m71647b(9) ? new NetHttpTransport() : new ApacheHttpTransport();
    }
}
