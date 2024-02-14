package com.google.android.gms.ads.nonagon.signalgeneration;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzan implements Callable {

    /* renamed from: a */
    public final /* synthetic */ TaggingLibraryJsInterface f2528a;

    public /* synthetic */ zzan(TaggingLibraryJsInterface taggingLibraryJsInterface) {
        this.f2528a = taggingLibraryJsInterface;
    }

    public final Object call() {
        return this.f2528a.getViewSignals();
    }
}
