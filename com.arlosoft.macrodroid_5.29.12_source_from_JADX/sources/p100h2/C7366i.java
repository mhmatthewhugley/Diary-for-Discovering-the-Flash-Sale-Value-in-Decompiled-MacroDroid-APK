package p100h2;

import android.content.Context;
import android.os.Build;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.action.ActionBlockAction;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.macro.C4915a;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.ConnectionInfo;
import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import com.google.android.gms.nearby.connection.ConnectionResolution;
import com.google.android.gms.nearby.connection.DiscoveredEndpointInfo;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.EndpointDiscoveryCallback;
import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.nearby.connection.PayloadCallback;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import p172u1.C10283c;
import p190x3.C10378a;
import p319lc.C15626c;
import p455ag.C17105a;

/* renamed from: h2.i */
/* compiled from: NearbyHelper.kt */
public final class C7366i {

    /* renamed from: m */
    public static final C7367a f18012m = new C7367a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f18013a;

    /* renamed from: b */
    private final C4915a f18014b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C7365a f18015c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f18016d;

    /* renamed from: e */
    private C7369c f18017e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Macro f18018f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C7368b f18019g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C7374h f18020h = new C7374h();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final PayloadCallback f18021i = new C7372f(this);

    /* renamed from: j */
    private final C7373g f18022j = new C7373g(this);

    /* renamed from: k */
    private final C7371e f18023k = new C7371e(this);

    /* renamed from: l */
    private final C7370d f18024l = new C7370d(this);

    /* renamed from: h2.i$a */
    /* compiled from: NearbyHelper.kt */
    public static final class C7367a {
        private C7367a() {
        }

        public /* synthetic */ C7367a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: h2.i$b */
    /* compiled from: NearbyHelper.kt */
    public interface C7368b {
        /* renamed from: a */
        void mo27232a(String str);
    }

    /* renamed from: h2.i$c */
    /* compiled from: NearbyHelper.kt */
    public interface C7369c {
        /* renamed from: a */
        void mo27170a(C7365a aVar);
    }

    /* renamed from: h2.i$d */
    /* compiled from: NearbyHelper.kt */
    public static final class C7370d extends EndpointDiscoveryCallback {

        /* renamed from: a */
        final /* synthetic */ C7366i f18025a;

        C7370d(C7366i iVar) {
            this.f18025a = iVar;
        }

        /* renamed from: a */
        public void mo37365a(String str, DiscoveredEndpointInfo discoveredEndpointInfo) {
            C13706o.m87929f(str, "endPointId");
            C13706o.m87929f(discoveredEndpointInfo, "endPointInfo");
            this.f18025a.m30424E(str, discoveredEndpointInfo);
        }

        /* renamed from: b */
        public void mo37366b(String str) {
            C13706o.m87929f(str, "endPointId");
            C7365a j = this.f18025a.f18015c;
            if (C13706o.m87924a(j != null ? j.mo37348b() : null, str)) {
                this.f18025a.f18015c = null;
            }
            C17105a.m100579a("[NEARBY] Lost device: " + str, new Object[0]);
        }
    }

    /* renamed from: h2.i$e */
    /* compiled from: NearbyHelper.kt */
    public static final class C7371e extends ConnectionLifecycleCallback {

        /* renamed from: a */
        final /* synthetic */ C7366i f18026a;

        C7371e(C7366i iVar) {
            this.f18026a = iVar;
        }

        /* renamed from: b */
        public void mo37367b(String str, ConnectionInfo connectionInfo) {
            C13706o.m87929f(str, "endPointId");
            C13706o.m87929f(connectionInfo, "connectionInfo");
            C17105a.m100579a("[NEARBY] - Connection Initiated: %s", str);
            Nearby.m66236a(this.f18026a.f18013a).mo52763f(str, this.f18026a.f18021i);
        }

        /* renamed from: c */
        public void mo37368c(String str, ConnectionResolution connectionResolution) {
            C13706o.m87929f(str, "endPointId");
            C13706o.m87929f(connectionResolution, "connectionResolution");
            if (connectionResolution.mo55659a().mo21297q2()) {
                C17105a.m100579a("[NEARBY] - Connection Result: %s", str);
                this.f18026a.f18016d = str;
            }
        }

        /* renamed from: d */
        public void mo37369d(String str) {
            C13706o.m87929f(str, "endPointId");
            C17105a.m100579a("[NEARBY] - Disconnected: %s", str);
        }
    }

    /* renamed from: h2.i$f */
    /* compiled from: NearbyHelper.kt */
    public static final class C7372f extends PayloadCallback {

        /* renamed from: a */
        final /* synthetic */ C7366i f18027a;

        C7372f(C7366i iVar) {
            this.f18027a = iVar;
        }

