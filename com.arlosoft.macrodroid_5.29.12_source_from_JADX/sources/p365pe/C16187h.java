package p365pe;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Locale;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import org.threeten.p356bp.DateTimeException;
import p352oe.C15858d;
import p352oe.C15867g;
import p352oe.C15890p;
import p383re.C16501d;
import p392se.C16550d;
import p392se.C16551e;
import p392se.C16557i;
import p392se.C16565j;

/* renamed from: pe.h */
/* compiled from: Chronology */
public abstract class C16187h implements Comparable<C16187h> {

    /* renamed from: a */
    public static final C16565j<C16187h> f66418a = new C16188a();

    /* renamed from: c */
    private static final ConcurrentHashMap<String, C16187h> f66419c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private static final ConcurrentHashMap<String, C16187h> f66420d = new ConcurrentHashMap<>();

    /* renamed from: f */
    private static final Method f66421f;

    /* renamed from: pe.h$a */
    /* compiled from: Chronology */
    class C16188a implements C16565j<C16187h> {
        C16188a() {
        }

        /* renamed from: b */
        public C16187h mo75649a(C16551e eVar) {
            return C16187h.m97189j(eVar);
        }
    }

    static {
        Method method;
        try {
            method = Locale.class.getMethod("getUnicodeLocaleType", new Class[]{String.class});
        } catch (Throwable unused) {
            method = null;
        }
        f66421f = method;
    }

    protected C16187h() {
    }

    /* renamed from: j */
    public static C16187h m97189j(C16551e eVar) {
        C16501d.m98548i(eVar, "temporal");
        C16187h hVar = (C16187h) eVar.mo75648r(C16557i.m98733a());
        return hVar != null ? hVar : C16194m.f66460g;
    }

    /* renamed from: l */
    private static void m97190l() {
        ConcurrentHashMap<String, C16187h> concurrentHashMap = f66419c;
        if (concurrentHashMap.isEmpty()) {
            m97193r(C16194m.f66460g);
            m97193r(C16207v.f66488g);
            m97193r(C16201r.f66482g);
            m97193r(C16196o.f66465o);
            C16190j jVar = C16190j.f66422g;
            m97193r(jVar);
            concurrentHashMap.putIfAbsent("Hijrah", jVar);
            f66420d.putIfAbsent("islamic", jVar);
            Iterator<S> it = ServiceLoader.load(C16187h.class, C16187h.class.getClassLoader()).iterator();
            while (it.hasNext()) {
                C16187h hVar = (C16187h) it.next();
                f66419c.putIfAbsent(hVar.getId(), hVar);
                String k = hVar.mo78647k();
                if (k != null) {
                    f66420d.putIfAbsent(k, hVar);
                }
            }
        }
    }

    /* renamed from: n */
    public static C16187h m97191n(String str) {
        m97190l();
        C16187h hVar = f66419c.get(str);
        if (hVar != null) {
            return hVar;
        }
        C16187h hVar2 = f66420d.get(str);
        if (hVar2 != null) {
            return hVar2;
        }
        throw new DateTimeException("Unknown chronology: " + str);
    }

    /* renamed from: q */
    static C16187h m97192q(DataInput dataInput) throws IOException {
        return m97191n(dataInput.readUTF());
    }

    /* renamed from: r */
    private static void m97193r(C16187h hVar) {
        f66419c.putIfAbsent(hVar.getId(), hVar);
        String k = hVar.mo78647k();
        if (k != null) {
            f66420d.putIfAbsent(k, hVar);
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C16206u((byte) 11, this);
    }

    /* renamed from: b */
    public int compareTo(C16187h hVar) {
        return getId().compareTo(hVar.getId());
    }

    /* renamed from: d */
    public abstract C16175b mo78639d(C16551e eVar);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public <D extends C16175b> D mo78640e(C16550d dVar) {
        D d = (C16175b) dVar;
        if (equals(d.mo75718y())) {
            return d;
        }
        throw new ClassCastException("Chrono mismatch, expected: " + getId() + ", actual: " + d.mo75718y().getId());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16187h) || compareTo((C16187h) obj) != 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public <D extends C16175b> C16179d<D> mo78642f(C16550d dVar) {
        C16179d<D> dVar2 = (C16179d) dVar;
        if (equals(dVar2.mo75726L().mo75718y())) {
            return dVar2;
        }
        throw new ClassCastException("Chrono mismatch, required: " + getId() + ", supplied: " + dVar2.mo75726L().mo75718y().getId());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public <D extends C16175b> C16185g<D> mo78643g(C16550d dVar) {
        C16185g<D> gVar = (C16185g) dVar;
        if (equals(gVar.mo75872E().mo75718y())) {
            return gVar;
        }
        throw new ClassCastException("Chrono mismatch, required: " + getId() + ", supplied: " + gVar.mo75872E().mo75718y().getId());
    }

    public abstract String getId();

    public int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    /* renamed from: i */
    public abstract C16189i mo78646i(int i);

    /* renamed from: k */
    public abstract String mo78647k();

    /* renamed from: m */
    public C16177c<?> mo78648m(C16551e eVar) {
        try {
            return mo78639d(eVar).mo75714t(C15867g.m95652y(eVar));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + eVar.getClass(), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo78649t(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(getId());
    }

    public String toString() {
        return getId();
    }

    /* renamed from: v */
    public C16182f<?> mo78651v(C15858d dVar, C15890p pVar) {
        return C16185g.m97178T(this, dVar, pVar);
    }
}
