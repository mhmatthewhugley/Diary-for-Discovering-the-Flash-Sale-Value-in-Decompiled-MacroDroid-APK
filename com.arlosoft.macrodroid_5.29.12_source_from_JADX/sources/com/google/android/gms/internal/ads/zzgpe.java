package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgpe;
import com.google.android.gms.internal.ads.zzgpf;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzgpe<MessageType extends zzgpf<MessageType, BuilderType>, BuilderType extends zzgpe<MessageType, BuilderType>> implements zzgsn {
    /* renamed from: a */
    public abstract zzgpe clone();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract zzgpe mo47044c(zzgpf zzgpf);

    /* renamed from: g1 */
    public final /* bridge */ /* synthetic */ zzgsn mo47046g1(zzgso zzgso) {
        if (mo47337b().getClass().isInstance(zzgso)) {
            return mo47044c((zzgpf) zzgso);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
