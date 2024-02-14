package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzbd {

    /* renamed from: d */
    private static final List f4635d = new ArrayList(Arrays.asList(new String[]{"firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp"}));

    /* renamed from: e */
    private static final zzbd f4636e = new zzbd();

    /* renamed from: a */
    private Task f4637a;

    /* renamed from: b */
    private Task f4638b;

    /* renamed from: c */
    private long f4639c = 0;

    private zzbd() {
    }

    /* renamed from: c */
    public static zzbd m6203c() {
        return f4636e;
    }

    /* renamed from: f */
    private static final void m6204f(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String remove : f4635d) {
            edit.remove(remove);
        }
        edit.commit();
    }

    @Nullable
    /* renamed from: a */
    public final Task mo22760a() {
        if (DefaultClock.m4871d().mo21950a() - this.f4639c < 3600000) {
            return this.f4637a;
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public final Task mo22761b() {
        if (DefaultClock.m4871d().mo21950a() - this.f4639c < 3600000) {
            return this.f4638b;
        }
        return null;
    }

    /* renamed from: d */
    public final void mo22762d(Context context) {
        Preconditions.m4488k(context);
        m6204f(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.f4637a = null;
        this.f4639c = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0081, code lost:
        if (r4.equals("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN") == false) goto L_0x0098;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e2  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22763e(com.google.firebase.auth.FirebaseAuth r13) {
        /*
            r12 = this;
            com.google.android.gms.common.internal.Preconditions.m4488k(r13)
            com.google.firebase.FirebaseApp r0 = r13.mo22612f()
            android.content.Context r0 = r0.mo61950l()
            java.lang.String r1 = "com.google.firebase.auth.internal.ProcessDeathHelper"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "firebaseAppName"
            java.lang.String r3 = ""
            java.lang.String r1 = r0.getString(r1, r3)
            com.google.firebase.FirebaseApp r4 = r13.mo22612f()
            java.lang.String r4 = r4.mo61951o()
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0029
            return
        L_0x0029:
            java.lang.String r1 = "verifyAssertionRequest"
            boolean r4 = r0.contains(r1)
            r5 = -1
            java.lang.String r6 = "operation"
            r7 = 0
            java.lang.String r9 = "timestamp"
            r10 = 0
            if (r4 == 0) goto L_0x00f0
            java.lang.String r1 = r0.getString(r1, r3)
            android.os.Parcelable$Creator<com.google.android.gms.internal.firebase-auth-api.zzaay> r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaay.CREATOR
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.m4591c(r1, r4)
            com.google.android.gms.internal.firebase-auth-api.zzaay r1 = (com.google.android.gms.internal.p204firebaseauthapi.zzaay) r1
            java.lang.String r4 = r0.getString(r6, r3)
            java.lang.String r6 = "tenantId"
            java.lang.String r6 = r0.getString(r6, r10)
            java.lang.String r11 = "firebaseUserUid"
            java.lang.String r3 = r0.getString(r11, r3)
            long r7 = r0.getLong(r9, r7)
            r12.f4639c = r7
            if (r6 == 0) goto L_0x0065
            r13.mo22624q(r6)
            r1.mo48813p2(r6)
        L_0x0065:
            int r6 = r4.hashCode()
            r7 = -98509410(0xfffffffffa20dd9e, float:-2.088156E35)
            r8 = 2
            r9 = 1
            if (r6 == r7) goto L_0x008e
            r7 = 175006864(0xa6e6490, float:1.1478197E-32)
            if (r6 == r7) goto L_0x0084
            r7 = 1450464913(0x56745691, float:6.7163159E13)
            if (r6 == r7) goto L_0x007b
            goto L_0x0098
        L_0x007b:
            java.lang.String r6 = "com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0098
            goto L_0x0099
        L_0x0084:
            java.lang.String r2 = "com.google.firebase.auth.internal.NONGMSCORE_LINK"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0098
            r2 = 1
            goto L_0x0099
        L_0x008e:
            java.lang.String r2 = "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0098
            r2 = 2
            goto L_0x0099
        L_0x0098:
            r2 = -1
        L_0x0099:
            if (r2 == 0) goto L_0x00e2
            if (r2 == r9) goto L_0x00c2
            if (r2 == r8) goto L_0x00a2
            r12.f4637a = r10
            goto L_0x00ec
        L_0x00a2:
            com.google.firebase.auth.FirebaseUser r2 = r13.mo22613g()
            java.lang.String r2 = r2.mo22654r2()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00bf
            com.google.firebase.auth.FirebaseUser r2 = r13.mo22613g()
            com.google.firebase.auth.zze r1 = com.google.firebase.auth.zze.m6315p2(r1)
            com.google.android.gms.tasks.Task r13 = r13.mo22600N(r2, r1)
            r12.f4637a = r13
            goto L_0x00ec
        L_0x00bf:
            r12.f4637a = r10
            goto L_0x00ec
        L_0x00c2:
            com.google.firebase.auth.FirebaseUser r2 = r13.mo22613g()
            java.lang.String r2 = r2.mo22654r2()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00df
            com.google.firebase.auth.FirebaseUser r2 = r13.mo22613g()
            com.google.firebase.auth.zze r1 = com.google.firebase.auth.zze.m6315p2(r1)
            com.google.android.gms.tasks.Task r13 = r13.mo22599M(r2, r1)
            r12.f4637a = r13
            goto L_0x00ec
        L_0x00df:
            r12.f4637a = r10
            goto L_0x00ec
        L_0x00e2:
            com.google.firebase.auth.zze r1 = com.google.firebase.auth.zze.m6315p2(r1)
            com.google.android.gms.tasks.Task r13 = r13.mo22626s(r1)
            r12.f4637a = r13
        L_0x00ec:
            m6204f(r0)
            return
        L_0x00f0:
            java.lang.String r13 = "recaptchaToken"
            boolean r1 = r0.contains(r13)
            if (r1 == 0) goto L_0x0129
            java.lang.String r13 = r0.getString(r13, r3)
            java.lang.String r1 = r0.getString(r6, r3)
            long r3 = r0.getLong(r9, r7)
            r12.f4639c = r3
            int r3 = r1.hashCode()
            r4 = -214796028(0xfffffffff3327904, float:-1.4140065E31)
            if (r3 == r4) goto L_0x0110
            goto L_0x0119
        L_0x0110:
            java.lang.String r3 = "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0119
            goto L_0x011a
        L_0x0119:
            r2 = -1
        L_0x011a:
            if (r2 == 0) goto L_0x011f
            r12.f4638b = r10
            goto L_0x0125
        L_0x011f:
            com.google.android.gms.tasks.Task r13 = com.google.android.gms.tasks.Tasks.m66667f(r13)
            r12.f4638b = r13
        L_0x0125:
            m6204f(r0)
            return
        L_0x0129:
            java.lang.String r13 = "statusCode"
            boolean r1 = r0.contains(r13)
            if (r1 == 0) goto L_0x0155
            r1 = 17062(0x42a6, float:2.3909E-41)
            int r13 = r0.getInt(r13, r1)
            java.lang.String r1 = "statusMessage"
            java.lang.String r1 = r0.getString(r1, r3)
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r2.<init>((int) r13, (java.lang.String) r1)
            long r3 = r0.getLong(r9, r7)
            r12.f4639c = r3
            m6204f(r0)
            com.google.firebase.FirebaseException r13 = com.google.android.gms.internal.p204firebaseauthapi.zzxc.m58359a(r2)
            com.google.android.gms.tasks.Task r13 = com.google.android.gms.tasks.Tasks.m66666e(r13)
            r12.f4637a = r13
        L_0x0155:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.internal.zzbd.mo22763e(com.google.firebase.auth.FirebaseAuth):void");
    }
}
