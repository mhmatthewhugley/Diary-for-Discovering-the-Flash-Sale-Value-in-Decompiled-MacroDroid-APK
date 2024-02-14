package com.arlosoft.macrodroid.videos;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p059a4.C2230a;

/* renamed from: com.arlosoft.macrodroid.videos.b */
/* compiled from: VideoDataRepository.kt */
public final class C6606b {

    /* renamed from: e */
    public static final C6607a f15340e = new C6607a((C13695i) null);

    /* renamed from: a */
    private final Context f15341a;

    /* renamed from: b */
    private final C2230a f15342b;

    /* renamed from: c */
    private final SharedPreferences f15343c;

    /* renamed from: d */
    private final Gson f15344d = new GsonBuilder().mo64004c();

    /* renamed from: com.arlosoft.macrodroid.videos.b$a */
    /* compiled from: VideoDataRepository.kt */
    public static final class C6607a {
        private C6607a() {
        }

        public /* synthetic */ C6607a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.videos.b$b */
    /* compiled from: VideoDataRepository.kt */
    static final class C6608b extends C13656d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ C6606b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6608b(C6606b bVar, C13635d<? super C6608b> dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo32827a(this);
        }
    }

    public C6606b(Context context, C2230a aVar) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(aVar, "api");
        this.f15341a = context;
        this.f15342b = aVar;
        this.f15343c = context.getSharedPreferences("VideoData", 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32827a(kotlin.coroutines.C13635d<? super com.arlosoft.macrodroid.videos.data.VideosData> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.arlosoft.macrodroid.videos.C6606b.C6608b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.arlosoft.macrodroid.videos.b$b r0 = (com.arlosoft.macrodroid.videos.C6606b.C6608b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.arlosoft.macrodroid.videos.b$b r0 = new com.arlosoft.macrodroid.videos.b$b
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            java.lang.String r3 = "video_data"
            r4 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r4) goto L_0x002f
            java.lang.Object r0 = r0.L$0
            com.arlosoft.macrodroid.videos.b r0 = (com.arlosoft.macrodroid.videos.C6606b) r0
            p297ja.C13332o.m85685b(r6)     // Catch:{ Exception -> 0x005f }
            goto L_0x0048
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0037:
            p297ja.C13332o.m85685b(r6)
            a4.a r6 = r5.f15342b     // Catch:{ Exception -> 0x005e }
            r0.L$0 = r5     // Catch:{ Exception -> 0x005e }
            r0.label = r4     // Catch:{ Exception -> 0x005e }
            java.lang.Object r6 = r6.mo24446a(r0)     // Catch:{ Exception -> 0x005e }
            if (r6 != r1) goto L_0x0047
            return r1
        L_0x0047:
            r0 = r5
        L_0x0048:
            com.arlosoft.macrodroid.videos.data.VideosData r6 = (com.arlosoft.macrodroid.videos.data.VideosData) r6     // Catch:{ Exception -> 0x005f }
            com.google.gson.Gson r1 = r0.f15344d     // Catch:{ Exception -> 0x005f }
            java.lang.String r1 = r1.mo63984s(r6)     // Catch:{ Exception -> 0x005f }
            android.content.SharedPreferences r2 = r0.f15343c     // Catch:{ Exception -> 0x005f }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ Exception -> 0x005f }
            android.content.SharedPreferences$Editor r1 = r2.putString(r3, r1)     // Catch:{ Exception -> 0x005f }
            r1.apply()     // Catch:{ Exception -> 0x005f }
            goto L_0x0071
        L_0x005e:
            r0 = r5
        L_0x005f:
            android.content.SharedPreferences r6 = r0.f15343c
            java.lang.String r1 = ""
            java.lang.String r6 = r6.getString(r3, r1)
            com.google.gson.Gson r0 = r0.f15344d
            java.lang.Class<com.arlosoft.macrodroid.videos.data.VideosData> r1 = com.arlosoft.macrodroid.videos.data.VideosData.class
            java.lang.Object r6 = r0.mo63976j(r6, r1)
            com.arlosoft.macrodroid.videos.data.VideosData r6 = (com.arlosoft.macrodroid.videos.data.VideosData) r6
        L_0x0071:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.videos.C6606b.mo32827a(kotlin.coroutines.d):java.lang.Object");
    }
}
