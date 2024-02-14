package com.arlosoft.macrodroid.geofences;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.utils.C6368b1;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingClient;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationServices;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p081e1.C7264a;
import p112j2.C7439d0;
import p370qa.C16265l;

/* renamed from: com.arlosoft.macrodroid.geofences.i */
/* compiled from: GeofenceManager.kt */
public final class C4716i {

    /* renamed from: a */
    private final Context f11852a;

    /* renamed from: b */
    private final C7264a f11853b = MacroDroidApplication.f9883I.mo27303b().mo27293q("GeofenceInfo");

    /* renamed from: c */
    private final GeofencingClient f11854c;

    /* renamed from: d */
    private final Map<String, List<C4719k>> f11855d = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.geofences.i$a */
    /* compiled from: GeofenceManager.kt */
    static final class C4717a extends C13708q implements C16265l<C4719k, Boolean> {
        final /* synthetic */ long $selectableItemId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4717a(long j) {
            super(1);
            this.$selectableItemId = j;
        }

        /* renamed from: a */
        public final Boolean invoke(C4719k kVar) {
            C13706o.m87929f(kVar, "it");
            return Boolean.valueOf(kVar.mo29206a() == this.$selectableItemId);
        }
    }

    public C4716i(Context context) {
        C13706o.m87929f(context, "context");
        this.f11852a = context;
        GeofencingClient a = LocationServices.m64681a(context);
        C13706o.m87928e(a, "getGeofencingClient(context)");
        this.f11854c = a;
    }

