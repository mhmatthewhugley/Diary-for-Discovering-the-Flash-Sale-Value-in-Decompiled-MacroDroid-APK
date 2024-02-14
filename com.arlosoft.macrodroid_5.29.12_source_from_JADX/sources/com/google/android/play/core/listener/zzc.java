package com.google.android.play.core.listener;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import com.google.android.play.core.internal.zzag;
import com.google.android.play.core.internal.zzce;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.play:core@@1.10.3 */
public abstract class zzc {

    /* renamed from: a */
    protected final zzag f51726a;

    /* renamed from: b */
    private final IntentFilter f51727b;

    /* renamed from: c */
    private final Context f51728c;

    /* renamed from: d */
    protected final Set f51729d = new HashSet();
    @Nullable

    /* renamed from: e */
    private zzb f51730e = null;

    /* renamed from: f */
    private volatile boolean f51731f = false;

    protected zzc(zzag zzag, IntentFilter intentFilter, Context context) {
        this.f51726a = zzag;
        this.f51727b = intentFilter;
        this.f51728c = zzce.m70925a(context);
    }

    /* renamed from: b */
    private final void m71027b() {
        zzb zzb;
        if ((this.f51731f || !this.f51729d.isEmpty()) && this.f51730e == null) {
            zzb zzb2 = new zzb(this, (zza) null);
            this.f51730e = zzb2;
            this.f51728c.registerReceiver(zzb2, this.f51727b);
        }
        if (!this.f51731f && this.f51729d.isEmpty() && (zzb = this.f51730e) != null) {
            this.f51728c.unregisterReceiver(zzb);
            this.f51730e = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo59548a(Context context, Intent intent);

    /* renamed from: c */
    public final synchronized void mo59912c(boolean z) {
        this.f51731f = z;
        m71027b();
    }

    /* renamed from: d */
    public final synchronized void mo59913d(Object obj) {
        Iterator it = new HashSet(this.f51729d).iterator();
        while (it.hasNext()) {
            ((StateUpdatedListener) it.next()).mo59589a(obj);
        }
    }

    /* renamed from: e */
    public final synchronized boolean mo59914e() {
        return this.f51730e != null;
    }
}
