package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.interop.InternalAppCheckTokenProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.storage.StorageMetadata;
import com.google.firebase.storage.internal.AdaptiveStreamBuffer;
import com.google.firebase.storage.internal.ExponentialBackoffSender;
import com.google.firebase.storage.internal.Sleeper;
import com.google.firebase.storage.internal.SleeperImpl;
import com.google.firebase.storage.internal.StorageReferenceUri;
import com.google.firebase.storage.internal.Util;
import com.google.firebase.storage.network.NetworkRequest;
import com.google.firebase.storage.network.ResumableUploadByteRequest;
import com.google.firebase.storage.network.ResumableUploadCancelRequest;
import com.google.firebase.storage.network.ResumableUploadQueryRequest;
import com.google.firebase.storage.network.ResumableUploadStartRequest;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

public class UploadTask extends StorageTask<TaskSnapshot> {

    /* renamed from: E */
    private static final Random f55436E = new Random();

    /* renamed from: F */
    static Sleeper f55437F = new SleeperImpl();

    /* renamed from: G */
    static Clock f55438G = DefaultClock.m4871d();

    /* renamed from: A */
    private volatile String f55439A;

    /* renamed from: B */
    private volatile long f55440B;

    /* renamed from: C */
    private int f55441C;

    /* renamed from: D */
    private final int f55442D;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final StorageReference f55443l;

    /* renamed from: m */
    private final Uri f55444m;

    /* renamed from: n */
    private final long f55445n;

    /* renamed from: o */
    private final AdaptiveStreamBuffer f55446o;

    /* renamed from: p */
    private final AtomicLong f55447p = new AtomicLong(0);
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: q */
    public final InternalAuthProvider f55448q;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: r */
    public final InternalAppCheckTokenProvider f55449r;

    /* renamed from: s */
    private int f55450s = 262144;

    /* renamed from: t */
    private ExponentialBackoffSender f55451t;

    /* renamed from: u */
    private boolean f55452u;

    /* renamed from: v */
    private volatile StorageMetadata f55453v;

    /* renamed from: w */
    private volatile Uri f55454w;

    /* renamed from: x */
    private volatile Exception f55455x;

    /* renamed from: y */
    private volatile Exception f55456y;

    /* renamed from: z */
    private volatile int f55457z;

    public class TaskSnapshot extends StorageTask<TaskSnapshot>.SnapshotBase {

        /* renamed from: c */
        private final long f55460c;

        /* renamed from: d */
        private final Uri f55461d;

        /* renamed from: e */
        private final StorageMetadata f55462e;

