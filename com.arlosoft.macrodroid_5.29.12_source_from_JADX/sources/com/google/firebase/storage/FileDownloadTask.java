package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.firebase.storage.internal.ExponentialBackoffSender;
import com.google.firebase.storage.network.GetNetworkRequest;
import com.google.firebase.storage.network.NetworkRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileDownloadTask extends StorageTask<TaskSnapshot> {

    /* renamed from: l */
    private final Uri f55307l;

    /* renamed from: m */
    private long f55308m;

    /* renamed from: n */
    private StorageReference f55309n;

    /* renamed from: o */
    private ExponentialBackoffSender f55310o;

    /* renamed from: p */
    private long f55311p = -1;

    /* renamed from: q */
    private String f55312q = null;

    /* renamed from: r */
    private volatile Exception f55313r = null;

    /* renamed from: s */
    private long f55314s = 0;

    /* renamed from: t */
    private int f55315t;

    public class TaskSnapshot extends StorageTask<TaskSnapshot>.SnapshotBase {

        /* renamed from: c */
        private final long f55316c;

        TaskSnapshot(Exception exc, long j) {
            super(exc);
            this.f55316c = j;
        }
    }

    FileDownloadTask(@NonNull StorageReference storageReference, @NonNull Uri uri) {
        this.f55309n = storageReference;
        this.f55307l = uri;
        FirebaseStorage l = storageReference.mo63638l();
        this.f55310o = new ExponentialBackoffSender(l.mo63590a().mo61950l(), l.mo63592c(), l.mo63591b(), l.mo63595j());
    }

    /* renamed from: x0 */
    private int m77344x0(InputStream inputStream, byte[] bArr) {
        int read;
        int i = 0;
        boolean z = false;
        while (i != bArr.length && (read = inputStream.read(bArr, i, bArr.length - i)) != -1) {
            try {
                z = true;
                i += read;
            } catch (IOException e) {
                this.f55313r = e;
            }
        }
        if (z) {
            return i;
        }
        return -1;
    }

    /* renamed from: y0 */
    private boolean m77345y0(int i) {
        return i == 308 || (i >= 200 && i < 300);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: z0 */
    private boolean m77346z0(NetworkRequest networkRequest) throws IOException {
        FileOutputStream fileOutputStream;
        InputStream u = networkRequest.mo63746u();
        if (u != null) {
            File file = new File(this.f55307l.getPath());
            if (!file.exists()) {
                if (this.f55314s > 0) {
                    throw new IOException("The file to download to has been deleted.");
                } else if (!file.createNewFile()) {
                    Log.w("FileDownloadTask", "unable to create file:" + file.getAbsolutePath());
                }
            }
            boolean z = true;
            if (this.f55314s > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Resuming download file ");
                sb.append(file.getAbsolutePath());
                sb.append(" at ");
                sb.append(this.f55314s);
                fileOutputStream = new FileOutputStream(file, true);
            } else {
                fileOutputStream = new FileOutputStream(file);
            }
            try {
                byte[] bArr = new byte[262144];
                while (z) {
                    int x0 = m77344x0(u, bArr);
                    if (x0 == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, x0);
                    this.f55308m += (long) x0;
                    if (this.f55313r != null) {
                        this.f55313r = null;
                        z = false;
                    }
                    if (!mo63669v0(4, false)) {
                        z = false;
                    }
                }
                fileOutputStream.flush();
                fileOutputStream.close();
                u.close();
                return z;
            } catch (Throwable th) {
                fileOutputStream.flush();
                fileOutputStream.close();
                u.close();
                throw th;
            }
        } else {
            this.f55313r = new IllegalStateException("Unable to open Firebase Storage stream.");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: A0 */
    public TaskSnapshot mo63589t0() {
        return new TaskSnapshot(StorageException.m77381e(this.f55313r, this.f55315t), this.f55308m + this.f55314s);
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: Y */
    public StorageReference mo63585Y() {
        return this.f55309n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public void mo63586j0() {
        this.f55310o.mo63714a();
        this.f55313r = StorageException.m77379c(Status.f3134B);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public void mo63587q0() {
        String str;
        if (this.f55313r != null) {
            mo63669v0(64, false);
        } else if (mo63669v0(4, false)) {
            do {
                this.f55308m = 0;
                this.f55313r = null;
                this.f55310o.mo63716c();
                GetNetworkRequest getNetworkRequest = new GetNetworkRequest(this.f55309n.mo63639m(), this.f55309n.mo63632g(), this.f55314s);
                this.f55310o.mo63718e(getNetworkRequest, false);
                this.f55315t = getNetworkRequest.mo63741p();
                this.f55313r = getNetworkRequest.mo63734f() != null ? getNetworkRequest.mo63734f() : this.f55313r;
                boolean z = true;
                boolean z2 = m77345y0(this.f55315t) && this.f55313r == null && mo63656S() == 4;
                if (z2) {
                    this.f55311p = ((long) getNetworkRequest.mo63744s()) + this.f55314s;
                    String r = getNetworkRequest.mo63743r("ETag");
                    if (TextUtils.isEmpty(r) || (str = this.f55312q) == null || str.equals(r)) {
                        this.f55312q = r;
                        try {
                            z2 = m77346z0(getNetworkRequest);
                        } catch (IOException e) {
                            Log.e("FileDownloadTask", "Exception occurred during file write.  Aborting.", e);
                            this.f55313r = e;
                        }
                    } else {
                        Log.w("FileDownloadTask", "The file at the server has changed.  Restarting from the beginning.");
                        this.f55314s = 0;
                        this.f55312q = null;
                        getNetworkRequest.mo63729D();
                        mo63588r0();
                        return;
                    }
                }
                getNetworkRequest.mo63729D();
                if (!(z2 && this.f55313r == null && mo63656S() == 4)) {
                    z = false;
                }
                if (z) {
                    mo63669v0(128, false);
                    return;
                }
                File file = new File(this.f55307l.getPath());
                if (file.exists()) {
                    this.f55314s = file.length();
                } else {
                    this.f55314s = 0;
                }
                if (mo63656S() == 8) {
                    mo63669v0(16, false);
                    return;
                } else if (mo63656S() == 32) {
                    if (!mo63669v0(256, false)) {
                        Log.w("FileDownloadTask", "Unable to change download task to final state from " + mo63656S());
                        return;
                    }
                    return;
                }
            } while (this.f55308m > 0);
            mo63669v0(64, false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r0 */
    public void mo63588r0() {
        StorageTaskScheduler.m77520b().mo63677e(mo63659V());
    }
}
