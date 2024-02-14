package p349ob;

import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.p353io.FilenameUtils;
import p326ma.C15711c;
import p370qa.C16265l;

/* renamed from: ob.b */
/* compiled from: ClassMapperLite.kt */
public final class C15829b {

    /* renamed from: a */
    public static final C15829b f65267a = new C15829b();

    /* renamed from: b */
    private static final String f65268b = C13566b0.m87432g0(C13614t.m87751m('k', 'o', 't', 'l', 'i', 'n'), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C16265l) null, 62, (Object) null);

    /* renamed from: c */
    private static final Map<String, String> f65269c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List m = C13614t.m87751m("Boolean", "Z", "Char", "C", "Byte", "B", "Short", ExifInterface.LATITUDE_SOUTH, "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int b = C15711c.m94994b(0, m.size() - 1, 2);
        if (b >= 0) {
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = f65268b;
                sb.append(str);
                sb.append('/');
                sb.append((String) m.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb.toString(), m.get(i2));
                linkedHashMap.put(str + '/' + ((String) m.get(i)) + "Array", '[' + ((String) m.get(i2)));
                if (i == b) {
                    break;
                }
                i += 2;
            }
        }
        linkedHashMap.put(f65268b + "/Unit", ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        m95439a(linkedHashMap, "Any", "java/lang/Object");
        m95439a(linkedHashMap, "Nothing", "java/lang/Void");
        m95439a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : C13614t.m87751m("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            m95439a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : C13614t.m87751m("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            m95439a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            m95439a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        m95439a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        m95439a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        m95439a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        m95439a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            StringBuilder sb2 = new StringBuilder();
            String str4 = f65268b;
            sb2.append(str4);
            sb2.append("/jvm/functions/Function");
            sb2.append(i3);
            m95439a(linkedHashMap, "Function" + i3, sb2.toString());
            m95439a(linkedHashMap, "reflect/KFunction" + i3, str4 + "/reflect/KFunction");
        }
        for (String str5 : C13614t.m87751m("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            m95439a(linkedHashMap, str5 + ".Companion", f65268b + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f65269c = linkedHashMap;
    }

    private C15829b() {
    }

    /* renamed from: a */
    private static final void m95439a(Map<String, String> map, String str, String str2) {
        map.put(f65268b + '/' + str, 'L' + str2 + ';');
    }

    /* renamed from: b */
    public static final String m95440b(String str) {
        C13706o.m87929f(str, "classId");
        String str2 = f65269c.get(str);
        if (str2 != null) {
            return str2;
        }
        return 'L' + C15176v.m93629D(str, FilenameUtils.EXTENSION_SEPARATOR, '$', false, 4, (Object) null) + ';';
    }
}
