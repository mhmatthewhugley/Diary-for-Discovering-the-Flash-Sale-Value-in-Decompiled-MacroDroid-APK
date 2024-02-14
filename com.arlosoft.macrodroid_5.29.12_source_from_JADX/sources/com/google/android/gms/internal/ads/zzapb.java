package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzapb implements zzapa {

    /* renamed from: K */
    protected static volatile zzaqe f25217K;

    /* renamed from: A */
    protected double f25218A;

    /* renamed from: B */
    private double f25219B;

    /* renamed from: C */
    private double f25220C;

    /* renamed from: D */
    protected float f25221D;

    /* renamed from: E */
    protected float f25222E;

    /* renamed from: F */
    protected float f25223F;

    /* renamed from: G */
    protected float f25224G;

    /* renamed from: H */
    private boolean f25225H = false;

    /* renamed from: I */
    protected boolean f25226I = false;

    /* renamed from: J */
    protected DisplayMetrics f25227J;

    /* renamed from: a */
    protected MotionEvent f25228a;

    /* renamed from: c */
    protected final LinkedList f25229c = new LinkedList();

    /* renamed from: d */
    protected long f25230d = 0;

    /* renamed from: f */
    protected long f25231f = 0;

    /* renamed from: g */
    protected long f25232g = 0;

    /* renamed from: o */
    protected long f25233o = 0;

    /* renamed from: p */
    protected long f25234p = 0;

    /* renamed from: s */
    protected long f25235s = 0;

    /* renamed from: z */
    protected long f25236z = 0;

    protected zzapb(Context context) {
        try {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27284w2)).booleanValue()) {
                zzant.m41987d();
            } else {
                zzaqf.m42126a(f25217K);
            }
            this.f25227J = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: m */
    private final void m42038m() {
        this.f25234p = 0;
        this.f25230d = 0;
        this.f25231f = 0;
        this.f25232g = 0;
        this.f25233o = 0;
        this.f25235s = 0;
        this.f25236z = 0;
        if (this.f25229c.size() > 0) {
            Iterator it = this.f25229c.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.f25229c.clear();
        } else {
            MotionEvent motionEvent = this.f25228a;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.f25228a = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bc A[SYNTHETIC, Splitter:B:47:0x00bc] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m42039n(android.content.Context r20, java.lang.String r21, int r22, android.view.View r23, android.app.Activity r24, byte[] r25) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r22
            r3 = r23
            r4 = r24
            long r5 = java.lang.System.currentTimeMillis()
            com.google.android.gms.internal.ads.zzbiu r7 = com.google.android.gms.internal.ads.zzbjc.f27094d2
            com.google.android.gms.internal.ads.zzbja r8 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r7 = r8.mo42663b(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.zzaqe r10 = f25217K
            if (r10 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.zzaqe r10 = f25217K
            com.google.android.gms.internal.ads.zzaoz r10 = r10.mo41808d()
            goto L_0x002e
        L_0x002d:
            r10 = r9
        L_0x002e:
            com.google.android.gms.internal.ads.zzbiu r11 = com.google.android.gms.internal.ads.zzbjc.f27284w2
            com.google.android.gms.internal.ads.zzbja r12 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r11 = r12.mo42663b(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r8 == r11) goto L_0x0043
            java.lang.String r11 = "te"
            goto L_0x0048
        L_0x0043:
            java.lang.String r11 = "be"
            goto L_0x0048
        L_0x0046:
            r10 = r9
            r11 = r10
        L_0x0048:
            r15 = 2
            r14 = 3
            if (r2 != r14) goto L_0x005f
            com.google.android.gms.internal.ads.zzamk r9 = r1.mo41768i(r0, r3, r4)     // Catch:{ Exception -> 0x005c }
            r1.f25225H = r8     // Catch:{ Exception -> 0x0057 }
            r0 = 1002(0x3ea, float:1.404E-42)
            r13 = 1002(0x3ea, float:1.404E-42)
            goto L_0x0074
        L_0x0057:
            r0 = move-exception
            r18 = r0
            r8 = 3
            goto L_0x0091
        L_0x005c:
            r0 = move-exception
            r8 = 3
            goto L_0x008f
        L_0x005f:
            if (r2 != r15) goto L_0x006b
            com.google.android.gms.internal.ads.zzamk r0 = r1.mo41770k(r0, r3, r4)     // Catch:{ Exception -> 0x005c }
            r3 = 1008(0x3f0, float:1.413E-42)
            r9 = r0
            r13 = 1008(0x3f0, float:1.413E-42)
            goto L_0x0074
        L_0x006b:
            com.google.android.gms.internal.ads.zzamk r0 = r1.mo41769j(r0, r9)     // Catch:{ Exception -> 0x005c }
            r3 = 1000(0x3e8, float:1.401E-42)
            r9 = r0
            r13 = 1000(0x3e8, float:1.401E-42)
        L_0x0074:
            if (r7 == 0) goto L_0x008c
            if (r10 == 0) goto L_0x008c
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x005c }
            long r3 = r3 - r5
            r0 = -1
            r18 = 0
            r12 = r10
            r8 = 3
            r14 = r0
            r15 = r3
            r17 = r11
            r12.mo41766c(r13, r14, r15, r17, r18)     // Catch:{ Exception -> 0x008a }
            goto L_0x008d
        L_0x008a:
            r0 = move-exception
            goto L_0x008f
        L_0x008c:
            r8 = 3
        L_0x008d:
            r3 = 2
            goto L_0x00b6
        L_0x008f:
            r18 = r0
        L_0x0091:
            if (r7 == 0) goto L_0x008d
            if (r10 == 0) goto L_0x008d
            if (r2 != r8) goto L_0x009d
            r0 = 1003(0x3eb, float:1.406E-42)
            r3 = 2
            r13 = 1003(0x3eb, float:1.406E-42)
            goto L_0x00aa
        L_0x009d:
            r3 = 2
            if (r2 != r3) goto L_0x00a5
            r0 = 1009(0x3f1, float:1.414E-42)
            r13 = 1009(0x3f1, float:1.414E-42)
            goto L_0x00aa
        L_0x00a5:
            r0 = 1001(0x3e9, float:1.403E-42)
            r2 = 1
            r13 = 1001(0x3e9, float:1.403E-42)
        L_0x00aa:
            r14 = -1
            long r15 = java.lang.System.currentTimeMillis()
            long r15 = r15 - r5
            r12 = r10
            r17 = r11
            r12.mo41766c(r13, r14, r15, r17, r18)
        L_0x00b6:
            long r4 = java.lang.System.currentTimeMillis()
            if (r9 == 0) goto L_0x00fb
            com.google.android.gms.internal.ads.zzgre r0 = r9.mo47341h()     // Catch:{ Exception -> 0x0101 }
            com.google.android.gms.internal.ads.zzana r0 = (com.google.android.gms.internal.ads.zzana) r0     // Catch:{ Exception -> 0x0101 }
            int r0 = r0.mo47353z()     // Catch:{ Exception -> 0x0101 }
            if (r0 != 0) goto L_0x00c9
            goto L_0x00fb
        L_0x00c9:
            com.google.android.gms.internal.ads.zzgre r0 = r9.mo47341h()     // Catch:{ Exception -> 0x0101 }
            com.google.android.gms.internal.ads.zzana r0 = (com.google.android.gms.internal.ads.zzana) r0     // Catch:{ Exception -> 0x0101 }
            r6 = r21
            java.lang.String r0 = com.google.android.gms.internal.ads.zzant.m41984a(r0, r6)     // Catch:{ Exception -> 0x0101 }
            if (r7 == 0) goto L_0x012c
            if (r10 == 0) goto L_0x012c
            if (r2 != r8) goto L_0x00e0
            r6 = 1006(0x3ee, float:1.41E-42)
            r13 = 1006(0x3ee, float:1.41E-42)
            goto L_0x00eb
        L_0x00e0:
            if (r2 != r3) goto L_0x00e7
            r6 = 1010(0x3f2, float:1.415E-42)
            r13 = 1010(0x3f2, float:1.415E-42)
            goto L_0x00eb
        L_0x00e7:
            r6 = 1004(0x3ec, float:1.407E-42)
            r13 = 1004(0x3ec, float:1.407E-42)
        L_0x00eb:
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0101 }
            long r15 = r14 - r4
            r14 = -1
            r18 = 0
            r12 = r10
            r17 = r11
            r12.mo41766c(r13, r14, r15, r17, r18)     // Catch:{ Exception -> 0x0101 }
            goto L_0x012c
        L_0x00fb:
            r0 = 5
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ Exception -> 0x0101 }
            goto L_0x012c
        L_0x0101:
            r0 = move-exception
            r18 = r0
            r0 = 7
            java.lang.String r0 = java.lang.Integer.toString(r0)
            if (r7 == 0) goto L_0x012c
            if (r10 == 0) goto L_0x012c
            if (r2 != r8) goto L_0x0114
            r2 = 1007(0x3ef, float:1.411E-42)
            r13 = 1007(0x3ef, float:1.411E-42)
            goto L_0x011f
        L_0x0114:
            if (r2 != r3) goto L_0x011b
            r2 = 1011(0x3f3, float:1.417E-42)
            r13 = 1011(0x3f3, float:1.417E-42)
            goto L_0x011f
        L_0x011b:
            r2 = 1005(0x3ed, float:1.408E-42)
            r13 = 1005(0x3ed, float:1.408E-42)
        L_0x011f:
            r14 = -1
            long r2 = java.lang.System.currentTimeMillis()
            long r15 = r2 - r4
            r12 = r10
            r17 = r11
            r12.mo41766c(r13, r14, r15, r17, r18)
        L_0x012c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapb.m42039n(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    /* renamed from: a */
    public void mo20427a(View view) {
    }

    /* renamed from: b */
    public final String mo20428b(Context context) {
        if (!zzaqh.m42133f()) {
            return m42039n(context, (String) null, 1, (View) null, (Activity) null, (byte[]) null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    /* renamed from: c */
    public final synchronized void mo20429c(int i, int i2, int i3) {
        synchronized (this) {
            if (this.f25228a != null) {
                if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27074b2)).booleanValue()) {
                    m42038m();
                } else {
                    this.f25228a.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.f25227J;
            if (displayMetrics != null) {
                float f = displayMetrics.density;
                this.f25228a = MotionEvent.obtain(0, (long) i3, 1, ((float) i) * f, ((float) i2) * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.f25228a = null;
            }
            this.f25226I = false;
        }
    }

    /* renamed from: d */
    public final synchronized void mo20430d(MotionEvent motionEvent) {
        Long l;
        if (this.f25225H) {
            m42038m();
            this.f25225H = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f25218A = 0.0d;
            this.f25219B = (double) motionEvent.getRawX();
            this.f25220C = (double) motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = (double) motionEvent.getRawX();
            double rawY = (double) motionEvent.getRawY();
            double d = rawX - this.f25219B;
            double d2 = rawY - this.f25220C;
            this.f25218A += Math.sqrt((d * d) + (d2 * d2));
            this.f25219B = rawX;
            this.f25220C = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 == 0) {
            this.f25221D = motionEvent.getX();
            this.f25222E = motionEvent.getY();
            this.f25223F = motionEvent.getRawX();
            this.f25224G = motionEvent.getRawY();
            this.f25230d++;
        } else if (action2 == 1) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            this.f25228a = obtain;
            this.f25229c.add(obtain);
            if (this.f25229c.size() > 6) {
                ((MotionEvent) this.f25229c.remove()).recycle();
            }
            this.f25232g++;
            this.f25234p = mo41767h(new Throwable().getStackTrace());
        } else if (action2 == 2) {
            this.f25231f += (long) (motionEvent.getHistorySize() + 1);
            try {
                zzaqg l2 = mo41771l(motionEvent);
                Long l3 = l2.f25311d;
                if (!(l3 == null || l2.f25314g == null)) {
                    this.f25235s += l3.longValue() + l2.f25314g.longValue();
                }
                if (!(this.f25227J == null || (l = l2.f25312e) == null || l2.f25315h == null)) {
                    this.f25236z += l.longValue() + l2.f25315h.longValue();
                }
            } catch (zzapv unused) {
            }
        } else if (action2 == 3) {
            this.f25233o++;
        }
        this.f25226I = true;
    }

    /* renamed from: e */
    public final String mo20431e(Context context, String str, View view) {
        return m42039n(context, str, 3, view, (Activity) null, (byte[]) null);
    }

    /* renamed from: f */
    public final String mo20432f(Context context, String str, View view, Activity activity) {
        return m42039n(context, str, 3, view, activity, (byte[]) null);
    }

    /* renamed from: g */
    public final String mo20433g(Context context, View view, Activity activity) {
        return m42039n(context, (String) null, 2, view, activity, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract long mo41767h(StackTraceElement[] stackTraceElementArr) throws zzapv;

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract zzamk mo41768i(Context context, View view, Activity activity);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract zzamk mo41769j(Context context, zzamd zzamd);

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract zzamk mo41770k(Context context, View view, Activity activity);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract zzaqg mo41771l(MotionEvent motionEvent) throws zzapv;
}
