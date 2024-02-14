package com.arlosoft.macrodroid.commercial;

import android.content.Context;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.jvm.internal.C13706o;
import p117k1.C7469a;

/* renamed from: com.arlosoft.macrodroid.commercial.a */
/* compiled from: CommercialTools.kt */
public final class C3977a {

    /* renamed from: a */
    private final Context f10307a;

    /* renamed from: b */
    private final C7469a f10308b;

    /* renamed from: com.arlosoft.macrodroid.commercial.a$a */
    /* compiled from: CommercialTools.kt */
    static final class C3978a extends C13656d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ C3977a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3978a(C3977a aVar, C13635d<? super C3978a> dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo27694a(this);
        }
    }

    public C3977a(Context context, C7469a aVar) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(aVar, "commercialApi");
        this.f10307a = context;
        this.f10308b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo27694a(kotlin.coroutines.C13635d<? super p297ja.C13339u> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.arlosoft.macrodroid.commercial.C3977a.C3978a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.arlosoft.macrodroid.commercial.a$a r0 = (com.arlosoft.macrodroid.commercial.C3977a.C3978a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.arlosoft.macrodroid.commercial.a$a r0 = new com.arlosoft.macrodroid.commercial.a$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r0 = r0.L$0
            com.arlosoft.macrodroid.commercial.a r0 = (com.arlosoft.macrodroid.commercial.C3977a) r0
            p297ja.C13332o.m85685b(r7)     // Catch:{ Exception -> 0x002d }
            goto L_0x0070
        L_0x002d:
            r7 = move-exception
            goto L_0x007e
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0037:
            p297ja.C13332o.m85685b(r7)
            java.lang.String r7 = com.arlosoft.macrodroid.settings.C5124c.f12865c
            if (r7 != 0) goto L_0x0041
            ja.u r7 = p297ja.C13339u.f61331a
            return r7
        L_0x0041:
            android.content.Context r2 = r6.f10307a
            boolean r2 = com.arlosoft.macrodroid.settings.C5163j2.m20175i0(r2)
            if (r2 == 0) goto L_0x004c
            ja.u r7 = p297ja.C13339u.f61331a
            return r7
        L_0x004c:
            android.content.Context r2 = r6.f10307a     // Catch:{ Exception -> 0x007c }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ Exception -> 0x007c }
            java.lang.String r4 = "android_id"
            java.lang.String r2 = android.provider.Settings.Secure.getString(r2, r4)     // Catch:{ Exception -> 0x007c }
            k1.a r4 = r6.f10308b     // Catch:{ Exception -> 0x007c }
            java.lang.String r5 = "REGISTER_COMMERCIAL_DEVICE_COMPANY_ID"
            kotlin.jvm.internal.C13706o.m87928e(r7, r5)     // Catch:{ Exception -> 0x007c }
            java.lang.String r5 = "id"
            kotlin.jvm.internal.C13706o.m87928e(r2, r5)     // Catch:{ Exception -> 0x007c }
            r0.L$0 = r6     // Catch:{ Exception -> 0x007c }
            r0.label = r3     // Catch:{ Exception -> 0x007c }
            java.lang.Object r7 = r4.mo37624a(r7, r2, r0)     // Catch:{ Exception -> 0x007c }
            if (r7 != r1) goto L_0x006f
            return r1
        L_0x006f:
            r0 = r6
        L_0x0070:
            android.content.Context r7 = r0.f10307a     // Catch:{ Exception -> 0x002d }
            r1 = 0
            com.arlosoft.macrodroid.settings.C5163j2.m20314z3(r7, r1)     // Catch:{ Exception -> 0x002d }
            android.content.Context r7 = r0.f10307a     // Catch:{ Exception -> 0x002d }
            com.arlosoft.macrodroid.settings.C5163j2.m20086W3(r7, r3)     // Catch:{ Exception -> 0x002d }
            goto L_0x0098
        L_0x007c:
            r7 = move-exception
            r0 = r6
        L_0x007e:
            boolean r1 = r7 instanceof retrofit2.HttpException
            if (r1 == 0) goto L_0x0095
            r1 = r7
            retrofit2.HttpException r1 = (retrofit2.HttpException) r1
            int r1 = r1.mo80527a()
            r2 = 402(0x192, float:5.63E-43)
            if (r1 != r2) goto L_0x0095
            android.content.Context r7 = r0.f10307a
            com.arlosoft.macrodroid.settings.C5163j2.m20314z3(r7, r3)
            ja.u r7 = p297ja.C13339u.f61331a
            return r7
        L_0x0095:
            p148q0.C8151a.m33873n(r7)
        L_0x0098:
            ja.u r7 = p297ja.C13339u.f61331a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.commercial.C3977a.mo27694a(kotlin.coroutines.d):java.lang.Object");
    }
}
