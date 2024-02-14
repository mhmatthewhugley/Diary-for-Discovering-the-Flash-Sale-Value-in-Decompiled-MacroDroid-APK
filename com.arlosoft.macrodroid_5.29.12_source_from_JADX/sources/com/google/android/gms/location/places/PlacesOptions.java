package com.google.android.gms.location.places;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import java.util.Locale;

@Deprecated
public final class PlacesOptions implements Api.ApiOptions.Optional {
    @Nullable

    /* renamed from: a */
    public final String f45932a;
    @Nullable

    /* renamed from: c */
    public final String f45933c;

    /* renamed from: d */
    public final int f45934d;
    @Nullable

    /* renamed from: f */
    public final String f45935f;
    @Nullable

    /* renamed from: g */
    private final Locale f45936g;

    public static class Builder {

        /* renamed from: a */
        private int f45937a = 0;

        /* renamed from: a */
        public PlacesOptions mo54262a() {
            return new PlacesOptions(this);
        }
    }

    private PlacesOptions(Builder builder) {
        this.f45932a = null;
        this.f45933c = null;
        this.f45934d = 0;
        this.f45935f = null;
        this.f45936g = null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlacesOptions) || !Objects.m4470a((Object) null, (Object) null) || !Objects.m4470a((Object) null, (Object) null) || !Objects.m4470a(0, 0) || !Objects.m4470a((Object) null, (Object) null) || !Objects.m4470a((Object) null, (Object) null)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.m4471b(null, null, 0, null, null);
    }
}
