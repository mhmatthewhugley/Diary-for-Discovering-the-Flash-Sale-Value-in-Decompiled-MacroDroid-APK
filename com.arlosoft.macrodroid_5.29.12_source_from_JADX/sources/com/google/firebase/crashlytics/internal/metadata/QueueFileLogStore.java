package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.QueueFile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import org.apache.commons.p353io.IOUtils;

class QueueFileLogStore implements FileLogStore {

    /* renamed from: d */
    private static final Charset f5066d = Charset.forName("UTF-8");

    /* renamed from: a */
    private final File f5067a;

    /* renamed from: b */
    private final int f5068b;

    /* renamed from: c */
    private QueueFile f5069c;

    private static class LogBytes {

        /* renamed from: a */
        public final byte[] f5073a;

        /* renamed from: b */
        public final int f5074b;

        LogBytes(byte[] bArr, int i) {
            this.f5073a = bArr;
            this.f5074b = i;
        }
    }

    QueueFileLogStore(File file, int i) {
        this.f5067a = file;
        this.f5068b = i;
    }

    /* renamed from: f */
    private void m6879f(long j, String str) {
        if (this.f5069c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i = this.f5068b / 4;
                if (str.length() > i) {
                    str = "..." + str.substring(str.length() - i);
                }
                this.f5069c.mo23095g(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j), str.replaceAll("\r", " ").replaceAll(IOUtils.LINE_SEPARATOR_UNIX, " ")}).getBytes(f5066d));
                while (!this.f5069c.mo23099p() && this.f5069c.mo23093C() > this.f5068b) {
                    this.f5069c.mo23101y();
                }
            } catch (IOException e) {
                Logger.m6525f().mo22957e("There was a problem writing to the Crashlytics log.", e);
            }
        }
    }

    /* renamed from: g */
    private LogBytes m6880g() {
        if (!this.f5067a.exists()) {
            return null;
        }
        m6881h();
        QueueFile queueFile = this.f5069c;
        if (queueFile == null) {
            return null;
        }
        final int[] iArr = {0};
        final byte[] bArr = new byte[queueFile.mo23093C()];
        try {
            this.f5069c.mo23098m(new QueueFile.ElementReader() {
                /* renamed from: a */
                public void mo23102a(InputStream inputStream, int i) throws IOException {
                    try {
                        inputStream.read(bArr, iArr[0], i);
                        int[] iArr = iArr;
                        iArr[0] = iArr[0] + i;
                    } finally {
                        inputStream.close();
                    }
                }
            });
        } catch (IOException e) {
            Logger.m6525f().mo22957e("A problem occurred while reading the Crashlytics log file.", e);
        }
        return new LogBytes(bArr, iArr[0]);
    }

    /* renamed from: h */
    private void m6881h() {
        if (this.f5069c == null) {
            try {
                this.f5069c = new QueueFile(this.f5067a);
            } catch (IOException e) {
                Logger f = Logger.m6525f();
                f.mo22957e("Could not open log file: " + this.f5067a, e);
            }
        }
    }

    /* renamed from: a */
    public void mo23074a() {
        CommonUtils.m6582e(this.f5069c, "There was a problem closing the Crashlytics log file.");
        this.f5069c = null;
    }

    /* renamed from: b */
    public String mo23075b() {
        byte[] c = mo23076c();
        if (c != null) {
            return new String(c, f5066d);
        }
        return null;
    }

    /* renamed from: c */
    public byte[] mo23076c() {
        LogBytes g = m6880g();
        if (g == null) {
            return null;
        }
        int i = g.f5074b;
        byte[] bArr = new byte[i];
        System.arraycopy(g.f5073a, 0, bArr, 0, i);
        return bArr;
    }

    /* renamed from: d */
    public void mo23077d() {
        mo23074a();
        this.f5067a.delete();
    }

    /* renamed from: e */
    public void mo23078e(long j, String str) {
        m6881h();
        m6879f(j, str);
    }
}
