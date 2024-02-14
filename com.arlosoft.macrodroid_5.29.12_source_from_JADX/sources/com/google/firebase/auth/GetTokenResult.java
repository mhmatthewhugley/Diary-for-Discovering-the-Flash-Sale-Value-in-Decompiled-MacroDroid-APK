package com.google.firebase.auth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
public class GetTokenResult {
    @Nullable

    /* renamed from: a */
    private String f4515a;

    /* renamed from: b */
    private Map<String, Object> f4516b;

    @KeepForSdk
    public GetTokenResult(@Nullable String str, @NonNull Map<String, Object> map) {
        this.f4515a = str;
        this.f4516b = map;
    }

    @NonNull
    /* renamed from: a */
    public Map<String, Object> mo22663a() {
        return this.f4516b;
    }

    @Nullable
    /* renamed from: b */
    public String mo22664b() {
        Map map = (Map) this.f4516b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_provider");
        }
        return null;
    }

    @Nullable
    /* renamed from: c */
    public String mo22665c() {
        return this.f4515a;
    }
}
