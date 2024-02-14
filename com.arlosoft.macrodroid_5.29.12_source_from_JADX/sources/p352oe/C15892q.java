package p352oe;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.commons.cli.HelpFormatter;
import org.threeten.p356bp.DateTimeException;
import org.threeten.p356bp.temporal.UnsupportedTemporalTypeException;
import p392se.C16540a;
import p392se.C16550d;
import p392se.C16551e;
import p392se.C16552f;
import p392se.C16556h;
import p392se.C16557i;
import p392se.C16565j;
import p392se.C16567l;
import p401te.C16631f;

/* renamed from: oe.q */
/* compiled from: ZoneOffset */
public final class C15892q extends C15890p implements C16551e, C16552f, Comparable<C15892q> {

    /* renamed from: f */
    public static final C16565j<C15892q> f65379f = new C15893a();

    /* renamed from: g */
    private static final ConcurrentMap<Integer, C15892q> f65380g = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: o */
    private static final ConcurrentMap<String, C15892q> f65381o = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: p */
    public static final C15892q f65382p = m95835H(0);

    /* renamed from: s */
    public static final C15892q f65383s = m95835H(-64800);
    private static final long serialVersionUID = 2357656521762053153L;

    /* renamed from: z */
    public static final C15892q f65384z = m95835H(64800);

    /* renamed from: d */
    private final transient String f65385d;
    private final int totalSeconds;

    /* renamed from: oe.q$a */
    /* compiled from: ZoneOffset */
    class C15893a implements C16565j<C15892q> {
        C15893a() {
        }

        /* renamed from: b */
        public C15892q mo75649a(C16551e eVar) {
            return C15892q.m95832C(eVar);
        }
    }

    private C15892q(int i) {
        this.totalSeconds = i;
        this.f65385d = m95840y(i);
    }