        TaskSnapshot(Exception exc, long j, Uri uri, StorageMetadata storageMetadata) {
            super(exc);
            this.f55460c = j;
            this.f55461d = uri;
            this.f55462e = storageMetadata;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: long} */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    UploadTask(com.google.firebase.storage.StorageReference r11, com.google.firebase.storage.StorageMetadata r12, android.net.Uri r13, android.net.Uri r14) {
        /*
            r10 = this;
            java.lang.String r0 = "UploadTask"
            r10.<init>()
            java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
            r2 = 0
            r1.<init>(r2)
            r10.f55447p = r1
            r1 = 262144(0x40000, float:3.67342E-40)
            r10.f55450s = r1
            r2 = 0
            r10.f55454w = r2
            r10.f55455x = r2
            r10.f55456y = r2
            r3 = 0
            r10.f55457z = r3
            r10.f55441C = r3
            r3 = 1000(0x3e8, float:1.401E-42)
            r10.f55442D = r3
            com.google.android.gms.common.internal.Preconditions.m4488k(r11)
            com.google.android.gms.common.internal.Preconditions.m4488k(r13)
            com.google.firebase.storage.FirebaseStorage r3 = r11.mo63638l()
            r10.f55443l = r11
            r10.f55453v = r12
            com.google.firebase.auth.internal.InternalAuthProvider r6 = r3.mo63592c()
            r10.f55448q = r6
            com.google.firebase.appcheck.interop.InternalAppCheckTokenProvider r7 = r3.mo63591b()
            r10.f55449r = r7
            r10.f55444m = r13
            long r4 = r3.mo63594i()
            r10.f55440B = r4
            com.google.firebase.storage.internal.ExponentialBackoffSender r12 = new com.google.firebase.storage.internal.ExponentialBackoffSender
            com.google.firebase.FirebaseApp r4 = r11.mo63632g()
            android.content.Context r5 = r4.mo61950l()
            long r8 = r3.mo63596k()
            r4 = r12
            r4.<init>(r5, r6, r7, r8)
            r10.f55451t = r12
            r3 = -1
            com.google.firebase.storage.FirebaseStorage r11 = r11.mo63638l()     // Catch:{ FileNotFoundException -> 0x00c1 }
            com.google.firebase.FirebaseApp r11 = r11.mo63590a()     // Catch:{ FileNotFoundException -> 0x00c1 }
            android.content.Context r11 = r11.mo61950l()     // Catch:{ FileNotFoundException -> 0x00c1 }
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch:{ FileNotFoundException -> 0x00c1 }
            java.lang.String r12 = "r"
            android.os.ParcelFileDescriptor r12 = r11.openFileDescriptor(r13, r12)     // Catch:{ NullPointerException -> 0x009b, IOException -> 0x007e }
            if (r12 == 0) goto L_0x00a2
            long r5 = r12.getStatSize()     // Catch:{ NullPointerException -> 0x009b, IOException -> 0x007e }
            r12.close()     // Catch:{ NullPointerException -> 0x007c, IOException -> 0x007a }
            goto L_0x00a3
        L_0x007a:
            r12 = move-exception
            goto L_0x0080
        L_0x007c:
            r12 = move-exception
            goto L_0x009d
        L_0x007e:
            r12 = move-exception
            r5 = r3
        L_0x0080:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00be }
            r13.<init>()     // Catch:{ FileNotFoundException -> 0x00be }
            java.lang.String r7 = "could not retrieve file size for upload "
            r13.append(r7)     // Catch:{ FileNotFoundException -> 0x00be }
            android.net.Uri r7 = r10.f55444m     // Catch:{ FileNotFoundException -> 0x00be }
            java.lang.String r7 = r7.toString()     // Catch:{ FileNotFoundException -> 0x00be }
            r13.append(r7)     // Catch:{ FileNotFoundException -> 0x00be }
            java.lang.String r13 = r13.toString()     // Catch:{ FileNotFoundException -> 0x00be }
            android.util.Log.w(r0, r13, r12)     // Catch:{ FileNotFoundException -> 0x00be }
            goto L_0x00a3
        L_0x009b:
            r12 = move-exception
            r5 = r3
        L_0x009d:
            java.lang.String r13 = "NullPointerException during file size calculation."
            android.util.Log.w(r0, r13, r12)     // Catch:{ FileNotFoundException -> 0x00be }
        L_0x00a2:
            r5 = r3
        L_0x00a3:
            android.net.Uri r12 = r10.f55444m     // Catch:{ FileNotFoundException -> 0x00be }
            java.io.InputStream r2 = r11.openInputStream(r12)     // Catch:{ FileNotFoundException -> 0x00be }
            if (r2 == 0) goto L_0x00df
            int r11 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r11 != 0) goto L_0x00b6
            int r11 = r2.available()     // Catch:{ IOException -> 0x00b6 }
            if (r11 < 0) goto L_0x00b6
            long r5 = (long) r11
        L_0x00b6:
            r3 = r5
            java.io.BufferedInputStream r11 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x00c1 }
            r11.<init>(r2)     // Catch:{ FileNotFoundException -> 0x00c1 }
            r2 = r11
            goto L_0x00de
        L_0x00be:
            r11 = move-exception
            r3 = r5
            goto L_0x00c2
        L_0x00c1:
            r11 = move-exception
        L_0x00c2:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "could not locate file for uploading:"
            r12.append(r13)
            android.net.Uri r13 = r10.f55444m
            java.lang.String r13 = r13.toString()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            android.util.Log.e(r0, r12)
            r10.f55455x = r11
        L_0x00de:
            r5 = r3
        L_0x00df:
            r10.f55445n = r5
            com.google.firebase.storage.internal.AdaptiveStreamBuffer r11 = new com.google.firebase.storage.internal.AdaptiveStreamBuffer
            r11.<init>(r2, r1)
            r10.f55446o = r11
            r11 = 1
            r10.f55452u = r11
            r10.f55454w = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.storage.UploadTask.<init>(com.google.firebase.storage.StorageReference, com.google.firebase.storage.StorageMetadata, android.net.Uri, android.net.Uri):void");
    }

    /* renamed from: A0 */
    private void m77555A0() {
        JSONObject jSONObject = null;
        String v = this.f55453v != null ? this.f55453v.mo63617v() : null;
        if (this.f55444m != null && TextUtils.isEmpty(v)) {
            v = this.f55443l.mo63638l().mo63590a().mo61950l().getContentResolver().getType(this.f55444m);
        }
        if (TextUtils.isEmpty(v)) {
            v = "application/octet-stream";
        }
        StorageReferenceUri m = this.f55443l.mo63639m();
        FirebaseApp g = this.f55443l.mo63632g();
        if (this.f55453v != null) {
            jSONObject = this.f55453v.mo63612q();
        }
        ResumableUploadStartRequest resumableUploadStartRequest = new ResumableUploadStartRequest(m, g, jSONObject, v);
        if (m77561G0(resumableUploadStartRequest)) {
            String r = resumableUploadStartRequest.mo63743r("X-Goog-Upload-URL");
            if (!TextUtils.isEmpty(r)) {
                this.f55454w = Uri.parse(r);
            }
        }
    }

    /* renamed from: B0 */
    private boolean m77556B0(NetworkRequest networkRequest) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("Waiting ");
            sb.append(this.f55441C);
            sb.append(" milliseconds");
            f55437F.mo63719a(this.f55441C + f55436E.nextInt(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION));
            boolean F0 = m77560F0(networkRequest);
            if (F0) {
                this.f55441C = 0;
            }
            return F0;
        } catch (InterruptedException e) {
            Log.w("UploadTask", "thread interrupted during exponential backoff.");
            Thread.currentThread().interrupt();
            this.f55456y = e;
            return false;
        }
    }

