package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.HashMap;

@KeepForSdk
@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.FieldConverter<String, Integer> {
    @NonNull
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new zad();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f3853a;

    /* renamed from: c */
    private final HashMap f3854c;

    /* renamed from: d */
    private final SparseArray f3855d;

    @KeepForSdk
    public StringToIntConverter() {
        this.f3853a = 1;
        this.f3854c = new HashMap();
        this.f3855d = new SparseArray();
    }

    @NonNull
    @KeepForSdk
    @CanIgnoreReturnValue
    /* renamed from: l2 */
    public StringToIntConverter mo21886l2(@NonNull String str, int i) {
        this.f3854c.put(str, Integer.valueOf(i));
        this.f3855d.put(i, str);
        return this;
    }

    @NonNull
    /* renamed from: s1 */
    public final /* bridge */ /* synthetic */ Object mo21887s1(@NonNull Object obj) {
        String str = (String) this.f3855d.get(((Integer) obj).intValue());
        if (str != null || !this.f3854c.containsKey("gms_unknown")) {
            return str;
        }
        return "gms_unknown";
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f3853a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f3854c.keySet()) {
            arrayList.add(new zac(str, ((Integer) this.f3854c.get(str)).intValue()));
        }
        SafeParcelWriter.m4558B(parcel, 2, arrayList, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    StringToIntConverter(@SafeParcelable.Param int i, @SafeParcelable.Param ArrayList arrayList) {
        this.f3853a = i;
        this.f3854c = new HashMap();
        this.f3855d = new SparseArray();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zac zac = (zac) arrayList.get(i2);
            mo21886l2(zac.f3859c, zac.f3860d);
        }
    }
}
