package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new zzc();
    @SafeParcelable.Field

    /* renamed from: a */
    private final PasswordRequestOptions f2795a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final GoogleIdTokenRequestOptions f2796c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private final String f2797d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final boolean f2798f;

    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static final class Builder {

        /* renamed from: a */
        private PasswordRequestOptions f2799a = PasswordRequestOptions.m3259l2().mo20895b(false).mo20894a();

        /* renamed from: b */
        private GoogleIdTokenRequestOptions f2800b = GoogleIdTokenRequestOptions.m3252l2().mo20889b(false).mo20888a();
    }

    @SafeParcelable.Class
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new zzh();
        @SafeParcelable.Field

        /* renamed from: a */
        private final boolean f2801a;
        @SafeParcelable.Field
        @Nullable

        /* renamed from: c */
        private final String f2802c;
        @SafeParcelable.Field
        @Nullable

        /* renamed from: d */
        private final String f2803d;
        @SafeParcelable.Field

        /* renamed from: f */
        private final boolean f2804f;
        @SafeParcelable.Field
        @Nullable

        /* renamed from: g */
        private final String f2805g;
        @SafeParcelable.Field
        @Nullable

        /* renamed from: o */
        private final List<String> f2806o;

        /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
        public static final class Builder {

            /* renamed from: a */
            private boolean f2807a = false;
            @Nullable

            /* renamed from: b */
            private String f2808b = null;
            @Nullable

            /* renamed from: c */
            private String f2809c = null;

            /* renamed from: d */
            private boolean f2810d = true;
            @Nullable

            /* renamed from: e */
            private String f2811e = null;
            @Nullable

            /* renamed from: f */
            private List<String> f2812f = null;

            /* renamed from: a */
            public final GoogleIdTokenRequestOptions mo20888a() {
                return new GoogleIdTokenRequestOptions(this.f2807a, this.f2808b, this.f2809c, this.f2810d, (String) null, (List<String>) null);
            }

            /* renamed from: b */
            public final Builder mo20889b(boolean z) {
                this.f2807a = z;
                return this;
            }
        }

        @SafeParcelable.Constructor
        GoogleIdTokenRequestOptions(@SafeParcelable.Param boolean z, @SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @Nullable String str2, @SafeParcelable.Param boolean z2, @SafeParcelable.Param @Nullable String str3, @SafeParcelable.Param @Nullable List<String> list) {
            this.f2801a = z;
            if (z) {
                Preconditions.m4489l(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f2802c = str;
            this.f2803d = str2;
            this.f2804f = z2;
            this.f2806o = BeginSignInRequest.m3247o2(list);
            this.f2805g = str3;
        }

        /* renamed from: l2 */
        public static Builder m3252l2() {
            return new Builder();
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            if (this.f2801a != googleIdTokenRequestOptions.f2801a || !Objects.m4470a(this.f2802c, googleIdTokenRequestOptions.f2802c) || !Objects.m4470a(this.f2803d, googleIdTokenRequestOptions.f2803d) || this.f2804f != googleIdTokenRequestOptions.f2804f || !Objects.m4470a(this.f2805g, googleIdTokenRequestOptions.f2805g) || !Objects.m4470a(this.f2806o, googleIdTokenRequestOptions.f2806o)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Objects.m4471b(Boolean.valueOf(this.f2801a), this.f2802c, this.f2803d, Boolean.valueOf(this.f2804f), this.f2805g, this.f2806o);
        }

        /* renamed from: m2 */
        public final boolean mo20883m2() {
            return this.f2804f;
        }

        @Nullable
        /* renamed from: n2 */
        public final String mo20884n2() {
            return this.f2803d;
        }

        @Nullable
        /* renamed from: o2 */
        public final String mo20885o2() {
            return this.f2802c;
        }

        /* renamed from: p2 */
        public final boolean mo20886p2() {
            return this.f2801a;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = SafeParcelWriter.m4563a(parcel);
            SafeParcelWriter.m4565c(parcel, 1, mo20886p2());
            SafeParcelWriter.m4586x(parcel, 2, mo20885o2(), false);
            SafeParcelWriter.m4586x(parcel, 3, mo20884n2(), false);
            SafeParcelWriter.m4565c(parcel, 4, mo20883m2());
            SafeParcelWriter.m4586x(parcel, 5, this.f2805g, false);
            SafeParcelWriter.m4588z(parcel, 6, this.f2806o, false);
            SafeParcelWriter.m4564b(parcel, a);
        }
    }

    @SafeParcelable.Class
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new zzi();
        @SafeParcelable.Field

        /* renamed from: a */
        private final boolean f2813a;

        /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
        public static final class Builder {

            /* renamed from: a */
            private boolean f2814a = false;

            /* renamed from: a */
            public final PasswordRequestOptions mo20894a() {
                return new PasswordRequestOptions(this.f2814a);
            }

            /* renamed from: b */
            public final Builder mo20895b(boolean z) {
                this.f2814a = z;
                return this;
            }
        }

        @SafeParcelable.Constructor
        PasswordRequestOptions(@SafeParcelable.Param boolean z) {
            this.f2813a = z;
        }

        /* renamed from: l2 */
        public static Builder m3259l2() {
            return new Builder();
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof PasswordRequestOptions) && this.f2813a == ((PasswordRequestOptions) obj).f2813a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Objects.m4471b(Boolean.valueOf(this.f2813a));
        }

        /* renamed from: m2 */
        public final boolean mo20892m2() {
            return this.f2813a;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = SafeParcelWriter.m4563a(parcel);
            SafeParcelWriter.m4565c(parcel, 1, mo20892m2());
            SafeParcelWriter.m4564b(parcel, a);
        }
    }

    @SafeParcelable.Constructor
    BeginSignInRequest(@SafeParcelable.Param PasswordRequestOptions passwordRequestOptions, @SafeParcelable.Param GoogleIdTokenRequestOptions googleIdTokenRequestOptions, @SafeParcelable.Param @Nullable String str, @SafeParcelable.Param boolean z) {
        this.f2795a = (PasswordRequestOptions) Preconditions.m4488k(passwordRequestOptions);
        this.f2796c = (GoogleIdTokenRequestOptions) Preconditions.m4488k(googleIdTokenRequestOptions);
        this.f2797d = str;
        this.f2798f = z;
    }

    /* access modifiers changed from: private */
    @Nullable
    /* renamed from: o2 */
    public static List<String> m3247o2(@Nullable List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        return arrayList;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        if (!Objects.m4470a(this.f2795a, beginSignInRequest.f2795a) || !Objects.m4470a(this.f2796c, beginSignInRequest.f2796c) || !Objects.m4470a(this.f2797d, beginSignInRequest.f2797d) || this.f2798f != beginSignInRequest.f2798f) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.m4471b(this.f2795a, this.f2796c, this.f2797d, Boolean.valueOf(this.f2798f));
    }

    /* renamed from: l2 */
    public final GoogleIdTokenRequestOptions mo20877l2() {
        return this.f2796c;
    }

    /* renamed from: m2 */
    public final PasswordRequestOptions mo20878m2() {
        return this.f2795a;
    }

    /* renamed from: n2 */
    public final boolean mo20879n2() {
        return this.f2798f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, mo20878m2(), i, false);
        SafeParcelWriter.m4584v(parcel, 2, mo20877l2(), i, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f2797d, false);
        SafeParcelWriter.m4565c(parcel, 4, mo20879n2());
        SafeParcelWriter.m4564b(parcel, a);
    }
}
