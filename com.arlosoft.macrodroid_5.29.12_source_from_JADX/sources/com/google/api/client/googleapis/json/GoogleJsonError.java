package com.google.api.client.googleapis.json;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Data;
import com.google.api.client.util.Key;
import java.util.List;

public class GoogleJsonError extends GenericJson {
    @Key
    private int code;
    @Key
    private List<ErrorInfo> errors;
    @Key
    private String message;

    public static class ErrorInfo extends GenericJson {
        @Key
        private String domain;
        @Key
        private String location;
        @Key
        private String locationType;
        @Key
        private String message;
        @Key
        private String reason;

        /* renamed from: k */
        public ErrorInfo mo60137e() {
            return (ErrorInfo) super.clone();
        }

        /* renamed from: l */
        public ErrorInfo mo60138f(String str, Object obj) {
            return (ErrorInfo) super.mo60078d(str, obj);
        }
    }

    static {
        Data.m72658i(ErrorInfo.class);
    }

    /* renamed from: k */
    public GoogleJsonError mo60137e() {
        return (GoogleJsonError) super.clone();
    }

    /* renamed from: l */
    public GoogleJsonError mo60138f(String str, Object obj) {
        return (GoogleJsonError) super.mo60078d(str, obj);
    }
}
