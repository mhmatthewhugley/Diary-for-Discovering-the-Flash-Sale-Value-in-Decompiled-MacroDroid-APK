package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import androidx.work.WorkRequest;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.activities.httprequest.HttpRequestConfigActivity;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import java.nio.charset.Charset;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.C13592k0;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15503p1;
import kotlinx.coroutines.C15561w1;
import okhttp3.C15901b;
import okhttp3.C15904b0;
import okhttp3.C15915d0;
import okhttp3.C15924f0;
import okhttp3.C15970o;
import org.apache.http.auth.AUTH;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPut;
import p057a2.C2212a;
import p057a2.C2221j;
import p057a2.C2224m;
import p128m0.C7770j1;
import p156r2.C8194a;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

/* compiled from: HttpRequestAction.kt */
public final class HttpRequestAction extends Action implements C2221j, C2212a, C2224m {
    public static final Parcelable.Creator<HttpRequestAction> CREATOR = new C2476a();
    /* access modifiers changed from: private */
    public static final X509TrustManager TRUST_ALL_CERTS = new C2477b();

    /* renamed from: d */
    public static final C2478c f7303d = new C2478c((C13695i) null);
    /* access modifiers changed from: private */
    public HttpRequestConfig requestConfig;
    /* access modifiers changed from: private */
    public transient PowerManager.WakeLock wakelock;

    /* renamed from: com.arlosoft.macrodroid.action.HttpRequestAction$a */
    /* compiled from: HttpRequestAction.kt */
    public static final class C2476a implements Parcelable.Creator<HttpRequestAction> {
        C2476a() {
        }

        /* renamed from: a */
        public HttpRequestAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new HttpRequestAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public HttpRequestAction[] newArray(int i) {
            return new HttpRequestAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.HttpRequestAction$b */
    /* compiled from: HttpRequestAction.kt */
    public static final class C2477b implements X509TrustManager {
        C2477b() {
        }

        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
            C13706o.m87929f(x509CertificateArr, "chain");
            C13706o.m87929f(str, "authType");
        }

        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            C13706o.m87929f(x509CertificateArr, "chain");
            C13706o.m87929f(str, "authType");
        }

        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.HttpRequestAction$c */
    /* compiled from: HttpRequestAction.kt */
    public static final class C2478c {
        private C2478c() {
        }

