package com.arlosoft.macrodroid.triggers.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.arlosoft.macrodroid.action.services.UIInteractionAccessibilityService;
import com.arlosoft.macrodroid.settings.C5163j2;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15503p1;
import kotlinx.coroutines.C15552u0;
import kotlinx.coroutines.C15561w1;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

/* compiled from: QueryUiService.kt */
public final class QueryUiService extends Service {

    /* renamed from: c */
    public static final C6110a f14528c = new C6110a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f14529a;

    /* renamed from: com.arlosoft.macrodroid.triggers.services.QueryUiService$a */
    /* compiled from: QueryUiService.kt */
    public static final class C6110a {
        private C6110a() {
        }

        public /* synthetic */ C6110a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.services.QueryUiService$b */
    /* compiled from: QueryUiService.kt */
    static final class C6111b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ QueryUiService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6111b(QueryUiService queryUiService, C13635d<? super C6111b> dVar) {
            super(2, dVar);
            this.this$0 = queryUiService;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C6111b(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C6111b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0 || i == 1) {
                C13332o.m85685b(obj);
                while (this.this$0.f14529a) {
                    UIInteractionAccessibilityService.f9127g.mo26810b(this.this$0);
                    this.label = 1;
                    if (C15552u0.m94699a((long) C5163j2.m20280v1(this.this$0), this) == c) {
                        return c;
                    }
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: b */
    private final void m24193b() {
        C15561w1 unused = C15473j.m94492d(C15503p1.f64723a, (C13640g) null, (C15486m0) null, new C6111b(this, (C13635d<? super C6111b>) null), 3, (Object) null);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.f14529a = true;
        m24193b();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f14529a = false;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        return 1;
    }
}
