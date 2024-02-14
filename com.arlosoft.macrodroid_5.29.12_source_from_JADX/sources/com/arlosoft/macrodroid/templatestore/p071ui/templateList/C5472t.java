package com.arlosoft.macrodroid.templatestore.p071ui.templateList;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.lottie.C1492k;
import com.airbnb.lottie.LottieAnimationView;
import com.arlosoft.macrodroid.C17523R$anim;
import com.arlosoft.macrodroid.C17527R$bool;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.database.room.C4407l;
import com.arlosoft.macrodroid.database.room.C4443v;
import com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase;
import com.arlosoft.macrodroid.extensions.C4656c;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.templatestore.model.MacroTemplate;
import com.arlosoft.macrodroid.templatestore.p071ui.C5275b;
import com.arlosoft.macrodroid.templatestore.p071ui.C5314g;
import com.arlosoft.macrodroid.templatestore.p071ui.TemplateStoreFragment;
import com.arlosoft.macrodroid.templatestore.p071ui.comments.C5295g;
import com.arlosoft.macrodroid.templatestore.p071ui.comments.TemplateCommentsActivity;
import com.arlosoft.macrodroid.templatestore.p071ui.profile.C5331h;
import com.arlosoft.macrodroid.templatestore.p071ui.templateList.presenter.C5457s;
import com.arlosoft.macrodroid.templatestore.p071ui.user.C5527g;
import com.arlosoft.macrodroid.upgrade.UpgradeActivity2;
import com.google.android.material.snackbar.SnackbarAnimate;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13704m;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import p012b0.C1398b;
import p048t.C2097e;
import p058a3.C2227a;
import p078d3.C7245d;
import p148q0.C8151a;
import p154r0.C8184d;
import p176v0.C10312a;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16269p;
import p370qa.C16270q;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.t */
/* compiled from: TemplateListFragment.kt */
public final class C5472t extends C8184d implements C5489v, C5314g {

    /* renamed from: K */
    public static final C5473a f13410K = new C5473a((C13695i) null);

    /* renamed from: A */
    public C7245d f13411A;

    /* renamed from: B */
    public MacroDroidRoomDatabase f13412B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C5431j f13413C;

    /* renamed from: D */
    private int f13414D;

    /* renamed from: E */
    private int f13415E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public AppCompatDialog f13416F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public AppCompatDialog f13417G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public boolean f13418H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public boolean f13419I;

    /* renamed from: J */
    public Map<Integer, View> f13420J = new LinkedHashMap();

    /* renamed from: d */
    public C5457s f13421d;

    /* renamed from: f */
    public C5331h f13422f;

    /* renamed from: g */
    public C5410a f13423g;

    /* renamed from: o */
    public C5527g f13424o;

    /* renamed from: p */
    public C2227a f13425p;

    /* renamed from: s */
    public C5295g f13426s;

    /* renamed from: z */
    public C10312a f13427z;

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.t$a */
    /* compiled from: TemplateListFragment.kt */
    public static final class C5473a {
        private C5473a() {
        }

        public /* synthetic */ C5473a(C13695i iVar) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C5472t m21072b(C5473a aVar, int i, int i2, boolean z, boolean z2, boolean z3, int i3, Object obj) {
            return aVar.mo30708a(i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? true : z, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? false : z3);
        }

