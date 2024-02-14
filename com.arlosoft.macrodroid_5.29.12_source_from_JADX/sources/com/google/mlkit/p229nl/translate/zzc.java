package com.google.mlkit.p229nl.translate;

import android.content.Context;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;
import com.google.mlkit.p229nl.translate.internal.zzq;

/* renamed from: com.google.mlkit.nl.translate.zzc */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final /* synthetic */ class zzc implements ComponentFactory {

    /* renamed from: a */
    public static final /* synthetic */ zzc f56552a = new zzc();

    private /* synthetic */ zzc() {
    }

    /* renamed from: a */
    public final Object mo16829a(ComponentContainer componentContainer) {
        zzq zzq = new zzq((Context) componentContainer.mo22868a(Context.class), (ModelFileHelper) componentContainer.mo22868a(ModelFileHelper.class));
        zzq.mo64587h();
        return zzq;
    }
}
