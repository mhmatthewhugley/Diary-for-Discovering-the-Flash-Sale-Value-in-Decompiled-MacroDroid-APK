package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.zze;

@SafeParcelable.Class
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztk */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zztk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zztk> CREATOR = new zztl();
    @SafeParcelable.Field

    /* renamed from: a */
    private final Status f40429a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final zze f40430c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final String f40431d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final String f40432f;

    @SafeParcelable.Constructor
    public zztk(@SafeParcelable.Param Status status, @SafeParcelable.Param zze zze, @SafeParcelable.Param String str, @SafeParcelable.Param @Nullable String str2) {
        this.f40429a = status;
        this.f40430c = zze;
        this.f40431d = str;
        this.f40432f = str2;
    }

    /* renamed from: l2 */
    public final Status mo49897l2() {
        return this.f40429a;
    }

    /* renamed from: m2 */
    public final zze mo49898m2() {
        return this.f40430c;
    }

    /* renamed from: n2 */
    public final String mo49899n2() {
        return this.f40431d;
    }

    /* renamed from: o2 */
    public final String mo49900o2() {
        return this.f40432f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, this.f40429a, i, false);
        SafeParcelWriter.m4584v(parcel, 2, this.f40430c, i, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f40431d, false);
        SafeParcelWriter.m4586x(parcel, 4, this.f40432f, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
