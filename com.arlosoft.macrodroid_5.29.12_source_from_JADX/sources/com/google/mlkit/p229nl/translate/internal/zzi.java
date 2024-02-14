package com.google.mlkit.p229nl.translate.internal;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_translate.zzf;
import com.google.android.gms.internal.mlkit_translate.zzs;
import com.google.android.gms.internal.mlkit_translate.zzv;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.DownloadConditions;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.ModelInfo;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;
import com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager;
import com.google.mlkit.p229nl.translate.TranslateRemoteModel;
import java.io.File;
import java.util.List;

@WorkerThread
/* renamed from: com.google.mlkit.nl.translate.internal.zzi */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzi {

    /* renamed from: p */
    private static final GmsLogger f56514p = new GmsLogger("TranslateDLManager", "");

    /* renamed from: a */
    private final Context f56515a;

    /* renamed from: b */
    private final RemoteModelFileManager f56516b;

    /* renamed from: c */
    private final TranslateRemoteModel f56517c;

    /* renamed from: d */
    private final zzaf f56518d;

    /* renamed from: e */
    private final zzt f56519e;

    /* renamed from: f */
    private final zzu f56520f;
    @Nullable

    /* renamed from: g */
    private final DownloadManager f56521g;

    /* renamed from: h */
    private final ModelFileHelper f56522h;

    /* renamed from: i */
    private final SharedPrefManager f56523i;

    /* renamed from: j */
    private final zzc f56524j;

    /* renamed from: k */
    private final SharedPreferences f56525k;

    /* renamed from: l */
    private TaskCompletionSource f56526l;
    @Nullable

    /* renamed from: m */
    private List f56527m;
    @Nullable

    /* renamed from: n */
    private DownloadConditions f56528n;
    @Nullable

    /* renamed from: o */
    private BroadcastReceiver f56529o;

    @VisibleForTesting
    zzi(Context context, RemoteModelFileManager remoteModelFileManager, TranslateRemoteModel translateRemoteModel, zzaf zzaf, zzt zzt, zzu zzu, @Nullable DownloadManager downloadManager, ModelFileHelper modelFileHelper, SharedPrefManager sharedPrefManager, zzc zzc) {
        this.f56515a = context;
        this.f56516b = remoteModelFileManager;
        this.f56517c = translateRemoteModel;
        this.f56518d = zzaf;
        this.f56519e = zzt;
        this.f56520f = zzu;
        if (downloadManager == null) {
            f56514p.mo21702b("TranslateDLManager", "Download manager service is not available in the service.");
        }
        this.f56521g = downloadManager;
        this.f56522h = modelFileHelper;
        this.f56524j = zzc;
        this.f56523i = sharedPrefManager;
        this.f56525k = context.getSharedPreferences("com.google.mlkit.translate.download_manager", 0);
        this.f56526l = new TaskCompletionSource();
    }

    /* renamed from: k */
    private final int m79220k() {
        List list = this.f56527m;
        if (list != null && !list.isEmpty()) {
            List list2 = (List) Preconditions.m4488k(this.f56527m);
            String string = this.f56525k.getString("last_uri_for_".concat(String.valueOf(((ModelInfo) list2.get(0)).mo64555a())), (String) null);
            if (string != null) {
                int i = 0;
                while (i < list2.size()) {
                    boolean equals = string.equals(((ModelInfo) list2.get(i)).mo64558d().toString());
                    i++;
                    if (equals) {
                        return i;
                    }
                }
                f56514p.mo21704d("TranslateDLManager", "Stored LAST_URI_ATTEMPTED was not found in ModelInfo");
            }
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b1  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.tasks.Task m79221l() {
        /*
            r10 = this;
            com.google.mlkit.common.model.DownloadConditions r0 = r10.f56528n
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            com.google.android.gms.common.internal.Preconditions.m4493p(r0)
            int r0 = r10.m79220k()
            java.util.List r3 = r10.f56527m
            if (r3 == 0) goto L_0x0158
            int r3 = r3.size()
            if (r0 < r3) goto L_0x001c
            goto L_0x0158
        L_0x001c:
            java.util.List r3 = r10.f56527m
            java.lang.Object r0 = r3.get(r0)
            com.google.mlkit.common.sdkinternal.ModelInfo r0 = (com.google.mlkit.common.sdkinternal.ModelInfo) r0
            com.google.mlkit.common.model.DownloadConditions r3 = r10.f56528n     // Catch:{ MlKitException -> 0x0152 }
            if (r3 == 0) goto L_0x0029
            r1 = 1
        L_0x0029:
            com.google.android.gms.common.internal.Preconditions.m4493p(r1)     // Catch:{ MlKitException -> 0x0152 }
            com.google.mlkit.common.model.DownloadConditions r1 = r10.f56528n     // Catch:{ MlKitException -> 0x0152 }
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.m4488k(r1)     // Catch:{ MlKitException -> 0x0152 }
            com.google.mlkit.common.model.DownloadConditions r1 = (com.google.mlkit.common.model.DownloadConditions) r1     // Catch:{ MlKitException -> 0x0152 }
            java.lang.String r3 = r10.mo64680e()     // Catch:{ MlKitException -> 0x0152 }
            r4 = 2
            r5 = 0
            java.lang.String r6 = "TranslateDLManager"
            if (r3 == 0) goto L_0x0056
            java.lang.String r7 = r0.mo64555a()     // Catch:{ MlKitException -> 0x0152 }
            boolean r3 = r3.equals(r7)     // Catch:{ MlKitException -> 0x0152 }
            if (r3 == 0) goto L_0x0056
            java.lang.Integer r3 = r10.mo64678c()     // Catch:{ MlKitException -> 0x0152 }
            if (r3 == 0) goto L_0x0056
            com.google.android.gms.common.internal.GmsLogger r1 = f56514p     // Catch:{ MlKitException -> 0x0152 }
            java.lang.String r3 = "New model is already in downloading, do nothing."
            r1.mo21702b(r6, r3)     // Catch:{ MlKitException -> 0x0152 }
            goto L_0x009f
        L_0x0056:
            com.google.android.gms.common.internal.GmsLogger r3 = f56514p     // Catch:{ MlKitException -> 0x0152 }
            java.lang.String r7 = "Need to download a new model."
            r3.mo21702b(r6, r7)     // Catch:{ MlKitException -> 0x0152 }
            com.google.mlkit.nl.translate.TranslateRemoteModel r7 = r10.f56517c     // Catch:{ MlKitException -> 0x0152 }
            java.lang.String r8 = r0.mo64555a()     // Catch:{ MlKitException -> 0x0152 }
            boolean r7 = r10.mo64684i(r7, r8)     // Catch:{ MlKitException -> 0x0152 }
            r10.mo64683h()     // Catch:{ MlKitException -> 0x0152 }
            android.app.DownloadManager$Request r8 = new android.app.DownloadManager$Request     // Catch:{ MlKitException -> 0x0152 }
            android.net.Uri r9 = r0.mo64558d()     // Catch:{ MlKitException -> 0x0152 }
            r8.<init>(r9)     // Catch:{ MlKitException -> 0x0152 }
            boolean r9 = r10.mo64685j()     // Catch:{ MlKitException -> 0x0152 }
            if (r9 == 0) goto L_0x0081
            if (r7 != 0) goto L_0x0081
            java.lang.String r1 = "Remote model hash is simliar to local model. Skipping download."
            r3.mo21702b(r6, r1)     // Catch:{ MlKitException -> 0x0152 }
            goto L_0x009f
        L_0x0081:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ MlKitException -> 0x0152 }
            r5 = 24
            if (r3 < r5) goto L_0x008e
            boolean r3 = r1.mo64520a()     // Catch:{ MlKitException -> 0x0152 }
            r8.setRequiresCharging(r3)     // Catch:{ MlKitException -> 0x0152 }
        L_0x008e:
            boolean r1 = r1.mo64521b()     // Catch:{ MlKitException -> 0x0152 }
            if (r1 == 0) goto L_0x0097
            r8.setAllowedNetworkTypes(r4)     // Catch:{ MlKitException -> 0x0152 }
        L_0x0097:
            java.lang.String r1 = "User-Agent"
            java.lang.String r3 = "TRANSLATE_OPM5_TEST_1"
            r8.addRequestHeader(r1, r3)     // Catch:{ MlKitException -> 0x0152 }
            r5 = r8
        L_0x009f:
            if (r5 != 0) goto L_0x00b1
            java.lang.Long r1 = r10.mo64679d()
            if (r1 == 0) goto L_0x00a8
            goto L_0x00b1
        L_0x00a8:
            com.google.android.gms.internal.mlkit_translate.zzf r0 = com.google.android.gms.internal.mlkit_translate.zzf.m61779b()
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.m66667f(r0)
            return r0
        L_0x00b1:
            if (r5 == 0) goto L_0x010a
            com.google.mlkit.common.sdkinternal.MLTaskExecutor r1 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.m79033b()
            android.os.Handler r1 = r1.mo64549a()
            com.google.android.gms.common.internal.Preconditions.m4481d(r1)
            android.app.DownloadManager r1 = r10.f56521g
            if (r1 != 0) goto L_0x00c8
            com.google.mlkit.nl.translate.internal.zzt r0 = r10.f56519e
            r0.mo64700l()
            goto L_0x010a
        L_0x00c8:
            long r7 = r1.enqueue(r5)
            com.google.android.gms.common.internal.GmsLogger r1 = f56514p
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Schedule a new downloading task: "
            r3.append(r5)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            r1.mo21702b(r6, r3)
            com.google.mlkit.common.sdkinternal.SharedPrefManager r1 = r10.f56523i
            r1.mo64578l(r7, r0)
            android.content.SharedPreferences r1 = r10.f56525k
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r3 = r0.mo64555a()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r5 = "last_uri_for_"
            java.lang.String r3 = r5.concat(r3)
            android.net.Uri r0 = r0.mo64558d()
            java.lang.String r0 = r0.toString()
            android.content.SharedPreferences$Editor r0 = r1.putString(r3, r0)
            r0.commit()
        L_0x010a:
            java.lang.Integer r0 = r10.mo64678c()
            if (r0 == 0) goto L_0x013b
            int r1 = r0.intValue()
            r3 = 4
            if (r1 == r3) goto L_0x0123
            int r1 = r0.intValue()
            if (r1 == r2) goto L_0x0123
            int r0 = r0.intValue()
            if (r0 != r4) goto L_0x013b
        L_0x0123:
            android.content.BroadcastReceiver r0 = r10.f56529o
            if (r0 != 0) goto L_0x014b
            com.google.mlkit.nl.translate.internal.zzg r0 = new com.google.mlkit.nl.translate.internal.zzg
            r0.<init>(r10, r10)
            r10.f56529o = r0
            android.content.Context r1 = r10.f56515a
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r3 = "android.intent.action.DOWNLOAD_COMPLETE"
            r2.<init>(r3)
            r1.registerReceiver(r0, r2)
            goto L_0x014b
        L_0x013b:
            com.google.mlkit.common.sdkinternal.MLTaskExecutor r0 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.m79033b()
            android.os.Handler r0 = r0.mo64549a()
            com.google.mlkit.nl.translate.internal.zze r1 = new com.google.mlkit.nl.translate.internal.zze
            r1.<init>(r10)
            r0.post(r1)
        L_0x014b:
            com.google.android.gms.tasks.TaskCompletionSource r0 = r10.f56526l
            com.google.android.gms.tasks.Task r0 = r0.mo56137a()
            return r0
        L_0x0152:
            r0 = move-exception
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.m66666e(r0)
            return r0
        L_0x0158:
            com.google.android.gms.internal.mlkit_translate.zzf r0 = com.google.android.gms.internal.mlkit_translate.zzf.m61779b()
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.m66667f(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.p229nl.translate.internal.zzi.m79221l():com.google.android.gms.tasks.Task");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Task mo64676a(DownloadConditions downloadConditions) {
        try {
            List a = this.f56520f.mo64715a(this.f56515a, this.f56517c);
            ModelInfo modelInfo = (ModelInfo) a.get(0);
            boolean z = !mo64685j();
            if (z) {
                this.f56523i.mo64569b(this.f56517c);
            }
            boolean i = mo64684i(this.f56517c, modelInfo.mo64555a());
            if (!z && !i) {
                a = null;
            }
            this.f56527m = a;
            if (a == null || a.isEmpty()) {
                f56514p.mo21702b("TranslateDLManager", "No model updates for model: ".concat(String.valueOf(zzad.m79188e(this.f56517c.mo64631f()))));
                return Tasks.m66667f(zzf.m61779b());
            }
            this.f56526l = new TaskCompletionSource();
            this.f56528n = downloadConditions;
            return m79221l();
        } catch (MlKitException e) {
            return Tasks.m66666e(e);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0217, code lost:
        throw new java.io.IOException("Zip file could not be deleted.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        f56514p.mo21704d("TranslateDLManager", "Downloaded file is not found");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0184, code lost:
        if (r5.delete() == false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0186, code lost:
        r4 = r14.listFiles(new com.google.mlkit.p229nl.translate.internal.zzb(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x018f, code lost:
        if (r4 == null) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0192, code lost:
        if (r4.length != 1) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0194, code lost:
        r4 = r4[0];
        r8 = r4.listFiles();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x019a, code lost:
        if (r8 == null) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a0, code lost:
        if (com.google.mlkit.p229nl.translate.internal.zzd.m79218c(r7, false) == false) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01a2, code lost:
        r9 = r8.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01a3, code lost:
        if (r11 >= r9) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a5, code lost:
        r10 = r8[r11];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b4, code lost:
        if (r10.renameTo(new java.io.File(r7, r10.getName())) == false) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01b6, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01c0, code lost:
        throw new java.io.IOException("Zip content file could not be moved.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c5, code lost:
        if (r4.delete() == false) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        f56514p.mo21702b("TranslateDLManager", "Moved the downloaded model to private folder successfully: ".concat(r5.toString()));
        r1.f56523i.mo64580n(r1.f56517c, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01dd, code lost:
        r4 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01f7, code lost:
        throw new java.io.IOException("Unzipped folder could not be deleted.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01ff, code lost:
        throw new java.io.IOException("Unable to delete existing models");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0207, code lost:
        throw new java.io.IOException("Failed to list zip content files.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x020f, code lost:
        throw new java.io.IOException("Unexpected behavior for inZipFolder inside the zip archive.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0095 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009f A[Catch:{ all -> 0x025d }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a6 A[Catch:{ all -> 0x025d }] */
    @androidx.annotation.Nullable
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File mo64677b() throws com.google.mlkit.common.MlKitException {
        /*
            r18 = this;
            r1 = r18
            com.google.mlkit.common.sdkinternal.MLTaskExecutor r0 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.m79033b()
            android.os.Handler r0 = r0.mo64549a()
            com.google.android.gms.common.internal.Preconditions.m4481d(r0)
            java.lang.Long r0 = r18.mo64679d()
            java.lang.String r2 = r18.mo64680e()
            java.lang.String r3 = "TranslateDLManager"
            r4 = 0
            if (r0 == 0) goto L_0x02c0
            if (r2 != 0) goto L_0x001e
            goto L_0x02c0
        L_0x001e:
            java.lang.Integer r5 = r18.mo64678c()
            r6 = 13
            if (r5 != 0) goto L_0x0036
            r18.mo64683h()
            com.google.android.gms.tasks.TaskCompletionSource r0 = r1.f56526l
            com.google.mlkit.common.MlKitException r2 = new com.google.mlkit.common.MlKitException
            java.lang.String r3 = "No download"
            r2.<init>(r3, r6)
            r0.mo56138b(r2)
            return r4
        L_0x0036:
            com.google.android.gms.common.internal.GmsLogger r7 = f56514p
            java.lang.String r8 = r5.toString()
            java.lang.String r9 = "Download Status code: "
            java.lang.String r8 = r9.concat(r8)
            r7.mo21702b(r3, r8)
            int r8 = r5.intValue()
            r9 = 8
            r10 = 1
            r11 = 0
            if (r8 != r9) goto L_0x0262
            android.content.BroadcastReceiver r5 = r1.f56529o
            if (r5 == 0) goto L_0x005a
            android.content.Context r8 = r1.f56515a
            r8.unregisterReceiver(r5)
            r1.f56529o = r4
        L_0x005a:
            java.lang.String r5 = "Model downloaded successfully"
            r7.mo21702b(r3, r5)
            com.google.mlkit.nl.translate.internal.zzt r12 = r1.f56519e
            com.google.mlkit.nl.translate.TranslateRemoteModel r13 = r1.f56517c
            com.google.android.gms.internal.mlkit_translate.zzld r14 = com.google.android.gms.internal.mlkit_translate.zzld.NO_ERROR
            r15 = 1
            com.google.mlkit.common.sdkinternal.ModelType r16 = com.google.mlkit.common.sdkinternal.ModelType.TRANSLATE
            com.google.android.gms.internal.mlkit_translate.zzlj r17 = com.google.android.gms.internal.mlkit_translate.zzlj.SUCCEEDED
            r12.mo64691c(r13, r14, r15, r16, r17)
            com.google.mlkit.common.sdkinternal.MLTaskExecutor r5 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.m79033b()     // Catch:{ all -> 0x025d }
            android.os.Handler r5 = r5.mo64549a()     // Catch:{ all -> 0x025d }
            com.google.android.gms.common.internal.Preconditions.m4481d(r5)     // Catch:{ all -> 0x025d }
            android.app.DownloadManager r5 = r1.f56521g     // Catch:{ all -> 0x025d }
            if (r5 != 0) goto L_0x0082
            com.google.mlkit.nl.translate.internal.zzt r5 = r1.f56519e     // Catch:{ all -> 0x025d }
            r5.mo64700l()     // Catch:{ all -> 0x025d }
            goto L_0x0088
        L_0x0082:
            java.lang.Long r5 = r18.mo64679d()     // Catch:{ all -> 0x025d }
            if (r5 != 0) goto L_0x008a
        L_0x0088:
            r5 = r4
            goto L_0x009d
        L_0x008a:
            android.app.DownloadManager r7 = r1.f56521g     // Catch:{ FileNotFoundException -> 0x0095 }
            long r8 = r5.longValue()     // Catch:{ FileNotFoundException -> 0x0095 }
            android.os.ParcelFileDescriptor r5 = r7.openDownloadedFile(r8)     // Catch:{ FileNotFoundException -> 0x0095 }
            goto L_0x009d
        L_0x0095:
            com.google.android.gms.common.internal.GmsLogger r5 = f56514p     // Catch:{ all -> 0x025d }
            java.lang.String r7 = "Downloaded file is not found"
            r5.mo21704d(r3, r7)     // Catch:{ all -> 0x025d }
            goto L_0x0088
        L_0x009d:
            if (r5 != 0) goto L_0x00a6
            com.google.mlkit.nl.translate.internal.zzt r2 = r1.f56519e     // Catch:{ all -> 0x025d }
            r2.mo64711w()     // Catch:{ all -> 0x025d }
            goto L_0x01de
        L_0x00a6:
            com.google.android.gms.common.internal.GmsLogger r7 = f56514p     // Catch:{ all -> 0x025d }
            java.lang.String r8 = "moving downloaded model from external storage to private folder."
            r7.mo21702b(r3, r8)     // Catch:{ all -> 0x025d }
            com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager r7 = r1.f56516b     // Catch:{ all -> 0x025d }
            com.google.mlkit.nl.translate.TranslateRemoteModel r8 = r1.f56517c     // Catch:{ all -> 0x025d }
            java.io.File r5 = r7.mo64615b(r5, r2, r8)     // Catch:{ all -> 0x025d }
            if (r5 != 0) goto L_0x00be
            com.google.mlkit.nl.translate.internal.zzt r2 = r1.f56519e     // Catch:{ all -> 0x025d }
            r2.mo64710v()     // Catch:{ all -> 0x025d }
            goto L_0x01de
        L_0x00be:
            com.google.mlkit.common.sdkinternal.MLTaskExecutor r4 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.m79033b()     // Catch:{ all -> 0x025d }
            android.os.Handler r4 = r4.mo64549a()     // Catch:{ all -> 0x025d }
            com.google.android.gms.common.internal.Preconditions.m4481d(r4)     // Catch:{ all -> 0x025d }
            com.google.mlkit.nl.translate.TranslateRemoteModel r4 = r1.f56517c     // Catch:{ all -> 0x025d }
            java.lang.String r4 = r4.mo64631f()     // Catch:{ all -> 0x025d }
            java.lang.String r4 = com.google.mlkit.p229nl.translate.internal.zzad.m79188e(r4)     // Catch:{ all -> 0x025d }
            com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager r7 = r1.f56516b     // Catch:{ all -> 0x025d }
            java.io.File r7 = r7.mo64614a(r11)     // Catch:{ all -> 0x025d }
            java.lang.String r4 = com.google.mlkit.p229nl.translate.internal.zzad.m79187d(r4)     // Catch:{ all -> 0x025d }
            java.lang.String r8 = "9999)"
            java.io.File r9 = new java.io.File     // Catch:{ IOException -> 0x024a }
            java.lang.String r12 = "java.io.tmpdir"
            java.lang.String r12 = java.lang.System.getProperty(r12)     // Catch:{ IOException -> 0x024a }
            r9.<init>(r12)     // Catch:{ IOException -> 0x024a }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x024a }
            r12.<init>()     // Catch:{ IOException -> 0x024a }
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x024a }
            r12.append(r13)     // Catch:{ IOException -> 0x024a }
            java.lang.String r13 = "-"
            r12.append(r13)     // Catch:{ IOException -> 0x024a }
            java.lang.String r12 = r12.toString()     // Catch:{ IOException -> 0x024a }
            r13 = 0
        L_0x0100:
            r14 = 10000(0x2710, float:1.4013E-41)
            if (r13 >= r14) goto L_0x0228
            java.io.File r14 = new java.io.File     // Catch:{ IOException -> 0x024a }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x024a }
            r15.<init>()     // Catch:{ IOException -> 0x024a }
            r15.append(r12)     // Catch:{ IOException -> 0x024a }
            r15.append(r13)     // Catch:{ IOException -> 0x024a }
            java.lang.String r15 = r15.toString()     // Catch:{ IOException -> 0x024a }
            r14.<init>(r9, r15)     // Catch:{ IOException -> 0x024a }
            boolean r15 = r14.mkdir()     // Catch:{ IOException -> 0x024a }
            if (r15 == 0) goto L_0x0224
            java.util.zip.ZipInputStream r8 = new java.util.zip.ZipInputStream     // Catch:{ IOException -> 0x024a }
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ IOException -> 0x024a }
            r9.<init>(r5)     // Catch:{ IOException -> 0x024a }
            r8.<init>(r9)     // Catch:{ IOException -> 0x024a }
        L_0x0128:
            java.util.zip.ZipEntry r9 = r8.getNextEntry()     // Catch:{ all -> 0x0218 }
            if (r9 == 0) goto L_0x017d
            boolean r12 = r9.isDirectory()     // Catch:{ all -> 0x0218 }
            if (r12 == 0) goto L_0x0135
            goto L_0x0128
        L_0x0135:
            java.lang.String r9 = r9.getName()     // Catch:{ all -> 0x0218 }
            java.io.File r12 = new java.io.File     // Catch:{ all -> 0x0218 }
            r12.<init>(r14, r9)     // Catch:{ all -> 0x0218 }
            java.lang.String r13 = r12.getCanonicalPath()     // Catch:{ all -> 0x0218 }
            java.lang.String r15 = r14.getCanonicalPath()     // Catch:{ all -> 0x0218 }
            boolean r13 = r13.startsWith(r15)     // Catch:{ all -> 0x0218 }
            if (r13 == 0) goto L_0x016d
            java.io.File r9 = r12.getParentFile()     // Catch:{ all -> 0x0218 }
            if (r9 == 0) goto L_0x0155
            com.google.mlkit.p229nl.translate.internal.zzd.m79216a(r9)     // Catch:{ all -> 0x0218 }
        L_0x0155:
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ all -> 0x0218 }
            r9.<init>(r12)     // Catch:{ all -> 0x0218 }
            com.google.android.gms.internal.mlkit_translate.zzav.m61603a(r8, r9)     // Catch:{ all -> 0x0161 }
            r9.close()     // Catch:{ all -> 0x0218 }
            goto L_0x0128
        L_0x0161:
            r0 = move-exception
            r2 = r0
            r9.close()     // Catch:{ all -> 0x0167 }
            goto L_0x016c
        L_0x0167:
            r0 = move-exception
            r4 = r0
            com.google.mlkit.p229nl.translate.internal.zza.m79175a(r2, r4)     // Catch:{ all -> 0x0218 }
        L_0x016c:
            throw r2     // Catch:{ all -> 0x0218 }
        L_0x016d:
            java.util.zip.ZipException r0 = new java.util.zip.ZipException     // Catch:{ all -> 0x0218 }
            java.lang.String r2 = "Illegal name: "
            java.lang.String r4 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0218 }
            java.lang.String r2 = r2.concat(r4)     // Catch:{ all -> 0x0218 }
            r0.<init>(r2)     // Catch:{ all -> 0x0218 }
            throw r0     // Catch:{ all -> 0x0218 }
        L_0x017d:
            r8.close()     // Catch:{ IOException -> 0x024a }
            boolean r8 = r5.delete()     // Catch:{ IOException -> 0x024a }
            if (r8 == 0) goto L_0x0210
            com.google.mlkit.nl.translate.internal.zzb r8 = new com.google.mlkit.nl.translate.internal.zzb     // Catch:{ IOException -> 0x024a }
            r8.<init>(r4)     // Catch:{ IOException -> 0x024a }
            java.io.File[] r4 = r14.listFiles(r8)     // Catch:{ IOException -> 0x024a }
            if (r4 == 0) goto L_0x0208
            int r8 = r4.length     // Catch:{ IOException -> 0x024a }
            if (r8 != r10) goto L_0x0208
            r4 = r4[r11]     // Catch:{ IOException -> 0x024a }
            java.io.File[] r8 = r4.listFiles()     // Catch:{ IOException -> 0x024a }
            if (r8 == 0) goto L_0x0200
            boolean r9 = com.google.mlkit.p229nl.translate.internal.zzd.m79218c(r7, false)     // Catch:{ IOException -> 0x024a }
            if (r9 == 0) goto L_0x01f8
            int r9 = r8.length     // Catch:{ IOException -> 0x024a }
        L_0x01a3:
            if (r11 >= r9) goto L_0x01c1
            r10 = r8[r11]     // Catch:{ IOException -> 0x024a }
            java.io.File r12 = new java.io.File     // Catch:{ IOException -> 0x024a }
            java.lang.String r13 = r10.getName()     // Catch:{ IOException -> 0x024a }
            r12.<init>(r7, r13)     // Catch:{ IOException -> 0x024a }
            boolean r10 = r10.renameTo(r12)     // Catch:{ IOException -> 0x024a }
            if (r10 == 0) goto L_0x01b9
            int r11 = r11 + 1
            goto L_0x01a3
        L_0x01b9:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x024a }
            java.lang.String r2 = "Zip content file could not be moved."
            r0.<init>(r2)     // Catch:{ IOException -> 0x024a }
            throw r0     // Catch:{ IOException -> 0x024a }
        L_0x01c1:
            boolean r4 = r4.delete()     // Catch:{ IOException -> 0x024a }
            if (r4 == 0) goto L_0x01f0
            com.google.android.gms.common.internal.GmsLogger r4 = f56514p     // Catch:{ all -> 0x025d }
            java.lang.String r6 = "Moved the downloaded model to private folder successfully: "
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x025d }
            java.lang.String r5 = r6.concat(r5)     // Catch:{ all -> 0x025d }
            r4.mo21702b(r3, r5)     // Catch:{ all -> 0x025d }
            com.google.mlkit.common.sdkinternal.SharedPrefManager r3 = r1.f56523i     // Catch:{ all -> 0x025d }
            com.google.mlkit.nl.translate.TranslateRemoteModel r4 = r1.f56517c     // Catch:{ all -> 0x025d }
            r3.mo64580n(r4, r2)     // Catch:{ all -> 0x025d }
            r4 = r7
        L_0x01de:
            r18.mo64683h()
            com.google.mlkit.nl.translate.internal.zzt r2 = r1.f56519e
            r2.mo64704p()
            com.google.android.gms.tasks.TaskCompletionSource r2 = r1.f56526l
            com.google.android.gms.internal.mlkit_translate.zzf r0 = com.google.android.gms.internal.mlkit_translate.zzf.m61780c(r0)
            r2.mo56139c(r0)
            return r4
        L_0x01f0:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x024a }
            java.lang.String r2 = "Unzipped folder could not be deleted."
            r0.<init>(r2)     // Catch:{ IOException -> 0x024a }
            throw r0     // Catch:{ IOException -> 0x024a }
        L_0x01f8:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x024a }
            java.lang.String r2 = "Unable to delete existing models"
            r0.<init>(r2)     // Catch:{ IOException -> 0x024a }
            throw r0     // Catch:{ IOException -> 0x024a }
        L_0x0200:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x024a }
            java.lang.String r2 = "Failed to list zip content files."
            r0.<init>(r2)     // Catch:{ IOException -> 0x024a }
            throw r0     // Catch:{ IOException -> 0x024a }
        L_0x0208:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x024a }
            java.lang.String r2 = "Unexpected behavior for inZipFolder inside the zip archive."
            r0.<init>(r2)     // Catch:{ IOException -> 0x024a }
            throw r0     // Catch:{ IOException -> 0x024a }
        L_0x0210:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x024a }
            java.lang.String r2 = "Zip file could not be deleted."
            r0.<init>(r2)     // Catch:{ IOException -> 0x024a }
            throw r0     // Catch:{ IOException -> 0x024a }
        L_0x0218:
            r0 = move-exception
            r2 = r0
            r8.close()     // Catch:{ all -> 0x021e }
            goto L_0x0223
        L_0x021e:
            r0 = move-exception
            r4 = r0
            com.google.mlkit.p229nl.translate.internal.zza.m79175a(r2, r4)     // Catch:{ IOException -> 0x024a }
        L_0x0223:
            throw r2     // Catch:{ IOException -> 0x024a }
        L_0x0224:
            int r13 = r13 + 1
            goto L_0x0100
        L_0x0228:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x024a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x024a }
            r2.<init>()     // Catch:{ IOException -> 0x024a }
            java.lang.String r4 = "Failed to create directory within 10000 attempts (tried "
            r2.append(r4)     // Catch:{ IOException -> 0x024a }
            r2.append(r12)     // Catch:{ IOException -> 0x024a }
            java.lang.String r4 = "0 to "
            r2.append(r4)     // Catch:{ IOException -> 0x024a }
            r2.append(r12)     // Catch:{ IOException -> 0x024a }
            r2.append(r8)     // Catch:{ IOException -> 0x024a }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x024a }
            r0.<init>(r2)     // Catch:{ IOException -> 0x024a }
            throw r0     // Catch:{ IOException -> 0x024a }
        L_0x024a:
            r0 = move-exception
            java.lang.String r2 = "Could not unzip translate model file"
            com.google.android.gms.common.internal.GmsLogger r4 = f56514p     // Catch:{ all -> 0x025d }
            r4.mo21703c(r3, r2, r0)     // Catch:{ all -> 0x025d }
            com.google.mlkit.nl.translate.internal.zzt r3 = r1.f56519e     // Catch:{ all -> 0x025d }
            r3.mo64712x()     // Catch:{ all -> 0x025d }
            com.google.mlkit.common.MlKitException r3 = new com.google.mlkit.common.MlKitException     // Catch:{ all -> 0x025d }
            r3.<init>(r2, r6, r0)     // Catch:{ all -> 0x025d }
            throw r3     // Catch:{ all -> 0x025d }
        L_0x025d:
            r0 = move-exception
            r18.mo64683h()
            throw r0
        L_0x0262:
            int r2 = r5.intValue()
            r3 = 16
            if (r2 != r3) goto L_0x02bf
            android.app.DownloadManager r2 = r1.f56521g
            if (r2 != 0) goto L_0x0270
        L_0x026e:
            r0 = 0
            goto L_0x029b
        L_0x0270:
            android.app.DownloadManager$Query r3 = new android.app.DownloadManager$Query
            r3.<init>()
            long[] r5 = new long[r10]
            long r7 = r0.longValue()
            r5[r11] = r7
            android.app.DownloadManager$Query r0 = r3.setFilterById(r5)
            android.database.Cursor r0 = r2.query(r0)
            if (r0 == 0) goto L_0x026e
            boolean r2 = r0.moveToFirst()
            if (r2 != 0) goto L_0x028e
            goto L_0x026e
        L_0x028e:
            java.lang.String r2 = "reason"
            int r2 = r0.getColumnIndex(r2)
            r3 = -1
            if (r2 == r3) goto L_0x026e
            int r0 = r0.getInt(r2)
        L_0x029b:
            com.google.mlkit.nl.translate.internal.zzt r2 = r1.f56519e
            com.google.mlkit.nl.translate.TranslateRemoteModel r3 = r1.f56517c
            r2.mo64692d(r3, r10, r0)
            r18.mo64683h()
            com.google.android.gms.tasks.TaskCompletionSource r2 = r1.f56526l
            com.google.mlkit.common.MlKitException r3 = new com.google.mlkit.common.MlKitException
            java.util.Locale r5 = java.util.Locale.US
            java.lang.Object[] r7 = new java.lang.Object[r10]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7[r11] = r0
            java.lang.String r0 = "Downloading error %d"
            java.lang.String r0 = java.lang.String.format(r5, r0, r7)
            r3.<init>(r0, r6)
            r2.mo56138b(r3)
        L_0x02bf:
            return r4
        L_0x02c0:
            com.google.android.gms.common.internal.GmsLogger r0 = f56514p
            java.lang.String r2 = "No new model is downloading."
            r0.mo21702b(r3, r2)
            r18.mo64683h()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.p229nl.translate.internal.zzi.mo64677b():java.io.File");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e A[SYNTHETIC, Splitter:B:19:0x004e] */
    @androidx.annotation.VisibleForTesting
    @androidx.annotation.Nullable
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer mo64678c() {
        /*
            r8 = this;
            android.app.DownloadManager r0 = r8.f56521g
            r1 = 0
            if (r0 != 0) goto L_0x000b
            com.google.mlkit.nl.translate.internal.zzt r0 = r8.f56519e
            r0.mo64700l()
            return r1
        L_0x000b:
            java.lang.Long r0 = r8.mo64679d()
            if (r0 != 0) goto L_0x0012
            return r1
        L_0x0012:
            android.app.DownloadManager r2 = r8.f56521g
            android.app.DownloadManager$Query r3 = new android.app.DownloadManager$Query
            r3.<init>()
            r4 = 1
            long[] r5 = new long[r4]
            long r6 = r0.longValue()
            r0 = 0
            r5[r0] = r6
            android.app.DownloadManager$Query r3 = r3.setFilterById(r5)
            android.database.Cursor r2 = r2.query(r3)
            if (r2 == 0) goto L_0x0045
            boolean r3 = r2.moveToFirst()     // Catch:{ all -> 0x0042 }
            if (r3 == 0) goto L_0x0045
            java.lang.String r3 = "status"
            int r3 = r2.getColumnIndex(r3)     // Catch:{ all -> 0x0042 }
            int r3 = r2.getInt(r3)     // Catch:{ all -> 0x0042 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0042 }
            goto L_0x0046
        L_0x0042:
            r1 = move-exception
            goto L_0x00d5
        L_0x0045:
            r3 = r1
        L_0x0046:
            if (r3 != 0) goto L_0x004e
            if (r2 == 0) goto L_0x004d
            r2.close()
        L_0x004d:
            return r1
        L_0x004e:
            int r5 = r3.intValue()     // Catch:{ all -> 0x0042 }
            r6 = 16
            if (r5 != r6) goto L_0x00ad
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.m4488k(r2)     // Catch:{ all -> 0x0042 }
            android.database.Cursor r5 = (android.database.Cursor) r5     // Catch:{ all -> 0x0042 }
            java.lang.String r7 = "reason"
            int r7 = r5.getColumnIndex(r7)     // Catch:{ all -> 0x0042 }
            int r5 = r5.getInt(r7)     // Catch:{ all -> 0x0042 }
            r7 = 100
            if (r5 < r7) goto L_0x0074
            r7 = 599(0x257, float:8.4E-43)
            if (r5 > r7) goto L_0x0074
            com.google.mlkit.nl.translate.internal.zzt r7 = r8.f56519e     // Catch:{ all -> 0x0042 }
            r7.mo64698j(r5)     // Catch:{ all -> 0x0042 }
            goto L_0x00ad
        L_0x0074:
            switch(r5) {
                case 1001: goto L_0x00a4;
                case 1002: goto L_0x009e;
                case 1003: goto L_0x0077;
                case 1004: goto L_0x0098;
                case 1005: goto L_0x0092;
                case 1006: goto L_0x008c;
                case 1007: goto L_0x0086;
                case 1008: goto L_0x0080;
                case 1009: goto L_0x007a;
                default: goto L_0x0077;
            }     // Catch:{ all -> 0x0042 }
        L_0x0077:
            com.google.mlkit.nl.translate.internal.zzt r5 = r8.f56519e     // Catch:{ all -> 0x0042 }
            goto L_0x00aa
        L_0x007a:
            com.google.mlkit.nl.translate.internal.zzt r5 = r8.f56519e     // Catch:{ all -> 0x0042 }
            r5.mo64695g()     // Catch:{ all -> 0x0042 }
            goto L_0x00ad
        L_0x0080:
            com.google.mlkit.nl.translate.internal.zzt r5 = r8.f56519e     // Catch:{ all -> 0x0042 }
            r5.mo64693e()     // Catch:{ all -> 0x0042 }
            goto L_0x00ad
        L_0x0086:
            com.google.mlkit.nl.translate.internal.zzt r5 = r8.f56519e     // Catch:{ all -> 0x0042 }
            r5.mo64694f()     // Catch:{ all -> 0x0042 }
            goto L_0x00ad
        L_0x008c:
            com.google.mlkit.nl.translate.internal.zzt r5 = r8.f56519e     // Catch:{ all -> 0x0042 }
            r5.mo64699k()     // Catch:{ all -> 0x0042 }
            goto L_0x00ad
        L_0x0092:
            com.google.mlkit.nl.translate.internal.zzt r5 = r8.f56519e     // Catch:{ all -> 0x0042 }
            r5.mo64701m()     // Catch:{ all -> 0x0042 }
            goto L_0x00ad
        L_0x0098:
            com.google.mlkit.nl.translate.internal.zzt r5 = r8.f56519e     // Catch:{ all -> 0x0042 }
            r5.mo64697i()     // Catch:{ all -> 0x0042 }
            goto L_0x00ad
        L_0x009e:
            com.google.mlkit.nl.translate.internal.zzt r5 = r8.f56519e     // Catch:{ all -> 0x0042 }
            r5.mo64702n()     // Catch:{ all -> 0x0042 }
            goto L_0x00ad
        L_0x00a4:
            com.google.mlkit.nl.translate.internal.zzt r5 = r8.f56519e     // Catch:{ all -> 0x0042 }
            r5.mo64696h()     // Catch:{ all -> 0x0042 }
            goto L_0x00ad
        L_0x00aa:
            r5.mo64703o()     // Catch:{ all -> 0x0042 }
        L_0x00ad:
            int r5 = r3.intValue()     // Catch:{ all -> 0x0042 }
            r7 = 2
            if (r5 == r7) goto L_0x00d0
            int r5 = r3.intValue()     // Catch:{ all -> 0x0042 }
            r7 = 4
            if (r5 == r7) goto L_0x00d0
            int r5 = r3.intValue()     // Catch:{ all -> 0x0042 }
            if (r5 == r4) goto L_0x00d0
            int r5 = r3.intValue()     // Catch:{ all -> 0x0042 }
            r7 = 8
            if (r5 == r7) goto L_0x00d0
            int r0 = r3.intValue()     // Catch:{ all -> 0x0042 }
            if (r0 == r6) goto L_0x00d0
            goto L_0x00d1
        L_0x00d0:
            r1 = r3
        L_0x00d1:
            r2.close()
            return r1
        L_0x00d5:
            r2.close()     // Catch:{ all -> 0x00d9 }
            goto L_0x00ef
        L_0x00d9:
            r2 = move-exception
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x00ef }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r3[r0] = r5     // Catch:{ Exception -> 0x00ef }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r3 = r5.getDeclaredMethod(r6, r3)     // Catch:{ Exception -> 0x00ef }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00ef }
            r4[r0] = r2     // Catch:{ Exception -> 0x00ef }
            r3.invoke(r1, r4)     // Catch:{ Exception -> 0x00ef }
        L_0x00ef:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.p229nl.translate.internal.zzi.mo64678c():java.lang.Integer");
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    @Nullable
    /* renamed from: d */
    public final Long mo64679d() {
        return this.f56523i.mo64571d(this.f56517c);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    @Nullable
    /* renamed from: e */
    public final String mo64680e() {
        return this.f56523i.mo64570c(this.f56517c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo64681f() throws MlKitException {
        mo64683h();
        this.f56523i.mo64569b(this.f56517c);
        String e = zzad.m79188e(this.f56517c.mo64631f());
        File a = this.f56516b.mo64614a(false);
        String[] g = zzad.m79190g(e);
        zzaf.m79195g(a, g[0], g[1]);
        zzaf.m79195g(a, g[1], g[0]);
        zzs zzs = new zzs();
        zzv a2 = zzad.m79184a(e);
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            String str = (String) a2.get(i);
            File file = new File(a, str);
            if (file.exists() && !file.delete()) {
                zzs.mo52481d(str);
            }
        }
        zzv e2 = zzs.mo52482e();
        if (e2.isEmpty()) {
            this.f56526l.mo56140d(new MlKitException("Download canceled", 1));
            return;
        }
        throw new MlKitException("Couldn't delete model files ".concat(String.valueOf(TextUtils.join(", ", e2))), 13);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: g */
    public final void mo64682g() {
        List list;
        Integer c = mo64678c();
        if (c != null) {
            try {
                if (c.intValue() == 16 && (list = this.f56527m) != null) {
                    if (list.size() > m79220k()) {
                        this.f56523i.mo64568a(this.f56517c);
                        m79221l();
                        return;
                    }
                }
            } catch (MlKitException e) {
                this.f56526l.mo56138b(e);
                return;
            }
        }
        mo64677b();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: h */
    public final void mo64683h() throws MlKitException {
        Preconditions.m4481d(MLTaskExecutor.m79033b().mo64549a());
        if (this.f56521g == null) {
            this.f56519e.mo64700l();
            return;
        }
        Long d = mo64679d();
        if (d != null) {
            f56514p.mo21702b("TranslateDLManager", "Cancel or remove existing downloading task: ".concat(d.toString()));
            if (this.f56521g.remove(new long[]{d.longValue()}) > 0 || mo64678c() == null) {
                this.f56522h.mo64591c(TranslateRemoteModel.m79145g(zzad.m79188e(this.f56517c.mo64631f())), this.f56517c.mo64531d());
                this.f56523i.mo64568a(this.f56517c);
                List list = this.f56527m;
                if (list != null && !list.isEmpty()) {
                    this.f56525k.edit().remove("last_uri_for_".concat(String.valueOf(((ModelInfo) this.f56527m.get(0)).mo64555a()))).commit();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: i */
    public final boolean mo64684i(RemoteModel remoteModel, String str) {
        return !str.equals(this.f56523i.mo64573g(remoteModel));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo64685j() {
        String e = zzad.m79188e(this.f56517c.mo64631f());
        File a = this.f56516b.mo64614a(false);
        zzv a2 = zzad.m79184a(e);
        int size = a2.size();
        int i = 0;
        while (i < size) {
            i++;
            if (!new File(a, (String) a2.get(i)).exists()) {
                return false;
            }
        }
        return true;
    }
}
