package p365pe;

import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p352oe.C15858d;
import p352oe.C15861e;
import p352oe.C15890p;
import p392se.C16540a;
import p392se.C16551e;
import p392se.C16567l;

/* renamed from: pe.o */
/* compiled from: JapaneseChronology */
public final class C16196o extends C16187h implements Serializable {

    /* renamed from: g */
    static final Locale f66464g = new Locale("ja", "JP", "JP");

    /* renamed from: o */
    public static final C16196o f66465o = new C16196o();

    /* renamed from: p */
    private static final Map<String, String[]> f66466p;

    /* renamed from: s */
    private static final Map<String, String[]> f66467s;
    private static final long serialVersionUID = 459996390165777884L;

    /* renamed from: z */
    private static final Map<String, String[]> f66468z;

    /* renamed from: pe.o$a */
    /* compiled from: JapaneseChronology */
    static /* synthetic */ class C16197a {

        /* renamed from: a */
        static final /* synthetic */ int[] f66469a;

        /* JADX WARNING: Can't wrap try/catch for region: R(48:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                se.a[] r0 = p392se.C16540a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f66469a = r0
                se.a r1 = p392se.C16540a.DAY_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f66469a     // Catch:{ NoSuchFieldError -> 0x001d }
                se.a r1 = p392se.C16540a.DAY_OF_WEEK     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f66469a     // Catch:{ NoSuchFieldError -> 0x0028 }
                se.a r1 = p392se.C16540a.MICRO_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f66469a     // Catch:{ NoSuchFieldError -> 0x0033 }
                se.a r1 = p392se.C16540a.MICRO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f66469a     // Catch:{ NoSuchFieldError -> 0x003e }
                se.a r1 = p392se.C16540a.HOUR_OF_DAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f66469a     // Catch:{ NoSuchFieldError -> 0x0049 }
                se.a r1 = p392se.C16540a.HOUR_OF_AMPM     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f66469a     // Catch:{ NoSuchFieldError -> 0x0054 }
                se.a r1 = p392se.C16540a.MINUTE_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f66469a     // Catch:{ NoSuchFieldError -> 0x0060 }
                se.a r1 = p392se.C16540a.MINUTE_OF_HOUR     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f66469a     // Catch:{ NoSuchFieldError -> 0x006c }
                se.a r1 = p392se.C16540a.SECOND_OF_DAY     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f66469a     // Catch:{ NoSuchFieldError -> 0x0078 }
                se.a r1 = p392se.C16540a.SECOND_OF_MINUTE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f66469a     // Catch:{ NoSuchFieldError -> 0x0084 }
                se.a r1 = p392se.C16540a.MILLI_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f66469a     // Catch:{ NoSuchFieldError -> 0x0090 }
                se.a r1 = p392se.C16540a.MILLI_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f66469a     // Catch:{ NoSuchFieldError -> 0x009c }
                se.a r1 = p392se.C16540a.NANO_OF_DAY     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f66469a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                se.a r1 = p392se.C16540a.NANO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f66469a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                se.a r1 = p392se.C16540a.CLOCK_HOUR_OF_DAY     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f66469a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                se.a r1 = p392se.C16540a.CLOCK_HOUR_OF_AMPM     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f66469a     // Catch:{ NoSuchFieldError -> 0x00cc }
                se.a r1 = p392se.C16540a.EPOCH_DAY     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f66469a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                se.a r1 = p392se.C16540a.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = f66469a     // Catch:{ NoSuchFieldError -> 0x00e4 }
                se.a r1 = p392se.C16540a.ERA     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = f66469a     // Catch:{ NoSuchFieldError -> 0x00f0 }
                se.a r1 = p392se.C16540a.YEAR     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = f66469a     // Catch:{ NoSuchFieldError -> 0x00fc }
                se.a r1 = p392se.C16540a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r0 = f66469a     // Catch:{ NoSuchFieldError -> 0x0108 }
                se.a r1 = p392se.C16540a.MONTH_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r0 = f66469a     // Catch:{ NoSuchFieldError -> 0x0114 }
                se.a r1 = p392se.C16540a.DAY_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x0114 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0114 }
            L_0x0114:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p365pe.C16196o.C16197a.<clinit>():void");
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f66466p = hashMap;
        HashMap hashMap2 = new HashMap();
        f66467s = hashMap2;
        HashMap hashMap3 = new HashMap();
        f66468z = hashMap3;
        hashMap.put("en", new String[]{"Unknown", "K", "M", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.LATITUDE_SOUTH, "H"});
        hashMap.put("ja", new String[]{"Unknown", "K", "M", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.LATITUDE_SOUTH, "H"});
        hashMap2.put("en", new String[]{"Unknown", "K", "M", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.LATITUDE_SOUTH, "H"});
        hashMap2.put("ja", new String[]{"Unknown", "慶", "明", "大", "昭", "平"});
        hashMap3.put("en", new String[]{"Unknown", "Keio", "Meiji", "Taisho", "Showa", "Heisei"});
        hashMap3.put("ja", new String[]{"Unknown", "慶応", "明治", "大正", "昭和", "平成"});
    }

    private C16196o() {
    }

    private Object readResolve() {
        return f66465o;
    }

    /* renamed from: A */
    public int mo78677A(C16189i iVar, int i) {
        if (iVar instanceof C16200q) {
            C16200q qVar = (C16200q) iVar;
            int d0 = (qVar.mo78692C().mo75705d0() + i) - 1;
            C16567l.m98757i(1, (long) ((qVar.mo78694t().mo75705d0() - qVar.mo78692C().mo75705d0()) + 1)).mo79365b((long) i, C16540a.YEAR_OF_ERA);
            return d0;
        }
        throw new ClassCastException("Era must be JapaneseEra");
    }

    /* renamed from: C */
    public C16567l mo78678C(C16540a aVar) {
        int[] iArr = C16197a.f66469a;
        switch (iArr[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return aVar.mo79343g();
            default:
                Calendar instance = Calendar.getInstance(f66464g);
                int i = 0;
                switch (iArr[aVar.ordinal()]) {
                    case 19:
                        C16200q[] E = C16200q.m97349E();
                        return C16567l.m98757i((long) E[0].getValue(), (long) E[E.length - 1].getValue());
                    case 20:
                        C16200q[] E2 = C16200q.m97349E();
                        return C16567l.m98757i((long) C16198p.f66470f.mo75705d0(), (long) E2[E2.length - 1].mo78694t().mo75705d0());
                    case 21:
                        C16200q[] E3 = C16200q.m97349E();
                        int d0 = (E3[E3.length - 1].mo78694t().mo75705d0() - E3[E3.length - 1].mo78692C().mo75705d0()) + 1;
                        int i2 = Integer.MAX_VALUE;
                        while (i < E3.length) {
                            i2 = Math.min(i2, (E3[i].mo78694t().mo75705d0() - E3[i].mo78692C().mo75705d0()) + 1);
                            i++;
                        }
                        return C16567l.m98759k(1, 6, (long) i2, (long) d0);
                    case 22:
                        return C16567l.m98759k((long) (instance.getMinimum(2) + 1), (long) (instance.getGreatestMinimum(2) + 1), (long) (instance.getLeastMaximum(2) + 1), (long) (instance.getMaximum(2) + 1));
                    case 23:
                        C16200q[] E4 = C16200q.m97349E();
                        int i3 = 366;
                        while (i < E4.length) {
                            i3 = Math.min(i3, (E4[i].mo78692C().mo75710i0() - E4[i].mo78692C().mo75701Z()) + 1);
                            i++;
                        }
                        return C16567l.m98758j(1, (long) i3, 366);
                    default:
                        throw new UnsupportedOperationException("Unimplementable field: " + aVar);
                }
        }
    }

    public String getId() {
        return "Japanese";
    }

    /* renamed from: k */
    public String mo78647k() {
        return "japanese";
    }

    /* renamed from: m */
    public C16177c<C16198p> mo78648m(C16551e eVar) {
        return super.mo78648m(eVar);
    }

    /* renamed from: v */
    public C16182f<C16198p> mo78651v(C15858d dVar, C15890p pVar) {
        return super.mo78651v(dVar, pVar);
    }

    /* renamed from: w */
    public C16198p mo78679w(int i, int i2, int i3) {
        return new C16198p(C15861e.m95544t0(i, i2, i3));
    }

    /* renamed from: x */
    public C16198p mo78639d(C16551e eVar) {
        if (eVar instanceof C16198p) {
            return (C16198p) eVar;
        }
        return new C16198p(C15861e.m95539T(eVar));
    }

    /* renamed from: y */
    public C16200q mo78646i(int i) {
        return C16200q.m97351x(i);
    }
}