        /* renamed from: a */
        public void mo37370a(String str, Payload payload) {
            C13706o.m87929f(str, "endpointId");
            C13706o.m87929f(payload, "payload");
            C17105a.m100579a("[NEARBY] Payload Received: %s", payload);
            byte[] a = payload.mo55678a();
            C7366i iVar = this.f18027a;
            C13706o.m87926c(a);
            String w = iVar.mo37362w(a);
            this.f18027a.mo37363x();
            this.f18027a.mo37357O();
            C7368b k = this.f18027a.f18019g;
            if (k != null) {
                k.mo27232a(w);
            }
        }

        /* renamed from: b */
        public void mo37371b(String str, PayloadTransferUpdate payloadTransferUpdate) {
            C13706o.m87929f(str, "endpointId");
            C13706o.m87929f(payloadTransferUpdate, "payloadTransferUpdate");
            C17105a.m100579a("[NEARBY] Payload Transfer update %s, bytes transferred = %d", str, Long.valueOf(payloadTransferUpdate.mo55693l2()));
        }
    }

    /* renamed from: h2.i$g */
    /* compiled from: NearbyHelper.kt */
    public static final class C7373g extends ConnectionLifecycleCallback {

        /* renamed from: a */
        final /* synthetic */ C7366i f18028a;

        C7373g(C7366i iVar) {
            this.f18028a = iVar;
        }

        /* renamed from: b */
        public void mo37367b(String str, ConnectionInfo connectionInfo) {
            C13706o.m87929f(str, "endPointId");
            C13706o.m87929f(connectionInfo, "connectionInfo");
            C17105a.m100579a("[NEARBY] Connection Initiated: " + str, new Object[0]);
            Nearby.m66236a(C10378a.f23596a.mo41059a()).mo52763f(str, this.f18028a.f18020h);
        }

        /* renamed from: c */
        public void mo37368c(String str, ConnectionResolution connectionResolution) {
            C13706o.m87929f(str, "endPointId");
            C13706o.m87929f(connectionResolution, "connectionInfo");
            if (connectionResolution.mo55659a().mo21297q2()) {
                this.f18028a.f18016d = str;
                if (this.f18028a.f18018f != null) {
                    this.f18028a.m30425G(str);
                }
            }
        }

        /* renamed from: d */
        public void mo37369d(String str) {
            C13706o.m87929f(str, "endPointId");
            this.f18028a.f18016d = null;
            C7365a j = this.f18028a.f18015c;
            if (C13706o.m87924a(j != null ? j.mo37348b() : null, str)) {
                this.f18028a.f18015c = null;
            }
            C17105a.m100579a("[NEARBY] Disconnected: " + str, new Object[0]);
        }
    }

    /* renamed from: h2.i$h */
    /* compiled from: NearbyHelper.kt */
    public static final class C7374h extends PayloadCallback {
        C7374h() {
        }

        /* renamed from: a */
        public void mo37370a(String str, Payload payload) {
            C13706o.m87929f(str, "endPointId");
            C13706o.m87929f(payload, "payload");
            C17105a.m100579a("[NEARBY] Payload Received: " + str, new Object[0]);
        }

        /* renamed from: b */
        public void mo37371b(String str, PayloadTransferUpdate payloadTransferUpdate) {
            C13706o.m87929f(str, "endPointId");
            C13706o.m87929f(payloadTransferUpdate, "payloadTransferUpdate");
            C17105a.m100579a("[NEARBY] Payload Transfer: " + str + ", bytes=" + payloadTransferUpdate.mo55693l2(), new Object[0]);
        }
    }

    public C7366i(Context context, C4915a aVar) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(aVar, "actionBlockStore");
        this.f18013a = context;
        this.f18014b = aVar;
    }

    /* renamed from: A */
    private final String m30422A() {
        String s = C10283c.m40416f().mo63984s(this.f18018f);
        C13706o.m87928e(s, "gson.toJson(macro)");
        return s;
    }

