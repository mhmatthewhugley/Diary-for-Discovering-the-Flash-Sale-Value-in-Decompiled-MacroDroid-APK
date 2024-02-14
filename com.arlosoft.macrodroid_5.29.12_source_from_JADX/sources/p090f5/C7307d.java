package p090f5;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: f5.d */
/* compiled from: ExceptionCatchingInputStream */
public class C7307d extends InputStream {

    /* renamed from: d */
    private static final Queue<C7307d> f17881d = C7316k.m30210e(0);

    /* renamed from: a */
    private InputStream f17882a;

    /* renamed from: c */
    private IOException f17883c;

    C7307d() {
    }

    @NonNull
    /* renamed from: c */
    public static C7307d m30181c(@NonNull InputStream inputStream) {
        C7307d poll;
        Queue<C7307d> queue = f17881d;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new C7307d();
        }
        poll.mo37243f(inputStream);
        return poll;
    }

    public int available() throws IOException {
        return this.f17882a.available();
    }

    @Nullable
    /* renamed from: b */
    public IOException mo37240b() {
        return this.f17883c;
    }

    public void close() throws IOException {
        this.f17882a.close();
    }

    /* renamed from: e */
    public void mo37242e() {
        this.f17883c = null;
        this.f17882a = null;
        Queue<C7307d> queue = f17881d;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo37243f(@NonNull InputStream inputStream) {
        this.f17882a = inputStream;
    }

    public void mark(int i) {
        this.f17882a.mark(i);
    }

    public boolean markSupported() {
        return this.f17882a.markSupported();
    }

    public int read(byte[] bArr) {
        try {
            return this.f17882a.read(bArr);
        } catch (IOException e) {
            this.f17883c = e;
            return -1;
        }
    }

    public synchronized void reset() throws IOException {
        this.f17882a.reset();
    }

    public long skip(long j) {
        try {
            return this.f17882a.skip(j);
        } catch (IOException e) {
            this.f17883c = e;
            return 0;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f17882a.read(bArr, i, i2);
        } catch (IOException e) {
            this.f17883c = e;
            return -1;
        }
    }

    public int read() {
        try {
            return this.f17882a.read();
        } catch (IOException e) {
            this.f17883c = e;
            return -1;
        }
    }
}
