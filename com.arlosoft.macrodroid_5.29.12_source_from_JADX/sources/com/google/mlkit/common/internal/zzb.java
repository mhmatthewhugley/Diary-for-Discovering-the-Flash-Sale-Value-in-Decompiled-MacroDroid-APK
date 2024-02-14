package com.google.mlkit.common.internal;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.mlkit.common.sdkinternal.MlKitThreadPool;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final /* synthetic */ class zzb implements ComponentFactory {

    /* renamed from: a */
    public static final /* synthetic */ zzb f56258a = new zzb();

    private /* synthetic */ zzb() {
    }

    /* renamed from: a */
    public final Object mo16829a(ComponentContainer componentContainer) {
        return new MlKitThreadPool();
    }
}
