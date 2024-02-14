package com.google.api.client.googleapis.services.json;

import com.google.api.client.googleapis.services.AbstractGoogleClient;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.Arrays;
import java.util.Collections;

public abstract class AbstractGoogleJsonClient extends AbstractGoogleClient {

    public static abstract class Builder extends AbstractGoogleClient.Builder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        protected Builder(HttpTransport httpTransport, JsonFactory jsonFactory, String str, String str2, HttpRequestInitializer httpRequestInitializer, boolean z) {
            super(httpTransport, str, str2, new JsonObjectParser.Builder(jsonFactory).mo60530b(z ? Arrays.asList(new String[]{Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA, "error"}) : Collections.emptySet()).mo60529a(), httpRequestInitializer);
        }

        /* renamed from: e */
        public Builder mo60325e(String str) {
            return (Builder) super.mo60310a(str);
        }

        /* renamed from: f */
        public Builder mo60312c(String str) {
            return (Builder) super.mo60312c(str);
        }

        /* renamed from: g */
        public Builder mo60313d(String str) {
            return (Builder) super.mo60313d(str);
        }
    }

    protected AbstractGoogleJsonClient(Builder builder) {
        super(builder);
    }

    /* renamed from: j */
    public final JsonFactory mo60323j() {
        return mo60306d().mo60526b();
    }

    /* renamed from: k */
    public JsonObjectParser mo60306d() {
        return (JsonObjectParser) super.mo60306d();
    }
}
