package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.l */
/* compiled from: LazyStringArrayList */
public class C14511l extends AbstractList<String> implements RandomAccess, C14512m {

    /* renamed from: c */
    public static final C14512m f63388c = new C14511l().mo73423L();

    /* renamed from: a */
    private final List<Object> f63389a;

    public C14511l() {
        this.f63389a = new ArrayList();
    }

    /* renamed from: d */
    private static C14485d m90999d(Object obj) {
        if (obj instanceof C14485d) {
            return (C14485d) obj;
        }
        if (obj instanceof String) {
            return C14485d.m90839j((String) obj);
        }
        return C14485d.m90837h((byte[]) obj);
    }

    /* renamed from: f */
    private static String m91000f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C14485d) {
            return ((C14485d) obj).mo73306D();
        }
        return C14503i.m90990b((byte[]) obj);
    }

    /* renamed from: G0 */
    public C14485d mo73422G0(int i) {
        Object obj = this.f63389a.get(i);
        C14485d d = m90999d(obj);
        if (d != obj) {
            this.f63389a.set(i, d);
        }
        return d;
    }

    /* renamed from: L */
    public C14512m mo73423L() {
        return new C14535u(this);
    }

    /* renamed from: Y0 */
    public void mo73424Y0(C14485d dVar) {
        this.f63389a.add(dVar);
        this.modCount++;
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: c */
    public void add(int i, String str) {
        this.f63389a.add(i, str);
        this.modCount++;
    }

    public void clear() {
        this.f63389a.clear();
        this.modCount++;
    }

    /* renamed from: h */
    public String get(int i) {
        Object obj = this.f63389a.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C14485d) {
            C14485d dVar = (C14485d) obj;
            String D = dVar.mo73306D();
            if (dVar.mo73314o()) {
                this.f63389a.set(i, D);
            }
            return D;
        }
        byte[] bArr = (byte[]) obj;
        String b = C14503i.m90990b(bArr);
        if (C14503i.m90989a(bArr)) {
            this.f63389a.set(i, b);
        }
        return b;
    }

    /* renamed from: i */
    public String remove(int i) {
        Object remove = this.f63389a.remove(i);
        this.modCount++;
        return m91000f(remove);
    }

    /* renamed from: j */
    public String set(int i, String str) {
        return m91000f(this.f63389a.set(i, str));
    }

    /* renamed from: r */
    public List<?> mo73434r() {
        return Collections.unmodifiableList(this.f63389a);
    }

    public int size() {
        return this.f63389a.size();
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        if (collection instanceof C14512m) {
            collection = ((C14512m) collection).mo73434r();
        }
        boolean addAll = this.f63389a.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public C14511l(C14512m mVar) {
        this.f63389a = new ArrayList(mVar.size());
        addAll(mVar);
    }
}
