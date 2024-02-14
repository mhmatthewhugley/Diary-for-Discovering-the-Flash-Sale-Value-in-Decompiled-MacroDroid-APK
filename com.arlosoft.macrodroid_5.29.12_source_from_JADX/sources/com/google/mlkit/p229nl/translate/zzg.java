package com.google.mlkit.p229nl.translate;

import android.content.Context;
import com.google.android.gms.internal.mlkit_translate.zzqt;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;
import com.google.mlkit.p229nl.translate.internal.zzae;
import com.google.mlkit.p229nl.translate.internal.zzaf;
import com.google.mlkit.p229nl.translate.internal.zzr;

/* renamed from: com.google.mlkit.nl.translate.zzg */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final /* synthetic */ class zzg implements ComponentFactory {

    /* renamed from: a */
    public static final /* synthetic */ zzg f56556a = new zzg();

    private /* synthetic */ zzg() {
    }

    /* renamed from: a */
    public final Object mo16829a(ComponentContainer componentContainer) {
        return new zzaf(zzqt.m62222e((Context) componentContainer.mo22868a(Context.class)), new zzae(zzqt.m62222e((Context) componentContainer.mo22868a(Context.class))), (zzr) componentContainer.mo22868a(zzr.class), (ModelFileHelper) componentContainer.mo22868a(ModelFileHelper.class), (byte[]) null);
    }
}
