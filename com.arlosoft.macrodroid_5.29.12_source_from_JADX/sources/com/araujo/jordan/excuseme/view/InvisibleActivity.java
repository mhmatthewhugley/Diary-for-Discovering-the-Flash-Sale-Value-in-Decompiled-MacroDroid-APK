package com.araujo.jordan.excuseme.view;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15482l0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\"\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J/\u0010\u0012\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00078\u0002XD¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00078\u0002XD¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, mo71668d2 = {"Lcom/araujo/jordan/excuseme/view/InvisibleActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/core/app/ActivityCompat$OnRequestPermissionsResultCallback;", "Landroid/os/Bundle;", "savedInstanceState", "Lja/u;", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "L1", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "K1", "d", "I", "PERMISSIONS_REQUEST_ID", "f", "SETTINGS_REQUEST_ID", "<init>", "()V", "excuseme_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: InvisibleActivity.kt */
public final class InvisibleActivity extends AppCompatActivity {

    /* renamed from: d */
    private final int f1075d = 4002;

    /* renamed from: f */
    private final int f1076f = 4009;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"Lkotlinx/coroutines/k0;", "Lja/u;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    @C13658f(mo71893c = "com.araujo.jordan.excuseme.view.InvisibleActivity$onActivityResult$1", mo71894f = "InvisibleActivity.kt", mo71895l = {59}, mo71896m = "invokeSuspend")
    /* renamed from: com.araujo.jordan.excuseme.view.InvisibleActivity$a */
    /* compiled from: InvisibleActivity.kt */
    static final class C1629a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        Object L$0;
        int label;

