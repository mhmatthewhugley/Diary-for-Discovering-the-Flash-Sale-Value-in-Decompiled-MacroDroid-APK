package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.AdditionalUserInfo;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.zze;
import java.util.List;

@SafeParcelable.Class
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzr implements AuthResult {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();
    @SafeParcelable.Field
    @NonNull

    /* renamed from: a */
    private zzx f4682a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private zzp f4683c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private zze f4684d;

    public zzr(zzx zzx) {
        zzx zzx2 = (zzx) Preconditions.m4488k(zzx);
        this.f4682a = zzx2;
        List L2 = zzx2.mo22828L2();
        this.f4683c = null;
        for (int i = 0; i < L2.size(); i++) {
            if (!TextUtils.isEmpty(((zzt) L2.get(i)).zza())) {
                this.f4683c = new zzp(((zzt) L2.get(i)).mo22715I1(), ((zzt) L2.get(i)).zza(), zzx.mo22832P2());
            }
        }
        if (this.f4683c == null) {
            this.f4683c = new zzp(zzx.mo22832P2());
        }
        this.f4684d = zzx.mo22824H2();
    }

    @SafeParcelable.Constructor
    zzr(@SafeParcelable.Param @NonNull zzx zzx, @SafeParcelable.Param @Nullable zzp zzp, @SafeParcelable.Param @Nullable zze zze) {
        this.f4682a = zzx;
        this.f4683c = zzp;
        this.f4684d = zze;
    }

    @Nullable
    /* renamed from: J */
    public final AuthCredential mo22578J() {
        return this.f4684d;
    }

    @Nullable
    /* renamed from: N1 */
    public final AdditionalUserInfo mo22579N1() {
        return this.f4683c;
    }

    public final int describeContents() {
        return 0;
    }

    @Nullable
    public final FirebaseUser getUser() {
        return this.f4682a;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, this.f4682a, i, false);
        SafeParcelWriter.m4584v(parcel, 2, this.f4683c, i, false);
        SafeParcelWriter.m4584v(parcel, 3, this.f4684d, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
