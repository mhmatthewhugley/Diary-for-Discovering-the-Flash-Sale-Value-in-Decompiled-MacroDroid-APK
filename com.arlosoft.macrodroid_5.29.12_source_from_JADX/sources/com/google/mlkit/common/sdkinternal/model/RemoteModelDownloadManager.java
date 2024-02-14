package com.google.mlkit.common.sdkinternal.model;

import android.app.DownloadManager;
import android.content.IntentFilter;
import android.database.Cursor;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.LongSparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zziy;
import com.google.android.gms.internal.mlkit_common.zzje;
import com.google.android.gms.internal.mlkit_common.zzmh;
import com.google.android.gms.internal.mlkit_common.zzmq;
import com.google.android.gms.internal.mlkit_common.zzmt;
import com.google.android.gms.internal.mlkit_common.zznb;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.DownloadConditions;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.ModelInfo;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

@KeepForSdk
/* compiled from: com.google.mlkit:common@@18.5.0 */
public class RemoteModelDownloadManager {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final GmsLogger f56367m = new GmsLogger("ModelDownloadManager", "");
    @GuardedBy("RemoteModelDownloadManager.class")

    /* renamed from: n */
    private static final Map f56368n = new HashMap();
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: a */
    public final LongSparseArray f56369a = new LongSparseArray();
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: b */
    public final LongSparseArray f56370b = new LongSparseArray();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final MlKitContext f56371c;
    @Nullable

    /* renamed from: d */
    private final DownloadManager f56372d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final RemoteModel f56373e;

    /* renamed from: f */
    private final ModelType f56374f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final zzmq f56375g;

    /* renamed from: h */
    private final SharedPrefManager f56376h;

    /* renamed from: i */
    private final ModelFileHelper f56377i;
    @Nullable

    /* renamed from: j */
    private final ModelInfoRetrieverInterop f56378j;

    /* renamed from: k */
    private final RemoteModelFileManager f56379k;

    /* renamed from: l */
    private DownloadConditions f56380l;

    @VisibleForTesting
    RemoteModelDownloadManager(@NonNull MlKitContext mlKitContext, @NonNull RemoteModel remoteModel, @NonNull ModelFileHelper modelFileHelper, @NonNull RemoteModelFileManager remoteModelFileManager, @Nullable ModelInfoRetrieverInterop modelInfoRetrieverInterop, @NonNull zzmq zzmq) {
        this.f56371c = mlKitContext;
        this.f56374f = remoteModel.mo64531d();
        this.f56373e = remoteModel;
        DownloadManager downloadManager = (DownloadManager) mlKitContext.mo64554b().getSystemService("download");
        this.f56372d = downloadManager;
        this.f56375g = zzmq;
        if (downloadManager == null) {
            f56367m.mo21702b("ModelDownloadManager", "Download manager service is not available in the service.");
        }
        this.f56377i = modelFileHelper;
        this.f56376h = SharedPrefManager.m79063f(mlKitContext);
        this.f56378j = modelInfoRetrieverInterop;
        this.f56379k = remoteModelFileManager;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: g */
    public static synchronized RemoteModelDownloadManager m79108g(@NonNull MlKitContext mlKitContext, @NonNull RemoteModel remoteModel, @NonNull ModelFileHelper modelFileHelper, @NonNull RemoteModelFileManager remoteModelFileManager, @Nullable ModelInfoRetrieverInterop modelInfoRetrieverInterop) {
        RemoteModelDownloadManager remoteModelDownloadManager;
        synchronized (RemoteModelDownloadManager.class) {
            Map map = f56368n;
            if (!map.containsKey(remoteModel)) {
                map.put(remoteModel, new RemoteModelDownloadManager(mlKitContext, remoteModel, modelFileHelper, remoteModelFileManager, modelInfoRetrieverInterop, zznb.m61542b("common")));
            }
            remoteModelDownloadManager = (RemoteModelDownloadManager) map.get(remoteModel);
        }
        return remoteModelDownloadManager;
    }

    /* renamed from: t */
    private final Task m79116t(long j) {
        this.f56371c.mo64554b().registerReceiver(m79119w(j), new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), (String) null, MLTaskExecutor.m79033b().mo64549a());
        return m79117u(j).mo56137a();
    }

