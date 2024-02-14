package com.arlosoft.macrodroid.utils;

import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: com.arlosoft.macrodroid.utils.q */
/* compiled from: ConciseNumberFormatter */
public class C6418q {

    /* renamed from: a */
    private static final NavigableMap<Long, String> f15039a;

    static {
        TreeMap treeMap = new TreeMap();
        f15039a = treeMap;
        treeMap.put(1000L, "k");
        treeMap.put(1000000L, "M");
        treeMap.put(1000000000L, "G");
        treeMap.put(1000000000000L, ExifInterface.GPS_DIRECTION_TRUE);
        treeMap.put(1000000000000000L, "P");
        treeMap.put(1000000000000000000L, ExifInterface.LONGITUDE_EAST);
    }

    /* renamed from: a */
    public static String m24718a(long j) {
        StringBuilder sb;
        if (j == Long.MIN_VALUE) {
            return m24718a(-9223372036854775807L);
        }
        if (j < 0) {
            return HelpFormatter.DEFAULT_OPT_PREFIX + m24718a(-j);
        } else if (j < 1000) {
            return Long.toString(j);
        } else {
            Map.Entry<Long, String> floorEntry = f15039a.floorEntry(Long.valueOf(j));
            String value = floorEntry.getValue();
            long longValue = j / (floorEntry.getKey().longValue() / 10);
            if (longValue < 100 && ((double) longValue) / 10.0d != ((double) (longValue / 10))) {
                sb = new StringBuilder();
                sb.append(((double) longValue) / 10.0d);
            } else {
                sb = new StringBuilder();
                sb.append(longValue / 10);
            }
            sb.append(value);
            return sb.toString();
        }
    }
}
