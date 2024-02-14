package com.google.firebase.storage;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.firebase.storage.internal.ExponentialBackoffSender;
import com.google.firebase.storage.network.GetNetworkRequest;
import com.google.firebase.storage.network.NetworkRequest;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

public class StreamDownloadTask extends StorageTask<TaskSnapshot> {

    /* renamed from: l */
    private StorageReference f55405l;

    /* renamed from: m */
    private ExponentialBackoffSender f55406m;

    /* renamed from: n */
    private volatile Exception f55407n;

    /* renamed from: o */
    private volatile int f55408o;

    /* renamed from: p */
    private StreamProcessor f55409p;

    /* renamed from: q */
    private long f55410q;

    /* renamed from: r */
    private long f55411r;

    /* renamed from: s */
    private long f55412s;

    /* renamed from: t */
    private InputStream f55413t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public NetworkRequest f55414u;

    /* renamed from: v */
    private String f55415v;

    public interface StreamProcessor {
        /* renamed from: a */
        void mo63644a(@NonNull TaskSnapshot taskSnapshot, @NonNull InputStream inputStream) throws IOException;
    }

    public class TaskSnapshot extends StorageTask<TaskSnapshot>.SnapshotBase {

        /* renamed from: c */
        private final long f55424c;

        TaskSnapshot(Exception exc, long j) {
            super(exc);
            this.f55424c = j;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public InputStream m77526A0() throws Exception {
        String str;
        this.f55406m.mo63716c();
        NetworkRequest networkRequest = this.f55414u;
        if (networkRequest != null) {
            networkRequest.mo63729D();
        }
        GetNetworkRequest getNetworkRequest = new GetNetworkRequest(this.f55405l.mo63639m(), this.f55405l.mo63632g(), this.f55411r);
        this.f55414u = getNetworkRequest;
        boolean z = false;
        this.f55406m.mo63718e(getNetworkRequest, false);
        this.f55408o = this.f55414u.mo63741p();
        this.f55407n = this.f55414u.mo63734f() != null ? this.f55414u.mo63734f() : this.f55407n;
        if (m77527B0(this.f55408o) && this.f55407n == null && mo63656S() == 4) {
            z = true;
        }
        if (z) {
            String r = this.f55414u.mo63743r("ETag");
            if (TextUtils.isEmpty(r) || (str = this.f55415v) == null || str.equals(r)) {
                this.f55415v = r;
                this.f55410q = ((long) this.f55414u.mo63744s()) + this.f55411r;
                return this.f55414u.mo63746u();
            }
            this.f55408o = 409;
            throw new IOException("The ETag on the server changed.");
        }
        throw new IOException("Could not open resulting stream.");
    }

    /* renamed from: B0 */
    private boolean m77527B0(int i) {
        return i == 308 || (i >= 200 && i < 300);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C0 */
    public void mo63680C0(long j) {
        long j2 = this.f55411r + j;
        this.f55411r = j2;
        if (this.f55412s + 262144 > j2) {
            return;
        }
        if (mo63656S() == 4) {
            mo63669v0(4, false);
        } else {
            this.f55412s = this.f55411r;
        }
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: D0 */
    public TaskSnapshot mo63589t0() {
        return new TaskSnapshot(StorageException.m77381e(this.f55407n, this.f55408o), this.f55412s);
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: Y */
    public StorageReference mo63585Y() {
        return this.f55405l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public void mo63586j0() {
        this.f55406m.mo63714a();
        this.f55407n = StorageException.m77379c(Status.f3134B);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public void mo63664m0() {
        this.f55412s = this.f55411r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public void mo63587q0() {
        int i = 64;
        if (this.f55407n != null) {
            mo63669v0(64, false);
        } else if (mo63669v0(4, false)) {
            StreamProgressWrapper streamProgressWrapper = new StreamProgressWrapper(new Callable<InputStream>() {
                /* renamed from: a */
                public InputStream call() throws Exception {
                    return StreamDownloadTask.this.m77526A0();
                }
            }, this);
            this.f55413t = new BufferedInputStream(streamProgressWrapper);
            try {
                boolean unused = streamProgressWrapper.m77543e();
                StreamProcessor streamProcessor = this.f55409p;
                if (streamProcessor != null) {
                    try {
                        streamProcessor.mo63644a((TaskSnapshot) mo63668s0(), this.f55413t);
                    } catch (Exception e) {
                        Log.w("StreamDownloadTask", "Exception occurred calling doInBackground.", e);
                        this.f55407n = e;
                    }
                }
            } catch (IOException e2) {
                this.f55407n = e2;
            }
            if (this.f55413t == null) {
                this.f55414u.mo63729D();
                this.f55414u = null;
            }
            if (this.f55407n == null && mo63656S() == 4) {
                mo63669v0(4, false);
                mo63669v0(128, false);
                return;
            }
            if (mo63656S() == 32) {
                i = 256;
            }
            if (!mo63669v0(i, false)) {
                Log.w("StreamDownloadTask", "Unable to change download task to final state from " + mo63656S());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r0 */
    public void mo63588r0() {
        StorageTaskScheduler.m77520b().mo63677e(mo63659V());
    }

    static class StreamProgressWrapper extends InputStream {
        @Nullable

        /* renamed from: a */
        private StreamDownloadTask f55417a;
        @Nullable

        /* renamed from: c */
        private InputStream f55418c;

        /* renamed from: d */
        private Callable<InputStream> f55419d;

        /* renamed from: f */
        private IOException f55420f;

        /* renamed from: g */
        private long f55421g;

        /* renamed from: o */
        private long f55422o;

        /* renamed from: p */
        private boolean f55423p;

        StreamProgressWrapper(@NonNull Callable<InputStream> callable, @Nullable StreamDownloadTask streamDownloadTask) {
            this.f55417a = streamDownloadTask;
            this.f55419d = callable;
        }

        /* renamed from: c */
        private void m77542c() throws IOException {
            StreamDownloadTask streamDownloadTask = this.f55417a;
            if (streamDownloadTask != null && streamDownloadTask.mo63656S() == 32) {
                throw new CancelException();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public boolean m77543e() throws IOException {
            m77542c();
            if (this.f55420f != null) {
                try {
                    InputStream inputStream = this.f55418c;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException unused) {
                }
                this.f55418c = null;
                if (this.f55422o == this.f55421g) {
                    Log.i("StreamDownloadTask", "Encountered exception during stream operation. Aborting.", this.f55420f);
                    return false;
                }
                Log.i("StreamDownloadTask", "Encountered exception during stream operation. Retrying at " + this.f55421g, this.f55420f);
                this.f55422o = this.f55421g;
                this.f55420f = null;
            }
            if (this.f55423p) {
                throw new IOException("Can't perform operation on closed stream");
            } else if (this.f55418c != null) {
                return true;
            } else {
                try {
                    this.f55418c = this.f55419d.call();
                    return true;
                } catch (Exception e) {
                    if (e instanceof IOException) {
                        throw ((IOException) e);
                    }
                    throw new IOException("Unable to open stream", e);
                }
            }
        }

        /* renamed from: f */
        private void m77544f(long j) {
            StreamDownloadTask streamDownloadTask = this.f55417a;
            if (streamDownloadTask != null) {
                streamDownloadTask.mo63680C0(j);
            }
            this.f55421g += j;
        }

        public int available() throws IOException {
            while (m77543e()) {
                try {
                    return this.f55418c.available();
                } catch (IOException e) {
                    this.f55420f = e;
                }
            }
            throw this.f55420f;
        }

        public void close() throws IOException {
            InputStream inputStream = this.f55418c;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f55423p = true;
            StreamDownloadTask streamDownloadTask = this.f55417a;
            if (!(streamDownloadTask == null || streamDownloadTask.f55414u == null)) {
                this.f55417a.f55414u.mo63729D();
                NetworkRequest unused = this.f55417a.f55414u = null;
            }
            m77542c();
        }

        public void mark(int i) {
        }

        public boolean markSupported() {
            return false;
        }

        public int read() throws IOException {
            while (m77543e()) {
                try {
                    int read = this.f55418c.read();
                    if (read != -1) {
                        m77544f(1);
                    }
                    return read;
                } catch (IOException e) {
                    this.f55420f = e;
                }
            }
            throw this.f55420f;
        }

        public long skip(long j) throws IOException {
            long j2 = 0;
            while (m77543e()) {
                while (j > 262144) {
                    try {
                        long skip = this.f55418c.skip(262144);
                        if (skip >= 0) {
                            j2 += skip;
                            j -= skip;
                            m77544f(skip);
                            m77542c();
                        } else if (j2 == 0) {
                            return -1;
                        } else {
                            return j2;
                        }
                    } catch (IOException e) {
                        this.f55420f = e;
                    }
                }
                if (j > 0) {
                    long skip2 = this.f55418c.skip(j);
                    if (skip2 >= 0) {
                        j2 += skip2;
                        j -= skip2;
                        m77544f(skip2);
                    } else if (j2 == 0) {
                        return -1;
                    } else {
                        return j2;
                    }
                }
                if (j == 0) {
                    return j2;
                }
            }
            throw this.f55420f;
        }

        public int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
            int i3 = 0;
            while (m77543e()) {
                while (((long) i2) > 262144) {
                    try {
                        int read = this.f55418c.read(bArr, i, 262144);
                        if (read != -1) {
                            i3 += read;
                            i += read;
                            i2 -= read;
                            m77544f((long) read);
                            m77542c();
                        } else if (i3 == 0) {
                            return -1;
                        } else {
                            return i3;
                        }
                    } catch (IOException e) {
                        this.f55420f = e;
                    }
                }
                if (i2 > 0) {
                    int read2 = this.f55418c.read(bArr, i, i2);
                    if (read2 != -1) {
                        i += read2;
                        i3 += read2;
                        i2 -= read2;
                        m77544f((long) read2);
                    } else if (i3 == 0) {
                        return -1;
                    } else {
                        return i3;
                    }
                }
                if (i2 == 0) {
                    return i3;
                }
            }
            throw this.f55420f;
        }
    }
}
