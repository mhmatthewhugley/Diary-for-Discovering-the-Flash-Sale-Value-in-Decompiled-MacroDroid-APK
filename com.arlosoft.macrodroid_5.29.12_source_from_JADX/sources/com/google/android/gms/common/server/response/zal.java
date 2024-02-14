package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.Map;

@ShowFirstParty
@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new zap();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f3899a;
    @SafeParcelable.Field

    /* renamed from: c */
    final String f3900c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    final ArrayList f3901d;

    @SafeParcelable.Constructor
    zal(@SafeParcelable.Param int i, @SafeParcelable.Param String str, @SafeParcelable.Param ArrayList arrayList) {
        this.f3899a = i;
        this.f3900c = str;
        this.f3901d = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f3899a);
        SafeParcelWriter.m4586x(parcel, 2, this.f3900c, false);
        SafeParcelWriter.m4558B(parcel, 3, this.f3901d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    zal(String str, Map map) {
        ArrayList arrayList;
        this.f3899a = 1;
        this.f3900c = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, (FastJsonResponse.Field) map.get(str2)));
            }
        }
        this.f3901d = arrayList;
    }
}