    /* renamed from: e */
    private final void m18267e(GeofenceInfo geofenceInfo, int i) {
        try {
            this.f11854c.mo54161G(m18272n(geofenceInfo, i), m18271l()).mo23708i(new C4714g(geofenceInfo, i)).mo23705f(new C4712e(geofenceInfo, this));
        } catch (Exception e) {
            C4878b.m18868g("Failed to add Geofence [" + geofenceInfo.getName() + "]: " + e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m18268f(GeofenceInfo geofenceInfo, int i, Void voidR) {
        C13706o.m87929f(geofenceInfo, "$geofenceInfo");
        C4878b.m18875n("ENABLED Geofence [" + geofenceInfo.getName() + "] - Update rate = " + (i / 1000) + "s.", 0, geofenceInfo.getName());
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m18269g(GeofenceInfo geofenceInfo, C4716i iVar, Exception exc) {
        C13706o.m87929f(geofenceInfo, "$geofenceInfo");
        C13706o.m87929f(iVar, "this$0");
        C13706o.m87929f(exc, "it");
        C4878b.m18872k("Failed to add Geofence [" + geofenceInfo.getName() + "]: " + exc, 0, geofenceInfo.getName(), (String) null, 8, (Object) null);
        if ((exc instanceof ApiException) && ((ApiException) exc).mo21210b() == 1004) {
            Context context = iVar.f11852a;
            C7439d0.m30911p0(context, context.getString(C17541R$string.trigger_geofence), 14);
        }
    }

    /* renamed from: j */
    private final Geofence m18270j(GeofenceInfo geofenceInfo, int i) {
        Geofence a = new Geofence.Builder().mo54159e(geofenceInfo.getId()).mo54156b(geofenceInfo.getLatitude(), geofenceInfo.getLongitude(), (float) geofenceInfo.getRadius()).mo54158d(i).mo54157c(-1).mo54160f(3).mo54155a();
        C13706o.m87928e(a, "Builder() // Set the req…\n                .build()");
        return a;
    }

    /* renamed from: l */
    private final PendingIntent m18271l() {
        PendingIntent service = PendingIntent.getService(this.f11852a, 0, new Intent(this.f11852a, GeofenceTransitionService.class), C6368b1.f14960c | 134217728);
        C13706o.m87928e(service, "getService(context, 0, i…ntentHelper.FLAG_MUTABLE)");
        return service;
    }

    /* renamed from: n */
    private final GeofencingRequest m18272n(GeofenceInfo geofenceInfo, int i) {
        GeofencingRequest.Builder builder = new GeofencingRequest.Builder();
        builder.mo54174c(3);
        builder.mo54172a(m18270j(geofenceInfo, i));
        GeofencingRequest b = builder.mo54173b();
        C13706o.m87928e(b, "builder.build()");
        return b;
    }

    /* renamed from: o */
    private final void m18273o(GeofenceInfo geofenceInfo, String str) {
        try {
            this.f11854c.mo54162H(C13612s.m87736e(geofenceInfo.getId())).mo23708i(new C4715h(geofenceInfo, str)).mo23705f(new C4713f(geofenceInfo, str));
        } catch (Exception e) {
            C4878b.m18868g("Failed to remove Geofence [" + geofenceInfo.getName() + "]: " + e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final void m18274p(GeofenceInfo geofenceInfo, String str, Void voidR) {
        C13706o.m87929f(geofenceInfo, "$geofenceInfo");
        C13706o.m87929f(str, "$macroName");
        C4878b.m18875n("DISABLED Geofence [" + geofenceInfo.getName() + "]. Macro: [" + str + ']', 0, geofenceInfo.getName());
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final void m18275q(GeofenceInfo geofenceInfo, String str, Exception exc) {
        C13706o.m87929f(geofenceInfo, "$geofenceInfo");
        C13706o.m87929f(str, "$macroName");
        C13706o.m87929f(exc, "it");
        C4878b.m18872k("Failed to disable Geofence [" + geofenceInfo.getName() + "]. Macro: [" + str + ']', 0, geofenceInfo.getName(), (String) null, 8, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: com.arlosoft.macrodroid.geofences.k} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29199h(java.lang.String r12, long r13, int r15, java.lang.String r16, long r17) {
        /*
            r11 = this;
            r0 = r11
            r4 = r12
            r1 = r15
            r2 = r16
            java.lang.String r3 = "geofenceId"
            kotlin.jvm.internal.C13706o.m87929f(r12, r3)
            java.lang.String r3 = "macroName"
            kotlin.jvm.internal.C13706o.m87929f(r2, r3)
            com.arlosoft.macrodroid.geofences.GeofenceStore r3 = r11.mo29202m()
            java.util.Map r3 = r3.getGeofenceMap()
            java.lang.Object r3 = r3.get(r12)
            com.arlosoft.macrodroid.geofences.GeofenceInfo r3 = (com.arlosoft.macrodroid.geofences.GeofenceInfo) r3
            r5 = 93
            if (r3 != 0) goto L_0x0040
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Add Geofence - Requested Geofence does not exist. Macro: ["
            r1.append(r3)
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r5 = 0
            r6 = 8
            r7 = 0
            r2 = r17
            r4 = r12
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18872k(r1, r2, r4, r5, r6, r7)
            return
        L_0x0040:
            com.arlosoft.macrodroid.geofences.k r6 = new com.arlosoft.macrodroid.geofences.k
            r7 = r13
            r6.<init>(r13, r15)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Geofence ["
            r7.append(r8)
            java.lang.String r8 = r3.getName()
            r7.append(r8)
            java.lang.String r8 = "] - Added subscription. Macro: ["
            r7.append(r8)
            r7.append(r2)
            r7.append(r5)
            java.lang.String r2 = r7.toString()
            r7 = r17
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18881t(r2, r7, r12)
            java.util.Map<java.lang.String, java.util.List<com.arlosoft.macrodroid.geofences.k>> r2 = r0.f11855d
            java.lang.Object r2 = r2.get(r12)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x00d1
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L_0x007c
            goto L_0x00d1
        L_0x007c:
            java.util.Iterator r5 = r2.iterator()
            boolean r7 = r5.hasNext()
            if (r7 != 0) goto L_0x0088
            r5 = 0
            goto L_0x00b1
        L_0x0088:
            java.lang.Object r7 = r5.next()
            boolean r8 = r5.hasNext()
            if (r8 != 0) goto L_0x0094
        L_0x0092:
            r5 = r7
            goto L_0x00b1
        L_0x0094:
            r8 = r7
            com.arlosoft.macrodroid.geofences.k r8 = (com.arlosoft.macrodroid.geofences.C4719k) r8
            int r8 = r8.mo29207b()
        L_0x009b:
            java.lang.Object r9 = r5.next()
            r10 = r9
            com.arlosoft.macrodroid.geofences.k r10 = (com.arlosoft.macrodroid.geofences.C4719k) r10
            int r10 = r10.mo29207b()
            if (r8 <= r10) goto L_0x00aa
            r7 = r9
            r8 = r10
        L_0x00aa:
            boolean r9 = r5.hasNext()
            if (r9 != 0) goto L_0x009b
            goto L_0x0092
        L_0x00b1:
            com.arlosoft.macrodroid.geofences.k r5 = (com.arlosoft.macrodroid.geofences.C4719k) r5
            if (r5 == 0) goto L_0x00ba
            int r5 = r5.mo29207b()
            goto L_0x00bb
        L_0x00ba:
            r5 = r1
        L_0x00bb:
            if (r1 >= r5) goto L_0x00c0
            r11.m18267e(r3, r5)
        L_0x00c0:
            java.util.Map<java.lang.String, java.util.List<com.arlosoft.macrodroid.geofences.k>> r1 = r0.f11855d
            java.util.List r2 = kotlin.collections.C13566b0.m87405I0(r2)
            r2.add(r6)
            java.util.List r2 = kotlin.collections.C13566b0.m87402F0(r2)
            r1.put(r12, r2)
            goto L_0x00dd
        L_0x00d1:
            java.util.Map<java.lang.String, java.util.List<com.arlosoft.macrodroid.geofences.k>> r2 = r0.f11855d
            java.util.List r5 = kotlin.collections.C13612s.m87736e(r6)
            r2.put(r12, r5)
            r11.m18267e(r3, r15)
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.geofences.C4716i.mo29199h(java.lang.String, long, int, java.lang.String, long):void");
    }

    /* renamed from: i */
    public final int mo29200i(String str) {
        C13706o.m87929f(str, "geofenceId");
        GeofenceInfo geofenceInfo = mo29202m().getGeofenceMap().get(str);
        if (geofenceInfo != null) {
            return geofenceInfo.getInsideStatus();
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r2 = r2.getName();
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo29201k(java.lang.String r2) {
        /*
            r1 = this;
            com.arlosoft.macrodroid.geofences.GeofenceStore r0 = r1.mo29202m()
            java.util.Map r0 = r0.getGeofenceMap()
            java.lang.Object r2 = r0.get(r2)
            com.arlosoft.macrodroid.geofences.GeofenceInfo r2 = (com.arlosoft.macrodroid.geofences.GeofenceInfo) r2
            if (r2 == 0) goto L_0x0016
            java.lang.String r2 = r2.getName()
            if (r2 != 0) goto L_0x0018
        L_0x0016:
            java.lang.String r2 = ""
        L_0x0018:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.geofences.C4716i.mo29201k(java.lang.String):java.lang.String");
    }

    /* renamed from: m */
    public final GeofenceStore mo29202m() {
        GeofenceStore geofenceStore = (GeofenceStore) this.f11853b.mo37133c("GeofenceInfo", GeofenceStore.class);
        return geofenceStore == null ? new GeofenceStore((Map) null, 1, (C13695i) null) : geofenceStore;
    }

    /* renamed from: r */
    public final void mo29203r(String str, long j, String str2, long j2) {
        Object obj;
        Object obj2;
        boolean z;
        C13706o.m87929f(str, "geofenceId");
        C13706o.m87929f(str2, "macroName");
        GeofenceInfo geofenceInfo = mo29202m().getGeofenceMap().get(str);
        if (geofenceInfo == null) {
            C4878b.m18872k("Remove Geofence - Requested Geofence does not exist. Macro: [" + str2 + ']', j2, str, (String) null, 8, (Object) null);
            return;
        }
        List<C4719k> list = this.f11855d.get(str);
        if (list != null) {
            ArrayList arrayList = new ArrayList(C13616u.m87774u(list, 10));
            for (C4719k a : list) {
                arrayList.add(Long.valueOf(a.mo29206a()));
            }
            if (arrayList.contains(Long.valueOf(j))) {
                Iterator it = list.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((C4719k) obj2).mo29206a() == j) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                C4719k kVar = (C4719k) obj2;
                int i = 30000;
                int b = kVar != null ? kVar.mo29207b() : 30000;
                List I0 = C13566b0.m87405I0(list);
                boolean unused = C13624y.m87795D(I0, new C4717a(j));
                List F0 = C13566b0.m87402F0(I0);
                this.f11855d.put(str, F0);
                C4878b.m18881t("Geofence [" + geofenceInfo.getName() + "] - Removed subscription. Macro: [" + str2 + ']', j2, str);
                if (F0.isEmpty()) {
                    m18273o(geofenceInfo, str2);
                    return;
                }
                Iterator it2 = list.iterator();
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (it2.hasNext()) {
                        int b2 = ((C4719k) obj).mo29207b();
                        do {
                            Object next = it2.next();
                            int b3 = ((C4719k) next).mo29207b();
                            if (b2 > b3) {
                                obj = next;
                                b2 = b3;
                            }
                        } while (it2.hasNext());
                    }
                }
                C4719k kVar2 = (C4719k) obj;
                if (kVar2 != null) {
                    i = kVar2.mo29207b();
                }
                if (b < i) {
                    m18267e(geofenceInfo, i);
                    return;
                }
                return;
            }
        }
        C4878b.m18865d("Remove Geofence - Attempted to remove geofence from user that has not added. Macro: [" + str2 + ']', j2, str);
    }
}
