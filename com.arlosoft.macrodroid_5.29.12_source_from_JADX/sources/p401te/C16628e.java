package p401te;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import p352oe.C15855b;
import p352oe.C15861e;
import p352oe.C15864f;
import p352oe.C15867g;
import p352oe.C15870h;
import p352oe.C15892q;
import p365pe.C16194m;
import p383re.C16501d;
import p392se.C16553g;

/* renamed from: te.e */
/* compiled from: ZoneOffsetTransitionRule */
public final class C16628e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    private final int adjustDays;
    private final byte dom;
    private final C15855b dow;
    private final C15870h month;
    private final C15892q offsetAfter;
    private final C15892q offsetBefore;
    private final C15892q standardOffset;
    private final C15867g time;
    private final C16630b timeDefinition;

    /* renamed from: te.e$a */
    /* compiled from: ZoneOffsetTransitionRule */
    static /* synthetic */ class C16629a {

        /* renamed from: a */
        static final /* synthetic */ int[] f67484a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                te.e$b[] r0 = p401te.C16628e.C16630b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f67484a = r0
                te.e$b r1 = p401te.C16628e.C16630b.UTC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f67484a     // Catch:{ NoSuchFieldError -> 0x001d }
                te.e$b r1 = p401te.C16628e.C16630b.STANDARD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p401te.C16628e.C16629a.<clinit>():void");
        }
    }

    /* renamed from: te.e$b */
    /* compiled from: ZoneOffsetTransitionRule */
    public enum C16630b {
        UTC,
        WALL,
        STANDARD;

        /* renamed from: b */
        public C15864f mo79538b(C15864f fVar, C15892q qVar, C15892q qVar2) {
            int i = C16629a.f67484a[ordinal()];
            if (i == 1) {
                return fVar.mo75744r0((long) (qVar2.mo75866E() - C15892q.f65382p.mo75866E()));
            }
            if (i != 2) {
                return fVar;
            }
            return fVar.mo75744r0((long) (qVar2.mo75866E() - qVar.mo75866E()));
        }
    }

    C16628e(C15870h hVar, int i, C15855b bVar, C15867g gVar, int i2, C16630b bVar2, C15892q qVar, C15892q qVar2, C15892q qVar3) {
        this.month = hVar;
        this.dom = (byte) i;
        this.dow = bVar;
        this.time = gVar;
        this.adjustDays = i2;
        this.timeDefinition = bVar2;
        this.standardOffset = qVar;
        this.offsetBefore = qVar2;
        this.offsetAfter = qVar3;
    }

    /* renamed from: a */
    private void m99028a(StringBuilder sb, long j) {
        if (j < 10) {
            sb.append(0);
        }
        sb.append(j);
    }

    /* renamed from: c */
    static C16628e m99029c(DataInput dataInput) throws IOException {
        C15855b bVar;
        int readInt = dataInput.readInt();
        C15870h w = C15870h.m95686w(readInt >>> 28);
        int i = ((264241152 & readInt) >>> 22) - 32;
        int i2 = (3670016 & readInt) >>> 19;
        if (i2 == 0) {
            bVar = null;
        } else {
            bVar = C15855b.m95488j(i2);
        }
        C15855b bVar2 = bVar;
        int i3 = (507904 & readInt) >>> 14;
        C16630b bVar3 = C16630b.values()[(readInt & 12288) >>> 12];
        int i4 = (readInt & 4080) >>> 4;
        int i5 = (readInt & 12) >>> 2;
        int i6 = readInt & 3;
        int readInt2 = i3 == 31 ? dataInput.readInt() : i3 * 3600;
        C15892q H = C15892q.m95835H(i4 == 255 ? dataInput.readInt() : (i4 - 128) * TypedValues.Custom.TYPE_INT);
        C15892q H2 = C15892q.m95835H(i5 == 3 ? dataInput.readInt() : H.mo75866E() + (i5 * 1800));
        C15892q H3 = C15892q.m95835H(i6 == 3 ? dataInput.readInt() : H.mo75866E() + (i6 * 1800));
        if (i >= -28 && i <= 31 && i != 0) {
            return new C16628e(w, i, bVar2, C15867g.m95648N((long) C16501d.m98545f(readInt2, 86400)), C16501d.m98543d(readInt2, 86400), bVar3, H, H2, H3);
        }
        throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
    }

    private Object writeReplace() {
        return new C16623a((byte) 3, this);
    }

    /* renamed from: b */
    public C16627d mo79533b(int i) {
        C15861e eVar;
        byte b = this.dom;
        if (b < 0) {
            C15870h hVar = this.month;
            eVar = C15861e.m95545u0(i, hVar, hVar.mo75780m(C16194m.f66460g.mo78676y((long) i)) + 1 + this.dom);
            C15855b bVar = this.dow;
            if (bVar != null) {
                eVar = eVar.mo75673k(C16553g.m98724b(bVar));
            }
        } else {
            eVar = C15861e.m95545u0(i, this.month, b);
            C15855b bVar2 = this.dow;
            if (bVar2 != null) {
                eVar = eVar.mo75673k(C16553g.m98723a(bVar2));
            }
        }
        return new C16627d(this.timeDefinition.mo79538b(C15864f.m95600c0(eVar.mo75679A0((long) this.adjustDays), this.time), this.standardOffset, this.offsetBefore), this.offsetBefore, this.offsetAfter);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo79534d(DataOutput dataOutput) throws IOException {
        int i;
        int i2;
        int i3;
        int a0 = this.time.mo75763a0() + (this.adjustDays * 86400);
        int E = this.standardOffset.mo75866E();
        int E2 = this.offsetBefore.mo75866E() - E;
        int E3 = this.offsetAfter.mo75866E() - E;
        if (a0 % 3600 != 0 || a0 > 86400) {
            i = 31;
        } else {
            i = a0 == 86400 ? 24 : this.time.mo75753C();
        }
        int i4 = E % TypedValues.Custom.TYPE_INT == 0 ? (E / TypedValues.Custom.TYPE_INT) + 128 : 255;
        if (E2 == 0 || E2 == 1800 || E2 == 3600) {
            i2 = E2 / 1800;
        } else {
            i2 = 3;
        }
        if (E3 == 0 || E3 == 1800 || E3 == 3600) {
            i3 = E3 / 1800;
        } else {
            i3 = 3;
        }
        C15855b bVar = this.dow;
        dataOutput.writeInt((this.month.getValue() << 28) + ((this.dom + 32) << 22) + ((bVar == null ? 0 : bVar.getValue()) << 19) + (i << 14) + (this.timeDefinition.ordinal() << 12) + (i4 << 4) + (i2 << 2) + i3);
        if (i == 31) {
            dataOutput.writeInt(a0);
        }
        if (i4 == 255) {
            dataOutput.writeInt(E);
        }
        if (i2 == 3) {
            dataOutput.writeInt(this.offsetBefore.mo75866E());
        }
        if (i3 == 3) {
            dataOutput.writeInt(this.offsetAfter.mo75866E());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16628e)) {
            return false;
        }
        C16628e eVar = (C16628e) obj;
        if (this.month == eVar.month && this.dom == eVar.dom && this.dow == eVar.dow && this.timeDefinition == eVar.timeDefinition && this.adjustDays == eVar.adjustDays && this.time.equals(eVar.time) && this.standardOffset.equals(eVar.standardOffset) && this.offsetBefore.equals(eVar.offsetBefore) && this.offsetAfter.equals(eVar.offsetAfter)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int a0 = ((this.time.mo75763a0() + this.adjustDays) << 15) + (this.month.ordinal() << 11) + ((this.dom + 32) << 5);
        C15855b bVar = this.dow;
        return ((((a0 + ((bVar == null ? 7 : bVar.ordinal()) << 2)) + this.timeDefinition.ordinal()) ^ this.standardOffset.hashCode()) ^ this.offsetBefore.hashCode()) ^ this.offsetAfter.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransitionRule[");
        sb.append(this.offsetBefore.compareTo(this.offsetAfter) > 0 ? "Gap " : "Overlap ");
        sb.append(this.offsetBefore);
        sb.append(" to ");
        sb.append(this.offsetAfter);
        sb.append(", ");
        C15855b bVar = this.dow;
        if (bVar != null) {
            byte b = this.dom;
            if (b == -1) {
                sb.append(bVar.name());
                sb.append(" on or before last day of ");
                sb.append(this.month.name());
            } else if (b < 0) {
                sb.append(bVar.name());
                sb.append(" on or before last day minus ");
                sb.append((-this.dom) - 1);
                sb.append(" of ");
                sb.append(this.month.name());
            } else {
                sb.append(bVar.name());
                sb.append(" on or after ");
                sb.append(this.month.name());
                sb.append(' ');
                sb.append(this.dom);
            }
        } else {
            sb.append(this.month.name());
            sb.append(' ');
            sb.append(this.dom);
        }
        sb.append(" at ");
        if (this.adjustDays == 0) {
            sb.append(this.time);
        } else {
            long a0 = (long) ((this.time.mo75763a0() / 60) + (this.adjustDays * 24 * 60));
            m99028a(sb, C16501d.m98544e(a0, 60));
            sb.append(':');
            m99028a(sb, (long) C16501d.m98546g(a0, 60));
        }
        sb.append(" ");
        sb.append(this.timeDefinition);
        sb.append(", standard offset ");
        sb.append(this.standardOffset);
        sb.append(']');
        return sb.toString();
    }
}
