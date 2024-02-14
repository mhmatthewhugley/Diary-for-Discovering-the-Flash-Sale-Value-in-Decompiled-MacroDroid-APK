package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class UserProfileChangeRequest extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<UserProfileChangeRequest> CREATOR = new zzal();
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    private String f4559a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private String f4560c;
    @SafeParcelable.Field

    /* renamed from: d */
    private boolean f4561d;
    @SafeParcelable.Field

    /* renamed from: f */
    private boolean f4562f;
    @Nullable

    /* renamed from: g */
    private Uri f4563g;

    /* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
    public static class Builder {
        @Nullable

        /* renamed from: a */
        private String f4564a;
        @Nullable

        /* renamed from: b */
        private Uri f4565b;

        /* renamed from: c */
        private boolean f4566c;

        /* renamed from: d */
        private boolean f4567d;

        @NonNull
        /* renamed from: a */
        public UserProfileChangeRequest mo22722a() {
            String str;
            String str2 = this.f4564a;
            Uri uri = this.f4565b;
            if (uri == null) {
                str = null;
            } else {
                str = uri.toString();
            }
            return new UserProfileChangeRequest(str2, str, this.f4566c, this.f4567d);
        }

        @NonNull
        /* renamed from: b */
        public Builder mo22723b(@Nullable String str) {
            if (str == null) {
                this.f4566c = true;
            } else {
                this.f4564a = str;
            }
            return this;
        }

        @NonNull
        /* renamed from: c */
        public Builder mo22724c(@Nullable Uri uri) {
            if (uri == null) {
                this.f4567d = true;
            } else {
                this.f4565b = uri;
            }
            return this;
        }
    }

    @SafeParcelable.Constructor
    UserProfileChangeRequest(@SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @Nullable String str2, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2) {
        this.f4559a = str;
        this.f4560c = str2;
        this.f4561d = z;
        this.f4562f = z2;
        this.f4563g = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    /* renamed from: a */
    public final boolean mo22716a() {
        return this.f4562f;
    }

    @Nullable
    /* renamed from: l2 */
    public Uri mo22717l2() {
        return this.f4563g;
    }

    /* renamed from: m2 */
    public final boolean mo22718m2() {
        return this.f4561d;
    }

    @Nullable
    /* renamed from: p0 */
    public String mo22719p0() {
        return this.f4559a;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, mo22719p0(), false);
        SafeParcelWriter.m4586x(parcel, 3, this.f4560c, false);
        SafeParcelWriter.m4565c(parcel, 4, this.f4561d);
        SafeParcelWriter.m4565c(parcel, 5, this.f4562f);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @Nullable
    public final String zza() {
        return this.f4560c;
    }
}
