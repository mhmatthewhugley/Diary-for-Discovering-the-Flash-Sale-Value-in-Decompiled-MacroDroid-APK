package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.apache.http.protocol.HTTP;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzala {
    /* renamed from: a */
    public static long m41690a(String str) {
        try {
            return m41693d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                zzakp.m41663d("Unable to parse dateStr: %s, falling back to 0", str);
                return 0;
            }
            zzakp.m41662c(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    @Nullable
    /* renamed from: b */
    public static zzajm m41691b(zzajz zzajz) {
        long j;
        long j2;
        boolean z;
        long j3;
        long j4;
        long j5;
        zzajz zzajz2 = zzajz;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = zzajz2.f24868c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get(HTTP.DATE_HEADER);
        long a = str != null ? m41690a(str) : 0;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i2 = 0;
            j2 = 0;
            j = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            z = false;
            j2 = 0;
            j = 0;
        }
        String str3 = (String) map.get("Expires");
        long a2 = str3 != null ? m41690a(str3) : 0;
        String str4 = (String) map.get("Last-Modified");
        long a3 = str4 != null ? m41690a(str4) : 0;
        String str5 = (String) map.get("ETag");
        if (z) {
            j4 = currentTimeMillis + (j2 * 1000);
            if (i != 0) {
                j5 = j4;
            } else {
                Long.signum(j);
                j5 = (j * 1000) + j4;
            }
            j3 = j5;
        } else {
            j3 = 0;
            if (a <= 0 || a2 < a) {
                j4 = 0;
            } else {
                j4 = currentTimeMillis + (a2 - a);
                j3 = j4;
            }
        }
        zzajm zzajm = new zzajm();
        zzajm.f24835a = zzajz2.f24867b;
        zzajm.f24836b = str5;
        zzajm.f24840f = j4;
        zzajm.f24839e = j3;
        zzajm.f24837c = a;
        zzajm.f24838d = a3;
        zzajm.f24841g = map;
        zzajm.f24842h = zzajz2.f24869d;
        return zzajm;
    }

    /* renamed from: c */
    static String m41692c(long j) {
        return m41693d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    /* renamed from: d */
    private static SimpleDateFormat m41693d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
