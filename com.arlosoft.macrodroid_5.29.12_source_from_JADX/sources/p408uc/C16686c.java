package p408uc;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import org.apache.http.impl.cookie.DateUtils;
import p297ja.C13339u;
import p372qc.C16279b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0000*\u00020\u0001H\u0000¨\u0006\u0004"}, mo71668d2 = {"", "Ljava/util/Date;", "a", "b", "okhttp"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* renamed from: uc.c */
/* compiled from: dates.kt */
public final class C16686c {

    /* renamed from: a */
    private static final C16687a f67575a = new C16687a();

    /* renamed from: b */
    private static final String[] f67576b;

    /* renamed from: c */
    private static final DateFormat[] f67577c;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0004"}, mo71668d2 = {"uc/c$a", "Ljava/lang/ThreadLocal;", "Ljava/text/DateFormat;", "a", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: uc.c$a */
    /* compiled from: dates.kt */
    public static final class C16687a extends ThreadLocal<DateFormat> {
        C16687a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(C16279b.f66627f);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", DateUtils.PATTERN_RFC1036, DateUtils.PATTERN_ASCTIME, "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f67576b = strArr;
        f67577c = new DateFormat[strArr.length];
    }

    /* renamed from: a */
    public static final Date m99136a(String str) {
        C13706o.m87929f(str, "$this$toHttpDateOrNull");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) f67575a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = f67576b;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                DateFormat[] dateFormatArr = f67577c;
                DateFormat dateFormat = dateFormatArr[i];
                SimpleDateFormat simpleDateFormat = dateFormat;
                if (dateFormat == null) {
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(f67576b[i], Locale.US);
                    simpleDateFormat2.setTimeZone(C16279b.f66627f);
                    dateFormatArr[i] = simpleDateFormat2;
                    simpleDateFormat = simpleDateFormat2;
                }
                parsePosition.setIndex(0);
                Date parse2 = simpleDateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            C13339u uVar = C13339u.f61331a;
            return null;
        }
    }

    /* renamed from: b */
    public static final String m99137b(Date date) {
        C13706o.m87929f(date, "$this$toHttpDateString");
        String format = ((DateFormat) f67575a.get()).format(date);
        C13706o.m87928e(format, "STANDARD_DATE_FORMAT.get().format(this)");
        return format;
    }
}
