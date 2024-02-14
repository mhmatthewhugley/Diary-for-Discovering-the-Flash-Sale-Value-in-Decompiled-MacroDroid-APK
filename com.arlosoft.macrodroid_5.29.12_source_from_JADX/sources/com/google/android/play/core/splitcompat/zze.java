package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.play.core.internal.zzci;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zze {

    /* renamed from: a */
    private final long f51767a;

    /* renamed from: b */
    private final Context f51768b;

    /* renamed from: c */
    private File f51769c;

    public zze(Context context) throws PackageManager.NameNotFoundException {
        this.f51768b = context;
        this.f51767a = (long) context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    /* renamed from: l */
    public static void m71069l(File file) throws IOException {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File l : listFiles) {
                m71069l(l);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(String.format("Failed to delete '%s'", new Object[]{file.getAbsolutePath()}));
        }
    }

    /* renamed from: m */
    public static void m71070m(File file) {
        file.setWritable(false, true);
        file.setWritable(false, false);
    }

    /* renamed from: p */
    public static boolean m71071p(File file) {
        return !file.canWrite();
    }

    /* renamed from: q */
    private static File m71072q(File file, String str) throws IOException {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }

    /* renamed from: r */
    private final File m71073r() throws IOException {
        File file = new File(m71078w(), "native-libraries");
        m71076u(file);
        return file;
    }

    /* renamed from: s */
    private final File m71074s(String str) throws IOException {
        File q = m71072q(m71073r(), str);
        m71076u(q);
        return q;
    }

    /* renamed from: t */
    private final File m71075t() throws IOException {
        File file = new File(m71078w(), "verified-splits");
        m71076u(file);
        return file;
    }

    /* renamed from: u */
    private static File m71076u(File file) throws IOException {
        String str;
        if (!file.exists()) {
            file.mkdirs();
            if (file.isDirectory()) {
                return file;
            }
            String valueOf = String.valueOf(file.getAbsolutePath());
            if (valueOf.length() != 0) {
                str = "Unable to create directory: ".concat(valueOf);
            } else {
                str = new String("Unable to create directory: ");
            }
            throw new IOException(str);
        } else if (file.isDirectory()) {
            return file;
        } else {
            throw new IllegalArgumentException("File input must be directory when it exists.");
        }
    }

    /* renamed from: v */
    private final File m71077v() throws IOException {
        if (this.f51769c == null) {
            Context context = this.f51768b;
            if (context != null) {
                this.f51769c = context.getFilesDir();
            } else {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
        }
        File file = new File(this.f51769c, "splitcompat");
        m71076u(file);
        return file;
    }

    /* renamed from: w */
    private final File m71078w() throws IOException {
        File file = new File(m71077v(), Long.toString(this.f51767a));
        m71076u(file);
        return file;
    }

    /* renamed from: x */
    private static String m71079x(String str) {
        return String.valueOf(str).concat(".apk");
    }

    /* renamed from: a */
    public final File mo59941a(String str) throws IOException {
        File file = new File(m71078w(), "dex");
        m71076u(file);
        File q = m71072q(file, str);
        m71076u(q);
        return q;
    }

    /* renamed from: b */
    public final File mo59942b() throws IOException {
        File file = new File(m71078w(), "unverified-splits");
        m71076u(file);
        return file;
    }

    /* renamed from: c */
    public final File mo59943c(String str, String str2) throws IOException {
        return m71072q(m71074s(str), str2);
    }

    /* renamed from: d */
    public final File mo59944d() throws IOException {
        return new File(m71078w(), "lock.tmp");
    }

    /* renamed from: e */
    public final File mo59945e(String str) throws IOException {
        return m71072q(mo59942b(), m71079x(str));
    }

    /* renamed from: f */
    public final File mo59946f(File file) throws IOException {
        return m71072q(m71075t(), file.getName());
    }

    /* renamed from: g */
    public final File mo59947g(String str) throws IOException {
        return m71072q(m71075t(), m71079x(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final List mo59948h() throws IOException {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = m71073r().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file.getName());
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Set mo59949i(String str) throws IOException {
        HashSet hashSet = new HashSet();
        File[] listFiles = m71074s(str).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile()) {
                    hashSet.add(file);
                }
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final Set mo59950j() throws IOException {
        File t = m71075t();
        HashSet hashSet = new HashSet();
        File[] listFiles = t.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile() && file.getName().endsWith(".apk") && m71071p(file)) {
                    String name = file.getName();
                    hashSet.add(new zzb(file, name.substring(0, name.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    /* renamed from: k */
    public final void mo59951k() throws IOException {
        File v = m71077v();
        String[] list = v.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.f51767a))) {
                    File file = new File(v, str);
                    String obj = file.toString();
                    long j = this.f51767a;
                    StringBuilder sb = new StringBuilder(obj.length() + 118);
                    sb.append("FileStorage: removing directory for different version code (directory = ");
                    sb.append(obj);
                    sb.append(", current version code = ");
                    sb.append(j);
                    sb.append(")");
                    m71069l(file);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo59952n(String str) throws IOException {
        m71069l(m71074s(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo59953o(File file) throws IOException {
        zzci.m70930b(file.getParentFile().getParentFile().equals(m71073r()), "File to remove is not a native library");
        m71069l(file);
    }
}
