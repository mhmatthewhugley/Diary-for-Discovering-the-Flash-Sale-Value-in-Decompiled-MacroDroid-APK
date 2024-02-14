package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzx implements Comparator<zzw>, Parcelable {
    public static final Parcelable.Creator<zzx> CREATOR = new zzu();

    /* renamed from: a */
    private final zzw[] f38826a;

    /* renamed from: c */
    private int f38827c;
    @Nullable

    /* renamed from: d */
    public final String f38828d;

    /* renamed from: f */
    public final int f38829f;

    zzx(Parcel parcel) {
        this.f38828d = parcel.readString();
        zzw[] zzwArr = (zzw[]) zzen.m49166h((zzw[]) parcel.createTypedArray(zzw.CREATOR));
        this.f38826a = zzwArr;
        this.f38829f = zzwArr.length;
    }

    /* renamed from: a */
    public final zzw mo48361a(int i) {
        return this.f38826a[i];
    }

    @CheckResult
    /* renamed from: b */
    public final zzx mo48362b(@Nullable String str) {
        if (zzen.m49181t(this.f38828d, str)) {
            return this;
        }
        return new zzx(str, false, this.f38826a);
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzw zzw = (zzw) obj;
        zzw zzw2 = (zzw) obj2;
        UUID uuid = zzo.f37982a;
        if (uuid.equals(zzw.f38757c)) {
            return !uuid.equals(zzw2.f38757c) ? 1 : 0;
        }
        return zzw.f38757c.compareTo(zzw2.f38757c);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzx.class == obj.getClass()) {
            zzx zzx = (zzx) obj;
            return zzen.m49181t(this.f38828d, zzx.f38828d) && Arrays.equals(this.f38826a, zzx.f38826a);
        }
    }

    public final int hashCode() {
        int i;
        int i2 = this.f38827c;
        if (i2 != 0) {
            return i2;
        }
        String str = this.f38828d;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode = (i * 31) + Arrays.hashCode(this.f38826a);
        this.f38827c = hashCode;
        return hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f38828d);
        parcel.writeTypedArray(this.f38826a, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.google.android.gms.internal.ads.zzw[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzx(@androidx.annotation.Nullable java.lang.String r1, boolean r2, com.google.android.gms.internal.ads.zzw... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.f38828d = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            com.google.android.gms.internal.ads.zzw[] r3 = (com.google.android.gms.internal.ads.zzw[]) r3
        L_0x000e:
            r0.f38826a = r3
            int r1 = r3.length
            r0.f38829f = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzx.<init>(java.lang.String, boolean, com.google.android.gms.internal.ads.zzw[]):void");
    }

    public zzx(@Nullable String str, zzw... zzwArr) {
        this((String) null, true, zzwArr);
    }

    public zzx(List list) {
        this((String) null, false, (zzw[]) list.toArray(new zzw[0]));
    }
}
