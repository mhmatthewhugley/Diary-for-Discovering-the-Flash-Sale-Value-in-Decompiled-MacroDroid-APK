package com.google.android.play.core.internal;

import android.util.Log;
import com.google.android.play.core.splitinstall.zzn;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzbf implements zzaz {
    zzbf() {
    }

    /* renamed from: c */
    static Object m70849c(ClassLoader classLoader) {
        return zzbw.m70885b(classLoader, "pathList", Object.class).mo59839a();
    }

    /* renamed from: d */
    static void m70850d(ClassLoader classLoader, Set set) {
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                String valueOf = String.valueOf(file.getParentFile().getAbsolutePath());
                if (valueOf.length() != 0) {
                    "Adding native library parent directory: ".concat(valueOf);
                }
                hashSet.add(file.getParentFile());
            }
            zzbu a = zzbw.m70884a(m70849c(classLoader), "nativeLibraryDirectories", File.class);
            hashSet.removeAll(Arrays.asList((File[]) a.mo59839a()));
            synchronized (zzn.class) {
                int size = hashSet.size();
                StringBuilder sb = new StringBuilder(30);
                sb.append("Adding directories ");
                sb.append(size);
                a.mo59838e(hashSet);
            }
        }
    }

    /* renamed from: e */
    static boolean m70851e(ClassLoader classLoader, File file, File file2, boolean z, zzbe zzbe, String str, zzbd zzbd) {
        ArrayList arrayList = new ArrayList();
        Object c = m70849c(classLoader);
        zzbu a = zzbw.m70884a(c, "dexElements", Object.class);
        List<Object> asList = Arrays.asList((Object[]) a.mo59839a());
        ArrayList arrayList2 = new ArrayList();
        for (Object b : asList) {
            arrayList2.add((File) zzbw.m70885b(b, str, File.class).mo59839a());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (z || zzbd.mo59835a(c, file2, file)) {
            a.mo59837d(Arrays.asList(zzbe.mo59834a(c, new ArrayList(Collections.singleton(file2)), file, arrayList)));
            if (arrayList.isEmpty()) {
                return true;
            }
            zzbt zzbt = new zzbt("DexPathList.makeDexElement failed");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Log.e("SplitCompat", "DexPathList.makeDexElement failed", (IOException) arrayList.get(i));
            }
            zzbw.m70884a(c, "dexElementsSuppressedExceptions", IOException.class).mo59837d(arrayList);
            throw zzbt;
        }
        String valueOf = String.valueOf(file2.getPath());
        Log.w("SplitCompat", valueOf.length() != 0 ? "Should be optimized ".concat(valueOf) : new String("Should be optimized "));
        return false;
    }

    /* renamed from: a */
    public final boolean mo59830a(ClassLoader classLoader, File file, File file2, boolean z) {
        return m70851e(classLoader, file, file2, z, new zzbb(), "zip", new zzbc());
    }

    /* renamed from: b */
    public final void mo59831b(ClassLoader classLoader, Set set) {
        m70850d(classLoader, set);
    }
}
