package p410ue;

import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import org.zeroturnaround.zip.ZipException;

/* renamed from: ue.c */
/* compiled from: Java7Nio2ApiPermissionsStrategy */
class C16702c implements C16705f {

    /* renamed from: a */
    private final Class<? extends Enum<?>> f67605a;

    /* renamed from: b */
    private final Class<?> f67606b;

    /* renamed from: c */
    private final Class<?> f67607c;

    /* renamed from: d */
    private final Class<? extends Enum<?>> f67608d;

    /* renamed from: e */
    private final Enum<?>[] f67609e;

    /* renamed from: f */
    private final Method f67610f;

    /* renamed from: g */
    private final Method f67611g;

    /* renamed from: h */
    private final Method f67612h;

    /* renamed from: i */
    private final Object f67613i;

    /* renamed from: j */
    private final Object f67614j;

    /* renamed from: k */
    private final Object f67615k;

    /* renamed from: l */
    private final Object f67616l;

    /* renamed from: m */
    private final Object f67617m;

    /* renamed from: n */
    private final Object f67618n;

    /* renamed from: o */
    private final Object f67619o;

    /* renamed from: p */
    private final Object f67620p;

    /* renamed from: q */
    private final Object f67621q;

    public C16702c() {
        Class<Object> cls = Object.class;
        Class<Enum> cls2 = Enum.class;
        if (m99192e()) {
            Class<? extends Enum<?>> a = C16708h.m99227a("java.nio.file.attribute.PosixFilePermission", cls2);
            this.f67605a = a;
            Enum[] enumArr = (Enum[]) a.getEnumConstants();
            this.f67613i = enumArr[0];
            this.f67614j = enumArr[1];
            this.f67615k = enumArr[2];
            this.f67616l = enumArr[3];
            this.f67617m = enumArr[4];
            this.f67618n = enumArr[5];
            this.f67619o = enumArr[6];
            this.f67620p = enumArr[7];
            this.f67621q = enumArr[8];
            Class<? extends Enum<?>> a2 = C16708h.m99227a("java.nio.file.LinkOption", cls2);
            this.f67608d = a2;
            Enum<?>[] enumArr2 = (Enum[]) Array.newInstance(a2, 1);
            this.f67609e = enumArr2;
            enumArr2[0] = ((Enum[]) a2.getEnumConstants())[0];
            Class<?> a3 = C16708h.m99227a("java.nio.file.Files", cls);
            this.f67606b = a3;
            Class<?> a4 = C16708h.m99227a("java.nio.file.Path", cls);
            this.f67607c = a4;
            this.f67610f = C16708h.m99228b(File.class, "toPath", new Class[0]);
            this.f67611g = C16708h.m99228b(a3, "setPosixFilePermissions", a4, Set.class);
            this.f67612h = C16708h.m99228b(a3, "getPosixFilePermissions", a4, enumArr2.getClass());
            return;
        }
        throw new ZipException("File system does not support POSIX file attributes");
    }

    /* renamed from: c */
    private <E> void m99190c(boolean z, Set<E> set, E e) {
        if (z) {
            set.add(e);
        }
    }

    /* renamed from: d */
    private Set<?> m99191d(File file) {
        return (Set) C16708h.m99229c(this.f67612h, (Object) null, m99194g(file), this.f67609e);
    }

    /* renamed from: e */
    private static boolean m99192e() {
        Class<Object> cls = Object.class;
        return ((Set) C16708h.m99229c(C16708h.m99228b(C16708h.m99227a("java.nio.file.FileSystem", cls), "supportedFileAttributeViews", new Class[0]), C16708h.m99229c(C16708h.m99228b(C16708h.m99227a("java.nio.file.FileSystems", cls), "getDefault", new Class[0]), (Object) null, new Object[0]), new Object[0])).contains("posix");
    }

    /* renamed from: f */
    private void m99193f(File file, Set<?> set) {
        C16708h.m99229c(this.f67611g, (Object) null, m99194g(file), set);
    }

    /* renamed from: g */
    private Object m99194g(File file) {
        return C16708h.m99229c(this.f67610f, file, new Object[0]);
    }

    /* renamed from: a */
    public void mo79608a(File file, C16704e eVar) {
        HashSet hashSet = new HashSet();
        m99190c(eVar.mo79617h(), hashSet, this.f67613i);
        m99190c(eVar.mo79617h(), hashSet, this.f67613i);
        m99190c(eVar.mo79618i(), hashSet, this.f67614j);
        m99190c(eVar.mo79616g(), hashSet, this.f67615k);
        m99190c(eVar.mo79611b(), hashSet, this.f67616l);
        m99190c(eVar.mo79612c(), hashSet, this.f67617m);
        m99190c(eVar.mo79610a(), hashSet, this.f67618n);
        m99190c(eVar.mo79614e(), hashSet, this.f67619o);
        m99190c(eVar.mo79615f(), hashSet, this.f67620p);
        m99190c(eVar.mo79613d(), hashSet, this.f67621q);
        m99193f(file, hashSet);
    }

    /* renamed from: b */
    public C16704e mo79609b(File file) {
        C16704e eVar = new C16704e();
        eVar.mo79619j(file.isDirectory());
        Set<?> d = m99191d(file);
        eVar.mo79627r(d.contains(this.f67613i));
        eVar.mo79628s(d.contains(this.f67614j));
        eVar.mo79626q(d.contains(this.f67615k));
        eVar.mo79621l(d.contains(this.f67616l));
        eVar.mo79622m(d.contains(this.f67617m));
        eVar.mo79620k(d.contains(this.f67618n));
        eVar.mo79624o(d.contains(this.f67619o));
        eVar.mo79625p(d.contains(this.f67620p));
        eVar.mo79623n(d.contains(this.f67621q));
        return eVar;
    }
}
