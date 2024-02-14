package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final class zzbq {

    /* renamed from: a */
    private final Map f41993a;

    /* renamed from: b */
    private final Map f41994b;

    /* renamed from: c */
    private final ObjectEncoder f41995c;

    zzbq(Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f41993a = map;
        this.f41994b = map2;
        this.f41995c = objectEncoder;
    }

    @NonNull
    /* renamed from: a */
    public final byte[] mo51835a(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzbn(byteArrayOutputStream, this.f41993a, this.f41994b, this.f41995c).mo51833j(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
