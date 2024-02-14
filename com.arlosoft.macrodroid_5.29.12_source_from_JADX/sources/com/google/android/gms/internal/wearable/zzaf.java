package com.google.android.gms.internal.wearable;

import com.google.android.gms.internal.wearable.zzaf;
import com.google.android.gms.internal.wearable.zzag;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public abstract class zzaf<MessageType extends zzag<MessageType, BuilderType>, BuilderType extends zzaf<MessageType, BuilderType>> implements zzdb {
    /* renamed from: b */
    public abstract zzaf clone();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract zzaf mo53795c(zzag zzag);

    /* renamed from: n0 */
    public final /* bridge */ /* synthetic */ zzdb mo53797n0(zzdc zzdc) {
        if (mo53934G().getClass().isInstance(zzdc)) {
            return mo53795c((zzag) zzdc);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
