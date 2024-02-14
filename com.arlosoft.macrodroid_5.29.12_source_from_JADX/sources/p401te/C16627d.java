package p401te;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p352oe.C15857c;
import p352oe.C15858d;
import p352oe.C15864f;
import p352oe.C15892q;

/* renamed from: te.d */
/* compiled from: ZoneOffsetTransition */
public final class C16627d implements Comparable<C16627d>, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;
    private final C15892q offsetAfter;
    private final C15892q offsetBefore;
    private final C15864f transition;

    C16627d(C15864f fVar, C15892q qVar, C15892q qVar2) {
        this.transition = fVar;
        this.offsetBefore = qVar;
        this.offsetAfter = qVar2;
    }

    /* renamed from: g */
    private int m99015g() {
        return mo79526j().mo75866E() - mo79527k().mo75866E();
    }

    /* renamed from: n */
    static C16627d m99016n(DataInput dataInput) throws IOException {
        long b = C16623a.m98989b(dataInput);
        C15892q d = C16623a.m98991d(dataInput);
        C15892q d2 = C16623a.m98991d(dataInput);
        if (!d.equals(d2)) {
            return new C16627d(b, d, d2);
        }
        throw new IllegalArgumentException("Offsets must not be equal");
    }

    private Object writeReplace() {
        return new C16623a((byte) 2, this);
    }

    /* renamed from: b */
    public int compareTo(C16627d dVar) {
        return mo79525i().compareTo(dVar.mo79525i());
    }

    /* renamed from: d */
    public C15864f mo79520d() {
        return this.transition.mo75744r0((long) m99015g());
    }

    /* renamed from: e */
    public C15864f mo79521e() {
        return this.transition;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16627d)) {
            return false;
        }
        C16627d dVar = (C16627d) obj;
        if (!this.transition.equals(dVar.transition) || !this.offsetBefore.equals(dVar.offsetBefore) || !this.offsetAfter.equals(dVar.offsetAfter)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C15857c mo79523f() {
        return C15857c.m95500g((long) m99015g());
    }

    public int hashCode() {
        return (this.transition.hashCode() ^ this.offsetBefore.hashCode()) ^ Integer.rotateLeft(this.offsetAfter.hashCode(), 16);
    }

    /* renamed from: i */
    public C15858d mo79525i() {
        return this.transition.mo78622J(this.offsetBefore);
    }

    /* renamed from: j */
    public C15892q mo79526j() {
        return this.offsetAfter;
    }

    /* renamed from: k */
    public C15892q mo79527k() {
        return this.offsetBefore;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public List<C15892q> mo79528l() {
        if (mo79529m()) {
            return Collections.emptyList();
        }
        return Arrays.asList(new C15892q[]{mo79527k(), mo79526j()});
    }

    /* renamed from: m */
    public boolean mo79529m() {
        return mo79526j().mo75866E() > mo79527k().mo75866E();
    }

    /* renamed from: q */
    public long mo79530q() {
        return this.transition.mo78621H(this.offsetBefore);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo79531r(DataOutput dataOutput) throws IOException {
        C16623a.m98992e(mo79530q(), dataOutput);
        C16623a.m98994g(this.offsetBefore, dataOutput);
        C16623a.m98994g(this.offsetAfter, dataOutput);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transition[");
        sb.append(mo79529m() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.transition);
        sb.append(this.offsetBefore);
        sb.append(" to ");
        sb.append(this.offsetAfter);
        sb.append(']');
        return sb.toString();
    }

    C16627d(long j, C15892q qVar, C15892q qVar2) {
        this.transition = C15864f.m95601d0(j, 0, qVar);
        this.offsetBefore = qVar;
        this.offsetAfter = qVar2;
    }
}
