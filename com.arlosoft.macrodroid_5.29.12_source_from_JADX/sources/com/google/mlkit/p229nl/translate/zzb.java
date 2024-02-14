package com.google.mlkit.p229nl.translate;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.mlkit.common.model.RemoteModelManager;
import com.google.mlkit.p229nl.translate.internal.zzan;

/* renamed from: com.google.mlkit.nl.translate.zzb */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final /* synthetic */ class zzb implements ComponentFactory {

    /* renamed from: a */
    public static final /* synthetic */ zzb f56551a = new zzb();

    private /* synthetic */ zzb() {
    }

    /* renamed from: a */
    public final Object mo16829a(ComponentContainer componentContainer) {
        return new RemoteModelManager.RemoteModelManagerRegistration(TranslateRemoteModel.class, componentContainer.mo22887d(zzan.class));
    }
}
