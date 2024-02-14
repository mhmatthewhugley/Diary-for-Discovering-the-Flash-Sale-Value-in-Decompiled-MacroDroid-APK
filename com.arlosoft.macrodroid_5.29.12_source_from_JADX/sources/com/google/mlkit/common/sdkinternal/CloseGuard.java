package com.google.mlkit.common.sdkinternal;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.zziu;
import com.google.android.gms.internal.mlkit_common.zziv;
import com.google.android.gms.internal.mlkit_common.zziz;
import com.google.android.gms.internal.mlkit_common.zzja;
import com.google.android.gms.internal.mlkit_common.zzmq;
import com.google.android.gms.internal.mlkit_common.zzmt;
import com.google.android.gms.internal.mlkit_common.zznb;
import com.google.mlkit.common.sdkinternal.Cleaner;
import java.io.Closeable;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

@KeepForSdk
/* compiled from: com.google.mlkit:common@@18.5.0 */
public class CloseGuard implements Closeable {

    /* renamed from: a */
    private final AtomicBoolean f56289a = new AtomicBoolean();

    /* renamed from: c */
    private final String f56290c;

    /* renamed from: d */
    private final Cleaner.Cleanable f56291d;

    @KeepForSdk
    /* compiled from: com.google.mlkit:common@@18.5.0 */
    public static class Factory {

        /* renamed from: a */
        private final Cleaner f56292a;

        public Factory(@NonNull Cleaner cleaner) {
            this.f56292a = cleaner;
        }

        @NonNull
        @KeepForSdk
        /* renamed from: a */
        public CloseGuard mo64546a(@NonNull Object obj, int i, @NonNull Runnable runnable) {
            return new CloseGuard(obj, i, this.f56292a, runnable, zznb.m61542b("common"));
        }
    }

    CloseGuard(Object obj, int i, Cleaner cleaner, Runnable runnable, zzmq zzmq) {
        this.f56290c = obj.toString();
        this.f56291d = cleaner.mo64542b(obj, new zze(this, i, zzmq, runnable));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo64544b(int i, zzmq zzmq, Runnable runnable) {
        if (!this.f56289a.get()) {
            Log.e("MlKitCloseGuard", String.format(Locale.ENGLISH, "%s has not been closed", new Object[]{this.f56290c}));
            zzja zzja = new zzja();
            zziv zziv = new zziv();
            zziv.mo51880b(zziu.m61370b(i));
            zzja.mo51887h(zziv.mo51881c());
            zzmq.mo52010d(zzmt.m61528f(zzja), zziz.HANDLE_LEAKED);
        }
        runnable.run();
    }

    public final void close() {
        this.f56289a.set(true);
        this.f56291d.mo64543a();
    }
}