    /* renamed from: u */
    private final synchronized TaskCompletionSource m79117u(long j) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f56370b.get(j);
        if (taskCompletionSource != null) {
            return taskCompletionSource;
        }
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        this.f56370b.put(j, taskCompletionSource2);
        return taskCompletionSource2;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final MlKitException m79118v(@Nullable Long l) {
        DownloadManager downloadManager = this.f56372d;
        Cursor cursor = null;
        if (!(downloadManager == null || l == null)) {
            cursor = downloadManager.query(new DownloadManager.Query().setFilterById(new long[]{l.longValue()}));
        }
        int i = 13;
        String str = "Model downloading failed";
        if (cursor != null && cursor.moveToFirst()) {
            int i2 = cursor.getInt(cursor.getColumnIndex("reason"));
            if (i2 == 1006) {
                i = 101;
                str = "Model downloading failed due to insufficient space on the device.";
            } else {
                str = "Model downloading failed due to error code: " + i2 + " from Android DownloadManager";
            }
        }
        return new MlKitException(str, i);
    }

    /* renamed from: w */
    private final synchronized zzd m79119w(long j) {
        zzd zzd = (zzd) this.f56369a.get(j);
        if (zzd != null) {
            return zzd;
        }
        zzd zzd2 = new zzd(this, j, m79117u(j), (zzc) null);
        this.f56369a.put(j, zzd2);
        return zzd2;
    }

    @Nullable
    /* renamed from: x */
    private final synchronized Long m79120x(@NonNull DownloadManager.Request request, @NonNull ModelInfo modelInfo) {
        DownloadManager downloadManager = this.f56372d;
        if (downloadManager == null) {
            return null;
        }
        long enqueue = downloadManager.enqueue(request);
        GmsLogger gmsLogger = f56367m;
        gmsLogger.mo21702b("ModelDownloadManager", "Schedule a new downloading task: " + enqueue);
        this.f56376h.mo64578l(enqueue, modelInfo);
        this.f56375g.mo52012f(zzmt.m61529g(), this.f56373e, zziy.NO_ERROR, false, modelInfo.mo64557c(), zzje.SCHEDULED);
        return Long.valueOf(enqueue);
    }

    @WorkerThread
    @Nullable
    /* renamed from: y */
    private final synchronized Long m79121y(@NonNull ModelInfo modelInfo, @NonNull DownloadConditions downloadConditions) throws MlKitException {
        Preconditions.m4489l(downloadConditions, "DownloadConditions can not be null");
        String c = this.f56376h.mo64570c(this.f56373e);
        Integer e = mo64607e();
        if (c == null || !c.equals(modelInfo.mo64555a()) || e == null) {
            GmsLogger gmsLogger = f56367m;
            gmsLogger.mo21702b("ModelDownloadManager", "Need to download a new model.");
            mo64611j();
            DownloadManager.Request request = new DownloadManager.Request(modelInfo.mo64558d());
            if (this.f56377i.mo64596h(modelInfo.mo64556b(), modelInfo.mo64557c())) {
                gmsLogger.mo21702b("ModelDownloadManager", "Model update is enabled and have a previous downloaded model, use download condition");
                this.f56375g.mo52012f(zzmt.m61529g(), this.f56373e, zziy.NO_ERROR, false, modelInfo.mo64557c(), zzje.UPDATE_AVAILABLE);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                request.setRequiresCharging(downloadConditions.mo64520a());
            }
            if (downloadConditions.mo64521b()) {
                request.setAllowedNetworkTypes(2);
            }
            return m79120x(request, modelInfo);
        }
        Integer e2 = mo64607e();
        if (e2 == null || !(e2.intValue() == 8 || e2.intValue() == 16)) {
            zzmq zzmq = this.f56375g;
            zzmh g = zzmt.m61529g();
            RemoteModel remoteModel = this.f56373e;
            zzmq.mo52012f(g, remoteModel, zziy.NO_ERROR, false, remoteModel.mo64531d(), zzje.DOWNLOADING);
        }
        f56367m.mo21702b("ModelDownloadManager", "New model is already in downloading, do nothing.");
        return null;
    }

