package com.google.android.gms.internal.mlkit_translate;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.C15904b0;
import okhttp3.C15907c0;
import okhttp3.C15915d0;
import okhttp3.C15919e0;
import okhttp3.C15986u;
import okhttp3.C15995x;
import okhttp3.C16002z;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzot {

    /* renamed from: f */
    private static final C15995x f44363f = C15995x.m96396g("application/json; charset=utf-8");

    /* renamed from: a */
    public final zzou f44364a;

    /* renamed from: b */
    private final C16002z f44365b;
    @Nullable

    /* renamed from: c */
    private zzpb f44366c = null;

    /* renamed from: d */
    private final zzoy f44367d;

    /* renamed from: e */
    private final String f44368e = "https://firebaseinstallations.googleapis.com/v1";

    public zzot(zzou zzou, zzoy zzoy) {
        C16002z.C16003a aVar = new C16002z.C16003a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f44365b = aVar.mo76378e(WorkRequest.MIN_BACKOFF_MILLIS, timeUnit).mo76370L(WorkRequest.MIN_BACKOFF_MILLIS, timeUnit).mo76373O(WorkRequest.MIN_BACKOFF_MILLIS, timeUnit).mo76376c();
        this.f44364a = zzou;
        this.f44367d = zzoy;
    }

    /* renamed from: e */
    private static long m62090e(long j, String str) {
        return j + (Long.parseLong(str.replaceFirst("s$", "")) * 1000);
    }

    @Nullable
    /* renamed from: f */
    private final String m62091f(C15986u uVar, String str, String str2, zzox zzox, zzox zzox2) {
        String str3;
        C15919e0 b;
        C15919e0 b2;
        try {
            C15915d0 execute = this.f44365b.mo76008a(new C15904b0.C15905a().mo75928g(uVar).mo75935n(str).mo75931j(C15907c0.m95943d(f44363f, str2)).mo75923b()).execute();
            int g = execute.mo75971g();
            zzox2.mo52390f(g);
            if (g < 200 || g >= 300) {
                Log.e("MLKitFbInstsRestClient", "Got HTTP status " + g + " from HTTPS POST request to <" + str + ">");
                try {
                    b = execute.mo75966b();
                    str3 = b.string();
                    b.close();
                } catch (IOException unused) {
                    str3 = "<none>";
                } catch (Throwable th) {
                    zzoq.m62089a(th, th);
                }
                "HTTP Response Body:\n".concat(String.valueOf(str3));
                zznk zznk = zznk.RPC_ERROR;
                zzox2.mo52388d(zznk);
                zzox.mo52386b(zznk);
                return null;
            }
            try {
                b2 = execute.mo75966b();
                String string = b2.string();
                b2.close();
                return string;
            } catch (IOException e) {
                Log.e("MLKitFbInstsRestClient", "Error retrieving response body from HTTPS POST request to <" + str + ">", e);
                zznk zznk2 = zznk.RPC_ERROR;
                zzox2.mo52388d(zznk2);
                zzox.mo52386b(zznk2);
                return null;
            } catch (Throwable th2) {
                zzoq.m62089a(th, th2);
            }
            throw th;
            throw th;
        } catch (IOException e2) {
            Log.e("MLKitFbInstsRestClient", "Connection error (or timeout) sending HTTPS POST request to <" + str + ">", e2);
            zzox2.mo52388d(zznk.NO_CONNECTION);
            zzox.mo52386b(zznk.NO_CONNECTION);
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public final zzpb mo52375a() {
        return this.f44366c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ boolean mo52376b(zzop zzop, zzox zzox) throws zzrb, IOException, InterruptedException {
        zzoy zzoy;
        zzox zzox2 = zzox;
        String format = String.format("%s/projects/%s/installations", new Object[]{this.f44368e, this.f44364a.mo52381c()});
        C15986u f = new C15986u.C15987a().mo76251a("x-goog-api-key", this.f44364a.mo52379a()).mo76256f();
        String format2 = String.format("{fid: '%s', appId: '%s', authVersion: '%s', sdkVersion: '%s'}", new Object[]{zzop.mo52371a(), this.f44364a.mo52380b(), "FIS_v2", "o:a:mlkit:1.0.0"});
        long currentTimeMillis = System.currentTimeMillis();
        zzox zzox3 = new zzox();
        zzox3.mo52391g();
        String f2 = m62091f(f, format, format2, zzox, zzox3);
        zzox3.mo52389e();
        if (f2 == null) {
            this.f44367d.mo52393a(zzle.INSTALLATION_ID_FIS_CREATE_INSTALLATION, zzox3);
            return false;
        }
        try {
            zzbr c = zzbt.m61650b(f2).mo52101c();
            try {
                String h = c.mo52108h("name").mo52116h();
                zzop zzop2 = new zzop(c.mo52108h("fid").mo52116h());
                String h2 = c.mo52108h("refreshToken").mo52116h();
                zzbr f3 = c.mo52107f("authToken");
                String h3 = f3.mo52108h("token").mo52116h();
                String h4 = f3.mo52108h("expiresIn").mo52116h();
                long e = m62090e(currentTimeMillis, h4);
                Log.i("MLKitFbInstsRestClient", "installation name: " + h);
                String a = zzop2.mo52371a();
                StringBuilder sb = new StringBuilder();
                sb.append("fid: ");
                sb.append(a);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("refresh_token: ");
                sb2.append(h2);
                String valueOf = String.valueOf(f3);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("auth token: ");
                sb3.append(valueOf);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("auth token expires in: ");
                sb4.append(h4);
                StringBuilder sb5 = new StringBuilder();
                sb5.append("auth token expiry: ");
                sb5.append(e);
                this.f44366c = new zzpb(zzop2, h2, h3, e);
                this.f44367d.mo52393a(zzle.INSTALLATION_ID_FIS_CREATE_INSTALLATION, zzox3);
                return true;
            } catch (ClassCastException | IllegalStateException | NullPointerException e2) {
                String obj = c.toString();
                Log.e("MLKitFbInstsRestClient", "Error traversing JSON object returned from url <" + format + ">:\nraw json:\n" + f2 + "\nparsed json:\n" + obj, e2);
                zznk zznk = zznk.RPC_RETURNED_INVALID_RESULT;
                zzox3.mo52388d(zznk);
                zzox2.mo52386b(zznk);
                zzoy = this.f44367d;
            } catch (Throwable th) {
                this.f44367d.mo52393a(zzle.INSTALLATION_ID_FIS_CREATE_INSTALLATION, zzox3);
                throw th;
            }
        } catch (zzbv | IllegalStateException | NullPointerException e3) {
            Log.e("MLKitFbInstsRestClient", "Error parsing JSON object returned from <" + format + ">:\n" + f2, e3);
            zznk zznk2 = zznk.RPC_RETURNED_MALFORMED_RESULT;
            zzox3.mo52388d(zznk2);
            zzox2.mo52386b(zznk2);
            zzoy = this.f44367d;
            zzoy.mo52393a(zzle.INSTALLATION_ID_FIS_CREATE_INSTALLATION, zzox3);
            return false;
        }
    }

    /* renamed from: c */
    public final boolean mo52377c(zzox zzox) throws InterruptedException {
        if (this.f44366c == null) {
            return false;
        }
        boolean a = zzrd.m62241a(new zzor(this, zzox));
        if (!a) {
            zzox.mo52387c(zznk.RPC_EXPONENTIAL_BACKOFF_FAILED);
        }
        return a;
    }

    /* renamed from: d */
    public final boolean mo52378d(zzox zzox) {
        zzoy zzoy;
        zzox zzox2 = zzox;
        String format = String.format("%s/projects/%s/installations/%s/authTokens:generate", new Object[]{this.f44368e, this.f44364a.mo52381c(), this.f44366c.mo52399b().mo52371a()});
        C15986u f = new C15986u.C15987a().mo76251a("authorization", "FIS_v2 ".concat(String.valueOf(this.f44366c.mo52400c()))).mo76251a("x-goog-api-key", this.f44364a.mo52379a()).mo76256f();
        String format2 = String.format("{installation:{sdkVersion:'%s'}}", new Object[]{"o:a:mlkit:1.0.0"});
        long currentTimeMillis = System.currentTimeMillis();
        zzox zzox3 = new zzox();
        zzox3.mo52391g();
        String f2 = m62091f(f, format, format2, zzox, zzox3);
        zzox3.mo52389e();
        if (f2 == null) {
            zzoy = this.f44367d;
        } else {
            try {
                zzbr c = zzbt.m61650b(f2).mo52101c();
                try {
                    String h = c.mo52108h("token").mo52116h();
                    String h2 = c.mo52108h("expiresIn").mo52116h();
                    long e = m62090e(currentTimeMillis, h2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("refreshed auth token: ");
                    sb.append(h);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("auth token expires in: ");
                    sb2.append(h2);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("auth token expiry: ");
                    sb3.append(e);
                    this.f44366c = new zzpb(this.f44366c.mo52399b(), this.f44366c.mo52400c(), h, e);
                    this.f44367d.mo52393a(zzle.INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN, zzox3);
                    return true;
                } catch (ClassCastException | IllegalStateException | NullPointerException e2) {
                    zznk zznk = zznk.RPC_RETURNED_INVALID_RESULT;
                    zzox3.mo52388d(zznk);
                    zzox2.mo52386b(zznk);
                    String obj = c.toString();
                    Log.e("MLKitFbInstsRestClient", "Error traversing JSON object returned from <" + format + ">:\nraw json:\n" + f2 + "\nparsed json:\n" + obj, e2);
                    zzoy = this.f44367d;
                } catch (Throwable th) {
                    this.f44367d.mo52393a(zzle.INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN, zzox3);
                    throw th;
                }
            } catch (zzbv e3) {
                Log.e("MLKitFbInstsRestClient", "Error parsing JSON object returned from <" + format + ">:\n" + f2, e3);
                zznk zznk2 = zznk.RPC_RETURNED_MALFORMED_RESULT;
                zzox3.mo52388d(zznk2);
                zzox2.mo52386b(zznk2);
                zzoy = this.f44367d;
            }
        }
        zzoy.mo52393a(zzle.INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN, zzox3);
        return false;
    }
}
