package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new zzj();
    @SafeParcelable.Field

    /* renamed from: a */
    private final int f2778a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final CredentialPickerConfig f2779c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final boolean f2780d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final boolean f2781f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final String[] f2782g;
    @SafeParcelable.Field

    /* renamed from: o */
    private final boolean f2783o;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: p */
    private final String f2784p;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: s */
    private final String f2785s;

    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f2786a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f2787b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String[] f2788c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public CredentialPickerConfig f2789d = new CredentialPickerConfig.Builder().mo20826a();
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f2790e = false;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: f */
        public String f2791f;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: g */
        public String f2792g;

        /* renamed from: a */
        public final HintRequest mo20858a() {
            if (this.f2788c == null) {
                this.f2788c = new String[0];
            }
            if (this.f2786a || this.f2787b || this.f2788c.length != 0) {
                return new HintRequest(this);
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }

        /* renamed from: b */
        public final Builder mo20859b(boolean z) {
            this.f2786a = z;
            return this;
        }

        /* renamed from: c */
        public final Builder mo20860c(boolean z) {
            this.f2787b = z;
            return this;
        }
    }

    @SafeParcelable.Constructor
    HintRequest(@SafeParcelable.Param int i, @SafeParcelable.Param CredentialPickerConfig credentialPickerConfig, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param String[] strArr, @SafeParcelable.Param boolean z3, @SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @Nullable String str2) {
        this.f2778a = i;
        this.f2779c = (CredentialPickerConfig) Preconditions.m4488k(credentialPickerConfig);
        this.f2780d = z;
        this.f2781f = z2;
        this.f2782g = (String[]) Preconditions.m4488k(strArr);
        if (i < 2) {
            this.f2783o = true;
            this.f2784p = null;
            this.f2785s = null;
            return;
        }
        this.f2783o = z3;
        this.f2784p = str;
        this.f2785s = str2;
    }

    @NonNull
    /* renamed from: l2 */
    public final String[] mo20851l2() {
        return this.f2782g;
    }

    @NonNull
    /* renamed from: m2 */
    public final CredentialPickerConfig mo20852m2() {
        return this.f2779c;
    }

    @Nullable
    /* renamed from: n2 */
    public final String mo20853n2() {
        return this.f2785s;
    }

    @Nullable
    /* renamed from: o2 */
    public final String mo20854o2() {
        return this.f2784p;
    }

    /* renamed from: p2 */
    public final boolean mo20855p2() {
        return this.f2780d;
    }

    /* renamed from: q2 */
    public final boolean mo20856q2() {
        return this.f2783o;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, mo20852m2(), i, false);
        SafeParcelWriter.m4565c(parcel, 2, mo20855p2());
        SafeParcelWriter.m4565c(parcel, 3, this.f2781f);
        SafeParcelWriter.m4587y(parcel, 4, mo20851l2(), false);
        SafeParcelWriter.m4565c(parcel, 5, mo20856q2());
        SafeParcelWriter.m4586x(parcel, 6, mo20854o2(), false);
        SafeParcelWriter.m4586x(parcel, 7, mo20853n2(), false);
        SafeParcelWriter.m4576n(parcel, 1000, this.f2778a);
        SafeParcelWriter.m4564b(parcel, a);
    }

    private HintRequest(Builder builder) {
        this(2, builder.f2789d, builder.f2786a, builder.f2787b, builder.f2788c, builder.f2790e, builder.f2791f, builder.f2792g);
    }
}
