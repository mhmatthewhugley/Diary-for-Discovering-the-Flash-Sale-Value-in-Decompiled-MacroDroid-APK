package p428we;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipException;

/* renamed from: we.b */
/* compiled from: ExtraFieldUtils */
public class C16844b {

    /* renamed from: a */
    private static final Map<C16848f, Class<?>> f68027a = new ConcurrentHashMap();

    static {
        m99843d(C16843a.class);
    }

    /* renamed from: a */
    public static C16846d m99840a(C16848f fVar) throws InstantiationException, IllegalAccessException {
        Class cls = f68027a.get(fVar);
        if (cls != null) {
            return (C16846d) cls.newInstance();
        }
        C16845c cVar = new C16845c();
        cVar.mo79972f(fVar);
        return cVar;
    }

    /* renamed from: b */
    public static byte[] m99841b(List<C16846d> list) {
        int size = list.size() * 4;
        for (C16846d c : list) {
            size += c.mo79960c().mo79980c();
        }
        byte[] bArr = new byte[size];
        int i = 0;
        for (C16846d next : list) {
            System.arraycopy(next.mo79958a().mo79979a(), 0, bArr, i, 2);
            System.arraycopy(next.mo79960c().mo79979a(), 0, bArr, i + 2, 2);
            byte[] b = next.mo79959b();
            System.arraycopy(b, 0, bArr, i + 4, b.length);
            i += b.length + 4;
        }
        return bArr;
    }

    /* renamed from: c */
    public static List<C16846d> m99842c(byte[] bArr) throws ZipException {
        ArrayList arrayList = new ArrayList();
        if (bArr == null) {
            return arrayList;
        }
        int i = 0;
        while (i <= bArr.length - 4) {
            C16848f fVar = new C16848f(bArr, i);
            int c = new C16848f(bArr, i + 2).mo79980c();
            int i2 = i + 4;
            if (i2 + c <= bArr.length) {
                try {
                    C16846d a = m99840a(fVar);
                    a.mo79962d(bArr, i2, c);
                    arrayList.add(a);
                    i += c + 4;
                } catch (InstantiationException e) {
                    throw new ZipException(e.getMessage());
                } catch (IllegalAccessException e2) {
                    throw new ZipException(e2.getMessage());
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("bad extra field starting at ");
                sb.append(i);
                sb.append(".  Block length of ");
                sb.append(c);
                sb.append(" bytes exceeds remaining data of ");
                sb.append((bArr.length - i) - 4);
                sb.append(" bytes.");
                throw new ZipException(sb.toString());
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static void m99843d(Class<?> cls) {
        try {
            f68027a.put(((C16846d) cls.newInstance()).mo79958a(), cls);
        } catch (ClassCastException unused) {
            throw new RuntimeException(cls + " doesn't implement ZipExtraField");
        } catch (InstantiationException unused2) {
            throw new RuntimeException(cls + " is not a concrete class");
        } catch (IllegalAccessException unused3) {
            throw new RuntimeException(cls + "'s no-arg constructor is not public");
        }
    }
}
