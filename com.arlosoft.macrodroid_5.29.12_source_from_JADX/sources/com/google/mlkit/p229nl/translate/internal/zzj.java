package com.google.mlkit.p229nl.translate.internal;

import com.google.mlkit.common.sdkinternal.LazyInstanceMap;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;
import com.google.mlkit.p229nl.translate.TranslatorOptions;

/* renamed from: com.google.mlkit.nl.translate.internal.zzj */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzj extends LazyInstanceMap {

    /* renamed from: b */
    private final zzaf f56530b;

    /* renamed from: c */
    private final ModelFileHelper f56531c;

    /* renamed from: d */
    private final zzr f56532d;

    public zzj(zzaf zzaf, ModelFileHelper modelFileHelper, zzr zzr) {
        this.f56530b = zzaf;
        this.f56531c = modelFileHelper;
        this.f56532d = zzr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo52014a(Object obj) {
        TranslatorOptions translatorOptions = (TranslatorOptions) obj;
        return new TranslateJni(this.f56530b, this.f56532d.mo64689a(translatorOptions.mo64636a()), this.f56531c, translatorOptions.mo64637b(), translatorOptions.mo64638c());
    }
}
