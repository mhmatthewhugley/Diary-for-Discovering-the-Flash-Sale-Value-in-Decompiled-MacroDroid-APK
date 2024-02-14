package com.google.firebase.crashlytics.internal.persistence;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.ImmutableList;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import p002a6.C0015a;
import p002a6.C0016b;
import p002a6.C0017c;
import p002a6.C0018d;

public class CrashlyticsReportPersistence {

    /* renamed from: d */
    private static final Charset f5437d = Charset.forName("UTF-8");

    /* renamed from: e */
    private static final int f5438e = 15;

    /* renamed from: f */
    private static final CrashlyticsReportJsonTransform f5439f = new CrashlyticsReportJsonTransform();

    /* renamed from: g */
    private static final Comparator<? super File> f5440g = C0017c.f38a;

    /* renamed from: h */
    private static final FilenameFilter f5441h = C0016b.f37a;

    /* renamed from: a */
    private final AtomicInteger f5442a = new AtomicInteger(0);

    /* renamed from: b */
    private final FileStore f5443b;
    @NonNull

    /* renamed from: c */
    private final SettingsProvider f5444c;

    public CrashlyticsReportPersistence(FileStore fileStore, SettingsProvider settingsProvider) {
        this.f5443b = fileStore;
        this.f5444c = settingsProvider;
    }

