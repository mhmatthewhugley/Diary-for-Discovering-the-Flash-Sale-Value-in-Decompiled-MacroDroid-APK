package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class ModuleInstallResponse extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new zad();
    @SafeParcelable.Field

    /* renamed from: a */
    private final int f3800a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final boolean f3801c;

    @SafeParcelable.Constructor
    public ModuleInstallResponse(@SafeParcelable.Param int i, @SafeParcelable.Param boolean z) {
        this.f3800a = i;
        this.f3801c = z;
    }

    /* renamed from: l2 */
    public int mo21853l2() {
        return this.f3800a;
    }

    /* renamed from: m2 */
    public final boolean mo21854m2() {
        return this.f3801c;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, mo21853l2());
        SafeParcelWriter.m4565c(parcel, 2, this.f3801c);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
