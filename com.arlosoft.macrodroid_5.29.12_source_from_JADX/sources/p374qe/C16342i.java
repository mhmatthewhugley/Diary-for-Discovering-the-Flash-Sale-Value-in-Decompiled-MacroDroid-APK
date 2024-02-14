package p374qe;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p392se.C16540a;
import p392se.C16542c;
import p392se.C16556h;

/* renamed from: qe.i */
/* compiled from: SimpleDateTimeTextProvider */
final class C16342i extends C16337e {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Comparator<Map.Entry<String, Long>> f66821c = new C16343a();

    /* renamed from: b */
    private final ConcurrentMap<Map.Entry<C16556h, Locale>, Object> f66822b = new ConcurrentHashMap(16, 0.75f, 2);

    /* renamed from: qe.i$a */
    /* compiled from: SimpleDateTimeTextProvider */
    class C16343a implements Comparator<Map.Entry<String, Long>> {
        C16343a() {
        }

        /* renamed from: a */
        public int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
            return entry2.getKey().length() - entry.getKey().length();
        }
    }

    /* renamed from: qe.i$b */
    /* compiled from: SimpleDateTimeTextProvider */
    static final class C16344b {

        /* renamed from: a */
        private final Map<C16345j, Map<Long, String>> f66823a;

        /* renamed from: b */
        private final Map<C16345j, List<Map.Entry<String, Long>>> f66824b;

        C16344b(Map<C16345j, Map<Long, String>> map) {
            this.f66823a = map;
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (C16345j next : map.keySet()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : map.get(next).entrySet()) {
                    hashMap2.put(entry.getValue(), C16342i.m98031f(entry.getValue(), entry.getKey()));
                }
                ArrayList arrayList2 = new ArrayList(hashMap2.values());
                Collections.sort(arrayList2, C16342i.f66821c);
                hashMap.put(next, arrayList2);
                arrayList.addAll(arrayList2);
                hashMap.put((Object) null, arrayList);
            }
            Collections.sort(arrayList, C16342i.f66821c);
            this.f66824b = hashMap;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo79009a(long j, C16345j jVar) {
            Map map = this.f66823a.get(jVar);
            if (map != null) {
                return (String) map.get(Long.valueOf(j));
            }
            return null;
        }
    }

    C16342i() {
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static <A, B> Map.Entry<A, B> m98031f(A a, B b) {
        return new AbstractMap.SimpleImmutableEntry(a, b);
    }

    /* renamed from: g */
    private static C16344b m98032g(Map<C16345j, Map<Long, String>> map) {
        map.put(C16345j.FULL_STANDALONE, map.get(C16345j.FULL));
        map.put(C16345j.SHORT_STANDALONE, map.get(C16345j.SHORT));
        C16345j jVar = C16345j.NARROW;
        if (map.containsKey(jVar)) {
            C16345j jVar2 = C16345j.NARROW_STANDALONE;
            if (!map.containsKey(jVar2)) {
                map.put(jVar2, map.get(jVar));
            }
        }
        return new C16344b(map);
    }

    /* renamed from: h */
    private Object m98033h(C16556h hVar, Locale locale) {
        C16556h hVar2 = hVar;
        Locale locale2 = locale;
        if (hVar2 == C16540a.MONTH_OF_YEAR) {
            DateFormatSymbols instance = DateFormatSymbols.getInstance(locale);
            HashMap hashMap = new HashMap();
            String[] months = instance.getMonths();
            DateFormatSymbols dateFormatSymbols = instance;
            HashMap hashMap2 = new HashMap();
            hashMap2.put(1L, months[0]);
            hashMap2.put(2L, months[1]);
            hashMap2.put(3L, months[2]);
            hashMap2.put(4L, months[3]);
            hashMap2.put(5L, months[4]);
            hashMap2.put(6L, months[5]);
            hashMap2.put(7L, months[6]);
            hashMap2.put(8L, months[7]);
            hashMap2.put(9L, months[8]);
            hashMap2.put(10L, months[9]);
            hashMap2.put(11L, months[10]);
            hashMap2.put(12L, months[11]);
            hashMap.put(C16345j.FULL, hashMap2);
            HashMap hashMap3 = new HashMap();
            hashMap3.put(1, m98036k(1, months[0], locale2));
            hashMap3.put(2L, m98036k(2, months[1], locale2));
            hashMap3.put(3L, m98036k(3, months[2], locale2));
            hashMap3.put(4L, m98036k(4, months[3], locale2));
            hashMap3.put(5L, m98036k(5, months[4], locale2));
            hashMap3.put(6L, m98036k(6, months[5], locale2));
            hashMap3.put(7L, m98036k(7, months[6], locale2));
            hashMap3.put(8L, m98036k(8, months[7], locale2));
            hashMap3.put(9L, m98036k(9, months[8], locale2));
            hashMap3.put(10L, m98036k(10, months[9], locale2));
            hashMap3.put(11L, m98036k(11, months[10], locale2));
            hashMap3.put(12, m98036k(12, months[11], locale2));
            HashMap hashMap4 = hashMap;
            hashMap4.put(C16345j.NARROW, hashMap3);
            String[] shortMonths = dateFormatSymbols.getShortMonths();
            HashMap hashMap5 = new HashMap();
            hashMap5.put(1, shortMonths[0]);
            hashMap5.put(2L, shortMonths[1]);
            hashMap5.put(3L, shortMonths[2]);
            hashMap5.put(4L, shortMonths[3]);
            hashMap5.put(5L, shortMonths[4]);
            hashMap5.put(6L, shortMonths[5]);
            hashMap5.put(7L, shortMonths[6]);
            hashMap5.put(8L, shortMonths[7]);
            hashMap5.put(9L, shortMonths[8]);
            hashMap5.put(10L, shortMonths[9]);
            hashMap5.put(11, shortMonths[10]);
            hashMap5.put(12, shortMonths[11]);
            hashMap4.put(C16345j.SHORT, hashMap5);
            return m98032g(hashMap4);
        } else if (hVar2 == C16540a.DAY_OF_WEEK) {
            DateFormatSymbols instance2 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap6 = new HashMap();
            String[] weekdays = instance2.getWeekdays();
            HashMap hashMap7 = new HashMap();
            hashMap7.put(1, weekdays[2]);
            hashMap7.put(2L, weekdays[3]);
            hashMap7.put(3L, weekdays[4]);
            hashMap7.put(4L, weekdays[5]);
            hashMap7.put(5L, weekdays[6]);
            hashMap7.put(6L, weekdays[7]);
            hashMap7.put(7L, weekdays[1]);
            hashMap6.put(C16345j.FULL, hashMap7);
            HashMap hashMap8 = new HashMap();
            hashMap8.put(1, m98035j(1, weekdays[2], locale2));
            hashMap8.put(2L, m98035j(2, weekdays[3], locale2));
            hashMap8.put(3L, m98035j(3, weekdays[4], locale2));
            hashMap8.put(4L, m98035j(4, weekdays[5], locale2));
            hashMap8.put(5L, m98035j(5, weekdays[6], locale2));
            hashMap8.put(6L, m98035j(6, weekdays[7], locale2));
            hashMap8.put(7L, m98035j(7, weekdays[1], locale2));
            hashMap6.put(C16345j.NARROW, hashMap8);
            String[] shortWeekdays = instance2.getShortWeekdays();
            HashMap hashMap9 = new HashMap();
            hashMap9.put(1, shortWeekdays[2]);
            hashMap9.put(2L, shortWeekdays[3]);
            hashMap9.put(3L, shortWeekdays[4]);
            hashMap9.put(4L, shortWeekdays[5]);
            hashMap9.put(5L, shortWeekdays[6]);
            hashMap9.put(6L, shortWeekdays[7]);
            hashMap9.put(7L, shortWeekdays[1]);
            hashMap6.put(C16345j.SHORT, hashMap9);
            return m98032g(hashMap6);
        } else if (hVar2 == C16540a.AMPM_OF_DAY) {
            DateFormatSymbols instance3 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap10 = new HashMap();
            String[] amPmStrings = instance3.getAmPmStrings();
            HashMap hashMap11 = new HashMap();
            hashMap11.put(0L, amPmStrings[0]);
            hashMap11.put(1, amPmStrings[1]);
            hashMap10.put(C16345j.FULL, hashMap11);
            hashMap10.put(C16345j.SHORT, hashMap11);
            return m98032g(hashMap10);
        } else if (hVar2 == C16540a.ERA) {
            DateFormatSymbols instance4 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap12 = new HashMap();
            String[] eras = instance4.getEras();
            HashMap hashMap13 = new HashMap();
            hashMap13.put(0L, eras[0]);
            hashMap13.put(1, eras[1]);
            hashMap12.put(C16345j.SHORT, hashMap13);
            if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
                HashMap hashMap14 = new HashMap();
                hashMap14.put(0L, "Before Christ");
                hashMap14.put(1, "Anno Domini");
                hashMap12.put(C16345j.FULL, hashMap14);
            } else {
                hashMap12.put(C16345j.FULL, hashMap13);
            }
            HashMap hashMap15 = new HashMap();
            hashMap15.put(0L, eras[0].substring(0, 1));
            hashMap15.put(1, eras[1].substring(0, 1));
            hashMap12.put(C16345j.NARROW, hashMap15);
            return m98032g(hashMap12);
        } else if (hVar2 != C16542c.f67318b) {
            return "";
        } else {
            HashMap hashMap16 = new HashMap();
            HashMap hashMap17 = new HashMap();
            hashMap17.put(1, "Q1");
            hashMap17.put(2L, "Q2");
            hashMap17.put(3L, "Q3");
            hashMap17.put(4L, "Q4");
            hashMap16.put(C16345j.SHORT, hashMap17);
            HashMap hashMap18 = new HashMap();
            hashMap18.put(1, "1st quarter");
            hashMap18.put(2L, "2nd quarter");
            hashMap18.put(3L, "3rd quarter");
            hashMap18.put(4L, "4th quarter");
            hashMap16.put(C16345j.FULL, hashMap18);
            return m98032g(hashMap16);
        }
    }

    /* renamed from: i */
    private Object m98034i(C16556h hVar, Locale locale) {
        Map.Entry f = m98031f(hVar, locale);
        Object obj = this.f66822b.get(f);
        if (obj != null) {
            return obj;
        }
        this.f66822b.putIfAbsent(f, m98033h(hVar, locale));
        return this.f66822b.get(f);
    }

    /* renamed from: j */
    private String m98035j(int i, String str, Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "日";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i) {
                case 1:
                    return "ن";
                case 2:
                    return "ث";
                case 3:
                    return "ر";
                case 4:
                    return "خ";
                case 5:
                    return "ج";
                case 6:
                    return "س";
                case 7:
                    return "ح";
            }
        }
        return str.substring(0, 1);
    }

    /* renamed from: k */
    private String m98036k(int i, String str, Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "七";
                case 8:
                    return "八";
                case 9:
                    return "九";
                case 10:
                    return "十";
                case 11:
                    return "十一";
                case 12:
                    return "十二";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i) {
                case 1:
                    return "ي";
                case 2:
                    return "ف";
                case 3:
                    return "م";
                case 4:
                    return "أ";
                case 5:
                    return "و";
                case 6:
                    return "ن";
                case 7:
                    return "ل";
                case 8:
                    return "غ";
                case 9:
                    return "س";
                case 10:
                    return "ك";
                case 11:
                    return "ب";
                case 12:
                    return "د";
            }
        }
        if (!locale.getLanguage().equals("ja") || !locale.getCountry().equals("JP")) {
            return str.substring(0, 1);
        }
        return Integer.toString(i);
    }

    /* renamed from: c */
    public String mo78967c(C16556h hVar, long j, C16345j jVar, Locale locale) {
        Object i = m98034i(hVar, locale);
        if (i instanceof C16344b) {
            return ((C16344b) i).mo79009a(j, jVar);
        }
        return null;
    }
}
