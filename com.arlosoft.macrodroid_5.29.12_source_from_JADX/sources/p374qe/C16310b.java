package p374qe;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import org.threeten.p356bp.DateTimeException;
import p352oe.C15882l;
import p352oe.C15890p;
import p365pe.C16187h;
import p365pe.C16194m;
import p374qe.C16313c;
import p383re.C16501d;
import p392se.C16540a;
import p392se.C16542c;
import p392se.C16551e;
import p392se.C16556h;
import p392se.C16565j;

/* renamed from: qe.b */
/* compiled from: DateTimeFormatter */
public final class C16310b {

    /* renamed from: h */
    public static final C16310b f66716h;

    /* renamed from: i */
    public static final C16310b f66717i;

    /* renamed from: j */
    public static final C16310b f66718j;

    /* renamed from: k */
    public static final C16310b f66719k;

    /* renamed from: l */
    public static final C16310b f66720l;

    /* renamed from: m */
    public static final C16310b f66721m;

    /* renamed from: n */
    public static final C16310b f66722n;

    /* renamed from: o */
    public static final C16310b f66723o;

    /* renamed from: p */
    public static final C16310b f66724p;

    /* renamed from: q */
    public static final C16310b f66725q;

    /* renamed from: r */
    public static final C16310b f66726r;

    /* renamed from: s */
    public static final C16310b f66727s;

    /* renamed from: t */
    public static final C16310b f66728t;

    /* renamed from: u */
    public static final C16310b f66729u;

    /* renamed from: v */
    public static final C16310b f66730v;

    /* renamed from: w */
    private static final C16565j<C15882l> f66731w = new C16311a();

    /* renamed from: x */
    private static final C16565j<Boolean> f66732x = new C16312b();

    /* renamed from: a */
    private final C16313c.C16319f f66733a;

    /* renamed from: b */
    private final Locale f66734b;

    /* renamed from: c */
    private final C16339f f66735c;

    /* renamed from: d */
    private final C16340g f66736d;

    /* renamed from: e */
    private final Set<C16556h> f66737e;

    /* renamed from: f */
    private final C16187h f66738f;

    /* renamed from: g */
    private final C15890p f66739g;

    /* renamed from: qe.b$a */
    /* compiled from: DateTimeFormatter */
    class C16311a implements C16565j<C15882l> {
        C16311a() {
        }

        /* renamed from: b */
        public C15882l mo75649a(C16551e eVar) {
            if (eVar instanceof C16309a) {
                return ((C16309a) eVar).f66715p;
            }
            return C15882l.f65367a;
        }
    }

    /* renamed from: qe.b$b */
    /* compiled from: DateTimeFormatter */
    class C16312b implements C16565j<Boolean> {
        C16312b() {
        }

        /* renamed from: b */
        public Boolean mo75649a(C16551e eVar) {
            if (eVar instanceof C16309a) {
                return Boolean.valueOf(((C16309a) eVar).f66714o);
            }
            return Boolean.FALSE;
        }
    }

