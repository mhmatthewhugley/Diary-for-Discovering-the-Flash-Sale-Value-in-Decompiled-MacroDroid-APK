package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzct {

    /* renamed from: a */
    private final int f31512a;

    /* renamed from: b */
    private final int f31513b;

    /* renamed from: c */
    private final int f31514c;

    /* renamed from: d */
    private final int f31515d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f31516e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f31517f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f31518g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final zzfvn f31519h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final zzfvn f31520i;

    /* renamed from: j */
    private final int f31521j;

    /* renamed from: k */
    private final int f31522k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final zzfvn f31523l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public zzfvn f31524m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f31525n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final HashMap f31526o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final HashSet f31527p;

    @Deprecated
    public zzct() {
        this.f31512a = Integer.MAX_VALUE;
        this.f31513b = Integer.MAX_VALUE;
        this.f31514c = Integer.MAX_VALUE;
        this.f31515d = Integer.MAX_VALUE;
        this.f31516e = Integer.MAX_VALUE;
        this.f31517f = Integer.MAX_VALUE;
        this.f31518g = true;
        this.f31519h = zzfvn.m51135w();
        this.f31520i = zzfvn.m51135w();
        this.f31521j = Integer.MAX_VALUE;
        this.f31522k = Integer.MAX_VALUE;
        this.f31523l = zzfvn.m51135w();
        this.f31524m = zzfvn.m51135w();
        this.f31525n = 0;
        this.f31526o = new HashMap();
        this.f31527p = new HashSet();
    }

    /* renamed from: d */
    public final zzct mo44370d(Context context) {
        CaptioningManager captioningManager;
        if ((zzen.f34500a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.f31525n = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f31524m = zzfvn.m51136z(zzen.m49175n(locale));
            }
        }
        return this;
    }

    /* renamed from: e */
    public zzct mo44371e(int i, int i2, boolean z) {
        this.f31516e = i;
        this.f31517f = i2;
        this.f31518g = true;
        return this;
    }

    protected zzct(zzcu zzcu) {
        this.f31512a = Integer.MAX_VALUE;
        this.f31513b = Integer.MAX_VALUE;
        this.f31514c = Integer.MAX_VALUE;
        this.f31515d = Integer.MAX_VALUE;
        this.f31516e = zzcu.f31559i;
        this.f31517f = zzcu.f31560j;
        this.f31518g = zzcu.f31561k;
        this.f31519h = zzcu.f31562l;
        this.f31520i = zzcu.f31564n;
        this.f31521j = Integer.MAX_VALUE;
        this.f31522k = Integer.MAX_VALUE;
        this.f31523l = zzcu.f31568r;
        this.f31524m = zzcu.f31569s;
        this.f31525n = zzcu.f31570t;
        this.f31527p = new HashSet(zzcu.f31576z);
        this.f31526o = new HashMap(zzcu.f31575y);
    }
}