    /* renamed from: C0 */
    private boolean m77557C0(int i) {
        return i == 308 || (i >= 200 && i < 300);
    }

    /* renamed from: D0 */
    private boolean m77558D0(NetworkRequest networkRequest) {
        int p = networkRequest.mo63741p();
        if (this.f55451t.mo63715b(p)) {
            p = -2;
        }
        this.f55457z = p;
        this.f55456y = networkRequest.mo63734f();
        this.f55439A = networkRequest.mo63743r("X-Goog-Upload-Status");
        return m77557C0(this.f55457z) && this.f55456y == null;
    }

    /* renamed from: E0 */
    private boolean m77559E0(boolean z) {
        ResumableUploadQueryRequest resumableUploadQueryRequest = new ResumableUploadQueryRequest(this.f55443l.mo63639m(), this.f55443l.mo63632g(), this.f55454w);
        if ("final".equals(this.f55439A)) {
            return false;
        }
        if (z) {
            if (!m77561G0(resumableUploadQueryRequest)) {
                return false;
            }
        } else if (!m77560F0(resumableUploadQueryRequest)) {
            return false;
        }
        if ("final".equals(resumableUploadQueryRequest.mo63743r("X-Goog-Upload-Status"))) {
            this.f55455x = new IOException("The server has terminated the upload session");
            return false;
        }
        String r = resumableUploadQueryRequest.mo63743r("X-Goog-Upload-Size-Received");
        long parseLong = !TextUtils.isEmpty(r) ? Long.parseLong(r) : 0;
        long j = this.f55447p.get();
        int i = (j > parseLong ? 1 : (j == parseLong ? 0 : -1));
        if (i > 0) {
            this.f55455x = new IOException("Unexpected error. The server lost a chunk update.");
            return false;
        } else if (i >= 0) {
            return true;
        } else {
            try {
                long j2 = parseLong - j;
                if (((long) this.f55446o.mo63708a((int) j2)) != j2) {
                    this.f55455x = new IOException("Unexpected end of stream encountered.");
                    return false;
                } else if (this.f55447p.compareAndSet(j, parseLong)) {
                    return true;
                } else {
                    Log.e("UploadTask", "Somehow, the uploaded bytes changed during an uploaded.  This should nothappen");
                    this.f55455x = new IllegalStateException("uploaded bytes changed unexpectedly.");
                    return false;
                }
            } catch (IOException e) {
                Log.e("UploadTask", "Unable to recover position in Stream during resumable upload", e);
                this.f55455x = e;
                return false;
            }
        }
    }

    /* renamed from: F0 */
    private boolean m77560F0(NetworkRequest networkRequest) {
        networkRequest.mo63728C(Util.m77615c(this.f55448q), Util.m77614b(this.f55449r), this.f55443l.mo63632g().mo61950l());
        return m77558D0(networkRequest);
    }

    /* renamed from: G0 */
    private boolean m77561G0(NetworkRequest networkRequest) {
        this.f55451t.mo63717d(networkRequest);
        return m77558D0(networkRequest);
    }

    /* renamed from: H0 */
    private boolean m77562H0() {
        if (!"final".equals(this.f55439A)) {
            return true;
        }
        if (this.f55455x == null) {
            this.f55455x = new IOException("The server has terminated the upload session", this.f55456y);
        }
        mo63669v0(64, false);
        return false;
    }

