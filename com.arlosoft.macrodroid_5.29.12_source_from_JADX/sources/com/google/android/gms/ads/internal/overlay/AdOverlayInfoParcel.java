package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbop;
import com.google.android.gms.internal.ads.zzbor;
import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzcmp;
import com.google.android.gms.internal.ads.zzddn;
import com.google.android.gms.internal.ads.zzdkn;
import com.google.android.gms.internal.ads.zzdxq;
import com.google.android.gms.internal.ads.zzego;
import com.google.android.gms.internal.ads.zzfir;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzn();
    @SafeParcelable.Field

    /* renamed from: A */
    public final int f2052A;
    @SafeParcelable.Field

    /* renamed from: B */
    public final int f2053B;
    @SafeParcelable.Field
    @NonNull

    /* renamed from: C */
    public final String f2054C;
    @SafeParcelable.Field

    /* renamed from: D */
    public final zzcgv f2055D;
    @SafeParcelable.Field
    @NonNull

    /* renamed from: E */
    public final String f2056E;
    @SafeParcelable.Field

    /* renamed from: F */
    public final zzj f2057F;
    @SafeParcelable.Field

    /* renamed from: G */
    public final zzbop f2058G;
    @SafeParcelable.Field
    @NonNull

    /* renamed from: H */
    public final String f2059H;
    @SafeParcelable.Field

    /* renamed from: I */
    public final zzego f2060I;
    @SafeParcelable.Field

    /* renamed from: J */
    public final zzdxq f2061J;
    @SafeParcelable.Field

    /* renamed from: K */
    public final zzfir f2062K;
    @SafeParcelable.Field

    /* renamed from: L */
    public final zzbr f2063L;
    @SafeParcelable.Field
    @NonNull

    /* renamed from: M */
    public final String f2064M;
    @SafeParcelable.Field
    @NonNull

    /* renamed from: N */
    public final String f2065N;
    @SafeParcelable.Field

    /* renamed from: O */
    public final zzddn f2066O;
    @SafeParcelable.Field

    /* renamed from: P */
    public final zzdkn f2067P;
    @SafeParcelable.Field

    /* renamed from: a */
    public final zzc f2068a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final zza f2069c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final zzo f2070d;
    @SafeParcelable.Field

    /* renamed from: f */
    public final zzcmp f2071f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final zzbor f2072g;
    @SafeParcelable.Field
    @NonNull

    /* renamed from: o */
    public final String f2073o;
    @SafeParcelable.Field

    /* renamed from: p */
    public final boolean f2074p;
    @SafeParcelable.Field
    @NonNull

    /* renamed from: s */
    public final String f2075s;
    @SafeParcelable.Field

    /* renamed from: z */
    public final zzz f2076z;

    public AdOverlayInfoParcel(zza zza, zzo zzo, zzbop zzbop, zzbor zzbor, zzz zzz, zzcmp zzcmp, boolean z, int i, String str, zzcgv zzcgv, zzdkn zzdkn) {
        this.f2068a = null;
        this.f2069c = zza;
        this.f2070d = zzo;
        this.f2071f = zzcmp;
        this.f2058G = zzbop;
        this.f2072g = zzbor;
        this.f2073o = null;
        this.f2074p = z;
        this.f2075s = null;
        this.f2076z = zzz;
        this.f2052A = i;
        this.f2053B = 3;
        this.f2054C = str;
        this.f2055D = zzcgv;
        this.f2056E = null;
        this.f2057F = null;
        this.f2059H = null;
        this.f2064M = null;
        this.f2060I = null;
        this.f2061J = null;
        this.f2062K = null;
        this.f2063L = null;
        this.f2065N = null;
        this.f2066O = null;
        this.f2067P = zzdkn;
    }

    @Nullable
    /* renamed from: l2 */
    public static AdOverlayInfoParcel m2428l2(@NonNull Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 2, this.f2068a, i, false);
        SafeParcelWriter.m4575m(parcel, 3, ObjectWrapper.m5051g8(this.f2069c).asBinder(), false);
        SafeParcelWriter.m4575m(parcel, 4, ObjectWrapper.m5051g8(this.f2070d).asBinder(), false);
        SafeParcelWriter.m4575m(parcel, 5, ObjectWrapper.m5051g8(this.f2071f).asBinder(), false);
        SafeParcelWriter.m4575m(parcel, 6, ObjectWrapper.m5051g8(this.f2072g).asBinder(), false);
        SafeParcelWriter.m4586x(parcel, 7, this.f2073o, false);
        SafeParcelWriter.m4565c(parcel, 8, this.f2074p);
        SafeParcelWriter.m4586x(parcel, 9, this.f2075s, false);
        SafeParcelWriter.m4575m(parcel, 10, ObjectWrapper.m5051g8(this.f2076z).asBinder(), false);
        SafeParcelWriter.m4576n(parcel, 11, this.f2052A);
        SafeParcelWriter.m4576n(parcel, 12, this.f2053B);
        SafeParcelWriter.m4586x(parcel, 13, this.f2054C, false);
        SafeParcelWriter.m4584v(parcel, 14, this.f2055D, i, false);
        SafeParcelWriter.m4586x(parcel, 16, this.f2056E, false);
        SafeParcelWriter.m4584v(parcel, 17, this.f2057F, i, false);
        SafeParcelWriter.m4575m(parcel, 18, ObjectWrapper.m5051g8(this.f2058G).asBinder(), false);
        SafeParcelWriter.m4586x(parcel, 19, this.f2059H, false);
        SafeParcelWriter.m4575m(parcel, 20, ObjectWrapper.m5051g8(this.f2060I).asBinder(), false);
        SafeParcelWriter.m4575m(parcel, 21, ObjectWrapper.m5051g8(this.f2061J).asBinder(), false);
        SafeParcelWriter.m4575m(parcel, 22, ObjectWrapper.m5051g8(this.f2062K).asBinder(), false);
        SafeParcelWriter.m4575m(parcel, 23, ObjectWrapper.m5051g8(this.f2063L).asBinder(), false);
        SafeParcelWriter.m4586x(parcel, 24, this.f2064M, false);
        SafeParcelWriter.m4586x(parcel, 25, this.f2065N, false);
        SafeParcelWriter.m4575m(parcel, 26, ObjectWrapper.m5051g8(this.f2066O).asBinder(), false);
        SafeParcelWriter.m4575m(parcel, 27, ObjectWrapper.m5051g8(this.f2067P).asBinder(), false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public AdOverlayInfoParcel(zza zza, zzo zzo, zzbop zzbop, zzbor zzbor, zzz zzz, zzcmp zzcmp, boolean z, int i, String str, String str2, zzcgv zzcgv, zzdkn zzdkn) {
        this.f2068a = null;
        this.f2069c = zza;
        this.f2070d = zzo;
        this.f2071f = zzcmp;
        this.f2058G = zzbop;
        this.f2072g = zzbor;
        this.f2073o = str2;
        this.f2074p = z;
        this.f2075s = str;
        this.f2076z = zzz;
        this.f2052A = i;
        this.f2053B = 3;
        this.f2054C = null;
        this.f2055D = zzcgv;
        this.f2056E = null;
        this.f2057F = null;
        this.f2059H = null;
        this.f2064M = null;
        this.f2060I = null;
        this.f2061J = null;
        this.f2062K = null;
        this.f2063L = null;
        this.f2065N = null;
        this.f2066O = null;
        this.f2067P = zzdkn;
    }

    public AdOverlayInfoParcel(zza zza, zzo zzo, zzz zzz, zzcmp zzcmp, int i, zzcgv zzcgv, String str, zzj zzj, String str2, String str3, String str4, zzddn zzddn) {
        this.f2068a = null;
        this.f2069c = null;
        this.f2070d = zzo;
        this.f2071f = zzcmp;
        this.f2058G = null;
        this.f2072g = null;
        this.f2074p = false;
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26827C0)).booleanValue()) {
            this.f2073o = null;
            this.f2075s = null;
        } else {
            this.f2073o = str2;
            this.f2075s = str3;
        }
        this.f2076z = null;
        this.f2052A = i;
        this.f2053B = 1;
        this.f2054C = null;
        this.f2055D = zzcgv;
        this.f2056E = str;
        this.f2057F = zzj;
        this.f2059H = null;
        this.f2064M = null;
        this.f2060I = null;
        this.f2061J = null;
        this.f2062K = null;
        this.f2063L = null;
        this.f2065N = str4;
        this.f2066O = zzddn;
        this.f2067P = null;
    }

    public AdOverlayInfoParcel(zza zza, zzo zzo, zzz zzz, zzcmp zzcmp, boolean z, int i, zzcgv zzcgv, zzdkn zzdkn) {
        this.f2068a = null;
        this.f2069c = zza;
        this.f2070d = zzo;
        this.f2071f = zzcmp;
        this.f2058G = null;
        this.f2072g = null;
        this.f2073o = null;
        this.f2074p = z;
        this.f2075s = null;
        this.f2076z = zzz;
        this.f2052A = i;
        this.f2053B = 2;
        this.f2054C = null;
        this.f2055D = zzcgv;
        this.f2056E = null;
        this.f2057F = null;
        this.f2059H = null;
        this.f2064M = null;
        this.f2060I = null;
        this.f2061J = null;
        this.f2062K = null;
        this.f2063L = null;
        this.f2065N = null;
        this.f2066O = null;
        this.f2067P = zzdkn;
    }

    @SafeParcelable.Constructor
    AdOverlayInfoParcel(@SafeParcelable.Param zzc zzc, @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param IBinder iBinder2, @SafeParcelable.Param IBinder iBinder3, @SafeParcelable.Param IBinder iBinder4, @SafeParcelable.Param String str, @SafeParcelable.Param boolean z, @SafeParcelable.Param String str2, @SafeParcelable.Param IBinder iBinder5, @SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param String str3, @SafeParcelable.Param zzcgv zzcgv, @SafeParcelable.Param String str4, @SafeParcelable.Param zzj zzj, @SafeParcelable.Param IBinder iBinder6, @SafeParcelable.Param String str5, @SafeParcelable.Param IBinder iBinder7, @SafeParcelable.Param IBinder iBinder8, @SafeParcelable.Param IBinder iBinder9, @SafeParcelable.Param IBinder iBinder10, @SafeParcelable.Param String str6, @SafeParcelable.Param String str7, @SafeParcelable.Param IBinder iBinder11, @SafeParcelable.Param IBinder iBinder12) {
        this.f2068a = zzc;
        this.f2069c = (zza) ObjectWrapper.m5050A1(IObjectWrapper.Stub.m5043t1(iBinder));
        this.f2070d = (zzo) ObjectWrapper.m5050A1(IObjectWrapper.Stub.m5043t1(iBinder2));
        this.f2071f = (zzcmp) ObjectWrapper.m5050A1(IObjectWrapper.Stub.m5043t1(iBinder3));
        this.f2058G = (zzbop) ObjectWrapper.m5050A1(IObjectWrapper.Stub.m5043t1(iBinder6));
        this.f2072g = (zzbor) ObjectWrapper.m5050A1(IObjectWrapper.Stub.m5043t1(iBinder4));
        this.f2073o = str;
        this.f2074p = z;
        this.f2075s = str2;
        this.f2076z = (zzz) ObjectWrapper.m5050A1(IObjectWrapper.Stub.m5043t1(iBinder5));
        this.f2052A = i;
        this.f2053B = i2;
        this.f2054C = str3;
        this.f2055D = zzcgv;
        this.f2056E = str4;
        this.f2057F = zzj;
        this.f2059H = str5;
        this.f2064M = str6;
        this.f2060I = (zzego) ObjectWrapper.m5050A1(IObjectWrapper.Stub.m5043t1(iBinder7));
        this.f2061J = (zzdxq) ObjectWrapper.m5050A1(IObjectWrapper.Stub.m5043t1(iBinder8));
        this.f2062K = (zzfir) ObjectWrapper.m5050A1(IObjectWrapper.Stub.m5043t1(iBinder9));
        this.f2063L = (zzbr) ObjectWrapper.m5050A1(IObjectWrapper.Stub.m5043t1(iBinder10));
        this.f2065N = str7;
        this.f2066O = (zzddn) ObjectWrapper.m5050A1(IObjectWrapper.Stub.m5043t1(iBinder11));
        this.f2067P = (zzdkn) ObjectWrapper.m5050A1(IObjectWrapper.Stub.m5043t1(iBinder12));
    }

    public AdOverlayInfoParcel(zzc zzc, zza zza, zzo zzo, zzz zzz, zzcgv zzcgv, zzcmp zzcmp, zzdkn zzdkn) {
        this.f2068a = zzc;
        this.f2069c = zza;
        this.f2070d = zzo;
        this.f2071f = zzcmp;
        this.f2058G = null;
        this.f2072g = null;
        this.f2073o = null;
        this.f2074p = false;
        this.f2075s = null;
        this.f2076z = zzz;
        this.f2052A = -1;
        this.f2053B = 4;
        this.f2054C = null;
        this.f2055D = zzcgv;
        this.f2056E = null;
        this.f2057F = null;
        this.f2059H = null;
        this.f2064M = null;
        this.f2060I = null;
        this.f2061J = null;
        this.f2062K = null;
        this.f2063L = null;
        this.f2065N = null;
        this.f2066O = null;
        this.f2067P = zzdkn;
    }

    public AdOverlayInfoParcel(zzo zzo, zzcmp zzcmp, int i, zzcgv zzcgv) {
        this.f2070d = zzo;
        this.f2071f = zzcmp;
        this.f2052A = 1;
        this.f2055D = zzcgv;
        this.f2068a = null;
        this.f2069c = null;
        this.f2058G = null;
        this.f2072g = null;
        this.f2073o = null;
        this.f2074p = false;
        this.f2075s = null;
        this.f2076z = null;
        this.f2053B = 1;
        this.f2054C = null;
        this.f2056E = null;
        this.f2057F = null;
        this.f2059H = null;
        this.f2064M = null;
        this.f2060I = null;
        this.f2061J = null;
        this.f2062K = null;
        this.f2063L = null;
        this.f2065N = null;
        this.f2066O = null;
        this.f2067P = null;
    }

    public AdOverlayInfoParcel(zzcmp zzcmp, zzcgv zzcgv, zzbr zzbr, zzego zzego, zzdxq zzdxq, zzfir zzfir, String str, String str2, int i) {
        this.f2068a = null;
        this.f2069c = null;
        this.f2070d = null;
        this.f2071f = zzcmp;
        this.f2058G = null;
        this.f2072g = null;
        this.f2073o = null;
        this.f2074p = false;
        this.f2075s = null;
        this.f2076z = null;
        this.f2052A = 14;
        this.f2053B = 5;
        this.f2054C = null;
        this.f2055D = zzcgv;
        this.f2056E = null;
        this.f2057F = null;
        this.f2059H = str;
        this.f2064M = str2;
        this.f2060I = zzego;
        this.f2061J = zzdxq;
        this.f2062K = zzfir;
        this.f2063L = zzbr;
        this.f2065N = null;
        this.f2066O = null;
        this.f2067P = null;
    }
}
