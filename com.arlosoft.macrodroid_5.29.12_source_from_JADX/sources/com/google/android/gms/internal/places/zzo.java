package com.google.android.gms.internal.places;

import com.google.android.gms.internal.places.zzm;
import com.google.android.gms.internal.places.zzo;

public abstract class zzo<MessageType extends zzm<MessageType, BuilderType>, BuilderType extends zzo<MessageType, BuilderType>> implements zzcj {
    /* renamed from: W */
    public final /* synthetic */ zzcj mo53533W(zzck zzck) {
        if (mo53451f().getClass().isInstance(zzck)) {
            return mo53461g((zzm) zzck);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract BuilderType mo53461g(MessageType messagetype);

    /* renamed from: h */
    public abstract BuilderType clone();
}
