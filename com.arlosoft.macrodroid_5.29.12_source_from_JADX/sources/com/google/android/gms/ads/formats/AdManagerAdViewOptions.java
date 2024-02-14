package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzbnu;
import com.google.android.gms.internal.ads.zzbnv;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class AdManagerAdViewOptions extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<AdManagerAdViewOptions> CREATOR = new zzc();
    @SafeParcelable.Field

    /* renamed from: a */
    private final boolean f1742a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private final IBinder f1743c;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public static final class Builder {

        /* renamed from: a */
        private boolean f1744a = false;
    }

    @SafeParcelable.Constructor
    AdManagerAdViewOptions(@SafeParcelable.Param boolean z, @SafeParcelable.Param @Nullable IBinder iBinder) {
        this.f1742a = z;
        this.f1743c = iBinder;
    }

    /* renamed from: l2 */
    public boolean mo19781l2() {
        return this.f1742a;
    }

    @Nullable
    /* renamed from: m2 */
    public final zzbnv mo19782m2() {
        IBinder iBinder = this.f1743c;
        if (iBinder == null) {
            return null;
        }
        return zzbnu.m43818Jb(iBinder);
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4565c(parcel, 1, mo19781l2());
        SafeParcelWriter.m4575m(parcel, 2, this.f1743c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
