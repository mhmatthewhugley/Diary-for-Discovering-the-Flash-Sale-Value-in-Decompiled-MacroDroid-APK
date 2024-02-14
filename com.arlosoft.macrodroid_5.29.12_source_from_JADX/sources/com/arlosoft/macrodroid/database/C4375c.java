package com.arlosoft.macrodroid.database;

import com.arlosoft.macrodroid.MacroDroidService;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15482l0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15516s2;
import kotlinx.coroutines.C15561w1;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

/* renamed from: com.arlosoft.macrodroid.database.c */
/* compiled from: DatabaseOptimizer.kt */
public final class C4375c {

    /* renamed from: a */
    public static final C4375c f11144a = new C4375c();

    /* renamed from: b */
    private static final C15478k0 f11145b = C15482l0.m94502a(C15516s2.m94604b((C15561w1) null, 1, (Object) null).plus(C15186a1.m93730b()));

    /* renamed from: com.arlosoft.macrodroid.database.c$a */
    /* compiled from: DatabaseOptimizer.kt */
    static final class C4376a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ long $guid;
        final /* synthetic */ long $lastRunTime;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4376a(long j, long j2, C13635d<? super C4376a> dVar) {
            super(2, dVar);
            this.$guid = j;
            this.$lastRunTime = j2;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C4376a(this.$guid, this.$lastRunTime, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C4376a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C4373a.m17336h().mo28652w(this.$guid, this.$lastRunTime);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.c$b */
    /* compiled from: DatabaseOptimizer.kt */
    static final class C4377b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;

        C4377b(C13635d<? super C4377b> dVar) {
            super(2, dVar);
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C4377b(dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C4377b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                MacroDroidService.C2296a aVar = MacroDroidService.f7040a;
                MacroDroidApplication b = MacroDroidApplication.f9883I.mo27303b();
                this.label = 1;
                if (aVar.mo24643h(b, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13339u.f61331a;
        }
    }

    private C4375c() {
    }

    /* renamed from: a */
    public static final void m17362a(long j, long j2) {
        C4373a.m17336h().mo28649t(j);
        C4373a.m17336h().mo28653x(j, j2);
        C15561w1 unused = C15473j.m94492d(f11145b, (C13640g) null, (C15486m0) null, new C4376a(j, j2, (C13635d<? super C4376a>) null), 3, (Object) null);
    }

    /* renamed from: b */
    public static final void m17363b() {
        C15561w1 unused = C15473j.m94492d(f11145b, (C13640g) null, (C15486m0) null, new C4377b((C13635d<? super C4377b>) null), 3, (Object) null);
    }
}
