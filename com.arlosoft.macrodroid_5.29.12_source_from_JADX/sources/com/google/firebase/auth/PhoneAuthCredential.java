package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class PhoneAuthCredential extends AuthCredential implements Cloneable {
    @NonNull
    public static final Parcelable.Creator<PhoneAuthCredential> CREATOR = new zzag();
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    private String f4524a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private String f4525c;
    @SafeParcelable.Field

    /* renamed from: d */
    private boolean f4526d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    private String f4527f;
    @SafeParcelable.Field

    /* renamed from: g */
    private boolean f4528g;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    private String f4529o;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: p */
    private String f4530p;

    @SafeParcelable.Constructor
    PhoneAuthCredential(@SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @Nullable String str2, @SafeParcelable.Param boolean z, @SafeParcelable.Param @Nullable String str3, @SafeParcelable.Param boolean z2, @SafeParcelable.Param @Nullable String str4, @SafeParcelable.Param @Nullable String str5) {
        boolean z3 = false;
        if ((z && !TextUtils.isEmpty(str3) && TextUtils.isEmpty(str5)) || ((z && TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str5)) || ((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) || (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4))))) {
            z3 = true;
        }
        Preconditions.m4479b(z3, "Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, temporary proof, or enrollment ID.");
        this.f4524a = str;
        this.f4525c = str2;
        this.f4526d = z;
        this.f4527f = str3;
        this.f4528g = z2;
        this.f4529o = str4;
        this.f4530p = str5;
    }

    @NonNull
    /* renamed from: p2 */
    public static PhoneAuthCredential m6086p2(@NonNull String str, @NonNull String str2) {
        return new PhoneAuthCredential(str, str2, false, (String) null, true, (String) null, (String) null);
    }

    @NonNull
    /* renamed from: q2 */
    public static PhoneAuthCredential m6087q2(@NonNull String str, @NonNull String str2) {
        return new PhoneAuthCredential((String) null, (String) null, false, str, true, str2, (String) null);
    }

    @NonNull
    /* renamed from: l2 */
    public String mo22576l2() {
        return "phone";
    }

    @NonNull
    /* renamed from: m2 */
    public final AuthCredential mo22577m2() {
        return clone();
    }

    @Nullable
    /* renamed from: n2 */
    public String mo22677n2() {
        return this.f4525c;
    }

    @NonNull
    /* renamed from: o2 */
    public final PhoneAuthCredential clone() {
        return new PhoneAuthCredential(this.f4524a, mo22677n2(), this.f4526d, this.f4527f, this.f4528g, this.f4529o, this.f4530p);
    }

    @NonNull
    /* renamed from: r2 */
    public final PhoneAuthCredential mo22679r2(boolean z) {
        this.f4528g = false;
        return this;
    }

    @Nullable
    /* renamed from: s2 */
    public final String mo22680s2() {
        return this.f4527f;
    }

    @Nullable
    /* renamed from: t2 */
    public final String mo22681t2() {
        return this.f4524a;
    }

    @Nullable
    /* renamed from: u2 */
    public final String mo22682u2() {
        return this.f4529o;
    }

    /* renamed from: v2 */
    public final boolean mo22683v2() {
        return this.f4528g;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f4524a, false);
        SafeParcelWriter.m4586x(parcel, 2, mo22677n2(), false);
        SafeParcelWriter.m4565c(parcel, 3, this.f4526d);
        SafeParcelWriter.m4586x(parcel, 4, this.f4527f, false);
        SafeParcelWriter.m4565c(parcel, 5, this.f4528g);
        SafeParcelWriter.m4586x(parcel, 6, this.f4529o, false);
        SafeParcelWriter.m4586x(parcel, 7, this.f4530p, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
