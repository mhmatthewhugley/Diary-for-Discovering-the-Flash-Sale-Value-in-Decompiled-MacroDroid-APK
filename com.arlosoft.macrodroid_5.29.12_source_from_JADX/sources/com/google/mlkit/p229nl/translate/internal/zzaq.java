package com.google.mlkit.p229nl.translate.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.mlkit.nl.translate.internal.zzaq */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final /* synthetic */ class zzaq implements Callable {

    /* renamed from: a */
    public final /* synthetic */ TranslateJni f56498a;

    /* renamed from: c */
    public final /* synthetic */ String f56499c;

    public /* synthetic */ zzaq(TranslateJni translateJni, String str) {
        this.f56498a = translateJni;
        this.f56499c = str;
    }

    public final Object call() {
        TranslateJni translateJni = this.f56498a;
        String str = this.f56499c;
        int i = TranslatorImpl.f56447A;
        return translateJni.mo64647k(str);
    }
}
