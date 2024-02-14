package com.google.android.gms.ads.nonagon.signalgeneration;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzao implements Callable {

    /* renamed from: a */
    public final /* synthetic */ TaggingLibraryJsInterface f2529a;

    /* renamed from: c */
    public final /* synthetic */ String f2530c;

    public /* synthetic */ zzao(TaggingLibraryJsInterface taggingLibraryJsInterface, String str) {
        this.f2529a = taggingLibraryJsInterface;
        this.f2530c = str;
    }

    public final Object call() {
        return this.f2529a.getClickSignals(this.f2530c);
    }
}
