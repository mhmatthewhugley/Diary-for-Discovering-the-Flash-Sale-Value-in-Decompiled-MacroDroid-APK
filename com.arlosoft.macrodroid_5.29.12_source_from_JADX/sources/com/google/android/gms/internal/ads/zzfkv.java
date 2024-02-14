package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfkv extends zzfkr {

    /* renamed from: i */
    private static final Pattern f36007i = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final zzfkt f36008a;

    /* renamed from: b */
    private final zzfks f36009b;

    /* renamed from: c */
    private final List f36010c = new ArrayList();

    /* renamed from: d */
    private zzfmp f36011d;

    /* renamed from: e */
    private zzfls f36012e;

    /* renamed from: f */
    private boolean f36013f = false;

    /* renamed from: g */
    private boolean f36014g = false;

    /* renamed from: h */
    private final String f36015h;

    zzfkv(zzfks zzfks, zzfkt zzfkt) {
        this.f36009b = zzfks;
        this.f36008a = zzfkt;
        this.f36015h = UUID.randomUUID().toString();
        m50439k((View) null);
        if (zzfkt.mo45872d() == zzfku.HTML || zzfkt.mo45872d() == zzfku.JAVASCRIPT) {
            this.f36012e = new zzflt(zzfkt.mo45871a());
        } else {
            this.f36012e = new zzflv(zzfkt.mo45877i(), (String) null);
        }
        this.f36012e.mo45940j();
        zzflg.m50458a().mo45894d(this);
        zzfll.m50478a().mo45917d(this.f36012e.mo45931a(), zzfks.mo45870b());
    }

    /* renamed from: k */
    private final void m50439k(View view) {
        this.f36011d = new zzfmp(view);
    }

    /* renamed from: b */
    public final void mo45866b(View view, zzfkx zzfkx, @Nullable String str) {
        zzfli zzfli;
        if (this.f36014g) {
            return;
        }
        if (f36007i.matcher("Ad overlay").matches()) {
            Iterator it = this.f36010c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    zzfli = null;
                    break;
                }
                zzfli = (zzfli) it.next();
                if (zzfli.mo45909b().get() == view) {
                    break;
                }
            }
            if (zzfli == null) {
                this.f36010c.add(new zzfli(view, zzfkx, "Ad overlay"));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
    }

    /* renamed from: c */
    public final void mo45867c() {
        if (!this.f36014g) {
            this.f36011d.clear();
            if (!this.f36014g) {
                this.f36010c.clear();
            }
            this.f36014g = true;
            zzfll.m50478a().mo45916c(this.f36012e.mo45931a());
            zzflg.m50458a().mo45895e(this);
            this.f36012e.mo45933c();
            this.f36012e = null;
        }
    }

    /* renamed from: d */
    public final void mo45868d(View view) {
        if (!this.f36014g && mo45879f() != view) {
            m50439k(view);
            this.f36012e.mo45932b();
            Collection<zzfkv> c = zzflg.m50458a().mo45893c();
            if (c != null && !c.isEmpty()) {
                for (zzfkv zzfkv : c) {
                    if (zzfkv != this && zzfkv.mo45879f() == view) {
                        zzfkv.f36011d.clear();
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo45869e() {
        if (!this.f36013f) {
            this.f36013f = true;
            zzflg.m50458a().mo45896f(this);
            this.f36012e.mo45938h(zzflm.m50485b().mo45921a());
            this.f36012e.mo45936f(this, this.f36008a);
        }
    }

    /* renamed from: f */
    public final View mo45879f() {
        return (View) this.f36011d.get();
    }

    /* renamed from: g */
    public final zzfls mo45880g() {
        return this.f36012e;
    }

    /* renamed from: h */
    public final String mo45881h() {
        return this.f36015h;
    }

    /* renamed from: i */
    public final List mo45882i() {
        return this.f36010c;
    }

    /* renamed from: j */
    public final boolean mo45883j() {
        return this.f36013f && !this.f36014g;
    }
}
