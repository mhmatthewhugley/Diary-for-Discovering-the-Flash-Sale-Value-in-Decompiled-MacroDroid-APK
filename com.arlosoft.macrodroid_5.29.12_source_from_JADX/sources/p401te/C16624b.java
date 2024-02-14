package p401te;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p352oe.C15858d;
import p352oe.C15861e;
import p352oe.C15864f;
import p352oe.C15892q;
import p383re.C16501d;
import p401te.C16631f;

/* renamed from: te.b */
/* compiled from: StandardZoneRules */
final class C16624b extends C16631f implements Serializable {
    private static final long serialVersionUID = 3044319355680032515L;
    private final C16628e[] lastRules;
    private final ConcurrentMap<Integer, C16627d[]> lastRulesCache = new ConcurrentHashMap();
    private final long[] savingsInstantTransitions;
    private final C15864f[] savingsLocalTransitions;
    private final C15892q[] standardOffsets;
    private final long[] standardTransitions;
    private final C15892q[] wallOffsets;

    private C16624b(long[] jArr, C15892q[] qVarArr, long[] jArr2, C15892q[] qVarArr2, C16628e[] eVarArr) {
        this.standardTransitions = jArr;
        this.standardOffsets = qVarArr;
        this.savingsInstantTransitions = jArr2;
        this.wallOffsets = qVarArr2;
        this.lastRules = eVarArr;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < jArr2.length) {
            int i2 = i + 1;
            C16627d dVar = new C16627d(jArr2[i], qVarArr2[i], qVarArr2[i2]);
            if (dVar.mo79529m()) {
                arrayList.add(dVar.mo79521e());
                arrayList.add(dVar.mo79520d());
            } else {
                arrayList.add(dVar.mo79520d());
                arrayList.add(dVar.mo79521e());
            }
            i = i2;
        }
        this.savingsLocalTransitions = (C15864f[]) arrayList.toArray(new C15864f[arrayList.size()]);
    }

    /* renamed from: h */
    private Object m98995h(C15864f fVar, C16627d dVar) {
        C15864f e = dVar.mo79521e();
        if (dVar.mo79529m()) {
            if (fVar.mo75723C(e)) {
                return dVar.mo79527k();
            }
            if (fVar.mo75723C(dVar.mo79520d())) {
                return dVar;
            }
            return dVar.mo79526j();
        } else if (!fVar.mo75723C(e)) {
            return dVar.mo79526j();
        } else {
            return fVar.mo75723C(dVar.mo79520d()) ? dVar.mo79527k() : dVar;
        }
    }

    /* renamed from: i */
    private C16627d[] m98996i(int i) {
        Integer valueOf = Integer.valueOf(i);
        C16627d[] dVarArr = (C16627d[]) this.lastRulesCache.get(valueOf);
        if (dVarArr != null) {
            return dVarArr;
        }
        C16628e[] eVarArr = this.lastRules;
        C16627d[] dVarArr2 = new C16627d[eVarArr.length];
        for (int i2 = 0; i2 < eVarArr.length; i2++) {
            dVarArr2[i2] = eVarArr[i2].mo79533b(i);
        }
        if (i < 2100) {
            this.lastRulesCache.putIfAbsent(valueOf, dVarArr2);
        }
        return dVarArr2;
    }

    /* renamed from: j */
    private int m98997j(long j, C15892q qVar) {
        return C15861e.m95546v0(C16501d.m98544e(j + ((long) qVar.mo75866E()), 86400)).mo75705d0();
    }

    /* renamed from: k */
    private Object m98998k(C15864f fVar) {
        int i = 0;
        if (this.lastRules.length > 0) {
            C15864f[] fVarArr = this.savingsLocalTransitions;
            if (fVarArr.length == 0 || fVar.mo75721A(fVarArr[fVarArr.length - 1])) {
                C16627d[] i2 = m98996i(fVar.mo75734a0());
                Object obj = null;
                int length = i2.length;
                while (i < length) {
                    C16627d dVar = i2[i];
                    Object h = m98995h(fVar, dVar);
                    if ((h instanceof C16627d) || h.equals(dVar.mo79527k())) {
                        return h;
                    }
                    i++;
                    obj = h;
                }
                return obj;
            }
        }
        int binarySearch = Arrays.binarySearch(this.savingsLocalTransitions, fVar);
        if (binarySearch == -1) {
            return this.wallOffsets[0];
        }
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        } else {
            C15864f[] fVarArr2 = this.savingsLocalTransitions;
            if (binarySearch < fVarArr2.length - 1) {
                int i3 = binarySearch + 1;
                if (fVarArr2[binarySearch].equals(fVarArr2[i3])) {
                    binarySearch = i3;
                }
            }
        }
        if ((binarySearch & 1) != 0) {
            return this.wallOffsets[(binarySearch / 2) + 1];
        }
        C15864f[] fVarArr3 = this.savingsLocalTransitions;
        C15864f fVar2 = fVarArr3[binarySearch];
        C15864f fVar3 = fVarArr3[binarySearch + 1];
        C15892q[] qVarArr = this.wallOffsets;
        int i4 = binarySearch / 2;
        C15892q qVar = qVarArr[i4];
        C15892q qVar2 = qVarArr[i4 + 1];
        if (qVar2.mo75866E() > qVar.mo75866E()) {
            return new C16627d(fVar2, qVar, qVar2);
        }
        return new C16627d(fVar3, qVar, qVar2);
    }

    /* renamed from: m */
    static C16624b m98999m(DataInput dataInput) throws IOException, ClassNotFoundException {
        int readInt = dataInput.readInt();
        long[] jArr = new long[readInt];
        for (int i = 0; i < readInt; i++) {
            jArr[i] = C16623a.m98989b(dataInput);
        }
        int i2 = readInt + 1;
        C15892q[] qVarArr = new C15892q[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            qVarArr[i3] = C16623a.m98991d(dataInput);
        }
        int readInt2 = dataInput.readInt();
        long[] jArr2 = new long[readInt2];
        for (int i4 = 0; i4 < readInt2; i4++) {
            jArr2[i4] = C16623a.m98989b(dataInput);
        }
        int i5 = readInt2 + 1;
        C15892q[] qVarArr2 = new C15892q[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            qVarArr2[i6] = C16623a.m98991d(dataInput);
        }
        int readByte = dataInput.readByte();
        C16628e[] eVarArr = new C16628e[readByte];
        for (int i7 = 0; i7 < readByte; i7++) {
            eVarArr[i7] = C16628e.m99029c(dataInput);
        }
        return new C16624b(jArr, qVarArr, jArr2, qVarArr2, eVarArr);
    }

    private Object writeReplace() {
        return new C16623a((byte) 1, this);
    }

    /* renamed from: a */
    public C15892q mo79501a(C15858d dVar) {
        long y = dVar.mo75676y();
        if (this.lastRules.length > 0) {
            long[] jArr = this.savingsInstantTransitions;
            if (jArr.length == 0 || y > jArr[jArr.length - 1]) {
                C15892q[] qVarArr = this.wallOffsets;
                C16627d[] i = m98996i(m98997j(y, qVarArr[qVarArr.length - 1]));
                C16627d dVar2 = null;
                for (int i2 = 0; i2 < i.length; i2++) {
                    dVar2 = i[i2];
                    if (y < dVar2.mo79530q()) {
                        return dVar2.mo79527k();
                    }
                }
                return dVar2.mo79526j();
            }
        }
        int binarySearch = Arrays.binarySearch(this.savingsInstantTransitions, y);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.wallOffsets[binarySearch + 1];
    }

    /* renamed from: b */
    public C16627d mo79502b(C15864f fVar) {
        Object k = m98998k(fVar);
        if (k instanceof C16627d) {
            return (C16627d) k;
        }
        return null;
    }

    /* renamed from: c */
    public List<C15892q> mo79503c(C15864f fVar) {
        Object k = m98998k(fVar);
        if (k instanceof C16627d) {
            return ((C16627d) k).mo79528l();
        }
        return Collections.singletonList((C15892q) k);
    }

    /* renamed from: d */
    public boolean mo79504d(C15858d dVar) {
        return !mo79509l(dVar).equals(mo79501a(dVar));
    }

    /* renamed from: e */
    public boolean mo79505e() {
        return this.savingsInstantTransitions.length == 0 && this.lastRules.length == 0 && this.wallOffsets[0].equals(this.standardOffsets[0]);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16624b) {
            C16624b bVar = (C16624b) obj;
            if (!Arrays.equals(this.standardTransitions, bVar.standardTransitions) || !Arrays.equals(this.standardOffsets, bVar.standardOffsets) || !Arrays.equals(this.savingsInstantTransitions, bVar.savingsInstantTransitions) || !Arrays.equals(this.wallOffsets, bVar.wallOffsets) || !Arrays.equals(this.lastRules, bVar.lastRules)) {
                return false;
            }
            return true;
        }
        if ((obj instanceof C16631f.C16632a) && mo79505e()) {
            C15858d dVar = C15858d.f65317a;
            if (mo79501a(dVar).equals(((C16631f.C16632a) obj).mo79501a(dVar))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo79507f(C15864f fVar, C15892q qVar) {
        return mo79503c(fVar).contains(qVar);
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.standardTransitions) ^ Arrays.hashCode(this.standardOffsets)) ^ Arrays.hashCode(this.savingsInstantTransitions)) ^ Arrays.hashCode(this.wallOffsets)) ^ Arrays.hashCode(this.lastRules);
    }

    /* renamed from: l */
    public C15892q mo79509l(C15858d dVar) {
        int binarySearch = Arrays.binarySearch(this.standardTransitions, dVar.mo75676y());
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.standardOffsets[binarySearch + 1];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo79510n(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.standardTransitions.length);
        for (long e : this.standardTransitions) {
            C16623a.m98992e(e, dataOutput);
        }
        for (C15892q g : this.standardOffsets) {
            C16623a.m98994g(g, dataOutput);
        }
        dataOutput.writeInt(this.savingsInstantTransitions.length);
        for (long e2 : this.savingsInstantTransitions) {
            C16623a.m98992e(e2, dataOutput);
        }
        for (C15892q g2 : this.wallOffsets) {
            C16623a.m98994g(g2, dataOutput);
        }
        dataOutput.writeByte(this.lastRules.length);
        for (C16628e d : this.lastRules) {
            d.mo79534d(dataOutput);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StandardZoneRules[currentStandardOffset=");
        C15892q[] qVarArr = this.standardOffsets;
        sb.append(qVarArr[qVarArr.length - 1]);
        sb.append("]");
        return sb.toString();
    }
}
