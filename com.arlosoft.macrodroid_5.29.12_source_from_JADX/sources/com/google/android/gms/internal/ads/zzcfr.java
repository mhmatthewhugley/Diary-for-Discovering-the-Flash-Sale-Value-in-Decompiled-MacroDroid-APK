package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcfr {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Clock f28356a;

    /* renamed from: b */
    private final zzcgc f28357b;

    /* renamed from: c */
    private final LinkedList f28358c;

    /* renamed from: d */
    private final Object f28359d = new Object();

    /* renamed from: e */
    private final String f28360e;

    /* renamed from: f */
    private final String f28361f;

    /* renamed from: g */
    private long f28362g = -1;

    /* renamed from: h */
    private long f28363h = -1;

    /* renamed from: i */
    private long f28364i = 0;

    /* renamed from: j */
    private long f28365j = -1;

    /* renamed from: k */
    private long f28366k = -1;

    zzcfr(Clock clock, zzcgc zzcgc, String str, String str2) {
        this.f28356a = clock;
        this.f28357b = zzcgc;
        this.f28360e = str;
        this.f28361f = str2;
        this.f28358c = new LinkedList();
    }

    /* renamed from: a */
    public final Bundle mo43466a() {
        Bundle bundle;
        synchronized (this.f28359d) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f28360e);
            bundle.putString("slotid", this.f28361f);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.f28365j);
            bundle.putLong("tresponse", this.f28366k);
            bundle.putLong("timp", this.f28362g);
            bundle.putLong("tload", this.f28363h);
            bundle.putLong("pcc", this.f28364i);
            bundle.putLong("tfetch", -1);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f28358c.iterator();
            while (it.hasNext()) {
                arrayList.add(((zzcfq) it.next()).mo43463b());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    /* renamed from: c */
    public final String mo43467c() {
        return this.f28360e;
    }

    /* renamed from: d */
    public final void mo43468d() {
        synchronized (this.f28359d) {
            if (this.f28366k != -1) {
                zzcfq zzcfq = new zzcfq(this);
                zzcfq.mo43465d();
                this.f28358c.add(zzcfq);
                this.f28364i++;
                this.f28357b.mo43537c();
                this.f28357b.mo43536b(this);
            }
        }
    }

    /* renamed from: e */
    public final void mo43469e() {
        synchronized (this.f28359d) {
            if (this.f28366k != -1 && !this.f28358c.isEmpty()) {
                zzcfq zzcfq = (zzcfq) this.f28358c.getLast();
                if (zzcfq.mo43462a() == -1) {
                    zzcfq.mo43464c();
                    this.f28357b.mo43536b(this);
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo43470f() {
        synchronized (this.f28359d) {
            if (this.f28366k != -1 && this.f28362g == -1) {
                this.f28362g = this.f28356a.mo21952c();
                this.f28357b.mo43536b(this);
            }
            this.f28357b.mo43538d();
        }
    }

    /* renamed from: g */
    public final void mo43471g() {
        synchronized (this.f28359d) {
            this.f28357b.mo43539e();
        }
    }

    /* renamed from: h */
    public final void mo43472h(boolean z) {
        synchronized (this.f28359d) {
            if (this.f28366k != -1) {
                this.f28363h = this.f28356a.mo21952c();
            }
        }
    }

    /* renamed from: i */
    public final void mo43473i() {
        synchronized (this.f28359d) {
            this.f28357b.mo43540f();
        }
    }

    /* renamed from: j */
    public final void mo43474j(zzl zzl) {
        synchronized (this.f28359d) {
            long c = this.f28356a.mo21952c();
            this.f28365j = c;
            this.f28357b.mo43541g(zzl, c);
        }
    }

    /* renamed from: k */
    public final void mo43475k(long j) {
        synchronized (this.f28359d) {
            this.f28366k = j;
            if (j != -1) {
                this.f28357b.mo43536b(this);
            }
        }
    }
}
