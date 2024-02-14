package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@SafeParcelable.Class
public final class zzl extends zzaz {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();

    /* renamed from: o */
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> f2708o;
    @SafeParcelable.Indicator

    /* renamed from: a */
    private final Set<Integer> f2709a;
    @SafeParcelable.VersionField

    /* renamed from: c */
    private final int f2710c;
    @SafeParcelable.Field

    /* renamed from: d */
    private ArrayList<zzr> f2711d;
    @SafeParcelable.Field

    /* renamed from: f */
    private int f2712f;
    @SafeParcelable.Field

    /* renamed from: g */
    private zzo f2713g;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        f2708o = hashMap;
        hashMap.put("authenticatorData", FastJsonResponse.Field.m4802n2("authenticatorData", 2, zzr.class));
        hashMap.put("progress", FastJsonResponse.Field.m4801m2("progress", 4, zzo.class));
    }

    @SafeParcelable.Constructor
    zzl(@SafeParcelable.Indicator Set<Integer> set, @SafeParcelable.Param int i, @SafeParcelable.Param ArrayList<zzr> arrayList, @SafeParcelable.Param int i2, @SafeParcelable.Param zzo zzo) {
        this.f2709a = set;
        this.f2710c = i;
        this.f2711d = arrayList;
        this.f2712f = i2;
        this.f2713g = zzo;
    }

    /* renamed from: a */
    public final /* synthetic */ Map mo20789a() {
        return f2708o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo20790b(FastJsonResponse.Field field) {
        int r2 = field.mo21901r2();
        if (r2 == 1) {
            return Integer.valueOf(this.f2710c);
        }
        if (r2 == 2) {
            return this.f2711d;
        }
        if (r2 == 4) {
            return this.f2713g;
        }
        int r22 = field.mo21901r2();
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(r22);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo20791d(FastJsonResponse.Field field) {
        return this.f2709a.contains(Integer.valueOf(field.mo21901r2()));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        Set<Integer> set = this.f2709a;
        if (set.contains(1)) {
            SafeParcelWriter.m4576n(parcel, 1, this.f2710c);
        }
        if (set.contains(2)) {
            SafeParcelWriter.m4558B(parcel, 2, this.f2711d, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.m4576n(parcel, 3, this.f2712f);
        }
        if (set.contains(4)) {
            SafeParcelWriter.m4584v(parcel, 4, this.f2713g, i, true);
        }
        SafeParcelWriter.m4564b(parcel, a);
    }

    public zzl() {
        this.f2709a = new HashSet(1);
        this.f2710c = 1;
    }
}
