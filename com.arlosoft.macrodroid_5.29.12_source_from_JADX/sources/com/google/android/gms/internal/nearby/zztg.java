package com.google.android.gms.internal.nearby;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
class zztg extends zzth {

    /* renamed from: f */
    final zztb f45137f;

    /* renamed from: g */
    final Character f45138g;

    zztg(zztb zztb, Character ch) {
        this.f45137f = zztb;
        boolean z = true;
        if (ch != null && zztb.mo53291b(ch.charValue())) {
            z = false;
        }
        zzsg.m62988f(z, "Padding character %s was already in alphabet", ch);
        this.f45138g = ch;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo53295a(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        Objects.requireNonNull(appendable);
        int i3 = 0;
        zzsg.m62989g(0, i2, bArr.length);
        while (i3 < i2) {
            mo53300f(appendable, bArr, i3, Math.min(this.f45137f.f45131f, i2 - i3));
            i3 += this.f45137f.f45131f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo53296b(int i) {
        zztb zztb = this.f45137f;
        return zztb.f45130e * zztj.m63066a(i, zztb.f45131f, RoundingMode.CEILING);
    }

    /* renamed from: c */
    public final zzth mo53297c(String str, int i) {
        boolean z = false;
        for (int i2 = 0; i2 <= 0; i2++) {
            zzsg.m62988f(true ^ this.f45137f.mo53291b(":".charAt(i2)), "Separator (%s) cannot contain alphabet characters", ":");
        }
        Character ch = this.f45138g;
        if (ch != null) {
            if (":".indexOf(ch.charValue()) < 0) {
                z = true;
            }
            zzsg.m62988f(z, "Separator (%s) cannot contain padding character", ":");
        }
        return new zztf(this, ":", 2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zztg) {
            zztg zztg = (zztg) obj;
            if (!this.f45137f.equals(zztg.f45137f) || !zzsb.m62978a(this.f45138g, zztg.f45138g)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo53300f(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzsg.m62989g(i, i + i2, bArr.length);
        int i3 = 0;
        zzsg.m62986d(i2 <= this.f45137f.f45131f);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | ((long) (bArr[i + i4] & 255))) << 8;
        }
        int i5 = ((i2 + 1) * 8) - this.f45137f.f45129d;
        while (i3 < i2 * 8) {
            zztb zztb = this.f45137f;
            appendable.append(zztb.mo53290a(((int) (j >>> (i5 - i3))) & zztb.f45128c));
            i3 += this.f45137f.f45129d;
        }
        if (this.f45138g != null) {
            while (i3 < this.f45137f.f45131f * 8) {
                appendable.append(this.f45138g.charValue());
                i3 += this.f45137f.f45129d;
            }
        }
    }

    public final int hashCode() {
        return this.f45137f.hashCode() ^ Arrays.hashCode(new Object[]{this.f45138g});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.f45137f.toString());
        if (8 % this.f45137f.f45129d != 0) {
            if (this.f45138g == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.f45138g);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    zztg(String str, String str2, Character ch) {
        this(new zztb(str, str2.toCharArray()), ch);
    }
}
