package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;

@SafeParcelable.Class
@Deprecated
public class AutocompleteFilter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AutocompleteFilter> CREATOR = new zzd();
    @SafeParcelable.VersionField

    /* renamed from: a */
    private final int f45886a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final boolean f45887c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final List<Integer> f45888d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final String f45889f;

    /* renamed from: g */
    private final int f45890g;

    public static final class Builder {

        /* renamed from: a */
        private boolean f45891a = false;

        /* renamed from: b */
        private int f45892b = 0;

        /* renamed from: c */
        private String f45893c = "";

        /* renamed from: a */
        public final AutocompleteFilter mo54237a() {
            return new AutocompleteFilter(1, false, Arrays.asList(new Integer[]{Integer.valueOf(this.f45892b)}), this.f45893c);
        }
    }

    @SafeParcelable.Constructor
    AutocompleteFilter(@SafeParcelable.Param int i, @SafeParcelable.Param boolean z, @SafeParcelable.Param List<Integer> list, @SafeParcelable.Param String str) {
        this.f45886a = i;
        this.f45888d = list;
        this.f45890g = (list == null || list.isEmpty()) ? 0 : list.iterator().next().intValue();
        this.f45889f = str;
        if (i <= 0) {
            this.f45887c = !z;
        } else {
            this.f45887c = z;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutocompleteFilter)) {
            return false;
        }
        AutocompleteFilter autocompleteFilter = (AutocompleteFilter) obj;
        return this.f45890g == autocompleteFilter.f45890g && this.f45887c == autocompleteFilter.f45887c && this.f45889f == autocompleteFilter.f45889f;
    }

    public int hashCode() {
        return Objects.m4471b(Boolean.valueOf(this.f45887c), Integer.valueOf(this.f45890g), this.f45889f);
    }

    public String toString() {
        return Objects.m4472c(this).mo21720a("includeQueryPredictions", Boolean.valueOf(this.f45887c)).mo21720a("typeFilter", Integer.valueOf(this.f45890g)).mo21720a("country", this.f45889f).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4565c(parcel, 1, this.f45887c);
        SafeParcelWriter.m4578p(parcel, 2, this.f45888d, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f45889f, false);
        SafeParcelWriter.m4576n(parcel, 1000, this.f45886a);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