    static {
        C16313c cVar = new C16313c();
        C16540a aVar = C16540a.YEAR;
        C16341h hVar = C16341h.EXCEEDS_PAD;
        C16313c e = cVar.mo78955p(aVar, 4, 10, hVar).mo78945e('-');
        C16540a aVar2 = C16540a.MONTH_OF_YEAR;
        C16313c e2 = e.mo78954o(aVar2, 2).mo78945e('-');
        C16540a aVar3 = C16540a.DAY_OF_MONTH;
        C16313c o = e2.mo78954o(aVar3, 2);
        C16340g gVar = C16340g.STRICT;
        C16310b F = o.mo78941F(gVar);
        C16194m mVar = C16194m.f66460g;
        C16310b i = F.mo78933i(mVar);
        f66716h = i;
        f66717i = new C16313c().mo78964y().mo78942a(i).mo78949i().mo78941F(gVar).mo78933i(mVar);
        f66718j = new C16313c().mo78964y().mo78942a(i).mo78961v().mo78949i().mo78941F(gVar).mo78933i(mVar);
        C16313c cVar2 = new C16313c();
        C16540a aVar4 = C16540a.HOUR_OF_DAY;
        C16313c e3 = cVar2.mo78954o(aVar4, 2).mo78945e(':');
        C16540a aVar5 = C16540a.MINUTE_OF_HOUR;
        C16313c e4 = e3.mo78954o(aVar5, 2).mo78961v().mo78945e(':');
        C16540a aVar6 = C16540a.SECOND_OF_MINUTE;
        C16310b F2 = e4.mo78954o(aVar6, 2).mo78961v().mo78943b(C16540a.NANO_OF_SECOND, 0, 9, true).mo78941F(gVar);
        f66719k = F2;
        f66720l = new C16313c().mo78964y().mo78942a(F2).mo78949i().mo78941F(gVar);
        f66721m = new C16313c().mo78964y().mo78942a(F2).mo78961v().mo78949i().mo78941F(gVar);
        C16310b i2 = new C16313c().mo78964y().mo78942a(i).mo78945e('T').mo78942a(F2).mo78941F(gVar).mo78933i(mVar);
        f66722n = i2;
        C16310b i3 = new C16313c().mo78964y().mo78942a(i2).mo78949i().mo78941F(gVar).mo78933i(mVar);
        f66723o = i3;
        f66724p = new C16313c().mo78942a(i3).mo78961v().mo78945e('[').mo78965z().mo78958s().mo78945e(']').mo78941F(gVar).mo78933i(mVar);
        f66725q = new C16313c().mo78942a(i2).mo78961v().mo78949i().mo78961v().mo78945e('[').mo78965z().mo78958s().mo78945e(']').mo78941F(gVar).mo78933i(mVar);
        f66726r = new C16313c().mo78964y().mo78955p(aVar, 4, 10, hVar).mo78945e('-').mo78954o(C16540a.DAY_OF_YEAR, 3).mo78961v().mo78949i().mo78941F(gVar).mo78933i(mVar);
        C16313c e5 = new C16313c().mo78964y().mo78955p(C16542c.f67320d, 4, 10, hVar).mo78946f("-W").mo78954o(C16542c.f67319c, 2).mo78945e('-');
        C16540a aVar7 = C16540a.DAY_OF_WEEK;
        f66727s = e5.mo78954o(aVar7, 1).mo78961v().mo78949i().mo78941F(gVar).mo78933i(mVar);
        f66728t = new C16313c().mo78964y().mo78944c().mo78941F(gVar);
        f66729u = new C16313c().mo78964y().mo78954o(aVar, 4).mo78954o(aVar2, 2).mo78954o(aVar3, 2).mo78961v().mo78948h("+HHMMss", "Z").mo78941F(gVar).mo78933i(mVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        C16194m mVar2 = mVar;
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        f66730v = new C16313c().mo78964y().mo78938B().mo78961v().mo78951k(aVar7, hashMap).mo78946f(", ").mo78960u().mo78955p(aVar3, 1, 2, C16341h.NOT_NEGATIVE).mo78945e(' ').mo78951k(aVar2, hashMap2).mo78945e(' ').mo78954o(aVar, 4).mo78945e(' ').mo78954o(aVar4, 2).mo78945e(':').mo78954o(aVar5, 2).mo78961v().mo78945e(':').mo78954o(aVar6, 2).mo78960u().mo78945e(' ').mo78948h("+HHMM", "GMT").mo78941F(C16340g.SMART).mo78933i(mVar2);
    }

    C16310b(C16313c.C16319f fVar, Locale locale, C16339f fVar2, C16340g gVar, Set<C16556h> set, C16187h hVar, C15890p pVar) {
        this.f66733a = (C16313c.C16319f) C16501d.m98548i(fVar, "printerParser");
        this.f66734b = (Locale) C16501d.m98548i(locale, "locale");
        this.f66735c = (C16339f) C16501d.m98548i(fVar2, "decimalStyle");
        this.f66736d = (C16340g) C16501d.m98548i(gVar, "resolverStyle");
        this.f66737e = set;
        this.f66738f = hVar;
        this.f66739g = pVar;
    }

    /* renamed from: g */
    public static C16310b m97930g(String str) {
        return new C16313c().mo78950j(str).mo78939D();
    }

    /* renamed from: a */
    public String mo78926a(C16551e eVar) {
        StringBuilder sb = new StringBuilder(32);
        mo78927b(eVar, sb);
        return sb.toString();
    }

    /* renamed from: b */
    public void mo78927b(C16551e eVar, Appendable appendable) {
        C16501d.m98548i(eVar, "temporal");
        C16501d.m98548i(appendable, "appendable");
        try {
            C16335d dVar = new C16335d(eVar, this);
            if (appendable instanceof StringBuilder) {
                this.f66733a.mo78970b(dVar, (StringBuilder) appendable);
                return;
            }
            StringBuilder sb = new StringBuilder(32);
            this.f66733a.mo78970b(dVar, sb);
            appendable.append(sb);
        } catch (IOException e) {
            throw new DateTimeException(e.getMessage(), e);
        }
    }

    /* renamed from: c */
    public C16187h mo78928c() {
        return this.f66738f;
    }

    /* renamed from: d */
    public C16339f mo78929d() {
        return this.f66735c;
    }

    /* renamed from: e */
    public Locale mo78930e() {
        return this.f66734b;
    }

    /* renamed from: f */
    public C15890p mo78931f() {
        return this.f66739g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C16313c.C16319f mo78932h(boolean z) {
        return this.f66733a.mo78972a(z);
    }

    /* renamed from: i */
    public C16310b mo78933i(C16187h hVar) {
        if (C16501d.m98542c(this.f66738f, hVar)) {
            return this;
        }
        return new C16310b(this.f66733a, this.f66734b, this.f66735c, this.f66736d, this.f66737e, hVar, this.f66739g);
    }

    /* renamed from: j */
    public C16310b mo78934j(C16340g gVar) {
        C16501d.m98548i(gVar, "resolverStyle");
        if (C16501d.m98542c(this.f66736d, gVar)) {
            return this;
        }
        return new C16310b(this.f66733a, this.f66734b, this.f66735c, gVar, this.f66737e, this.f66738f, this.f66739g);
    }

    public String toString() {
        String fVar = this.f66733a.toString();
        return fVar.startsWith("[") ? fVar : fVar.substring(1, fVar.length() - 1);
    }
}
