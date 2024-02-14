package com.google.mlkit.common.internal;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.mlkit.common.sdkinternal.Cleaner;
import com.google.mlkit.common.sdkinternal.CloseGuard;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final /* synthetic */ class zzf implements ComponentFactory {

    /* renamed from: a */
    public static final /* synthetic */ zzf f56262a = new zzf();

    private /* synthetic */ zzf() {
    }

    /* renamed from: a */
    public final Object mo16829a(ComponentContainer componentContainer) {
        return new CloseGuard.Factory((Cleaner) componentContainer.mo22868a(Cleaner.class));
    }
}
