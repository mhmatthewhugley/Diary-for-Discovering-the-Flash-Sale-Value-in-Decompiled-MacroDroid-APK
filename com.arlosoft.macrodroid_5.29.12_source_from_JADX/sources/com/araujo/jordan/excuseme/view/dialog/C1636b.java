package com.araujo.jordan.excuseme.view.dialog;

import androidx.appcompat.app.AlertDialog;
import com.araujo.jordan.excuseme.view.InvisibleActivity;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13654b;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15482l0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.channels.C15221f;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0004R$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u0016\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, mo71668d2 = {"Lcom/araujo/jordan/excuseme/view/dialog/b;", "", "Lcom/araujo/jordan/excuseme/view/InvisibleActivity;", "act", "", "h", "(Lcom/araujo/jordan/excuseme/view/InvisibleActivity;Lkotlin/coroutines/d;)Ljava/lang/Object;", "chanelAns", "Lja/u;", "b", "", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "title", "d", "setReason", "reason", "Lkotlinx/coroutines/channels/f;", "c", "Lkotlinx/coroutines/channels/f;", "channel", "Landroidx/appcompat/app/AlertDialog;", "Landroidx/appcompat/app/AlertDialog;", "()Landroidx/appcompat/app/AlertDialog;", "g", "(Landroidx/appcompat/app/AlertDialog;)V", "alertDialog", "e", "Z", "()Z", "showDialog", "<init>", "(Z)V", "excuseme_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: com.araujo.jordan.excuseme.view.dialog.b */
/* compiled from: ExcuseMeDialog.kt */
public class C1636b {

    /* renamed from: a */
    private String f1084a;

    /* renamed from: b */
    private String f1085b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C15221f<Boolean> f1086c;

    /* renamed from: d */
    private AlertDialog f1087d;

    /* renamed from: e */
    private final boolean f1088e;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"Lkotlinx/coroutines/k0;", "Lja/u;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    @C13658f(mo71893c = "com.araujo.jordan.excuseme.view.dialog.ExcuseMeDialog$channelAns$1", mo71894f = "ExcuseMeDialog.kt", mo71895l = {63}, mo71896m = "invokeSuspend")
    /* renamed from: com.araujo.jordan.excuseme.view.dialog.b$a */
    /* compiled from: ExcuseMeDialog.kt */
    static final class C1637a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ boolean $chanelAns;
        Object L$0;
        int label;

        /* renamed from: p$ */
        private C15478k0 f1089p$;
        final /* synthetic */ C1636b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1637a(C1636b bVar, boolean z, C13635d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
            this.$chanelAns = z;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            C13706o.m87930g(dVar, "completion");
            C1637a aVar = new C1637a(this.this$0, this.$chanelAns, dVar);
            aVar.f1089p$ = (C15478k0) obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C1637a) create(obj, (C13635d) obj2)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C15478k0 k0Var = this.f1089p$;
                C15221f a = this.this$0.f1086c;
                if (a != null) {
                    Boolean a2 = C13654b.m87833a(this.$chanelAns);
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
            AlertDialog c2 = this.this$0.mo19245c();
            if (c2 != null) {
                c2.dismiss();
            }
            this.this$0.mo19249g((AlertDialog) null);
            return C13339u.f61331a;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H@"}, mo71668d2 = {"Lcom/araujo/jordan/excuseme/view/InvisibleActivity;", "act", "Lkotlin/coroutines/d;", "", "continuation", "", "showDialogForPermission"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    @C13658f(mo71893c = "com.araujo.jordan.excuseme.view.dialog.ExcuseMeDialog", mo71894f = "ExcuseMeDialog.kt", mo71895l = {55}, mo71896m = "showDialogForPermission$suspendImpl")
    /* renamed from: com.araujo.jordan.excuseme.view.dialog.b$b */
    /* compiled from: ExcuseMeDialog.kt */
    static final class C1638b extends C13656d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ C1636b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1638b(C1636b bVar, C13635d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C1636b.m937i(this.this$0, (InvisibleActivity) null, this);
        }
    }

    public C1636b(boolean z) {
        this.f1088e = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object m937i(com.araujo.jordan.excuseme.view.dialog.C1636b r6, com.araujo.jordan.excuseme.view.InvisibleActivity r7, kotlin.coroutines.C13635d r8) {
        /*
            boolean r0 = r8 instanceof com.araujo.jordan.excuseme.view.dialog.C1636b.C1638b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.araujo.jordan.excuseme.view.dialog.b$b r0 = (com.araujo.jordan.excuseme.view.dialog.C1636b.C1638b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.araujo.jordan.excuseme.view.dialog.b$b r0 = new com.araujo.jordan.excuseme.view.dialog.b$b
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r5) goto L_0x0033
            java.lang.Object r6 = r0.L$1
            com.araujo.jordan.excuseme.view.InvisibleActivity r6 = (com.araujo.jordan.excuseme.view.InvisibleActivity) r6
            java.lang.Object r6 = r0.L$0
            com.araujo.jordan.excuseme.view.dialog.b r6 = (com.araujo.jordan.excuseme.view.dialog.C1636b) r6
            p297ja.C13332o.m85685b(r8)
            goto L_0x0059
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            p297ja.C13332o.m85685b(r8)
            kotlinx.coroutines.channels.f<java.lang.Boolean> r8 = r6.f1086c
            if (r8 != 0) goto L_0x0048
            kotlinx.coroutines.channels.f r8 = kotlinx.coroutines.channels.C15225i.m93851c(r4, r5, r3)
            r6.f1086c = r8
        L_0x0048:
            kotlinx.coroutines.channels.f<java.lang.Boolean> r8 = r6.f1086c
            if (r8 == 0) goto L_0x0061
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r5
            java.lang.Object r8 = r8.mo74538o(r0)
            if (r8 != r1) goto L_0x0059
            return r1
        L_0x0059:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            if (r8 == 0) goto L_0x0061
            boolean r4 = r8.booleanValue()
        L_0x0061:
            r6.f1086c = r3
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.C13654b.m87833a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.araujo.jordan.excuseme.view.dialog.C1636b.m937i(com.araujo.jordan.excuseme.view.dialog.b, com.araujo.jordan.excuseme.view.InvisibleActivity, kotlin.coroutines.d):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo19244b(boolean z) {
        C15561w1 unused = C15473j.m94492d(C15482l0.m94502a(C15186a1.m93731c().mo74507o()), (C13640g) null, (C15486m0) null, new C1637a(this, z, (C13635d) null), 3, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final AlertDialog mo19245c() {
        return this.f1087d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo19246d() {
        return this.f1085b;
    }

    /* renamed from: e */
    public final boolean mo19247e() {
        return this.f1088e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo19248f() {
        return this.f1084a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo19249g(AlertDialog alertDialog) {
        this.f1087d = alertDialog;
    }

    /* renamed from: h */
    public Object mo19250h(InvisibleActivity invisibleActivity, C13635d<? super Boolean> dVar) {
        return m937i(this, invisibleActivity, dVar);
    }
}
