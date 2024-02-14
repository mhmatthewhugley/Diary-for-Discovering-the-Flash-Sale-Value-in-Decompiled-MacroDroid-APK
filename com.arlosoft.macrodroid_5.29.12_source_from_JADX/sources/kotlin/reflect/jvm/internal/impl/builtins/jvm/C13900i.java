package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14473x;
import p362pb.C16151b;
import p362pb.C16153d;
import p398tb.C16610e;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.i */
/* compiled from: JvmBuiltInsSignatures.kt */
public final class C13900i {

    /* renamed from: a */
    public static final C13900i f62172a;

    /* renamed from: b */
    private static final Set<String> f62173b;

    /* renamed from: c */
    private static final Set<String> f62174c;

    /* renamed from: d */
    private static final Set<String> f62175d;

    /* renamed from: e */
    private static final Set<String> f62176e;

    /* renamed from: f */
    private static final Set<String> f62177f;

    /* renamed from: g */
    private static final Set<String> f62178g;

    static {
        C13900i iVar = new C13900i();
        f62172a = iVar;
        C14473x xVar = C14473x.f63314a;
        f62173b = C13563a1.m87392k(xVar.mo73220f("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        f62174c = C13563a1.m87391j(C13563a1.m87391j(C13563a1.m87391j(C13563a1.m87391j(C13563a1.m87391j(C13563a1.m87391j(iVar.m88444b(), xVar.mo73220f("List", "sort(Ljava/util/Comparator;)V")), xVar.mo73219e("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), xVar.mo73219e("Double", "isInfinite()Z", "isNaN()Z")), xVar.mo73219e("Float", "isInfinite()Z", "isNaN()Z")), xVar.mo73219e("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), xVar.mo73219e("CharSequence", "isEmpty()Z"));
        f62175d = C13563a1.m87391j(C13563a1.m87391j(C13563a1.m87391j(C13563a1.m87391j(C13563a1.m87391j(C13563a1.m87391j(xVar.mo73219e("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), xVar.mo73220f("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), xVar.mo73219e("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), xVar.mo73219e("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), xVar.mo73220f("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), xVar.mo73220f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V")), xVar.mo73220f("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f62176e = C13563a1.m87391j(C13563a1.m87391j(xVar.mo73220f("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), xVar.mo73220f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V")), xVar.mo73220f("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        Set<String> a = iVar.m88443a();
        String[] b = xVar.mo73217b("D");
        Set j = C13563a1.m87391j(a, xVar.mo73219e("Float", (String[]) Arrays.copyOf(b, b.length)));
        String[] b2 = xVar.mo73217b("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f62177f = C13563a1.m87391j(j, xVar.mo73219e("String", (String[]) Arrays.copyOf(b2, b2.length)));
        String[] b3 = xVar.mo73217b("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f62178g = xVar.mo73219e("Throwable", (String[]) Arrays.copyOf(b3, b3.length));
    }

    private C13900i() {
    }

    /* renamed from: a */
    private final Set<String> m88443a() {
        C14473x xVar = C14473x.f63314a;
        C16610e eVar = C16610e.BYTE;
        List<C16610e> m = C13614t.m87751m(C16610e.BOOLEAN, eVar, C16610e.DOUBLE, C16610e.FLOAT, eVar, C16610e.INT, C16610e.LONG, C16610e.SHORT);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C16610e j : m) {
            String d = j.mo79465j().mo78562g().mo78583d();
            C13706o.m87928e(d, "it.wrapperFqName.shortName().asString()");
            String[] b = xVar.mo73217b("Ljava/lang/String;");
            boolean unused = C13624y.m87797z(linkedHashSet, xVar.mo73219e(d, (String[]) Arrays.copyOf(b, b.length)));
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    private final Set<String> m88444b() {
        C14473x xVar = C14473x.f63314a;
        List<C16610e> m = C13614t.m87751m(C16610e.BOOLEAN, C16610e.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C16610e eVar : m) {
            String d = eVar.mo79465j().mo78562g().mo78583d();
            C13706o.m87928e(d, "it.wrapperFqName.shortName().asString()");
            boolean unused = C13624y.m87797z(linkedHashSet, xVar.mo73219e(d, eVar.mo79463g() + "Value()" + eVar.mo79462f()));
        }
        return linkedHashSet;
    }

    /* renamed from: c */
    public final Set<String> mo72216c() {
        return f62173b;
    }

    /* renamed from: d */
    public final Set<String> mo72217d() {
        return f62177f;
    }

    /* renamed from: e */
    public final Set<String> mo72218e() {
        return f62174c;
    }

    /* renamed from: f */
    public final Set<String> mo72219f() {
        return f62176e;
    }

    /* renamed from: g */
    public final Set<String> mo72220g() {
        return f62178g;
    }

    /* renamed from: h */
    public final Set<String> mo72221h() {
        return f62175d;
    }

    /* renamed from: i */
    public final boolean mo72222i(C16153d dVar) {
        C13706o.m87929f(dVar, "fqName");
        return C13706o.m87924a(dVar, C13902k.C13903a.f62255i) || C13902k.m88458e(dVar);
    }

    /* renamed from: j */
    public final boolean mo72223j(C16153d dVar) {
        C13706o.m87929f(dVar, "fqName");
        if (mo72222i(dVar)) {
            return true;
        }
        C16151b n = C13871c.f62112a.mo72174n(dVar);
        if (n == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(n.mo78544b().mo78556b()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
