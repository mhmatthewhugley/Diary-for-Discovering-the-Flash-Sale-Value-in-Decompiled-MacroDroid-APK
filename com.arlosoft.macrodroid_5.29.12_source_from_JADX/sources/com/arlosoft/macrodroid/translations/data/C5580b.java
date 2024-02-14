package com.arlosoft.macrodroid.translations.data;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p107i3.C7397a;

/* renamed from: com.arlosoft.macrodroid.translations.data.b */
/* compiled from: TranslationDataRepository.kt */
public final class C5580b {

    /* renamed from: e */
    public static final C5581a f13550e = new C5581a((C13695i) null);

    /* renamed from: a */
    private final Context f13551a;

    /* renamed from: b */
    private final C7397a f13552b;

    /* renamed from: c */
    private final SharedPreferences f13553c;

    /* renamed from: d */
    private final Gson f13554d = new GsonBuilder().mo64004c();

    /* renamed from: com.arlosoft.macrodroid.translations.data.b$a */
    /* compiled from: TranslationDataRepository.kt */
    public static final class C5581a {
        private C5581a() {
        }

        public /* synthetic */ C5581a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.translations.data.b$b */
    /* compiled from: TranslationDataRepository.kt */
    static final class C5582b extends C13656d {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ C5580b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5582b(C5580b bVar, C13635d<? super C5582b> dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.m21391c(0, this);
        }
    }

    public C5580b(Context context, C7397a aVar) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(aVar, "api");
        this.f13551a = context;
        this.f13552b = aVar;
        this.f13553c = context.getSharedPreferences("TranslationData", 0);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m21391c(long r8, kotlin.coroutines.C13635d<? super com.arlosoft.macrodroid.translations.data.TranslationData> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.arlosoft.macrodroid.translations.data.C5580b.C5582b
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.arlosoft.macrodroid.translations.data.b$b r0 = (com.arlosoft.macrodroid.translations.data.C5580b.C5582b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.arlosoft.macrodroid.translations.data.b$b r0 = new com.arlosoft.macrodroid.translations.data.b$b
            r0.<init>(r7, r10)
        L_0x0018:
            r6 = r0
            java.lang.Object r10 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x0038
            if (r1 != r2) goto L_0x0030
            long r8 = r6.J$0
            java.lang.Object r0 = r6.L$0
            com.arlosoft.macrodroid.translations.data.b r0 = (com.arlosoft.macrodroid.translations.data.C5580b) r0
            p297ja.C13332o.m85685b(r10)     // Catch:{ Exception -> 0x008b }
            goto L_0x0064
        L_0x0030:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0038:
            p297ja.C13332o.m85685b(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008b }
            r10.<init>()     // Catch:{ Exception -> 0x008b }
            r10.append(r8)     // Catch:{ Exception -> 0x008b }
            java.lang.String r1 = "VQqsM1gTFYDR5ujMTqGKcSA1PBwFgld2"
            r10.append(r1)     // Catch:{ Exception -> 0x008b }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x008b }
            java.lang.String r5 = com.arlosoft.macrodroid.extensions.C4660g.m18125c(r10)     // Catch:{ Exception -> 0x008b }
            i3.a r1 = r7.f13552b     // Catch:{ Exception -> 0x008b }
            java.lang.String r10 = "1tlElroQgRxbbHOVXlvZ3WRJneeupimg"
            r6.L$0 = r7     // Catch:{ Exception -> 0x008b }
            r6.J$0 = r8     // Catch:{ Exception -> 0x008b }
            r6.label = r2     // Catch:{ Exception -> 0x008b }
            r2 = r10
            r3 = r8
            java.lang.Object r10 = r1.mo37429a(r2, r3, r5, r6)     // Catch:{ Exception -> 0x008b }
            if (r10 != r0) goto L_0x0063
            return r0
        L_0x0063:
            r0 = r7
        L_0x0064:
            com.arlosoft.macrodroid.translations.data.TranslationData r10 = (com.arlosoft.macrodroid.translations.data.TranslationData) r10     // Catch:{ Exception -> 0x008b }
            com.google.gson.Gson r1 = r0.f13554d     // Catch:{ Exception -> 0x008b }
            java.lang.String r1 = r1.mo63984s(r10)     // Catch:{ Exception -> 0x008b }
            android.content.SharedPreferences r2 = r0.f13553c     // Catch:{ Exception -> 0x008b }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ Exception -> 0x008b }
            java.lang.String r3 = "last_update"
            android.content.SharedPreferences$Editor r8 = r2.putLong(r3, r8)     // Catch:{ Exception -> 0x008b }
            r8.apply()     // Catch:{ Exception -> 0x008b }
            android.content.SharedPreferences r8 = r0.f13553c     // Catch:{ Exception -> 0x008b }
            android.content.SharedPreferences$Editor r8 = r8.edit()     // Catch:{ Exception -> 0x008b }
            java.lang.String r9 = "translation_data"
            android.content.SharedPreferences$Editor r8 = r8.putString(r9, r1)     // Catch:{ Exception -> 0x008b }
            r8.apply()     // Catch:{ Exception -> 0x008b }
            goto L_0x008c
        L_0x008b:
            r10 = 0
        L_0x008c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.translations.data.C5580b.m21391c(long, kotlin.coroutines.d):java.lang.Object");
    }

    /* renamed from: b */
    public final Object mo30877b(C13635d<? super TranslationData> dVar) {
        long currentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        if (currentTimeMillis - this.f13553c.getLong("last_update", 0) > 3600) {
            return m21391c(currentTimeMillis, dVar);
        }
        try {
            return (TranslationData) this.f13554d.mo63976j(this.f13553c.getString("translation_data", ""), TranslationData.class);
        } catch (Exception unused) {
            Object c = m21391c(currentTimeMillis, dVar);
            return c == C13652d.m87832c() ? c : (TranslationData) c;
        }
    }
}
