package com.google.android.gms.internal.p204firebaseauthapi;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaco */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzaco {

    /* renamed from: a */
    private final zzacn f39664a;

    private zzaco(zzacn zzacn) {
        zzadl.m56462f(zzacn, "output");
        this.f39664a = zzacn;
        zzacn.f39663a = this;
    }

    /* renamed from: l */
    public static zzaco m56338l(zzacn zzacn) {
        zzaco zzaco = zzacn.f39663a;
        return zzaco != null ? zzaco : new zzaco(zzacn);
    }

    /* renamed from: A */
    public final void mo48996A(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f39664a.mo48991z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.f39664a.mo48974B(i3);
            while (i2 < list.size()) {
                this.f39664a.mo48984s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f39664a.mo48983r(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* renamed from: B */
    public final void mo48997B(int i, Object obj, zzaew zzaew) throws IOException {
        zzacn zzacn = this.f39664a;
        zzacn.mo48991z(i, 3);
        zzaew.mo49147h((zzaek) obj, zzacn.f39663a);
        zzacn.mo48991z(i, 4);
    }

    /* renamed from: C */
    public final void mo48998C(int i, int i2) throws IOException {
        this.f39664a.mo48987v(i, i2);
    }

    /* renamed from: D */
    public final void mo48999D(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f39664a.mo48991z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzacn.m56306G(((Integer) list.get(i4)).intValue());
            }
            this.f39664a.mo48974B(i3);
            while (i2 < list.size()) {
                this.f39664a.mo48988w(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f39664a.mo48987v(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: E */
    public final void mo49000E(int i, long j) throws IOException {
        this.f39664a.mo48975C(i, j);
    }

    /* renamed from: F */
    public final void mo49001F(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f39664a.mo48991z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzacn.m56313g(((Long) list.get(i4)).longValue());
            }
            this.f39664a.mo48974B(i3);
            while (i2 < list.size()) {
                this.f39664a.mo48976D(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f39664a.mo48975C(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: G */
    public final void mo49002G(int i, Object obj, zzaew zzaew) throws IOException {
        this.f39664a.mo48989x(i, (zzaek) obj, zzaew);
    }

    /* renamed from: H */
    public final void mo49003H(int i, int i2) throws IOException {
        this.f39664a.mo48983r(i, i2);
    }

    /* renamed from: I */
    public final void mo49004I(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f39664a.mo48991z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f39664a.mo48974B(i3);
            while (i2 < list.size()) {
                this.f39664a.mo48984s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f39664a.mo48983r(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: J */
    public final void mo49005J(int i, long j) throws IOException {
        this.f39664a.mo48985t(i, j);
    }

    /* renamed from: K */
    public final void mo49006K(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f39664a.mo48991z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f39664a.mo48974B(i3);
            while (i2 < list.size()) {
                this.f39664a.mo48986u(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f39664a.mo48985t(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo49007a(int i, int i2) throws IOException {
        this.f39664a.mo48973A(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: b */
    public final void mo49008b(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f39664a.mo48991z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i3 += zzacn.m56312f((intValue >> 31) ^ (intValue + intValue));
            }
            this.f39664a.mo48974B(i3);
            while (i2 < list.size()) {
                zzacn zzacn = this.f39664a;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                zzacn.mo48974B((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzacn zzacn2 = this.f39664a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            zzacn2.mo48973A(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo49009c(int i, long j) throws IOException {
        this.f39664a.mo48975C(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: d */
    public final void mo49010d(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f39664a.mo48991z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                i3 += zzacn.m56313g((longValue >> 63) ^ (longValue + longValue));
            }
            this.f39664a.mo48974B(i3);
            while (i2 < list.size()) {
                zzacn zzacn = this.f39664a;
                long longValue2 = ((Long) list.get(i2)).longValue();
                zzacn.mo48976D((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzacn zzacn2 = this.f39664a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            zzacn2.mo48975C(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Deprecated
    /* renamed from: e */
    public final void mo49011e(int i) throws IOException {
        this.f39664a.mo48991z(i, 3);
    }

    /* renamed from: f */
    public final void mo49012f(int i, String str) throws IOException {
        this.f39664a.mo48990y(i, str);
    }

    /* renamed from: g */
    public final void mo49013g(int i, List list) throws IOException {
        int i2 = 0;
        if (list instanceof zzads) {
            zzads zzads = (zzads) list;
            while (i2 < list.size()) {
                Object y = zzads.mo49113y(i2);
                if (y instanceof String) {
                    this.f39664a.mo48990y(i, (String) y);
                } else {
                    this.f39664a.mo48982p(i, (zzacc) y);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f39664a.mo48990y(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo49014h(int i, int i2) throws IOException {
        this.f39664a.mo48973A(i, i2);
    }

    /* renamed from: i */
    public final void mo49015i(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f39664a.mo48991z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzacn.m56312f(((Integer) list.get(i4)).intValue());
            }
            this.f39664a.mo48974B(i3);
            while (i2 < list.size()) {
                this.f39664a.mo48974B(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f39664a.mo48973A(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void mo49016j(int i, long j) throws IOException {
        this.f39664a.mo48975C(i, j);
    }

    /* renamed from: k */
    public final void mo49017k(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f39664a.mo48991z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzacn.m56313g(((Long) list.get(i4)).longValue());
            }
            this.f39664a.mo48974B(i3);
            while (i2 < list.size()) {
                this.f39664a.mo48976D(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f39664a.mo48975C(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo49018m(int i, boolean z) throws IOException {
        this.f39664a.mo48981o(i, z);
    }

    /* renamed from: n */
    public final void mo49019n(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f39664a.mo48991z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.f39664a.mo48974B(i3);
            while (i2 < list.size()) {
                this.f39664a.mo48980n(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f39664a.mo48981o(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* renamed from: o */
    public final void mo49020o(int i, zzacc zzacc) throws IOException {
        this.f39664a.mo48982p(i, zzacc);
    }

    /* renamed from: p */
    public final void mo49021p(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f39664a.mo48982p(i, (zzacc) list.get(i2));
        }
    }

    /* renamed from: q */
    public final void mo49022q(int i, double d) throws IOException {
        this.f39664a.mo48985t(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: r */
    public final void mo49023r(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f39664a.mo48991z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.f39664a.mo48974B(i3);
            while (i2 < list.size()) {
                this.f39664a.mo48986u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f39664a.mo48985t(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Deprecated
    /* renamed from: s */
    public final void mo49024s(int i) throws IOException {
        this.f39664a.mo48991z(i, 4);
    }

    /* renamed from: t */
    public final void mo49025t(int i, int i2) throws IOException {
        this.f39664a.mo48987v(i, i2);
    }

    /* renamed from: u */
    public final void mo49026u(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f39664a.mo48991z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzacn.m56306G(((Integer) list.get(i4)).intValue());
            }
            this.f39664a.mo48974B(i3);
            while (i2 < list.size()) {
                this.f39664a.mo48988w(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f39664a.mo48987v(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: v */
    public final void mo49027v(int i, int i2) throws IOException {
        this.f39664a.mo48983r(i, i2);
    }

    /* renamed from: w */
    public final void mo49028w(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f39664a.mo48991z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f39664a.mo48974B(i3);
            while (i2 < list.size()) {
                this.f39664a.mo48984s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f39664a.mo48983r(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: x */
    public final void mo49029x(int i, long j) throws IOException {
        this.f39664a.mo48985t(i, j);
    }

    /* renamed from: y */
    public final void mo49030y(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f39664a.mo48991z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f39664a.mo48974B(i3);
            while (i2 < list.size()) {
                this.f39664a.mo48986u(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f39664a.mo48985t(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: z */
    public final void mo49031z(int i, float f) throws IOException {
        this.f39664a.mo48983r(i, Float.floatToRawIntBits(f));
    }
}