        public /* synthetic */ C2478c(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.HttpRequestAction$d */
    /* compiled from: HttpRequestAction.kt */
    static final class C2479d extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ TriggerContextInfo $contextInfo;
        final /* synthetic */ boolean $forceEvenIfNotEnabled;
        final /* synthetic */ boolean $isTest;
        final /* synthetic */ int $nextAction;
        final /* synthetic */ ResumeMacroInfo $resumeMacroInfo;
        final /* synthetic */ Stack<Integer> $skipEndifIndexStack;
        Object L$0;
        int label;
        final /* synthetic */ HttpRequestAction this$0;

        /* renamed from: com.arlosoft.macrodroid.action.HttpRequestAction$d$a */
        /* compiled from: HttpRequestAction.kt */
        public static final class C2480a implements C15901b {

            /* renamed from: d */
            final /* synthetic */ HttpRequestAction f7304d;

            /* renamed from: e */
            final /* synthetic */ TriggerContextInfo f7305e;

            C2480a(HttpRequestAction httpRequestAction, TriggerContextInfo triggerContextInfo) {
                this.f7304d = httpRequestAction;
                this.f7305e = triggerContextInfo;
            }

            /* renamed from: a */
            public C15904b0 mo25163a(C15924f0 f0Var, C15915d0 d0Var) {
                C13706o.m87929f(d0Var, "response");
                if (d0Var.mo75984y().mo75914d(AUTH.WWW_AUTH_RESP) != null) {
                    return null;
                }
                HttpRequestAction httpRequestAction = this.f7304d;
                String R2 = httpRequestAction.mo24690R2(httpRequestAction.requestConfig.getBasicAuthUsername(), this.f7305e);
                HttpRequestAction httpRequestAction2 = this.f7304d;
                String R22 = httpRequestAction2.mo24690R2(httpRequestAction2.requestConfig.getBasicAuthPassword(), this.f7305e);
                C13706o.m87928e(R2, "username");
                C13706o.m87928e(R22, "password");
                return d0Var.mo75984y().mo75918h().mo75927f(AUTH.WWW_AUTH_RESP, C15970o.m96246c(R2, R22, (Charset) null, 4, (Object) null)).mo75923b();
            }
        }

        /* renamed from: com.arlosoft.macrodroid.action.HttpRequestAction$d$b */
        /* compiled from: HttpRequestAction.kt */
        static final class C2481b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ TriggerContextInfo $contextInfo;
            final /* synthetic */ boolean $forceEvenIfNotEnabled;
            final /* synthetic */ boolean $isTest;
            final /* synthetic */ int $nextAction;
            final /* synthetic */ ResumeMacroInfo $resumeMacroInfo;
            final /* synthetic */ Stack<Integer> $skipEndifIndexStack;
            int label;
            final /* synthetic */ HttpRequestAction this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2481b(HttpRequestAction httpRequestAction, boolean z, int i, TriggerContextInfo triggerContextInfo, boolean z2, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, C13635d<? super C2481b> dVar) {
                super(2, dVar);
                this.this$0 = httpRequestAction;
                this.$isTest = z;
                this.$nextAction = i;
                this.$contextInfo = triggerContextInfo;
                this.$forceEvenIfNotEnabled = z2;
                this.$skipEndifIndexStack = stack;
                this.$resumeMacroInfo = resumeMacroInfo;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C2481b(this.this$0, this.$isTest, this.$nextAction, this.$contextInfo, this.$forceEvenIfNotEnabled, this.$skipEndifIndexStack, this.$resumeMacroInfo, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C2481b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    if (this.this$0.requestConfig.getBlockNextAction() && !this.$isTest) {
                        this.this$0.mo27837X0().invokeActions(this.this$0.mo27837X0().getActions(), this.$nextAction, this.$contextInfo, this.$forceEvenIfNotEnabled, this.$skipEndifIndexStack, this.$resumeMacroInfo);
                    }
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2479d(HttpRequestAction httpRequestAction, TriggerContextInfo triggerContextInfo, boolean z, int i, boolean z2, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, C13635d<? super C2479d> dVar) {
            super(2, dVar);
            this.this$0 = httpRequestAction;
            this.$contextInfo = triggerContextInfo;
            this.$isTest = z;
            this.$nextAction = i;
            this.$forceEvenIfNotEnabled = z2;
            this.$skipEndifIndexStack = stack;
            this.$resumeMacroInfo = resumeMacroInfo;
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public static final boolean m10973p(String str, SSLSession sSLSession) {
            return true;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C2479d(this.this$0, this.$contextInfo, this.$isTest, this.$nextAction, this.$forceEvenIfNotEnabled, this.$skipEndifIndexStack, this.$resumeMacroInfo, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C2479d) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f5, code lost:
            if (r8 == null) goto L_0x00f7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0173, code lost:
            if (r9.isEmpty() != false) goto L_0x0175;
         */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x042a A[Catch:{ all -> 0x04ce }] */
        /* JADX WARNING: Removed duplicated region for block: B:142:0x0468 A[Catch:{ all -> 0x04ce }] */
        /* JADX WARNING: Removed duplicated region for block: B:145:0x04a1  */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x04a6  */
        /* JADX WARNING: Removed duplicated region for block: B:149:0x04cd A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:158:0x0518 A[Catch:{ all -> 0x0612 }] */
        /* JADX WARNING: Removed duplicated region for block: B:165:0x0567 A[Catch:{ all -> 0x0610 }] */
        /* JADX WARNING: Removed duplicated region for block: B:172:0x0590 A[Catch:{ all -> 0x0610 }] */
        /* JADX WARNING: Removed duplicated region for block: B:173:0x05a5 A[Catch:{ all -> 0x0610 }] */
        /* JADX WARNING: Removed duplicated region for block: B:175:0x05d3  */
        /* JADX WARNING: Removed duplicated region for block: B:178:0x05e0  */
        /* JADX WARNING: Removed duplicated region for block: B:179:0x05e5  */
        /* JADX WARNING: Removed duplicated region for block: B:182:0x060c A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:189:0x0616  */
        /* JADX WARNING: Removed duplicated region for block: B:192:0x0623  */
        /* JADX WARNING: Removed duplicated region for block: B:193:0x0628  */
        /* JADX WARNING: Removed duplicated region for block: B:196:0x0660 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r28) {
            /*
                r27 = this;
                r1 = r27
                java.lang.String r2 = "Could not save return code into variable: "
                java.lang.String r3 = "Could not save response into variable: "
                java.lang.String r4 = "wakelock"
                java.lang.String r5 = ". The variable was not found."
                java.lang.String r6 = "macroGuid"
                java.lang.Object r7 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r0 = r1.label
                r8 = 3
                r9 = 2
                r10 = 1
                if (r0 == 0) goto L_0x0033
                if (r0 == r10) goto L_0x002e
                if (r0 == r9) goto L_0x002e
                if (r0 == r8) goto L_0x0025
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0025:
                java.lang.Object r0 = r1.L$0
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                p297ja.C13332o.m85685b(r28)
                goto L_0x0661
            L_0x002e:
                p297ja.C13332o.m85685b(r28)
                goto L_0x060d
            L_0x0033:
                p297ja.C13332o.m85685b(r28)
                com.arlosoft.macrodroid.action.HttpRequestAction r0 = r1.this$0
                com.arlosoft.macrodroid.action.HttpRequestConfig r11 = r0.requestConfig
                java.lang.String r11 = r11.getUrlToOpen()
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r12 = r1.$contextInfo
                java.lang.String r0 = r0.mo24690R2(r11, r12)
                java.lang.String r11 = "nonEncodedUrl"
                kotlin.jvm.internal.C13706o.m87928e(r0, r11)
                java.lang.String r12 = "://"
                r13 = 0
                r14 = 0
                boolean r12 = kotlin.text.C15177w.m93663N(r0, r12, r13, r9, r14)
                if (r12 != 0) goto L_0x0066
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r15 = "https://"
                r12.append(r15)
                r12.append(r0)
                java.lang.String r0 = r12.toString()
            L_0x0066:
                r12 = r0
                okhttp3.z$a r0 = new okhttp3.z$a     // Catch:{ all -> 0x04d0 }
                r0.<init>()     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestAction r15 = r1.this$0     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestConfig r15 = r15.requestConfig     // Catch:{ all -> 0x04d0 }
                int r15 = r15.getRequestTimeOutSeconds()     // Catch:{ all -> 0x04d0 }
                long r8 = (long) r15     // Catch:{ all -> 0x04d0 }
                java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x04d0 }
                okhttp3.z$a r0 = r0.mo76370L(r8, r15)     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestAction r8 = r1.this$0     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestConfig r8 = r8.requestConfig     // Catch:{ all -> 0x04d0 }
                boolean r8 = r8.getAllowAnyCertificate()     // Catch:{ all -> 0x04d0 }
                if (r8 == 0) goto L_0x00bd
                java.lang.String r8 = "SSL"
                javax.net.ssl.SSLContext r8 = javax.net.ssl.SSLContext.getInstance(r8)     // Catch:{ all -> 0x00b7 }
                javax.net.ssl.X509TrustManager[] r9 = new javax.net.ssl.X509TrustManager[r10]     // Catch:{ all -> 0x00b7 }
                javax.net.ssl.X509TrustManager r15 = com.arlosoft.macrodroid.action.HttpRequestAction.TRUST_ALL_CERTS     // Catch:{ all -> 0x00b7 }
                r9[r13] = r15     // Catch:{ all -> 0x00b7 }
                javax.net.ssl.TrustManager[] r9 = (javax.net.ssl.TrustManager[]) r9     // Catch:{ all -> 0x00b7 }
                java.security.SecureRandom r15 = new java.security.SecureRandom     // Catch:{ all -> 0x00b7 }
                r15.<init>()     // Catch:{ all -> 0x00b7 }
                r8.init(r14, r9, r15)     // Catch:{ all -> 0x00b7 }
                javax.net.ssl.SSLSocketFactory r8 = r8.getSocketFactory()     // Catch:{ all -> 0x00b7 }
                java.lang.String r9 = "sslContext.socketFactory"
                kotlin.jvm.internal.C13706o.m87928e(r8, r9)     // Catch:{ all -> 0x00b7 }
                javax.net.ssl.X509TrustManager r9 = com.arlosoft.macrodroid.action.HttpRequestAction.TRUST_ALL_CERTS     // Catch:{ all -> 0x00b7 }
                r0.mo76372N(r8, r9)     // Catch:{ all -> 0x00b7 }
                com.arlosoft.macrodroid.action.b7 r8 = com.arlosoft.macrodroid.action.C2938b7.f8035a     // Catch:{ all -> 0x00b7 }
                r0.mo76369K(r8)     // Catch:{ all -> 0x00b7 }
                goto L_0x00bd
            L_0x00b7:
                r0 = move-exception
                r20 = r12
                r10 = r14
                goto L_0x04d4
            L_0x00bd:
                com.arlosoft.macrodroid.action.HttpRequestAction r8 = r1.this$0     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestConfig r8 = r8.requestConfig     // Catch:{ all -> 0x04d0 }
                boolean r8 = r8.getFollowRedirects()     // Catch:{ all -> 0x04d0 }
                r0.mo76379f(r8)     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestAction r8 = r1.this$0     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestConfig r8 = r8.requestConfig     // Catch:{ all -> 0x04d0 }
                boolean r8 = r8.getBasicAuthEnabled()     // Catch:{ all -> 0x04d0 }
                if (r8 == 0) goto L_0x00e2
                com.arlosoft.macrodroid.action.HttpRequestAction$d$a r8 = new com.arlosoft.macrodroid.action.HttpRequestAction$d$a     // Catch:{ all -> 0x00b7 }
                com.arlosoft.macrodroid.action.HttpRequestAction r9 = r1.this$0     // Catch:{ all -> 0x00b7 }
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r15 = r1.$contextInfo     // Catch:{ all -> 0x00b7 }
                r8.<init>(r9, r15)     // Catch:{ all -> 0x00b7 }
                r0.mo76375b(r8)     // Catch:{ all -> 0x00b7 }
            L_0x00e2:
                okhttp3.z r0 = r0.mo76376c()     // Catch:{ all -> 0x04d0 }
                okhttp3.v$b r8 = okhttp3.C15989v.f65795l     // Catch:{ all -> 0x04d0 }
                kotlin.jvm.internal.C13706o.m87928e(r12, r11)     // Catch:{ all -> 0x04d0 }
                okhttp3.v r8 = r8.mo76304f(r12)     // Catch:{ all -> 0x04d0 }
                if (r8 == 0) goto L_0x00f7
                okhttp3.v$a r8 = r8.mo76271k()     // Catch:{ all -> 0x00b7 }
                if (r8 != 0) goto L_0x00fc
            L_0x00f7:
                okhttp3.v$a r8 = new okhttp3.v$a     // Catch:{ all -> 0x04d0 }
                r8.<init>()     // Catch:{ all -> 0x04d0 }
            L_0x00fc:
                com.arlosoft.macrodroid.action.HttpRequestAction r9 = r1.this$0     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestConfig r9 = r9.requestConfig     // Catch:{ all -> 0x04d0 }
                java.util.List r9 = r9.getQueryParams()     // Catch:{ all -> 0x04d0 }
                java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x04d0 }
            L_0x010a:
                boolean r11 = r9.hasNext()     // Catch:{ all -> 0x04d0 }
                java.lang.String r15 = "paramName"
                if (r11 == 0) goto L_0x0152
                java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpParam r11 = (com.arlosoft.macrodroid.action.HttpParam) r11     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestAction r13 = r1.this$0     // Catch:{ all -> 0x04d0 }
                android.content.Context r13 = r13.mo27827K0()     // Catch:{ all -> 0x04d0 }
                java.lang.String r10 = r11.getParamName()     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r14 = r1.$contextInfo     // Catch:{ all -> 0x04d0 }
                r20 = r9
                com.arlosoft.macrodroid.action.HttpRequestAction r9 = r1.this$0     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.macro.Macro r9 = r9.mo27837X0()     // Catch:{ all -> 0x04d0 }
                java.lang.String r9 = com.arlosoft.macrodroid.common.C4023j0.m15760t0(r13, r10, r14, r9)     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestAction r10 = r1.this$0     // Catch:{ all -> 0x04d0 }
                android.content.Context r10 = r10.mo27827K0()     // Catch:{ all -> 0x04d0 }
                java.lang.String r11 = r11.getParamValue()     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r13 = r1.$contextInfo     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestAction r14 = r1.this$0     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.macro.Macro r14 = r14.mo27837X0()     // Catch:{ all -> 0x04d0 }
                java.lang.String r10 = com.arlosoft.macrodroid.common.C4023j0.m15760t0(r10, r11, r13, r14)     // Catch:{ all -> 0x04d0 }
                kotlin.jvm.internal.C13706o.m87928e(r9, r15)     // Catch:{ all -> 0x04d0 }
                r8.mo76283b(r9, r10)     // Catch:{ all -> 0x04d0 }
                r9 = r20
                r10 = 1
                r13 = 0
                r14 = 0
                goto L_0x010a
            L_0x0152:
                okhttp3.v r8 = r8.mo76284c()     // Catch:{ all -> 0x04d0 }
                okhttp3.b0$a r9 = new okhttp3.b0$a     // Catch:{ all -> 0x04d0 }
                r9.<init>()     // Catch:{ all -> 0x04d0 }
                okhttp3.b0$a r8 = r9.mo75936o(r8)     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestAction r9 = r1.this$0     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestConfig r9 = r9.requestConfig     // Catch:{ all -> 0x04d0 }
                java.util.List r9 = r9.getHeaderParams()     // Catch:{ all -> 0x04d0 }
                boolean r10 = r9 instanceof java.util.Collection     // Catch:{ all -> 0x04d0 }
                java.lang.String r11 = "user-agent"
                if (r10 == 0) goto L_0x0177
                boolean r10 = r9.isEmpty()     // Catch:{ all -> 0x04d0 }
                if (r10 == 0) goto L_0x0177
            L_0x0175:
                r9 = 1
                goto L_0x0192
            L_0x0177:
                java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x04d0 }
            L_0x017b:
                boolean r10 = r9.hasNext()     // Catch:{ all -> 0x04d0 }
                if (r10 == 0) goto L_0x0175
                java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpParam r10 = (com.arlosoft.macrodroid.action.HttpParam) r10     // Catch:{ all -> 0x04d0 }
                java.lang.String r10 = r10.getParamName()     // Catch:{ all -> 0x04d0 }
                boolean r10 = kotlin.jvm.internal.C13706o.m87924a(r10, r11)     // Catch:{ all -> 0x04d0 }
                if (r10 == 0) goto L_0x017b
                r9 = 0
            L_0x0192:
                if (r9 == 0) goto L_0x0199
                java.lang.String r9 = "macrodroid/5.29.12"
                r8.mo75922a(r11, r9)     // Catch:{ all -> 0x04d0 }
            L_0x0199:
                com.arlosoft.macrodroid.action.HttpRequestAction r9 = r1.this$0     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestConfig r9 = r9.requestConfig     // Catch:{ all -> 0x04d0 }
                java.util.List r9 = r9.getHeaderParams()     // Catch:{ all -> 0x04d0 }
                java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x04d0 }
            L_0x01a7:
                boolean r10 = r9.hasNext()     // Catch:{ all -> 0x04d0 }
                if (r10 == 0) goto L_0x01ef
                java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpParam r10 = (com.arlosoft.macrodroid.action.HttpParam) r10     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestAction r11 = r1.this$0     // Catch:{ all -> 0x04d0 }
                android.content.Context r11 = r11.mo27827K0()     // Catch:{ all -> 0x04d0 }
                java.lang.String r13 = r10.getParamName()     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r14 = r1.$contextInfo     // Catch:{ all -> 0x04d0 }
                r20 = r9
                com.arlosoft.macrodroid.action.HttpRequestAction r9 = r1.this$0     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.macro.Macro r9 = r9.mo27837X0()     // Catch:{ all -> 0x04d0 }
                java.lang.String r9 = com.arlosoft.macrodroid.common.C4023j0.m15760t0(r11, r13, r14, r9)     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestAction r11 = r1.this$0     // Catch:{ all -> 0x04d0 }
                android.content.Context r11 = r11.mo27827K0()     // Catch:{ all -> 0x04d0 }
                java.lang.String r10 = r10.getParamValue()     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r13 = r1.$contextInfo     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestAction r14 = r1.this$0     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.macro.Macro r14 = r14.mo27837X0()     // Catch:{ all -> 0x04d0 }
                java.lang.String r10 = com.arlosoft.macrodroid.common.C4023j0.m15760t0(r11, r10, r13, r14)     // Catch:{ all -> 0x04d0 }
                kotlin.jvm.internal.C13706o.m87928e(r9, r15)     // Catch:{ all -> 0x04d0 }
                java.lang.String r11 = "paramValue"
                kotlin.jvm.internal.C13706o.m87928e(r10, r11)     // Catch:{ all -> 0x04d0 }
                r8.mo75922a(r9, r10)     // Catch:{ all -> 0x04d0 }
                r9 = r20
                goto L_0x01a7
            L_0x01ef:
                okhttp3.x$a r9 = okhttp3.C15995x.f65817g     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestAction r10 = r1.this$0     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestConfig r10 = r10.requestConfig     // Catch:{ all -> 0x04d0 }
                java.lang.String r10 = r10.getContentType()     // Catch:{ all -> 0x04d0 }
                okhttp3.x r9 = r9.mo76320b(r10)     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestAction r10 = r1.this$0     // Catch:{ all -> 0x04d0 }
                android.content.Context r10 = r10.mo27827K0()     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestAction r11 = r1.this$0     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestConfig r11 = r11.requestConfig     // Catch:{ all -> 0x04d0 }
                java.lang.String r11 = r11.getContentBodyText()     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r13 = r1.$contextInfo     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestAction r14 = r1.this$0     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.macro.Macro r14 = r14.mo27837X0()     // Catch:{ all -> 0x04d0 }
                java.lang.String r10 = com.arlosoft.macrodroid.common.C4023j0.m15760t0(r10, r11, r13, r14)     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestAction r11 = r1.this$0     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestConfig r11 = r11.requestConfig     // Catch:{ all -> 0x04d0 }
                int r11 = r11.getContentBodySource()     // Catch:{ all -> 0x04d0 }
                java.lang.String r13 = ""
                if (r11 != 0) goto L_0x0235
                okhttp3.c0$a r11 = okhttp3.C15907c0.f65424a     // Catch:{ all -> 0x04d0 }
                java.lang.String r14 = "contentBodyText"
                kotlin.jvm.internal.C13706o.m87928e(r10, r14)     // Catch:{ all -> 0x04d0 }
                okhttp3.c0 r9 = r11.mo75947f(r9, r10)     // Catch:{ all -> 0x04d0 }
                goto L_0x02a0
            L_0x0235:
                com.arlosoft.macrodroid.action.HttpRequestAction r10 = r1.this$0     // Catch:{ all -> 0x04d0 }
                android.content.Context r10 = r10.mo27827K0()     // Catch:{ all -> 0x04d0 }
                android.content.ContentResolver r10 = r10.getContentResolver()     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestAction r11 = r1.this$0     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestConfig r11 = r11.requestConfig     // Catch:{ all -> 0x04d0 }
                java.lang.String r11 = r11.getContentBodyFileUri()     // Catch:{ all -> 0x04d0 }
                android.net.Uri r11 = android.net.Uri.parse(r11)     // Catch:{ all -> 0x04d0 }
                java.io.InputStream r10 = r10.openInputStream(r11)     // Catch:{ all -> 0x04d0 }
                if (r10 == 0) goto L_0x025a
                byte[] r10 = kotlin.p312io.C13666a.m87852c(r10)     // Catch:{ all -> 0x04d0 }
                r22 = r10
                goto L_0x025c
            L_0x025a:
                r22 = 0
            L_0x025c:
                if (r22 == 0) goto L_0x026f
                okhttp3.c0$a r20 = okhttp3.C15907c0.f65424a     // Catch:{ all -> 0x04d0 }
                r23 = 0
                r24 = 0
                r25 = 12
                r26 = 0
                r21 = r9
                okhttp3.c0 r9 = okhttp3.C15907c0.C15908a.m95950i(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x04d0 }
                goto L_0x02a0
            L_0x026f:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x04d0 }
                r10.<init>()     // Catch:{ all -> 0x04d0 }
                java.lang.String r11 = "Could not load content body from file: "
                r10.append(r11)     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestAction r11 = r1.this$0     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestConfig r11 = r11.requestConfig     // Catch:{ all -> 0x04d0 }
                java.lang.String r11 = r11.getContentBodyFileDisplayName()     // Catch:{ all -> 0x04d0 }
                r10.append(r11)     // Catch:{ all -> 0x04d0 }
                java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestAction r11 = r1.this$0     // Catch:{ all -> 0x04d0 }
                java.lang.Long r11 = r11.mo27840Y0()     // Catch:{ all -> 0x04d0 }
                kotlin.jvm.internal.C13706o.m87928e(r11, r6)     // Catch:{ all -> 0x04d0 }
                long r14 = r11.longValue()     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r10, r14)     // Catch:{ all -> 0x04d0 }
                okhttp3.c0$a r10 = okhttp3.C15907c0.f65424a     // Catch:{ all -> 0x04d0 }
                okhttp3.c0 r9 = r10.mo75947f(r9, r13)     // Catch:{ all -> 0x04d0 }
            L_0x02a0:
                com.arlosoft.macrodroid.action.HttpRequestAction r10 = r1.this$0     // Catch:{ all -> 0x04d0 }
                com.arlosoft.macrodroid.action.HttpRequestConfig r10 = r10.requestConfig     // Catch:{ all -> 0x04d0 }
                int r10 = r10.getRequestType()     // Catch:{ all -> 0x04d0 }
                switch(r10) {
                    case 0: goto L_0x02d8;
                    case 1: goto L_0x02d4;
                    case 2: goto L_0x02d0;
                    case 3: goto L_0x02cc;
                    case 4: goto L_0x02c8;
                    case 5: goto L_0x02c4;
                    case 6: goto L_0x02bd;
                    case 7: goto L_0x02ae;
                    default: goto L_0x02ad;
                }
            L_0x02ad:
                goto L_0x02db
            L_0x02ae:
                java.lang.String r9 = "TRACE"
                r10 = 0
                r8.mo75929h(r9, r10)     // Catch:{ all -> 0x02b5 }
                goto L_0x02db
            L_0x02b5:
                r0 = move-exception
                goto L_0x02b9
            L_0x02b7:
                r0 = move-exception
                r10 = 0
            L_0x02b9:
                r20 = r12
                goto L_0x04d4
            L_0x02bd:
                r10 = 0
                java.lang.String r9 = "OPTIONS"
                r8.mo75929h(r9, r10)     // Catch:{ all -> 0x04d0 }
                goto L_0x02db
            L_0x02c4:
                r8.mo75926e()     // Catch:{ all -> 0x04d0 }
                goto L_0x02db
            L_0x02c8:
                r8.mo75930i(r9)     // Catch:{ all -> 0x04d0 }
                goto L_0x02db
            L_0x02cc:
                r8.mo75924c(r9)     // Catch:{ all -> 0x04d0 }
                goto L_0x02db
            L_0x02d0:
                r8.mo75932k(r9)     // Catch:{ all -> 0x04d0 }
                goto L_0x02db
            L_0x02d4:
                r8.mo75931j(r9)     // Catch:{ all -> 0x04d0 }
                goto L_0x02db
            L_0x02d8:
                r8.mo75925d()     // Catch:{ all -> 0x04d0 }
            L_0x02db:
                okhttp3.b0 r8 = r8.mo75923b()     // Catch:{ all -> 0x04d0 }
                okhttp3.e r0 = r0.mo76008a(r8)     // Catch:{ all -> 0x04d0 }
                okhttp3.d0 r10 = r0.execute()     // Catch:{ all -> 0x04d0 }
                int r0 = r10.mo75971g()     // Catch:{ all -> 0x02b5 }
                r8 = 200(0xc8, float:2.8E-43)
                if (r8 > r0) goto L_0x02f5
                r8 = 300(0x12c, float:4.2E-43)
                if (r0 >= r8) goto L_0x02f5
                r0 = 1
                goto L_0x02f6
            L_0x02f5:
                r0 = 0
            L_0x02f6:
                java.lang.String r8 = "HTTP GET response code: "
                if (r0 == 0) goto L_0x031e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x02b5 }
                r0.<init>()     // Catch:{ all -> 0x02b5 }
                r0.append(r8)     // Catch:{ all -> 0x02b5 }
                int r8 = r10.mo75971g()     // Catch:{ all -> 0x02b5 }
                r0.append(r8)     // Catch:{ all -> 0x02b5 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02b5 }
                com.arlosoft.macrodroid.action.HttpRequestAction r8 = r1.this$0     // Catch:{ all -> 0x02b5 }
                java.lang.Long r8 = r8.mo27840Y0()     // Catch:{ all -> 0x02b5 }
                kotlin.jvm.internal.C13706o.m87928e(r8, r6)     // Catch:{ all -> 0x02b5 }
                long r8 = r8.longValue()     // Catch:{ all -> 0x02b5 }
                com.arlosoft.macrodroid.logging.systemlog.C4878b.m18874m(r0, r8)     // Catch:{ all -> 0x02b5 }
                goto L_0x0341
            L_0x031e:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x02b5 }
                r0.<init>()     // Catch:{ all -> 0x02b5 }
                r0.append(r8)     // Catch:{ all -> 0x02b5 }
                int r8 = r10.mo75971g()     // Catch:{ all -> 0x02b5 }
                r0.append(r8)     // Catch:{ all -> 0x02b5 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02b5 }
                com.arlosoft.macrodroid.action.HttpRequestAction r8 = r1.this$0     // Catch:{ all -> 0x02b5 }
                java.lang.Long r8 = r8.mo27840Y0()     // Catch:{ all -> 0x02b5 }
                kotlin.jvm.internal.C13706o.m87928e(r8, r6)     // Catch:{ all -> 0x02b5 }
                long r8 = r8.longValue()     // Catch:{ all -> 0x02b5 }
                com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r0, r8)     // Catch:{ all -> 0x02b5 }
            L_0x0341:
                com.arlosoft.macrodroid.action.HttpRequestAction r0 = r1.this$0     // Catch:{ all -> 0x02b5 }
                com.arlosoft.macrodroid.action.HttpRequestConfig r0 = r0.requestConfig     // Catch:{ all -> 0x02b5 }
                int r0 = r0.getSaveResponseType()     // Catch:{ all -> 0x02b5 }
                java.lang.String r8 = "macro"
                java.lang.String r9 = "context"
                r11 = 2
                if (r0 != r11) goto L_0x035b
                com.arlosoft.macrodroid.action.HttpRequestAction r0 = r1.this$0     // Catch:{ all -> 0x02b5 }
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r11 = r1.$contextInfo     // Catch:{ all -> 0x02b5 }
                r0.m10957p3(r10, r11)     // Catch:{ all -> 0x02b5 }
                goto L_0x0400
            L_0x035b:
                com.arlosoft.macrodroid.action.HttpRequestAction r0 = r1.this$0     // Catch:{ all -> 0x02b5 }
                com.arlosoft.macrodroid.action.HttpRequestConfig r0 = r0.requestConfig     // Catch:{ all -> 0x02b5 }
                int r0 = r0.getSaveResponseType()     // Catch:{ all -> 0x02b5 }
                r11 = 1
                if (r0 != r11) goto L_0x0400
                com.arlosoft.macrodroid.action.HttpRequestAction r0 = r1.this$0     // Catch:{ all -> 0x02b5 }
                com.arlosoft.macrodroid.action.HttpRequestConfig r0 = r0.requestConfig     // Catch:{ all -> 0x02b5 }
                java.lang.String r0 = r0.getResponseVariableName()     // Catch:{ all -> 0x02b5 }
                if (r0 == 0) goto L_0x0400
                com.arlosoft.macrodroid.action.HttpRequestAction r0 = r1.this$0     // Catch:{ all -> 0x02b5 }
                com.arlosoft.macrodroid.action.HttpRequestConfig r11 = r0.requestConfig     // Catch:{ all -> 0x02b5 }
                java.lang.String r11 = r11.getResponseVariableName()     // Catch:{ all -> 0x02b5 }
                com.arlosoft.macrodroid.common.MacroDroidVariable r0 = r0.mo27861q(r11)     // Catch:{ all -> 0x02b5 }
                if (r0 == 0) goto L_0x03d1
                okhttp3.e0 r11 = r10.mo75966b()     // Catch:{ all -> 0x02b5 }
                if (r11 == 0) goto L_0x038f
                java.lang.String r11 = r11.string()     // Catch:{ all -> 0x02b5 }
                goto L_0x0390
            L_0x038f:
                r11 = 0
            L_0x0390:
                com.arlosoft.macrodroid.action.HttpRequestAction r14 = r1.this$0     // Catch:{ all -> 0x02b5 }
                android.content.Context r14 = r14.mo27827K0()     // Catch:{ all -> 0x02b5 }
                kotlin.jvm.internal.C13706o.m87928e(r14, r9)     // Catch:{ all -> 0x02b5 }
                com.arlosoft.macrodroid.action.HttpRequestAction r15 = r1.this$0     // Catch:{ all -> 0x02b5 }
                com.arlosoft.macrodroid.action.HttpRequestConfig r15 = r15.requestConfig     // Catch:{ all -> 0x02b5 }
                com.arlosoft.macrodroid.variables.DictionaryKeys r15 = r15.getResponseDictionaryKeys()     // Catch:{ all -> 0x02b5 }
                if (r15 == 0) goto L_0x03ab
                java.util.List r15 = r15.getKeys()     // Catch:{ all -> 0x02b5 }
                if (r15 != 0) goto L_0x03af
            L_0x03ab:
                java.util.List r15 = kotlin.collections.C13614t.m87748j()     // Catch:{ all -> 0x02b5 }
            L_0x03af:
                r28 = r13
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r13 = r1.$contextInfo     // Catch:{ all -> 0x02b5 }
                r20 = r12
                com.arlosoft.macrodroid.action.HttpRequestAction r12 = r1.this$0     // Catch:{ all -> 0x04ce }
                com.arlosoft.macrodroid.macro.Macro r12 = r12.mo27837X0()     // Catch:{ all -> 0x04ce }
                kotlin.jvm.internal.C13706o.m87928e(r12, r8)     // Catch:{ all -> 0x04ce }
                java.util.ArrayList r12 = com.arlosoft.macrodroid.variables.C6520o0.m24868C(r14, r15, r13, r12)     // Catch:{ all -> 0x04ce }
                com.arlosoft.macrodroid.action.HttpRequestAction r13 = r1.this$0     // Catch:{ all -> 0x04ce }
                com.arlosoft.macrodroid.variables.VariableValue$StringValue r14 = new com.arlosoft.macrodroid.variables.VariableValue$StringValue     // Catch:{ all -> 0x04ce }
                if (r11 != 0) goto L_0x03ca
                r11 = r28
            L_0x03ca:
                r14.<init>(r11, r12)     // Catch:{ all -> 0x04ce }
                r13.mo27832M2(r0, r14)     // Catch:{ all -> 0x04ce }
                goto L_0x0402
            L_0x03d1:
                r20 = r12
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x04ce }
                r0.<init>()     // Catch:{ all -> 0x04ce }
                r0.append(r3)     // Catch:{ all -> 0x04ce }
                com.arlosoft.macrodroid.action.HttpRequestAction r11 = r1.this$0     // Catch:{ all -> 0x04ce }
                com.arlosoft.macrodroid.action.HttpRequestConfig r11 = r11.requestConfig     // Catch:{ all -> 0x04ce }
                java.lang.String r11 = r11.getResponseVariableName()     // Catch:{ all -> 0x04ce }
                r0.append(r11)     // Catch:{ all -> 0x04ce }
                r0.append(r5)     // Catch:{ all -> 0x04ce }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x04ce }
                com.arlosoft.macrodroid.action.HttpRequestAction r11 = r1.this$0     // Catch:{ all -> 0x04ce }
                java.lang.Long r11 = r11.mo27840Y0()     // Catch:{ all -> 0x04ce }
                kotlin.jvm.internal.C13706o.m87928e(r11, r6)     // Catch:{ all -> 0x04ce }
                long r11 = r11.longValue()     // Catch:{ all -> 0x04ce }
                com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r0, r11)     // Catch:{ all -> 0x04ce }
                goto L_0x0402
            L_0x0400:
                r20 = r12
            L_0x0402:
                com.arlosoft.macrodroid.action.HttpRequestAction r0 = r1.this$0     // Catch:{ all -> 0x04ce }
                com.arlosoft.macrodroid.action.HttpRequestConfig r0 = r0.requestConfig     // Catch:{ all -> 0x04ce }
                boolean r0 = r0.getSaveReturnCodeToVariable()     // Catch:{ all -> 0x04ce }
                if (r0 == 0) goto L_0x0494
                com.arlosoft.macrodroid.action.HttpRequestAction r0 = r1.this$0     // Catch:{ all -> 0x04ce }
                com.arlosoft.macrodroid.action.HttpRequestConfig r0 = r0.requestConfig     // Catch:{ all -> 0x04ce }
                java.lang.String r0 = r0.getReturnCodeVariableName()     // Catch:{ all -> 0x04ce }
                if (r0 == 0) goto L_0x0494
                com.arlosoft.macrodroid.action.HttpRequestAction r0 = r1.this$0     // Catch:{ all -> 0x04ce }
                com.arlosoft.macrodroid.action.HttpRequestConfig r11 = r0.requestConfig     // Catch:{ all -> 0x04ce }
                java.lang.String r11 = r11.getReturnCodeVariableName()     // Catch:{ all -> 0x04ce }
                com.arlosoft.macrodroid.common.MacroDroidVariable r0 = r0.mo27861q(r11)     // Catch:{ all -> 0x04ce }
                if (r0 == 0) goto L_0x0468
                com.arlosoft.macrodroid.action.HttpRequestAction r11 = r1.this$0     // Catch:{ all -> 0x04ce }
                android.content.Context r11 = r11.mo27827K0()     // Catch:{ all -> 0x04ce }
                kotlin.jvm.internal.C13706o.m87928e(r11, r9)     // Catch:{ all -> 0x04ce }
                com.arlosoft.macrodroid.action.HttpRequestAction r9 = r1.this$0     // Catch:{ all -> 0x04ce }
                com.arlosoft.macrodroid.action.HttpRequestConfig r9 = r9.requestConfig     // Catch:{ all -> 0x04ce }
                com.arlosoft.macrodroid.variables.DictionaryKeys r9 = r9.getReturnCodeDictionaryKeys()     // Catch:{ all -> 0x04ce }
                if (r9 == 0) goto L_0x0445
                java.util.List r9 = r9.getKeys()     // Catch:{ all -> 0x04ce }
                if (r9 != 0) goto L_0x0449
            L_0x0445:
                java.util.List r9 = kotlin.collections.C13614t.m87748j()     // Catch:{ all -> 0x04ce }
            L_0x0449:
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r12 = r1.$contextInfo     // Catch:{ all -> 0x04ce }
                com.arlosoft.macrodroid.action.HttpRequestAction r13 = r1.this$0     // Catch:{ all -> 0x04ce }
                com.arlosoft.macrodroid.macro.Macro r13 = r13.mo27837X0()     // Catch:{ all -> 0x04ce }
                kotlin.jvm.internal.C13706o.m87928e(r13, r8)     // Catch:{ all -> 0x04ce }
                java.util.ArrayList r8 = com.arlosoft.macrodroid.variables.C6520o0.m24868C(r11, r9, r12, r13)     // Catch:{ all -> 0x04ce }
                com.arlosoft.macrodroid.action.HttpRequestAction r9 = r1.this$0     // Catch:{ all -> 0x04ce }
                com.arlosoft.macrodroid.variables.VariableValue$IntegerValue r11 = new com.arlosoft.macrodroid.variables.VariableValue$IntegerValue     // Catch:{ all -> 0x04ce }
                int r12 = r10.mo75971g()     // Catch:{ all -> 0x04ce }
                long r12 = (long) r12     // Catch:{ all -> 0x04ce }
                r11.<init>(r12, r8)     // Catch:{ all -> 0x04ce }
                r9.mo27832M2(r0, r11)     // Catch:{ all -> 0x04ce }
                goto L_0x0494
            L_0x0468:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x04ce }
                r0.<init>()     // Catch:{ all -> 0x04ce }
                r0.append(r2)     // Catch:{ all -> 0x04ce }
                com.arlosoft.macrodroid.action.HttpRequestAction r8 = r1.this$0     // Catch:{ all -> 0x04ce }
                com.arlosoft.macrodroid.action.HttpRequestConfig r8 = r8.requestConfig     // Catch:{ all -> 0x04ce }
                java.lang.String r8 = r8.getReturnCodeVariableName()     // Catch:{ all -> 0x04ce }
                r0.append(r8)     // Catch:{ all -> 0x04ce }
                r0.append(r5)     // Catch:{ all -> 0x04ce }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x04ce }
                com.arlosoft.macrodroid.action.HttpRequestAction r8 = r1.this$0     // Catch:{ all -> 0x04ce }
                java.lang.Long r8 = r8.mo27840Y0()     // Catch:{ all -> 0x04ce }
                kotlin.jvm.internal.C13706o.m87928e(r8, r6)     // Catch:{ all -> 0x04ce }
                long r8 = r8.longValue()     // Catch:{ all -> 0x04ce }
                com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r0, r8)     // Catch:{ all -> 0x04ce }
            L_0x0494:
                r10.close()
                ja.u r0 = p297ja.C13339u.f61331a
                com.arlosoft.macrodroid.action.HttpRequestAction r0 = r1.this$0
                android.os.PowerManager$WakeLock r0 = r0.wakelock
                if (r0 != 0) goto L_0x04a6
                kotlin.jvm.internal.C13706o.m87945v(r4)
                r14 = 0
                goto L_0x04a7
            L_0x04a6:
                r14 = r0
            L_0x04a7:
                r14.release()
                kotlinx.coroutines.h2 r0 = kotlinx.coroutines.C15186a1.m93731c()
                com.arlosoft.macrodroid.action.HttpRequestAction$d$b r2 = new com.arlosoft.macrodroid.action.HttpRequestAction$d$b
                com.arlosoft.macrodroid.action.HttpRequestAction r9 = r1.this$0
                boolean r10 = r1.$isTest
                int r11 = r1.$nextAction
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r12 = r1.$contextInfo
                boolean r13 = r1.$forceEvenIfNotEnabled
                java.util.Stack<java.lang.Integer> r14 = r1.$skipEndifIndexStack
                com.arlosoft.macrodroid.data.ResumeMacroInfo r15 = r1.$resumeMacroInfo
                r16 = 0
                r8 = r2
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
                r3 = 1
                r1.label = r3
                java.lang.Object r0 = kotlinx.coroutines.C15414h.m94298g(r0, r2, r1)
                if (r0 != r7) goto L_0x060d
                return r7
            L_0x04ce:
                r0 = move-exception
                goto L_0x04d4
            L_0x04d0:
                r0 = move-exception
                r20 = r12
                r10 = 0
            L_0x04d4:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0612 }
                r8.<init>()     // Catch:{ all -> 0x0612 }
                java.lang.String r9 = "HTTP Request failed: "
                r8.append(r9)     // Catch:{ all -> 0x0612 }
                r9 = r20
                r8.append(r9)     // Catch:{ all -> 0x0612 }
                java.lang.String r9 = " Reason:"
                r8.append(r9)     // Catch:{ all -> 0x0612 }
                r8.append(r0)     // Catch:{ all -> 0x0612 }
                java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0612 }
                com.arlosoft.macrodroid.action.HttpRequestAction r9 = r1.this$0     // Catch:{ all -> 0x0612 }
                java.lang.Long r9 = r9.mo27840Y0()     // Catch:{ all -> 0x0612 }
                kotlin.jvm.internal.C13706o.m87928e(r9, r6)     // Catch:{ all -> 0x0612 }
                long r11 = r9.longValue()     // Catch:{ all -> 0x0612 }
                com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r8, r11)     // Catch:{ all -> 0x0612 }
                com.arlosoft.macrodroid.action.HttpRequestAction r8 = r1.this$0     // Catch:{ all -> 0x0612 }
                com.arlosoft.macrodroid.action.HttpRequestConfig r8 = r8.requestConfig     // Catch:{ all -> 0x0612 }
                int r8 = r8.getSaveResponseType()     // Catch:{ all -> 0x0612 }
                r9 = 1
                if (r8 != r9) goto L_0x0567
                com.arlosoft.macrodroid.action.HttpRequestAction r8 = r1.this$0     // Catch:{ all -> 0x0612 }
                com.arlosoft.macrodroid.action.HttpRequestConfig r8 = r8.requestConfig     // Catch:{ all -> 0x0612 }
                java.lang.String r8 = r8.getResponseVariableName()     // Catch:{ all -> 0x0612 }
                if (r8 == 0) goto L_0x0567
                com.arlosoft.macrodroid.action.HttpRequestAction r8 = r1.this$0     // Catch:{ all -> 0x0612 }
                com.arlosoft.macrodroid.action.HttpRequestConfig r9 = r8.requestConfig     // Catch:{ all -> 0x0612 }
                java.lang.String r9 = r9.getResponseVariableName()     // Catch:{ all -> 0x0612 }
                com.arlosoft.macrodroid.common.MacroDroidVariable r8 = r8.mo27861q(r9)     // Catch:{ all -> 0x0612 }
                if (r8 == 0) goto L_0x0539
                com.arlosoft.macrodroid.action.HttpRequestAction r3 = r1.this$0     // Catch:{ all -> 0x0612 }
                com.arlosoft.macrodroid.variables.VariableValue$StringValue r9 = new com.arlosoft.macrodroid.variables.VariableValue$StringValue     // Catch:{ all -> 0x0612 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0612 }
                r11 = 2
                r12 = 0
                r9.<init>(r0, r12, r11, r12)     // Catch:{ all -> 0x0610 }
                r3.mo27832M2(r8, r9)     // Catch:{ all -> 0x0610 }
                goto L_0x0568
            L_0x0539:
                r12 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0610 }
                r0.<init>()     // Catch:{ all -> 0x0610 }
                r0.append(r3)     // Catch:{ all -> 0x0610 }
                com.arlosoft.macrodroid.action.HttpRequestAction r3 = r1.this$0     // Catch:{ all -> 0x0610 }
                com.arlosoft.macrodroid.action.HttpRequestConfig r3 = r3.requestConfig     // Catch:{ all -> 0x0610 }
                java.lang.String r3 = r3.getResponseVariableName()     // Catch:{ all -> 0x0610 }
                r0.append(r3)     // Catch:{ all -> 0x0610 }
                r0.append(r5)     // Catch:{ all -> 0x0610 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0610 }
                com.arlosoft.macrodroid.action.HttpRequestAction r3 = r1.this$0     // Catch:{ all -> 0x0610 }
                java.lang.Long r3 = r3.mo27840Y0()     // Catch:{ all -> 0x0610 }
                kotlin.jvm.internal.C13706o.m87928e(r3, r6)     // Catch:{ all -> 0x0610 }
                long r8 = r3.longValue()     // Catch:{ all -> 0x0610 }
                com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r0, r8)     // Catch:{ all -> 0x0610 }
                goto L_0x0568
            L_0x0567:
                r12 = 0
            L_0x0568:
                com.arlosoft.macrodroid.action.HttpRequestAction r0 = r1.this$0     // Catch:{ all -> 0x0610 }
                com.arlosoft.macrodroid.action.HttpRequestConfig r0 = r0.requestConfig     // Catch:{ all -> 0x0610 }
                boolean r0 = r0.getSaveReturnCodeToVariable()     // Catch:{ all -> 0x0610 }
                if (r0 == 0) goto L_0x05d1
                com.arlosoft.macrodroid.action.HttpRequestAction r0 = r1.this$0     // Catch:{ all -> 0x0610 }
                com.arlosoft.macrodroid.action.HttpRequestConfig r0 = r0.requestConfig     // Catch:{ all -> 0x0610 }
                java.lang.String r0 = r0.getReturnCodeVariableName()     // Catch:{ all -> 0x0610 }
                if (r0 == 0) goto L_0x05d1
                com.arlosoft.macrodroid.action.HttpRequestAction r0 = r1.this$0     // Catch:{ all -> 0x0610 }
                com.arlosoft.macrodroid.action.HttpRequestConfig r3 = r0.requestConfig     // Catch:{ all -> 0x0610 }
                java.lang.String r3 = r3.getReturnCodeVariableName()     // Catch:{ all -> 0x0610 }
                com.arlosoft.macrodroid.common.MacroDroidVariable r0 = r0.mo27861q(r3)     // Catch:{ all -> 0x0610 }
                if (r0 == 0) goto L_0x05a5
                com.arlosoft.macrodroid.action.HttpRequestAction r2 = r1.this$0     // Catch:{ all -> 0x0610 }
                com.arlosoft.macrodroid.variables.VariableValue$IntegerValue r3 = new com.arlosoft.macrodroid.variables.VariableValue$IntegerValue     // Catch:{ all -> 0x0610 }
                r19 = 0
                r21 = 0
                r22 = 2
                r23 = 0
                r18 = r3
                r18.<init>(r19, r21, r22, r23)     // Catch:{ all -> 0x0610 }
                r2.mo27832M2(r0, r3)     // Catch:{ all -> 0x0610 }
                goto L_0x05d1
            L_0x05a5:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0610 }
                r0.<init>()     // Catch:{ all -> 0x0610 }
                r0.append(r2)     // Catch:{ all -> 0x0610 }
                com.arlosoft.macrodroid.action.HttpRequestAction r2 = r1.this$0     // Catch:{ all -> 0x0610 }
                com.arlosoft.macrodroid.action.HttpRequestConfig r2 = r2.requestConfig     // Catch:{ all -> 0x0610 }
                java.lang.String r2 = r2.getReturnCodeVariableName()     // Catch:{ all -> 0x0610 }
                r0.append(r2)     // Catch:{ all -> 0x0610 }
                r0.append(r5)     // Catch:{ all -> 0x0610 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0610 }
                com.arlosoft.macrodroid.action.HttpRequestAction r2 = r1.this$0     // Catch:{ all -> 0x0610 }
                java.lang.Long r2 = r2.mo27840Y0()     // Catch:{ all -> 0x0610 }
                kotlin.jvm.internal.C13706o.m87928e(r2, r6)     // Catch:{ all -> 0x0610 }
                long r2 = r2.longValue()     // Catch:{ all -> 0x0610 }
                com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r0, r2)     // Catch:{ all -> 0x0610 }
            L_0x05d1:
                if (r10 == 0) goto L_0x05d8
                r10.close()
                ja.u r0 = p297ja.C13339u.f61331a
            L_0x05d8:
                com.arlosoft.macrodroid.action.HttpRequestAction r0 = r1.this$0
                android.os.PowerManager$WakeLock r0 = r0.wakelock
                if (r0 != 0) goto L_0x05e5
                kotlin.jvm.internal.C13706o.m87945v(r4)
                r14 = r12
                goto L_0x05e6
            L_0x05e5:
                r14 = r0
            L_0x05e6:
                r14.release()
                kotlinx.coroutines.h2 r0 = kotlinx.coroutines.C15186a1.m93731c()
                com.arlosoft.macrodroid.action.HttpRequestAction$d$b r2 = new com.arlosoft.macrodroid.action.HttpRequestAction$d$b
                com.arlosoft.macrodroid.action.HttpRequestAction r9 = r1.this$0
                boolean r10 = r1.$isTest
                int r11 = r1.$nextAction
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r12 = r1.$contextInfo
                boolean r13 = r1.$forceEvenIfNotEnabled
                java.util.Stack<java.lang.Integer> r14 = r1.$skipEndifIndexStack
                com.arlosoft.macrodroid.data.ResumeMacroInfo r15 = r1.$resumeMacroInfo
                r16 = 0
                r8 = r2
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
                r3 = 2
                r1.label = r3
                java.lang.Object r0 = kotlinx.coroutines.C15414h.m94298g(r0, r2, r1)
                if (r0 != r7) goto L_0x060d
                return r7
            L_0x060d:
                ja.u r0 = p297ja.C13339u.f61331a
                return r0
            L_0x0610:
                r0 = move-exception
                goto L_0x0614
            L_0x0612:
                r0 = move-exception
                r12 = 0
            L_0x0614:
                if (r10 == 0) goto L_0x061b
                r10.close()
                ja.u r2 = p297ja.C13339u.f61331a
            L_0x061b:
                com.arlosoft.macrodroid.action.HttpRequestAction r2 = r1.this$0
                android.os.PowerManager$WakeLock r2 = r2.wakelock
                if (r2 != 0) goto L_0x0628
                kotlin.jvm.internal.C13706o.m87945v(r4)
                r14 = r12
                goto L_0x0629
            L_0x0628:
                r14 = r2
            L_0x0629:
                r14.release()
                kotlinx.coroutines.h2 r2 = kotlinx.coroutines.C15186a1.m93731c()
                com.arlosoft.macrodroid.action.HttpRequestAction$d$b r3 = new com.arlosoft.macrodroid.action.HttpRequestAction$d$b
                com.arlosoft.macrodroid.action.HttpRequestAction r4 = r1.this$0
                boolean r5 = r1.$isTest
                int r6 = r1.$nextAction
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r8 = r1.$contextInfo
                boolean r9 = r1.$forceEvenIfNotEnabled
                java.util.Stack<java.lang.Integer> r10 = r1.$skipEndifIndexStack
                com.arlosoft.macrodroid.data.ResumeMacroInfo r11 = r1.$resumeMacroInfo
                r25 = 0
                r17 = r3
                r18 = r4
                r19 = r5
                r20 = r6
                r21 = r8
                r22 = r9
                r23 = r10
                r24 = r11
                r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
                r1.L$0 = r0
                r4 = 3
                r1.label = r4
                java.lang.Object r2 = kotlinx.coroutines.C15414h.m94298g(r2, r3, r1)
                if (r2 != r7) goto L_0x0661
                return r7
            L_0x0661:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.HttpRequestAction.C2479d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public HttpRequestAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ HttpRequestAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: n3 */
    private final String m10955n3() {
        switch (this.requestConfig.getRequestType()) {
            case 0:
                return "GET";
            case 1:
                return "POST";
            case 2:
                return HttpPut.METHOD_NAME;
            case 3:
                return HttpDelete.METHOD_NAME;
            case 4:
                return "PATCH";
            case 5:
                return HttpHead.METHOD_NAME;
            case 6:
                return HttpOptions.METHOD_NAME;
            case 7:
                return "TRACE ";
            default:
                return "?";
        }
    }

    /* renamed from: o3 */
    private final void m10956o3(String str) {
        Long Y0 = mo27840Y0();
        C13706o.m87928e(Y0, "macroGuid");
        C4878b.m18869h("Error - could not write to file: " + str + ". Need to re-select path and grant access.", Y0.longValue());
        Context K0 = mo27827K0();
        C13706o.m87928e(K0, "context");
        String j1 = SelectableItem.m15535j1(C17541R$string.write_file_failed_please_reconfigure_directory);
        C13706o.m87928e(j1, "getString(R.string.write…se_reconfigure_directory)");
        String name = mo27837X0().getName();
        C13706o.m87928e(name, "macro.name");
        C8194a.m34000a(K0, j1, name);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: cd.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: cd.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: cd.c} */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b0 A[SYNTHETIC, Splitter:B:37:0x00b0] */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* renamed from: p3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m10957p3(okhttp3.C15915d0 r6, com.arlosoft.macrodroid.triggers.TriggerContextInfo r7) {
        /*
            r5 = this;
            r0 = 0
            com.arlosoft.macrodroid.action.HttpRequestConfig r1 = r5.requestConfig     // Catch:{ Exception -> 0x0084 }
            java.lang.String r1 = r1.getSaveResponseFolderPathUri()     // Catch:{ Exception -> 0x0084 }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x0084 }
            android.content.Context r2 = r5.mo27827K0()     // Catch:{ Exception -> 0x0084 }
            androidx.documentfile.provider.DocumentFile r1 = androidx.documentfile.provider.DocumentFile.fromTreeUri(r2, r1)     // Catch:{ Exception -> 0x0084 }
            android.content.Context r2 = r5.mo27827K0()     // Catch:{ Exception -> 0x0084 }
            com.arlosoft.macrodroid.action.HttpRequestConfig r3 = r5.requestConfig     // Catch:{ Exception -> 0x0084 }
            java.lang.String r3 = r3.getSaveResponseFileName()     // Catch:{ Exception -> 0x0084 }
            com.arlosoft.macrodroid.macro.Macro r4 = r5.mo27837X0()     // Catch:{ Exception -> 0x0084 }
            java.lang.String r7 = com.arlosoft.macrodroid.common.C4023j0.m15760t0(r2, r3, r7, r4)     // Catch:{ Exception -> 0x0084 }
            kotlin.jvm.internal.C13706o.m87926c(r1)     // Catch:{ Exception -> 0x0084 }
            androidx.documentfile.provider.DocumentFile r2 = r1.findFile(r7)     // Catch:{ Exception -> 0x0084 }
            if (r2 != 0) goto L_0x0034
            java.lang.String r2 = "application/custom"
            androidx.documentfile.provider.DocumentFile r2 = r1.createFile(r2, r7)     // Catch:{ Exception -> 0x0084 }
        L_0x0034:
            if (r2 != 0) goto L_0x003f
            java.lang.String r6 = "fileName"
            kotlin.jvm.internal.C13706o.m87928e(r7, r6)     // Catch:{ Exception -> 0x0084 }
            r5.m10956o3(r7)     // Catch:{ Exception -> 0x0084 }
            goto L_0x0076
        L_0x003f:
            android.content.Context r7 = r5.mo27827K0()     // Catch:{ Exception -> 0x0084 }
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ Exception -> 0x0084 }
            android.net.Uri r1 = r2.getUri()     // Catch:{ Exception -> 0x0084 }
            java.lang.String r2 = "w"
            java.io.OutputStream r7 = r7.openOutputStream(r1, r2)     // Catch:{ Exception -> 0x0084 }
            okhttp3.e0 r6 = r6.mo75966b()     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            if (r6 == 0) goto L_0x005c
            cd.d r6 = r6.source()     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            goto L_0x005d
        L_0x005c:
            r6 = r0
        L_0x005d:
            if (r6 == 0) goto L_0x0075
            if (r7 == 0) goto L_0x006b
            cd.w r1 = p226cd.C11196l.m75165d(r7)     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            if (r1 == 0) goto L_0x006b
            cd.c r0 = p226cd.C11196l.m75162a(r1)     // Catch:{ Exception -> 0x007f, all -> 0x007c }
        L_0x006b:
            if (r0 == 0) goto L_0x0070
            r0.mo62396A1(r6)     // Catch:{ Exception -> 0x007f, all -> 0x007c }
        L_0x0070:
            if (r0 == 0) goto L_0x0075
            r0.close()     // Catch:{ Exception -> 0x007f, all -> 0x007c }
        L_0x0075:
            r0 = r7
        L_0x0076:
            if (r0 == 0) goto L_0x00ad
        L_0x0078:
            r0.close()     // Catch:{ Exception -> 0x00ad }
            goto L_0x00ad
        L_0x007c:
            r6 = move-exception
            r0 = r7
            goto L_0x00ae
        L_0x007f:
            r6 = move-exception
            r0 = r7
            goto L_0x0085
        L_0x0082:
            r6 = move-exception
            goto L_0x00ae
        L_0x0084:
            r6 = move-exception
        L_0x0085:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            r7.<init>()     // Catch:{ all -> 0x0082 }
            java.lang.String r1 = "Error - writing to file: "
            r7.append(r1)     // Catch:{ all -> 0x0082 }
            java.lang.String r6 = r6.getMessage()     // Catch:{ all -> 0x0082 }
            r7.append(r6)     // Catch:{ all -> 0x0082 }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x0082 }
            java.lang.Long r7 = r5.mo27840Y0()     // Catch:{ all -> 0x0082 }
            java.lang.String r1 = "macroGuid"
            kotlin.jvm.internal.C13706o.m87928e(r7, r1)     // Catch:{ all -> 0x0082 }
            long r1 = r7.longValue()     // Catch:{ all -> 0x0082 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r6, r1)     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x00ad
            goto L_0x0078
        L_0x00ad:
            return
        L_0x00ae:
            if (r0 == 0) goto L_0x00b3
            r0.close()     // Catch:{ Exception -> 0x00b3 }
        L_0x00b3:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.HttpRequestAction.m10957p3(okhttp3.d0, com.arlosoft.macrodroid.triggers.TriggerContextInfo):void");
    }

    /* renamed from: D1 */
    public final void mo25154D1() {
        Object systemService = mo27827K0().getSystemService("power");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, "macrodroid:HttpRequestAction");
        C13706o.m87928e(newWakeLock, "pm.newWakeLock(PowerMana…droid:HttpRequestAction\")");
        this.wakelock = newWakeLock;
        if (newWakeLock == null) {
            C13706o.m87945v("wakelock");
            newWakeLock = null;
        }
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: F */
    public String[] mo24440F() {
        List m = C13614t.m87751m(this.requestConfig.getUrlToOpen(), this.requestConfig.getBasicAuthUsername(), this.requestConfig.getBasicAuthPassword(), this.requestConfig.getContentBodyText(), this.requestConfig.getSaveResponseFileName());
        List<HttpParam> headerParams = this.requestConfig.getHeaderParams();
        ArrayList arrayList = new ArrayList();
        for (HttpParam httpParam : headerParams) {
            boolean unused = C13624y.m87797z(arrayList, C13614t.m87751m(httpParam.getParamName(), httpParam.getParamValue()));
        }
        List q0 = C13566b0.m87442q0(m, arrayList);
        List<HttpParam> queryParams = this.requestConfig.getQueryParams();
        ArrayList arrayList2 = new ArrayList();
        for (HttpParam httpParam2 : queryParams) {
            boolean unused2 = C13624y.m87797z(arrayList2, C13614t.m87751m(httpParam2.getParamName(), httpParam2.getParamValue()));
        }
        Object[] array = C13566b0.m87442q0(q0, arrayList2).toArray(new String[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return SelectableItem.m15535j1(C17541R$string.action_http_request) + " (" + m10955n3() + ')';
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        String[] strArr2 = strArr;
        C13706o.m87929f(strArr2, "magicText");
        HttpRequestConfig copy$default = HttpRequestConfig.copy$default(this.requestConfig, 0, strArr2[0], 0, (String) null, 0, (String) null, (String) null, (String) null, false, (String) null, (DictionaryKeys) null, 0, (String) null, (DictionaryKeys) null, (String) null, (String) null, (String) null, false, false, false, false, (String) null, (String) null, (List) null, (List) null, 33554429, (Object) null);
        this.requestConfig = copy$default;
        HttpRequestConfig copy$default2 = HttpRequestConfig.copy$default(copy$default, 0, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, false, (String) null, (DictionaryKeys) null, 0, (String) null, (DictionaryKeys) null, (String) null, (String) null, (String) null, false, false, false, false, strArr2[1], (String) null, (List) null, (List) null, 31457279, (Object) null);
        this.requestConfig = copy$default2;
        HttpRequestConfig copy$default3 = HttpRequestConfig.copy$default(copy$default2, 0, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, false, (String) null, (DictionaryKeys) null, 0, (String) null, (DictionaryKeys) null, (String) null, (String) null, (String) null, false, false, false, false, (String) null, strArr2[2], (List) null, (List) null, 29360127, (Object) null);
        this.requestConfig = copy$default3;
        HttpRequestConfig copy$default4 = HttpRequestConfig.copy$default(copy$default3, 0, (String) null, 0, (String) null, 0, strArr2[3], (String) null, (String) null, false, (String) null, (DictionaryKeys) null, 0, (String) null, (DictionaryKeys) null, (String) null, (String) null, (String) null, false, false, false, false, (String) null, (String) null, (List) null, (List) null, 33554399, (Object) null);
        this.requestConfig = copy$default4;
        HttpRequestConfig copy$default5 = HttpRequestConfig.copy$default(copy$default4, 0, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, false, (String) null, (DictionaryKeys) null, 0, (String) null, (DictionaryKeys) null, (String) null, (String) null, strArr2[4], false, false, false, false, (String) null, (String) null, (List) null, (List) null, 33488895, (Object) null);
        this.requestConfig = copy$default5;
        int size = copy$default5.getHeaderParams().size();
        for (C13592k0 k0Var : C13566b0.m87411M0(C13596m.m87632y(strArr2, 5))) {
            List<HttpParam> headerParams = k0Var.mo71844c() / 2 < size ? this.requestConfig.getHeaderParams() : this.requestConfig.getQueryParams();
            int c = (k0Var.mo71844c() / 2 < size ? k0Var.mo71844c() : k0Var.mo71844c() - (size * 2)) / 2;
            HttpParam httpParam = headerParams.get(c);
            int c2 = k0Var.mo71844c() % 2;
            String str = (String) k0Var.mo71845d();
            headerParams.set(c, c2 == 0 ? HttpParam.copy$default(httpParam, str, (String) null, 2, (Object) null) : HttpParam.copy$default(httpParam, (String) null, str, 1, (Object) null));
        }
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.requestConfig.getUrlToOpen();
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7770j1.f18769j.mo37756a();
    }

    /* renamed from: a */
    public String[] mo24435a() {
        return new String[]{this.requestConfig.getReturnCodeVariableName(), this.requestConfig.getResponseVariableName()};
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
    }

    /* renamed from: e */
    public void mo24436e(String[] strArr) {
        String[] strArr2 = strArr;
        C13706o.m87929f(strArr2, "varNames");
        this.requestConfig = HttpRequestConfig.copy$default(this.requestConfig, 0, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, false, strArr2[0], (DictionaryKeys) null, 0, strArr2[1], (DictionaryKeys) null, (String) null, (String) null, (String) null, false, false, false, false, (String) null, (String) null, (List) null, (List) null, 33549823, (Object) null);
    }

    /* renamed from: h */
    public void mo24421h(TriggerContextInfo triggerContextInfo, int i, boolean z, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, boolean z2) {
        C13706o.m87929f(stack, "skipEndifIndexStack");
        PowerManager.WakeLock wakeLock = this.wakelock;
        if (wakeLock == null) {
            C13706o.m87945v("wakelock");
            wakeLock = null;
        }
        wakeLock.acquire(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
        C15561w1 unused = C15473j.m94492d(C15503p1.f64723a, C15186a1.m93730b(), (C15486m0) null, new C2479d(this, triggerContextInfo, z2, i, z, stack, resumeMacroInfo, (C13635d<? super C2479d>) null), 2, (Object) null);
        if (!z2 && !this.requestConfig.getBlockNextAction()) {
            mo27837X0().invokeActions(mo27837X0().getActions(), i, triggerContextInfo, z, stack, resumeMacroInfo);
        }
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        C13706o.m87929f(activity, "activity");
        mo27877y2(activity);
        if (i == 0 && i2 == -1) {
            HttpRequestConfig b = C2966c7.f8098a.mo26351b();
            if (b != null) {
                this.requestConfig = b;
            }
            mo24689O1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        C2966c7 c7Var = C2966c7.f8098a;
        c7Var.mo26352c(this);
        c7Var.mo26353d(this.requestConfig);
        Activity j0 = mo27850j0();
        Intent intent = new Intent(mo27850j0(), HttpRequestConfigActivity.class);
        intent.putExtra("http_request_config", this.requestConfig);
        Long Y0 = mo27840Y0();
        C13706o.m87928e(Y0, "macroGuid");
        intent.putExtra("MacroGuid", Y0.longValue());
        j0.startActivityForResult(intent, 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.requestConfig, i);
    }

    public HttpRequestAction() {
        HttpRequestConfig httpRequestConfig = r0;
        HttpRequestConfig httpRequestConfig2 = new HttpRequestConfig(0, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, false, (String) null, (DictionaryKeys) null, 0, (String) null, (DictionaryKeys) null, (String) null, (String) null, (String) null, false, false, false, false, (String) null, (String) null, (List) null, (List) null, 33554431, (C13695i) null);
        this.requestConfig = httpRequestConfig;
        mo25154D1();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private HttpRequestAction(Parcel parcel) {
        super(parcel);
        HttpRequestConfig httpRequestConfig = r1;
        HttpRequestConfig httpRequestConfig2 = new HttpRequestConfig(0, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, false, (String) null, (DictionaryKeys) null, 0, (String) null, (DictionaryKeys) null, (String) null, (String) null, (String) null, false, false, false, false, (String) null, (String) null, (List) null, (List) null, 33554431, (C13695i) null);
        this.requestConfig = httpRequestConfig;
        mo25154D1();
        HttpRequestConfig httpRequestConfig3 = (HttpRequestConfig) parcel.readParcelable(HttpRequestConfig.class.getClassLoader());
        this.requestConfig = httpRequestConfig3 == null ? new HttpRequestConfig(0, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, false, (String) null, (DictionaryKeys) null, 0, (String) null, (DictionaryKeys) null, (String) null, (String) null, (String) null, false, false, false, false, (String) null, (String) null, (List) null, (List) null, 33554431, (C13695i) null) : httpRequestConfig3;
    }
}
