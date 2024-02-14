package p362pb;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C13706o;

/* renamed from: pb.e */
/* compiled from: FqNamesUtil.kt */
public final class C16155e {

    /* renamed from: pb.e$a */
    /* compiled from: FqNamesUtil.kt */
    public /* synthetic */ class C16156a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f66297a;

        static {
            int[] iArr = new int[C16162k.values().length];
            iArr[C16162k.BEGINNING.ordinal()] = 1;
            iArr[C16162k.AFTER_DOT.ordinal()] = 2;
            iArr[C16162k.MIDDLE.ordinal()] = 3;
            f66297a = iArr;
        }
    }

    /* renamed from: a */
    public static final <V> V m97010a(C16152c cVar, Map<C16152c, ? extends V> map) {
        Object obj;
        C13706o.m87929f(cVar, "<this>");
        C13706o.m87929f(map, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<C16152c, ? extends V>> it = map.entrySet().iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            C16152c cVar2 = (C16152c) next.getKey();
            if (!C13706o.m87924a(cVar, cVar2) && !m97011b(cVar, cVar2)) {
                z = false;
            }
            if (z) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        if (!(!linkedHashMap.isEmpty())) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        if (!it2.hasNext()) {
            obj = null;
        } else {
            obj = it2.next();
            if (it2.hasNext()) {
                int length = m97016g((C16152c) ((Map.Entry) obj).getKey(), cVar).mo78556b().length();
                do {
                    Object next2 = it2.next();
                    int length2 = m97016g((C16152c) ((Map.Entry) next2).getKey(), cVar).mo78556b().length();
                    if (length > length2) {
                        obj = next2;
                        length = length2;
                    }
                } while (it2.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return entry.getValue();
        }
        return null;
    }

    /* renamed from: b */
    public static final boolean m97011b(C16152c cVar, C16152c cVar2) {
        C13706o.m87929f(cVar, "<this>");
        C13706o.m87929f(cVar2, "packageName");
        return C13706o.m87924a(m97015f(cVar), cVar2);
    }

    /* renamed from: c */
    private static final boolean m97012c(String str, String str2) {
        return C15176v.m93634I(str, str2, false, 2, (Object) null) && str.charAt(str2.length()) == '.';
    }

    /* renamed from: d */
    public static final boolean m97013d(C16152c cVar, C16152c cVar2) {
        C13706o.m87929f(cVar, "<this>");
        C13706o.m87929f(cVar2, "packageName");
        if (C13706o.m87924a(cVar, cVar2) || cVar2.mo78558d()) {
            return true;
        }
        String b = cVar.mo78556b();
        C13706o.m87928e(b, "this.asString()");
        String b2 = cVar2.mo78556b();
        C13706o.m87928e(b2, "packageName.asString()");
        return m97012c(b, b2);
    }

    /* renamed from: e */
    public static final boolean m97014e(String str) {
        if (str == null) {
            return false;
        }
        C16162k kVar = C16162k.BEGINNING;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            int i2 = C16156a.f66297a[kVar.ordinal()];
            if (i2 == 1 || i2 == 2) {
                if (!Character.isJavaIdentifierPart(charAt)) {
                    return false;
                }
                kVar = C16162k.MIDDLE;
            } else if (i2 != 3) {
                continue;
            } else if (charAt == '.') {
                kVar = C16162k.AFTER_DOT;
            } else if (!Character.isJavaIdentifierPart(charAt)) {
                return false;
            }
        }
        if (kVar != C16162k.AFTER_DOT) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final C16152c m97015f(C16152c cVar) {
        C13706o.m87929f(cVar, "<this>");
        if (cVar.mo78558d()) {
            return null;
        }
        return cVar.mo78559e();
    }

    /* renamed from: g */
    public static final C16152c m97016g(C16152c cVar, C16152c cVar2) {
        C13706o.m87929f(cVar, "<this>");
        C13706o.m87929f(cVar2, "prefix");
        if (!m97013d(cVar, cVar2) || cVar2.mo78558d()) {
            return cVar;
        }
        if (C13706o.m87924a(cVar, cVar2)) {
            C16152c cVar3 = C16152c.f66287c;
            C13706o.m87928e(cVar3, "ROOT");
            return cVar3;
        }
        String b = cVar.mo78556b();
        C13706o.m87928e(b, "asString()");
        String substring = b.substring(cVar2.mo78556b().length() + 1);
        C13706o.m87928e(substring, "this as java.lang.String).substring(startIndex)");
        return new C16152c(substring);
    }
}
