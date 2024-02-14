package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.icing.zzbp;
import com.google.firebase.appindexing.Indexable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzac extends AbstractSafeParcelable implements Indexable.Metadata {
    public static final Parcelable.Creator<zzac> CREATOR = new zzx();
    @SafeParcelable.Field

    /* renamed from: a */
    private final boolean f53841a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final int f53842c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final String f53843d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final Bundle f53844f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final Bundle f53845g;

    @SafeParcelable.Constructor
    public zzac(@SafeParcelable.Param boolean z, @SafeParcelable.Param int i, @SafeParcelable.Param String str, @SafeParcelable.Param Bundle bundle, @SafeParcelable.Param Bundle bundle2) {
        this.f53841a = z;
        this.f53842c = i;
        this.f53843d = str;
        this.f53844f = bundle == null ? new Bundle() : bundle;
        bundle2 = bundle2 == null ? new Bundle() : bundle2;
        this.f53845g = bundle2;
        ClassLoader classLoader = zzac.class.getClassLoader();
        zzbp.m58638a(classLoader);
        bundle2.setClassLoader(classLoader);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzac)) {
            return false;
        }
        zzac zzac = (zzac) obj;
        return Objects.m4470a(Boolean.valueOf(this.f53841a), Boolean.valueOf(zzac.f53841a)) && Objects.m4470a(Integer.valueOf(this.f53842c), Integer.valueOf(zzac.f53842c)) && Objects.m4470a(this.f53843d, zzac.f53843d) && Thing.m74509p2(this.f53844f, zzac.f53844f) && Thing.m74509p2(this.f53845g, zzac.f53845g);
    }

    public final int hashCode() {
        return Objects.m4471b(Boolean.valueOf(this.f53841a), Integer.valueOf(this.f53842c), this.f53843d, Integer.valueOf(Thing.m74510q2(this.f53844f)), Integer.valueOf(Thing.m74510q2(this.f53845g)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("worksOffline: ");
        sb.append(this.f53841a);
        sb.append(", score: ");
        sb.append(this.f53842c);
        if (!this.f53843d.isEmpty()) {
            sb.append(", accountEmail: ");
            sb.append(this.f53843d);
        }
        Bundle bundle = this.f53844f;
        if (bundle != null && !bundle.isEmpty()) {
            sb.append(", Properties { ");
            Thing.m74508o2(this.f53844f, sb);
            sb.append("}");
        }
        if (!this.f53845g.isEmpty()) {
            sb.append(", embeddingProperties { ");
            Thing.m74508o2(this.f53845g, sb);
            sb.append("}");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4565c(parcel, 1, this.f53841a);
        SafeParcelWriter.m4576n(parcel, 2, this.f53842c);
        SafeParcelWriter.m4586x(parcel, 3, this.f53843d, false);
        SafeParcelWriter.m4567e(parcel, 4, this.f53844f, false);
        SafeParcelWriter.m4567e(parcel, 5, this.f53845g, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
