package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorSession;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SafeParcelable.Class
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzag extends MultiFactorSession {
    public static final Parcelable.Creator<zzag> CREATOR = new zzah();
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    private String f4589a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private String f4590c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private List f4591d;

    private zzag() {
    }

    /* renamed from: l2 */
    public static zzag m6165l2(String str) {
        Preconditions.m4484g(str);
        zzag zzag = new zzag();
        zzag.f4589a = str;
        return zzag;
    }

    /* renamed from: m2 */
    public static zzag m6166m2(List list, String str) {
        Preconditions.m4488k(list);
        Preconditions.m4484g(str);
        zzag zzag = new zzag();
        zzag.f4591d = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it.next();
            if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                zzag.f4591d.add((PhoneMultiFactorInfo) multiFactorInfo);
            }
        }
        zzag.f4590c = str;
        return zzag;
    }

    @Nullable
    /* renamed from: n2 */
    public final String mo22739n2() {
        return this.f4589a;
    }

    @Nullable
    /* renamed from: o2 */
    public final String mo22740o2() {
        return this.f4590c;
    }

    /* renamed from: p2 */
    public final boolean mo22741p2() {
        return this.f4589a != null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f4589a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f4590c, false);
        SafeParcelWriter.m4558B(parcel, 3, this.f4591d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzag(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param List list) {
        this.f4589a = str;
        this.f4590c = str2;
        this.f4591d = list;
    }
}
