package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.ads.AdRequest;
import com.google.android.gms.ads.query.AdInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzdq {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final HashSet f1873a = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Bundle f1874b = new Bundle();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final HashMap f1875c = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final HashSet f1876d = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Bundle f1877e = new Bundle();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final HashSet f1878f = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Date f1879g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f1880h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final List f1881i = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f1882j = -1;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f1883k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f1884l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f1885m = -1;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f1886n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public AdInfo f1887o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f1888p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f1889q = 60000;

    @Deprecated
    /* renamed from: a */
    public final void mo20019a(Date date) {
        this.f1879g = date;
    }

    @Deprecated
    /* renamed from: b */
    public final void mo20020b(int i) {
        this.f1882j = i;
    }

    @Deprecated
    /* renamed from: c */
    public final void mo20021c(boolean z) {
        this.f1886n = z;
    }

    @Deprecated
    /* renamed from: d */
    public final void mo20022d(boolean z) {
        this.f1885m = z ? 1 : 0;
    }

    /* renamed from: v */
    public final void mo20023v(String str) {
        this.f1873a.add(str);
    }

    /* renamed from: w */
    public final void mo20024w(Class cls, @Nullable Bundle bundle) {
        this.f1874b.putBundle(cls.getName(), bundle);
    }

    /* renamed from: x */
    public final void mo20025x(String str) {
        this.f1876d.add(str);
    }

    /* renamed from: y */
    public final void mo20026y(String str) {
        this.f1876d.remove(AdRequest.TEST_EMULATOR);
    }
}
