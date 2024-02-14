package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.CapabilityInfo;
import com.google.android.gms.wearable.Node;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzao extends AbstractSafeParcelable implements CapabilityInfo {
    public static final Parcelable.Creator<zzao> CREATOR = new zzap();

    /* renamed from: a */
    private final Object f48135a = new Object();
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f48136c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final List f48137d;

    /* renamed from: f */
    private Set f48138f;

    @SafeParcelable.Constructor
    public zzao(@SafeParcelable.Param String str, @SafeParcelable.Param List list) {
        this.f48136c = str;
        this.f48137d = list;
        this.f48138f = null;
        Preconditions.m4488k(str);
        Preconditions.m4488k(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzao.class != obj.getClass()) {
            return false;
        }
        zzao zzao = (zzao) obj;
        String str = this.f48136c;
        if (str == null ? zzao.f48136c != null : !str.equals(zzao.f48136c)) {
            return false;
        }
        List list = this.f48137d;
        return list == null ? zzao.f48137d == null : list.equals(zzao.f48137d);
    }

    public final String getName() {
        return this.f48136c;
    }

    public final int hashCode() {
        String str = this.f48136c;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        List list = this.f48137d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: s */
    public final Set<Node> mo56178s() {
        Set<Node> set;
        synchronized (this.f48135a) {
            if (this.f48138f == null) {
                this.f48138f = new HashSet(this.f48137d);
            }
            set = this.f48138f;
        }
        return set;
    }

    public final String toString() {
        String str = this.f48136c;
        String valueOf = String.valueOf(this.f48137d);
        return "CapabilityInfo{" + str + ", " + valueOf + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, this.f48136c, false);
        SafeParcelWriter.m4558B(parcel, 3, this.f48137d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