        /* renamed from: p$ */
        private C15478k0 f1077p$;
        final /* synthetic */ InvisibleActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1629a(InvisibleActivity invisibleActivity, C13635d dVar) {
            super(2, dVar);
            this.this$0 = invisibleActivity;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            C13706o.m87930g(dVar, "completion");
            C1629a aVar = new C1629a(this.this$0, dVar);
            aVar.f1077p$ = (C15478k0) obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C1629a) create(obj, (C13635d) obj2)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C15478k0 k0Var = this.f1077p$;
                InvisibleActivity invisibleActivity = this.this$0;
                this.L$0 = k0Var;
                this.label = 1;
                if (invisibleActivity.mo19242K1(this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C15478k0 k0Var2 = (C15478k0) this.L$0;
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13339u.f61331a;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"Lkotlinx/coroutines/k0;", "Lja/u;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    @C13658f(mo71893c = "com.araujo.jordan.excuseme.view.InvisibleActivity$onCreate$1", mo71894f = "InvisibleActivity.kt", mo71895l = {52}, mo71896m = "invokeSuspend")
    /* renamed from: com.araujo.jordan.excuseme.view.InvisibleActivity$b */
    /* compiled from: InvisibleActivity.kt */
    static final class C1630b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        Object L$0;
        int label;

        /* renamed from: p$ */
        private C15478k0 f1078p$;
        final /* synthetic */ InvisibleActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1630b(InvisibleActivity invisibleActivity, C13635d dVar) {
            super(2, dVar);
            this.this$0 = invisibleActivity;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            C13706o.m87930g(dVar, "completion");
            C1630b bVar = new C1630b(this.this$0, dVar);
            bVar.f1078p$ = (C15478k0) obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C1630b) create(obj, (C13635d) obj2)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C15478k0 k0Var = this.f1078p$;
                InvisibleActivity invisibleActivity = this.this$0;
                this.L$0 = k0Var;
                this.label = 1;
                if (invisibleActivity.mo19243L1(this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C15478k0 k0Var2 = (C15478k0) this.L$0;
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13339u.f61331a;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"Lkotlinx/coroutines/k0;", "Lja/u;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    @C13658f(mo71893c = "com.araujo.jordan.excuseme.view.InvisibleActivity$onRequestPermissionsResult$1", mo71894f = "InvisibleActivity.kt", mo71895l = {69}, mo71896m = "invokeSuspend")
    /* renamed from: com.araujo.jordan.excuseme.view.InvisibleActivity$c */
    /* compiled from: InvisibleActivity.kt */
    static final class C1631c extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        Object L$0;
        int label;

        /* renamed from: p$ */
        private C15478k0 f1079p$;
        final /* synthetic */ InvisibleActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1631c(InvisibleActivity invisibleActivity, C13635d dVar) {
            super(2, dVar);
            this.this$0 = invisibleActivity;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            C13706o.m87930g(dVar, "completion");
            C1631c cVar = new C1631c(this.this$0, dVar);
            cVar.f1079p$ = (C15478k0) obj;
            return cVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C1631c) create(obj, (C13635d) obj2)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C15478k0 k0Var = this.f1079p$;
                InvisibleActivity invisibleActivity = this.this$0;
                this.L$0 = k0Var;
                this.label = 1;
                if (invisibleActivity.mo19242K1(this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C15478k0 k0Var2 = (C15478k0) this.L$0;
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13339u.f61331a;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo71668d2 = {"Lkotlin/coroutines/d;", "Lja/u;", "continuation", "", "posPermission"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    @C13658f(mo71893c = "com.araujo.jordan.excuseme.view.InvisibleActivity", mo71894f = "InvisibleActivity.kt", mo71895l = {113, 116}, mo71896m = "posPermission")
    /* renamed from: com.araujo.jordan.excuseme.view.InvisibleActivity$d */
    /* compiled from: InvisibleActivity.kt */
    static final class C1632d extends C13656d {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ InvisibleActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1632d(InvisibleActivity invisibleActivity, C13635d dVar) {
            super(dVar);
            this.this$0 = invisibleActivity;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo19242K1(this);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo71668d2 = {"Lkotlin/coroutines/d;", "Lja/u;", "continuation", "", "prePermission"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    @C13658f(mo71893c = "com.araujo.jordan.excuseme.view.InvisibleActivity", mo71894f = "InvisibleActivity.kt", mo71895l = {80}, mo71896m = "prePermission")
    /* renamed from: com.araujo.jordan.excuseme.view.InvisibleActivity$e */
    /* compiled from: InvisibleActivity.kt */
    static final class C1633e extends C13656d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ InvisibleActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1633e(InvisibleActivity invisibleActivity, C13635d dVar) {
            super(dVar);
            this.this$0 = invisibleActivity;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo19243L1(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: K1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo19242K1(kotlin.coroutines.C13635d<? super p297ja.C13339u> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.araujo.jordan.excuseme.view.InvisibleActivity.C1632d
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.araujo.jordan.excuseme.view.InvisibleActivity$d r0 = (com.araujo.jordan.excuseme.view.InvisibleActivity.C1632d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.araujo.jordan.excuseme.view.InvisibleActivity$d r0 = new com.araujo.jordan.excuseme.view.InvisibleActivity$d
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 == r5) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r1 = r0.L$1
            c0.a r1 = (p018c0.C1423a) r1
            java.lang.Object r0 = r0.L$0
            com.araujo.jordan.excuseme.view.InvisibleActivity r0 = (com.araujo.jordan.excuseme.view.InvisibleActivity) r0
            p297ja.C13332o.m85685b(r14)
            goto L_0x0106
        L_0x0036:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x003e:
            java.lang.Object r2 = r0.L$1
            c0.a r2 = (p018c0.C1423a) r2
            java.lang.Object r6 = r0.L$0
            com.araujo.jordan.excuseme.view.InvisibleActivity r6 = (com.araujo.jordan.excuseme.view.InvisibleActivity) r6
            p297ja.C13332o.m85685b(r14)
            goto L_0x00be
        L_0x004b:
            p297ja.C13332o.m85685b(r14)
            c0.a r2 = new c0.a
            r14 = 3
            r2.<init>(r4, r4, r14, r4)
            android.content.Intent r14 = r13.getIntent()
            java.lang.String r6 = "permissions"
            java.lang.String[] r14 = r14.getStringArrayExtra(r6)
            if (r14 == 0) goto L_0x008a
            int r6 = r14.length
            r7 = 0
            r8 = 0
        L_0x0063:
            if (r8 >= r6) goto L_0x008a
            r9 = r14[r8]
            com.araujo.jordan.excuseme.a$a r10 = com.araujo.jordan.excuseme.C1624a.f1072f
            java.lang.String[] r11 = new java.lang.String[r5]
            java.lang.String r12 = "it"
            kotlin.jvm.internal.C13706o.m87925b(r9, r12)
            r11[r7] = r9
            boolean r10 = r10.mo19235d(r13, r11)
            if (r10 == 0) goto L_0x0080
            java.util.List r10 = r2.mo16888b()
            r10.add(r9)
            goto L_0x0087
        L_0x0080:
            java.util.List r10 = r2.mo16887a()
            r10.add(r9)
        L_0x0087:
            int r8 = r8 + 1
            goto L_0x0063
        L_0x008a:
            com.araujo.jordan.excuseme.a$a r14 = com.araujo.jordan.excuseme.C1624a.f1072f
            com.araujo.jordan.excuseme.view.dialog.d r6 = r14.mo19236e()
            boolean r6 = r6.mo19247e()
            if (r6 == 0) goto L_0x010f
            java.util.List r6 = r2.mo16887a()
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r5
            if (r6 == 0) goto L_0x010f
            com.araujo.jordan.excuseme.view.dialog.d r6 = r14.mo19236e()
            java.util.List r7 = r2.mo16887a()
            r6.mo19252k(r7)
            com.araujo.jordan.excuseme.view.dialog.d r14 = r14.mo19236e()
            r0.L$0 = r13
            r0.L$1 = r2
            r0.label = r5
            java.lang.Object r14 = r14.mo19250h(r13, r0)
            if (r14 != r1) goto L_0x00bd
            return r1
        L_0x00bd:
            r6 = r13
        L_0x00be:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x0109
            com.araujo.jordan.excuseme.a$a r7 = com.araujo.jordan.excuseme.C1624a.f1072f
            com.araujo.jordan.excuseme.view.dialog.d r7 = r7.mo19236e()
            com.araujo.jordan.excuseme.view.dialog.a r7 = r7.mo19251j()
            int[] r8 = com.araujo.jordan.excuseme.view.C1634a.f1080a
            int r7 = r7.ordinal()
            r7 = r8[r7]
            if (r7 == r5) goto L_0x00f7
            if (r7 == r3) goto L_0x00dd
            goto L_0x0106
        L_0x00dd:
            android.content.Intent r14 = new android.content.Intent
            java.lang.String r0 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r14.<init>(r0)
            java.lang.String r0 = r6.getPackageName()
            java.lang.String r1 = "package"
            android.net.Uri r0 = android.net.Uri.fromParts(r1, r0, r4)
            r14.setData(r0)
            int r0 = r6.f1076f
            r6.startActivityForResult(r14, r0)
            goto L_0x0106
        L_0x00f7:
            r0.L$0 = r6
            r0.L$1 = r2
            r0.Z$0 = r14
            r0.label = r3
            java.lang.Object r14 = r6.mo19243L1(r0)
            if (r14 != r1) goto L_0x0106
            return r1
        L_0x0106:
            ja.u r14 = p297ja.C13339u.f61331a
            return r14
        L_0x0109:
            com.araujo.jordan.excuseme.a$a r14 = com.araujo.jordan.excuseme.C1624a.f1072f
            r14.mo19232a()
            goto L_0x0110
        L_0x010f:
            r6 = r13
        L_0x0110:
            com.araujo.jordan.excuseme.a$a r14 = com.araujo.jordan.excuseme.C1624a.f1072f
            r14.mo19232a()
            r14.mo19238g(r2)
            r6.finish()
            ja.u r14 = p297ja.C13339u.f61331a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.araujo.jordan.excuseme.view.InvisibleActivity.mo19242K1(kotlin.coroutines.d):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: L1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo19243L1(kotlin.coroutines.C13635d<? super p297ja.C13339u> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.araujo.jordan.excuseme.view.InvisibleActivity.C1633e
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.araujo.jordan.excuseme.view.InvisibleActivity$e r0 = (com.araujo.jordan.excuseme.view.InvisibleActivity.C1633e) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.araujo.jordan.excuseme.view.InvisibleActivity$e r0 = new com.araujo.jordan.excuseme.view.InvisibleActivity$e
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.L$1
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.Object r0 = r0.L$0
            com.araujo.jordan.excuseme.view.InvisibleActivity r0 = (com.araujo.jordan.excuseme.view.InvisibleActivity) r0
            p297ja.C13332o.m85685b(r6)
            goto L_0x0068
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            p297ja.C13332o.m85685b(r6)
            android.content.Intent r6 = r5.getIntent()
            java.lang.String r2 = "permissions"
            java.lang.String[] r6 = r6.getStringArrayExtra(r2)
            if (r6 == 0) goto L_0x0081
            com.araujo.jordan.excuseme.a$a r2 = com.araujo.jordan.excuseme.C1624a.f1072f
            com.araujo.jordan.excuseme.view.dialog.e r4 = r2.mo19237f()
            boolean r4 = r4.mo19247e()
            if (r4 == 0) goto L_0x0070
            com.araujo.jordan.excuseme.view.dialog.e r2 = r2.mo19237f()
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r0 = r2.mo19250h(r5, r0)
            if (r0 != r1) goto L_0x0065
            return r1
        L_0x0065:
            r1 = r6
            r6 = r0
            r0 = r5
        L_0x0068:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r3 = r6.booleanValue()
            r6 = r1
            goto L_0x0071
        L_0x0070:
            r0 = r5
        L_0x0071:
            com.araujo.jordan.excuseme.a$a r1 = com.araujo.jordan.excuseme.C1624a.f1072f
            r1.mo19233b()
            if (r3 == 0) goto L_0x007e
            int r1 = r0.f1075d
            androidx.core.app.ActivityCompat.requestPermissions(r0, r6, r1)
            goto L_0x0081
        L_0x007e:
            r0.finish()
        L_0x0081:
            ja.u r6 = p297ja.C13339u.f61331a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.araujo.jordan.excuseme.view.InvisibleActivity.mo19243L1(kotlin.coroutines.d):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f1076f == i) {
            C15561w1 unused = C15473j.m94492d(C15482l0.m94502a(C15186a1.m93731c().mo74507o()), (C13640g) null, (C15486m0) null, new C1629a(this, (C13635d) null), 3, (Object) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(16);
        C15561w1 unused = C15473j.m94492d(C15482l0.m94502a(C15186a1.m93731c().mo74507o()), (C13640g) null, (C15486m0) null, new C1630b(this, (C13635d) null), 3, (Object) null);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C13706o.m87930g(strArr, "permissions");
        C13706o.m87930g(iArr, "grantResults");
        C15561w1 unused = C15473j.m94492d(C15482l0.m94502a(C15186a1.m93731c().mo74507o()), (C13640g) null, (C15486m0) null, new C1631c(this, (C13635d) null), 3, (Object) null);
    }
}