    @NonNull
    /* renamed from: A */
    private static String m7497A(@NonNull File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f5437d);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        throw th;
    }

    /* renamed from: B */
    private void m7498B(@NonNull File file, @NonNull CrashlyticsReport.FilesPayload filesPayload, @NonNull String str) {
        try {
            CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = f5439f;
            m7502F(this.f5443b.mo23503g(str), crashlyticsReportJsonTransform.mo23480E(crashlyticsReportJsonTransform.mo23479D(m7497A(file)).mo23446m(filesPayload)));
        } catch (IOException e) {
            Logger f = Logger.m6525f();
            f.mo22963l("Could not synthesize final native report file for " + file, e);
        }
    }

    /* renamed from: C */
    private void m7499C(String str, long j) {
        boolean z;
        List<File> p = this.f5443b.mo23511p(str, f5441h);
        if (p.isEmpty()) {
            Logger f = Logger.m6525f();
            f.mo22960i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(p);
        ArrayList arrayList = new ArrayList();
        Iterator<File> it = p.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                File next = it.next();
                try {
                    arrayList.add(f5439f.mo23481g(m7497A(next)));
                    if (z || m7516s(next.getName())) {
                        z = true;
                    }
                } catch (IOException e) {
                    Logger f2 = Logger.m6525f();
                    f2.mo22963l("Could not add event to report for " + next, e);
                }
            }
        }
        if (arrayList.isEmpty()) {
            Logger f3 = Logger.m6525f();
            f3.mo22962k("Could not parse event files for session " + str);
            return;
        }
        String g = UserMetadata.m6891g(str, this.f5443b);
        m7500D(this.f5443b.mo23510o(str, "report"), arrayList, j, z, g);
    }

    /* renamed from: D */
    private void m7500D(@NonNull File file, @NonNull List<CrashlyticsReport.Session.Event> list, long j, boolean z, @Nullable String str) {
        File file2;
        try {
            CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = f5439f;
            CrashlyticsReport l = crashlyticsReportJsonTransform.mo23479D(m7497A(file)).mo23447n(j, z, str).mo23445l(ImmutableList.m7424c(list));
            CrashlyticsReport.Session j2 = l.mo23142j();
            if (j2 != null) {
                if (z) {
                    file2 = this.f5443b.mo23506j(j2.mo23205h());
                } else {
                    file2 = this.f5443b.mo23508l(j2.mo23205h());
                }
                m7502F(file2, crashlyticsReportJsonTransform.mo23480E(l));
            }
        } catch (IOException e) {
            Logger f = Logger.m6525f();
            f.mo22963l("Could not synthesize final report file for " + file, e);
        }
    }

    /* renamed from: E */
    private int m7501E(String str, int i) {
        List<File> p = this.f5443b.mo23511p(str, C0015a.f36a);
        Collections.sort(p, C0018d.f39a);
        return m7509f(p, i);
    }

    /* renamed from: F */
    private static void m7502F(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f5437d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: G */
    private static void m7503G(File file, String str, long j) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f5437d);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(m7511h(j));
            outputStreamWriter.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: e */
    private SortedSet<String> m7508e(@Nullable String str) {
        this.f5443b.mo23498b();
        SortedSet<String> p = mo23492p();
        if (str != null) {
            p.remove(str);
        }
        if (p.size() <= 8) {
            return p;
        }
        while (p.size() > 8) {
            String last = p.last();
            Logger f = Logger.m6525f();
            f.mo22954b("Removing session over cap: " + last);
            this.f5443b.mo23499c(last);
            p.remove(last);
        }
        return p;
    }

    /* renamed from: f */
    private static int m7509f(List<File> list, int i) {
        int size = list.size();
        for (File next : list) {
            if (size <= i) {
                return size;
            }
            FileStore.m7534s(next);
            size--;
        }
        return size;
    }

    /* renamed from: g */
    private void m7510g() {
        int i = this.f5444c.mo23526b().f5480a.f5491b;
        List<File> n = m7514n();
        int size = n.size();
        if (size > i) {
            for (File delete : n.subList(i, size)) {
                delete.delete();
            }
        }
    }

    /* renamed from: h */
    private static long m7511h(long j) {
        return j * 1000;
    }

    /* renamed from: j */
    private void m7512j(List<File> list) {
        for (File delete : list) {
            delete.delete();
        }
    }

    @NonNull
    /* renamed from: m */
    private static String m7513m(int i, boolean z) {
        String format = String.format(Locale.US, "%010d", new Object[]{Integer.valueOf(i)});
        String str = z ? "_" : "";
        return NotificationCompat.CATEGORY_EVENT + format + str;
    }

    /* renamed from: n */
    private List<File> m7514n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f5443b.mo23507k());
        arrayList.addAll(this.f5443b.mo23504h());
        Comparator<? super File> comparator = f5440g;
        Collections.sort(arrayList, comparator);
        List<File> m = this.f5443b.mo23509m();
        Collections.sort(m, comparator);
        arrayList.addAll(m);
        return arrayList;
    }

    @NonNull
    /* renamed from: o */
    private static String m7515o(@NonNull String str) {
        return str.substring(0, f5438e);
    }

    /* renamed from: s */
    private static boolean m7516s(@NonNull String str) {
        return str.startsWith(NotificationCompat.CATEGORY_EVENT) && str.endsWith("_");
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static boolean m7517t(@NonNull File file, @NonNull String str) {
        return str.startsWith(NotificationCompat.CATEGORY_EVENT) && !str.endsWith("_");
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static int m7520x(@NonNull File file, @NonNull File file2) {
        return m7515o(file.getName()).compareTo(m7515o(file2.getName()));
    }

    /* renamed from: i */
    public void mo23489i() {
        m7512j(this.f5443b.mo23509m());
        m7512j(this.f5443b.mo23507k());
        m7512j(this.f5443b.mo23504h());
    }

    /* renamed from: k */
    public void mo23490k(@Nullable String str, long j) {
        for (String next : m7508e(str)) {
            Logger f = Logger.m6525f();
            f.mo22960i("Finalizing report for session " + next);
            m7499C(next, j);
            this.f5443b.mo23499c(next);
        }
        m7510g();
    }

    /* renamed from: l */
    public void mo23491l(String str, CrashlyticsReport.FilesPayload filesPayload) {
        File o = this.f5443b.mo23510o(str, "report");
        Logger f = Logger.m6525f();
        f.mo22954b("Writing native session report for " + str + " to file: " + o);
        m7498B(o, filesPayload, str);
    }

    /* renamed from: p */
    public SortedSet<String> mo23492p() {
        return new TreeSet(this.f5443b.mo23500d()).descendingSet();
    }

    /* renamed from: q */
    public long mo23493q(String str) {
        return this.f5443b.mo23510o(str, "start-time").lastModified();
    }

    /* renamed from: r */
    public boolean mo23494r() {
        return !this.f5443b.mo23509m().isEmpty() || !this.f5443b.mo23507k().isEmpty() || !this.f5443b.mo23504h().isEmpty();
    }

    @NonNull
    /* renamed from: w */
    public List<CrashlyticsReportWithSessionId> mo23495w() {
        List<File> n = m7514n();
        ArrayList arrayList = new ArrayList();
        for (File next : n) {
            try {
                arrayList.add(CrashlyticsReportWithSessionId.m6724a(f5439f.mo23479D(m7497A(next)), next.getName(), next));
            } catch (IOException e) {
                Logger f = Logger.m6525f();
                f.mo22963l("Could not load report file " + next + "; deleting", e);
                next.delete();
            }
        }
        return arrayList;
    }

    /* renamed from: y */
    public void mo23496y(@NonNull CrashlyticsReport.Session.Event event, @NonNull String str, boolean z) {
        int i = this.f5444c.mo23526b().f5480a.f5490a;
        try {
            m7502F(this.f5443b.mo23510o(str, m7513m(this.f5442a.getAndIncrement(), z)), f5439f.mo23482h(event));
        } catch (IOException e) {
            Logger f = Logger.m6525f();
            f.mo22963l("Could not persist event for session " + str, e);
        }
        m7501E(str, i);
    }

    /* renamed from: z */
    public void mo23497z(@NonNull CrashlyticsReport crashlyticsReport) {
        CrashlyticsReport.Session j = crashlyticsReport.mo23142j();
        if (j == null) {
            Logger.m6525f().mo22954b("Could not get session for report");
            return;
        }
        String h = j.mo23205h();
        try {
            m7502F(this.f5443b.mo23510o(h, "report"), f5439f.mo23480E(crashlyticsReport));
            m7503G(this.f5443b.mo23510o(h, "start-time"), "", j.mo23208k());
        } catch (IOException e) {
            Logger f = Logger.m6525f();
            f.mo22955c("Could not persist report for session " + h, e);
        }
    }
}
