package com.google.firebase.auth.internal;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzbm {

    /* renamed from: c */
    private static final zzbm f4654c = new zzbm();

    /* renamed from: a */
    private final zzbd f4655a;

    /* renamed from: b */
    private final zzax f4656b;

    private zzbm() {
        zzbd c = zzbd.m6203c();
        zzax a = zzax.m6185a();
        this.f4655a = c;
        this.f4656b = a;
    }

    /* renamed from: c */
    public static zzbm m6232c() {
        return f4654c;
    }

    /* renamed from: a */
    public final Task mo22775a() {
        return this.f4655a.mo22760a();
    }

    /* renamed from: b */
    public final Task mo22776b() {
        return this.f4655a.mo22761b();
    }

    /* renamed from: d */
    public final void mo22777d(Context context) {
        this.f4655a.mo22762d(context);
    }

    /* renamed from: e */
    public final void mo22778e(FirebaseAuth firebaseAuth) {
        this.f4655a.mo22763e(firebaseAuth);
    }

    /* renamed from: f */
    public final void mo22779f(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.mo21294n2());
        edit.putString("statusMessage", status.mo21295o2());
        edit.putLong("timestamp", DefaultClock.m4871d().mo21950a());
        edit.commit();
    }

    /* renamed from: g */
    public final void mo22780g(Context context, FirebaseAuth firebaseAuth) {
        Preconditions.m4488k(context);
        Preconditions.m4488k(firebaseAuth);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.mo22612f().mo61951o());
        edit.commit();
    }

    /* renamed from: h */
    public final void mo22781h(Context context, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        Preconditions.m4488k(context);
        Preconditions.m4488k(firebaseAuth);
        Preconditions.m4488k(firebaseUser);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.mo22612f().mo61951o());
        edit.putString("firebaseUserUid", firebaseUser.mo22654r2());
        edit.commit();
    }

    /* renamed from: i */
    public final boolean mo22782i(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth) {
        return this.f4656b.mo22754f(activity, taskCompletionSource, firebaseAuth, (FirebaseUser) null);
    }

    /* renamed from: j */
    public final boolean mo22783j(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        return this.f4656b.mo22754f(activity, taskCompletionSource, firebaseAuth, firebaseUser);
    }
}
