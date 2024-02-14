package p374qe;

import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.p353io.FilenameUtils;
import org.threeten.p356bp.DateTimeException;
import p352oe.C15858d;
import p352oe.C15861e;
import p352oe.C15864f;
import p352oe.C15890p;
import p352oe.C15892q;
import p365pe.C16175b;
import p365pe.C16187h;
import p374qe.C16342i;
import p383re.C16501d;
import p392se.C16540a;
import p392se.C16542c;
import p392se.C16551e;
import p392se.C16556h;
import p392se.C16557i;
import p392se.C16565j;
import p392se.C16567l;
import p392se.C16568m;

/* renamed from: qe.c */
/* compiled from: DateTimeFormatterBuilder */
public final class C16313c {

    /* renamed from: h */
    private static final C16565j<C15890p> f66740h = new C16314a();

    /* renamed from: i */
    private static final Map<Character, C16556h> f66741i;

    /* renamed from: j */
    static final Comparator<String> f66742j = new C16316c();

    /* renamed from: a */
    private C16313c f66743a;

    /* renamed from: b */
    private final C16313c f66744b;

    /* renamed from: c */
    private final List<C16320g> f66745c;

    /* renamed from: d */
    private final boolean f66746d;

    /* renamed from: e */
    private int f66747e;

    /* renamed from: f */
    private char f66748f;

    /* renamed from: g */
    private int f66749g;

    /* renamed from: qe.c$a */
    /* compiled from: DateTimeFormatterBuilder */
    class C16314a implements C16565j<C15890p> {
        C16314a() {
        }

        /* renamed from: b */
        public C15890p mo75649a(C16551e eVar) {
            C15890p pVar = (C15890p) eVar.mo75648r(C16557i.m98739g());
            if (pVar == null || (pVar instanceof C15892q)) {
                return null;
            }
            return pVar;
        }
    }

    /* renamed from: qe.c$b */
    /* compiled from: DateTimeFormatterBuilder */
    class C16315b extends C16337e {

        /* renamed from: b */
        final /* synthetic */ C16342i.C16344b f66750b;

        C16315b(C16342i.C16344b bVar) {
            this.f66750b = bVar;
        }

        /* renamed from: c */
        public String mo78967c(C16556h hVar, long j, C16345j jVar, Locale locale) {
            return this.f66750b.mo79009a(j, jVar);
        }
    }

