package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.config.EncoderConfig;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final class zzbp implements EncoderConfig {

    /* renamed from: d */
    private static final ObjectEncoder f41988d = zzbo.f41987a;

    /* renamed from: e */
    public static final /* synthetic */ int f41989e = 0;

    /* renamed from: a */
    private final Map f41990a = new HashMap();

    /* renamed from: b */
    private final Map f41991b = new HashMap();

    /* renamed from: c */
    private final ObjectEncoder f41992c = f41988d;

    @NonNull
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ EncoderConfig mo23612a(@NonNull Class cls, @NonNull ObjectEncoder objectEncoder) {
        this.f41990a.put(cls, objectEncoder);
        this.f41991b.remove(cls);
        return this;
    }

    /* renamed from: b */
    public final zzbq mo51834b() {
        return new zzbq(new HashMap(this.f41990a), new HashMap(this.f41991b), this.f41992c);
    }
}
