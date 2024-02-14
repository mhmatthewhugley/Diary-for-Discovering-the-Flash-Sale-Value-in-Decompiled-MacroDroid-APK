package com.arlosoft.macrodroid.troubleshooting.problem;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.PackageManagerCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.troubleshooting.problem.C6255c;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p057a2.C2213b;
import p057a2.C2214c;
import p297ja.C13339u;
import p370qa.C16265l;

/* compiled from: ProblemViewModel.kt */
public final class ProblemViewModel extends ViewModel implements LifecycleObserver {

    /* renamed from: a */
    private final Context f14799a;

    /* renamed from: c */
    private final C6253a f14800c;

    /* renamed from: d */
    private final MutableLiveData<List<C6255c>> f14801d;

    /* renamed from: f */
    private final LiveData<List<C6255c>> f14802f;

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.ProblemViewModel$a */
    /* compiled from: ProblemViewModel.kt */
    static final class C6252a extends C13708q implements C16265l<Boolean, C13339u> {
        final /* synthetic */ List<C6255c> $problemList;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6252a(List<C6255c> list) {
            super(1);
            this.$problemList = list;
        }

        /* renamed from: a */
        public final void mo32265a(boolean z) {
            if (z) {
                this.$problemList.add(new C6255c.C6260e());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo32265a(((Boolean) obj).booleanValue());
            return C13339u.f61331a;
        }
    }

    public ProblemViewModel(Context context, C6253a aVar) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(aVar, "permissionChecker");
        this.f14799a = context;
        this.f14800c = aVar;
        MutableLiveData<List<C6255c>> mutableLiveData = new MutableLiveData<>(C13614t.m87748j());
        this.f14801d = mutableLiveData;
        this.f14802f = mutableLiveData;
    }

