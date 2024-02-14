package p365pe;

import java.io.Serializable;
import java.util.HashMap;
import org.threeten.p356bp.DateTimeException;
import p352oe.C15858d;
import p352oe.C15890p;
import p392se.C16540a;
import p392se.C16551e;
import p392se.C16567l;

/* renamed from: pe.j */
/* compiled from: HijrahChronology */
public final class C16190j extends C16187h implements Serializable {

    /* renamed from: g */
    public static final C16190j f66422g = new C16190j();

    /* renamed from: o */
    private static final HashMap<String, String[]> f66423o;

    /* renamed from: p */
    private static final HashMap<String, String[]> f66424p;

    /* renamed from: s */
    private static final HashMap<String, String[]> f66425s;
    private static final long serialVersionUID = 3127340209035924785L;

    static {
        HashMap<String, String[]> hashMap = new HashMap<>();
        f66423o = hashMap;
        HashMap<String, String[]> hashMap2 = new HashMap<>();
        f66424p = hashMap2;
        HashMap<String, String[]> hashMap3 = new HashMap<>();
        f66425s = hashMap3;
        hashMap.put("en", new String[]{"BH", "HE"});
        hashMap2.put("en", new String[]{"B.H.", "H.E."});
        hashMap3.put("en", new String[]{"Before Hijrah", "Hijrah Era"});
    }

    private C16190j() {
    }

    private Object readResolve() {
        return f66422g;
    }

    /* renamed from: A */
    public C16567l mo78654A(C16540a aVar) {
        return aVar.mo79343g();
    }

    public String getId() {
        return "Hijrah-umalqura";
    }

    /* renamed from: k */
    public String mo78647k() {
        return "islamic-umalqura";
    }

    /* renamed from: m */
    public C16177c<C16191k> mo78648m(C16551e eVar) {
        return super.mo78648m(eVar);
    }

    /* renamed from: v */
    public C16182f<C16191k> mo78651v(C15858d dVar, C15890p pVar) {
        return super.mo78651v(dVar, pVar);
    }

    /* renamed from: w */
    public C16191k mo78655w(int i, int i2, int i3) {
        return C16191k.m97218H0(i, i2, i3);
    }

    /* renamed from: x */
    public C16191k mo78639d(C16551e eVar) {
        if (eVar instanceof C16191k) {
            return (C16191k) eVar;
        }
        return C16191k.m97220J0(eVar.mo75644l(C16540a.EPOCH_DAY));
    }

    /* renamed from: y */
    public C16193l mo78646i(int i) {
        if (i == 0) {
            return C16193l.BEFORE_AH;
        }
        if (i == 1) {
            return C16193l.AH;
        }
        throw new DateTimeException("invalid Hijrah era");
    }
}
