package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new zze();
    @SafeParcelable.Field

    /* renamed from: a */
    private final int f2752a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final boolean f2753c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final boolean f2754d;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: f */
    private final boolean f2755f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final int f2756g;

    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f2757a = false;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f2758b = true;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f2759c = 1;

        /* renamed from: a */
        public CredentialPickerConfig mo20826a() {
            return new CredentialPickerConfig(this);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public @interface Prompt {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: int} */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    CredentialPickerConfig(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param boolean r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param boolean r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param boolean r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param int r6) {
        /*
            r1 = this;
            r1.<init>()
            r1.f2752a = r2
            r1.f2753c = r3
            r1.f2754d = r4
            r3 = 1
            r4 = 3
            r0 = 2
            if (r2 >= r0) goto L_0x0016
            r1.f2755f = r5
            if (r5 == 0) goto L_0x0013
            r3 = 3
        L_0x0013:
            r1.f2756g = r3
            return
        L_0x0016:
            if (r6 != r4) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            r1.f2755f = r3
            r1.f2756g = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.CredentialPickerConfig.<init>(int, boolean, boolean, boolean, int):void");
    }

    @Deprecated
    /* renamed from: l2 */
    public final boolean mo20822l2() {
        return this.f2756g == 3;
    }

    /* renamed from: m2 */
    public final boolean mo20823m2() {
        return this.f2753c;
    }

    /* renamed from: n2 */
    public final boolean mo20824n2() {
        return this.f2754d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4565c(parcel, 1, mo20823m2());
        SafeParcelWriter.m4565c(parcel, 2, mo20824n2());
        SafeParcelWriter.m4565c(parcel, 3, mo20822l2());
        SafeParcelWriter.m4576n(parcel, 4, this.f2756g);
        SafeParcelWriter.m4576n(parcel, 1000, this.f2752a);
        SafeParcelWriter.m4564b(parcel, a);
    }

    private CredentialPickerConfig(Builder builder) {
        this(2, builder.f2757a, builder.f2758b, false, builder.f2759c);
    }
}
