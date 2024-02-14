package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.arlosoft.macrodroid.data.HomeTile;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p204firebaseauthapi.zzzy;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.FirebaseUserMetadata;
import com.google.firebase.auth.MultiFactor;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.UserInfo;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@SafeParcelable.Class
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzx extends FirebaseUser {
    public static final Parcelable.Creator<zzx> CREATOR = new zzy();
    @SafeParcelable.Field

    /* renamed from: A */
    private boolean f4698A;
    @SafeParcelable.Field

    /* renamed from: B */
    private zze f4699B;
    @SafeParcelable.Field

    /* renamed from: C */
    private zzbb f4700C;
    @SafeParcelable.Field

    /* renamed from: a */
    private zzzy f4701a;
    @SafeParcelable.Field

    /* renamed from: c */
    private zzt f4702c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final String f4703d;
    @SafeParcelable.Field

    /* renamed from: f */
    private String f4704f;
    @SafeParcelable.Field

    /* renamed from: g */
    private List f4705g;
    @SafeParcelable.Field

    /* renamed from: o */
    private List f4706o;
    @SafeParcelable.Field

    /* renamed from: p */
    private String f4707p;
    @SafeParcelable.Field

    /* renamed from: s */
    private Boolean f4708s;
    @SafeParcelable.Field

    /* renamed from: z */
    private zzz f4709z;

    public zzx(FirebaseApp firebaseApp, List list) {
        Preconditions.m4488k(firebaseApp);
        this.f4703d = firebaseApp.mo61951o();
        this.f4704f = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f4707p = ExifInterface.GPS_MEASUREMENT_2D;
        mo22662z2(list);
    }

    @NonNull
    /* renamed from: A2 */
    public final zzzy mo22641A2() {
        return this.f4701a;
    }

    @NonNull
    /* renamed from: B2 */
    public final String mo22642B2() {
        return this.f4701a.mo50147m2();
    }

    @NonNull
    /* renamed from: C2 */
    public final String mo22643C2() {
        return this.f4701a.mo50150p2();
    }

    @Nullable
    /* renamed from: D2 */
    public final List mo22644D2() {
        return this.f4706o;
    }

    /* renamed from: E2 */
    public final void mo22645E2(zzzy zzzy) {
        this.f4701a = (zzzy) Preconditions.m4488k(zzzy);
    }

    /* renamed from: F2 */
    public final void mo22646F2(List list) {
        Parcelable.Creator<zzbb> creator = zzbb.CREATOR;
        zzbb zzbb = null;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it.next();
                if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                    arrayList.add((PhoneMultiFactorInfo) multiFactorInfo);
                }
            }
            zzbb = new zzbb(arrayList);
        }
        this.f4700C = zzbb;
    }

    /* renamed from: G2 */
    public final FirebaseUserMetadata mo22823G2() {
        return this.f4709z;
    }

    @Nullable
    /* renamed from: H2 */
    public final zze mo22824H2() {
        return this.f4699B;
    }

    @NonNull
    /* renamed from: I1 */
    public final String mo22715I1() {
        return this.f4702c.mo22715I1();
    }

    /* renamed from: I2 */
    public final zzx mo22825I2(String str) {
        this.f4707p = str;
        return this;
    }

    /* renamed from: J2 */
    public final zzx mo22826J2() {
        this.f4708s = Boolean.FALSE;
        return this;
    }

    @Nullable
    /* renamed from: K2 */
    public final List mo22827K2() {
        zzbb zzbb = this.f4700C;
        if (zzbb != null) {
            return zzbb.mo22756l2();
        }
        return new ArrayList();
    }

    /* renamed from: L2 */
    public final List mo22828L2() {
        return this.f4705g;
    }

    /* renamed from: M2 */
    public final void mo22829M2(@Nullable zze zze) {
        this.f4699B = zze;
    }

    /* renamed from: N2 */
    public final void mo22830N2(boolean z) {
        this.f4698A = z;
    }

    /* renamed from: O2 */
    public final void mo22831O2(zzz zzz) {
        this.f4709z = zzz;
    }

    /* renamed from: P2 */
    public final boolean mo22832P2() {
        return this.f4698A;
    }

    @Nullable
    /* renamed from: l2 */
    public final String mo22647l2() {
        return this.f4702c.mo22808l2();
    }

    /* renamed from: m2 */
    public final /* synthetic */ MultiFactor mo22648m2() {
        return new zzac(this);
    }

    @Nullable
    /* renamed from: n2 */
    public final String mo22649n2() {
        return this.f4702c.mo22809m2();
    }

    @Nullable
    /* renamed from: o2 */
    public final Uri mo22650o2() {
        return this.f4702c.mo22810n2();
    }

    @Nullable
    /* renamed from: p0 */
    public final String mo22651p0() {
        return this.f4702c.mo22812p0();
    }

    @NonNull
    /* renamed from: p2 */
    public final List<? extends UserInfo> mo22652p2() {
        return this.f4705g;
    }

    @Nullable
    /* renamed from: q2 */
    public final String mo22653q2() {
        Map map;
        zzzy zzzy = this.f4701a;
        if (zzzy == null || zzzy.mo50147m2() == null || (map = (Map) zzay.m6194a(zzzy.mo50147m2()).mo22663a().get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @NonNull
    /* renamed from: r2 */
    public final String mo22654r2() {
        return this.f4702c.mo22811o2();
    }

    /* renamed from: s2 */
    public final boolean mo22655s2() {
        Boolean bool = this.f4708s;
        if (bool == null || bool.booleanValue()) {
            zzzy zzzy = this.f4701a;
            String b = zzzy != null ? zzay.m6194a(zzzy.mo50147m2()).mo22664b() : "";
            boolean z = false;
            if (this.f4705g.size() <= 1 && (b == null || !b.equals(HomeTile.TILE_TYPE_CUSTOM))) {
                z = true;
            }
            this.f4708s = Boolean.valueOf(z);
        }
        return this.f4708s.booleanValue();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, this.f4701a, i, false);
        SafeParcelWriter.m4584v(parcel, 2, this.f4702c, i, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f4703d, false);
        SafeParcelWriter.m4586x(parcel, 4, this.f4704f, false);
        SafeParcelWriter.m4558B(parcel, 5, this.f4705g, false);
        SafeParcelWriter.m4588z(parcel, 6, this.f4706o, false);
        SafeParcelWriter.m4586x(parcel, 7, this.f4707p, false);
        SafeParcelWriter.m4566d(parcel, 8, Boolean.valueOf(mo22655s2()), false);
        SafeParcelWriter.m4584v(parcel, 9, this.f4709z, i, false);
        SafeParcelWriter.m4565c(parcel, 10, this.f4698A);
        SafeParcelWriter.m4584v(parcel, 11, this.f4699B, i, false);
        SafeParcelWriter.m4584v(parcel, 12, this.f4700C, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @NonNull
    /* renamed from: x2 */
    public final FirebaseApp mo22660x2() {
        return FirebaseApp.m74384n(this.f4703d);
    }

    /* renamed from: y2 */
    public final /* bridge */ /* synthetic */ FirebaseUser mo22661y2() {
        mo22826J2();
        return this;
    }

    @NonNull
    /* renamed from: z2 */
    public final synchronized FirebaseUser mo22662z2(List list) {
        Preconditions.m4488k(list);
        this.f4705g = new ArrayList(list.size());
        this.f4706o = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            UserInfo userInfo = (UserInfo) list.get(i);
            if (userInfo.mo22715I1().equals("firebase")) {
                this.f4702c = (zzt) userInfo;
            } else {
                this.f4706o.add(userInfo.mo22715I1());
            }
            this.f4705g.add((zzt) userInfo);
        }
        if (this.f4702c == null) {
            this.f4702c = (zzt) this.f4705g.get(0);
        }
        return this;
    }

    @SafeParcelable.Constructor
    zzx(@SafeParcelable.Param zzzy zzzy, @SafeParcelable.Param zzt zzt, @SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param List list, @SafeParcelable.Param List list2, @SafeParcelable.Param String str3, @SafeParcelable.Param Boolean bool, @SafeParcelable.Param zzz zzz, @SafeParcelable.Param boolean z, @SafeParcelable.Param zze zze, @SafeParcelable.Param zzbb zzbb) {
        this.f4701a = zzzy;
        this.f4702c = zzt;
        this.f4703d = str;
        this.f4704f = str2;
        this.f4705g = list;
        this.f4706o = list2;
        this.f4707p = str3;
        this.f4708s = bool;
        this.f4709z = zzz;
        this.f4698A = z;
        this.f4699B = zze;
        this.f4700C = zzbb;
    }
}
