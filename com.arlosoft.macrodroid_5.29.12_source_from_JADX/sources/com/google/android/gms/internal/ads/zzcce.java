package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONArray;
import org.json.JSONException;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzcce extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcce> CREATOR = new zzccf();
    @SafeParcelable.Field

    /* renamed from: a */
    public final String f28207a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final int f28208c;

    @SafeParcelable.Constructor
    public zzcce(@SafeParcelable.Param String str, @SafeParcelable.Param int i) {
        this.f28207a = str;
        this.f28208c = i;
    }

    @Nullable
    /* renamed from: l2 */
    public static zzcce m44871l2(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzcce(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzcce)) {
            zzcce zzcce = (zzcce) obj;
            if (!Objects.m4470a(this.f28207a, zzcce.f28207a) || !Objects.m4470a(Integer.valueOf(this.f28208c), Integer.valueOf(zzcce.f28208c))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.m4471b(this.f28207a, Integer.valueOf(this.f28208c));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, this.f28207a, false);
        SafeParcelWriter.m4576n(parcel, 3, this.f28208c);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
