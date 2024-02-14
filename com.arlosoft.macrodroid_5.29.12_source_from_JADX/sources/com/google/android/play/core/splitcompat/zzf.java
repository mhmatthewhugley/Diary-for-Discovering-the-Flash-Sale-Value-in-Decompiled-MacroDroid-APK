package com.google.android.play.core.splitcompat;

import java.io.File;
import java.io.IOException;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzf implements zzk {

    /* renamed from: a */
    final /* synthetic */ zzg f51770a;

    zzf(zzg zzg) {
        this.f51770a = zzg;
    }

    /* renamed from: a */
    public final void mo59954a(zzl zzl, File file, boolean z) throws IOException {
        this.f51770a.f51772b.add(file);
        if (!z) {
            this.f51770a.f51773c.set(false);
        }
    }
}
