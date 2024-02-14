package com.google.api.client.json;

import com.google.api.client.util.GenericData;
import com.google.api.client.util.Throwables;
import java.io.IOException;

public class GenericJson extends GenericData {

    /* renamed from: d */
    private JsonFactory f52534d;

    /* renamed from: e */
    public GenericJson clone() {
        return (GenericJson) super.clone();
    }

    /* renamed from: f */
    public GenericJson mo60078d(String str, Object obj) {
        return (GenericJson) super.mo60078d(str, obj);
    }

    /* renamed from: g */
    public final void mo60518g(JsonFactory jsonFactory) {
        this.f52534d = jsonFactory;
    }

    /* renamed from: h */
    public String mo60519h() throws IOException {
        JsonFactory jsonFactory = this.f52534d;
        if (jsonFactory != null) {
            return jsonFactory.mo60523i(this);
        }
        return super.toString();
    }

    public String toString() {
        JsonFactory jsonFactory = this.f52534d;
        if (jsonFactory == null) {
            return super.toString();
        }
        try {
            return jsonFactory.mo60524j(this);
        } catch (IOException e) {
            throw Throwables.m72729a(e);
        }
    }
}
