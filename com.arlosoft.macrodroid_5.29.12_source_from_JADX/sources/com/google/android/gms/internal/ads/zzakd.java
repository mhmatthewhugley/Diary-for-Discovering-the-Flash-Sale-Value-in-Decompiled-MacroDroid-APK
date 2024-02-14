package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Map;
import org.apache.commons.cli.HelpFormatter;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzakd implements Comparable {
    @Nullable

    /* renamed from: A */
    private zzajm f24875A;
    @GuardedBy("mLock")

    /* renamed from: B */
    private zzakc f24876B;

    /* renamed from: C */
    private final zzajr f24877C;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzako f24878a;

    /* renamed from: c */
    private final int f24879c;

    /* renamed from: d */
    private final String f24880d;

    /* renamed from: f */
    private final int f24881f;

    /* renamed from: g */
    private final Object f24882g;
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: o */
    private final zzakh f24883o;

    /* renamed from: p */
    private Integer f24884p;

    /* renamed from: s */
    private zzakg f24885s;
    @GuardedBy("mLock")

    /* renamed from: z */
    private boolean f24886z;

    public zzakd(int i, String str, @Nullable zzakh zzakh) {
        Uri parse;
        String host;
        this.f24878a = zzako.f24905c ? new zzako() : null;
        this.f24882g = new Object();
        int i2 = 0;
        this.f24886z = false;
        this.f24875A = null;
        this.f24879c = i;
        this.f24880d = str;
        this.f24883o = zzakh;
        this.f24877C = new zzajr();
        if (!(TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null)) {
            i2 = host.hashCode();
        }
        this.f24881f = i2;
    }

    /* renamed from: A */
    public final boolean mo41579A() {
        boolean z;
        synchronized (this.f24882g) {
            z = this.f24886z;
        }
        return z;
    }

    /* renamed from: C */
    public final boolean mo41580C() {
        synchronized (this.f24882g) {
        }
        return false;
    }

    /* renamed from: E */
    public byte[] mo20325E() throws zzajl {
        return null;
    }

    /* renamed from: F */
    public final zzajr mo41581F() {
        return this.f24877C;
    }

    /* renamed from: b */
    public final int mo41582b() {
        return this.f24877C.mo41563b();
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f24884p.intValue() - ((zzakd) obj).f24884p.intValue();
    }

    /* renamed from: d */
    public final int mo41584d() {
        return this.f24881f;
    }

    @Nullable
    /* renamed from: e */
    public final zzajm mo41585e() {
        return this.f24875A;
    }

    /* renamed from: f */
    public final zzakd mo41586f(zzajm zzajm) {
        this.f24875A = zzajm;
        return this;
    }

    /* renamed from: g */
    public final zzakd mo41587g(zzakg zzakg) {
        this.f24885s = zzakg;
        return this;
    }

    /* renamed from: i */
    public final zzakd mo41588i(int i) {
        this.f24884p = Integer.valueOf(i);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract zzakj mo20330j(zzajz zzajz);

    /* renamed from: l */
    public final String mo41589l() {
        String str = this.f24880d;
        if (this.f24879c == 0) {
            return str;
        }
        String num = Integer.toString(1);
        return num + HelpFormatter.DEFAULT_OPT_PREFIX + str;
    }

    /* renamed from: m */
    public final String mo41590m() {
        return this.f24880d;
    }

    /* renamed from: n */
    public Map mo20327n() throws zzajl {
        return Collections.emptyMap();
    }

    /* renamed from: o */
    public final void mo41591o(String str) {
        if (zzako.f24905c) {
            this.f24878a.mo41608a(str, Thread.currentThread().getId());
        }
    }

    /* renamed from: q */
    public final void mo41592q(zzakm zzakm) {
        zzakh zzakh;
        synchronized (this.f24882g) {
            zzakh = this.f24883o;
        }
        if (zzakh != null) {
            zzakh.mo20324a(zzakm);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract void mo20328r(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo41593s(String str) {
        zzakg zzakg = this.f24885s;
        if (zzakg != null) {
            zzakg.mo41604b(this);
        }
        if (zzako.f24905c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzakb(this, str, id));
                return;
            }
            this.f24878a.mo41608a(str, id);
            this.f24878a.mo41609b(toString());
        }
    }

    /* renamed from: t */
    public final void mo41594t() {
        synchronized (this.f24882g) {
            this.f24886z = true;
        }
    }

    public final String toString() {
        String hexString = Integer.toHexString(this.f24881f);
        mo41580C();
        String str = this.f24880d;
        Integer num = this.f24884p;
        return "[ ] " + str + " " + "0x".concat(String.valueOf(hexString)) + " NORMAL " + num;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo41596v() {
        zzakc zzakc;
        synchronized (this.f24882g) {
            zzakc = this.f24876B;
        }
        if (zzakc != null) {
            zzakc.mo41577a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo41597w(zzakj zzakj) {
        zzakc zzakc;
        synchronized (this.f24882g) {
            zzakc = this.f24876B;
        }
        if (zzakc != null) {
            zzakc.mo41578b(this, zzakj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo41598x(int i) {
        zzakg zzakg = this.f24885s;
        if (zzakg != null) {
            zzakg.mo41605c(this, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo41599y(zzakc zzakc) {
        synchronized (this.f24882g) {
            this.f24876B = zzakc;
        }
    }

    public final int zza() {
        return this.f24879c;
    }
}