    @WorkerThread
    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public Task<Void> mo64603a() {
        MlKitException mlKitException;
        ModelInfo modelInfo;
        this.f56375g.mo52012f(zzmt.m61529g(), this.f56373e, zziy.NO_ERROR, false, ModelType.UNKNOWN, zzje.EXPLICITLY_REQUESTED);
        Long l = null;
        try {
            modelInfo = mo64612q();
            mlKitException = null;
        } catch (MlKitException e) {
            mlKitException = e;
            modelInfo = null;
        }
        try {
            Integer e2 = mo64607e();
            Long c = mo64605c();
            if (!mo64610i()) {
                if (e2 == null || e2.intValue() != 8) {
                    if (e2 != null && e2.intValue() == 16) {
                        MlKitException v = m79118v(c);
                        mo64611j();
                        return Tasks.m66666e(v);
                    } else if (e2 == null || (!(e2.intValue() == 4 || e2.intValue() == 2 || e2.intValue() == 1) || c == null || mo64606d() == null)) {
                        if (modelInfo != null) {
                            l = m79121y(modelInfo, this.f56380l);
                        }
                        if (l == null) {
                            return Tasks.m66666e(new MlKitException("Failed to schedule the download task", 13, mlKitException));
                        }
                        return m79116t(l.longValue());
                    } else {
                        zzmq zzmq = this.f56375g;
                        zzmh g = zzmt.m61529g();
                        RemoteModel remoteModel = this.f56373e;
                        zzmq.mo52012f(g, remoteModel, zziy.NO_ERROR, false, remoteModel.mo64531d(), zzje.DOWNLOADING);
                        return m79116t(c.longValue());
                    }
                }
            }
            if (modelInfo != null) {
                Long y = m79121y(modelInfo, this.f56380l);
                if (y != null) {
                    return m79116t(y.longValue());
                }
                f56367m.mo21706f("ModelDownloadManager", "Didn't schedule download for the updated model");
            }
            return Tasks.m66667f(null);
        } catch (MlKitException e3) {
            return Tasks.m66666e(new MlKitException("Failed to ensure the model is downloaded.", 13, e3));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        f56367m.mo21704d("ModelDownloadManager", "Downloaded file is not found");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0015 */
    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.Nullable
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.os.ParcelFileDescriptor mo64604b() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.Long r0 = r5.mo64605c()     // Catch:{ all -> 0x0022 }
            android.app.DownloadManager r1 = r5.f56372d     // Catch:{ all -> 0x0022 }
            r2 = 0
            if (r1 == 0) goto L_0x0020
            if (r0 == 0) goto L_0x0020
            long r3 = r0.longValue()     // Catch:{ FileNotFoundException -> 0x0015 }
            android.os.ParcelFileDescriptor r2 = r1.openDownloadedFile(r3)     // Catch:{ FileNotFoundException -> 0x0015 }
            goto L_0x001e
        L_0x0015:
            com.google.android.gms.common.internal.GmsLogger r0 = f56367m     // Catch:{ all -> 0x0022 }
            java.lang.String r1 = "ModelDownloadManager"
            java.lang.String r3 = "Downloaded file is not found"
            r0.mo21704d(r1, r3)     // Catch:{ all -> 0x0022 }
        L_0x001e:
            monitor-exit(r5)
            return r2
        L_0x0020:
            monitor-exit(r5)
            return r2
        L_0x0022:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.mo64604b():android.os.ParcelFileDescriptor");
    }

    @KeepForSdk
    @Nullable
    /* renamed from: c */
    public synchronized Long mo64605c() {
        return this.f56376h.mo64571d(this.f56373e);
    }

    @KeepForSdk
    @Nullable
    /* renamed from: d */
    public synchronized String mo64606d() {
        return this.f56376h.mo64570c(this.f56373e);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:42|43) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008f, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x008d */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048 A[SYNTHETIC, Splitter:B:20:0x0048] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:42:0x008d=Splitter:B:42:0x008d, B:33:0x006e=Splitter:B:33:0x006e} */
    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.Nullable
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Integer mo64607e() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Long r0 = r8.mo64605c()     // Catch:{ all -> 0x0090 }
            android.app.DownloadManager r1 = r8.f56372d     // Catch:{ all -> 0x0090 }
            r2 = 0
            if (r1 == 0) goto L_0x008e
            if (r0 != 0) goto L_0x000e
            goto L_0x008e
        L_0x000e:
            android.app.DownloadManager$Query r3 = new android.app.DownloadManager$Query     // Catch:{ all -> 0x0090 }
            r3.<init>()     // Catch:{ all -> 0x0090 }
            r4 = 1
            long[] r5 = new long[r4]     // Catch:{ all -> 0x0090 }
            long r6 = r0.longValue()     // Catch:{ all -> 0x0090 }
            r0 = 0
            r5[r0] = r6     // Catch:{ all -> 0x0090 }
            android.app.DownloadManager$Query r3 = r3.setFilterById(r5)     // Catch:{ all -> 0x0090 }
            android.database.Cursor r1 = r1.query(r3)     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x003e
            boolean r3 = r1.moveToFirst()     // Catch:{ all -> 0x003c }
            if (r3 == 0) goto L_0x003e
            java.lang.String r3 = "status"
            int r3 = r1.getColumnIndex(r3)     // Catch:{ all -> 0x003c }
            int r3 = r1.getInt(r3)     // Catch:{ all -> 0x003c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x003c }
            goto L_0x003f
        L_0x003c:
            r2 = move-exception
            goto L_0x0073
        L_0x003e:
            r3 = r2
        L_0x003f:
            if (r3 != 0) goto L_0x0048
            if (r1 == 0) goto L_0x0046
            r1.close()     // Catch:{ all -> 0x0090 }
        L_0x0046:
            monitor-exit(r8)
            return r2
        L_0x0048:
            int r5 = r3.intValue()     // Catch:{ all -> 0x003c }
            r6 = 2
            if (r5 == r6) goto L_0x006d
            int r5 = r3.intValue()     // Catch:{ all -> 0x003c }
            r6 = 4
            if (r5 == r6) goto L_0x006d
            int r5 = r3.intValue()     // Catch:{ all -> 0x003c }
            if (r5 == r4) goto L_0x006d
            int r5 = r3.intValue()     // Catch:{ all -> 0x003c }
            r6 = 8
            if (r5 == r6) goto L_0x006d
            int r0 = r3.intValue()     // Catch:{ all -> 0x003c }
            r4 = 16
            if (r0 == r4) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r2 = r3
        L_0x006e:
            r1.close()     // Catch:{ all -> 0x0090 }
            monitor-exit(r8)
            return r2
        L_0x0073:
            r1.close()     // Catch:{ all -> 0x0077 }
            goto L_0x008d
        L_0x0077:
            r1 = move-exception
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x008d }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r3[r0] = r5     // Catch:{ Exception -> 0x008d }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r3 = r5.getDeclaredMethod(r6, r3)     // Catch:{ Exception -> 0x008d }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x008d }
            r4[r0] = r1     // Catch:{ Exception -> 0x008d }
            r3.invoke(r2, r4)     // Catch:{ Exception -> 0x008d }
        L_0x008d:
            throw r2     // Catch:{ all -> 0x0090 }
        L_0x008e:
            monitor-exit(r8)
            return r2
        L_0x0090:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.mo64607e():java.lang.Integer");
    }

    @KeepForSdk
    /* renamed from: f */
    public int mo64608f(@NonNull Long l) {
        int columnIndex;
        DownloadManager downloadManager = this.f56372d;
        Cursor cursor = null;
        if (!(downloadManager == null || l == null)) {
            cursor = downloadManager.query(new DownloadManager.Query().setFilterById(new long[]{l.longValue()}));
        }
        if (cursor == null || !cursor.moveToFirst() || (columnIndex = cursor.getColumnIndex("reason")) == -1) {
            return 0;
        }
        return cursor.getInt(columnIndex);
    }

    @WorkerThread
    @KeepForSdk
    /* renamed from: h */
    public boolean mo64609h() throws MlKitException {
        try {
            if (mo64610i()) {
                return true;
            }
        } catch (MlKitException unused) {
            f56367m.mo21702b("ModelDownloadManager", "Failed to check if the model exist locally.");
        }
        Long c = mo64605c();
        String d = mo64606d();
        if (c == null || d == null) {
            f56367m.mo21702b("ModelDownloadManager", "No new model is downloading.");
            mo64611j();
            return false;
        }
        Integer e = mo64607e();
        f56367m.mo21702b("ModelDownloadManager", "Download Status code: ".concat(String.valueOf(e)));
        if (e == null) {
            mo64611j();
            return false;
        } else if (!Objects.m4470a(e, 8) || mo64613s(d) == null) {
            return false;
        } else {
            return true;
        }
    }

    @KeepForSdk
    /* renamed from: i */
    public boolean mo64610i() throws MlKitException {
        return this.f56377i.mo64596h(this.f56373e.mo64532e(), this.f56374f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        return;
     */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo64611j() throws com.google.mlkit.common.MlKitException {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.Long r0 = r6.mo64605c()     // Catch:{ all -> 0x0054 }
            android.app.DownloadManager r1 = r6.f56372d     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x0052
            if (r0 != 0) goto L_0x000c
            goto L_0x0052
        L_0x000c:
            com.google.android.gms.common.internal.GmsLogger r1 = f56367m     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = "Cancel or remove existing downloading task: "
            java.lang.String r3 = "ModelDownloadManager"
            java.lang.String r4 = r0.toString()     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = r2.concat(r4)     // Catch:{ all -> 0x0054 }
            r1.mo21702b(r3, r2)     // Catch:{ all -> 0x0054 }
            android.app.DownloadManager r1 = r6.f56372d     // Catch:{ all -> 0x0054 }
            r2 = 1
            long[] r2 = new long[r2]     // Catch:{ all -> 0x0054 }
            r3 = 0
            long r4 = r0.longValue()     // Catch:{ all -> 0x0054 }
            r2[r3] = r4     // Catch:{ all -> 0x0054 }
            int r0 = r1.remove(r2)     // Catch:{ all -> 0x0054 }
            if (r0 > 0) goto L_0x0038
            java.lang.Integer r0 = r6.mo64607e()     // Catch:{ all -> 0x0054 }
            if (r0 != 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            monitor-exit(r6)
            return
        L_0x0038:
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper r0 = r6.f56377i     // Catch:{ all -> 0x0054 }
            com.google.mlkit.common.model.RemoteModel r1 = r6.f56373e     // Catch:{ all -> 0x0054 }
            java.lang.String r1 = r1.mo64532e()     // Catch:{ all -> 0x0054 }
            com.google.mlkit.common.model.RemoteModel r2 = r6.f56373e     // Catch:{ all -> 0x0054 }
            com.google.mlkit.common.sdkinternal.ModelType r2 = r2.mo64531d()     // Catch:{ all -> 0x0054 }
            r0.mo64591c(r1, r2)     // Catch:{ all -> 0x0054 }
            com.google.mlkit.common.sdkinternal.SharedPrefManager r0 = r6.f56376h     // Catch:{ all -> 0x0054 }
            com.google.mlkit.common.model.RemoteModel r1 = r6.f56373e     // Catch:{ all -> 0x0054 }
            r0.mo64568a(r1)     // Catch:{ all -> 0x0054 }
            monitor-exit(r6)
            return
        L_0x0052:
            monitor-exit(r6)
            return
        L_0x0054:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.mo64611j():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
        return r1;
     */
    @androidx.annotation.WorkerThread
    @androidx.annotation.Nullable
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.mlkit.common.sdkinternal.ModelInfo mo64612q() throws com.google.mlkit.common.MlKitException {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.mo64610i()     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x001b
            com.google.android.gms.internal.mlkit_common.zzmq r1 = r9.f56375g     // Catch:{ all -> 0x00be }
            com.google.android.gms.internal.mlkit_common.zzmh r2 = com.google.android.gms.internal.mlkit_common.zzmt.m61529g()     // Catch:{ all -> 0x00be }
            com.google.mlkit.common.model.RemoteModel r3 = r9.f56373e     // Catch:{ all -> 0x00be }
            com.google.android.gms.internal.mlkit_common.zziy r4 = com.google.android.gms.internal.mlkit_common.zziy.NO_ERROR     // Catch:{ all -> 0x00be }
            r5 = 0
            com.google.mlkit.common.sdkinternal.ModelType r6 = r3.mo64531d()     // Catch:{ all -> 0x00be }
            com.google.android.gms.internal.mlkit_common.zzje r7 = com.google.android.gms.internal.mlkit_common.zzje.LIVE     // Catch:{ all -> 0x00be }
            r1.mo52012f(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00be }
        L_0x001b:
            com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop r1 = r9.f56378j     // Catch:{ all -> 0x00be }
            if (r1 == 0) goto L_0x00b4
            com.google.mlkit.common.model.RemoteModel r2 = r9.f56373e     // Catch:{ all -> 0x00be }
            com.google.mlkit.common.sdkinternal.ModelInfo r1 = r1.mo64599a(r2)     // Catch:{ all -> 0x00be }
            r2 = 0
            if (r1 != 0) goto L_0x002a
            monitor-exit(r9)
            return r2
        L_0x002a:
            com.google.mlkit.common.sdkinternal.MlKitContext r3 = r9.f56371c     // Catch:{ all -> 0x00be }
            com.google.mlkit.common.model.RemoteModel r4 = r9.f56373e     // Catch:{ all -> 0x00be }
            java.lang.String r5 = r1.mo64555a()     // Catch:{ all -> 0x00be }
            com.google.mlkit.common.sdkinternal.SharedPrefManager r6 = com.google.mlkit.common.sdkinternal.SharedPrefManager.m79063f(r3)     // Catch:{ all -> 0x00be }
            java.lang.String r4 = r6.mo64572e(r4)     // Catch:{ all -> 0x00be }
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x00be }
            r5 = 0
            r7 = 1
            if (r4 == 0) goto L_0x005f
            android.content.Context r3 = r3.mo64554b()     // Catch:{ all -> 0x00be }
            java.lang.String r3 = com.google.mlkit.common.sdkinternal.CommonUtils.m79028a(r3)     // Catch:{ all -> 0x00be }
            java.lang.String r4 = r6.mo64577k()     // Catch:{ all -> 0x00be }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x00be }
            if (r3 == 0) goto L_0x005f
            com.google.android.gms.common.internal.GmsLogger r3 = f56367m     // Catch:{ all -> 0x00be }
            java.lang.String r4 = "ModelDownloadManager"
            java.lang.String r6 = "The model is incompatible with TFLite and the app is not upgraded, do not download"
            r3.mo21704d(r4, r6)     // Catch:{ all -> 0x00be }
            r3 = 0
            goto L_0x0060
        L_0x005f:
            r3 = 1
        L_0x0060:
            if (r0 != 0) goto L_0x0069
            com.google.mlkit.common.sdkinternal.SharedPrefManager r4 = r9.f56376h     // Catch:{ all -> 0x00be }
            com.google.mlkit.common.model.RemoteModel r6 = r9.f56373e     // Catch:{ all -> 0x00be }
            r4.mo64569b(r6)     // Catch:{ all -> 0x00be }
        L_0x0069:
            com.google.mlkit.common.sdkinternal.MlKitContext r4 = r9.f56371c     // Catch:{ all -> 0x00be }
            com.google.mlkit.common.model.RemoteModel r6 = r9.f56373e     // Catch:{ all -> 0x00be }
            java.lang.String r8 = r1.mo64555a()     // Catch:{ all -> 0x00be }
            com.google.mlkit.common.sdkinternal.SharedPrefManager r4 = com.google.mlkit.common.sdkinternal.SharedPrefManager.m79063f(r4)     // Catch:{ all -> 0x00be }
            java.lang.String r4 = r4.mo64573g(r6)     // Catch:{ all -> 0x00be }
            boolean r4 = r8.equals(r4)     // Catch:{ all -> 0x00be }
            r4 = r4 ^ r7
            if (r3 == 0) goto L_0x0087
            if (r0 == 0) goto L_0x0085
            if (r4 != 0) goto L_0x0085
            goto L_0x0088
        L_0x0085:
            monitor-exit(r9)
            return r1
        L_0x0087:
            r5 = r4
        L_0x0088:
            if (r0 == 0) goto L_0x0090
            r0 = r5 ^ r3
            if (r0 == 0) goto L_0x0090
            monitor-exit(r9)
            return r2
        L_0x0090:
            com.google.mlkit.common.MlKitException r0 = new com.google.mlkit.common.MlKitException     // Catch:{ all -> 0x00be }
            com.google.mlkit.common.model.RemoteModel r1 = r9.f56373e     // Catch:{ all -> 0x00be }
            java.lang.String r1 = r1.mo64529b()     // Catch:{ all -> 0x00be }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00be }
            r2.<init>()     // Catch:{ all -> 0x00be }
            java.lang.String r3 = "The model "
            r2.append(r3)     // Catch:{ all -> 0x00be }
            r2.append(r1)     // Catch:{ all -> 0x00be }
            java.lang.String r1 = " is incompatible with TFLite runtime"
            r2.append(r1)     // Catch:{ all -> 0x00be }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x00be }
            r2 = 100
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00be }
            throw r0     // Catch:{ all -> 0x00be }
        L_0x00b4:
            com.google.mlkit.common.MlKitException r0 = new com.google.mlkit.common.MlKitException     // Catch:{ all -> 0x00be }
            java.lang.String r1 = "Please include com.google.mlkit:linkfirebase sdk as your dependency when you try to download from Firebase."
            r2 = 14
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00be }
            throw r0     // Catch:{ all -> 0x00be }
        L_0x00be:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.mo64612q():com.google.mlkit.common.sdkinternal.ModelInfo");
    }

    @Nullable
    /* renamed from: s */
    public final File mo64613s(@NonNull String str) throws MlKitException {
        GmsLogger gmsLogger = f56367m;
        gmsLogger.mo21702b("ModelDownloadManager", "Model downloaded successfully");
        this.f56375g.mo52012f(zzmt.m61529g(), this.f56373e, zziy.NO_ERROR, true, this.f56374f, zzje.SUCCEEDED);
        ParcelFileDescriptor b = mo64604b();
        if (b == null) {
            mo64611j();
            return null;
        }
        gmsLogger.mo21702b("ModelDownloadManager", "moving downloaded model from external storage to private folder.");
        try {
            return this.f56379k.mo64615b(b, str, this.f56373e);
        } finally {
            mo64611j();
        }
    }
}
