package com.google.mlkit.common.internal;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.mlkit.common.internal.model.zzg;
import com.google.mlkit.common.model.CustomRemoteModel;
import com.google.mlkit.common.model.RemoteModelManager;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final /* synthetic */ class zzh implements ComponentFactory {

    /* renamed from: a */
    public static final /* synthetic */ zzh f56264a = new zzh();

    private /* synthetic */ zzh() {
    }

    /* renamed from: a */
    public final Object mo16829a(ComponentContainer componentContainer) {
        return new RemoteModelManager.RemoteModelManagerRegistration(CustomRemoteModel.class, componentContainer.mo22887d(zzg.class));
    }
}
