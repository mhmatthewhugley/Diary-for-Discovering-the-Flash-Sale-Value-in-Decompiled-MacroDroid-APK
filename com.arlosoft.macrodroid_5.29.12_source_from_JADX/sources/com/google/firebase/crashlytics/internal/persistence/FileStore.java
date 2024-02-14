package com.google.firebase.crashlytics.internal.persistence;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.crashlytics.internal.Logger;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileStore {

    /* renamed from: a */
    private final File f5445a;

    /* renamed from: b */
    private final File f5446b;

    /* renamed from: c */
    private final File f5447c;

    /* renamed from: d */
    private final File f5448d;

    /* renamed from: e */
    private final File f5449e;

    /* renamed from: f */
    private final File f5450f;

    public FileStore(Context context) {
        String str;
        File filesDir = context.getFilesDir();
        this.f5445a = filesDir;
        if (m7537v()) {
            str = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator + m7536u(Application.getProcessName());
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File q = m7532q(new File(filesDir, str));
        this.f5446b = q;
        this.f5447c = m7532q(new File(q, "open-sessions"));
        this.f5448d = m7532q(new File(q, "reports"));
        this.f5449e = m7532q(new File(q, "priority-reports"));
        this.f5450f = m7532q(new File(q, "native-reports"));
    }

    /* renamed from: a */
    private void m7530a(File file) {
        if (file.exists() && m7534s(file)) {
            Logger f = Logger.m6525f();
            f.mo22954b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    /* renamed from: n */
    private File m7531n(String str) {
        return m7533r(new File(this.f5447c, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        return r4;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.io.File m7532q(java.io.File r4) {
        /*
            java.lang.Class<com.google.firebase.crashlytics.internal.persistence.FileStore> r0 = com.google.firebase.crashlytics.internal.persistence.FileStore.class
            monitor-enter(r0)
            boolean r1 = r4.exists()     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0031
            boolean r1 = r4.isDirectory()     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)
            return r4
        L_0x0011:
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.m6525f()     // Catch:{ all -> 0x0051 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r2.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "Unexpected non-directory file: "
            r2.append(r3)     // Catch:{ all -> 0x0051 }
            r2.append(r4)     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "; deleting file and creating new directory."
            r2.append(r3)     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0051 }
            r1.mo22954b(r2)     // Catch:{ all -> 0x0051 }
            r4.delete()     // Catch:{ all -> 0x0051 }
        L_0x0031:
            boolean r1 = r4.mkdirs()     // Catch:{ all -> 0x0051 }
            if (r1 != 0) goto L_0x004f
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.m6525f()     // Catch:{ all -> 0x0051 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r2.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "Could not create Crashlytics-specific directory: "
            r2.append(r3)     // Catch:{ all -> 0x0051 }
            r2.append(r4)     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0051 }
            r1.mo22956d(r2)     // Catch:{ all -> 0x0051 }
        L_0x004f:
            monitor-exit(r0)
            return r4
        L_0x0051:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.persistence.FileStore.m7532q(java.io.File):java.io.File");
    }

    /* renamed from: r */
    private static File m7533r(File file) {
        file.mkdirs();
        return file;
    }

    /* renamed from: s */
    static boolean m7534s(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File s : listFiles) {
                m7534s(s);
            }
        }
        return file.delete();
    }

    /* renamed from: t */
    private static <T> List<T> m7535t(@Nullable T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    @VisibleForTesting
    /* renamed from: u */
    static String m7536u(String str) {
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    /* renamed from: v */
    private static boolean m7537v() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* renamed from: b */
    public void mo23498b() {
        m7530a(new File(this.f5445a, ".com.google.firebase.crashlytics"));
        m7530a(new File(this.f5445a, ".com.google.firebase.crashlytics-ndk"));
        if (m7537v()) {
            m7530a(new File(this.f5445a, ".com.google.firebase.crashlytics.files.v1"));
        }
    }

    /* renamed from: c */
    public boolean mo23499c(String str) {
        return m7534s(new File(this.f5447c, str));
    }

    /* renamed from: d */
    public List<String> mo23500d() {
        return m7535t(this.f5447c.list());
    }

    /* renamed from: e */
    public File mo23501e(String str) {
        return new File(this.f5446b, str);
    }

    /* renamed from: f */
    public List<File> mo23502f(FilenameFilter filenameFilter) {
        return m7535t(this.f5446b.listFiles(filenameFilter));
    }

    /* renamed from: g */
    public File mo23503g(String str) {
        return new File(this.f5450f, str);
    }

    /* renamed from: h */
    public List<File> mo23504h() {
        return m7535t(this.f5450f.listFiles());
    }

    /* renamed from: i */
    public File mo23505i(String str) {
        return m7533r(new File(m7531n(str), "native"));
    }

    /* renamed from: j */
    public File mo23506j(String str) {
        return new File(this.f5449e, str);
    }

    /* renamed from: k */
    public List<File> mo23507k() {
        return m7535t(this.f5449e.listFiles());
    }

    /* renamed from: l */
    public File mo23508l(String str) {
        return new File(this.f5448d, str);
    }

    /* renamed from: m */
    public List<File> mo23509m() {
        return m7535t(this.f5448d.listFiles());
    }

    /* renamed from: o */
    public File mo23510o(String str, String str2) {
        return new File(m7531n(str), str2);
    }

    /* renamed from: p */
    public List<File> mo23511p(String str, FilenameFilter filenameFilter) {
        return m7535t(m7531n(str).listFiles(filenameFilter));
    }
}
