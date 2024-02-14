package com.google.mlkit.p229nl.translate;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.mlkit.common.sdkinternal.CloseGuard;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.p229nl.translate.internal.TranslatorImpl;
import com.google.mlkit.p229nl.translate.internal.zzaa;
import com.google.mlkit.p229nl.translate.internal.zzaf;
import com.google.mlkit.p229nl.translate.internal.zzj;
import com.google.mlkit.p229nl.translate.internal.zzq;
import com.google.mlkit.p229nl.translate.internal.zzr;

/* renamed from: com.google.mlkit.nl.translate.zze */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final /* synthetic */ class zze implements ComponentFactory {

    /* renamed from: a */
    public static final /* synthetic */ zze f56554a = new zze();

    private /* synthetic */ zze() {
    }

    /* renamed from: a */
    public final Object mo16829a(ComponentContainer componentContainer) {
        return new TranslatorImpl.Factory(componentContainer.mo22887d(zzaa.class), (zzj) componentContainer.mo22868a(zzj.class), (zzr) componentContainer.mo22868a(zzr.class), (zzaf) componentContainer.mo22868a(zzaf.class), (ExecutorSelector) componentContainer.mo22868a(ExecutorSelector.class), (zzq) componentContainer.mo22868a(zzq.class), (CloseGuard.Factory) componentContainer.mo22868a(CloseGuard.Factory.class));
    }
}