    /* renamed from: qe.c$c */
    /* compiled from: DateTimeFormatterBuilder */
    class C16316c implements Comparator<String> {
        C16316c() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.length() == str2.length() ? str.compareTo(str2) : str.length() - str2.length();
        }
    }

    /* renamed from: qe.c$d */
    /* compiled from: DateTimeFormatterBuilder */
    static /* synthetic */ class C16317d {

        /* renamed from: a */
        static final /* synthetic */ int[] f66752a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                qe.h[] r0 = p374qe.C16341h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f66752a = r0
                qe.h r1 = p374qe.C16341h.EXCEEDS_PAD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f66752a     // Catch:{ NoSuchFieldError -> 0x001d }
                qe.h r1 = p374qe.C16341h.ALWAYS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f66752a     // Catch:{ NoSuchFieldError -> 0x0028 }
                qe.h r1 = p374qe.C16341h.NORMAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f66752a     // Catch:{ NoSuchFieldError -> 0x0033 }
                qe.h r1 = p374qe.C16341h.NOT_NEGATIVE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p374qe.C16313c.C16317d.<clinit>():void");
        }
    }

    /* renamed from: qe.c$e */
    /* compiled from: DateTimeFormatterBuilder */
    static final class C16318e implements C16320g {

        /* renamed from: a */
        private final char f66753a;

        C16318e(char c) {
            this.f66753a = c;
        }

        /* renamed from: b */
        public boolean mo78970b(C16335d dVar, StringBuilder sb) {
            sb.append(this.f66753a);
            return true;
        }

        public String toString() {
            if (this.f66753a == '\'') {
                return "''";
            }
            return "'" + this.f66753a + "'";
        }
    }

    /* renamed from: qe.c$f */
    /* compiled from: DateTimeFormatterBuilder */
    static final class C16319f implements C16320g {

        /* renamed from: a */
        private final C16320g[] f66754a;

        /* renamed from: c */
        private final boolean f66755c;

        C16319f(List<C16320g> list, boolean z) {
            this((C16320g[]) list.toArray(new C16320g[list.size()]), z);
        }

        /* renamed from: a */
        public C16319f mo78972a(boolean z) {
            if (z == this.f66755c) {
                return this;
            }
            return new C16319f(this.f66754a, z);
        }

        /* renamed from: b */
        public boolean mo78970b(C16335d dVar, StringBuilder sb) {
            int length = sb.length();
            if (this.f66755c) {
                dVar.mo78997h();
            }
            try {
                for (C16320g b : this.f66754a) {
                    if (!b.mo78970b(dVar, sb)) {
                        sb.setLength(length);
                        return true;
                    }
                }
                if (this.f66755c) {
                    dVar.mo78991b();
                }
                return true;
            } finally {
                if (this.f66755c) {
                    dVar.mo78991b();
                }
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.f66754a != null) {
                sb.append(this.f66755c ? "[" : "(");
                for (C16320g append : this.f66754a) {
                    sb.append(append);
                }
                sb.append(this.f66755c ? "]" : ")");
            }
            return sb.toString();
        }

        C16319f(C16320g[] gVarArr, boolean z) {
            this.f66754a = gVarArr;
            this.f66755c = z;
        }
    }

    /* renamed from: qe.c$g */
    /* compiled from: DateTimeFormatterBuilder */
    interface C16320g {
        /* renamed from: b */
        boolean mo78970b(C16335d dVar, StringBuilder sb);
    }

    /* renamed from: qe.c$h */
    /* compiled from: DateTimeFormatterBuilder */
    static final class C16321h implements C16320g {

        /* renamed from: a */
        private final C16556h f66756a;

        /* renamed from: c */
        private final int f66757c;

        /* renamed from: d */
        private final int f66758d;

        /* renamed from: f */
        private final boolean f66759f;

        C16321h(C16556h hVar, int i, int i2, boolean z) {
            C16501d.m98548i(hVar, "field");
            if (!hVar.mo79343g().mo79368e()) {
                throw new IllegalArgumentException("Field must have a fixed set of values: " + hVar);
            } else if (i < 0 || i > 9) {
                throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i);
            } else if (i2 < 1 || i2 > 9) {
                throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i2);
            } else if (i2 >= i) {
                this.f66756a = hVar;
                this.f66757c = i;
                this.f66758d = i2;
                this.f66759f = z;
            } else {
                throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
            }
        }

        /* renamed from: a */
        private BigDecimal m97984a(long j) {
            C16567l g = this.f66756a.mo79343g();
            g.mo79365b(j, this.f66756a);
            BigDecimal valueOf = BigDecimal.valueOf(g.mo79367d());
            BigDecimal divide = BigDecimal.valueOf(j).subtract(valueOf).divide(BigDecimal.valueOf(g.mo79366c()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
            return divide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : divide.stripTrailingZeros();
        }

        /* renamed from: b */
        public boolean mo78970b(C16335d dVar, StringBuilder sb) {
            Long f = dVar.mo78995f(this.f66756a);
            if (f == null) {
                return false;
            }
            C16339f d = dVar.mo78993d();
            BigDecimal a = m97984a(f.longValue());
            if (a.scale() != 0) {
                String a2 = d.mo78999a(a.setScale(Math.min(Math.max(a.scale(), this.f66757c), this.f66758d), RoundingMode.FLOOR).toPlainString().substring(2));
                if (this.f66759f) {
                    sb.append(d.mo79000b());
                }
                sb.append(a2);
                return true;
            } else if (this.f66757c <= 0) {
                return true;
            } else {
                if (this.f66759f) {
                    sb.append(d.mo79000b());
                }
                for (int i = 0; i < this.f66757c; i++) {
                    sb.append(d.mo79003e());
                }
                return true;
            }
        }

        public String toString() {
            String str = this.f66759f ? ",DecimalPoint" : "";
            return "Fraction(" + this.f66756a + "," + this.f66757c + "," + this.f66758d + str + ")";
        }
    }

    /* renamed from: qe.c$i */
    /* compiled from: DateTimeFormatterBuilder */
    static final class C16322i implements C16320g {

        /* renamed from: a */
        private final int f66760a;

        C16322i(int i) {
            this.f66760a = i;
        }

        /* renamed from: b */
        public boolean mo78970b(C16335d dVar, StringBuilder sb) {
            StringBuilder sb2 = sb;
            Long f = dVar.mo78995f(C16540a.INSTANT_SECONDS);
            Long l = 0L;
            C16551e e = dVar.mo78994e();
            C16540a aVar = C16540a.NANO_OF_SECOND;
            if (e.mo75642g(aVar)) {
                l = Long.valueOf(dVar.mo78994e().mo75644l(aVar));
            }
            int i = 0;
            if (f == null) {
                return false;
            }
            long longValue = f.longValue();
            int k = aVar.mo79346k(l.longValue());
            if (longValue >= -62167219200L) {
                long j = (longValue - 315569520000L) + 62167219200L;
                long e2 = C16501d.m98544e(j, 315569520000L) + 1;
                C15864f d0 = C15864f.m95601d0(C16501d.m98547h(j, 315569520000L) - 62167219200L, 0, C15892q.f65382p);
                if (e2 > 0) {
                    sb2.append('+');
                    sb2.append(e2);
                }
                sb2.append(d0);
                if (d0.mo75733Z() == 0) {
                    sb2.append(":00");
                }
            } else {
                long j2 = longValue + 62167219200L;
                long j3 = j2 / 315569520000L;
                long j4 = j2 % 315569520000L;
                C15864f d02 = C15864f.m95601d0(j4 - 62167219200L, 0, C15892q.f65382p);
                int length = sb.length();
                sb2.append(d02);
                if (d02.mo75733Z() == 0) {
                    sb2.append(":00");
                }
                if (j3 < 0) {
                    if (d02.mo75734a0() == -10000) {
                        sb2.replace(length, length + 2, Long.toString(j3 - 1));
                    } else if (j4 == 0) {
                        sb2.insert(length, j3);
                    } else {
                        sb2.insert(length + 1, Math.abs(j3));
                    }
                }
            }
            int i2 = this.f66760a;
            if (i2 == -2) {
                if (k != 0) {
                    sb2.append(FilenameUtils.EXTENSION_SEPARATOR);
                    if (k % 1000000 == 0) {
                        sb2.append(Integer.toString((k / 1000000) + 1000).substring(1));
                    } else if (k % 1000 == 0) {
                        sb2.append(Integer.toString((k / 1000) + 1000000).substring(1));
                    } else {
                        sb2.append(Integer.toString(k + 1000000000).substring(1));
                    }
                }
            } else if (i2 > 0 || (i2 == -1 && k > 0)) {
                sb2.append(FilenameUtils.EXTENSION_SEPARATOR);
                int i3 = 100000000;
                while (true) {
                    int i4 = this.f66760a;
                    if ((i4 != -1 || k <= 0) && i >= i4) {
                        break;
                    }
                    int i5 = k / i3;
                    sb2.append((char) (i5 + 48));
                    k -= i5 * i3;
                    i3 /= 10;
                    i++;
                }
            }
            sb2.append('Z');
            return true;
        }

        public String toString() {
            return "Instant()";
        }
    }

    /* renamed from: qe.c$j */
    /* compiled from: DateTimeFormatterBuilder */
    static final class C16323j implements C16320g {

        /* renamed from: a */
        private final C16345j f66761a;

        public C16323j(C16345j jVar) {
            this.f66761a = jVar;
        }

        /* renamed from: b */
        public boolean mo78970b(C16335d dVar, StringBuilder sb) {
            Long f = dVar.mo78995f(C16540a.OFFSET_SECONDS);
            if (f == null) {
                return false;
            }
            sb.append("GMT");
            if (this.f66761a == C16345j.FULL) {
                return new C16325l("", "+HH:MM:ss").mo78970b(dVar, sb);
            }
            int o = C16501d.m98554o(f.longValue());
            if (o == 0) {
                return true;
            }
            int abs = Math.abs((o / 3600) % 100);
            int abs2 = Math.abs((o / 60) % 60);
            int abs3 = Math.abs(o % 60);
            sb.append(o < 0 ? HelpFormatter.DEFAULT_OPT_PREFIX : "+");
            sb.append(abs);
            if (abs2 <= 0 && abs3 <= 0) {
                return true;
            }
            sb.append(":");
            sb.append((char) ((abs2 / 10) + 48));
            sb.append((char) ((abs2 % 10) + 48));
            if (abs3 <= 0) {
                return true;
            }
            sb.append(":");
            sb.append((char) ((abs3 / 10) + 48));
            sb.append((char) ((abs3 % 10) + 48));
            return true;
        }
    }

    /* renamed from: qe.c$k */
    /* compiled from: DateTimeFormatterBuilder */
    static class C16324k implements C16320g {

        /* renamed from: o */
        static final int[] f66762o = {0, 10, 100, 1000, SamsungIrisUnlockModule.IRIS_ACQUIRED_VENDOR_EVENT_BASE, 100000, 1000000, 10000000, 100000000, 1000000000};

        /* renamed from: a */
        final C16556h f66763a;

        /* renamed from: c */
        final int f66764c;

        /* renamed from: d */
        final int f66765d;

        /* renamed from: f */
        final C16341h f66766f;

        /* renamed from: g */
        final int f66767g;

        /* synthetic */ C16324k(C16556h hVar, int i, int i2, C16341h hVar2, int i3, C16314a aVar) {
            this(hVar, i, i2, hVar2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo78976a(C16335d dVar, long j) {
            return j;
        }

        /* renamed from: b */
        public boolean mo78970b(C16335d dVar, StringBuilder sb) {
            String str;
            Long f = dVar.mo78995f(this.f66763a);
            if (f == null) {
                return false;
            }
            long a = mo78976a(dVar, f.longValue());
            C16339f d = dVar.mo78993d();
            if (a == Long.MIN_VALUE) {
                str = "9223372036854775808";
            } else {
                str = Long.toString(Math.abs(a));
            }
            if (str.length() <= this.f66765d) {
                String a2 = d.mo78999a(str);
                if (a >= 0) {
                    int i = C16317d.f66752a[this.f66766f.ordinal()];
                    if (i == 1) {
                        int i2 = this.f66764c;
                        if (i2 < 19 && a >= ((long) f66762o[i2])) {
                            sb.append(d.mo79002d());
                        }
                    } else if (i == 2) {
                        sb.append(d.mo79002d());
                    }
                } else {
                    int i3 = C16317d.f66752a[this.f66766f.ordinal()];
                    if (i3 == 1 || i3 == 2 || i3 == 3) {
                        sb.append(d.mo79001c());
                    } else if (i3 == 4) {
                        throw new DateTimeException("Field " + this.f66763a + " cannot be printed as the value " + a + " cannot be negative according to the SignStyle");
                    }
                }
                for (int i4 = 0; i4 < this.f66764c - a2.length(); i4++) {
                    sb.append(d.mo79003e());
                }
                sb.append(a2);
                return true;
            }
            throw new DateTimeException("Field " + this.f66763a + " cannot be printed as the value " + a + " exceeds the maximum print width of " + this.f66765d);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C16324k mo78977c() {
            if (this.f66767g == -1) {
                return this;
            }
            return new C16324k(this.f66763a, this.f66764c, this.f66765d, this.f66766f, -1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C16324k mo78978d(int i) {
            return new C16324k(this.f66763a, this.f66764c, this.f66765d, this.f66766f, this.f66767g + i);
        }

        public String toString() {
            int i = this.f66764c;
            if (i == 1 && this.f66765d == 19 && this.f66766f == C16341h.NORMAL) {
                return "Value(" + this.f66763a + ")";
            } else if (i == this.f66765d && this.f66766f == C16341h.NOT_NEGATIVE) {
                return "Value(" + this.f66763a + "," + this.f66764c + ")";
            } else {
                return "Value(" + this.f66763a + "," + this.f66764c + "," + this.f66765d + "," + this.f66766f + ")";
            }
        }

        C16324k(C16556h hVar, int i, int i2, C16341h hVar2) {
            this.f66763a = hVar;
            this.f66764c = i;
            this.f66765d = i2;
            this.f66766f = hVar2;
            this.f66767g = 0;
        }

        private C16324k(C16556h hVar, int i, int i2, C16341h hVar2, int i3) {
            this.f66763a = hVar;
            this.f66764c = i;
            this.f66765d = i2;
            this.f66766f = hVar2;
            this.f66767g = i3;
        }
    }

    /* renamed from: qe.c$l */
    /* compiled from: DateTimeFormatterBuilder */
    static final class C16325l implements C16320g {

        /* renamed from: d */
        static final String[] f66768d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

        /* renamed from: f */
        static final C16325l f66769f = new C16325l("Z", "+HH:MM:ss");

        /* renamed from: g */
        static final C16325l f66770g = new C16325l("0", "+HH:MM:ss");

        /* renamed from: a */
        private final String f66771a;

        /* renamed from: c */
        private final int f66772c;

        C16325l(String str, String str2) {
            C16501d.m98548i(str, "noOffsetText");
            C16501d.m98548i(str2, "pattern");
            this.f66771a = str;
            this.f66772c = m97992a(str2);
        }

        /* renamed from: a */
        private int m97992a(String str) {
            int i = 0;
            while (true) {
                String[] strArr = f66768d;
                if (i >= strArr.length) {
                    throw new IllegalArgumentException("Invalid zone offset pattern: " + str);
                } else if (strArr[i].equals(str)) {
                    return i;
                } else {
                    i++;
                }
            }
        }

        /* renamed from: b */
        public boolean mo78970b(C16335d dVar, StringBuilder sb) {
            Long f = dVar.mo78995f(C16540a.OFFSET_SECONDS);
            if (f == null) {
                return false;
            }
            int o = C16501d.m98554o(f.longValue());
            if (o == 0) {
                sb.append(this.f66771a);
            } else {
                int abs = Math.abs((o / 3600) % 100);
                int abs2 = Math.abs((o / 60) % 60);
                int abs3 = Math.abs(o % 60);
                int length = sb.length();
                sb.append(o < 0 ? HelpFormatter.DEFAULT_OPT_PREFIX : "+");
                sb.append((char) ((abs / 10) + 48));
                sb.append((char) ((abs % 10) + 48));
                int i = this.f66772c;
                if (i >= 3 || (i >= 1 && abs2 > 0)) {
                    String str = ":";
                    sb.append(i % 2 == 0 ? str : "");
                    sb.append((char) ((abs2 / 10) + 48));
                    sb.append((char) ((abs2 % 10) + 48));
                    abs += abs2;
                    int i2 = this.f66772c;
                    if (i2 >= 7 || (i2 >= 5 && abs3 > 0)) {
                        if (i2 % 2 != 0) {
                            str = "";
                        }
                        sb.append(str);
                        sb.append((char) ((abs3 / 10) + 48));
                        sb.append((char) ((abs3 % 10) + 48));
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    sb.setLength(length);
                    sb.append(this.f66771a);
                }
            }
            return true;
        }

        public String toString() {
            String replace = this.f66771a.replace("'", "''");
            return "Offset(" + f66768d[this.f66772c] + ",'" + replace + "')";
        }
    }

    /* renamed from: qe.c$m */
    /* compiled from: DateTimeFormatterBuilder */
    static final class C16326m implements C16320g {

        /* renamed from: a */
        private final C16320g f66773a;

        /* renamed from: c */
        private final int f66774c;

        /* renamed from: d */
        private final char f66775d;

        C16326m(C16320g gVar, int i, char c) {
            this.f66773a = gVar;
            this.f66774c = i;
            this.f66775d = c;
        }

        /* renamed from: b */
        public boolean mo78970b(C16335d dVar, StringBuilder sb) {
            int length = sb.length();
            if (!this.f66773a.mo78970b(dVar, sb)) {
                return false;
            }
            int length2 = sb.length() - length;
            if (length2 <= this.f66774c) {
                for (int i = 0; i < this.f66774c - length2; i++) {
                    sb.insert(length, this.f66775d);
                }
                return true;
            }
            throw new DateTimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + this.f66774c);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("Pad(");
            sb.append(this.f66773a);
            sb.append(",");
            sb.append(this.f66774c);
            if (this.f66775d == ' ') {
                str = ")";
            } else {
                str = ",'" + this.f66775d + "')";
            }
            sb.append(str);
            return sb.toString();
        }
    }

    /* renamed from: qe.c$o */
    /* compiled from: DateTimeFormatterBuilder */
    enum C16328o implements C16320g {
        SENSITIVE,
        INSENSITIVE,
        STRICT,
        LENIENT;

        /* renamed from: b */
        public boolean mo78970b(C16335d dVar, StringBuilder sb) {
            return true;
        }

        public String toString() {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return "ParseCaseSensitive(true)";
            }
            if (ordinal == 1) {
                return "ParseCaseSensitive(false)";
            }
            if (ordinal == 2) {
                return "ParseStrict(true)";
            }
            if (ordinal == 3) {
                return "ParseStrict(false)";
            }
            throw new IllegalStateException("Unreachable");
        }
    }

    /* renamed from: qe.c$p */
    /* compiled from: DateTimeFormatterBuilder */
    static final class C16329p implements C16320g {

        /* renamed from: a */
        private final String f66784a;

        C16329p(String str) {
            this.f66784a = str;
        }

        /* renamed from: b */
        public boolean mo78970b(C16335d dVar, StringBuilder sb) {
            sb.append(this.f66784a);
            return true;
        }

        public String toString() {
            String replace = this.f66784a.replace("'", "''");
            return "'" + replace + "'";
        }
    }

    /* renamed from: qe.c$q */
    /* compiled from: DateTimeFormatterBuilder */
    static final class C16330q implements C16320g {

        /* renamed from: a */
        private final C16556h f66785a;

        /* renamed from: c */
        private final C16345j f66786c;

        /* renamed from: d */
        private final C16337e f66787d;

        /* renamed from: f */
        private volatile C16324k f66788f;

        C16330q(C16556h hVar, C16345j jVar, C16337e eVar) {
            this.f66785a = hVar;
            this.f66786c = jVar;
            this.f66787d = eVar;
        }

        /* renamed from: a */
        private C16324k m98001a() {
            if (this.f66788f == null) {
                this.f66788f = new C16324k(this.f66785a, 1, 19, C16341h.NORMAL);
            }
            return this.f66788f;
        }

        /* renamed from: b */
        public boolean mo78970b(C16335d dVar, StringBuilder sb) {
            Long f = dVar.mo78995f(this.f66785a);
            if (f == null) {
                return false;
            }
            String c = this.f66787d.mo78967c(this.f66785a, f.longValue(), this.f66786c, dVar.mo78992c());
            if (c == null) {
                return m98001a().mo78970b(dVar, sb);
            }
            sb.append(c);
            return true;
        }

        public String toString() {
            if (this.f66786c == C16345j.FULL) {
                return "Text(" + this.f66785a + ")";
            }
            return "Text(" + this.f66785a + "," + this.f66786c + ")";
        }
    }

    /* renamed from: qe.c$r */
    /* compiled from: DateTimeFormatterBuilder */
    static final class C16331r implements C16320g {

        /* renamed from: a */
        private final char f66789a;

        /* renamed from: c */
        private final int f66790c;

        public C16331r(char c, int i) {
            this.f66789a = c;
            this.f66790c = i;
        }

        /* renamed from: a */
        private C16320g m98003a(C16568m mVar) {
            char c = this.f66789a;
            if (c == 'W') {
                return new C16324k(mVar.mo79380h(), 1, 2, C16341h.NOT_NEGATIVE);
            }
            if (c != 'Y') {
                if (c == 'c') {
                    return new C16324k(mVar.mo79375b(), this.f66790c, 2, C16341h.NOT_NEGATIVE);
                }
                if (c == 'e') {
                    return new C16324k(mVar.mo79375b(), this.f66790c, 2, C16341h.NOT_NEGATIVE);
                }
                if (c != 'w') {
                    return null;
                }
                return new C16324k(mVar.mo79382i(), this.f66790c, 2, C16341h.NOT_NEGATIVE);
            } else if (this.f66790c == 2) {
                return new C16327n(mVar.mo79379g(), 2, 2, 0, C16327n.f66776z);
            } else {
                C16556h g = mVar.mo79379g();
                int i = this.f66790c;
                return new C16324k(g, i, 19, i < 4 ? C16341h.NORMAL : C16341h.EXCEEDS_PAD, -1, (C16314a) null);
            }
        }

        /* renamed from: b */
        public boolean mo78970b(C16335d dVar, StringBuilder sb) {
            return m98003a(C16568m.m98769e(dVar.mo78992c())).mo78970b(dVar, sb);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Localized(");
            char c = this.f66789a;
            if (c == 'Y') {
                int i = this.f66790c;
                if (i == 1) {
                    sb.append("WeekBasedYear");
                } else if (i == 2) {
                    sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
                } else {
                    sb.append("WeekBasedYear,");
                    sb.append(this.f66790c);
                    sb.append(",");
                    sb.append(19);
                    sb.append(",");
                    sb.append(this.f66790c < 4 ? C16341h.NORMAL : C16341h.EXCEEDS_PAD);
                }
            } else {
                if (c == 'c' || c == 'e') {
                    sb.append("DayOfWeek");
                } else if (c == 'w') {
                    sb.append("WeekOfWeekBasedYear");
                } else if (c == 'W') {
                    sb.append("WeekOfMonth");
                }
                sb.append(",");
                sb.append(this.f66790c);
            }
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: qe.c$s */
    /* compiled from: DateTimeFormatterBuilder */
    static final class C16332s implements C16320g {

        /* renamed from: a */
        private final C16565j<C15890p> f66791a;

        /* renamed from: c */
        private final String f66792c;

        C16332s(C16565j<C15890p> jVar, String str) {
            this.f66791a = jVar;
            this.f66792c = str;
        }

        /* renamed from: b */
        public boolean mo78970b(C16335d dVar, StringBuilder sb) {
            C15890p pVar = (C15890p) dVar.mo78996g(this.f66791a);
            if (pVar == null) {
                return false;
            }
            sb.append(pVar.getId());
            return true;
        }

        public String toString() {
            return this.f66792c;
        }
    }

    /* renamed from: qe.c$t */
    /* compiled from: DateTimeFormatterBuilder */
    static final class C16333t implements C16320g {

        /* renamed from: c */
        private static final Comparator<String> f66793c = new C16334a();

        /* renamed from: a */
        private final C16345j f66794a;

        /* renamed from: qe.c$t$a */
        /* compiled from: DateTimeFormatterBuilder */
        class C16334a implements Comparator<String> {
            C16334a() {
            }

            /* renamed from: a */
            public int compare(String str, String str2) {
                int length = str2.length() - str.length();
                return length == 0 ? str.compareTo(str2) : length;
            }
        }

        C16333t(C16345j jVar) {
            this.f66794a = (C16345j) C16501d.m98548i(jVar, "textStyle");
        }

        /* renamed from: b */
        public boolean mo78970b(C16335d dVar, StringBuilder sb) {
            boolean z;
            C15890p pVar = (C15890p) dVar.mo78996g(C16557i.m98739g());
            int i = 0;
            if (pVar == null) {
                return false;
            }
            if (pVar.mo75861m() instanceof C15892q) {
                sb.append(pVar.getId());
                return true;
            }
            C16551e e = dVar.mo78994e();
            C16540a aVar = C16540a.INSTANT_SECONDS;
            if (e.mo75642g(aVar)) {
                z = pVar.mo75860j().mo79504d(C15858d.m95507G(e.mo75644l(aVar)));
            } else {
                z = false;
            }
            TimeZone timeZone = TimeZone.getTimeZone(pVar.getId());
            if (this.f66794a.mo79010b() == C16345j.FULL) {
                i = 1;
            }
            sb.append(timeZone.getDisplayName(z, i, dVar.mo78992c()));
            return true;
        }

        public String toString() {
            return "ZoneText(" + this.f66794a + ")";
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f66741i = hashMap;
        hashMap.put('G', C16540a.ERA);
        hashMap.put('y', C16540a.YEAR_OF_ERA);
        hashMap.put('u', C16540a.YEAR);
        C16556h hVar = C16542c.f67318b;
        hashMap.put('Q', hVar);
        hashMap.put('q', hVar);
        C16540a aVar = C16540a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put('L', aVar);
        hashMap.put('D', C16540a.DAY_OF_YEAR);
        hashMap.put('d', C16540a.DAY_OF_MONTH);
        hashMap.put('F', C16540a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        C16540a aVar2 = C16540a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', C16540a.AMPM_OF_DAY);
        hashMap.put('H', C16540a.HOUR_OF_DAY);
        hashMap.put('k', C16540a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', C16540a.HOUR_OF_AMPM);
        hashMap.put('h', C16540a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', C16540a.MINUTE_OF_HOUR);
        hashMap.put('s', C16540a.SECOND_OF_MINUTE);
        C16540a aVar3 = C16540a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', C16540a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', C16540a.NANO_OF_DAY);
    }

    public C16313c() {
        this.f66743a = this;
        this.f66745c = new ArrayList();
        this.f66749g = -1;
        this.f66744b = null;
        this.f66746d = false;
    }

    /* renamed from: A */
    private void m97944A(char c, int i, C16556h hVar) {
        if (c != 'Q') {
            if (c == 'S') {
                mo78943b(C16540a.NANO_OF_SECOND, i, i, false);
                return;
            } else if (c != 'a') {
                if (!(c == 'h' || c == 'k' || c == 'm')) {
                    if (c != 'q') {
                        if (c != 's') {
                            if (c != 'u' && c != 'y') {
                                switch (c) {
                                    case 'D':
                                        if (i == 1) {
                                            mo78953n(hVar);
                                            return;
                                        } else if (i <= 3) {
                                            mo78954o(hVar, i);
                                            return;
                                        } else {
                                            throw new IllegalArgumentException("Too many pattern letters: " + c);
                                        }
                                    case 'E':
                                    case 'G':
                                        if (i == 1 || i == 2 || i == 3) {
                                            mo78952l(hVar, C16345j.SHORT);
                                            return;
                                        } else if (i == 4) {
                                            mo78952l(hVar, C16345j.FULL);
                                            return;
                                        } else if (i == 5) {
                                            mo78952l(hVar, C16345j.NARROW);
                                            return;
                                        } else {
                                            throw new IllegalArgumentException("Too many pattern letters: " + c);
                                        }
                                    case 'F':
                                        if (i == 1) {
                                            mo78953n(hVar);
                                            return;
                                        }
                                        throw new IllegalArgumentException("Too many pattern letters: " + c);
                                    case 'H':
                                        break;
                                    default:
                                        switch (c) {
                                            case 'K':
                                                break;
                                            case 'L':
                                                break;
                                            case 'M':
                                                break;
                                            default:
                                                switch (c) {
                                                    case 'c':
                                                        if (i == 1) {
                                                            m97946d(new C16331r('c', i));
                                                            return;
                                                        } else if (i == 2) {
                                                            throw new IllegalArgumentException("Invalid number of pattern letters: " + c);
                                                        } else if (i == 3) {
                                                            mo78952l(hVar, C16345j.SHORT_STANDALONE);
                                                            return;
                                                        } else if (i == 4) {
                                                            mo78952l(hVar, C16345j.FULL_STANDALONE);
                                                            return;
                                                        } else if (i == 5) {
                                                            mo78952l(hVar, C16345j.NARROW_STANDALONE);
                                                            return;
                                                        } else {
                                                            throw new IllegalArgumentException("Too many pattern letters: " + c);
                                                        }
                                                    case 'd':
                                                        break;
                                                    case 'e':
                                                        if (i == 1 || i == 2) {
                                                            m97946d(new C16331r('e', i));
                                                            return;
                                                        } else if (i == 3) {
                                                            mo78952l(hVar, C16345j.SHORT);
                                                            return;
                                                        } else if (i == 4) {
                                                            mo78952l(hVar, C16345j.FULL);
                                                            return;
                                                        } else if (i == 5) {
                                                            mo78952l(hVar, C16345j.NARROW);
                                                            return;
                                                        } else {
                                                            throw new IllegalArgumentException("Too many pattern letters: " + c);
                                                        }
                                                    default:
                                                        if (i == 1) {
                                                            mo78953n(hVar);
                                                            return;
                                                        } else {
                                                            mo78954o(hVar, i);
                                                            return;
                                                        }
                                                }
                                        }
                                }
                            } else if (i == 2) {
                                mo78956q(hVar, 2, 2, C16327n.f66776z);
                                return;
                            } else if (i < 4) {
                                mo78955p(hVar, i, 19, C16341h.NORMAL);
                                return;
                            } else {
                                mo78955p(hVar, i, 19, C16341h.EXCEEDS_PAD);
                                return;
                            }
                        }
                    }
                    if (i == 1) {
                        mo78953n(hVar);
                        return;
                    } else if (i == 2) {
                        mo78954o(hVar, 2);
                        return;
                    } else if (i == 3) {
                        mo78952l(hVar, C16345j.SHORT_STANDALONE);
                        return;
                    } else if (i == 4) {
                        mo78952l(hVar, C16345j.FULL_STANDALONE);
                        return;
                    } else if (i == 5) {
                        mo78952l(hVar, C16345j.NARROW_STANDALONE);
                        return;
                    } else {
                        throw new IllegalArgumentException("Too many pattern letters: " + c);
                    }
                }
                if (i == 1) {
                    mo78953n(hVar);
                    return;
                } else if (i == 2) {
                    mo78954o(hVar, i);
                    return;
                } else {
                    throw new IllegalArgumentException("Too many pattern letters: " + c);
                }
            } else if (i == 1) {
                mo78952l(hVar, C16345j.SHORT);
                return;
            } else {
                throw new IllegalArgumentException("Too many pattern letters: " + c);
            }
        }
        if (i == 1) {
            mo78953n(hVar);
        } else if (i == 2) {
            mo78954o(hVar, 2);
        } else if (i == 3) {
            mo78952l(hVar, C16345j.SHORT);
        } else if (i == 4) {
            mo78952l(hVar, C16345j.FULL);
        } else if (i == 5) {
            mo78952l(hVar, C16345j.NARROW);
        } else {
            throw new IllegalArgumentException("Too many pattern letters: " + c);
        }
    }

    /* renamed from: C */
    private void m97945C(String str) {
        int i;
        int i2 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
                int i3 = i2 + 1;
                while (i3 < str.length() && str.charAt(i3) == charAt) {
                    i3++;
                }
                int i4 = i3 - i2;
                if (charAt == 'p') {
                    if (i3 >= str.length() || (((charAt = str.charAt(i3)) < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z'))) {
                        i = i4;
                        i4 = 0;
                    } else {
                        int i5 = i3 + 1;
                        while (i5 < str.length() && str.charAt(i5) == charAt) {
                            i5++;
                        }
                        i = i5 - i3;
                        i3 = i5;
                    }
                    if (i4 != 0) {
                        mo78962w(i4);
                        i4 = i;
                    } else {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: " + str);
                    }
                }
                C16556h hVar = f66741i.get(Character.valueOf(charAt));
                if (hVar != null) {
                    m97944A(charAt, i4, hVar);
                } else if (charAt == 'z') {
                    if (i4 > 4) {
                        throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                    } else if (i4 == 4) {
                        mo78959t(C16345j.FULL);
                    } else {
                        mo78959t(C16345j.SHORT);
                    }
                } else if (charAt != 'V') {
                    String str2 = "+0000";
                    if (charAt == 'Z') {
                        if (i4 < 4) {
                            mo78948h("+HHMM", str2);
                        } else if (i4 == 4) {
                            mo78947g(C16345j.FULL);
                        } else if (i4 == 5) {
                            mo78948h("+HH:MM:ss", "Z");
                        } else {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        }
                    } else if (charAt == 'O') {
                        if (i4 == 1) {
                            mo78947g(C16345j.SHORT);
                        } else if (i4 == 4) {
                            mo78947g(C16345j.FULL);
                        } else {
                            throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + charAt);
                        }
                    } else if (charAt == 'X') {
                        if (i4 <= 5) {
                            mo78948h(C16325l.f66768d[i4 + (i4 == 1 ? 0 : 1)], "Z");
                        } else {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        }
                    } else if (charAt == 'x') {
                        if (i4 <= 5) {
                            if (i4 == 1) {
                                str2 = "+00";
                            } else if (i4 % 2 != 0) {
                                str2 = "+00:00";
                            }
                            mo78948h(C16325l.f66768d[i4 + (i4 == 1 ? 0 : 1)], str2);
                        } else {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        }
                    } else if (charAt == 'W') {
                        if (i4 <= 1) {
                            m97946d(new C16331r('W', i4));
                        } else {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        }
                    } else if (charAt == 'w') {
                        if (i4 <= 2) {
                            m97946d(new C16331r('w', i4));
                        } else {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        }
                    } else if (charAt == 'Y') {
                        m97946d(new C16331r('Y', i4));
                    } else {
                        throw new IllegalArgumentException("Unknown pattern letter: " + charAt);
                    }
                } else if (i4 == 2) {
                    mo78957r();
                } else {
                    throw new IllegalArgumentException("Pattern letter count must be 2: " + charAt);
                }
                i2 = i3 - 1;
            } else if (charAt == '\'') {
                int i6 = i2 + 1;
                int i7 = i6;
                while (i7 < str.length()) {
                    if (str.charAt(i7) == '\'') {
                        int i8 = i7 + 1;
                        if (i8 >= str.length() || str.charAt(i8) != '\'') {
                            break;
                        }
                        i7 = i8;
                    }
                    i7++;
                }
                if (i7 < str.length()) {
                    String substring = str.substring(i6, i7);
                    if (substring.length() == 0) {
                        mo78945e('\'');
                    } else {
                        mo78946f(substring.replace("''", "'"));
                    }
                    i2 = i7;
                } else {
                    throw new IllegalArgumentException("Pattern ends with an incomplete string literal: " + str);
                }
            } else if (charAt == '[') {
                mo78961v();
            } else if (charAt == ']') {
                if (this.f66743a.f66744b != null) {
                    mo78960u();
                } else {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
            } else if (charAt == '{' || charAt == '}' || charAt == '#') {
                throw new IllegalArgumentException("Pattern includes reserved character: '" + charAt + "'");
            } else {
                mo78945e(charAt);
            }
            i2++;
        }
    }

    /* renamed from: d */
    private int m97946d(C16320g gVar) {
        C16501d.m98548i(gVar, "pp");
        C16313c cVar = this.f66743a;
        int i = cVar.f66747e;
        if (i > 0) {
            if (gVar != null) {
                gVar = new C16326m(gVar, i, cVar.f66748f);
            }
            C16313c cVar2 = this.f66743a;
            cVar2.f66747e = 0;
            cVar2.f66748f = 0;
        }
        this.f66743a.f66745c.add(gVar);
        C16313c cVar3 = this.f66743a;
        cVar3.f66749g = -1;
        return cVar3.f66745c.size() - 1;
    }

    /* renamed from: m */
    private C16313c m97947m(C16324k kVar) {
        C16324k kVar2;
        C16313c cVar = this.f66743a;
        int i = cVar.f66749g;
        if (i < 0 || !(cVar.f66745c.get(i) instanceof C16324k)) {
            this.f66743a.f66749g = m97946d(kVar);
        } else {
            C16313c cVar2 = this.f66743a;
            int i2 = cVar2.f66749g;
            C16324k kVar3 = (C16324k) cVar2.f66745c.get(i2);
            int i3 = kVar.f66764c;
            int i4 = kVar.f66765d;
            if (i3 == i4 && kVar.f66766f == C16341h.NOT_NEGATIVE) {
                kVar2 = kVar3.mo78978d(i4);
                m97946d(kVar.mo78977c());
                this.f66743a.f66749g = i2;
            } else {
                kVar2 = kVar3.mo78977c();
                this.f66743a.f66749g = m97946d(kVar);
            }
            this.f66743a.f66745c.set(i2, kVar2);
        }
        return this;
    }

    /* renamed from: B */
    public C16313c mo78938B() {
        m97946d(C16328o.LENIENT);
        return this;
    }

    /* renamed from: D */
    public C16310b mo78939D() {
        return mo78940E(Locale.getDefault());
    }

    /* renamed from: E */
    public C16310b mo78940E(Locale locale) {
        C16501d.m98548i(locale, "locale");
        while (this.f66743a.f66744b != null) {
            mo78960u();
        }
        return new C16310b(new C16319f(this.f66745c, false), locale, C16339f.f66805e, C16340g.SMART, (Set<C16556h>) null, (C16187h) null, (C15890p) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public C16310b mo78941F(C16340g gVar) {
        return mo78939D().mo78934j(gVar);
    }

    /* renamed from: a */
    public C16313c mo78942a(C16310b bVar) {
        C16501d.m98548i(bVar, "formatter");
        m97946d(bVar.mo78932h(false));
        return this;
    }

    /* renamed from: b */
    public C16313c mo78943b(C16556h hVar, int i, int i2, boolean z) {
        m97946d(new C16321h(hVar, i, i2, z));
        return this;
    }

    /* renamed from: c */
    public C16313c mo78944c() {
        m97946d(new C16322i(-2));
        return this;
    }

    /* renamed from: e */
    public C16313c mo78945e(char c) {
        m97946d(new C16318e(c));
        return this;
    }

    /* renamed from: f */
    public C16313c mo78946f(String str) {
        C16501d.m98548i(str, "literal");
        if (str.length() > 0) {
            if (str.length() == 1) {
                m97946d(new C16318e(str.charAt(0)));
            } else {
                m97946d(new C16329p(str));
            }
        }
        return this;
    }

    /* renamed from: g */
    public C16313c mo78947g(C16345j jVar) {
        C16501d.m98548i(jVar, "style");
        if (jVar == C16345j.FULL || jVar == C16345j.SHORT) {
            m97946d(new C16323j(jVar));
            return this;
        }
        throw new IllegalArgumentException("Style must be either full or short");
    }

    /* renamed from: h */
    public C16313c mo78948h(String str, String str2) {
        m97946d(new C16325l(str2, str));
        return this;
    }

    /* renamed from: i */
    public C16313c mo78949i() {
        m97946d(C16325l.f66769f);
        return this;
    }

    /* renamed from: j */
    public C16313c mo78950j(String str) {
        C16501d.m98548i(str, "pattern");
        m97945C(str);
        return this;
    }

    /* renamed from: k */
    public C16313c mo78951k(C16556h hVar, Map<Long, String> map) {
        C16501d.m98548i(hVar, "field");
        C16501d.m98548i(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        C16345j jVar = C16345j.FULL;
        m97946d(new C16330q(hVar, jVar, new C16315b(new C16342i.C16344b(Collections.singletonMap(jVar, linkedHashMap)))));
        return this;
    }

    /* renamed from: l */
    public C16313c mo78952l(C16556h hVar, C16345j jVar) {
        C16501d.m98548i(hVar, "field");
        C16501d.m98548i(jVar, "textStyle");
        m97946d(new C16330q(hVar, jVar, C16337e.m98021b()));
        return this;
    }

    /* renamed from: n */
    public C16313c mo78953n(C16556h hVar) {
        C16501d.m98548i(hVar, "field");
        m97947m(new C16324k(hVar, 1, 19, C16341h.NORMAL));
        return this;
    }

    /* renamed from: o */
    public C16313c mo78954o(C16556h hVar, int i) {
        C16501d.m98548i(hVar, "field");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i);
        }
        m97947m(new C16324k(hVar, i, i, C16341h.NOT_NEGATIVE));
        return this;
    }

    /* renamed from: p */
    public C16313c mo78955p(C16556h hVar, int i, int i2, C16341h hVar2) {
        if (i == i2 && hVar2 == C16341h.NOT_NEGATIVE) {
            return mo78954o(hVar, i2);
        }
        C16501d.m98548i(hVar, "field");
        C16501d.m98548i(hVar2, "signStyle");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i);
        } else if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i2);
        } else if (i2 >= i) {
            m97947m(new C16324k(hVar, i, i2, hVar2));
            return this;
        } else {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
        }
    }

    /* renamed from: q */
    public C16313c mo78956q(C16556h hVar, int i, int i2, C16175b bVar) {
        C16501d.m98548i(hVar, "field");
        C16501d.m98548i(bVar, "baseDate");
        m97947m(new C16327n(hVar, i, i2, 0, bVar));
        return this;
    }

    /* renamed from: r */
    public C16313c mo78957r() {
        m97946d(new C16332s(C16557i.m98739g(), "ZoneId()"));
        return this;
    }

    /* renamed from: s */
    public C16313c mo78958s() {
        m97946d(new C16332s(f66740h, "ZoneRegionId()"));
        return this;
    }

    /* renamed from: t */
    public C16313c mo78959t(C16345j jVar) {
        m97946d(new C16333t(jVar));
        return this;
    }

    /* renamed from: u */
    public C16313c mo78960u() {
        C16313c cVar = this.f66743a;
        if (cVar.f66744b != null) {
            if (cVar.f66745c.size() > 0) {
                C16313c cVar2 = this.f66743a;
                C16319f fVar = new C16319f(cVar2.f66745c, cVar2.f66746d);
                this.f66743a = this.f66743a.f66744b;
                m97946d(fVar);
            } else {
                this.f66743a = this.f66743a.f66744b;
            }
            return this;
        }
        throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
    }

    /* renamed from: v */
    public C16313c mo78961v() {
        C16313c cVar = this.f66743a;
        cVar.f66749g = -1;
        this.f66743a = new C16313c(cVar, true);
        return this;
    }

    /* renamed from: w */
    public C16313c mo78962w(int i) {
        return mo78963x(i, ' ');
    }

    /* renamed from: x */
    public C16313c mo78963x(int i, char c) {
        if (i >= 1) {
            C16313c cVar = this.f66743a;
            cVar.f66747e = i;
            cVar.f66748f = c;
            cVar.f66749g = -1;
            return this;
        }
        throw new IllegalArgumentException("The pad width must be at least one but was " + i);
    }

    /* renamed from: y */
    public C16313c mo78964y() {
        m97946d(C16328o.INSENSITIVE);
        return this;
    }

    /* renamed from: z */
    public C16313c mo78965z() {
        m97946d(C16328o.SENSITIVE);
        return this;
    }

    private C16313c(C16313c cVar, boolean z) {
        this.f66743a = this;
        this.f66745c = new ArrayList();
        this.f66749g = -1;
        this.f66744b = cVar;
        this.f66746d = z;
    }

    /* renamed from: qe.c$n */
    /* compiled from: DateTimeFormatterBuilder */
    static final class C16327n extends C16324k {

        /* renamed from: z */
        static final C15861e f66776z = C15861e.m95544t0(2000, 1, 1);

        /* renamed from: p */
        private final int f66777p;

        /* renamed from: s */
        private final C16175b f66778s;

        C16327n(C16556h hVar, int i, int i2, int i3, C16175b bVar) {
            super(hVar, i, i2, C16341h.NOT_NEGATIVE);
            if (i < 1 || i > 10) {
                throw new IllegalArgumentException("The width must be from 1 to 10 inclusive but was " + i);
            } else if (i2 < 1 || i2 > 10) {
                throw new IllegalArgumentException("The maxWidth must be from 1 to 10 inclusive but was " + i2);
            } else if (i2 >= i) {
                if (bVar == null) {
                    long j = (long) i3;
                    if (!hVar.mo79343g().mo79372h(j)) {
                        throw new IllegalArgumentException("The base value must be within the range of the field");
                    } else if (j + ((long) C16324k.f66762o[i]) > 2147483647L) {
                        throw new DateTimeException("Unable to add printer-parser as the range exceeds the capacity of an int");
                    }
                }
                this.f66777p = i3;
                this.f66778s = bVar;
            } else {
                throw new IllegalArgumentException("The maxWidth must be greater than the width");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo78976a(C16335d dVar, long j) {
            long abs = Math.abs(j);
            int i = this.f66777p;
            if (this.f66778s != null) {
                i = C16187h.m97189j(dVar.mo78994e()).mo78639d(this.f66778s).mo75647q(this.f66763a);
            }
            if (j >= ((long) i)) {
                int[] iArr = C16324k.f66762o;
                int i2 = this.f66764c;
                if (j < ((long) (i + iArr[i2]))) {
                    return abs % ((long) iArr[i2]);
                }
            }
            return abs % ((long) C16324k.f66762o[this.f66765d]);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C16324k mo78977c() {
            if (this.f66767g == -1) {
                return this;
            }
            return new C16327n(this.f66763a, this.f66764c, this.f66765d, this.f66777p, this.f66778s, -1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C16327n mo78978d(int i) {
            return new C16327n(this.f66763a, this.f66764c, this.f66765d, this.f66777p, this.f66778s, this.f66767g + i);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ReducedValue(");
            sb.append(this.f66763a);
            sb.append(",");
            sb.append(this.f66764c);
            sb.append(",");
            sb.append(this.f66765d);
            sb.append(",");
            Object obj = this.f66778s;
            if (obj == null) {
                obj = Integer.valueOf(this.f66777p);
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        private C16327n(C16556h hVar, int i, int i2, int i3, C16175b bVar, int i4) {
            super(hVar, i, i2, C16341h.NOT_NEGATIVE, i4, (C16314a) null);
            this.f66777p = i3;
            this.f66778s = bVar;
        }
    }
}
