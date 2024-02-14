package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzt */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzzt> CREATOR = new zzzu();
    @SafeParcelable.Field

    /* renamed from: a */
    private final List f40741a;

    public zzzt() {
        this.f40741a = new ArrayList();
    }

    /* renamed from: l2 */
    public static zzzt m58568l2(zzzt zzzt) {
        Preconditions.m4488k(zzzt);
        List list = zzzt.f40741a;
        zzzt zzzt2 = new zzzt();
        if (list != null && !list.isEmpty()) {
            zzzt2.f40741a.addAll(list);
        }
        return zzzt2;
    }

    /* renamed from: m2 */
    public final List mo50135m2() {
        return this.f40741a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4558B(parcel, 2, this.f40741a, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzzt(@SafeParcelable.Param List list) {
        List list2;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = Collections.unmodifiableList(list);
        }
        this.f40741a = list2;
    }
}
