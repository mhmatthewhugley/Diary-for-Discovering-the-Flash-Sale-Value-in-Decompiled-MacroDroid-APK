package com.google.mlkit.common.internal;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.mlkit.common.model.RemoteModelManager;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final /* synthetic */ class zzc implements ComponentFactory {

    /* renamed from: a */
    public static final /* synthetic */ zzc f56259a = new zzc();

    private /* synthetic */ zzc() {
    }

    /* renamed from: a */
    public final Object mo16829a(ComponentContainer componentContainer) {
        return new RemoteModelManager(componentContainer.mo22869c(RemoteModelManager.RemoteModelManagerRegistration.class));
    }
}
