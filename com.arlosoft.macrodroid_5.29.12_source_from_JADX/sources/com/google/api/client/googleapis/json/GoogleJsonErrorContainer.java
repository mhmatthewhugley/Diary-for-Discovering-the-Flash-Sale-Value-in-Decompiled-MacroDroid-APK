package com.google.api.client.googleapis.json;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public class GoogleJsonErrorContainer extends GenericJson {
    @Key
    private GoogleJsonError error;

    /* renamed from: k */
    public GoogleJsonErrorContainer mo60137e() {
        return (GoogleJsonErrorContainer) super.clone();
    }

    /* renamed from: l */
    public GoogleJsonErrorContainer mo60138f(String str, Object obj) {
        return (GoogleJsonErrorContainer) super.mo60078d(str, obj);
    }
}
