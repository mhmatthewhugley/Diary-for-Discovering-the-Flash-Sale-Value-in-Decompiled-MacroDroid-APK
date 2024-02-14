package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class ActionCodeSettings extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ActionCodeSettings> CREATOR = new zzc();
    @SafeParcelable.Field

    /* renamed from: A */
    private String f4468A;
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f4469a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f4470c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final String f4471d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final String f4472f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final boolean f4473g;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    private final String f4474o;
    @SafeParcelable.Field

    /* renamed from: p */
    private final boolean f4475p;
    @SafeParcelable.Field

    /* renamed from: s */
    private String f4476s;
    @SafeParcelable.Field

    /* renamed from: z */
    private int f4477z;

    /* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f4478a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f4479b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f4480c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f4481d;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: e */
        public String f4482e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f4483f = false;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public String f4484g;

        private Builder() {
        }

        /* synthetic */ Builder(zza zza) {
        }

        @NonNull
        /* renamed from: a */
        public ActionCodeSettings mo22567a() {
            if (this.f4478a != null) {
                return new ActionCodeSettings(this);
            }
            throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
        }

        @NonNull
        /* renamed from: b */
        public Builder mo22568b(@NonNull String str, boolean z, @Nullable String str2) {
            this.f4480c = str;
            this.f4481d = z;
            this.f4482e = str2;
            return this;
        }

        @NonNull
        /* renamed from: c */
        public Builder mo22569c(boolean z) {
            this.f4483f = z;
            return this;
        }

        @NonNull
        /* renamed from: d */
        public Builder mo22570d(@NonNull String str) {
            this.f4479b = str;
            return this;
        }

        @NonNull
        /* renamed from: e */
        public Builder mo22571e(@NonNull String str) {
            this.f4478a = str;
            return this;
        }
    }

    private ActionCodeSettings(Builder builder) {
        this.f4469a = builder.f4478a;
        this.f4470c = builder.f4479b;
        this.f4471d = null;
        this.f4472f = builder.f4480c;
        this.f4473g = builder.f4481d;
        this.f4474o = builder.f4482e;
        this.f4475p = builder.f4483f;
        this.f4468A = builder.f4484g;
    }

    @NonNull
    /* renamed from: r2 */
    public static Builder m5929r2() {
        return new Builder((zza) null);
    }

    @NonNull
    /* renamed from: s2 */
    public static ActionCodeSettings m5930s2() {
        return new ActionCodeSettings(new Builder((zza) null));
    }

    /* renamed from: l2 */
    public boolean mo22554l2() {
        return this.f4475p;
    }

    /* renamed from: m2 */
    public boolean mo22555m2() {
        return this.f4473g;
    }

    @Nullable
    /* renamed from: n2 */
    public String mo22556n2() {
        return this.f4474o;
    }

    @Nullable
    /* renamed from: o2 */
    public String mo22557o2() {
        return this.f4472f;
    }

    @Nullable
    /* renamed from: p2 */
    public String mo22558p2() {
        return this.f4470c;
    }

    @NonNull
    /* renamed from: q2 */
    public String mo22559q2() {
        return this.f4469a;
    }

    @NonNull
    /* renamed from: t2 */
    public final String mo22560t2() {
        return this.f4468A;
    }

    @Nullable
    /* renamed from: u2 */
    public final String mo22561u2() {
        return this.f4471d;
    }

    @NonNull
    /* renamed from: v2 */
    public final String mo22562v2() {
        return this.f4476s;
    }

    /* renamed from: w2 */
    public final void mo22563w2(@NonNull String str) {
        this.f4476s = str;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, mo22559q2(), false);
        SafeParcelWriter.m4586x(parcel, 2, mo22558p2(), false);
        SafeParcelWriter.m4586x(parcel, 3, this.f4471d, false);
        SafeParcelWriter.m4586x(parcel, 4, mo22557o2(), false);
        SafeParcelWriter.m4565c(parcel, 5, mo22555m2());
        SafeParcelWriter.m4586x(parcel, 6, mo22556n2(), false);
        SafeParcelWriter.m4565c(parcel, 7, mo22554l2());
        SafeParcelWriter.m4586x(parcel, 8, this.f4476s, false);
        SafeParcelWriter.m4576n(parcel, 9, this.f4477z);
        SafeParcelWriter.m4586x(parcel, 10, this.f4468A, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    /* renamed from: x2 */
    public final void mo22565x2(int i) {
        this.f4477z = i;
    }

    public final int zza() {
        return this.f4477z;
    }

    @SafeParcelable.Constructor
    ActionCodeSettings(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param boolean z, @SafeParcelable.Param String str5, @SafeParcelable.Param boolean z2, @SafeParcelable.Param String str6, @SafeParcelable.Param int i, @SafeParcelable.Param String str7) {
        this.f4469a = str;
        this.f4470c = str2;
        this.f4471d = str3;
        this.f4472f = str4;
        this.f4473g = z;
        this.f4474o = str5;
        this.f4475p = z2;
        this.f4476s = str6;
        this.f4477z = i;
        this.f4468A = str7;
    }
}
