package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.icing.zzbp;
import com.google.firebase.appindexing.Action;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzc extends AbstractSafeParcelable implements Action {
    public static final Parcelable.Creator<zzc> CREATOR = new zzd();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f53853a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f53854c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final String f53855d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final String f53856f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final zzb f53857g;
    @SafeParcelable.Field

    /* renamed from: o */
    private final String f53858o;
    @SafeParcelable.Field

    /* renamed from: p */
    private final Bundle f53859p;

    @SafeParcelable.Constructor
    public zzc(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param zzb zzb, @SafeParcelable.Param String str5, @SafeParcelable.Param Bundle bundle) {
        this.f53853a = str;
        this.f53854c = str2;
        this.f53855d = str3;
        this.f53856f = str4;
        this.f53857g = zzb;
        this.f53858o = str5;
        if (bundle != null) {
            this.f53859p = bundle;
        } else {
            this.f53859p = Bundle.EMPTY;
        }
        ClassLoader classLoader = zzc.class.getClassLoader();
        zzbp.m58638a(classLoader);
        this.f53859p.setClassLoader(classLoader);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActionImpl { { actionType: '");
        sb.append(this.f53853a);
        sb.append("' } { objectName: '");
        sb.append(this.f53854c);
        sb.append("' } { objectUrl: '");
        sb.append(this.f53855d);
        sb.append("' } ");
        if (this.f53856f != null) {
            sb.append("{ objectSameAs: '");
            sb.append(this.f53856f);
            sb.append("' } ");
        }
        if (this.f53857g != null) {
            sb.append("{ metadata: '");
            sb.append(this.f53857g.toString());
            sb.append("' } ");
        }
        if (this.f53858o != null) {
            sb.append("{ actionStatus: '");
            sb.append(this.f53858o);
            sb.append("' } ");
        }
        if (!this.f53859p.isEmpty()) {
            sb.append("{ ");
            sb.append(this.f53859p);
            sb.append(" } ");
        }
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f53853a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f53854c, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f53855d, false);
        SafeParcelWriter.m4586x(parcel, 4, this.f53856f, false);
        SafeParcelWriter.m4584v(parcel, 5, this.f53857g, i, false);
        SafeParcelWriter.m4586x(parcel, 6, this.f53858o, false);
        SafeParcelWriter.m4567e(parcel, 7, this.f53859p, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
