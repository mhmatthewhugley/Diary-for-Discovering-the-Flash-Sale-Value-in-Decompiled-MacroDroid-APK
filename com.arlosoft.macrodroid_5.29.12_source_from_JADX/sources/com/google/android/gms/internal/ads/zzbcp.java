package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import org.apache.commons.p353io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbcp extends Thread {

    /* renamed from: A */
    private final int f26608A;

    /* renamed from: B */
    private final int f26609B;

    /* renamed from: C */
    private final int f26610C;

    /* renamed from: D */
    private final String f26611D;

    /* renamed from: E */
    private final boolean f26612E;

    /* renamed from: F */
    private final boolean f26613F;

    /* renamed from: G */
    private final boolean f26614G;

    /* renamed from: a */
    private boolean f26615a = false;

    /* renamed from: c */
    private boolean f26616c = false;

    /* renamed from: d */
    private final Object f26617d;

    /* renamed from: f */
    private final zzbcg f26618f;

    /* renamed from: g */
    private final int f26619g;

    /* renamed from: o */
    private final int f26620o;

    /* renamed from: p */
    private final int f26621p;

    /* renamed from: s */
    private final int f26622s;

    /* renamed from: z */
    private final int f26623z;

    public zzbcp() {
        zzbcg zzbcg = new zzbcg();
        this.f26618f = zzbcg;
        this.f26617d = new Object();
        this.f26620o = ((Long) zzbkk.f27403d.mo42728e()).intValue();
        this.f26621p = ((Long) zzbkk.f27400a.mo42728e()).intValue();
        this.f26622s = ((Long) zzbkk.f27404e.mo42728e()).intValue();
        this.f26623z = ((Long) zzbkk.f27402c.mo42728e()).intValue();
        this.f26608A = ((Integer) zzay.m1924c().mo42663b(zzbjc.f26966Q)).intValue();
        this.f26609B = ((Integer) zzay.m1924c().mo42663b(zzbjc.f26976R)).intValue();
        this.f26610C = ((Integer) zzay.m1924c().mo42663b(zzbjc.f26986S)).intValue();
        this.f26619g = ((Long) zzbkk.f27405f.mo42728e()).intValue();
        this.f26611D = (String) zzay.m1924c().mo42663b(zzbjc.f27006U);
        this.f26612E = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27016V)).booleanValue();
        this.f26613F = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27025W)).booleanValue();
        this.f26614G = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27034X)).booleanValue();
        setName("ContentFetchTask");
    }

    /* renamed from: a */
    public final zzbcf mo42468a() {
        return this.f26618f.mo42442a(this.f26614G);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: b */
    public final zzbco mo42469b(@Nullable View view, zzbcf zzbcf) {
        if (view == null) {
            return new zzbco(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new zzbco(this, 0, 0);
            }
            zzbcf.mo42436k(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new zzbco(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof zzcmp)) {
            WebView webView = (WebView) view;
            if (!PlatformVersion.m4899d()) {
                return new zzbco(this, 0, 0);
            }
            zzbcf.mo42432h();
            webView.post(new zzbcn(this, zzbcf, webView, globalVisibleRect));
            return new zzbco(this, 0, 1);
        } else if (!(view instanceof ViewGroup)) {
            return new zzbco(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                zzbco b = mo42469b(viewGroup.getChildAt(i3), zzbcf);
                i += b.f26606a;
                i2 += b.f26607b;
            }
            return new zzbco(this, i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        if (r11 == 0) goto L_0x0073;
     */
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42470c(android.view.View r11) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzbcf r9 = new com.google.android.gms.internal.ads.zzbcf     // Catch:{ Exception -> 0x0083 }
            int r1 = r10.f26620o     // Catch:{ Exception -> 0x0083 }
            int r2 = r10.f26621p     // Catch:{ Exception -> 0x0083 }
            int r3 = r10.f26622s     // Catch:{ Exception -> 0x0083 }
            int r4 = r10.f26623z     // Catch:{ Exception -> 0x0083 }
            int r5 = r10.f26608A     // Catch:{ Exception -> 0x0083 }
            int r6 = r10.f26609B     // Catch:{ Exception -> 0x0083 }
            int r7 = r10.f26610C     // Catch:{ Exception -> 0x0083 }
            boolean r8 = r10.f26613F     // Catch:{ Exception -> 0x0083 }
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0083 }
            com.google.android.gms.internal.ads.zzbck r0 = com.google.android.gms.ads.internal.zzt.m2891d()     // Catch:{ Exception -> 0x0083 }
            android.content.Context r0 = r0.mo42461b()     // Catch:{ Exception -> 0x0083 }
            if (r0 == 0) goto L_0x0054
            java.lang.String r1 = r10.f26611D     // Catch:{ Exception -> 0x0083 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0083 }
            if (r1 != 0) goto L_0x0054
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ Exception -> 0x0083 }
            com.google.android.gms.internal.ads.zzbiu r2 = com.google.android.gms.internal.ads.zzbjc.f26996T     // Catch:{ Exception -> 0x0083 }
            com.google.android.gms.internal.ads.zzbja r3 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ Exception -> 0x0083 }
            java.lang.Object r2 = r3.mo42663b(r2)     // Catch:{ Exception -> 0x0083 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0083 }
            java.lang.String r3 = "id"
            java.lang.String r0 = r0.getPackageName()     // Catch:{ Exception -> 0x0083 }
            int r0 = r1.getIdentifier(r2, r3, r0)     // Catch:{ Exception -> 0x0083 }
            java.lang.Object r0 = r11.getTag(r0)     // Catch:{ Exception -> 0x0083 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0083 }
            if (r0 == 0) goto L_0x0054
            java.lang.String r1 = r10.f26611D     // Catch:{ Exception -> 0x0083 }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0083 }
            if (r0 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            return
        L_0x0054:
            com.google.android.gms.internal.ads.zzbco r11 = r10.mo42469b(r11, r9)     // Catch:{ Exception -> 0x0083 }
            r9.mo42438m()     // Catch:{ Exception -> 0x0083 }
            int r0 = r11.f26606a     // Catch:{ Exception -> 0x0083 }
            if (r0 != 0) goto L_0x0065
            int r0 = r11.f26607b     // Catch:{ Exception -> 0x0083 }
            if (r0 == 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            return
        L_0x0065:
            int r11 = r11.f26607b     // Catch:{ Exception -> 0x0083 }
            if (r11 != 0) goto L_0x0071
            int r11 = r9.mo42426c()     // Catch:{ Exception -> 0x0083 }
            if (r11 == 0) goto L_0x0070
            goto L_0x0073
        L_0x0070:
            return
        L_0x0071:
            if (r11 != 0) goto L_0x007d
        L_0x0073:
            com.google.android.gms.internal.ads.zzbcg r11 = r10.f26618f     // Catch:{ Exception -> 0x0083 }
            boolean r11 = r11.mo42445d(r9)     // Catch:{ Exception -> 0x0083 }
            if (r11 != 0) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            return
        L_0x007d:
            com.google.android.gms.internal.ads.zzbcg r11 = r10.f26618f     // Catch:{ Exception -> 0x0083 }
            r11.mo42443b(r9)     // Catch:{ Exception -> 0x0083 }
            return
        L_0x0083:
            r11 = move-exception
            java.lang.String r0 = "Exception in fetchContentOnUIThread"
            com.google.android.gms.internal.ads.zzcgp.m45227e(r0, r11)
            com.google.android.gms.internal.ads.zzcfy r0 = com.google.android.gms.ads.internal.zzt.m2904q()
            java.lang.String r1 = "ContentFetchTask.fetchContent"
            r0.mo43503t(r11, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbcp.mo42470c(android.view.View):void");
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: d */
    public final void mo42471d(zzbcf zzbcf, WebView webView, String str, boolean z) {
        zzbcf.mo42431g();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.f26612E || TextUtils.isEmpty(webView.getTitle())) {
                    zzbcf.mo42437l(optString, z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    zzbcf.mo42437l(title + IOUtils.LINE_SEPARATOR_UNIX + optString, z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                }
            }
            if (zzbcf.mo42440o()) {
                this.f26618f.mo42444c(zzbcf);
            }
        } catch (JSONException unused) {
            zzcgp.m45224b("Json string may be malformed.");
        } catch (Throwable th) {
            zzcgp.m45225c("Failed to get webview content.", th);
            zzt.m2904q().mo43503t(th, "ContentFetchTask.processWebViewContent");
        }
    }

    /* renamed from: e */
    public final void mo42472e() {
        synchronized (this.f26617d) {
            if (this.f26615a) {
                zzcgp.m45224b("Content hash thread already started, quiting...");
                return;
            }
            this.f26615a = true;
            start();
        }
    }

    /* renamed from: f */
    public final void mo42473f() {
        synchronized (this.f26617d) {
            this.f26616c = true;
            zzcgp.m45224b("ContentFetchThread: paused, mPause = " + true);
        }
    }

    /* renamed from: g */
    public final void mo42474g() {
        synchronized (this.f26617d) {
            this.f26616c = false;
            this.f26617d.notifyAll();
            zzcgp.m45224b("ContentFetchThread: wakeup");
        }
    }

    /* renamed from: h */
    public final boolean mo42475h() {
        return this.f26616c;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00dc */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00dc A[LOOP:2: B:48:0x00dc->B:62:0x00dc, LOOP_START, SYNTHETIC] */
    public final void run() {
        /*
            r6 = this;
        L_0x0000:
            com.google.android.gms.internal.ads.zzbck r0 = com.google.android.gms.ads.internal.zzt.m2891d()     // Catch:{ all -> 0x00a8 }
            android.content.Context r0 = r0.mo42461b()     // Catch:{ all -> 0x00a8 }
            if (r0 != 0) goto L_0x000c
            goto L_0x00b2
        L_0x000c:
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r0.getSystemService(r1)     // Catch:{ all -> 0x00a8 }
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch:{ all -> 0x00a8 }
            java.lang.String r2 = "keyguard"
            java.lang.Object r2 = r0.getSystemService(r2)     // Catch:{ all -> 0x00a8 }
            android.app.KeyguardManager r2 = (android.app.KeyguardManager) r2     // Catch:{ all -> 0x00a8 }
            if (r1 == 0) goto L_0x00b2
            if (r2 == 0) goto L_0x00b2
            java.util.List r1 = r1.getRunningAppProcesses()     // Catch:{ all -> 0x00a8 }
            if (r1 == 0) goto L_0x00b2
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00a8 }
        L_0x002a:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x00a8 }
            if (r3 == 0) goto L_0x00b2
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x00a8 }
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3     // Catch:{ all -> 0x00a8 }
            int r4 = android.os.Process.myPid()     // Catch:{ all -> 0x00a8 }
            int r5 = r3.pid     // Catch:{ all -> 0x00a8 }
            if (r4 != r5) goto L_0x002a
            int r1 = r3.importance     // Catch:{ all -> 0x00a8 }
            r3 = 100
            if (r1 != r3) goto L_0x00b2
            boolean r1 = r2.inKeyguardRestrictedInputMode()     // Catch:{ all -> 0x00a8 }
            if (r1 != 0) goto L_0x00b2
            java.lang.String r1 = "power"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ all -> 0x00a8 }
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isScreenOn()     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x00b2
            com.google.android.gms.internal.ads.zzbck r0 = com.google.android.gms.ads.internal.zzt.m2891d()     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            android.app.Activity r0 = r0.mo42460a()     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            if (r0 != 0) goto L_0x006d
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            com.google.android.gms.internal.ads.zzcgp.m45224b(r0)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            r6.mo42473f()     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            goto L_0x00ba
        L_0x006d:
            r1 = 0
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x008e }
            if (r2 == 0) goto L_0x009d
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x008e }
            android.view.View r2 = r2.getDecorView()     // Catch:{ Exception -> 0x008e }
            if (r2 == 0) goto L_0x009d
            android.view.Window r0 = r0.getWindow()     // Catch:{ Exception -> 0x008e }
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x008e }
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r0.findViewById(r2)     // Catch:{ Exception -> 0x008e }
            goto L_0x009d
        L_0x008e:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzcfy r2 = com.google.android.gms.ads.internal.zzt.m2904q()     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            java.lang.String r3 = "ContentFetchTask.extractContent"
            r2.mo43503t(r0, r3)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            java.lang.String r0 = "Failed getting root view of activity. Content not extracted."
            com.google.android.gms.internal.ads.zzcgp.m45224b(r0)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
        L_0x009d:
            if (r1 == 0) goto L_0x00ba
            com.google.android.gms.internal.ads.zzbcl r0 = new com.google.android.gms.internal.ads.zzbcl     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            r0.<init>(r6, r1)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            r1.post(r0)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            goto L_0x00ba
        L_0x00a8:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzcfy r1 = com.google.android.gms.ads.internal.zzt.m2904q()     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            java.lang.String r2 = "ContentFetchTask.isInForeground"
            r1.mo43503t(r0, r2)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
        L_0x00b2:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            com.google.android.gms.internal.ads.zzcgp.m45224b(r0)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            r6.mo42473f()     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
        L_0x00ba:
            int r0 = r6.f26619g     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            goto L_0x00d9
        L_0x00c3:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.zzcgp.m45227e(r1, r0)
            com.google.android.gms.internal.ads.zzcfy r1 = com.google.android.gms.ads.internal.zzt.m2904q()
            java.lang.String r2 = "ContentFetchTask.run"
            r1.mo43503t(r0, r2)
            goto L_0x00d9
        L_0x00d3:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.zzcgp.m45227e(r1, r0)
        L_0x00d9:
            java.lang.Object r0 = r6.f26617d
            monitor-enter(r0)
        L_0x00dc:
            boolean r1 = r6.f26616c     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x00eb
            java.lang.String r1 = "ContentFetchTask: waiting"
            com.google.android.gms.internal.ads.zzcgp.m45224b(r1)     // Catch:{ InterruptedException -> 0x00dc }
            java.lang.Object r1 = r6.f26617d     // Catch:{ InterruptedException -> 0x00dc }
            r1.wait()     // Catch:{ InterruptedException -> 0x00dc }
            goto L_0x00dc
        L_0x00eb:
            monitor-exit(r0)     // Catch:{ all -> 0x00ee }
            goto L_0x0000
        L_0x00ee:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ee }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbcp.run():void");
    }
}
