package com.google.mlkit.p229nl.translate.internal;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.mlkit.nl.translate.internal.zzb */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final /* synthetic */ class zzb implements FilenameFilter {

    /* renamed from: a */
    public final /* synthetic */ String f56504a;

    public /* synthetic */ zzb(String str) {
        this.f56504a = str;
    }

    public final boolean accept(File file, String str) {
        return str.equals(this.f56504a);
    }
}