    /* renamed from: I0 */
    private boolean m77563I0() {
        if (mo63656S() == 128) {
            return false;
        }
        if (Thread.interrupted()) {
            this.f55455x = new InterruptedException();
            mo63669v0(64, false);
            return false;
        } else if (mo63656S() == 32) {
            mo63669v0(256, false);
            return false;
        } else if (mo63656S() == 8) {
            mo63669v0(16, false);
            return false;
        } else if (!m77562H0()) {
            return false;
        } else {
            if (this.f55454w == null) {
                if (this.f55455x == null) {
                    this.f55455x = new IllegalStateException("Unable to obtain an upload URL.");
                }
                mo63669v0(64, false);
                return false;
            } else if (this.f55455x != null) {
                mo63669v0(64, false);
                return false;
            } else {
                boolean z = this.f55456y != null || this.f55457z < 200 || this.f55457z >= 300;
                long c = f55438G.mo21952c() + this.f55440B;
                long c2 = f55438G.mo21952c() + ((long) this.f55441C);
                if (z) {
                    if (c2 > c || !m77559E0(true)) {
                        if (m77562H0()) {
                            mo63669v0(64, false);
                        }
                        return false;
                    }
                    this.f55441C = Math.max(this.f55441C * 2, 1000);
                }
                return true;
            }
        }
    }

    /* renamed from: K0 */
    private void m77564K0() {
        try {
            this.f55446o.mo63711d(this.f55450s);
            int min = Math.min(this.f55450s, this.f55446o.mo63709b());
            ResumableUploadByteRequest resumableUploadByteRequest = new ResumableUploadByteRequest(this.f55443l.mo63639m(), this.f55443l.mo63632g(), this.f55454w, this.f55446o.mo63712e(), this.f55447p.get(), min, this.f55446o.mo63713f());
            if (!m77556B0(resumableUploadByteRequest)) {
                this.f55450s = 262144;
                StringBuilder sb = new StringBuilder();
                sb.append("Resetting chunk size to ");
                sb.append(this.f55450s);
                return;
            }
            this.f55447p.getAndAdd((long) min);
            if (!this.f55446o.mo63713f()) {
                this.f55446o.mo63708a(min);
                int i = this.f55450s;
                if (i < 33554432) {
                    this.f55450s = i * 2;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Increasing chunk size to ");
                    sb2.append(this.f55450s);
                    return;
                }
                return;
            }
            try {
                this.f55453v = new StorageMetadata.Builder(resumableUploadByteRequest.mo63740o(), this.f55443l).mo63618a();
                mo63669v0(4, false);
                mo63669v0(128, false);
            } catch (JSONException e) {
                Log.e("UploadTask", "Unable to parse resulting metadata from upload:" + resumableUploadByteRequest.mo63739n(), e);
                this.f55455x = e;
            }
        } catch (IOException e2) {
            Log.e("UploadTask", "Unable to read bytes for uploading", e2);
            this.f55455x = e2;
        }
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: J0 */
    public TaskSnapshot mo63589t0() {
        return new TaskSnapshot(StorageException.m77381e(this.f55455x != null ? this.f55455x : this.f55456y, this.f55457z), this.f55447p.get(), this.f55454w, this.f55453v);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public StorageReference mo63585Y() {
        return this.f55443l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public void mo63586j0() {
        this.f55451t.mo63714a();
        final ResumableUploadCancelRequest resumableUploadCancelRequest = this.f55454w != null ? new ResumableUploadCancelRequest(this.f55443l.mo63639m(), this.f55443l.mo63632g(), this.f55454w) : null;
        if (resumableUploadCancelRequest != null) {
            StorageTaskScheduler.m77520b().mo63676d(new Runnable() {
                public void run() {
                    resumableUploadCancelRequest.mo63728C(Util.m77615c(UploadTask.this.f55448q), Util.m77614b(UploadTask.this.f55449r), UploadTask.this.f55443l.mo63632g().mo61950l());
                }
            });
        }
        this.f55455x = StorageException.m77379c(Status.f3134B);
        super.mo63586j0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public void mo63587q0() {
        this.f55451t.mo63716c();
        if (mo63669v0(4, false)) {
            if (this.f55443l.mo63637k() == null) {
                this.f55455x = new IllegalArgumentException("Cannot upload to getRoot. You should upload to a storage location such as .getReference('image.png').putFile...");
            }
            if (this.f55455x == null) {
                if (this.f55454w == null) {
                    m77555A0();
                } else {
                    m77559E0(false);
                }
                boolean I0 = m77563I0();
                while (I0) {
                    m77564K0();
                    I0 = m77563I0();
                    if (I0) {
                        mo63669v0(4, false);
                    }
                }
                if (this.f55452u && mo63656S() != 16) {
                    try {
                        this.f55446o.mo63710c();
                    } catch (IOException e) {
                        Log.e("UploadTask", "Unable to close stream.", e);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r0 */
    public void mo63588r0() {
        StorageTaskScheduler.m77520b().mo63678f(mo63659V());
    }
}
