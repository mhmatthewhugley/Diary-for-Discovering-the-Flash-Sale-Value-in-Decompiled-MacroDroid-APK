package com.google.android.gms.internal.mlkit_translate;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzbl {

    /* renamed from: a */
    private final Map f43154a;

    /* renamed from: b */
    private final Map f43155b;

    /* renamed from: c */
    private final ObjectEncoder f43156c;

    zzbl(Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f43154a = map;
        this.f43155b = map2;
        this.f43156c = objectEncoder;
    }

    @NonNull
    /* renamed from: a */
    public final byte[] mo52095a(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzbi(byteArrayOutputStream, this.f43154a, this.f43155b, this.f43156c).mo52093j(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
