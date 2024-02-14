package com.google.mlkit.common.sdkinternal;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import java.util.Map;

@KeepForSdk
/* compiled from: com.google.mlkit:common@@18.5.0 */
public abstract class LazyInstanceMap<K, V> {
    @GuardedBy("instances")

    /* renamed from: a */
    private final Map f56295a = new HashMap();

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public abstract V mo52014a(@NonNull K k);

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public V mo64548b(@NonNull K k) {
        synchronized (this.f56295a) {
            if (this.f56295a.containsKey(k)) {
                V v = this.f56295a.get(k);
                return v;
            }
            V a = mo52014a(k);
            this.f56295a.put(k, a);
            return a;
        }
    }
}