    /* renamed from: C */
    public static C15892q m95832C(C16551e eVar) {
        C15892q qVar = (C15892q) eVar.mo75648r(C16557i.m98736d());
        if (qVar != null) {
            return qVar;
        }
        throw new DateTimeException("Unable to obtain ZoneOffset from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bd  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p352oe.C15892q m95833F(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            p383re.C16501d.m98548i(r7, r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, oe.q> r0 = f65381o
            java.lang.Object r0 = r0.get(r7)
            oe.q r0 = (p352oe.C15892q) r0
            if (r0 == 0) goto L_0x0010
            return r0
        L_0x0010:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x006d
            r1 = 3
            if (r0 == r1) goto L_0x0089
            r4 = 5
            if (r0 == r4) goto L_0x0064
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L_0x005b
            r5 = 7
            if (r0 == r5) goto L_0x004e
            r1 = 9
            if (r0 != r1) goto L_0x0037
            int r0 = m95836I(r7, r2, r3)
            int r1 = m95836I(r7, r6, r2)
            int r2 = m95836I(r7, r5, r2)
            goto L_0x008f
        L_0x0037:
            org.threeten.bp.DateTimeException r0 = new org.threeten.bp.DateTimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid ID for ZoneOffset, invalid format: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L_0x004e:
            int r0 = m95836I(r7, r2, r3)
            int r1 = m95836I(r7, r1, r3)
            int r2 = m95836I(r7, r4, r3)
            goto L_0x008f
        L_0x005b:
            int r0 = m95836I(r7, r2, r3)
            int r1 = m95836I(r7, r6, r2)
            goto L_0x008e
        L_0x0064:
            int r0 = m95836I(r7, r2, r3)
            int r1 = m95836I(r7, r1, r3)
            goto L_0x008e
        L_0x006d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r7.charAt(r3)
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            char r7 = r7.charAt(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
        L_0x0089:
            int r0 = m95836I(r7, r2, r3)
            r1 = 0
        L_0x008e:
            r2 = 0
        L_0x008f:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L_0x00b3
            if (r3 != r5) goto L_0x009c
            goto L_0x00b3
        L_0x009c:
            org.threeten.bp.DateTimeException r0 = new org.threeten.bp.DateTimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L_0x00b3:
            if (r3 != r5) goto L_0x00bd
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            oe.q r7 = m95834G(r7, r0, r1)
            return r7
        L_0x00bd:
            oe.q r7 = m95834G(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p352oe.C15892q.m95833F(java.lang.String):oe.q");
    }

    /* renamed from: G */
    public static C15892q m95834G(int i, int i2, int i3) {
        m95839N(i, i2, i3);
        return m95835H(m95838L(i, i2, i3));
    }

    /* renamed from: H */
    public static C15892q m95835H(int i) {
        if (Math.abs(i) > 64800) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        } else if (i % TypedValues.Custom.TYPE_INT != 0) {
            return new C15892q(i);
        } else {
            Integer valueOf = Integer.valueOf(i);
            ConcurrentMap<Integer, C15892q> concurrentMap = f65380g;
            C15892q qVar = (C15892q) concurrentMap.get(valueOf);
            if (qVar != null) {
                return qVar;
            }
            concurrentMap.putIfAbsent(valueOf, new C15892q(i));
            C15892q qVar2 = (C15892q) concurrentMap.get(valueOf);
            f65381o.putIfAbsent(qVar2.getId(), qVar2);
            return qVar2;
        }
    }

    /* renamed from: I */
    private static int m95836I(CharSequence charSequence, int i, boolean z) {
        if (!z || charSequence.charAt(i - 1) == ':') {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence.charAt(i + 1);
            if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
                return ((charAt - '0') * 10) + (charAt2 - '0');
            }
            throw new DateTimeException("Invalid ID for ZoneOffset, non numeric characters found: " + charSequence);
        }
        throw new DateTimeException("Invalid ID for ZoneOffset, colon not found when expected: " + charSequence);
    }

    /* renamed from: J */
    static C15892q m95837J(DataInput dataInput) throws IOException {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? m95835H(dataInput.readInt()) : m95835H(readByte * 900);
    }

    /* renamed from: L */
    private static int m95838L(int i, int i2, int i3) {
        return (i * 3600) + (i2 * 60) + i3;
    }

    /* renamed from: N */
    private static void m95839N(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            throw new DateTimeException("Zone offset hours not in valid range: value " + i + " is not in the range -18 to 18");
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new DateTimeException("Zone offset minutes and seconds must have the same sign");
        }
        if (Math.abs(i2) > 59) {
            throw new DateTimeException("Zone offset minutes not in valid range: abs(value) " + Math.abs(i2) + " is not in the range 0 to 59");
        } else if (Math.abs(i3) > 59) {
            throw new DateTimeException("Zone offset seconds not in valid range: abs(value) " + Math.abs(i3) + " is not in the range 0 to 59");
        } else if (Math.abs(i) != 18) {
        } else {
            if (Math.abs(i2) > 0 || Math.abs(i3) > 0) {
                throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
            }
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C15883m((byte) 8, this);
    }

    /* renamed from: y */
    private static String m95840y(int i) {
        if (i == 0) {
            return "Z";
        }
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder();
        int i2 = abs / 3600;
        int i3 = (abs / 60) % 60;
        sb.append(i < 0 ? HelpFormatter.DEFAULT_OPT_PREFIX : "+");
        sb.append(i2 < 10 ? "0" : "");
        sb.append(i2);
        String str = ":0";
        sb.append(i3 < 10 ? str : ":");
        sb.append(i3);
        int i4 = abs % 60;
        if (i4 != 0) {
            if (i4 >= 10) {
                str = ":";
            }
            sb.append(str);
            sb.append(i4);
        }
        return sb.toString();
    }

    /* renamed from: A */
    public int compareTo(C15892q qVar) {
        return qVar.totalSeconds - this.totalSeconds;
    }

    /* renamed from: E */
    public int mo75866E() {
        return this.totalSeconds;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo75867P(DataOutput dataOutput) throws IOException {
        int i = this.totalSeconds;
        int i2 = i % TypedValues.Custom.TYPE_INT == 0 ? i / TypedValues.Custom.TYPE_INT : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15892q) || this.totalSeconds != ((C15892q) obj).totalSeconds) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C16567l mo75641f(C16556h hVar) {
        if (hVar == C16540a.OFFSET_SECONDS) {
            return hVar.mo79343g();
        }
        if (!(hVar instanceof C16540a)) {
            return hVar.mo79342f(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + hVar);
    }

    /* renamed from: g */
    public boolean mo75642g(C16556h hVar) {
        if (hVar instanceof C16540a) {
            if (hVar == C16540a.OFFSET_SECONDS) {
                return true;
            }
            return false;
        } else if (hVar == null || !hVar.mo79341e(this)) {
            return false;
        } else {
            return true;
        }
    }

    public String getId() {
        return this.f65385d;
    }

    public int hashCode() {
        return this.totalSeconds;
    }

    /* renamed from: j */
    public C16631f mo75860j() {
        return C16631f.m99033g(this);
    }

    /* renamed from: l */
    public long mo75644l(C16556h hVar) {
        if (hVar == C16540a.OFFSET_SECONDS) {
            return (long) this.totalSeconds;
        }
        if (!(hVar instanceof C16540a)) {
            return hVar.mo79340d(this);
        }
        throw new DateTimeException("Unsupported field: " + hVar);
    }

    /* renamed from: n */
    public C16550d mo75646n(C16550d dVar) {
        return dVar.mo75669d(C16540a.OFFSET_SECONDS, (long) this.totalSeconds);
    }

    /* renamed from: q */
    public int mo75647q(C16556h hVar) {
        if (hVar == C16540a.OFFSET_SECONDS) {
            return this.totalSeconds;
        }
        if (!(hVar instanceof C16540a)) {
            return mo75641f(hVar).mo79364a(mo75644l(hVar), hVar);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + hVar);
    }

    /* renamed from: r */
    public <R> R mo75648r(C16565j<R> jVar) {
        if (jVar == C16557i.m98736d() || jVar == C16557i.m98738f()) {
            return this;
        }
        if (jVar == C16557i.m98734b() || jVar == C16557i.m98735c() || jVar == C16557i.m98737e() || jVar == C16557i.m98733a() || jVar == C16557i.m98739g()) {
            return null;
        }
        return jVar.mo75649a(this);
    }

    public String toString() {
        return this.f65385d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo75863x(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        mo75867P(dataOutput);
    }
}
