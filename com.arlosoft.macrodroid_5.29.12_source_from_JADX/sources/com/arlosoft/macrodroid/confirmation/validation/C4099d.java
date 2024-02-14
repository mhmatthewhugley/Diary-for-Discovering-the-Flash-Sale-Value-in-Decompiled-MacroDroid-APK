package com.arlosoft.macrodroid.confirmation.validation;

import android.content.Context;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.jvm.internal.C13706o;
import p104i0.C7393b;

/* renamed from: com.arlosoft.macrodroid.confirmation.validation.d */
/* compiled from: PremiumValidator.kt */
public final class C4099d {

    /* renamed from: a */
    private final Context f10683a;

    /* renamed from: b */
    private final C7393b f10684b;

    /* renamed from: com.arlosoft.macrodroid.confirmation.validation.d$a */
    /* compiled from: PremiumValidator.kt */
    static final class C4100a extends C13656d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ C4099d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4100a(C4099d dVar, C13635d<? super C4100a> dVar2) {
            super(dVar2);
            this.this$0 = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo28025a(this);
        }
    }

    public C4099d(Context context, C7393b bVar) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(bVar, "upgradeApi");
        this.f10683a = context;
        this.f10684b = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0093, code lost:
        if ((r5.length() == 0) != false) goto L_0x0095;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo28025a(kotlin.coroutines.C13635d<? super p184w3.C10331a> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.arlosoft.macrodroid.confirmation.validation.C4099d.C4100a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.arlosoft.macrodroid.confirmation.validation.d$a r0 = (com.arlosoft.macrodroid.confirmation.validation.C4099d.C4100a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.arlosoft.macrodroid.confirmation.validation.d$a r0 = new com.arlosoft.macrodroid.confirmation.validation.d$a
            r0.<init>(r9, r10)
        L_0x0018:
            r6 = r0
            java.lang.Object r10 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r1 = r6.label
            r7 = 0
            r8 = 1
            if (r1 == 0) goto L_0x003b
            if (r1 != r8) goto L_0x0033
            java.lang.Object r0 = r6.L$0
            w3.a[] r0 = (p184w3.C10331a[]) r0
            p297ja.C13332o.m85685b(r10)     // Catch:{ Exception -> 0x0030 }
            goto L_0x00b6
        L_0x0030:
            r10 = move-exception
            goto L_0x00d3
        L_0x0033:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x003b:
            p297ja.C13332o.m85685b(r10)
            p148q0.C8151a.m33869j()
            android.content.Context r10 = r9.f10683a
            java.lang.String r10 = com.arlosoft.macrodroid.settings.C5163j2.m20232p1(r10)
            java.lang.String r1 = ""
            if (r10 != 0) goto L_0x004d
            r4 = r1
            goto L_0x004e
        L_0x004d:
            r4 = r10
        L_0x004e:
            android.content.Context r10 = r9.f10683a
            java.lang.String r10 = com.arlosoft.macrodroid.settings.C5163j2.m20240q1(r10)
            if (r10 != 0) goto L_0x0058
            r5 = r1
            goto L_0x0059
        L_0x0058:
            r5 = r10
        L_0x0059:
            android.content.Context r10 = r9.f10683a
            java.lang.String r10 = com.arlosoft.macrodroid.settings.C5163j2.m20233p2(r10)
            if (r10 != 0) goto L_0x0063
            r3 = r1
            goto L_0x0064
        L_0x0063:
            r3 = r10
        L_0x0064:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "adb97ac6-f780-4a41-8475-ce661b574999"
            r10.append(r1)
            r10.append(r3)
            r10.append(r4)
            r10.append(r5)
            java.lang.String r10 = r10.toString()
            java.lang.String r2 = com.arlosoft.macrodroid.extensions.C4660g.m18129g(r10)
            int r10 = r4.length()
            if (r10 != 0) goto L_0x0087
            r10 = 1
            goto L_0x0088
        L_0x0087:
            r10 = 0
        L_0x0088:
            if (r10 != 0) goto L_0x0095
            int r10 = r5.length()
            if (r10 != 0) goto L_0x0092
            r10 = 1
            goto L_0x0093
        L_0x0092:
            r10 = 0
        L_0x0093:
            if (r10 == 0) goto L_0x00a3
        L_0x0095:
            int r10 = r3.length()
            if (r10 != 0) goto L_0x009d
            r10 = 1
            goto L_0x009e
        L_0x009d:
            r10 = 0
        L_0x009e:
            if (r10 == 0) goto L_0x00a3
            w3.a r10 = p184w3.C10331a.PRO_USER_NO_INFO_IN_APP
            goto L_0x00be
        L_0x00a3:
            w3.a[] r10 = p184w3.C10331a.values()     // Catch:{ Exception -> 0x0030 }
            i0.b r1 = r9.f10684b     // Catch:{ Exception -> 0x0030 }
            r6.L$0 = r10     // Catch:{ Exception -> 0x0030 }
            r6.label = r8     // Catch:{ Exception -> 0x0030 }
            java.lang.Object r1 = r1.mo37423a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0030 }
            if (r1 != r0) goto L_0x00b4
            return r0
        L_0x00b4:
            r0 = r10
            r10 = r1
        L_0x00b6:
            com.arlosoft.macrodroid.upgrade.model.ProUserStatus r10 = (com.arlosoft.macrodroid.upgrade.model.ProUserStatus) r10     // Catch:{ Exception -> 0x0030 }
            int r10 = r10.getStatusCode()     // Catch:{ Exception -> 0x0030 }
            r10 = r0[r10]     // Catch:{ Exception -> 0x0030 }
        L_0x00be:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "++ Pro check returned status = "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18864c(r0)
            return r10
        L_0x00d3:
            boolean r0 = r10 instanceof retrofit2.HttpException
            if (r0 == 0) goto L_0x00e2
            retrofit2.HttpException r10 = (retrofit2.HttpException) r10
            int r10 = r10.mo80527a()
            r0 = 401(0x191, float:5.62E-43)
            if (r10 != r0) goto L_0x00e2
            r7 = 1
        L_0x00e2:
            if (r7 == 0) goto L_0x00e7
            w3.a r10 = p184w3.C10331a.PRO_USER_STAUTUS_AUTH_FAILED
            goto L_0x00e9
        L_0x00e7:
            w3.a r10 = p184w3.C10331a.PRO_USER_STATUS_UNAVAILABLE
        L_0x00e9:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.confirmation.validation.C4099d.mo28025a(kotlin.coroutines.d):java.lang.Object");
    }
}
