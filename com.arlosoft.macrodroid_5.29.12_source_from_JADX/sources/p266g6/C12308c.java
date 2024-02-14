package p266g6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: g6.c */
/* compiled from: CharacterUtils */
public class C12308c {
    /* renamed from: a */
    public static List<C12307b> m83010a(CharSequence charSequence, CharSequence charSequence2) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            int i2 = 0;
            while (true) {
                if (i2 < charSequence2.length()) {
                    if (!hashSet.contains(Integer.valueOf(i2)) && charAt == charSequence2.charAt(i2)) {
                        hashSet.add(Integer.valueOf(i2));
                        C12307b bVar = new C12307b();
                        bVar.f58976a = charAt;
                        bVar.f58977b = i;
                        bVar.f58978c = i2;
                        arrayList.add(bVar);
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static float m83011b(int i, int i2, float f, float f2, float f3, List<Float> list, List<Float> list2) {
        for (int i3 = 0; i3 < i2; i3++) {
            f2 += list.get(i3).floatValue();
        }
        for (int i4 = 0; i4 < i; i4++) {
            f3 += list2.get(i4).floatValue();
        }
        return f3 + ((f2 - f3) * f);
    }

    /* renamed from: c */
    public static int m83012c(int i, List<C12307b> list) {
        for (C12307b next : list) {
            if (next.f58977b == i) {
                return next.f58978c;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static boolean m83013d(int i, List<C12307b> list) {
        for (C12307b bVar : list) {
            if (bVar.f58978c == i) {
                return true;
            }
        }
        return false;
    }
}
