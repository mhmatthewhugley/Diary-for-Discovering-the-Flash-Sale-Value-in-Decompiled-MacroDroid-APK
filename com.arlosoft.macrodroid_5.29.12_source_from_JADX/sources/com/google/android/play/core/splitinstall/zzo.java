package com.google.android.play.core.splitinstall;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.play:core@@1.10.3 */
public enum zzo implements zzg {
    INSTANCE;
    

    /* renamed from: c */
    private static final AtomicReference f51931c = null;

    static {
        f51931c = new AtomicReference((Object) null);
    }

    /* renamed from: b */
    public final void mo60010b(zzh zzh) {
        f51931c.set(zzh);
    }

    @Nullable
    public final zzh zza() {
        return (zzh) f51931c.get();
    }
}
