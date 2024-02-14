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
public class EmailAuthCredential extends AuthCredential {
    @NonNull
    public static final Parcelable.Creator<EmailAuthCredential> CREATOR = new zzg();
    @SafeParcelable.Field

    /* renamed from: a */
    private String f4492a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private String f4493c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private final String f4494d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    private String f4495f;
    @SafeParcelable.Field

    /* renamed from: g */
    private boolean f4496g;

    @SafeParcelable.Constructor
    EmailAuthCredential(@SafeParcelable.Param String str, @SafeParcelable.Param @Nullable String str2, @SafeParcelable.Param @Nullable String str3, @SafeParcelable.Param @Nullable String str4, @SafeParcelable.Param boolean z) {
        this.f4492a = Preconditions.m4484g(str);
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            this.f4493c = str2;
            this.f4494d = str3;
            this.f4495f = str4;
            this.f4496g = z;
            return;
        }
        throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
    }

    /* renamed from: v2 */
    public static boolean m5964v2(@NonNull String str) {
        ActionCodeUrl c;
        if (!TextUtils.isEmpty(str) && (c = ActionCodeUrl.m5954c(str)) != null && c.mo22573b() == 4) {
            return true;
        }
        return false;
    }

    @NonNull
    /* renamed from: l2 */
    public String mo22576l2() {
        return "password";
    }

    @NonNull
    /* renamed from: m2 */
    public final AuthCredential mo22577m2() {
        return new EmailAuthCredential(this.f4492a, this.f4493c, this.f4494d, this.f4495f, this.f4496g);
    }

    @NonNull
    /* renamed from: n2 */
    public String mo22581n2() {
        return !TextUtils.isEmpty(this.f4493c) ? "password" : "emailLink";
    }

    @NonNull
    /* renamed from: o2 */
    public final EmailAuthCredential mo22582o2(@NonNull FirebaseUser firebaseUser) {
        this.f4495f = firebaseUser.mo22643C2();
        this.f4496g = true;
        return this;
    }

    @Nullable
    /* renamed from: p2 */
    public final String mo22583p2() {
        return this.f4495f;
    }

    @NonNull
    /* renamed from: q2 */
    public final String mo22584q2() {
        return this.f4492a;
    }

    @Nullable
    /* renamed from: r2 */
    public final String mo22585r2() {
        return this.f4493c;
    }

    @Nullable
    /* renamed from: s2 */
    public final String mo22586s2() {
        return this.f4494d;
    }

    /* renamed from: t2 */
    public final boolean mo22587t2() {
        return !TextUtils.isEmpty(this.f4494d);
    }

    /* renamed from: u2 */
    public final boolean mo22588u2() {
        return this.f4496g;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f4492a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f4493c, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f4494d, false);
        SafeParcelWriter.m4586x(parcel, 4, this.f4495f, false);
        SafeParcelWriter.m4565c(parcel, 5, this.f4496g);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
