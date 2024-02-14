package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialRequest> CREATOR = new zzg();
    @SafeParcelable.Field

    /* renamed from: a */
    private final int f2760a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final boolean f2761c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final String[] f2762d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final CredentialPickerConfig f2763f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final CredentialPickerConfig f2764g;
    @SafeParcelable.Field

    /* renamed from: o */
    private final boolean f2765o;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: p */
    private final String f2766p;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: s */
    private final String f2767s;
    @SafeParcelable.Field

    /* renamed from: z */
    private final boolean f2768z;

    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f2769a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String[] f2770b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public CredentialPickerConfig f2771c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public CredentialPickerConfig f2772d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f2773e = false;

        /* renamed from: f */
        private boolean f2774f = false;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: g */
        public String f2775g = null;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: h */
        public String f2776h;

        /* renamed from: a */
        public final CredentialRequest mo20835a() {
            if (this.f2770b == null) {
                this.f2770b = new String[0];
            }
            if (this.f2769a || this.f2770b.length != 0) {
                return new CredentialRequest(this);
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }

        /* renamed from: b */
        public final Builder mo20836b(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            this.f2770b = strArr;
            return this;
        }

        /* renamed from: c */
        public final Builder mo20837c(boolean z) {
            this.f2769a = z;
            return this;
        }
    }

    @SafeParcelable.Constructor
    CredentialRequest(@SafeParcelable.Param int i, @SafeParcelable.Param boolean z, @SafeParcelable.Param String[] strArr, @SafeParcelable.Param @Nullable CredentialPickerConfig credentialPickerConfig, @SafeParcelable.Param @Nullable CredentialPickerConfig credentialPickerConfig2, @SafeParcelable.Param boolean z2, @SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @Nullable String str2, @SafeParcelable.Param boolean z3) {
        this.f2760a = i;
        this.f2761c = z;
        this.f2762d = (String[]) Preconditions.m4488k(strArr);
        this.f2763f = credentialPickerConfig == null ? new CredentialPickerConfig.Builder().mo20826a() : credentialPickerConfig;
        this.f2764g = credentialPickerConfig2 == null ? new CredentialPickerConfig.Builder().mo20826a() : credentialPickerConfig2;
        if (i < 3) {
            this.f2765o = true;
            this.f2766p = null;
            this.f2767s = null;
        } else {
            this.f2765o = z2;
            this.f2766p = str;
            this.f2767s = str2;
        }
        this.f2768z = z3;
    }

    @NonNull
    /* renamed from: l2 */
    public final String[] mo20827l2() {
        return this.f2762d;
    }

    @NonNull
    /* renamed from: m2 */
    public final CredentialPickerConfig mo20828m2() {
        return this.f2764g;
    }

    @NonNull
    /* renamed from: n2 */
    public final CredentialPickerConfig mo20829n2() {
        return this.f2763f;
    }

    @Nullable
    /* renamed from: o2 */
    public final String mo20830o2() {
        return this.f2767s;
    }

    @Nullable
    /* renamed from: p2 */
    public final String mo20831p2() {
        return this.f2766p;
    }

    /* renamed from: q2 */
    public final boolean mo20832q2() {
        return this.f2765o;
    }

    /* renamed from: r2 */
    public final boolean mo20833r2() {
        return this.f2761c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4565c(parcel, 1, mo20833r2());
        SafeParcelWriter.m4587y(parcel, 2, mo20827l2(), false);
        SafeParcelWriter.m4584v(parcel, 3, mo20829n2(), i, false);
        SafeParcelWriter.m4584v(parcel, 4, mo20828m2(), i, false);
        SafeParcelWriter.m4565c(parcel, 5, mo20832q2());
        SafeParcelWriter.m4586x(parcel, 6, mo20831p2(), false);
        SafeParcelWriter.m4586x(parcel, 7, mo20830o2(), false);
        SafeParcelWriter.m4565c(parcel, 8, this.f2768z);
        SafeParcelWriter.m4576n(parcel, 1000, this.f2760a);
        SafeParcelWriter.m4564b(parcel, a);
    }

    private CredentialRequest(Builder builder) {
        this(4, builder.f2769a, builder.f2770b, builder.f2771c, builder.f2772d, builder.f2773e, builder.f2775g, builder.f2776h, false);
    }
}
