package p365pe;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import org.threeten.p356bp.DateTimeException;
import p352oe.C15861e;
import p383re.C16498a;
import p392se.C16540a;
import p392se.C16556h;
import p392se.C16567l;

/* renamed from: pe.q */
/* compiled from: JapaneseEra */
public final class C16200q extends C16498a implements Serializable {

    /* renamed from: d */
    public static final C16200q f66474d;

    /* renamed from: f */
    public static final C16200q f66475f;

    /* renamed from: g */
    public static final C16200q f66476g;

    /* renamed from: o */
    public static final C16200q f66477o;

    /* renamed from: p */
    public static final C16200q f66478p;

    /* renamed from: s */
    private static final AtomicReference<C16200q[]> f66479s;
    private static final long serialVersionUID = 1466499369062886794L;

    /* renamed from: a */
    private final transient C15861e f66480a;

    /* renamed from: c */
    private final transient String f66481c;
    private final int eraValue;

    static {
        C16200q qVar = new C16200q(-1, C15861e.m95544t0(1868, 9, 8), "Meiji");
        f66474d = qVar;
        C16200q qVar2 = new C16200q(0, C15861e.m95544t0(1912, 7, 30), "Taisho");
        f66475f = qVar2;
        C16200q qVar3 = new C16200q(1, C15861e.m95544t0(1926, 12, 25), "Showa");
        f66476g = qVar3;
        C16200q qVar4 = new C16200q(2, C15861e.m95544t0(1989, 1, 8), "Heisei");
        f66477o = qVar4;
        C16200q qVar5 = new C16200q(3, C15861e.m95544t0(2019, 5, 1), "Reiwa");
        f66478p = qVar5;
        f66479s = new AtomicReference<>(new C16200q[]{qVar, qVar2, qVar3, qVar4, qVar5});
    }

    private C16200q(int i, C15861e eVar, String str) {
        this.eraValue = i;
        this.f66480a = eVar;
        this.f66481c = str;
    }

    /* renamed from: A */
    static C16200q m97348A(DataInput dataInput) throws IOException {
        return m97351x(dataInput.readByte());
    }

    /* renamed from: E */
    public static C16200q[] m97349E() {
        C16200q[] qVarArr = f66479s.get();
        return (C16200q[]) Arrays.copyOf(qVarArr, qVarArr.length);
    }

    private Object readResolve() throws ObjectStreamException {
        try {
            return m97351x(this.eraValue);
        } catch (DateTimeException e) {
            InvalidObjectException invalidObjectException = new InvalidObjectException("Invalid era");
            invalidObjectException.initCause(e);
            throw invalidObjectException;
        }
    }

    /* renamed from: v */
    static C16200q m97350v(C15861e eVar) {
        if (!eVar.mo75681C(f66474d.f66480a)) {
            C16200q[] qVarArr = f66479s.get();
            for (int length = qVarArr.length - 1; length >= 0; length--) {
                C16200q qVar = qVarArr[length];
                if (eVar.compareTo(qVar.f66480a) >= 0) {
                    return qVar;
                }
            }
            return null;
        }
        throw new DateTimeException("Date too early: " + eVar);
    }

    private Object writeReplace() {
        return new C16206u((byte) 2, this);
    }

    /* renamed from: x */
    public static C16200q m97351x(int i) {
        C16200q[] qVarArr = f66479s.get();
        if (i >= f66474d.eraValue && i <= qVarArr[qVarArr.length - 1].eraValue) {
            return qVarArr[m97352y(i)];
        }
        throw new DateTimeException("japaneseEra is invalid");
    }

    /* renamed from: y */
    private static int m97352y(int i) {
        return i + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public C15861e mo78692C() {
        return this.f66480a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo78693G(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(getValue());
    }

    /* renamed from: f */
    public C16567l mo75641f(C16556h hVar) {
        C16540a aVar = C16540a.ERA;
        if (hVar == aVar) {
            return C16196o.f66465o.mo78678C(aVar);
        }
        return super.mo75641f(hVar);
    }

    public int getValue() {
        return this.eraValue;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public C15861e mo78694t() {
        int y = m97352y(this.eraValue);
        C16200q[] E = m97349E();
        if (y >= E.length - 1) {
            return C15861e.f65324d;
        }
        return E[y + 1].mo78692C().mo75712m0(1);
    }

    public String toString() {
        return this.f66481c;
    }
}
