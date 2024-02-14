package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public class Cleaner {

    /* renamed from: a */
    private final ReferenceQueue f56287a = new ReferenceQueue();

    /* renamed from: b */
    private final Set f56288b = Collections.synchronizedSet(new HashSet());

    /* compiled from: com.google.mlkit:common@@18.5.0 */
    public interface Cleanable {
        @KeepForSdk
        /* renamed from: a */
        void mo64543a();
    }

    private Cleaner() {
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static Cleaner m79023a() {
        Cleaner cleaner = new Cleaner();
        cleaner.mo64542b(cleaner, zzb.f56397a);
        Thread thread = new Thread(new zza(cleaner.f56287a, cleaner.f56288b), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return cleaner;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public Cleanable mo64542b(@NonNull Object obj, @NonNull Runnable runnable) {
        zzd zzd = new zzd(obj, this.f56287a, this.f56288b, runnable, (zzc) null);
        this.f56288b.add(zzd);
        return zzd;
    }
}
