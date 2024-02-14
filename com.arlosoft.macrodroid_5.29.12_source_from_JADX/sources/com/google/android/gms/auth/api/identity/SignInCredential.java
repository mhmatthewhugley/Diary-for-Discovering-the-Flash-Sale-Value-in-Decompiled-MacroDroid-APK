package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInCredential> CREATOR = new zzm();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f2822a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private final String f2823c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private final String f2824d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    private final String f2825f;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: g */
    private final Uri f2826g;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    private final String f2827o;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: p */
    private final String f2828p;

    @SafeParcelable.Constructor
    public SignInCredential(@SafeParcelable.Param String str, @SafeParcelable.Param @Nullable String str2, @SafeParcelable.Param @Nullable String str3, @SafeParcelable.Param @Nullable String str4, @SafeParcelable.Param @Nullable Uri uri, @SafeParcelable.Param @Nullable String str5, @SafeParcelable.Param @Nullable String str6) {
        this.f2822a = Preconditions.m4484g(str);
        this.f2823c = str2;
        this.f2824d = str3;
        this.f2825f = str4;
        this.f2826g = uri;
        this.f2827o = str5;
        this.f2828p = str6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        if (!Objects.m4470a(this.f2822a, signInCredential.f2822a) || !Objects.m4470a(this.f2823c, signInCredential.f2823c) || !Objects.m4470a(this.f2824d, signInCredential.f2824d) || !Objects.m4470a(this.f2825f, signInCredential.f2825f) || !Objects.m4470a(this.f2826g, signInCredential.f2826g) || !Objects.m4470a(this.f2827o, signInCredential.f2827o) || !Objects.m4470a(this.f2828p, signInCredential.f2828p)) {
            return false;
        }
        return true;
    }

    public final String getId() {
        return this.f2822a;
    }

    public final int hashCode() {
        return Objects.m4471b(this.f2822a, this.f2823c, this.f2824d, this.f2825f, this.f2826g, this.f2827o, this.f2828p);
    }

    @Nullable
    /* renamed from: l2 */
    public final String mo20914l2() {
        return this.f2825f;
    }

    @Nullable
    /* renamed from: m2 */
    public final String mo20915m2() {
        return this.f2824d;
    }

    @Nullable
    /* renamed from: n2 */
    public final String mo20916n2() {
        return this.f2828p;
    }

    @Nullable
    /* renamed from: o2 */
    public final String mo20917o2() {
        return this.f2827o;
    }

    @Nullable
    /* renamed from: p0 */
    public final String mo20918p0() {
        return this.f2823c;
    }

    @Nullable
    /* renamed from: p2 */
    public final Uri mo20919p2() {
        return this.f2826g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, getId(), false);
        SafeParcelWriter.m4586x(parcel, 2, mo20918p0(), false);
        SafeParcelWriter.m4586x(parcel, 3, mo20915m2(), false);
        SafeParcelWriter.m4586x(parcel, 4, mo20914l2(), false);
        SafeParcelWriter.m4584v(parcel, 5, mo20919p2(), i, false);
        SafeParcelWriter.m4586x(parcel, 6, mo20917o2(), false);
        SafeParcelWriter.m4586x(parcel, 7, mo20916n2(), false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
