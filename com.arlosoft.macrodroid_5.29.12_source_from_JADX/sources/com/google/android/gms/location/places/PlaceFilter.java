package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@SafeParcelable.Class
@SafeParcelable.Reserved
@Deprecated
public final class PlaceFilter extends zzb {
    public static final Parcelable.Creator<PlaceFilter> CREATOR = new zzi();

    /* renamed from: s */
    private static final PlaceFilter f45896s = new PlaceFilter();
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    private final List<Integer> f45897a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final boolean f45898c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private final List<zzp> f45899d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    private final List<String> f45900f;
    @NonNull

    /* renamed from: g */
    private final Set<Integer> f45901g;
    @NonNull

    /* renamed from: o */
    private final Set<zzp> f45902o;
    @NonNull

    /* renamed from: p */
    private final Set<String> f45903p;

    @ShowFirstParty
    @Deprecated
    public static final class zzb {

        /* renamed from: a */
        private Collection<Integer> f45904a;

        /* renamed from: b */
        private boolean f45905b;

        /* renamed from: c */
        private Collection<zzp> f45906c;

        /* renamed from: d */
        private String[] f45907d;

        private zzb() {
            this.f45904a = null;
            this.f45905b = false;
            this.f45906c = null;
            this.f45907d = null;
        }
    }

    public PlaceFilter() {
        this(false, (Collection<String>) null);
    }

    @ShowFirstParty
    @Deprecated
    /* renamed from: n2 */
    public static PlaceFilter m64709n2() {
        new zzb();
        return new PlaceFilter((List<Integer>) null, false, (List<String>) null, (List<zzp>) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceFilter)) {
            return false;
        }
        PlaceFilter placeFilter = (PlaceFilter) obj;
        return this.f45901g.equals(placeFilter.f45901g) && this.f45898c == placeFilter.f45898c && this.f45902o.equals(placeFilter.f45902o) && this.f45903p.equals(placeFilter.f45903p);
    }

    public final int hashCode() {
        return Objects.m4471b(this.f45901g, Boolean.valueOf(this.f45898c), this.f45902o, this.f45903p);
    }

    public final String toString() {
        Objects.ToStringHelper c = Objects.m4472c(this);
        if (!this.f45901g.isEmpty()) {
            c.mo21720a("types", this.f45901g);
        }
        c.mo21720a("requireOpenNow", Boolean.valueOf(this.f45898c));
        if (!this.f45903p.isEmpty()) {
            c.mo21720a("placeIds", this.f45903p);
        }
        if (!this.f45902o.isEmpty()) {
            c.mo21720a("requestedUserDataTypes", this.f45902o);
        }
        return c.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4578p(parcel, 1, this.f45897a, false);
        SafeParcelWriter.m4565c(parcel, 3, this.f45898c);
        SafeParcelWriter.m4558B(parcel, 4, this.f45899d, false);
        SafeParcelWriter.m4588z(parcel, 6, this.f45900f, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public PlaceFilter(boolean z, @Nullable Collection<String> collection) {
        this((Collection<Integer>) null, z, collection, (Collection<zzp>) null);
    }

    @ShowFirstParty
    private PlaceFilter(@Nullable Collection<Integer> collection, boolean z, @Nullable Collection<String> collection2, @Nullable Collection<zzp> collection3) {
        this((List<Integer>) zzb.m64809l2((Collection) null), z, zzb.m64809l2(collection2), (List<zzp>) zzb.m64809l2((Collection) null));
    }

    @SafeParcelable.Constructor
    PlaceFilter(@SafeParcelable.Param @Nullable List<Integer> list, @SafeParcelable.Param boolean z, @SafeParcelable.Param @Nullable List<String> list2, @SafeParcelable.Param @Nullable List<zzp> list3) {
        this.f45897a = list;
        this.f45898c = z;
        this.f45899d = list3;
        this.f45900f = list2;
        this.f45901g = zzb.m64810m2(list);
        this.f45902o = zzb.m64810m2(list3);
        this.f45903p = zzb.m64810m2(list2);
    }
}