    /* renamed from: B */
    private final String m30423B(String str) {
        if (!C15177w.m93663N(str, "(", false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(0, C15177w.m93687f0(str, "(", 0, false, 6, (Object) null) - 1);
        C13706o.m87928e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final void m30424E(String str, DiscoveredEndpointInfo discoveredEndpointInfo) {
        String str2 = this.f18016d;
        if (str2 != null && !C13706o.m87924a(str2, str)) {
            mo37364y(str2);
            this.f18016d = null;
        }
        String a = discoveredEndpointInfo.mo55668a();
        C13706o.m87928e(a, "endPointInfo.endpointName");
        this.f18015c = new C7365a(str, a);
        mo37354F();
        C17105a.m100579a("[NEARBY] Found device: " + str + ", name=" + discoveredEndpointInfo.mo55668a(), new Object[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public final void m30425G(String str) {
        C7369c cVar;
        Macro macro;
        ActionBlock g;
        ArrayList arrayList = new ArrayList();
        Macro macro2 = this.f18018f;
        C13706o.m87926c(macro2);
        Iterator<Action> it = macro2.getActions().iterator();
        while (it.hasNext()) {
            Action next = it.next();
            if ((next instanceof ActionBlockAction) && (g = this.f18014b.mo29649g(((ActionBlockAction) next).mo24715x3())) != null) {
                arrayList.add(g);
            }
        }
        if (arrayList.size() > 0 && (macro = this.f18018f) != null) {
            macro.initialiseExportedActionBlocks(this.f18014b);
        }
        byte[] s = mo37360s(m30422A());
        if (s.length < 1047552) {
            Payload d = Payload.m66303d(s);
            C13706o.m87928e(d, "fromBytes(compressedBytes)");
            Task<Void> g2 = Nearby.m66236a(C10378a.f23596a.mo41059a()).mo52764g(str, d);
            C13706o.m87928e(g2, "getConnectionsClient(Gra…endPointId, bytesPayload)");
            g2.mo23702c(new C12368b(g2, this));
        } else {
            C15626c.makeText(this.f18013a, C17541R$string.share_nearby_macro_too_large, 1).show();
        }
        C7365a aVar = this.f18015c;
        if (aVar != null && (cVar = this.f18017e) != null) {
            cVar.mo27170a(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public static final void m30426H(Task task, C7366i iVar, Task task2) {
        C13706o.m87929f(task, "$task");
        C13706o.m87929f(iVar, "this$0");
        C13706o.m87929f(task2, "it");
        if (!task.mo23719t()) {
            C15626c.makeText(iVar.f18013a, C17541R$string.share_nearby_transfer_failed, 1).show();
            FirebaseCrashlytics a = FirebaseCrashlytics.m6487a();
            a.mo22935c("Failed to share to nearby device: " + task.mo23714o());
        }
        iVar.mo37358P();
        iVar.mo37363x();
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static final void m30427J(Void voidR) {
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public static final void m30428K(Exception exc) {
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public static final void m30429M(Exception exc) {
        C17105a.m100579a("[NEARBY] - Start discovery failed: " + exc, new Object[0]);
        boolean z = exc instanceof ApiException;
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public static final void m30430N(Void voidR) {
        C17105a.m100579a("[NEARBY] - Start discovery success", new Object[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static final void m30448u(Void voidR) {
        C17105a.m100579a("Connect - OnSuccess", new Object[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static final void m30449v(Exception exc) {
        C17105a.m100579a("Connect - OnFailure: " + exc, new Object[0]);
    }

    /* renamed from: z */
    private final String m30450z() {
        return Build.MANUFACTURER + ' ' + Build.MODEL + " (" + C5163j2.m20174i(this.f18013a) + ')';
    }

    /* renamed from: C */
    public final void mo37352C(C7368b bVar) {
        C13706o.m87929f(bVar, "nearbyReceiveListener");
        this.f18019g = bVar;
    }

    /* renamed from: D */
    public final void mo37353D(Macro macro, C7369c cVar) {
        C13706o.m87929f(macro, "macro");
        C13706o.m87929f(cVar, "nearbySendListener");
        this.f18018f = macro;
        this.f18017e = cVar;
    }

    /* renamed from: F */
    public final void mo37354F() {
        C7365a aVar = this.f18015c;
        if (aVar != null) {
            Context context = this.f18013a;
            C13696i0 i0Var = C13696i0.f61931a;
            String string = context.getString(C17541R$string.share_nearby_sharing_to_device_name);
            C13706o.m87928e(string, "context.getString(R.stri…y_sharing_to_device_name)");
            String format = String.format(string, Arrays.copyOf(new Object[]{m30423B(aVar.mo37347a())}, 1));
            C13706o.m87928e(format, "format(format, *args)");
            C15626c.m94876a(context, format, 1).show();
        }
        C7365a aVar2 = this.f18015c;
        if (aVar2 == null) {
            return;
        }
        if (C13706o.m87924a(this.f18016d, aVar2.mo37348b())) {
            m30425G(aVar2.mo37348b());
            return;
        }
        if (this.f18016d != null) {
            mo37364y(aVar2.mo37348b());
            this.f18016d = null;
        }
        mo37361t(aVar2.mo37348b(), this.f18022j);
    }

    /* renamed from: I */
    public final void mo37355I(String str) {
        C13706o.m87929f(str, "serviceId");
        AdvertisingOptions a = new AdvertisingOptions.Builder().mo55646b(Strategy.f47475g).mo55645a();
        C13706o.m87928e(a, "Builder().setStrategy(St…P_POINT_TO_POINT).build()");
        Nearby.m66236a(this.f18013a).mo52760c(m30450z(), str, this.f18023k, a).mo23708i(C12373g.f59060a).mo23705f(C12371e.f59058a);
    }

    /* renamed from: L */
    public final void mo37356L(String str) {
        C13706o.m87929f(str, "serviceId");
        DiscoveryOptions a = new DiscoveryOptions.Builder().mo55677b(Strategy.f47475g).mo55676a();
        C13706o.m87928e(a, "Builder().setStrategy(St…P_POINT_TO_POINT).build()");
        Nearby.m66236a(this.f18013a).mo52761d(str, this.f18024l, a).mo23708i(C12374h.f59061a).mo23705f(C12370d.f59057a);
    }

    /* renamed from: O */
    public final void mo37357O() {
        Nearby.m66236a(this.f18013a).mo52765i();
    }

    /* renamed from: P */
    public final void mo37358P() {
        Nearby.m66236a(this.f18013a).mo52759b();
    }

    /* renamed from: r */
    public final void mo37359r() {
        this.f18018f = null;
        this.f18017e = null;
        this.f18019g = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        kotlin.p312io.C13667b.m87853a(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        throw r0;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo37360s(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.C13706o.m87929f(r5, r0)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream
            r2.<init>(r0)
            java.nio.charset.Charset r3 = kotlin.text.C15147d.f64349b
            r1.<init>(r2, r3)
            boolean r2 = r1 instanceof java.io.BufferedWriter
            if (r2 == 0) goto L_0x001d
            java.io.BufferedWriter r1 = (java.io.BufferedWriter) r1
            goto L_0x0025
        L_0x001d:
            java.io.BufferedWriter r2 = new java.io.BufferedWriter
            r3 = 8192(0x2000, float:1.14794E-41)
            r2.<init>(r1, r3)
            r1 = r2
        L_0x0025:
            r2 = 0
            r1.write(r5)     // Catch:{ all -> 0x0038 }
            ja.u r5 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0038 }
            kotlin.p312io.C13667b.m87853a(r1, r2)
            byte[] r5 = r0.toByteArray()
            java.lang.String r0 = "bos.toByteArray()"
            kotlin.jvm.internal.C13706o.m87928e(r5, r0)
            return r5
        L_0x0038:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            kotlin.p312io.C13667b.m87853a(r1, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p100h2.C7366i.mo37360s(java.lang.String):byte[]");
    }

    /* renamed from: t */
    public final void mo37361t(String str, ConnectionLifecycleCallback connectionLifecycleCallback) {
        C13706o.m87929f(str, "endPointId");
        C13706o.m87929f(connectionLifecycleCallback, "connectionLifecycleCallback");
        Nearby.m66236a(this.f18013a).mo52766j("BOOM", str, connectionLifecycleCallback).mo23708i(C12372f.f59059a).mo23705f(C12369c.f59056a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        kotlin.p312io.C13667b.m87853a(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        throw r1;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo37362w(byte[] r4) {
        /*
            r3 = this;
            java.lang.String r0 = "byteArray"
            kotlin.jvm.internal.C13706o.m87929f(r4, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.util.zip.GZIPInputStream r1 = new java.util.zip.GZIPInputStream
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r4)
            r1.<init>(r2)
            java.nio.charset.Charset r4 = kotlin.text.C15147d.f64349b
            r0.<init>(r1, r4)
            boolean r4 = r0 instanceof java.io.BufferedReader
            if (r4 == 0) goto L_0x001d
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0
            goto L_0x0025
        L_0x001d:
            java.io.BufferedReader r4 = new java.io.BufferedReader
            r1 = 8192(0x2000, float:1.14794E-41)
            r4.<init>(r0, r1)
            r0 = r4
        L_0x0025:
            r4 = 0
            java.lang.String r1 = kotlin.p312io.C13675i.m87863f(r0)     // Catch:{ all -> 0x002e }
            kotlin.p312io.C13667b.m87853a(r0, r4)
            return r1
        L_0x002e:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0030 }
        L_0x0030:
            r1 = move-exception
            kotlin.p312io.C13667b.m87853a(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p100h2.C7366i.mo37362w(byte[]):java.lang.String");
    }

    /* renamed from: x */
    public final void mo37363x() {
        String str = this.f18016d;
        if (str != null) {
            mo37364y(str);
        }
        this.f18016d = null;
        this.f18015c = null;
    }

    /* renamed from: y */
    public final void mo37364y(String str) {
        C13706o.m87929f(str, "endPointId");
        Nearby.m66236a(this.f18013a).mo52762e(str);
    }
}
