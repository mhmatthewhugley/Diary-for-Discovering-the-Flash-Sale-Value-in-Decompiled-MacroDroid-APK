package com.google.android.gms.common.stats;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@KeepForSdk
@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface Types {
    }

    /* renamed from: a */
    public abstract long mo21941a();

    @NonNull
    /* renamed from: l2 */
    public abstract String mo21942l2();

    @NonNull
    public final String toString() {
        long a = mo21941a();
        int zza = zza();
        long zzb = zzb();
        String l2 = mo21942l2();
        return a + "\t" + zza + "\t" + zzb + l2;
    }

    public abstract int zza();

    public abstract long zzb();
}
