package com.google.mlkit.common.internal;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitThreadPool;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final /* synthetic */ class zzd implements ComponentFactory {

    /* renamed from: a */
    public static final /* synthetic */ zzd f56260a = new zzd();

    private /* synthetic */ zzd() {
    }

    /* renamed from: a */
    public final Object mo16829a(ComponentContainer componentContainer) {
        return new ExecutorSelector(componentContainer.mo22887d(MlKitThreadPool.class));
    }
}
