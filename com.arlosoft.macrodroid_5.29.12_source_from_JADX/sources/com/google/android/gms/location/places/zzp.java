package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Set;

@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new zzo();

    /* renamed from: d */
    private static final zzp f46048d;

    /* renamed from: f */
    private static final zzp f46049f;

    /* renamed from: g */
    private static final zzp f46050g;

    /* renamed from: o */
    private static final Set<zzp> f46051o;
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f46052a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final int f46053c;

    static {
        zzp l2 = m64824l2("test_type", 1);
        f46048d = l2;
        zzp l22 = m64824l2("labeled_place", 6);
        f46049f = l22;
        zzp l23 = m64824l2("here_content", 7);
        f46050g = l23;
        f46051o = CollectionUtils.m4866f(l2, l22, l23);
    }

    @SafeParcelable.Constructor
    zzp(@SafeParcelable.Param String str, @SafeParcelable.Param int i) {
        Preconditions.m4484g(str);
        this.f46052a = str;
        this.f46053c = i;
    }

    /* renamed from: l2 */
    private static zzp m64824l2(String str, int i) {
        return new zzp(str, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzp)) {
            return false;
        }
        zzp zzp = (zzp) obj;
        return this.f46052a.equals(zzp.f46052a) && this.f46053c == zzp.f46053c;
    }

    public final int hashCode() {
        return this.f46052a.hashCode();
    }

    public final String toString() {
        return this.f46052a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f46052a, false);
        SafeParcelWriter.m4576n(parcel, 2, this.f46053c);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
