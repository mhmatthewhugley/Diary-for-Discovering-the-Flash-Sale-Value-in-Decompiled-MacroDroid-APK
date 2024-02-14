package com.google.android.gms.internal.mlkit_translate;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.config.EncoderConfig;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzbk implements EncoderConfig {

    /* renamed from: d */
    private static final ObjectEncoder f43149d = zzbj.f43148a;

    /* renamed from: e */
    public static final /* synthetic */ int f43150e = 0;

    /* renamed from: a */
    private final Map f43151a = new HashMap();

    /* renamed from: b */
    private final Map f43152b = new HashMap();

    /* renamed from: c */
    private final ObjectEncoder f43153c = f43149d;

    @NonNull
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ EncoderConfig mo23612a(@NonNull Class cls, @NonNull ObjectEncoder objectEncoder) {
        this.f43151a.put(cls, objectEncoder);
        this.f43152b.remove(cls);
        return this;
    }

    /* renamed from: b */
    public final zzbl mo52094b() {
        return new zzbl(new HashMap(this.f43151a), new HashMap(this.f43152b), this.f43153c);
    }
}
