package com.google.android.play.core.assetpacks;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.play.core.internal.zzag;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzbh {

    /* renamed from: c */
    private static final zzag f51275c = new zzag("AssetPackStorage");

    /* renamed from: d */
    private static final long f51276d;

    /* renamed from: e */
    private static final long f51277e;

    /* renamed from: a */
    private final Context f51278a;

    /* renamed from: b */
    private final zzed f51279b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f51276d = timeUnit.toMillis(14);
        f51277e = timeUnit.toMillis(28);
    }

    zzbh(Context context, zzed zzed) {
        this.f51278a = context;
        this.f51279b = zzed;
    }

    /* renamed from: h */
    private static long m70554h(File file, boolean z) {
        if (!file.exists()) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        if (z && file.listFiles().length > 1) {
            f51275c.mo59809e("Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e) {
            f51275c.mo59807c(e, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    /* renamed from: i */
    private final File m70555i(String str) {
        return new File(m70558l(), str);
    }

    /* renamed from: j */
    private final File m70556j(String str, int i, long j) {
        return new File(mo59649x(str, i, j), "merge.tmp");
    }

    /* renamed from: k */
    private final File m70557k(String str, int i, long j) {
        return new File(new File(new File(m70559m(), str), String.valueOf(i)), String.valueOf(j));
    }

    /* renamed from: l */
    private final File m70558l() {
        return new File(this.f51278a.getFilesDir(), "assetpacks");
    }

    /* renamed from: m */
    private final File m70559m() {
        return new File(m70558l(), "_tmp");
    }

    /* renamed from: n */
    private final List m70560n() {
        ArrayList arrayList = new ArrayList();
        try {
            if (m70558l().exists()) {
                if (m70558l().listFiles() != null) {
                    for (File file : m70558l().listFiles()) {
                        if (!file.getCanonicalPath().equals(m70559m().getCanonicalPath())) {
                            arrayList.add(file);
                        }
                    }
                    return arrayList;
                }
            }
            return arrayList;
        } catch (IOException e) {
            f51275c.mo59806b("Could not process directory while scanning installed packs. %s", e);
        }
    }

    /* renamed from: o */
    private static void m70561o(File file) {
        if (file.listFiles() != null && file.listFiles().length > 1) {
            long h = m70554h(file, false);
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals(String.valueOf(h)) && !file2.getName().equals("stale.tmp")) {
                    m70562p(file2);
                }
            }
        }
    }

    /* renamed from: p */
    private static boolean m70562p(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File p : listFiles) {
                z &= m70562p(p);
            }
        }
        if (!file.delete()) {
            return false;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final File mo59622A(String str, int i, long j, String str2) {
        return new File(mo59624C(str, i, j, str2), "checkpoint_ext.dat");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final File mo59623B(String str, int i, long j, String str2) {
        return new File(mo59624C(str, i, j, str2), "checkpoint.dat");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final File mo59624C(String str, int i, long j, String str2) {
        return new File(mo59651z(str, i, j), str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final File mo59625D(String str, int i, long j, String str2) {
        return new File(new File(new File(m70557k(str, i, j), "_slices"), "_unverified"), str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final File mo59626E(String str, int i, long j, String str2) {
        return new File(new File(new File(m70557k(str, i, j), "_slices"), "_verified"), str2);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: F */
    public final String mo59627F(String str) throws IOException {
        int length;
        File file = new File(m70558l(), str);
        if (!file.exists()) {
            f51275c.mo59805a("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f51279b.mo59753a()));
        if (!file2.exists()) {
            f51275c.mo59805a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f51279b.mo59753a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            f51275c.mo59805a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f51279b.mo59753a()));
            return null;
        } else if (length <= 1) {
            return listFiles[0].getCanonicalPath();
        } else {
            f51275c.mo59806b("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f51279b.mo59753a()));
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final Map mo59628G() {
        HashMap hashMap = new HashMap();
        for (File name : m70560n()) {
            String name2 = name.getName();
            int h = (int) m70554h(m70555i(name2), true);
            long h2 = m70554h(mo59646u(name2, h), true);
            if (mo59647v(name2, h, h2).exists()) {
                hashMap.put(name2, Long.valueOf(h2));
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final Map mo59629H() {
        HashMap hashMap = new HashMap();
        for (String str : mo59630I().keySet()) {
            hashMap.put(str, Long.valueOf(mo59644s(str)));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final Map mo59630I() {
        HashMap hashMap = new HashMap();
        try {
            for (File file : m70560n()) {
                AssetPackLocation t = mo59645t(file.getName());
                if (t != null) {
                    hashMap.put(file.getName(), t);
                }
            }
        } catch (IOException e) {
            f51275c.mo59806b("Could not process directory while scanning installed packs: %s", e);
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo59631J() {
        for (File file : m70560n()) {
            if (file.listFiles() != null) {
                m70561o(file);
                long h = m70554h(file, false);
                if (((long) this.f51279b.mo59753a()) != h) {
                    try {
                        new File(new File(file, String.valueOf(h)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        f51275c.mo59806b("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File o : file.listFiles()) {
                    m70561o(o);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final void mo59632K() {
        if (m70559m().exists()) {
            for (File file : m70559m().listFiles()) {
                if (System.currentTimeMillis() - file.lastModified() > f51276d) {
                    m70562p(file);
                } else {
                    m70561o(file);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final void mo59633L() {
        for (File file : m70560n()) {
            if (file.listFiles() != null) {
                for (File file2 : file.listFiles()) {
                    File file3 = new File(file2, "stale.tmp");
                    if (file3.exists() && System.currentTimeMillis() - file3.lastModified() > f51277e) {
                        m70562p(file2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final void mo59634M() {
        m70562p(m70558l());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo59635a(String str, int i, long j, int i2) throws IOException {
        File j2 = m70556j(str, i, j);
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i2));
        j2.getParentFile().mkdirs();
        j2.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(j2);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo59636b(String str, int i, long j) {
        File i2 = m70555i(str);
        if (i2.exists()) {
            for (File file : i2.listFiles()) {
                if (!file.getName().equals(String.valueOf(i)) && !file.getName().equals("stale.tmp")) {
                    m70562p(file);
                } else if (file.getName().equals(String.valueOf(i))) {
                    for (File file2 : file.listFiles()) {
                        if (!file2.getName().equals(String.valueOf(j))) {
                            m70562p(file2);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo59637c(List list) {
        int a = this.f51279b.mo59753a();
        for (File file : m70560n()) {
            if (!list.contains(file.getName()) && m70554h(file, true) != ((long) a)) {
                m70562p(file);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo59638d(String str) {
        if (!m70555i(str).exists()) {
            return true;
        }
        return m70562p(m70555i(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo59639e(String str, int i, long j) {
        if (!m70557k(str, i, j).exists()) {
            return true;
        }
        return m70562p(m70557k(str, i, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo59640f(String str, int i, long j) {
        if (!mo59647v(str, i, j).exists()) {
            return true;
        }
        return m70562p(mo59647v(str, i, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo59641g(String str) {
        try {
            return mo59627F(str) != null;
        } catch (IOException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final int mo59642q(String str) {
        return (int) m70554h(m70555i(str), true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final int mo59643r(String str, int i, long j) throws IOException {
        File j2 = m70556j(str, i, j);
        if (!j2.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(j2);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    return Integer.parseInt(properties.getProperty("numberOfMerges"));
                } catch (NumberFormatException e) {
                    throw new zzck("Merge checkpoint file corrupt.", (Exception) e);
                }
            } else {
                throw new zzck("Merge checkpoint file corrupt.");
            }
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final long mo59644s(String str) {
        return m70554h(mo59646u(str, (int) m70554h(m70555i(str), true)), true);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: t */
    public final AssetPackLocation mo59645t(String str) throws IOException {
        String F = mo59627F(str);
        if (F == null) {
            return null;
        }
        File file = new File(F, "assets");
        if (file.isDirectory()) {
            return new zzbm(0, F, file.getCanonicalPath());
        }
        f51275c.mo59806b("Failed to find assets directory: %s", file);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final File mo59646u(String str, int i) {
        return new File(m70555i(str), String.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final File mo59647v(String str, int i, long j) {
        return new File(mo59646u(str, i), String.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final File mo59648w(String str, int i, long j) {
        return new File(mo59647v(str, i, j), "_metadata");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final File mo59649x(String str, int i, long j) {
        return new File(m70557k(str, i, j), "_packs");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final File mo59650y(String str, int i, long j) {
        return new File(mo59648w(str, i, j), "properties.dat");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final File mo59651z(String str, int i, long j) {
        return new File(new File(m70557k(str, i, j), "_slices"), "_metadata");
    }
}
