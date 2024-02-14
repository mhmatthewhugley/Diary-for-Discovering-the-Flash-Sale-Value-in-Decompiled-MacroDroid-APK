package p443yc;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import okhttp3.C16002z;
import org.apache.commons.p353io.IOUtils;
import p399tc.C16617e;
import p426wc.C16801d;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J1\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0007¨\u0006\u0013"}, mo71668d2 = {"Lyc/c;", "", "", "loggerName", "d", "logger", "tag", "Lja/u;", "c", "", "logLevel", "message", "", "t", "a", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "b", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: yc.c */
/* compiled from: AndroidLog.kt */
public final class C17017c {

    /* renamed from: a */
    private static final CopyOnWriteArraySet<Logger> f68399a = new CopyOnWriteArraySet<>();

    /* renamed from: b */
    private static final Map<String, String> f68400b;

    /* renamed from: c */
    public static final C17017c f68401c = new C17017c();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package packageR = C16002z.class.getPackage();
        String name = packageR != null ? packageR.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = C16002z.class.getName();
        C13706o.m87928e(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = C16801d.class.getName();
        C13706o.m87928e(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = C16617e.class.getName();
        C13706o.m87928e(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f68400b = C13615t0.m87770t(linkedHashMap);
    }

    private C17017c() {
    }

    /* renamed from: c */
    private final void m100294c(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (f68399a.add(logger)) {
            C13706o.m87928e(logger, "logger");
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else if (Log.isLoggable(str2, 4)) {
                level = Level.INFO;
            } else {
                level = Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(C17018d.f68402a);
        }
    }

    /* renamed from: d */
    private final String m100295d(String str) {
        String str2 = f68400b.get(str);
        return str2 != null ? str2 : C15182y.m93715X0(str, 23);
    }

    /* renamed from: a */
    public final void mo80255a(String str, int i, String str2, Throwable th) {
        int min;
        C13706o.m87929f(str, "loggerName");
        C13706o.m87929f(str2, "message");
        String d = m100295d(str);
        if (Log.isLoggable(d, i)) {
            if (th != null) {
                str2 = str2 + IOUtils.LINE_SEPARATOR_UNIX + Log.getStackTraceString(th);
            }
            int i2 = 0;
            int length = str2.length();
            while (i2 < length) {
                int Z = C15177w.m93681Z(str2, 10, i2, false, 4, (Object) null);
                if (Z == -1) {
                    Z = length;
                }
                while (true) {
                    min = Math.min(Z, i2 + 4000);
                    String substring = str2.substring(i2, min);
                    C13706o.m87928e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i, d, substring);
                    if (min >= Z) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }

    /* renamed from: b */
    public final void mo80256b() {
        for (Map.Entry next : f68400b.entrySet()) {
            m100294c((String) next.getKey(), (String) next.getValue());
        }
    }
}
