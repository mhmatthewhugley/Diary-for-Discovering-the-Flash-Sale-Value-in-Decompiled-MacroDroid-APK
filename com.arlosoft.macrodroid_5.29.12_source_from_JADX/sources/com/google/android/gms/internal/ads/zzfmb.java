package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfmb {

    /* renamed from: a */
    private final HashMap f36086a = new HashMap();

    /* renamed from: b */
    private final HashMap f36087b = new HashMap();

    /* renamed from: c */
    private final HashMap f36088c = new HashMap();

    /* renamed from: d */
    private final HashSet f36089d = new HashSet();

    /* renamed from: e */
    private final HashSet f36090e = new HashSet();

    /* renamed from: f */
    private final HashSet f36091f = new HashSet();

    /* renamed from: g */
    private final HashMap f36092g = new HashMap();

    /* renamed from: h */
    private final Map f36093h = new WeakHashMap();

    /* renamed from: i */
    private boolean f36094i;

    /* renamed from: a */
    public final View mo45946a(String str) {
        return (View) this.f36088c.get(str);
    }

    /* renamed from: b */
    public final zzfma mo45947b(View view) {
        zzfma zzfma = (zzfma) this.f36087b.get(view);
        if (zzfma != null) {
            this.f36087b.remove(view);
        }
        return zzfma;
    }

    /* renamed from: c */
    public final String mo45948c(String str) {
        return (String) this.f36092g.get(str);
    }

    /* renamed from: d */
    public final String mo45949d(View view) {
        if (this.f36086a.size() == 0) {
            return null;
        }
        String str = (String) this.f36086a.get(view);
        if (str != null) {
            this.f36086a.remove(view);
        }
        return str;
    }

    /* renamed from: e */
    public final HashSet mo45950e() {
        return this.f36091f;
    }

    /* renamed from: f */
    public final HashSet mo45951f() {
        return this.f36090e;
    }

    /* renamed from: g */
    public final void mo45952g() {
        this.f36086a.clear();
        this.f36087b.clear();
        this.f36088c.clear();
        this.f36089d.clear();
        this.f36090e.clear();
        this.f36091f.clear();
        this.f36092g.clear();
        this.f36094i = false;
    }

    /* renamed from: h */
    public final void mo45953h() {
        this.f36094i = true;
    }

    /* renamed from: i */
    public final void mo45954i() {
        Boolean bool;
        zzflg a = zzflg.m50458a();
        if (a != null) {
            for (zzfkv zzfkv : a.mo45892b()) {
                View f = zzfkv.mo45879f();
                if (zzfkv.mo45883j()) {
                    String h = zzfkv.mo45881h();
                    if (f != null) {
                        String str = null;
                        if (!f.isAttachedToWindow()) {
                            str = "notAttached";
                        } else {
                            if (f.hasWindowFocus()) {
                                this.f36093h.remove(f);
                                bool = Boolean.FALSE;
                            } else if (this.f36093h.containsKey(f)) {
                                bool = (Boolean) this.f36093h.get(f);
                            } else {
                                Map map = this.f36093h;
                                Boolean bool2 = Boolean.FALSE;
                                map.put(f, bool2);
                                bool = bool2;
                            }
                            if (bool.booleanValue()) {
                                str = "noWindowFocus";
                            } else {
                                HashSet hashSet = new HashSet();
                                View view = f;
                                while (true) {
                                    if (view == null) {
                                        this.f36089d.addAll(hashSet);
                                        break;
                                    }
                                    String b = zzflz.m50530b(view);
                                    if (b != null) {
                                        str = b;
                                        break;
                                    }
                                    hashSet.add(view);
                                    ViewParent parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                }
                            }
                        }
                        if (str == null) {
                            this.f36090e.add(h);
                            this.f36086a.put(f, h);
                            for (zzfli zzfli : zzfkv.mo45882i()) {
                                View view2 = (View) zzfli.mo45909b().get();
                                if (view2 != null) {
                                    zzfma zzfma = (zzfma) this.f36087b.get(view2);
                                    if (zzfma != null) {
                                        zzfma.mo45945c(zzfkv.mo45881h());
                                    } else {
                                        this.f36087b.put(view2, new zzfma(zzfli, zzfkv.mo45881h()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f36091f.add(h);
                            this.f36088c.put(h, f);
                            this.f36092g.put(h, str);
                        }
                    } else {
                        this.f36091f.add(h);
                        this.f36092g.put(h, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public final boolean mo45955j(View view) {
        if (!this.f36093h.containsKey(view)) {
            return true;
        }
        this.f36093h.put(view, Boolean.TRUE);
        return false;
    }

    /* renamed from: k */
    public final int mo45956k(View view) {
        if (this.f36089d.contains(view)) {
            return 1;
        }
        return this.f36094i ? 2 : 3;
    }
}
