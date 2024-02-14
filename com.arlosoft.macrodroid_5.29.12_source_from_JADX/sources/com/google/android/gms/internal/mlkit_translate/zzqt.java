package com.google.android.gms.internal.mlkit_translate;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.XmlRes;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzqt {

    /* renamed from: l */
    private static final ExecutorService f44488l = Executors.newSingleThreadExecutor();

    /* renamed from: m */
    private static final ExecutorService f44489m = Executors.newSingleThreadExecutor();

    /* renamed from: n */
    public static final long f44490n = TimeUnit.HOURS.toSeconds(12);
    @Nullable

    /* renamed from: o */
    private static zzqt f44491o;

    /* renamed from: a */
    private final Context f44492a;

    /* renamed from: b */
    private final Executor f44493b;

    /* renamed from: c */
    private final Executor f44494c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final zzov f44495d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final zzql f44496e;
    @Nullable

    /* renamed from: f */
    private volatile zzy f44497f;
    @Nullable

    /* renamed from: g */
    private volatile zzy f44498g;

    /* renamed from: h */
    private final Map f44499h = new TreeMap();

    /* renamed from: i */
    private final zzqy f44500i;

    /* renamed from: j */
    private final zzqw f44501j;

    /* renamed from: k */
    private final zzqq f44502k;

    @VisibleForTesting
    zzqt(Context context, zzov zzov, ExecutorService executorService, ExecutorService executorService2, zzqq zzqq, zzqw zzqw, zzou zzou, byte[] bArr) {
        this.f44492a = context.getApplicationContext();
        this.f44495d = zzov;
        this.f44493b = executorService;
        this.f44494c = executorService2;
        this.f44502k = zzqq;
        zzqw zzqw2 = zzqw;
        this.f44501j = zzqw2;
        this.f44496e = new zzql(context, zzou.mo52380b(), zzou.mo52379a(), "firebase", 5, 5, zzqw2);
        this.f44500i = new zzqy(context);
    }

    /* renamed from: e */
    public static synchronized zzqt m62222e(Context context) {
        zzqt zzqt;
        synchronized (zzqt.class) {
            if (f44491o == null) {
                Context context2 = context;
                f44491o = new zzqt(context2, zzov.m62099b(context), f44488l, f44489m, zzqq.f44480a, new zzqw(context), zzpc.f44397a, (byte[]) null);
            }
            zzqt = f44491o;
        }
        return zzqt;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static zzy m62223j(JSONObject jSONObject) throws JSONException {
        String str;
        zzqr zzqr = new zzqr(jSONObject);
        zzx zzx = new zzx();
        Iterator<String> keys = zzqr.f44481a.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                String string = jSONObject.getString(next);
                if (string == null) {
                    str = null;
                } else if (string.isEmpty()) {
                    str = "";
                } else {
                    str = new JSONObject("{ \"value\": " + string + " }").getString("value");
                }
                zzx.mo52499a(next, str);
            } catch (JSONException e) {
                Log.e("MLKit RemoteConfigRestC", "Getting JSON string value for remote config key " + next + " failed", e);
                throw e;
            }
        }
        return zzx.mo52500b();
    }

    /* renamed from: a */
    public final Task mo52463a(long j) {
        Date date = new Date(System.currentTimeMillis());
        zzox zzox = new zzox();
        zzox.mo52391g();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f44494c.execute(new zzqp(this, date, j, zzox, true, taskCompletionSource));
        return taskCompletionSource.mo56137a().mo23721v(this.f44494c, new zzqo(this));
    }

    /* renamed from: f */
    public final String mo52464f(@NonNull String str) {
        String str2;
        zzy zzy = this.f44497f;
        if (zzy != null && zzy.containsKey(str)) {
            return (String) zzy.get(str);
        }
        synchronized (this.f44499h) {
            str2 = (String) this.f44499h.get(str);
        }
        return str2;
    }

    /* renamed from: g */
    public final void mo52465g() {
        zzox zzox = new zzox();
        zzox.mo52391g();
        this.f44497f = this.f44498g;
        zzox.mo52389e();
        this.f44501j.mo52468b(zzox);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e A[Catch:{ zzqv | InterruptedException | RuntimeException -> 0x00bb, all -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065 A[SYNTHETIC, Splitter:B:18:0x0065] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a8 A[Catch:{ zzqv | InterruptedException | RuntimeException -> 0x00bb, all -> 0x00b9 }] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo52466h(java.util.Date r7, long r8, com.google.android.gms.internal.mlkit_translate.zzox r10, boolean r11, com.google.android.gms.tasks.TaskCompletionSource r12) {
        /*
            r6 = this;
            java.lang.String r11 = "MLKit RemoteConfigRestC"
            com.google.android.gms.internal.mlkit_translate.zzqy r0 = r6.f44500i     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            com.google.android.gms.internal.mlkit_translate.zzqk r0 = r0.mo52471a(r10)     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            r1 = 0
            if (r0 != 0) goto L_0x000d
        L_0x000b:
            r0 = r1
            goto L_0x003a
        L_0x000d:
            org.json.JSONObject r2 = r0.mo52454d()     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            com.google.android.gms.internal.mlkit_translate.zzy r2 = m62223j(r2)     // Catch:{ JSONException -> 0x0026 }
            r6.f44498g = r2     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            r6.mo52465g()     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            r10.mo52392h()     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            java.util.Date r0 = r0.mo52453c()     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            android.util.Pair r0 = android.util.Pair.create(r2, r0)     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            goto L_0x003a
        L_0x0026:
            r0 = move-exception
            com.google.android.gms.internal.mlkit_translate.zznk r3 = com.google.android.gms.internal.mlkit_translate.zznk.FILE_READ_RETURNED_MALFORMED_DATA     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            r10.mo52387c(r3)     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            java.lang.String r3 = "Saved remote config setting has invalid format: "
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            java.lang.String r2 = r3.concat(r2)     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            android.util.Log.e(r11, r2, r0)     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            goto L_0x000b
        L_0x003a:
            if (r0 != 0) goto L_0x003e
        L_0x003c:
            r2 = r1
            goto L_0x0062
        L_0x003e:
            java.lang.Object r2 = r0.first     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            com.google.android.gms.internal.mlkit_translate.zzy r2 = (com.google.android.gms.internal.mlkit_translate.zzy) r2     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            java.lang.Object r0 = r0.second     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            java.util.Date r0 = (java.util.Date) r0     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            java.util.Date r3 = new java.util.Date     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            long r4 = r0.getTime()     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            long r8 = r0.toMillis(r8)     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            long r4 = r4 + r8
            r3.<init>(r4)     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            boolean r8 = r7.after(r3)     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            if (r8 == 0) goto L_0x0062
            java.lang.String r8 = "Saved remote config is past its expiration time."
            android.util.Log.i(r11, r8)     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            goto L_0x003c
        L_0x0062:
            if (r2 == 0) goto L_0x0065
            goto L_0x00a6
        L_0x0065:
            com.google.android.gms.internal.mlkit_translate.zzov r8 = r6.f44495d     // Catch:{ IOException -> 0x009a }
            r8.mo52384d()     // Catch:{ IOException -> 0x009a }
            com.google.android.gms.internal.mlkit_translate.zzov r8 = r6.f44495d     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            java.lang.String r8 = r8.mo52383c()     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            com.google.android.gms.internal.mlkit_translate.zzqs r9 = new com.google.android.gms.internal.mlkit_translate.zzqs     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            r9.<init>(r6, r8, r7, r10)     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            boolean r7 = com.google.android.gms.internal.mlkit_translate.zzrd.m62241a(r9)     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            if (r7 != 0) goto L_0x0081
            com.google.android.gms.internal.mlkit_translate.zznk r7 = com.google.android.gms.internal.mlkit_translate.zznk.RPC_EXPONENTIAL_BACKOFF_FAILED     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            r10.mo52388d(r7)     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            goto L_0x00a5
        L_0x0081:
            com.google.android.gms.internal.mlkit_translate.zzy r2 = r9.mo52461a()     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            java.lang.String r7 = "writeAndSetFetchedConfig: "
            java.lang.String r8 = java.lang.String.valueOf(r2)     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            r7.concat(r8)     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            com.google.android.gms.internal.mlkit_translate.zzqy r7 = r6.f44500i     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            com.google.android.gms.internal.mlkit_translate.zzqk r8 = r9.mo52462b()     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            r7.mo52472b(r8, r10)     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            r6.f44498g = r2     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            goto L_0x00a6
        L_0x009a:
            r7 = move-exception
            com.google.android.gms.internal.mlkit_translate.zznk r8 = com.google.android.gms.internal.mlkit_translate.zznk.UNKNOWN_ERROR     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            r10.mo52388d(r8)     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
            java.lang.String r8 = "Initializing installation id failed"
            android.util.Log.e(r11, r8, r7)     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
        L_0x00a5:
            r2 = r1
        L_0x00a6:
            if (r2 != 0) goto L_0x00ad
            java.lang.String r7 = "Remote config was null!"
            android.util.Log.e(r11, r7)     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
        L_0x00ad:
            r12.mo56139c(r1)     // Catch:{ RuntimeException -> 0x00bf, InterruptedException -> 0x00bd, zzqv -> 0x00bb }
        L_0x00b0:
            r10.mo52389e()
            com.google.android.gms.internal.mlkit_translate.zzqw r7 = r6.f44501j
            r7.mo52469c(r10)
            return
        L_0x00b9:
            r7 = move-exception
            goto L_0x00c9
        L_0x00bb:
            r7 = move-exception
            goto L_0x00c0
        L_0x00bd:
            r7 = move-exception
            goto L_0x00c0
        L_0x00bf:
            r7 = move-exception
        L_0x00c0:
            java.lang.String r8 = "Fetch failed"
            android.util.Log.e(r11, r8, r7)     // Catch:{ all -> 0x00b9 }
            r12.mo56138b(r7)     // Catch:{ all -> 0x00b9 }
            goto L_0x00b0
        L_0x00c9:
            r10.mo52389e()
            com.google.android.gms.internal.mlkit_translate.zzqw r8 = r6.f44501j
            r8.mo52469c(r10)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_translate.zzqt.mo52466h(java.util.Date, long, com.google.android.gms.internal.mlkit_translate.zzox, boolean, com.google.android.gms.tasks.TaskCompletionSource):void");
    }

    /* renamed from: i */
    public final void mo52467i(@XmlRes int i) {
        Map a = zzqm.m62212a(this.f44492a, i);
        synchronized (this.f44499h) {
            this.f44499h.putAll(a);
        }
    }
}
