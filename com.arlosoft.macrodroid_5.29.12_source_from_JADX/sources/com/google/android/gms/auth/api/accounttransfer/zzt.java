package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.ArraySet;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SafeParcelable.Class
public class zzt extends zzaz {
    public static final Parcelable.Creator<zzt> CREATOR = new zzu();

    /* renamed from: s */
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> f2728s;
    @SafeParcelable.Indicator

    /* renamed from: a */
    private final Set<Integer> f2729a;
    @SafeParcelable.VersionField

    /* renamed from: c */
    private final int f2730c;
    @SafeParcelable.Field

    /* renamed from: d */
    private String f2731d;
    @SafeParcelable.Field

    /* renamed from: f */
    private int f2732f;
    @SafeParcelable.Field

    /* renamed from: g */
    private byte[] f2733g;
    @SafeParcelable.Field

    /* renamed from: o */
    private PendingIntent f2734o;
    @SafeParcelable.Field

    /* renamed from: p */
    private DeviceMetaData f2735p;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        f2728s = hashMap;
        hashMap.put("accountType", FastJsonResponse.Field.m4804p2("accountType", 2));
        hashMap.put(NotificationCompat.CATEGORY_STATUS, FastJsonResponse.Field.m4803o2(NotificationCompat.CATEGORY_STATUS, 3));
        hashMap.put("transferBytes", FastJsonResponse.Field.m4800l2("transferBytes", 4));
    }

    @SafeParcelable.Constructor
    zzt(@SafeParcelable.Indicator Set<Integer> set, @SafeParcelable.Param int i, @SafeParcelable.Param String str, @SafeParcelable.Param int i2, @SafeParcelable.Param byte[] bArr, @SafeParcelable.Param PendingIntent pendingIntent, @SafeParcelable.Param DeviceMetaData deviceMetaData) {
        this.f2729a = set;
        this.f2730c = i;
        this.f2731d = str;
        this.f2732f = i2;
        this.f2733g = bArr;
        this.f2734o = pendingIntent;
        this.f2735p = deviceMetaData;
    }

    /* renamed from: a */
    public /* synthetic */ Map mo20789a() {
        return f2728s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo20790b(FastJsonResponse.Field field) {
        int r2 = field.mo21901r2();
        if (r2 == 1) {
            return Integer.valueOf(this.f2730c);
        }
        if (r2 == 2) {
            return this.f2731d;
        }
        if (r2 == 3) {
            return Integer.valueOf(this.f2732f);
        }
        if (r2 == 4) {
            return this.f2733g;
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
        return this.f2729a.contains(Integer.valueOf(field.mo21901r2()));
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        Set<Integer> set = this.f2729a;
        if (set.contains(1)) {
            SafeParcelWriter.m4576n(parcel, 1, this.f2730c);
        }
        if (set.contains(2)) {
            SafeParcelWriter.m4586x(parcel, 2, this.f2731d, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.m4576n(parcel, 3, this.f2732f);
        }
        if (set.contains(4)) {
            SafeParcelWriter.m4569g(parcel, 4, this.f2733g, true);
        }
        if (set.contains(5)) {
            SafeParcelWriter.m4584v(parcel, 5, this.f2734o, i, true);
        }
        if (set.contains(6)) {
            SafeParcelWriter.m4584v(parcel, 6, this.f2735p, i, true);
        }
        SafeParcelWriter.m4564b(parcel, a);
    }

    public zzt() {
        this.f2729a = new ArraySet(3);
        this.f2730c = 1;
    }
}
