package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzbr;
import com.google.android.gms.internal.icing.zzbs;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public abstract class zzbr<MessageType extends zzbs<MessageType, BuilderType>, BuilderType extends zzbr<MessageType, BuilderType>> implements zzed {
    /* renamed from: b */
    public abstract BuilderType clone();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract BuilderType mo50180c(MessageType messagetype);

    /* renamed from: f1 */
    public final /* bridge */ /* synthetic */ zzed mo50182f1(zzee zzee) {
        if (mo50306k().getClass().isInstance(zzee)) {
            return mo50180c((zzbs) zzee);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
