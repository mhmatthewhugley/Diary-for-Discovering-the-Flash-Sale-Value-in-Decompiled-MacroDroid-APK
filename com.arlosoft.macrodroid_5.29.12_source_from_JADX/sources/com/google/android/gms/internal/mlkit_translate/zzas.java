package com.google.android.gms.internal.mlkit_translate;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
class zzas extends zzat {

    /* renamed from: f */
    final zzao f43118f;

    /* renamed from: g */
    final Character f43119g;

    zzas(zzao zzao, Character ch) {
        this.f43118f = zzao;
        if (ch == null || !zzao.mo52058d(ch.charValue())) {
            this.f43119g = ch;
            return;
        }
        throw new IllegalArgumentException(zzl.m61936a("Padding character %s was already in alphabet", ch));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo52062a(byte[] bArr, CharSequence charSequence) throws zzar {
        zzao zzao;
        Objects.requireNonNull(bArr);
        CharSequence c = mo52064c(charSequence);
        if (this.f43118f.mo52057c(c.length())) {
            int i = 0;
            int i2 = 0;
            while (i < c.length()) {
                long j = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    zzao = this.f43118f;
                    if (i3 >= zzao.f43113d) {
                        break;
                    }
                    j <<= zzao.f43112c;
                    if (i + i3 < c.length()) {
                        j |= (long) this.f43118f.mo52056b(c.charAt(i4 + i));
                        i4++;
                    }
                    i3++;
                }
                int i5 = zzao.f43114e;
                int i6 = (i5 * 8) - (i4 * zzao.f43112c);
                int i7 = (i5 - 1) * 8;
                while (i7 >= i6) {
                    bArr[i2] = (byte) ((int) ((j >>> i7) & 255));
                    i7 -= 8;
                    i2++;
                }
                i += this.f43118f.f43113d;
            }
            return i2;
        }
        throw new zzar("Invalid input length " + c.length());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo52063b(int i) {
        return (int) (((((long) this.f43118f.f43112c) * ((long) i)) + 7) / 8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final CharSequence mo52064c(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        Character ch = this.f43119g;
        if (ch == null) {
            return charSequence;
        }
        char charValue = ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0 || charSequence.charAt(length) != charValue) {
            }
            length--;
            break;
        } while (charSequence.charAt(length) != charValue);
        return charSequence.subSequence(0, length + 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzas) {
            zzas zzas = (zzas) obj;
            if (!this.f43118f.equals(zzas.f43118f) || !zze.m61775a(this.f43119g, zzas.f43119g)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f43118f.hashCode() ^ Arrays.hashCode(new Object[]{this.f43119g});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.f43118f.toString());
        if (8 % this.f43118f.f43112c != 0) {
            if (this.f43119g == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.f43119g);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    zzas(String str, String str2, Character ch) {
        this(new zzao(str, str2.toCharArray()), ch);
    }
}
