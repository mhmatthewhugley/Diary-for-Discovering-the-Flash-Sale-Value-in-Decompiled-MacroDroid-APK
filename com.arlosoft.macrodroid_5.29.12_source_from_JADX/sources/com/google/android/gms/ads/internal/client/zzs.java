package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f2034a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final int f2035c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final String f2036d;
    @SafeParcelable.Field

    /* renamed from: f */
    public final long f2037f;

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param String str, @SafeParcelable.Param long j) {
        this.f2034a = i;
        this.f2035c = i2;
        this.f2036d = str;
        this.f2037f = j;
    }

    /* renamed from: l2 */
    public static zzs m2423l2(JSONObject jSONObject) throws JSONException {
        return new zzs(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f2034a);
        SafeParcelWriter.m4576n(parcel, 2, this.f2035c);
        SafeParcelWriter.m4586x(parcel, 3, this.f2036d, false);
        SafeParcelWriter.m4581s(parcel, 4, this.f2037f);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
