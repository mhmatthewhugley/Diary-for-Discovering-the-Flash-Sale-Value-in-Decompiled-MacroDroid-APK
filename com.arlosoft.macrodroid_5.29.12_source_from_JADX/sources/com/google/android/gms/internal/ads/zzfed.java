package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfed {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public zzl f35607a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public zzq f35608b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f35609c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public zzff f35610d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f35611e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ArrayList f35612f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ArrayList f35613g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public zzbls f35614h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public zzw f35615i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public AdManagerAdViewOptions f35616j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public PublisherAdViewOptions f35617k;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: l */
    public zzbz f35618l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f35619m = 1;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public zzbsc f35620n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final zzfdq f35621o = new zzfdq();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f35622p = false;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: q */
    public zzeof f35623q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f35624r = false;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public zzcd f35625s;

    /* renamed from: F */
    public final zzfdq mo45602F() {
        return this.f35621o;
    }

    /* renamed from: G */
    public final zzfed mo45603G(zzfef zzfef) {
        this.f35621o.mo45601a(zzfef.f35640o.f35582a);
        this.f35607a = zzfef.f35629d;
        this.f35608b = zzfef.f35630e;
        this.f35625s = zzfef.f35643r;
        this.f35609c = zzfef.f35631f;
        this.f35610d = zzfef.f35626a;
        this.f35612f = zzfef.f35632g;
        this.f35613g = zzfef.f35633h;
        this.f35614h = zzfef.f35634i;
        this.f35615i = zzfef.f35635j;
        mo45604H(zzfef.f35637l);
        mo45617d(zzfef.f35638m);
        this.f35622p = zzfef.f35641p;
        this.f35623q = zzfef.f35628c;
        this.f35624r = zzfef.f35642q;
        return this;
    }

    /* renamed from: H */
    public final zzfed mo45604H(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.f35616j = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.f35611e = adManagerAdViewOptions.mo19781l2();
        }
        return this;
    }

    /* renamed from: I */
    public final zzfed mo45605I(zzq zzq) {
        this.f35608b = zzq;
        return this;
    }

    /* renamed from: J */
    public final zzfed mo45606J(String str) {
        this.f35609c = str;
        return this;
    }

    /* renamed from: K */
    public final zzfed mo45607K(zzw zzw) {
        this.f35615i = zzw;
        return this;
    }

    /* renamed from: L */
    public final zzfed mo45608L(zzeof zzeof) {
        this.f35623q = zzeof;
        return this;
    }

    /* renamed from: M */
    public final zzfed mo45609M(zzbsc zzbsc) {
        this.f35620n = zzbsc;
        this.f35610d = new zzff(false, true, false);
        return this;
    }

    /* renamed from: N */
    public final zzfed mo45610N(boolean z) {
        this.f35622p = z;
        return this;
    }

    /* renamed from: O */
    public final zzfed mo45611O(boolean z) {
        this.f35624r = true;
        return this;
    }

    /* renamed from: P */
    public final zzfed mo45612P(boolean z) {
        this.f35611e = z;
        return this;
    }

    /* renamed from: Q */
    public final zzfed mo45613Q(int i) {
        this.f35619m = i;
        return this;
    }

    /* renamed from: a */
    public final zzfed mo45614a(zzbls zzbls) {
        this.f35614h = zzbls;
        return this;
    }

    /* renamed from: b */
    public final zzfed mo45615b(ArrayList arrayList) {
        this.f35612f = arrayList;
        return this;
    }

    /* renamed from: c */
    public final zzfed mo45616c(ArrayList arrayList) {
        this.f35613g = arrayList;
        return this;
    }

    /* renamed from: d */
    public final zzfed mo45617d(PublisherAdViewOptions publisherAdViewOptions) {
        this.f35617k = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.f35611e = publisherAdViewOptions.mo19810a();
            this.f35618l = publisherAdViewOptions.mo19811l2();
        }
        return this;
    }

    /* renamed from: e */
    public final zzfed mo45618e(zzl zzl) {
        this.f35607a = zzl;
        return this;
    }

    /* renamed from: f */
    public final zzfed mo45619f(zzff zzff) {
        this.f35610d = zzff;
        return this;
    }

    /* renamed from: g */
    public final zzfef mo45620g() {
        Preconditions.m4489l(this.f35609c, "ad unit must not be null");
        Preconditions.m4489l(this.f35608b, "ad size must not be null");
        Preconditions.m4489l(this.f35607a, "ad request must not be null");
        return new zzfef(this, (zzfee) null);
    }

    /* renamed from: i */
    public final String mo45621i() {
        return this.f35609c;
    }

    /* renamed from: o */
    public final boolean mo45622o() {
        return this.f35622p;
    }

    /* renamed from: q */
    public final zzfed mo45623q(zzcd zzcd) {
        this.f35625s = zzcd;
        return this;
    }

    /* renamed from: v */
    public final zzl mo45624v() {
        return this.f35607a;
    }

    /* renamed from: x */
    public final zzq mo45625x() {
        return this.f35608b;
    }
}
