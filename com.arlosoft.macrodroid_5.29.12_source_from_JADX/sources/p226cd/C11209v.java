package p226cd;

import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p244dd.C12014c;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00130'\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b1\u00102J\b\u0010\u0002\u001a\u00020\u0001H\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0001H\u0016J\u0017\u0010\n\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0013H\u0016J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0016J(\u0010 \u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0016J\u000f\u0010!\u001a\u00020\u0013H\u0010¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020\u001e2\b\u0010\u001c\u001a\u0004\u0018\u00010#H\u0002J\b\u0010%\u001a\u00020\fH\u0016J\b\u0010&\u001a\u00020\u0005H\u0016R \u0010(\u001a\b\u0012\u0004\u0012\u00020\u00130'8\u0000X\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010-\u001a\u00020,8\u0000X\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00063"}, mo71668d2 = {"Lcd/v;", "Lcd/e;", "N", "Ljava/lang/Object;", "writeReplace", "", "b", "m", "F", "algorithm", "e", "(Ljava/lang/String;)Lcd/e;", "", "pos", "", "q", "(I)B", "k", "()I", "", "G", "Lcd/b;", "buffer", "offset", "byteCount", "Lja/u;", "I", "(Lcd/b;II)V", "other", "otherOffset", "", "t", "v", "n", "()[B", "", "equals", "hashCode", "toString", "", "segments", "[[B", "L", "()[[B", "", "directory", "[I", "J", "()[I", "<init>", "([[B[I)V", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* renamed from: cd.v */
/* compiled from: SegmentedByteString.kt */
public final class C11209v extends C11188e {

    /* renamed from: g */
    private final transient byte[][] f54154g;

    /* renamed from: o */
    private final transient int[] f54155o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11209v(byte[][] bArr, int[] iArr) {
        super(C11188e.f54105f.mo62498i());
        C13706o.m87929f(bArr, "segments");
        C13706o.m87929f(iArr, "directory");
        this.f54154g = bArr;
        this.f54155o = iArr;
    }

    /* renamed from: N */
    private final C11188e m75236N() {
        return new C11188e(mo62488G());
    }

    private final Object writeReplace() {
        return m75236N();
    }

    /* renamed from: F */
    public C11188e mo62487F() {
        return m75236N().mo62487F();
    }

    /* renamed from: G */
    public byte[] mo62488G() {
        byte[] bArr = new byte[mo62485C()];
        int length = mo62568L().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = mo62567J()[length + i];
            int i5 = mo62567J()[i];
            int i6 = i5 - i2;
            byte[] unused = C13593l.m87558e(mo62568L()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    /* renamed from: I */
    public void mo62490I(C11179b bVar, int i, int i2) {
        int i3;
        C13706o.m87929f(bVar, "buffer");
        int i4 = i + i2;
        int b = C12014c.m82463b(this, i);
        while (i < i4) {
            if (b == 0) {
                i3 = 0;
            } else {
                i3 = mo62567J()[b - 1];
            }
            int i5 = mo62567J()[mo62568L().length + b];
            int min = Math.min(i4, (mo62567J()[b] - i3) + i3) - i;
            int i6 = i5 + (i - i3);
            C11206t tVar = new C11206t(mo62568L()[b], i6, i6 + min, true, false);
            C11206t tVar2 = bVar.f54090a;
            if (tVar2 == null) {
                tVar.f54148g = tVar;
                tVar.f54147f = tVar;
                bVar.f54090a = tVar;
            } else {
                C13706o.m87926c(tVar2);
                C11206t tVar3 = tVar2.f54148g;
                C13706o.m87926c(tVar3);
                tVar3.mo62563c(tVar);
            }
            i += min;
            b++;
        }
        bVar.mo62398C(bVar.mo62399D() + ((long) i2));
    }

    /* renamed from: J */
    public final int[] mo62567J() {
        return this.f54155o;
    }

    /* renamed from: L */
    public final byte[][] mo62568L() {
        return this.f54154g;
    }

    /* renamed from: b */
    public String mo62491b() {
        return m75236N().mo62491b();
    }

    /* renamed from: e */
    public C11188e mo62494e(String str) {
        C13706o.m87929f(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        int length = mo62568L().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = mo62567J()[length + i];
            int i4 = mo62567J()[i];
            instance.update(mo62568L()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = instance.digest();
        C13706o.m87928e(digest, "digestBytes");
        return new C11188e(digest);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11188e) {
            C11188e eVar = (C11188e) obj;
            return eVar.mo62485C() == mo62485C() && mo62505t(0, eVar, 0, mo62485C());
        }
    }

    public int hashCode() {
        int j = mo62499j();
        if (j != 0) {
            return j;
        }
        int length = mo62568L().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = mo62567J()[length + i];
            int i5 = mo62567J()[i];
            byte[] bArr = mo62568L()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        mo62508w(i2);
        return i2;
    }

    /* renamed from: k */
    public int mo62500k() {
        return mo62567J()[mo62568L().length - 1];
    }

    /* renamed from: m */
    public String mo62502m() {
        return m75236N().mo62502m();
    }

    /* renamed from: n */
    public byte[] mo62503n() {
        return mo62488G();
    }

    /* renamed from: q */
    public byte mo62504q(int i) {
        int i2;
        C11187d0.m75097b((long) mo62567J()[mo62568L().length - 1], (long) i, 1);
        int b = C12014c.m82463b(this, i);
        if (b == 0) {
            i2 = 0;
        } else {
            i2 = mo62567J()[b - 1];
        }
        return mo62568L()[b][(i - i2) + mo62567J()[mo62568L().length + b]];
    }

    /* renamed from: t */
    public boolean mo62505t(int i, C11188e eVar, int i2, int i3) {
        int i4;
        C13706o.m87929f(eVar, "other");
        if (i < 0 || i > mo62485C() - i3) {
            return false;
        }
        int i5 = i3 + i;
        int b = C12014c.m82463b(this, i);
        while (i < i5) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = mo62567J()[b - 1];
            }
            int i6 = mo62567J()[mo62568L().length + b];
            int min = Math.min(i5, (mo62567J()[b] - i4) + i4) - i;
            if (!eVar.mo62507v(i2, mo62568L()[b], i6 + (i - i4), min)) {
                return false;
            }
            i2 += min;
            i += min;
            b++;
        }
        return true;
    }

    public String toString() {
        return m75236N().toString();
    }

    /* renamed from: v */
    public boolean mo62507v(int i, byte[] bArr, int i2, int i3) {
        int i4;
        C13706o.m87929f(bArr, "other");
        if (i < 0 || i > mo62485C() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int b = C12014c.m82463b(this, i);
        while (i < i5) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = mo62567J()[b - 1];
            }
            int i6 = mo62567J()[mo62568L().length + b];
            int min = Math.min(i5, (mo62567J()[b] - i4) + i4) - i;
            if (!C11187d0.m75096a(mo62568L()[b], i6 + (i - i4), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            b++;
        }
        return true;
    }
}
