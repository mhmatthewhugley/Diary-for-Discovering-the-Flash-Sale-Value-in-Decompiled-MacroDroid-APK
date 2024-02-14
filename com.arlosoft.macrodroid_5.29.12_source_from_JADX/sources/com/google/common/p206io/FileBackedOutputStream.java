package com.google.common.p206io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
@Beta
/* renamed from: com.google.common.io.FileBackedOutputStream */
public final class FileBackedOutputStream extends OutputStream {

    /* renamed from: a */
    private final int f52988a;

    /* renamed from: c */
    private final boolean f52989c;

    /* renamed from: d */
    private final File f52990d;
    @GuardedBy

    /* renamed from: f */
    private OutputStream f52991f;
    @GuardedBy

    /* renamed from: g */
    private MemoryOutput f52992g;
    @GuardedBy

    /* renamed from: o */
    private File f52993o;

    /* renamed from: com.google.common.io.FileBackedOutputStream$1 */
    class C108991 extends ByteSource {

        /* renamed from: a */
        final /* synthetic */ FileBackedOutputStream f52994a;

        /* renamed from: a */
        public InputStream mo60979a() throws IOException {
            return this.f52994a.m73437c();
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            try {
                this.f52994a.mo61091e();
            } catch (Throwable th) {
                th.printStackTrace(System.err);
            }
        }
    }

    /* renamed from: com.google.common.io.FileBackedOutputStream$2 */
    class C109002 extends ByteSource {

        /* renamed from: a */
        final /* synthetic */ FileBackedOutputStream f52995a;

        /* renamed from: a */
        public InputStream mo60979a() throws IOException {
            return this.f52995a.m73437c();
        }
    }

    /* renamed from: com.google.common.io.FileBackedOutputStream$MemoryOutput */
    private static class MemoryOutput extends ByteArrayOutputStream {
        private MemoryOutput() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public byte[] mo61097b() {
            return this.buf;
        }

        /* access modifiers changed from: package-private */
        public int getCount() {
            return this.count;
        }

        /* synthetic */ MemoryOutput(C108991 r1) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public synchronized InputStream m73437c() throws IOException {
        if (this.f52993o != null) {
            return new FileInputStream(this.f52993o);
        }
        Objects.requireNonNull(this.f52992g);
        return new ByteArrayInputStream(this.f52992g.mo61097b(), 0, this.f52992g.getCount());
    }

    @GuardedBy
    /* renamed from: f */
    private void m73438f(int i) throws IOException {
        MemoryOutput memoryOutput = this.f52992g;
        if (memoryOutput != null && memoryOutput.getCount() + i > this.f52988a) {
            File createTempFile = File.createTempFile("FileBackedOutputStream", (String) null, this.f52990d);
            if (this.f52989c) {
                createTempFile.deleteOnExit();
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                fileOutputStream.write(this.f52992g.mo61097b(), 0, this.f52992g.getCount());
                fileOutputStream.flush();
                this.f52991f = fileOutputStream;
                this.f52993o = createTempFile;
                this.f52992g = null;
            } catch (IOException e) {
                createTempFile.delete();
                throw e;
            }
        }
    }

    public synchronized void close() throws IOException {
        this.f52991f.close();
    }

    /* renamed from: e */
    public synchronized void mo61091e() throws IOException {
        try {
            close();
            MemoryOutput memoryOutput = this.f52992g;
            if (memoryOutput == null) {
                this.f52992g = new MemoryOutput((C108991) null);
            } else {
                memoryOutput.reset();
            }
            this.f52991f = this.f52992g;
            File file = this.f52993o;
            if (file != null) {
                this.f52993o = null;
                if (!file.delete()) {
                    String valueOf = String.valueOf(file);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                    sb.append("Could not delete: ");
                    sb.append(valueOf);
                    throw new IOException(sb.toString());
                }
            }
        } catch (Throwable th) {
            if (this.f52992g == null) {
                this.f52992g = new MemoryOutput((C108991) null);
            } else {
                this.f52992g.reset();
            }
            this.f52991f = this.f52992g;
            File file2 = this.f52993o;
            if (file2 != null) {
                this.f52993o = null;
                if (!file2.delete()) {
                    String valueOf2 = String.valueOf(file2);
                    StringBuilder sb2 = new StringBuilder(valueOf2.length() + 18);
                    sb2.append("Could not delete: ");
                    sb2.append(valueOf2);
                    throw new IOException(sb2.toString());
                }
            }
            throw th;
        }
    }

    public synchronized void flush() throws IOException {
        this.f52991f.flush();
    }

    public synchronized void write(int i) throws IOException {
        m73438f(1);
        this.f52991f.write(i);
    }

    public synchronized void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public synchronized void write(byte[] bArr, int i, int i2) throws IOException {
        m73438f(i2);
        this.f52991f.write(bArr, i, i2);
    }
}
