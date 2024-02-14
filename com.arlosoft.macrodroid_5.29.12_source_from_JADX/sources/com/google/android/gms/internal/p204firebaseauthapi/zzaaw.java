package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaaw */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaaw> CREATOR = new zzaax();
    @SafeParcelable.VersionField

    /* renamed from: a */
    public final int f39544a;
    @SafeParcelable.Field

    /* renamed from: c */
    private List f39545c;

    public zzaaw() {
        this((List) null);
    }

    /* renamed from: l2 */
    public static zzaaw m56061l2(zzaaw zzaaw) {
        return new zzaaw(zzaaw.f39545c);
    }

    /* renamed from: m2 */
    public final List mo48805m2() {
        return this.f39545c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f39544a);
        SafeParcelWriter.m4588z(parcel, 2, this.f39545c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzaaw(@SafeParcelable.Param int i, @SafeParcelable.Param List list) {
        this.f39544a = i;
        if (list == null || list.isEmpty()) {
            this.f39545c = Collections.emptyList();
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            list.set(i2, Strings.m4911a((String) list.get(i2)));
        }
        this.f39545c = Collections.unmodifiableList(list);
    }

    public zzaaw(@Nullable List list) {
        this.f39544a = 1;
        this.f39545c = new ArrayList();
        if (list != null && !list.isEmpty()) {
            this.f39545c.addAll(list);
        }
    }
}
