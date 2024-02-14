package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@ShowFirstParty
@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new zao();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f3905a;

    /* renamed from: c */
    private final HashMap f3906c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final String f3907d;

    @SafeParcelable.Constructor
    zan(@SafeParcelable.Param int i, @SafeParcelable.Param ArrayList arrayList, @SafeParcelable.Param String str) {
        this.f3905a = i;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zal = (zal) arrayList.get(i2);
            String str2 = zal.f3900c;
            HashMap hashMap2 = new HashMap();
            int size2 = ((ArrayList) Preconditions.m4488k(zal.f3901d)).size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zam = (zam) zal.f3901d.get(i3);
                hashMap2.put(zam.f3903c, zam.f3904d);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f3906c = hashMap;
        this.f3907d = (String) Preconditions.m4488k(str);
        mo21923n2();
    }

    /* renamed from: l2 */
    public final String mo21921l2() {
        return this.f3907d;
    }

    @Nullable
    /* renamed from: m2 */
    public final Map mo21922m2(String str) {
        return (Map) this.f3906c.get(str);
    }

    /* renamed from: n2 */
    public final void mo21923n2() {
        for (String str : this.f3906c.keySet()) {
            Map map = (Map) this.f3906c.get(str);
            for (String str2 : map.keySet()) {
                ((FastJsonResponse.Field) map.get(str2)).mo21908x2(this);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f3906c.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) this.f3906c.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f3905a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f3906c.keySet()) {
            arrayList.add(new zal(str, (Map) this.f3906c.get(str)));
        }
        SafeParcelWriter.m4558B(parcel, 2, arrayList, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f3907d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
