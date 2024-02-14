package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@SafeParcelable.Class
public class zzr extends zzaz {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();

    /* renamed from: p */
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> f2721p;
    @SafeParcelable.Indicator

    /* renamed from: a */
    private final Set<Integer> f2722a;
    @SafeParcelable.VersionField

    /* renamed from: c */
    private final int f2723c;
    @SafeParcelable.Field

    /* renamed from: d */
    private zzt f2724d;
    @SafeParcelable.Field

    /* renamed from: f */
    private String f2725f;
    @SafeParcelable.Field

    /* renamed from: g */
    private String f2726g;
    @SafeParcelable.Field

    /* renamed from: o */
    private String f2727o;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        f2721p = hashMap;
        hashMap.put("authenticatorInfo", FastJsonResponse.Field.m4801m2("authenticatorInfo", 2, zzt.class));
        hashMap.put("signature", FastJsonResponse.Field.m4804p2("signature", 3));
        hashMap.put("package", FastJsonResponse.Field.m4804p2("package", 4));
    }

    public zzr() {
        this.f2722a = new HashSet(3);
        this.f2723c = 1;
    }

    /* renamed from: a */
    public /* synthetic */ Map mo20789a() {
        return f2721p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo20790b(FastJsonResponse.Field field) {
        int r2 = field.mo21901r2();
        if (r2 == 1) {
            return Integer.valueOf(this.f2723c);
        }
        if (r2 == 2) {
            return this.f2724d;
        }
        if (r2 == 3) {
            return this.f2725f;
        }
        if (r2 == 4) {
            return this.f2726g;
        }
        int r22 = field.mo21901r2();
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(r22);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo20791d(FastJsonResponse.Field field) {
        return this.f2722a.contains(Integer.valueOf(field.mo21901r2()));
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        Set<Integer> set = this.f2722a;
        if (set.contains(1)) {
            SafeParcelWriter.m4576n(parcel, 1, this.f2723c);
        }
        if (set.contains(2)) {
            SafeParcelWriter.m4584v(parcel, 2, this.f2724d, i, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.m4586x(parcel, 3, this.f2725f, true);
        }
        if (set.contains(4)) {
            SafeParcelWriter.m4586x(parcel, 4, this.f2726g, true);
        }
        if (set.contains(5)) {
            SafeParcelWriter.m4586x(parcel, 5, this.f2727o, true);
        }
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzr(@SafeParcelable.Indicator Set<Integer> set, @SafeParcelable.Param int i, @SafeParcelable.Param zzt zzt, @SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3) {
        this.f2722a = set;
        this.f2723c = i;
        this.f2724d = zzt;
        this.f2725f = str;
        this.f2726g = str2;
        this.f2727o = str3;
    }
}
