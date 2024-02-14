package com.arlosoft.macrodroid.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/* renamed from: com.arlosoft.macrodroid.utils.s */
/* compiled from: DateTimeUtils */
public class C6424s {
    /* renamed from: a */
    public static String m24734a(int i) {
        Calendar instance = Calendar.getInstance();
        instance.set(2011, 7, 1, 0, 0, 0);
        instance.add(5, i);
        return String.format("%tA", new Object[]{instance});
    }

    /* renamed from: b */
    public static String[] m24735b() {
        String[] strArr = new String[12];
        for (int i = 0; i < 12; i++) {
            Calendar instance = Calendar.getInstance();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM");
            instance.set(2, i);
            instance.set(5, 1);
            strArr[i] = simpleDateFormat.format(instance.getTime());
        }
        return strArr;
    }
}
