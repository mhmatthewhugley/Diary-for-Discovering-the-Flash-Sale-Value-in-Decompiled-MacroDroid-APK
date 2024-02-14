package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorResolver;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SafeParcelable.Class
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzae extends MultiFactorResolver {
    public static final Parcelable.Creator<zzae> CREATOR = new zzaf();
    @SafeParcelable.Field

    /* renamed from: a */
    private final List f4584a = new ArrayList();
    @SafeParcelable.Field

    /* renamed from: c */
    private final zzag f4585c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final String f4586d;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: f */
    public final zze f4587f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final zzx f4588g;

    @SafeParcelable.Constructor
    public zzae(@SafeParcelable.Param List list, @SafeParcelable.Param zzag zzag, @SafeParcelable.Param String str, @SafeParcelable.Param @Nullable zze zze, @SafeParcelable.Param @Nullable zzx zzx) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it.next();
            if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                this.f4584a.add((PhoneMultiFactorInfo) multiFactorInfo);
            }
        }
        this.f4585c = (zzag) Preconditions.m4488k(zzag);
        this.f4586d = Preconditions.m4484g(str);
        this.f4587f = zze;
        this.f4588g = zzx;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4558B(parcel, 1, this.f4584a, false);
        SafeParcelWriter.m4584v(parcel, 2, this.f4585c, i, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f4586d, false);
        SafeParcelWriter.m4584v(parcel, 4, this.f4587f, i, false);
        SafeParcelWriter.m4584v(parcel, 5, this.f4588g, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
