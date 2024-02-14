package com.google.mlkit.common.internal;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final /* synthetic */ class zza implements ComponentFactory {

    /* renamed from: a */
    public static final /* synthetic */ zza f56257a = new zza();

    private /* synthetic */ zza() {
    }

    /* renamed from: a */
    public final Object mo16829a(ComponentContainer componentContainer) {
        return new ModelFileHelper((MlKitContext) componentContainer.mo22868a(MlKitContext.class));
    }
}
