package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import org.apache.commons.p353io.FilenameUtils;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.x */
/* compiled from: SignatureBuildingComponents.kt */
public final class C14473x {

    /* renamed from: a */
    public static final C14473x f63314a = new C14473x();

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.x$a */
    /* compiled from: SignatureBuildingComponents.kt */
    static final class C14474a extends C13708q implements C16265l<String, CharSequence> {

        /* renamed from: a */
        public static final C14474a f63315a = new C14474a();

        C14474a() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(String str) {
            C13706o.m87929f(str, "it");
            return C14473x.f63314a.m90697c(str);
        }
    }

    private C14473x() {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final String m90697c(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return 'L' + str + ';';
    }

    /* renamed from: b */
    public final String[] mo73217b(String... strArr) {
        C13706o.m87929f(strArr, "signatures");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        Object[] array = arrayList.toArray(new String[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    /* renamed from: d */
    public final Set<String> mo73218d(String str, String... strArr) {
        C13706o.m87929f(str, "internalName");
        C13706o.m87929f(strArr, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + FilenameUtils.EXTENSION_SEPARATOR + str2);
        }
        return linkedHashSet;
    }

    /* renamed from: e */
    public final Set<String> mo73219e(String str, String... strArr) {
        C13706o.m87929f(str, "name");
        C13706o.m87929f(strArr, "signatures");
        return mo73218d(mo73222h(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: f */
    public final Set<String> mo73220f(String str, String... strArr) {
        C13706o.m87929f(str, "name");
        C13706o.m87929f(strArr, "signatures");
        return mo73218d(mo73223i(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: g */
    public final String mo73221g(String str) {
        C13706o.m87929f(str, "name");
        return "java/util/function/" + str;
    }

    /* renamed from: h */
    public final String mo73222h(String str) {
        C13706o.m87929f(str, "name");
        return "java/lang/" + str;
    }

    /* renamed from: i */
    public final String mo73223i(String str) {
        C13706o.m87929f(str, "name");
        return "java/util/" + str;
    }

    /* renamed from: j */
    public final String mo73224j(String str, List<String> list, String str2) {
        C13706o.m87929f(str, "name");
        C13706o.m87929f(list, "parameters");
        C13706o.m87929f(str2, "ret");
        return str + '(' + C13566b0.m87432g0(list, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C14474a.f63315a, 30, (Object) null) + ')' + m90697c(str2);
    }

    /* renamed from: k */
    public final String mo73225k(String str, String str2) {
        C13706o.m87929f(str, "internalName");
        C13706o.m87929f(str2, "jvmDescriptor");
        return str + FilenameUtils.EXTENSION_SEPARATOR + str2;
    }
}