    /* renamed from: g */
    private final void m24327g(List<C6255c> list, C6255c cVar, Macro macro) {
        T t;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C13706o.m87924a(((C6255c) t).getClass(), cVar.getClass())) {
                break;
            }
        }
        C6255c cVar2 = (C6255c) t;
        if (cVar2 == null) {
            list.add(cVar);
        } else {
            cVar = cVar2;
        }
        cVar.mo32281d().add(macro);
    }

    /* renamed from: h */
    private final List<C6255c> m24328h() {
        ArrayList arrayList = new ArrayList();
        List<Macro> I = C4934n.m18998M().mo29679I();
        HashMap hashMap = new HashMap();
        for (Macro next : I) {
            Iterator<Action> it = next.getActions().iterator();
            while (it.hasNext()) {
                Action next2 = it.next();
                if (((next2 instanceof C2214c) && ((C2214c) next2).mo24423d()) || ((next2 instanceof C2213b) && ((C2213b) next2).mo24422E())) {
                    if (!hashMap.containsKey(next2.mo25559a1())) {
                        String a1 = next2.mo25559a1();
                        C13706o.m87928e(a1, "action.name");
                        hashMap.put(a1, new ArrayList());
                    }
                    List list = (List) hashMap.get(next2.mo25559a1());
                    if (list != null) {
                        C13706o.m87928e(next, "macro");
                        list.add(next);
                    }
                }
            }
        }
        for (String str : hashMap.keySet()) {
            C13706o.m87928e(str, "actionName");
            C6255c.C6266k kVar = new C6255c.C6266k(str);
            List<Macro> d = kVar.mo32281d();
            Object obj = hashMap.get(str);
            C13706o.m87926c(obj);
            d.addAll((Collection) obj);
            arrayList.add(kVar);
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x018d, code lost:
        if (kotlin.collections.C13596m.m87628w(r3, "android.permission.ACCESS_FINE_LOCATION") != false) goto L_0x018f;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<com.arlosoft.macrodroid.troubleshooting.problem.C6255c> m24329i() {
        /*
            r23 = this;
            r0 = r23
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.arlosoft.macrodroid.macro.n r2 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
            java.util.List r2 = r2.mo29679I()
            com.arlosoft.macrodroid.troubleshooting.problem.a r3 = r0.f14800c
            boolean r3 = r3.mo32276k()
            com.arlosoft.macrodroid.troubleshooting.problem.a r4 = r0.f14800c
            boolean r4 = r4.mo32268c()
            com.arlosoft.macrodroid.troubleshooting.problem.a r5 = r0.f14800c
            boolean r5 = r5.mo32270e()
            com.arlosoft.macrodroid.troubleshooting.problem.a r6 = r0.f14800c
            boolean r6 = r6.mo32271f()
            com.arlosoft.macrodroid.troubleshooting.problem.a r7 = r0.f14800c
            boolean r7 = r7.mo32267b()
            com.arlosoft.macrodroid.troubleshooting.problem.a r8 = r0.f14800c
            boolean r8 = r8.mo32266a()
            com.arlosoft.macrodroid.troubleshooting.problem.a r9 = r0.f14800c
            boolean r9 = r9.mo32275j()
            com.arlosoft.macrodroid.troubleshooting.problem.a r10 = r0.f14800c
            boolean r10 = r10.mo32273h()
            com.arlosoft.macrodroid.troubleshooting.problem.a r11 = r0.f14800c
            boolean r11 = r11.mo32269d()
            com.arlosoft.macrodroid.troubleshooting.problem.a r12 = r0.f14800c
            boolean r12 = r12.mo32274i()
            android.content.Context r13 = r0.f14799a
            boolean r13 = com.arlosoft.macrodroid.common.C4031k.m15908h(r13)
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x005a:
            boolean r15 = r2.hasNext()
            r16 = r14
            java.lang.String r14 = "permission"
            if (r15 == 0) goto L_0x01f7
            java.lang.Object r15 = r2.next()
            com.arlosoft.macrodroid.macro.Macro r15 = (com.arlosoft.macrodroid.macro.Macro) r15
            r17 = r2
            java.lang.String r2 = "macro"
            if (r3 != 0) goto L_0x0084
            boolean r18 = r15.requiresWriteSettings()
            if (r18 == 0) goto L_0x0084
            r18 = r3
            com.arlosoft.macrodroid.troubleshooting.problem.c$t r3 = new com.arlosoft.macrodroid.troubleshooting.problem.c$t
            r3.<init>()
            kotlin.jvm.internal.C13706o.m87928e(r15, r2)
            r0.m24327g(r1, r3, r15)
            goto L_0x0086
        L_0x0084:
            r18 = r3
        L_0x0086:
            if (r4 != 0) goto L_0x0099
            boolean r3 = r15.requiresCanDrawOverlays()
            if (r3 == 0) goto L_0x0099
            com.arlosoft.macrodroid.troubleshooting.problem.c$j r3 = new com.arlosoft.macrodroid.troubleshooting.problem.c$j
            r3.<init>()
            kotlin.jvm.internal.C13706o.m87928e(r15, r2)
            r0.m24327g(r1, r3, r15)
        L_0x0099:
            if (r5 != 0) goto L_0x00ac
            boolean r3 = r15.requiresLocationServicesEnabled()
            if (r3 == 0) goto L_0x00ac
            com.arlosoft.macrodroid.troubleshooting.problem.c$m r3 = new com.arlosoft.macrodroid.troubleshooting.problem.c$m
            r3.<init>()
            kotlin.jvm.internal.C13706o.m87928e(r15, r2)
            r0.m24327g(r1, r3, r15)
        L_0x00ac:
            if (r6 != 0) goto L_0x00bf
            boolean r3 = r15.requiresNotificationAccess()
            if (r3 == 0) goto L_0x00bf
            com.arlosoft.macrodroid.troubleshooting.problem.c$o r3 = new com.arlosoft.macrodroid.troubleshooting.problem.c$o
            r3.<init>()
            kotlin.jvm.internal.C13706o.m87928e(r15, r2)
            r0.m24327g(r1, r3, r15)
        L_0x00bf:
            if (r7 != 0) goto L_0x00d2
            boolean r3 = r15.requiresDeviceAdmin()
            if (r3 == 0) goto L_0x00d2
            com.arlosoft.macrodroid.troubleshooting.problem.c$i r3 = new com.arlosoft.macrodroid.troubleshooting.problem.c$i
            r3.<init>()
            kotlin.jvm.internal.C13706o.m87928e(r15, r2)
            r0.m24327g(r1, r3, r15)
        L_0x00d2:
            if (r8 != 0) goto L_0x00e5
            boolean r3 = r15.requiresAccessibity()
            if (r3 == 0) goto L_0x00e5
            com.arlosoft.macrodroid.troubleshooting.problem.c$f r3 = new com.arlosoft.macrodroid.troubleshooting.problem.c$f
            r3.<init>()
            kotlin.jvm.internal.C13706o.m87928e(r15, r2)
            r0.m24327g(r1, r3, r15)
        L_0x00e5:
            if (r9 != 0) goto L_0x00f8
            boolean r3 = r15.requiresVolumeAccessibility()
            if (r3 == 0) goto L_0x00f8
            com.arlosoft.macrodroid.troubleshooting.problem.c$s r3 = new com.arlosoft.macrodroid.troubleshooting.problem.c$s
            r3.<init>()
            kotlin.jvm.internal.C13706o.m87928e(r15, r2)
            r0.m24327g(r1, r3, r15)
        L_0x00f8:
            if (r10 != 0) goto L_0x010b
            boolean r3 = r15.requiresUiInteractionAccessibility()
            if (r3 == 0) goto L_0x010b
            com.arlosoft.macrodroid.troubleshooting.problem.c$q r3 = new com.arlosoft.macrodroid.troubleshooting.problem.c$q
            r3.<init>()
            kotlin.jvm.internal.C13706o.m87928e(r15, r2)
            r0.m24327g(r1, r3, r15)
        L_0x010b:
            if (r11 != 0) goto L_0x011e
            boolean r3 = r15.requiresFingerprintAccessibility()
            if (r3 == 0) goto L_0x011e
            com.arlosoft.macrodroid.troubleshooting.problem.c$l r3 = new com.arlosoft.macrodroid.troubleshooting.problem.c$l
            r3.<init>()
            kotlin.jvm.internal.C13706o.m87928e(r15, r2)
            r0.m24327g(r1, r3, r15)
        L_0x011e:
            if (r12 != 0) goto L_0x0131
            boolean r3 = r15.requiresUsageAccess()
            if (r3 == 0) goto L_0x0131
            com.arlosoft.macrodroid.troubleshooting.problem.c$r r3 = new com.arlosoft.macrodroid.troubleshooting.problem.c$r
            r3.<init>()
            kotlin.jvm.internal.C13706o.m87928e(r15, r2)
            r0.m24327g(r1, r3, r15)
        L_0x0131:
            if (r13 != 0) goto L_0x014c
            android.content.Context r3 = r0.f14799a
            boolean r3 = com.arlosoft.macrodroid.settings.C5163j2.m20215n0(r3)
            if (r3 != 0) goto L_0x014c
            boolean r3 = r15.requiresDefaultAssist()
            if (r3 == 0) goto L_0x014c
            com.arlosoft.macrodroid.troubleshooting.problem.c$h r3 = new com.arlosoft.macrodroid.troubleshooting.problem.c$h
            r3.<init>()
            kotlin.jvm.internal.C13706o.m87928e(r15, r2)
            r0.m24327g(r1, r3, r15)
        L_0x014c:
            boolean r3 = r15.requiresNewHelperFileVersion()
            if (r3 == 0) goto L_0x016b
            com.arlosoft.macrodroid.troubleshooting.problem.c$n r3 = new com.arlosoft.macrodroid.troubleshooting.problem.c$n
            r19 = r4
            java.lang.String r4 = r15.getName()
            r20 = r5
            java.lang.String r5 = "macro.name"
            kotlin.jvm.internal.C13706o.m87928e(r4, r5)
            r3.<init>(r4)
            kotlin.jvm.internal.C13706o.m87928e(r15, r2)
            r0.m24327g(r1, r3, r15)
            goto L_0x016f
        L_0x016b:
            r19 = r4
            r20 = r5
        L_0x016f:
            java.lang.String[] r3 = r15.getRequiredPermissions()
            java.lang.String r4 = "macro.requiredPermissions"
            kotlin.jvm.internal.C13706o.m87928e(r3, r4)
            java.lang.String r5 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r3 = kotlin.collections.C13596m.m87628w(r3, r5)
            if (r3 != 0) goto L_0x018f
            java.lang.String[] r3 = r15.getRequiredPermissions()
            kotlin.jvm.internal.C13706o.m87928e(r3, r4)
            java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r3 = kotlin.collections.C13596m.m87628w(r3, r4)
            if (r3 == 0) goto L_0x01a6
        L_0x018f:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 30
            if (r3 < r4) goto L_0x01a6
            boolean r3 = r23.m24331k()
            if (r3 == 0) goto L_0x01a6
            com.arlosoft.macrodroid.troubleshooting.problem.c$g r3 = new com.arlosoft.macrodroid.troubleshooting.problem.c$g
            r3.<init>()
            kotlin.jvm.internal.C13706o.m87928e(r15, r2)
            r0.m24327g(r1, r3, r15)
        L_0x01a6:
            java.lang.String[] r3 = r15.getRequiredPermissions()
            java.lang.String r4 = "requiredPermissions"
            kotlin.jvm.internal.C13706o.m87928e(r3, r4)
            r4 = 0
            int r5 = r3.length
        L_0x01b1:
            if (r4 >= r5) goto L_0x01ea
            r21 = r5
            r5 = r3[r4]
            r22 = r3
            r3 = r16
            boolean r16 = r3.containsKey(r5)
            if (r16 != 0) goto L_0x01cf
            kotlin.jvm.internal.C13706o.m87928e(r5, r14)
            r16 = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r3.put(r5, r6)
            goto L_0x01d1
        L_0x01cf:
            r16 = r6
        L_0x01d1:
            java.lang.Object r5 = r3.get(r5)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x01df
            kotlin.jvm.internal.C13706o.m87928e(r15, r2)
            r5.add(r15)
        L_0x01df:
            int r4 = r4 + 1
            r6 = r16
            r5 = r21
            r16 = r3
            r3 = r22
            goto L_0x01b1
        L_0x01ea:
            r3 = r16
            r14 = r3
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            goto L_0x005a
        L_0x01f7:
            r3 = r16
            java.util.Set r2 = r3.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0201:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0231
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            com.arlosoft.macrodroid.troubleshooting.problem.a r5 = r0.f14800c
            kotlin.jvm.internal.C13706o.m87928e(r4, r14)
            boolean r5 = r5.mo32272g(r4)
            if (r5 != 0) goto L_0x0201
            com.arlosoft.macrodroid.troubleshooting.problem.c$p r5 = new com.arlosoft.macrodroid.troubleshooting.problem.c$p
            r5.<init>(r4)
            java.util.List r6 = r5.mo32281d()
            java.lang.Object r4 = r3.get(r4)
            kotlin.jvm.internal.C13706o.m87926c(r4)
            java.util.Collection r4 = (java.util.Collection) r4
            r6.addAll(r4)
            r1.add(r5)
            goto L_0x0201
        L_0x0231:
            java.util.List r1 = kotlin.collections.C13566b0.m87402F0(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.troubleshooting.problem.ProblemViewModel.m24329i():java.util.List");
    }

    /* renamed from: j */
    private final List<C6255c> m24330j() {
        ArrayList arrayList = new ArrayList();
        if (m24334p()) {
            arrayList.add(new C6255c.C6259d());
        }
        if (m24335q()) {
            arrayList.add(new C6255c.C6257b());
        }
        if (m24333o()) {
            arrayList.add(new C6255c.C6256a());
        }
        if (m24336r()) {
            arrayList.add(new C6255c.C6258c());
        }
        arrayList.addAll(m24328h());
        arrayList.addAll(m24329i());
        mo32263m(new C6252a(arrayList));
        return arrayList;
    }

    /* renamed from: k */
    private final boolean m24331k() {
        if ((ContextCompat.checkSelfPermission(this.f14799a, "android.permission.ACCESS_FINE_LOCATION") == 0 || ContextCompat.checkSelfPermission(this.f14799a, "android.permission.ACCESS_COARSE_LOCATION") == 0) && ContextCompat.checkSelfPermission(this.f14799a, "android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m24332n(ListenableFuture listenableFuture, C16265l lVar) {
        C13706o.m87929f(listenableFuture, "$future");
        C13706o.m87929f(lVar, "$result");
        Integer num = (Integer) listenableFuture.get();
        boolean z = false;
        if ((num == null || num.intValue() != 0) && ((num == null || num.intValue() != 1) && (num == null || num.intValue() != 2))) {
            if (((num != null && num.intValue() == 3) || (num != null && num.intValue() == 4)) || (num != null && num.intValue() == 5)) {
                z = true;
            }
        }
        lVar.invoke(Boolean.valueOf(z));
    }

    /* renamed from: o */
    private final boolean m24333o() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        Object systemService = this.f14799a.getSystemService("power");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return !((PowerManager) systemService).isIgnoringBatteryOptimizations(this.f14799a.getPackageName());
    }

    /* renamed from: p */
    private final boolean m24334p() {
        return Build.VERSION.SDK_INT >= 26 && !NotificationManagerCompat.from(this.f14799a).areNotificationsEnabled();
    }

    /* renamed from: q */
    private final boolean m24335q() {
        return Settings.Global.getInt(this.f14799a.getContentResolver(), "always_finish_activities", 0) != 0;
    }

    /* renamed from: r */
    private final boolean m24336r() {
        return Build.VERSION.SDK_INT < 26 && C5163j2.m20103Z(this.f14799a);
    }

    /* renamed from: l */
    public final LiveData<List<C6255c>> mo32262l() {
        return this.f14802f;
    }

    /* renamed from: m */
    public final void mo32263m(C16265l<? super Boolean, C13339u> lVar) {
        C13706o.m87929f(lVar, "result");
        if (C5163j2.m20199l0(this.f14799a) || this.f14800c.mo32267b()) {
            lVar.invoke(Boolean.FALSE);
            return;
        }
        ListenableFuture<Integer> unusedAppRestrictionsStatus = PackageManagerCompat.getUnusedAppRestrictionsStatus(this.f14799a);
        C13706o.m87928e(unusedAppRestrictionsStatus, "getUnusedAppRestrictionsStatus(context)");
        unusedAppRestrictionsStatus.addListener(new C6281i(unusedAppRestrictionsStatus, lVar), ContextCompat.getMainExecutor(this.f14799a));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        this.f14801d.postValue(m24330j());
    }
}