        /* renamed from: a */
        public final C5472t mo30708a(int i, int i2, boolean z, boolean z2, boolean z3) {
            C5472t tVar = new C5472t();
            Bundle bundle = new Bundle(1);
            bundle.putInt("orderBy", i);
            bundle.putInt("userId", i2);
            bundle.putBoolean("showReportCount", z2);
            bundle.putBoolean("swipeRefresh", z);
            bundle.putBoolean("hideZeroReports", z3);
            tVar.setArguments(bundle);
            return tVar;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.t$b */
    /* compiled from: TemplateListFragment.kt */
    static final class C5474b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C7245d $translationHelperToPass;
        Object L$0;
        int label;
        final /* synthetic */ C5472t this$0;

        /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.t$b$a */
        /* compiled from: TemplateListFragment.kt */
        static final class C5475a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ List<C4407l> $macroSubscriptions;
            final /* synthetic */ C7245d $translationHelperToPass;
            final /* synthetic */ List<C4443v> $userSubscriptions;
            int label;
            final /* synthetic */ C5472t this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5475a(C5472t tVar, C7245d dVar, List<C4407l> list, List<C4443v> list2, C13635d<? super C5475a> dVar2) {
                super(2, dVar2);
                this.this$0 = tVar;
                this.$translationHelperToPass = dVar;
                this.$macroSubscriptions = list;
                this.$userSubscriptions = list2;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C5475a(this.this$0, this.$translationHelperToPass, this.$macroSubscriptions, this.$userSubscriptions, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C5475a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    C5472t tVar = this.this$0;
                    tVar.f13413C = new C5431j(tVar.mo30701u0(), this.this$0.mo30703v0(), this.this$0.mo30698s0(), this.this$0.mo30675D0(), this.this$0.mo30695r0(), C5163j2.m20185j2(this.this$0.requireContext()), this.this$0.f13418H, this.this$0.f13419I, this.$translationHelperToPass, this.$macroSubscriptions, this.$userSubscriptions);
                    RecyclerView recyclerView = (RecyclerView) this.this$0.mo30687i0(C17532R$id.updatesList);
                    C5431j j0 = this.this$0.f13413C;
                    if (j0 == null) {
                        C13706o.m87945v("adapter");
                        j0 = null;
                    }
                    recyclerView.setAdapter(j0);
                    C5457s.m20941Y(this.this$0.mo30701u0(), false, 1, (Object) null);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5474b(C5472t tVar, C7245d dVar, C13635d<? super C5474b> dVar2) {
            super(2, dVar2);
            this.this$0 = tVar;
            this.$translationHelperToPass = dVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5474b(this.this$0, this.$translationHelperToPass, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5474b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0057 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r1 = r9.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x002a
                if (r1 == r4) goto L_0x0026
                if (r1 == r3) goto L_0x001d
                if (r1 != r2) goto L_0x0015
                p297ja.C13332o.m85685b(r10)
                goto L_0x0076
            L_0x0015:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x001d:
                java.lang.Object r1 = r9.L$0
                java.util.List r1 = (java.util.List) r1
                p297ja.C13332o.m85685b(r10)
            L_0x0024:
                r6 = r1
                goto L_0x0058
            L_0x0026:
                p297ja.C13332o.m85685b(r10)
                goto L_0x0040
            L_0x002a:
                p297ja.C13332o.m85685b(r10)
                com.arlosoft.macrodroid.templatestore.ui.templateList.t r10 = r9.this$0
                com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase r10 = r10.mo30707y0()
                com.arlosoft.macrodroid.database.room.m r10 = r10.mo28679e()
                r9.label = r4
                java.lang.Object r10 = r10.mo28744d(r9)
                if (r10 != r0) goto L_0x0040
                return r0
            L_0x0040:
                r1 = r10
                java.util.List r1 = (java.util.List) r1
                com.arlosoft.macrodroid.templatestore.ui.templateList.t r10 = r9.this$0
                com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase r10 = r10.mo30707y0()
                com.arlosoft.macrodroid.database.room.w r10 = r10.mo28682h()
                r9.L$0 = r1
                r9.label = r3
                java.lang.Object r10 = r10.mo28802c(r9)
                if (r10 != r0) goto L_0x0024
                return r0
            L_0x0058:
                r7 = r10
                java.util.List r7 = (java.util.List) r7
                kotlinx.coroutines.h2 r10 = kotlinx.coroutines.C15186a1.m93731c()
                com.arlosoft.macrodroid.templatestore.ui.templateList.t$b$a r1 = new com.arlosoft.macrodroid.templatestore.ui.templateList.t$b$a
                com.arlosoft.macrodroid.templatestore.ui.templateList.t r4 = r9.this$0
                d3.d r5 = r9.$translationHelperToPass
                r8 = 0
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r8)
                r3 = 0
                r9.L$0 = r3
                r9.label = r2
                java.lang.Object r10 = kotlinx.coroutines.C15414h.m94298g(r10, r1, r9)
                if (r10 != r0) goto L_0x0076
                return r0
            L_0x0076:
                ja.u r10 = p297ja.C13339u.f61331a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.templatestore.p071ui.templateList.C5472t.C5474b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.t$c */
    /* compiled from: TemplateListFragment.kt */
    static final class C5476c extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ C5472t this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5476c(C5472t tVar, C13635d<? super C5476c> dVar) {
            super(3, dVar);
            this.this$0 = tVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5476c(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C5457s.m20941Y(this.this$0.mo30701u0(), false, 1, (Object) null);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.t$d */
    /* compiled from: TemplateListFragment.kt */
    static final class C5477d extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ C5472t this$0;

        /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.t$d$a */
        /* compiled from: TemplateListFragment.kt */
        static final class C5478a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ List<C4407l> $macroSubscriptions;
            final /* synthetic */ List<C4443v> $userSubscriptions;
            int label;
            final /* synthetic */ C5472t this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5478a(C5472t tVar, List<C4407l> list, List<C4443v> list2, C13635d<? super C5478a> dVar) {
                super(2, dVar);
                this.this$0 = tVar;
                this.$macroSubscriptions = list;
                this.$userSubscriptions = list2;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C5478a(this.this$0, this.$macroSubscriptions, this.$userSubscriptions, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C5478a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    C5431j j0 = this.this$0.f13413C;
                    C5431j jVar = null;
                    if (j0 == null) {
                        C13706o.m87945v("adapter");
                        j0 = null;
                    }
                    j0.mo30634D(this.$macroSubscriptions);
                    C5431j j02 = this.this$0.f13413C;
                    if (j02 == null) {
                        C13706o.m87945v("adapter");
                        j02 = null;
                    }
                    j02.mo30635E(this.$userSubscriptions);
                    C5431j j03 = this.this$0.f13413C;
                    if (j03 == null) {
                        C13706o.m87945v("adapter");
                    } else {
                        jVar = j03;
                    }
                    jVar.notifyDataSetChanged();
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5477d(C5472t tVar, C13635d<? super C5477d> dVar) {
            super(2, dVar);
            this.this$0 = tVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5477d(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5477d) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x006f A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r1 = r7.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0029
                if (r1 == r4) goto L_0x0025
                if (r1 == r3) goto L_0x001d
                if (r1 != r2) goto L_0x0015
                p297ja.C13332o.m85685b(r8)
                goto L_0x0070
            L_0x0015:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x001d:
                java.lang.Object r1 = r7.L$0
                java.util.List r1 = (java.util.List) r1
                p297ja.C13332o.m85685b(r8)
                goto L_0x0057
            L_0x0025:
                p297ja.C13332o.m85685b(r8)
                goto L_0x003f
            L_0x0029:
                p297ja.C13332o.m85685b(r8)
                com.arlosoft.macrodroid.templatestore.ui.templateList.t r8 = r7.this$0
                com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase r8 = r8.mo30707y0()
                com.arlosoft.macrodroid.database.room.m r8 = r8.mo28679e()
                r7.label = r4
                java.lang.Object r8 = r8.mo28744d(r7)
                if (r8 != r0) goto L_0x003f
                return r0
            L_0x003f:
                r1 = r8
                java.util.List r1 = (java.util.List) r1
                com.arlosoft.macrodroid.templatestore.ui.templateList.t r8 = r7.this$0
                com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase r8 = r8.mo30707y0()
                com.arlosoft.macrodroid.database.room.w r8 = r8.mo28682h()
                r7.L$0 = r1
                r7.label = r3
                java.lang.Object r8 = r8.mo28802c(r7)
                if (r8 != r0) goto L_0x0057
                return r0
            L_0x0057:
                java.util.List r8 = (java.util.List) r8
                kotlinx.coroutines.h2 r3 = kotlinx.coroutines.C15186a1.m93731c()
                com.arlosoft.macrodroid.templatestore.ui.templateList.t$d$a r4 = new com.arlosoft.macrodroid.templatestore.ui.templateList.t$d$a
                com.arlosoft.macrodroid.templatestore.ui.templateList.t r5 = r7.this$0
                r6 = 0
                r4.<init>(r5, r1, r8, r6)
                r7.L$0 = r6
                r7.label = r2
                java.lang.Object r8 = kotlinx.coroutines.C15414h.m94298g(r3, r4, r7)
                if (r8 != r0) goto L_0x0070
                return r0
            L_0x0070:
                ja.u r8 = p297ja.C13339u.f61331a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.templatestore.p071ui.templateList.C5472t.C5477d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.t$e */
    /* compiled from: TemplateListFragment.kt */
    /* synthetic */ class C5479e extends C13704m implements C16269p<MacroTemplate, String, C13339u> {
        C5479e(Object obj) {
            super(2, obj, C5457s.class, "updateMacroDescription", "updateMacroDescription(Lcom/arlosoft/macrodroid/templatestore/model/MacroTemplate;Ljava/lang/String;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo30714l((MacroTemplate) obj, (String) obj2);
            return C13339u.f61331a;
        }

        /* renamed from: l */
        public final void mo30714l(MacroTemplate macroTemplate, String str) {
            C13706o.m87929f(macroTemplate, "p0");
            C13706o.m87929f(str, "p1");
            ((C5457s) this.receiver).mo30659t0(macroTemplate, str);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.t$f */
    /* compiled from: TemplateListFragment.kt */
    /* synthetic */ class C5480f extends C13704m implements C16269p<MacroTemplate, String, C13339u> {
        C5480f(Object obj) {
            super(2, obj, C5457s.class, "updateMacroName", "updateMacroName(Lcom/arlosoft/macrodroid/templatestore/model/MacroTemplate;Ljava/lang/String;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo30715l((MacroTemplate) obj, (String) obj2);
            return C13339u.f61331a;
        }

        /* renamed from: l */
        public final void mo30715l(MacroTemplate macroTemplate, String str) {
            C13706o.m87929f(macroTemplate, "p0");
            C13706o.m87929f(str, "p1");
            ((C5457s) this.receiver).mo30660w0(macroTemplate, str);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.t$g */
    /* compiled from: TemplateListFragment.kt */
    static final class C5481g extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ EditText $descriptionText;
        final /* synthetic */ MacroTemplate $macroTemplate;
        final /* synthetic */ C16269p<MacroTemplate, String, Object> $presenterMethod;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5481g(C16269p<? super MacroTemplate, ? super String, ? extends Object> pVar, MacroTemplate macroTemplate, EditText editText, C13635d<? super C5481g> dVar) {
            super(3, dVar);
            this.$presenterMethod = pVar;
            this.$macroTemplate = macroTemplate;
            this.$descriptionText = editText;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5481g(this.$presenterMethod, this.$macroTemplate, this.$descriptionText, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C16269p<MacroTemplate, String, Object> pVar = this.$presenterMethod;
                MacroTemplate macroTemplate = this.$macroTemplate;
                EditText editText = this.$descriptionText;
                pVar.invoke(macroTemplate, String.valueOf(editText != null ? editText.getText() : null));
                EditText editText2 = this.$descriptionText;
                if (editText2 != null) {
                    C4666m.m18144l(editText2);
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.t$h */
    /* compiled from: TemplateListFragment.kt */
    static final class C5482h extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ C5472t this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5482h(C5472t tVar, C13635d<? super C5482h> dVar) {
            super(3, dVar);
            this.this$0 = tVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5482h(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                AppCompatDialog p0 = this.this$0.f13416F;
                if (p0 != null) {
                    p0.dismiss();
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.t$i */
    /* compiled from: TemplateListFragment.kt */
    static final class C5483i extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5483i(AppCompatDialog appCompatDialog, C13635d<? super C5483i> dVar) {
            super(3, dVar);
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5483i(this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.$dialog.dismiss();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.t$j */
    /* compiled from: TemplateListFragment.kt */
    static final class C5484j extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5484j(AppCompatDialog appCompatDialog, C13635d<? super C5484j> dVar) {
            super(3, dVar);
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5484j(this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.$dialog.dismiss();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.t$k */
    /* compiled from: TemplateListFragment.kt */
    static final class C5485k extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        final /* synthetic */ String $link;
        int label;
        final /* synthetic */ C5472t this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5485k(C5472t tVar, String str, AppCompatDialog appCompatDialog, C13635d<? super C5485k> dVar) {
            super(3, dVar);
            this.this$0 = tVar;
            this.$link = str;
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5485k(this.this$0, this.$link, this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                FragmentActivity activity = this.this$0.getActivity();
                Context context = null;
                Object systemService = activity != null ? activity.getSystemService("clipboard") : null;
                C13706o.m87927d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) systemService).setText(this.$link);
                FragmentActivity activity2 = this.this$0.getActivity();
                if (activity2 != null) {
                    context = activity2.getApplicationContext();
                }
                C15626c.makeText(context, C17541R$string.link_copied_to_clipboard, 0).show();
                this.$dialog.dismiss();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.t$l */
    /* compiled from: TemplateListFragment.kt */
    static final class C5486l extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ MacroTemplate $macroTemplate;
        int label;
        final /* synthetic */ C5472t this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5486l(C5472t tVar, MacroTemplate macroTemplate, C13635d<? super C5486l> dVar) {
            super(3, dVar);
            this.this$0 = tVar;
            this.$macroTemplate = macroTemplate;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5486l(this.this$0, this.$macroTemplate, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            int i;
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                AppCompatDialog n0 = this.this$0.f13417G;
                Editable editable = null;
                EditText editText = n0 != null ? (EditText) n0.findViewById(C17532R$id.justificationText) : null;
                AppCompatDialog n02 = this.this$0.f13417G;
                RadioGroup radioGroup = n02 != null ? (RadioGroup) n02.findViewById(C17532R$id.radioGroup) : null;
                if (radioGroup != null) {
                    AppCompatDialog n03 = this.this$0.f13417G;
                    i = radioGroup.indexOfChild(n03 != null ? n03.findViewById(radioGroup.getCheckedRadioButtonId()) : null);
                } else {
                    i = 0;
                }
                if (editText != null) {
                    editable = editText.getText();
                }
                String valueOf = String.valueOf(editable);
                if (editText != null) {
                    C4666m.m18144l(editText);
                }
                this.this$0.mo30701u0().mo30655g0(this.$macroTemplate, i, valueOf);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.t$m */
    /* compiled from: TemplateListFragment.kt */
    static final class C5487m extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ C5472t this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5487m(C5472t tVar, C13635d<? super C5487m> dVar) {
            super(3, dVar);
            this.this$0 = tVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5487m(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                AppCompatDialog n0 = this.this$0.f13417G;
                if (n0 != null) {
                    n0.dismiss();
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E0 */
    public static final void m21002E0(C5472t tVar) {
        C13706o.m87929f(tVar, "this$0");
        tVar.mo30701u0().mo30654e0();
    }

    /* access modifiers changed from: private */
    /* renamed from: F0 */
    public static final ColorFilter m21003F0(C1398b bVar) {
        return new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
    }

    /* renamed from: G0 */
    private final void m21004G0(MacroTemplate macroTemplate) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity(), C17542R$style.Theme_App_Dialog_Template);
        builder.setTitle((int) C17541R$string.template_store_block_macro);
        C13696i0 i0Var = C13696i0.f61931a;
        String string = getString(C17541R$string.template_store_block_macro_description);
        C13706o.m87928e(string, "getString(R.string.templ…_block_macro_description)");
        String format = String.format(string, Arrays.copyOf(new Object[]{macroTemplate.getUsername()}, 1));
        C13706o.m87928e(format, "format(format, *args)");
        builder.setMessage((CharSequence) format);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C5434l(this, macroTemplate));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: H0 */
    public static final void m21005H0(C5472t tVar, MacroTemplate macroTemplate, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(tVar, "this$0");
        C13706o.m87929f(macroTemplate, "$macroTemplate");
        tVar.mo30701u0().mo30645S(macroTemplate.getId(), macroTemplate.getName());
    }

    /* renamed from: I0 */
    private final void m21006I0(MacroTemplate macroTemplate) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity(), C17542R$style.Theme_App_Dialog_Template);
        builder.setTitle((int) C17541R$string.template_store_block_user);
        C13696i0 i0Var = C13696i0.f61931a;
        String string = getString(C17541R$string.template_store_block_user_description_with_username);
        C13706o.m87928e(string, "getString(R.string.templ…escription_with_username)");
        String format = String.format(string, Arrays.copyOf(new Object[]{macroTemplate.getUsername()}, 1));
        C13706o.m87928e(format, "format(format, *args)");
        builder.setMessage((CharSequence) format);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C5433k(this, macroTemplate));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: J0 */
    public static final void m21007J0(C5472t tVar, MacroTemplate macroTemplate, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(tVar, "this$0");
        C13706o.m87929f(macroTemplate, "$macroTemplate");
        tVar.mo30701u0().mo30646T(macroTemplate.getUserId(), macroTemplate.getUsername());
    }

    /* access modifiers changed from: private */
    /* renamed from: K0 */
    public static final void m21008K0(C5472t tVar, MacroTemplate macroTemplate, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(tVar, "this$0");
        C13706o.m87929f(macroTemplate, "$macroTemplate");
        tVar.mo30701u0().mo30647U(macroTemplate);
    }

    /* renamed from: L0 */
    private final void m21009L0(MacroTemplate macroTemplate, String str, String str2, C16269p<? super MacroTemplate, ? super String, ? extends Object> pVar) {
        Button button;
        Button button2;
        AppCompatDialog appCompatDialog = new AppCompatDialog(requireActivity(), C17542R$style.Theme_App_Dialog_Template);
        this.f13416F = appCompatDialog;
        appCompatDialog.setCancelable(false);
        AppCompatDialog appCompatDialog2 = this.f13416F;
        if (appCompatDialog2 != null) {
            appCompatDialog2.setContentView((int) C17535R$layout.dialog_update_macro_text);
        }
        AppCompatDialog appCompatDialog3 = this.f13416F;
        if (appCompatDialog3 != null) {
            appCompatDialog3.setCanceledOnTouchOutside(false);
        }
        AppCompatDialog appCompatDialog4 = this.f13416F;
        if (appCompatDialog4 != null) {
            appCompatDialog4.setTitle((CharSequence) str);
        }
        AppCompatDialog appCompatDialog5 = this.f13416F;
        Window window = null;
        EditText editText = appCompatDialog5 != null ? (EditText) appCompatDialog5.findViewById(C17532R$id.commentText) : null;
        if (editText != null) {
            editText.setHint(getString(C17541R$string.enter_text));
        }
        if (editText != null) {
            editText.setText(str2);
        }
        if (editText != null) {
            C4666m.m18154v(editText);
        }
        AppCompatDialog appCompatDialog6 = this.f13416F;
        if (!(appCompatDialog6 == null || (button2 = (Button) appCompatDialog6.findViewById(C17532R$id.okButton)) == null)) {
            C4666m.m18147o(button2, (C13640g) null, new C5481g(pVar, macroTemplate, editText, (C13635d<? super C5481g>) null), 1, (Object) null);
        }
        AppCompatDialog appCompatDialog7 = this.f13416F;
        if (!(appCompatDialog7 == null || (button = (Button) appCompatDialog7.findViewById(C17532R$id.cancelButton)) == null)) {
            C4666m.m18147o(button, (C13640g) null, new C5482h(this, (C13635d<? super C5482h>) null), 1, (Object) null);
        }
        AppCompatDialog appCompatDialog8 = this.f13416F;
        if (appCompatDialog8 != null) {
            appCompatDialog8.setCancelable(true);
        }
        AppCompatDialog appCompatDialog9 = this.f13416F;
        if (appCompatDialog9 != null) {
            C4656c.m18114c(appCompatDialog9, getResources().getDimensionPixelSize(C17529R$dimen.margin_medium));
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        AppCompatDialog appCompatDialog10 = this.f13416F;
        Window window2 = appCompatDialog10 != null ? appCompatDialog10.getWindow() : null;
        C13706o.m87926c(window2);
        layoutParams.copyFrom(window2.getAttributes());
        layoutParams.width = Resources.getSystem().getDisplayMetrics().widthPixels - (getResources().getDimensionPixelSize(C17529R$dimen.margin_medium) * 2);
        AppCompatDialog appCompatDialog11 = this.f13416F;
        if (appCompatDialog11 != null) {
            window = appCompatDialog11.getWindow();
        }
        C13706o.m87926c(window);
        window.setAttributes(layoutParams);
        AppCompatDialog appCompatDialog12 = this.f13416F;
        if (appCompatDialog12 != null) {
            appCompatDialog12.show();
        }
    }

    /* renamed from: N0 */
    private final void m21010N0(MacroTemplate macroTemplate) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(requireActivity(), C17542R$style.Theme_App_Dialog_Template);
        appCompatDialog.setContentView((int) C17535R$layout.dialog_template_link);
        appCompatDialog.setTitle((CharSequence) macroTemplate.getName());
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = appCompatDialog.getWindow();
        layoutParams.copyFrom(window != null ? window.getAttributes() : null);
        layoutParams.width = -1;
        Window window2 = appCompatDialog.getWindow();
        if (window2 != null) {
            window2.setAttributes(layoutParams);
        }
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.copyButton);
        TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.dialog_template_link_text);
        String str = "https://www.macrodroidlink.com/macrostore?id=" + macroTemplate.getId();
        if (textView != null) {
            textView.setText(str);
        }
        if (button != null) {
            C4666m.m18147o(button, (C13640g) null, new C5483i(appCompatDialog, (C13635d<? super C5483i>) null), 1, (Object) null);
        }
        if (button2 != null) {
            C4666m.m18147o(button2, (C13640g) null, new C5484j(appCompatDialog, (C13635d<? super C5484j>) null), 1, (Object) null);
        }
        if (button3 != null) {
            C4666m.m18147o(button3, (C13640g) null, new C5485k(this, str, appCompatDialog, (C13635d<? super C5485k>) null), 1, (Object) null);
        }
        appCompatDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: O0 */
    public static final void m21011O0(String[] strArr, C5472t tVar, MacroTemplate macroTemplate, String str, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(strArr, "$options");
        C13706o.m87929f(tVar, "this$0");
        C13706o.m87929f(macroTemplate, "$macroTemplate");
        C13706o.m87929f(str, "$editMacroString");
        String str2 = strArr[i];
        C13706o.m87928e(str2, "options[index]");
        if (C13706o.m87924a(str2, tVar.getString(C17541R$string.edit_name))) {
            tVar.mo30701u0().mo30652c0(macroTemplate);
        } else if (C13706o.m87924a(str2, tVar.getString(C17541R$string.template_store_block_macro))) {
            tVar.m21004G0(macroTemplate);
        } else if (C13706o.m87924a(str2, tVar.getString(C17541R$string.template_store_block_user))) {
            tVar.m21006I0(macroTemplate);
        } else if (C13706o.m87924a(str2, tVar.getString(C17541R$string.edit_description))) {
            tVar.mo30701u0().mo30650a0(macroTemplate);
        } else if (C13706o.m87924a(str2, str)) {
            tVar.mo30701u0().mo30651b0(macroTemplate);
        } else if (C13706o.m87924a(str2, tVar.getString(C17541R$string.delete))) {
            tVar.mo30701u0().mo30649Z(macroTemplate);
        } else if (C13706o.m87924a(str2, tVar.getString(C17541R$string.report_macro))) {
            tVar.mo30701u0().mo30653d0(macroTemplate);
        } else if (C13706o.m87924a(str2, tVar.getString(C17541R$string.get_macro_link))) {
            tVar.m21010N0(macroTemplate);
        } else if (C13706o.m87924a(str2, tVar.getString(C17541R$string.template_store_moderator_options))) {
            tVar.mo30671A0().mo40930e(macroTemplate);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P0 */
    public static final void m21012P0(C5472t tVar, View view) {
        C13706o.m87929f(tVar, "this$0");
        tVar.m21017U0();
    }

    /* renamed from: Q0 */
    private final void m21013Q0(String str, int i, View view) {
        SnackbarAnimate i2 = SnackbarAnimate.m69574i(view, str, 0);
        C13706o.m87928e(i2, "make(parentView, text, S…ckbarAnimate.LENGTH_LONG)");
        i2.mo58921e().setBackgroundResource(i);
        View findViewById = i2.mo58921e().findViewById(2131363815);
        C13706o.m87927d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setTextColor(-1);
        View findViewById2 = i2.mo58921e().findViewById(2131363814);
        C13706o.m87927d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById2).setTextColor(-1);
        i2.mo58932r();
    }

    /* renamed from: R0 */
    static /* synthetic */ void m21014R0(C5472t tVar, String str, int i, View view, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            view = tVar.requireView();
            C13706o.m87928e(view, "requireView()");
        }
        tVar.m21013Q0(str, i, view);
    }

    /* access modifiers changed from: private */
    /* renamed from: S0 */
    public static final void m21015S0(C5472t tVar, View view) {
        C13706o.m87929f(tVar, "this$0");
        tVar.requireActivity().startActivity(new Intent(tVar.getActivity(), UpgradeActivity2.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: T0 */
    public static final void m21016T0(C5472t tVar, View view) {
        C13706o.m87929f(tVar, "this$0");
        tVar.m21017U0();
    }

    /* renamed from: U0 */
    private final void m21017U0() {
        if (getParentFragment() != null) {
            Fragment parentFragment = getParentFragment();
            C13706o.m87927d(parentFragment, "null cannot be cast to non-null type com.arlosoft.macrodroid.templatestore.ui.TemplateStoreFragment");
            ((TemplateStoreFragment) parentFragment).mo30409N0();
            return;
        }
        C8151a.m33873n(new RuntimeException("Could not sign in - parent fragment is null"));
    }

    /* renamed from: A */
    public void mo30670A(MacroTemplate macroTemplate, boolean z, boolean z2) {
        String[] strArr;
        C13706o.m87929f(macroTemplate, "macroTemplate");
        String string = getString(C17541R$string.edit_macro);
        C13706o.m87928e(string, "getString(R.string.edit_macro)");
        String lowerCase = string.toLowerCase(Locale.ROOT);
        C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String p = C15176v.m93635p(lowerCase);
        if (z) {
            strArr = new String[]{getString(C17541R$string.edit_name), getString(C17541R$string.edit_description), p, getString(C17541R$string.delete), getString(C17541R$string.get_macro_link)};
        } else {
            strArr = z2 ? new String[]{getString(C17541R$string.report_macro), getString(C17541R$string.template_store_block_macro), getString(C17541R$string.template_store_block_user), getString(C17541R$string.get_macro_link), getString(C17541R$string.template_store_moderator_options)} : new String[]{getString(C17541R$string.report_macro), getString(C17541R$string.template_store_block_macro), getString(C17541R$string.template_store_block_user), getString(C17541R$string.get_macro_link)};
        }
        new AlertDialog.Builder(requireActivity(), C17542R$style.Theme_App_Dialog_Template).setTitle((CharSequence) macroTemplate.getNameToDisplay()).setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C5436n(strArr, this, macroTemplate, p)).show();
    }

    /* renamed from: A0 */
    public final C10312a mo30671A0() {
        C10312a aVar = this.f13427z;
        if (aVar != null) {
            return aVar;
        }
        C13706o.m87945v("screenLoader");
        return null;
    }

    /* renamed from: B0 */
    public final C5295g mo30672B0() {
        C5295g gVar = this.f13426s;
        if (gVar != null) {
            return gVar;
        }
        C13706o.m87945v("templateCommentsDataRepository");
        return null;
    }

    /* renamed from: B1 */
    public void mo30673B1() {
        RecyclerView recyclerView = (RecyclerView) mo30687i0(C17532R$id.updatesList);
        C13706o.m87928e(recyclerView, "updatesList");
        recyclerView.setVisibility(0);
        LinearLayout linearLayout = (LinearLayout) mo30687i0(C17532R$id.emptyView);
        C13706o.m87928e(linearLayout, "emptyView");
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = (LinearLayout) mo30687i0(C17532R$id.errorView);
        C13706o.m87928e(linearLayout2, "errorView");
        linearLayout2.setVisibility(8);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) mo30687i0(C17532R$id.loadingView);
        C13706o.m87928e(lottieAnimationView, "loadingView");
        lottieAnimationView.setVisibility(8);
        LinearLayout linearLayout3 = (LinearLayout) mo30687i0(C17532R$id.pirateView);
        C13706o.m87928e(linearLayout3, "pirateView");
        linearLayout3.setVisibility(8);
    }

    /* renamed from: C0 */
    public final C7245d mo30674C0() {
        C7245d dVar = this.f13411A;
        if (dVar != null) {
            return dVar;
        }
        C13706o.m87945v("translationHelper");
        return null;
    }

    /* renamed from: D0 */
    public final C5527g mo30675D0() {
        C5527g gVar = this.f13424o;
        if (gVar != null) {
            return gVar;
        }
        C13706o.m87945v("userProvider");
        return null;
    }

    /* renamed from: G */
    public void mo30676G() {
        AppCompatDialog appCompatDialog = this.f13416F;
        View findViewById = appCompatDialog != null ? appCompatDialog.findViewById(2131363679) : null;
        if (findViewById != null) {
            String string = getString(C17541R$string.update_failed);
            C13706o.m87928e(string, "getString(R.string.update_failed)");
            m21013Q0(string, C17528R$color.snack_bar_error, findViewById);
        }
    }

    /* renamed from: J */
    public void mo30677J() {
        LinearLayout linearLayout = (LinearLayout) mo30687i0(C17532R$id.emptyView);
        C13706o.m87928e(linearLayout, "emptyView");
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = (LinearLayout) mo30687i0(C17532R$id.errorView);
        C13706o.m87928e(linearLayout2, "errorView");
        linearLayout2.setVisibility(8);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) mo30687i0(C17532R$id.loadingView);
        C13706o.m87928e(lottieAnimationView, "loadingView");
        lottieAnimationView.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) mo30687i0(C17532R$id.updatesList);
        C13706o.m87928e(recyclerView, "updatesList");
        recyclerView.setVisibility(8);
        LinearLayout linearLayout3 = (LinearLayout) mo30687i0(C17532R$id.pirateView);
        C13706o.m87928e(linearLayout3, "pirateView");
        linearLayout3.setVisibility(0);
    }

    /* renamed from: M0 */
    public void mo30678M0(boolean z) {
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo30687i0(C17532R$id.swipeRefresh);
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(z);
        }
    }

    /* renamed from: R */
    public void mo30501R() {
        ((RecyclerView) mo30687i0(C17532R$id.updatesList)).smoothScrollToPosition(0);
    }

    /* renamed from: T */
    public void mo30679T(boolean z) {
        String string = getString(z ? C17541R$string.macro_name_length_info : C17541R$string.macro_description_length_info);
        C13706o.m87928e(string, "getString(if (isName) {\n…on_length_info\n        })");
        m21014R0(this, string, C17528R$color.snack_bar_error, (View) null, 4, (Object) null);
    }

    /* renamed from: U */
    public void mo26239U() {
        this.f13420J.clear();
    }

    /* renamed from: a */
    public void mo30680a() {
        String string = getString(C17541R$string.template_delete_failed);
        C13706o.m87928e(string, "getString(R.string.template_delete_failed)");
        m21014R0(this, string, C17528R$color.snack_bar_error, (View) null, 4, (Object) null);
    }

    /* renamed from: a1 */
    public void mo30681a1(MacroTemplate macroTemplate) {
        C13706o.m87929f(macroTemplate, "macroTemplate");
        String string = getString(C17541R$string.edit_description);
        C13706o.m87928e(string, "getString(R.string.edit_description)");
        m21009L0(macroTemplate, string, macroTemplate.getDescription(), new C5479e(mo30701u0()));
    }

    /* renamed from: b */
    public void mo30682b(PagedList<MacroTemplate> pagedList) {
        boolean z = false;
        if (pagedList != null && !pagedList.isEmpty()) {
            z = true;
        }
        if (z) {
            C5431j jVar = this.f13413C;
            if (jVar == null) {
                C13706o.m87945v("adapter");
                jVar = null;
            }
            jVar.submitList(pagedList);
        }
    }

    /* renamed from: c0 */
    public void mo30683c0(MacroTemplate macroTemplate) {
        C13706o.m87929f(macroTemplate, "macroTemplate");
        String string = getString(C17541R$string.edit_name);
        C13706o.m87928e(string, "getString(R.string.edit_name)");
        m21009L0(macroTemplate, string, macroTemplate.getName(), new C5480f(mo30701u0()));
    }

    /* renamed from: c1 */
    public void mo30684c1() {
        LinearLayout linearLayout = (LinearLayout) mo30687i0(C17532R$id.emptyView);
        C13706o.m87928e(linearLayout, "emptyView");
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = (LinearLayout) mo30687i0(C17532R$id.errorView);
        C13706o.m87928e(linearLayout2, "errorView");
        linearLayout2.setVisibility(8);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) mo30687i0(C17532R$id.loadingView);
        C13706o.m87928e(lottieAnimationView, "loadingView");
        lottieAnimationView.setVisibility(0);
        RecyclerView recyclerView = (RecyclerView) mo30687i0(C17532R$id.updatesList);
        C13706o.m87928e(recyclerView, "updatesList");
        recyclerView.setVisibility(8);
    }

    /* renamed from: d */
    public void mo30685d() {
        SnackbarAnimate h = SnackbarAnimate.m69573h(requireView(), C17541R$string.template_store_sorry_subsribe_macros_pro_only, SamsungIrisUnlockModule.IRIS_ERROR_NEED_TO_RETRY);
        C13706o.m87928e(h, "make(requireView(), R.st…be_macros_pro_only, 5000)");
        h.mo58921e().setBackgroundResource(2131100690);
        View findViewById = h.mo58921e().findViewById(2131363815);
        C13706o.m87927d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setTextColor(-1);
        View findViewById2 = h.mo58921e().findViewById(2131363814);
        C13706o.m87927d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById2).setTextColor(-1);
        h.mo58926l(C17541R$string.upgrade, new C5438p(this));
        h.mo58932r();
    }

    /* renamed from: h1 */
    public void mo30686h1(MacroTemplate macroTemplate) {
        Button button;
        Button button2;
        C13706o.m87929f(macroTemplate, "macroTemplate");
        AppCompatDialog appCompatDialog = new AppCompatDialog(requireActivity(), C17542R$style.Theme_App_Dialog_Template);
        this.f13417G = appCompatDialog;
        appCompatDialog.setContentView((int) C17535R$layout.dialog_report_template);
        AppCompatDialog appCompatDialog2 = this.f13417G;
        if (appCompatDialog2 != null) {
            appCompatDialog2.setTitle((int) C17541R$string.report_macro);
        }
        AppCompatDialog appCompatDialog3 = this.f13417G;
        if (appCompatDialog3 != null) {
            C4656c.m18114c(appCompatDialog3, getResources().getDimensionPixelSize(C17529R$dimen.margin_medium));
        }
        AppCompatDialog appCompatDialog4 = this.f13417G;
        if (appCompatDialog4 != null) {
            appCompatDialog4.setCanceledOnTouchOutside(false);
        }
        AppCompatDialog appCompatDialog5 = this.f13417G;
        Button button3 = appCompatDialog5 != null ? (Button) appCompatDialog5.findViewById(C17532R$id.okButton) : null;
        if (button3 != null) {
            button3.setText(getString(C17541R$string.report_macro));
        }
        AppCompatDialog appCompatDialog6 = this.f13417G;
        if (!(appCompatDialog6 == null || (button2 = (Button) appCompatDialog6.findViewById(C17532R$id.okButton)) == null)) {
            C4666m.m18147o(button2, (C13640g) null, new C5486l(this, macroTemplate, (C13635d<? super C5486l>) null), 1, (Object) null);
        }
        AppCompatDialog appCompatDialog7 = this.f13417G;
        if (!(appCompatDialog7 == null || (button = (Button) appCompatDialog7.findViewById(C17532R$id.cancelButton)) == null)) {
            C4666m.m18147o(button, (C13640g) null, new C5487m(this, (C13635d<? super C5487m>) null), 1, (Object) null);
        }
        AppCompatDialog appCompatDialog8 = this.f13417G;
        if (appCompatDialog8 != null) {
            appCompatDialog8.show();
        }
    }

    /* renamed from: i0 */
    public View mo30687i0(int i) {
        View findViewById;
        Map<Integer, View> map = this.f13420J;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: l0 */
    public void mo30688l0() {
        C15561w1 unused = C15473j.m94492d(LifecycleOwnerKt.getLifecycleScope(this), C15186a1.m93730b(), (C15486m0) null, new C5474b(this, C13706o.m87924a(C5163j2.m20177i2(requireContext()), Locale.getDefault().getLanguage()) ? mo30674C0() : null, (C13635d<? super C5474b>) null), 2, (Object) null);
    }

    /* renamed from: l1 */
    public void mo30689l1(MacroTemplate macroTemplate) {
        C13706o.m87929f(macroTemplate, "macroTemplate");
        mo30672B0().mo30483b(macroTemplate.clearJsonData());
        TemplateCommentsActivity.C5277a aVar = TemplateCommentsActivity.f13109N;
        Context requireContext = requireContext();
        C13706o.m87928e(requireContext, "requireContext()");
        startActivityForResult(aVar.mo30468a(requireContext), 101);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.overridePendingTransition(C17523R$anim.up_from_bottom, C17523R$anim.no_change);
        }
    }

    /* renamed from: m1 */
    public void mo30690m1() {
        AppCompatDialog appCompatDialog = this.f13416F;
        if (appCompatDialog != null) {
            appCompatDialog.dismiss();
        }
    }

    /* renamed from: o */
    public void mo30691o() {
        AppCompatDialog appCompatDialog = this.f13417G;
        View findViewById = appCompatDialog != null ? appCompatDialog.findViewById(2131363679) : null;
        if (findViewById != null) {
            String string = getString(C17541R$string.upload_failed);
            C13706o.m87928e(string, "getString(R.string.upload_failed)");
            m21013Q0(string, C17528R$color.snack_bar_error, findViewById);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        C5275b bVar;
        LottieAnimationView lottieAnimationView;
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        int i = 0;
        this.f13414D = arguments != null ? arguments.getInt("userId") : 0;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            i = arguments2.getInt("orderBy");
        }
        this.f13415E = i;
        if (getParentFragment() != null) {
            Fragment parentFragment = getParentFragment();
            C13706o.m87927d(parentFragment, "null cannot be cast to non-null type com.arlosoft.macrodroid.templatestore.ui.SearchTermProvider");
            bVar = (C5275b) parentFragment;
        } else if (requireActivity() instanceof C5275b) {
            FragmentActivity requireActivity = requireActivity();
            C13706o.m87927d(requireActivity, "null cannot be cast to non-null type com.arlosoft.macrodroid.templatestore.ui.SearchTermProvider");
            bVar = (C5275b) requireActivity;
        } else {
            bVar = null;
        }
        mo30688l0();
        mo30701u0().mo30658s0(this, bVar, this.f13414D, this.f13415E);
        AppCompatButton appCompatButton = (AppCompatButton) mo30687i0(C17532R$id.retryButton);
        C13706o.m87928e(appCompatButton, "retryButton");
        C4666m.m18147o(appCompatButton, (C13640g) null, new C5476c(this, (C13635d<? super C5476c>) null), 1, (Object) null);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo30687i0(C17532R$id.swipeRefresh);
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(new C5470r(this));
        }
        if (getResources().getBoolean(C17527R$bool.is_night_mode) && (lottieAnimationView = (LottieAnimationView) mo30687i0(C17532R$id.cryingAnimation)) != null) {
            lottieAnimationView.mo16978f(new C2097e("**"), C1492k.f984E, C5471s.f13409a);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 101 && i2 == -1) {
            boolean z = true;
            if (intent == null || !intent.getBooleanExtra("sign_in", false)) {
                z = false;
            }
            if (z) {
                m21017U0();
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C13706o.m87929f(layoutInflater, "inflater");
        Bundle arguments = getArguments();
        boolean z = arguments != null ? arguments.getBoolean("swipeRefresh", false) : true;
        Bundle arguments2 = getArguments();
        this.f13418H = arguments2 != null ? arguments2.getBoolean("showReportCount", false) : false;
        Bundle arguments3 = getArguments();
        this.f13419I = arguments3 != null ? arguments3.getBoolean("hideZeroReports", false) : false;
        return layoutInflater.inflate(z ? C17535R$layout.fragment_template_store_list : C17535R$layout.fragment_template_store_list_no_swipe_refresh, viewGroup, false);
    }

    public void onDestroyView() {
        super.onDestroyView();
        mo30701u0().mo40889j();
        ((RecyclerView) mo30687i0(C17532R$id.updatesList)).setAdapter((RecyclerView.Adapter) null);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo30687i0(C17532R$id.swipeRefresh);
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener((SwipeRefreshLayout.OnRefreshListener) null);
        }
        mo26239U();
    }

    public void onResume() {
        super.onResume();
        refresh();
    }

    /* renamed from: p */
    public void mo30692p() {
        AppCompatDialog appCompatDialog = this.f13417G;
        if (appCompatDialog != null) {
            appCompatDialog.dismiss();
        }
        String string = getString(C17541R$string.report_submitted);
        C13706o.m87928e(string, "getString(R.string.report_submitted)");
        m21014R0(this, string, 2131100649, (View) null, 4, (Object) null);
    }

    /* renamed from: q */
    public void mo30693q() {
        LinearLayout linearLayout = (LinearLayout) mo30687i0(C17532R$id.emptyView);
        C13706o.m87928e(linearLayout, "emptyView");
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = (LinearLayout) mo30687i0(C17532R$id.errorView);
        C13706o.m87928e(linearLayout2, "errorView");
        linearLayout2.setVisibility(0);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) mo30687i0(C17532R$id.loadingView);
        C13706o.m87928e(lottieAnimationView, "loadingView");
        lottieAnimationView.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) mo30687i0(C17532R$id.updatesList);
        C13706o.m87928e(recyclerView, "updatesList");
        recyclerView.setVisibility(8);
        LinearLayout linearLayout3 = (LinearLayout) mo30687i0(C17532R$id.pirateView);
        C13706o.m87928e(linearLayout3, "pirateView");
        linearLayout3.setVisibility(8);
    }

    /* renamed from: r */
    public void mo30694r(boolean z) {
        AppCompatDialog appCompatDialog = this.f13417G;
        ViewFlipper viewFlipper = appCompatDialog != null ? (ViewFlipper) appCompatDialog.findViewById(C17532R$id.viewFlipper) : null;
        if (viewFlipper != null) {
            viewFlipper.setDisplayedChild(z ? 1 : 0);
        }
    }

    /* renamed from: r0 */
    public final C2227a mo30695r0() {
        C2227a aVar = this.f13425p;
        if (aVar != null) {
            return aVar;
        }
        C13706o.m87945v("flagProvider");
        return null;
    }

    public void refresh() {
        if (this.f13413C != null) {
            C15561w1 unused = C15473j.m94492d(LifecycleOwnerKt.getLifecycleScope(this), C15186a1.m93730b(), (C15486m0) null, new C5477d(this, (C13635d<? super C5477d>) null), 2, (Object) null);
        }
    }

    /* renamed from: s */
    public void mo30697s() {
        SnackbarAnimate h = SnackbarAnimate.m69573h(requireView(), C17541R$string.template_store_sorry_subsribe_users_must_sign_in, SamsungIrisUnlockModule.IRIS_ERROR_NEED_TO_RETRY);
        C13706o.m87928e(h, "make(requireView(), R.st…users_must_sign_in, 5000)");
        h.mo58921e().setBackgroundResource(2131100690);
        View findViewById = h.mo58921e().findViewById(2131363815);
        C13706o.m87927d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setTextColor(-1);
        View findViewById2 = h.mo58921e().findViewById(2131363814);
        C13706o.m87927d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById2).setTextColor(-1);
        h.mo58926l(C17541R$string.sign_in, new C5469q(this));
        h.mo58932r();
    }

    /* renamed from: s0 */
    public final C5410a mo30698s0() {
        C5410a aVar = this.f13423g;
        if (aVar != null) {
            return aVar;
        }
        C13706o.m87945v("localTemplateOverrideStore");
        return null;
    }

    /* renamed from: s1 */
    public void mo30699s1() {
        String string = getString(C17541R$string.template_is_deleted);
        C13706o.m87928e(string, "getString(R.string.template_is_deleted)");
        m21014R0(this, string, 2131100649, (View) null, 4, (Object) null);
    }

    /* renamed from: t0 */
    public void mo30700t0() {
        FragmentActivity activity = getActivity();
        C15626c.makeText(activity != null ? activity.getApplicationContext() : null, C17541R$string.cannot_star_own_macros, 0).show();
    }

    /* renamed from: u0 */
    public final C5457s mo30701u0() {
        C5457s sVar = this.f13421d;
        if (sVar != null) {
            return sVar;
        }
        C13706o.m87945v("presenter");
        return null;
    }

    /* renamed from: u1 */
    public void mo30702u1(boolean z) {
        AppCompatDialog appCompatDialog = this.f13416F;
        ViewFlipper viewFlipper = appCompatDialog != null ? (ViewFlipper) appCompatDialog.findViewById(C17532R$id.viewFlipper) : null;
        if (viewFlipper != null) {
            viewFlipper.setDisplayedChild(z ? 1 : 0);
        }
    }

    /* renamed from: v0 */
    public final C5331h mo30703v0() {
        C5331h hVar = this.f13422f;
        if (hVar != null) {
            return hVar;
        }
        C13706o.m87945v("profileImageProvider");
        return null;
    }

    /* renamed from: w */
    public void mo30704w(MacroTemplate macroTemplate) {
        C13706o.m87929f(macroTemplate, "macroTemplate");
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity(), C17542R$style.Theme_App_Dialog_Template);
        builder.setTitle((CharSequence) macroTemplate.getName());
        builder.setMessage((CharSequence) getString(C17541R$string.delete_template_confirm));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C5435m(this, macroTemplate));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.show();
    }

    /* renamed from: w0 */
    public void mo30705w0() {
        SnackbarAnimate h = SnackbarAnimate.m69573h(requireView(), C17541R$string.please_sign_in_template_store, SamsungIrisUnlockModule.IRIS_ERROR_NEED_TO_RETRY);
        C13706o.m87928e(h, "make(requireView(), R.st…_in_template_store, 5000)");
        h.mo58921e().setBackgroundResource(2131100690);
        View findViewById = h.mo58921e().findViewById(2131363815);
        C13706o.m87927d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setTextColor(-1);
        View findViewById2 = h.mo58921e().findViewById(2131363814);
        C13706o.m87927d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById2).setTextColor(-1);
        h.mo58926l(C17541R$string.sign_in, new C5437o(this));
        h.mo58932r();
    }

    /* renamed from: x0 */
    public void mo30706x0() {
        RecyclerView recyclerView = (RecyclerView) mo30687i0(C17532R$id.updatesList);
        C13706o.m87928e(recyclerView, "updatesList");
        recyclerView.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) mo30687i0(C17532R$id.emptyView);
        C13706o.m87928e(linearLayout, "emptyView");
        linearLayout.setVisibility(0);
        LinearLayout linearLayout2 = (LinearLayout) mo30687i0(C17532R$id.errorView);
        C13706o.m87928e(linearLayout2, "errorView");
        linearLayout2.setVisibility(8);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) mo30687i0(C17532R$id.loadingView);
        C13706o.m87928e(lottieAnimationView, "loadingView");
        lottieAnimationView.setVisibility(8);
        LinearLayout linearLayout3 = (LinearLayout) mo30687i0(C17532R$id.pirateView);
        C13706o.m87928e(linearLayout3, "pirateView");
        linearLayout3.setVisibility(8);
    }

    /* renamed from: y0 */
    public final MacroDroidRoomDatabase mo30707y0() {
        MacroDroidRoomDatabase macroDroidRoomDatabase = this.f13412B;
        if (macroDroidRoomDatabase != null) {
            return macroDroidRoomDatabase;
        }
        C13706o.m87945v("roomDatabase");
        return null;
    }
}
