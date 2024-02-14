package com.araujo.jordan.excuseme;

import android.app.Activity;
import android.content.Context;
import androidx.core.content.ContextCompat;
import com.araujo.jordan.excuseme.view.dialog.C1640d;
import com.araujo.jordan.excuseme.view.dialog.C1645e;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13654b;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15482l0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.channels.C15221f;
import p018c0.C1423a;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo71668d2 = {"Lcom/araujo/jordan/excuseme/a;", "", "f", "a", "excuseme_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: com.araujo.jordan.excuseme.a */
/* compiled from: ExcuseMe.kt */
public final class C1624a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static WeakReference<Context> f1067a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static C1423a f1068b = new C1423a((List) null, (List) null, 3, (C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static C15221f<Boolean> f1069c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static C1645e f1070d = new C1645e();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static C1640d f1071e = new C1640d();

    /* renamed from: f */
    public static final C1625a f1072f = new C1625a((C13695i) null);

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0007J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0007J5\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\f2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\u00052\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\u00020\u00052\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001eR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010)8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010+\u0002\u0004\n\u0002\b\u0019¨\u0006."}, mo71668d2 = {"Lcom/araujo/jordan/excuseme/a$a;", "", "Landroid/app/Activity;", "activity", "c", "Lc0/a;", "permissionResult", "Lja/u;", "g", "Landroid/content/Context;", "context", "", "", "permissions", "", "d", "(Landroid/content/Context;[Ljava/lang/String;)Z", "Lcom/araujo/jordan/excuseme/view/dialog/e;", "f", "b", "Lcom/araujo/jordan/excuseme/view/dialog/d;", "e", "a", "permission", "Lkotlin/Function1;", "completion", "Lkotlinx/coroutines/w1;", "i", "([Ljava/lang/String;Lqa/l;)Lkotlinx/coroutines/w1;", "h", "([Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "j", "Lkotlinx/coroutines/channels/f;", "channel", "Lkotlinx/coroutines/channels/f;", "permissionStatus", "Lc0/a;", "posDialog", "Lcom/araujo/jordan/excuseme/view/dialog/d;", "preDialog", "Lcom/araujo/jordan/excuseme/view/dialog/e;", "Ljava/lang/ref/WeakReference;", "weakContext", "Ljava/lang/ref/WeakReference;", "<init>", "()V", "excuseme_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: com.araujo.jordan.excuseme.a$a */
    /* compiled from: ExcuseMe.kt */
    public static final class C1625a {

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"Lkotlinx/coroutines/k0;", "Lja/u;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
        @C13658f(mo71893c = "com.araujo.jordan.excuseme.ExcuseMe$Companion$onPermissionResult$1", mo71894f = "ExcuseMe.kt", mo71895l = {131}, mo71896m = "invokeSuspend")
        /* renamed from: com.araujo.jordan.excuseme.a$a$a */
        /* compiled from: ExcuseMe.kt */
        static final class C1626a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            Object L$0;
            int label;

            /* renamed from: p$ */
            private C15478k0 f1073p$;

            C1626a(C13635d dVar) {
                super(2, dVar);
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                C13706o.m87930g(dVar, "completion");
                C1626a aVar = new C1626a(dVar);
                aVar.f1073p$ = (C15478k0) obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C1626a) create(obj, (C13635d) obj2)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object c = C13652d.m87832c();
                int i = this.label;
                if (i == 0) {
                    C13332o.m85685b(obj);
                    C15478k0 k0Var = this.f1073p$;
                    C15221f a = C1624a.f1069c;
                    if (a != null) {
                        Boolean a2 = C13654b.m87833a(true);
                        this.L$0 = k0Var;
                        this.label = 1;
                        if (a.send(a2, this) == c) {
                            return c;
                        }
                    }
                } else if (i == 1) {
                    C15478k0 k0Var2 = (C15478k0) this.L$0;
                    C13332o.m85685b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                WeakReference e = C1624a.f1067a;
                if (e != null) {
                    e.clear();
                }
                C1624a.f1067a = null;
                return C13339u.f61331a;
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"Lkotlinx/coroutines/k0;", "Lja/u;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
        @C13658f(mo71893c = "com.araujo.jordan.excuseme.ExcuseMe$Companion$permissionFor$1", mo71894f = "ExcuseMe.kt", mo71895l = {190}, mo71896m = "invokeSuspend")
        /* renamed from: com.araujo.jordan.excuseme.a$a$b */
        /* compiled from: ExcuseMe.kt */
        static final class C1627b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ C16265l $completion;
            final /* synthetic */ String[] $permission;
            Object L$0;
            int label;

            /* renamed from: p$ */
            private C15478k0 f1074p$;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1627b(String[] strArr, C16265l lVar, C13635d dVar) {
                super(2, dVar);
                this.$permission = strArr;
                this.$completion = lVar;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                C13706o.m87930g(dVar, "completion");
                C1627b bVar = new C1627b(this.$permission, this.$completion, dVar);
                bVar.f1074p$ = (C15478k0) obj;
                return bVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C1627b) create(obj, (C13635d) obj2)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object c = C13652d.m87832c();
                int i = this.label;
                if (i == 0) {
                    C13332o.m85685b(obj);
                    C15478k0 k0Var = this.f1074p$;
                    C1625a aVar = C1624a.f1072f;
                    String[] strArr = this.$permission;
                    this.L$0 = k0Var;
                    this.label = 1;
                    obj = aVar.mo19241j((String[]) Arrays.copyOf(strArr, strArr.length), this);
                    if (obj == c) {
                        return c;
                    }
                } else if (i == 1) {
                    C15478k0 k0Var2 = (C15478k0) this.L$0;
                    C13332o.m85685b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.$completion.invoke((C1423a) obj);
                return C13339u.f61331a;
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000\"\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, mo71668d2 = {"", "", "permissions", "Lkotlin/coroutines/d;", "Lc0/a;", "continuation", "", "runPermissionRequest"}, mo71669k = 3, mo71670mv = {1, 4, 0})
        @C13658f(mo71893c = "com.araujo.jordan.excuseme.ExcuseMe$Companion", mo71894f = "ExcuseMe.kt", mo71895l = {328}, mo71896m = "runPermissionRequest")
        /* renamed from: com.araujo.jordan.excuseme.a$a$c */
        /* compiled from: ExcuseMe.kt */
        static final class C1628c extends C13656d {
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ C1625a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1628c(C1625a aVar, C13635d dVar) {
                super(dVar);
                this.this$0 = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.mo19241j((String[]) null, this);
            }
        }

        private C1625a() {
        }

        public /* synthetic */ C1625a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final void mo19232a() {
            C1624a.f1071e = new C1640d();
        }

        /* renamed from: b */
        public final void mo19233b() {
            C1624a.f1070d = new C1645e();
        }

        /* renamed from: c */
        public final C1625a mo19234c(Activity activity) {
            C13706o.m87930g(activity, "activity");
            C1624a.f1067a = new WeakReference(activity);
            return this;
        }

        /* renamed from: d */
        public final boolean mo19235d(Context context, String... strArr) {
            C13706o.m87930g(context, "context");
            C13706o.m87930g(strArr, "permissions");
            for (String checkSelfPermission : strArr) {
                if (ContextCompat.checkSelfPermission(context, checkSelfPermission) != 0) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: e */
        public final C1640d mo19236e() {
            return C1624a.f1071e;
        }

        /* renamed from: f */
        public final C1645e mo19237f() {
            return C1624a.f1070d;
        }

        /* renamed from: g */
        public final void mo19238g(C1423a aVar) {
            C13706o.m87930g(aVar, "permissionResult");
            C1624a.f1068b = aVar;
            C15561w1 unused = C15473j.m94492d(C15482l0.m94502a(C15186a1.m93731c().mo74507o()), (C13640g) null, (C15486m0) null, new C1626a((C13635d) null), 3, (Object) null);
        }

        /* renamed from: h */
        public final Object mo19239h(String[] strArr, C13635d<? super C1423a> dVar) {
            return mo19241j((String[]) Arrays.copyOf(strArr, strArr.length), dVar);
        }

        /* renamed from: i */
        public final C15561w1 mo19240i(String[] strArr, C16265l<? super C1423a, C13339u> lVar) {
            C13706o.m87930g(strArr, "permission");
            C13706o.m87930g(lVar, "completion");
            return C15473j.m94492d(C15482l0.m94502a(C15186a1.m93731c().mo74507o()), (C13640g) null, (C15486m0) null, new C1627b(strArr, lVar, (C13635d) null), 3, (Object) null);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object mo19241j(java.lang.String[] r12, kotlin.coroutines.C13635d<? super p018c0.C1423a> r13) {
            /*
                r11 = this;
                boolean r0 = r13 instanceof com.araujo.jordan.excuseme.C1624a.C1625a.C1628c
                if (r0 == 0) goto L_0x0013
                r0 = r13
                com.araujo.jordan.excuseme.a$a$c r0 = (com.araujo.jordan.excuseme.C1624a.C1625a.C1628c) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                com.araujo.jordan.excuseme.a$a$c r0 = new com.araujo.jordan.excuseme.a$a$c
                r0.<init>(r11, r13)
            L_0x0018:
                java.lang.Object r13 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r2 = r0.label
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x0043
                if (r2 != r4) goto L_0x003b
                java.lang.Object r12 = r0.L$3
                java.util.List r12 = (java.util.List) r12
                java.lang.Object r12 = r0.L$2
                android.content.Context r12 = (android.content.Context) r12
                java.lang.Object r12 = r0.L$1
                java.lang.String[] r12 = (java.lang.String[]) r12
                java.lang.Object r12 = r0.L$0
                com.araujo.jordan.excuseme.a$a r12 = (com.araujo.jordan.excuseme.C1624a.C1625a) r12
                p297ja.C13332o.m85685b(r13)
                goto L_0x00f1
            L_0x003b:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L_0x0043:
                p297ja.C13332o.m85685b(r13)
                java.lang.ref.WeakReference r13 = com.araujo.jordan.excuseme.C1624a.f1067a
                if (r13 == 0) goto L_0x00ff
                java.lang.Object r13 = r13.get()
                android.content.Context r13 = (android.content.Context) r13
                if (r13 == 0) goto L_0x00ff
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                int r5 = r12.length
                r6 = 0
                r7 = 0
            L_0x005c:
                if (r7 >= r5) goto L_0x0080
                r8 = r12[r7]
                com.araujo.jordan.excuseme.a$a r9 = com.araujo.jordan.excuseme.C1624a.f1072f
                java.lang.String r10 = "context"
                kotlin.jvm.internal.C13706o.m87925b(r13, r10)
                java.lang.String[] r10 = new java.lang.String[r4]
                r10[r6] = r8
                boolean r9 = r9.mo19235d(r13, r10)
                r9 = r9 ^ r4
                java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.C13654b.m87833a(r9)
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L_0x007d
                r2.add(r8)
            L_0x007d:
                int r7 = r7 + 1
                goto L_0x005c
            L_0x0080:
                boolean r5 = r2.isEmpty()
                if (r5 == 0) goto L_0x00b4
                c0.a r13 = new c0.a
                java.util.List r12 = kotlin.collections.C13596m.m87619r0(r12)
                r0 = 2
                r13.<init>(r12, r3, r0, r3)
                com.araujo.jordan.excuseme.C1624a.f1068b = r13
                java.lang.ref.WeakReference r12 = com.araujo.jordan.excuseme.C1624a.f1067a
                if (r12 == 0) goto L_0x009c
                r12.clear()
            L_0x009c:
                com.araujo.jordan.excuseme.C1624a.f1067a = r3
                com.araujo.jordan.excuseme.view.dialog.e r12 = new com.araujo.jordan.excuseme.view.dialog.e
                r12.<init>()
                com.araujo.jordan.excuseme.C1624a.f1070d = r12
                com.araujo.jordan.excuseme.view.dialog.d r12 = new com.araujo.jordan.excuseme.view.dialog.d
                r12.<init>()
                com.araujo.jordan.excuseme.C1624a.f1071e = r12
                c0.a r12 = com.araujo.jordan.excuseme.C1624a.f1068b
                return r12
            L_0x00b4:
                android.content.Intent r5 = new android.content.Intent
                java.lang.Class<com.araujo.jordan.excuseme.view.InvisibleActivity> r7 = com.araujo.jordan.excuseme.view.InvisibleActivity.class
                r5.<init>(r13, r7)
                java.lang.String[] r7 = new java.lang.String[r6]
                java.lang.Object[] r7 = r2.toArray(r7)
                if (r7 == 0) goto L_0x00f7
                java.lang.String[] r7 = (java.lang.String[]) r7
                java.lang.String r8 = "permissions"
                r5.putExtra(r8, r7)
                r13.startActivity(r5)
                kotlinx.coroutines.channels.f r5 = com.araujo.jordan.excuseme.C1624a.f1069c
                if (r5 != 0) goto L_0x00da
                kotlinx.coroutines.channels.f r5 = kotlinx.coroutines.channels.C15225i.m93851c(r6, r4, r3)
                com.araujo.jordan.excuseme.C1624a.f1069c = r5
            L_0x00da:
                kotlinx.coroutines.channels.f r5 = com.araujo.jordan.excuseme.C1624a.f1069c
                if (r5 == 0) goto L_0x00f3
                r0.L$0 = r11
                r0.L$1 = r12
                r0.L$2 = r13
                r0.L$3 = r2
                r0.label = r4
                java.lang.Object r13 = r5.mo74538o(r0)
                if (r13 != r1) goto L_0x00f1
                return r1
            L_0x00f1:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
            L_0x00f3:
                com.araujo.jordan.excuseme.C1624a.f1069c = r3
                goto L_0x00ff
            L_0x00f7:
                kotlin.TypeCastException r12 = new kotlin.TypeCastException
                java.lang.String r13 = "null cannot be cast to non-null type kotlin.Array<T>"
                r12.<init>(r13)
                throw r12
            L_0x00ff:
                c0.a r12 = com.araujo.jordan.excuseme.C1624a.f1068b
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.araujo.jordan.excuseme.C1624a.C1625a.mo19241j(java.lang.String[], kotlin.coroutines.d):java.lang.Object");
        }
    }
}
