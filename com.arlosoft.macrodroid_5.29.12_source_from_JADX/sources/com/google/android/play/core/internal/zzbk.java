package com.google.android.play.core.internal;

import com.google.android.play.core.splitinstall.zzn;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzbk implements zzaz {
    zzbk() {
    }

    /* renamed from: c */
    public static void m70859c(ClassLoader classLoader, Set set, zzbj zzbj) {
        Class<zzn> cls = zzn.class;
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(((File) it.next()).getParentFile());
            }
            Object c = zzbf.m70849c(classLoader);
            zzbv b = zzbw.m70885b(c, "nativeLibraryDirectories", List.class);
            synchronized (cls) {
                ArrayList arrayList = new ArrayList((Collection) b.mo59839a());
                hashSet.removeAll(arrayList);
                arrayList.addAll(hashSet);
                b.mo59841c(arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            Object[] a = zzbj.mo59836a(c, new ArrayList(hashSet), (File) null, arrayList2);
            if (!arrayList2.isEmpty()) {
                zzbt zzbt = new zzbt("Error in makePathElements");
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    IOException iOException = (IOException) arrayList2.get(i);
                }
                throw zzbt;
            }
            synchronized (cls) {
                zzbw.m70884a(c, "nativeLibraryPathElements", Object.class).mo59838e(Arrays.asList(a));
            }
        }
    }

    /* renamed from: d */
    public static boolean m70860d(ClassLoader classLoader, File file, File file2, boolean z, String str) {
        return zzbf.m70851e(classLoader, file, file2, z, new zzbh(), "zip", new zzbc());
    }

    /* renamed from: a */
    public final boolean mo59830a(ClassLoader classLoader, File file, File file2, boolean z) {
        return m70860d(classLoader, file, file2, z, "zip");
    }

    /* renamed from: b */
    public final void mo59831b(ClassLoader classLoader, Set set) {
        m70859c(classLoader, set, new zzbi());
    }
}
