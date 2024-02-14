package com.google.mlkit.p229nl.translate;

import android.content.Context;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;
import com.google.mlkit.p229nl.translate.internal.zzaf;
import com.google.mlkit.p229nl.translate.internal.zzh;
import com.google.mlkit.p229nl.translate.internal.zzr;

/* renamed from: com.google.mlkit.nl.translate.zzi */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final /* synthetic */ class zzi implements ComponentFactory {

    /* renamed from: a */
    public static final /* synthetic */ zzi f56558a = new zzi();

    private /* synthetic */ zzi() {
    }

    /* renamed from: a */
    public final Object mo16829a(ComponentContainer componentContainer) {
        return new zzh((MlKitContext) componentContainer.mo22868a(MlKitContext.class), (Context) componentContainer.mo22868a(Context.class), (zzr) componentContainer.mo22868a(zzr.class), (zzaf) componentContainer.mo22868a(zzaf.class), (ModelFileHelper) componentContainer.mo22868a(ModelFileHelper.class), (SharedPrefManager) componentContainer.mo22868a(SharedPrefManager.class));
    }
}
