package com.arlosoft.macrodroid.autobackup.p068ui.cloud;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17536R$menu;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.autobackup.p068ui.cloud.C3839r;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.templatestore.model.User;
import com.arlosoft.macrodroid.upgrade.UpgradeActivity2;
import com.arlosoft.macrodroid.user.signin.C6353g;
import com.arlosoft.macrodroid.utils.C6388h1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15482l0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15552u0;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.C15573z;
import p139o1.C8030v;
import p154r0.C8184d;
import p277h9.C12408a;
import p297ja.C13328m;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16269p;
import p370qa.C16270q;
import p448z9.C17070a;
import p474sf.C17435a;

/* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.k */
/* compiled from: AutoBackupCloudFragment.kt */
public final class C3819k extends C8184d {

    /* renamed from: G */
    public static final C3820a f9957G = new C3820a((C13695i) null);

    /* renamed from: A */
    private boolean f9958A;

    /* renamed from: B */
    private Dialog f9959B;

    /* renamed from: C */
    private final C15573z f9960C;

    /* renamed from: D */
    private final C15478k0 f9961D;

    /* renamed from: E */
    private boolean f9962E;

    /* renamed from: F */
    public Map<Integer, View> f9963F = new LinkedHashMap();

    /* renamed from: d */
    public AutoBackupCloudViewModel f9964d;

    /* renamed from: f */
    public C6353g f9965f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C8030v f9966g;

    /* renamed from: o */
    private C17070a f9967o;

    /* renamed from: p */
    private C3848u f9968p;

    /* renamed from: s */
    private SwitchCompat f9969s;

    /* renamed from: z */
    private boolean f9970z;

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.k$a */
    /* compiled from: AutoBackupCloudFragment.kt */
    public static final class C3820a {
        private C3820a() {
        }

        public /* synthetic */ C3820a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C3819k mo27358a() {
            return new C3819k();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.k$b */
    /* compiled from: AlertDialog.kt */
    public static final class C3821b implements DialogInterface.OnClickListener {
        public final void onClick(DialogInterface dialogInterface, int i) {
            C13706o.m87929f(dialogInterface, "dialog");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.k$c */
    /* compiled from: AlertDialog.kt */
    public static final class C3822c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3819k f9971a;

        public C3822c(C3819k kVar) {
            this.f9971a = kVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C13706o.m87929f(dialogInterface, "dialog");
            this.f9971a.mo27357D0().mo27340n();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.k$d */
    /* compiled from: AutoBackupCloudFragment.kt */
    static final class C3823d extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ C3819k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3823d(C3819k kVar, C13635d<? super C3823d> dVar) {
            super(3, dVar);
            this.this$0 = kVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3823d(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.mo27357D0().mo27336I();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.k$e */
    /* compiled from: AutoBackupCloudFragment.kt */
    public static final class C3824e implements C6353g.C6355b {

        /* renamed from: a */
        final /* synthetic */ C3819k f9972a;

        C3824e(C3819k kVar) {
            this.f9972a = kVar;
        }

        /* renamed from: a */
        public void mo27362a() {
            this.f9972a.mo27357D0().mo27335H();
        }

        /* renamed from: b */
        public void mo27363b(User user) {
            C13706o.m87929f(user, "user");
            this.f9972a.mo27357D0().mo27336I();
        }

        /* renamed from: c */
        public void mo27364c() {
            this.f9972a.m14942K0(true, false, C13614t.m87748j(), (String) null);
        }

        /* renamed from: d */
        public void mo27365d() {
            C8030v j0 = this.f9972a.f9966g;
            if (j0 == null) {
                C13706o.m87945v("binding");
                j0 = null;
            }
            FrameLayout frameLayout = j0.f19479g;
            C13706o.m87928e(frameLayout, "binding.loadingView");
            frameLayout.setVisibility(8);
            C15626c.makeText(this.f9972a.requireContext(), C17541R$string.could_not_sign_in, 1).show();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.k$f */
    /* compiled from: AutoBackupCloudFragment.kt */
    static final class C3825f extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ C3819k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3825f(C3819k kVar, C13635d<? super C3825f> dVar) {
            super(2, dVar);
            this.this$0 = kVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C3825f(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C3825f) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                this.label = 1;
                if (C15552u0.m94699a(500, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            FragmentActivity activity = this.this$0.getActivity();
            if (activity != null) {
                activity.invalidateOptionsMenu();
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.k$g */
    /* compiled from: AlertDialog.kt */
    public static final class C3826g implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f9973a;

        public C3826g(AlertDialog alertDialog) {
            this.f9973a = alertDialog;
        }

        public final void onShow(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.k$h */
    /* compiled from: AlertDialog.kt */
    public static final class C3827h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3819k f9974a;

        /* renamed from: c */
        final /* synthetic */ C3847t f9975c;

        public C3827h(C3819k kVar, C3847t tVar) {
            this.f9974a = kVar;
            this.f9975c = tVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C13706o.m87929f(dialogInterface, "dialog");
            this.f9974a.mo27357D0().mo27342r(this.f9975c);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.k$i */
    /* compiled from: AlertDialog.kt */
    public static final class C3828i implements DialogInterface.OnClickListener {
        public final void onClick(DialogInterface dialogInterface, int i) {
            C13706o.m87929f(dialogInterface, "dialog");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.k$j */
    /* compiled from: AutoBackupCloudFragment.kt */
    static final class C3829j extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ C3819k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3829j(C3819k kVar, C13635d<? super C3829j> dVar) {
            super(2, dVar);
            this.this$0 = kVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C3829j(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C3829j) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                this.label = 1;
                if (C15552u0.m94699a(500, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            FragmentActivity activity = this.this$0.getActivity();
            if (activity != null) {
                activity.invalidateOptionsMenu();
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.k$k */
    /* compiled from: AutoBackupCloudFragment.kt */
    static final class C3830k extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ C3819k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3830k(C3819k kVar, C13635d<? super C3830k> dVar) {
            super(3, dVar);
            this.this$0 = kVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3830k(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.mo27356C0().mo32406t(this.this$0);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.k$l */
    /* compiled from: AutoBackupCloudFragment.kt */
    static final class C3831l extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ C3819k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3831l(C3819k kVar, C13635d<? super C3831l> dVar) {
            super(2, dVar);
            this.this$0 = kVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C3831l(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C3831l) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                this.label = 1;
                if (C15552u0.m94699a(500, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            FragmentActivity activity = this.this$0.getActivity();
            if (activity != null) {
                activity.invalidateOptionsMenu();
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.k$m */
    /* compiled from: AutoBackupCloudFragment.kt */
    static final class C3832m extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ C3819k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3832m(C3819k kVar, C13635d<? super C3832m> dVar) {
            super(3, dVar);
            this.this$0 = kVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3832m(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                UpgradeActivity2.C6289a aVar = UpgradeActivity2.f14829L;
                FragmentActivity requireActivity = this.this$0.requireActivity();
                C13706o.m87928e(requireActivity, "requireActivity()");
                aVar.mo32326a(requireActivity);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C3819k() {
        C15573z b = C15198b2.m93746b((C15561w1) null, 1, (Object) null);
        this.f9960C = b;
        this.f9961D = C15482l0.m94502a(C15186a1.m93731c().plus(b));
        this.f9962E = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public static final void m14934A0(C3819k kVar, Boolean bool) {
        C13706o.m87929f(kVar, "this$0");
        C13706o.m87926c(bool);
        kVar.m14936E0(bool.booleanValue());
    }

    /* renamed from: B0 */
    private final void m14935B0() {
        FragmentActivity requireActivity = requireActivity();
        C13706o.m87928e(requireActivity, "requireActivity()");
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity);
        C17435a.m101225c(builder, C17541R$string.delete_all_backups);
        C17435a.m101223a(builder, C17541R$string.are_you_sure);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3822c(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C3821b());
        AlertDialog create = builder.create();
        C13706o.m87928e(create, "AlertDialog.Builder(this…Config)\n        .create()");
        create.show();
    }

    /* renamed from: E0 */
    private final void m14936E0(boolean z) {
        Dialog dialog = this.f9959B;
        if (dialog != null) {
            dialog.hide();
        }
        this.f9959B = null;
        if (z) {
            C12408a.C12409a.m83286b().mo68758c(-1).mo68759d(false).mo68757a();
            C12408a.m83284r(requireContext(), getString(C17541R$string.backup_file_restored), (Drawable) null, ContextCompat.getColor(requireContext(), 2131100650), 1, false, true).show();
            requireActivity().finish();
            return;
        }
        C12408a.C12409a.m83286b().mo68758c(-1).mo68759d(false).mo68757a();
        C12408a.m83284r(requireContext(), getString(C17541R$string.backup_file_restore_failed), (Drawable) null, ContextCompat.getColor(requireContext(), 2131100778), 1, false, true).show();
    }

    /* renamed from: F0 */
    private final void m14937F0() {
        this.f9968p = new C3848u(C13614t.m87748j(), mo27357D0());
        C8030v vVar = this.f9966g;
        if (vVar == null) {
            C13706o.m87945v("binding");
            vVar = null;
        }
        RecyclerView recyclerView = vVar.f19481i;
        C3848u uVar = this.f9968p;
        if (uVar == null) {
            C13706o.m87945v("adapter");
            uVar = null;
        }
        recyclerView.setAdapter(uVar);
        C8030v vVar2 = this.f9966g;
        if (vVar2 == null) {
            C13706o.m87945v("binding");
            vVar2 = null;
        }
        Button button = vVar2.f19482j;
        C13706o.m87928e(button, "binding.retryButton");
        C4666m.m18147o(button, (C13640g) null, new C3823d(this, (C13635d<? super C3823d>) null), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: G0 */
    public static final void m14938G0(C3819k kVar, CompoundButton compoundButton, boolean z) {
        C13706o.m87929f(kVar, "this$0");
        kVar.mo27357D0().mo27332E(z);
        Context requireContext = kVar.requireContext();
        StringBuilder sb = new StringBuilder();
        sb.append(kVar.getString(C17541R$string.cloud_backup));
        sb.append(" - ");
        sb.append(kVar.getString(z ? C17541R$string.enabled : C17541R$string.disabled));
        C15626c.m94876a(requireContext, sb.toString(), 0).show();
    }

    /* renamed from: H0 */
    private final void m14939H0() {
        String string = getString(C17541R$string.cloud_backup_backing_up_to_cloud);
        C13706o.m87928e(string, "getString(R.string.cloud…ckup_backing_up_to_cloud)");
        m14946P0(string);
    }

    /* renamed from: I0 */
    private final void m14940I0(C3847t tVar, String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        builder.setTitle(str);
        builder.setMessage(C17541R$string.restore_backup_dialog_text);
        builder.setPositiveButton(C17541R$string.restore_backup, new C3809a(this, tVar));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: J0 */
    public static final void m14941J0(C3819k kVar, C3847t tVar, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(kVar, "this$0");
        C13706o.m87929f(tVar, "$backupInfo");
        kVar.mo27357D0().mo27337J(tVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: K0 */
    public final void m14942K0(boolean z, boolean z2, List<C3847t> list, String str) {
        Dialog dialog = this.f9959B;
        if (dialog != null) {
            dialog.hide();
        }
        C8030v vVar = null;
        this.f9959B = null;
        C8030v vVar2 = this.f9966g;
        if (vVar2 == null) {
            C13706o.m87945v("binding");
            vVar2 = null;
        }
        vVar2.f19485m.setDisplayedChild(2);
        this.f9970z = true;
        C15561w1 unused = C15473j.m94492d(this.f9961D, C15186a1.m93731c(), (C15486m0) null, new C3825f(this, (C13635d<? super C3825f>) null), 2, (Object) null);
        C3848u uVar = this.f9968p;
        if (uVar == null) {
            C13706o.m87945v("adapter");
            uVar = null;
        }
        uVar.mo27385D(str);
        C3848u uVar2 = this.f9968p;
        if (uVar2 == null) {
            C13706o.m87945v("adapter");
            uVar2 = null;
        }
        uVar2.mo27386E(list);
        int i = 0;
        if (z) {
            C8030v vVar3 = this.f9966g;
            if (vVar3 == null) {
                C13706o.m87945v("binding");
                vVar3 = null;
            }
            FrameLayout frameLayout = vVar3.f19479g;
            C13706o.m87928e(frameLayout, "binding.loadingView");
            frameLayout.setVisibility(0);
            C8030v vVar4 = this.f9966g;
            if (vVar4 == null) {
                C13706o.m87945v("binding");
            } else {
                vVar = vVar4;
            }
            FrameLayout frameLayout2 = vVar.f19477e;
            C13706o.m87928e(frameLayout2, "binding.emptyView");
            frameLayout2.setVisibility(8);
            return;
        }
        C8030v vVar5 = this.f9966g;
        if (vVar5 == null) {
            C13706o.m87945v("binding");
            vVar5 = null;
        }
        FrameLayout frameLayout3 = vVar5.f19479g;
        C13706o.m87928e(frameLayout3, "binding.loadingView");
        frameLayout3.setVisibility(8);
        C8030v vVar6 = this.f9966g;
        if (vVar6 == null) {
            C13706o.m87945v("binding");
            vVar6 = null;
        }
        RecyclerView recyclerView = vVar6.f19481i;
        C13706o.m87928e(recyclerView, "binding.recyclerView");
        recyclerView.setVisibility(list.isEmpty() ^ true ? 0 : 8);
        if (z2) {
            C8030v vVar7 = this.f9966g;
            if (vVar7 == null) {
                C13706o.m87945v("binding");
                vVar7 = null;
            }
            FrameLayout frameLayout4 = vVar7.f19477e;
            C13706o.m87928e(frameLayout4, "binding.emptyView");
            frameLayout4.setVisibility(8);
            C8030v vVar8 = this.f9966g;
            if (vVar8 == null) {
                C13706o.m87945v("binding");
            } else {
                vVar = vVar8;
            }
            FrameLayout frameLayout5 = vVar.f19478f;
            C13706o.m87928e(frameLayout5, "binding.failedDownloadView");
            frameLayout5.setVisibility(0);
            return;
        }
        C8030v vVar9 = this.f9966g;
        if (vVar9 == null) {
            C13706o.m87945v("binding");
            vVar9 = null;
        }
        FrameLayout frameLayout6 = vVar9.f19478f;
        C13706o.m87928e(frameLayout6, "binding.failedDownloadView");
        frameLayout6.setVisibility(8);
        C8030v vVar10 = this.f9966g;
        if (vVar10 == null) {
            C13706o.m87945v("binding");
        } else {
            vVar = vVar10;
        }
        FrameLayout frameLayout7 = vVar.f19477e;
        C13706o.m87928e(frameLayout7, "binding.emptyView");
        if (!list.isEmpty()) {
            i = 8;
        }
        frameLayout7.setVisibility(i);
    }

    /* renamed from: L0 */
    private final void m14943L0(C3847t tVar, String str) {
        FragmentActivity requireActivity = requireActivity();
        C13706o.m87928e(requireActivity, "requireActivity()");
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity);
        C17435a.m101224b(builder, str);
        C17435a.m101223a(builder, C17541R$string.confirm_backup_delete);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3827h(this, tVar));
        androidx.appcompat.app.AlertDialog create = builder.create();
        C13706o.m87928e(create, "AlertDialog.Builder(this…Config)\n        .create()");
        create.setOnShowListener(new C3826g(create));
        create.show();
    }

    /* renamed from: N0 */
    private final void m14944N0() {
        String string = getString(C17541R$string.cloud_backup_deleting_message);
        C13706o.m87928e(string, "getString(R.string.cloud_backup_deleting_message)");
        m14946P0(string);
    }

    /* renamed from: O0 */
    private final void m14945O0() {
        FragmentActivity requireActivity = requireActivity();
        C13706o.m87928e(requireActivity, "requireActivity()");
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity);
        C17435a.m101225c(builder, C17541R$string.error);
        C17435a.m101223a(builder, C17541R$string.cloud_backup_google_services_required);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3828i());
        androidx.appcompat.app.AlertDialog create = builder.create();
        C13706o.m87928e(create, "AlertDialog.Builder(this…Config)\n        .create()");
        create.show();
    }

    /* renamed from: P0 */
    private final void m14946P0(String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        View inflate = getLayoutInflater().inflate(C17535R$layout.dialog_auto_backup_progress, (ViewGroup) null);
        ((TextView) inflate.findViewById(2131363972)).setText(str);
        builder.setView(inflate);
        this.f9959B = builder.show();
    }

    /* renamed from: Q0 */
    private final void m14947Q0() {
        String string = getString(C17541R$string.importing_macros);
        C13706o.m87928e(string, "getString(R.string.importing_macros)");
        m14946P0(string);
    }

    /* renamed from: R0 */
    private final void m14948R0() {
        Dialog dialog = this.f9959B;
        if (dialog != null) {
            dialog.hide();
        }
        this.f9959B = null;
        C8030v vVar = this.f9966g;
        if (vVar == null) {
            C13706o.m87945v("binding");
            vVar = null;
        }
        FrameLayout frameLayout = vVar.f19479g;
        C13706o.m87928e(frameLayout, "binding.loadingView");
        frameLayout.setVisibility(8);
        this.f9970z = false;
        C15561w1 unused = C15473j.m94492d(this.f9961D, C15186a1.m93731c(), (C15486m0) null, new C3829j(this, (C13635d<? super C3829j>) null), 2, (Object) null);
        C8030v vVar2 = this.f9966g;
        if (vVar2 == null) {
            C13706o.m87945v("binding");
            vVar2 = null;
        }
        vVar2.f19485m.setDisplayedChild(1);
        C8030v vVar3 = this.f9966g;
        if (vVar3 == null) {
            C13706o.m87945v("binding");
            vVar3 = null;
        }
        vVar3.f19484l.setText(getString(C17541R$string.cloud_backup_please_sign_in));
        C8030v vVar4 = this.f9966g;
        if (vVar4 == null) {
            C13706o.m87945v("binding");
            vVar4 = null;
        }
        vVar4.f19483k.setText(getString(C17541R$string.sign_in));
        C8030v vVar5 = this.f9966g;
        if (vVar5 == null) {
            C13706o.m87945v("binding");
            vVar5 = null;
        }
        Button button = vVar5.f19483k;
        C13706o.m87928e(button, "binding.upgradeSignInButton");
        C4666m.m18147o(button, (C13640g) null, new C3830k(this, (C13635d<? super C3830k>) null), 1, (Object) null);
    }

    /* renamed from: S0 */
    private final void m14949S0() {
        this.f9970z = false;
        C15561w1 unused = C15473j.m94492d(this.f9961D, C15186a1.m93731c(), (C15486m0) null, new C3831l(this, (C13635d<? super C3831l>) null), 2, (Object) null);
        C8030v vVar = this.f9966g;
        if (vVar == null) {
            C13706o.m87945v("binding");
            vVar = null;
        }
        vVar.f19485m.setDisplayedChild(1);
        C8030v vVar2 = this.f9966g;
        if (vVar2 == null) {
            C13706o.m87945v("binding");
            vVar2 = null;
        }
        vVar2.f19484l.setText(getString(C17541R$string.cloud_backup_pro_users_info));
        C8030v vVar3 = this.f9966g;
        if (vVar3 == null) {
            C13706o.m87945v("binding");
            vVar3 = null;
        }
        vVar3.f19483k.setText(getString(C17541R$string.upgrade_to_pro));
        C8030v vVar4 = this.f9966g;
        if (vVar4 == null) {
            C13706o.m87945v("binding");
            vVar4 = null;
        }
        Button button = vVar4.f19483k;
        C13706o.m87928e(button, "binding.upgradeSignInButton");
        C4666m.m18147o(button, (C13640g) null, new C3832m(this, (C13635d<? super C3832m>) null), 1, (Object) null);
    }

    /* renamed from: n0 */
    private final void m14962n0(C3839r rVar) {
        if (C13706o.m87924a(rVar, C3839r.C3843d.f9989a)) {
            m14949S0();
        } else if (C13706o.m87924a(rVar, C3839r.C3845f.f9991a)) {
            m14948R0();
        } else if (C13706o.m87924a(rVar, C3839r.C3840a.f9983a)) {
            m14939H0();
        } else if (C13706o.m87924a(rVar, C3839r.C3842c.f9988a)) {
            m14944N0();
        } else if (C13706o.m87924a(rVar, C3839r.C3844e.f9990a)) {
            m14947Q0();
        } else if (rVar instanceof C3839r.C3841b) {
            C3839r.C3841b bVar = (C3839r.C3841b) rVar;
            m14942K0(bVar.mo27377d(), bVar.mo27376c(), bVar.mo27374a(), bVar.mo27375b());
        }
    }

    /* renamed from: o0 */
    private final void m14963o0() {
        mo27357D0().mo27331D().observe(getViewLifecycleOwner(), new C3811c(this));
        mo27357D0().mo27346w().observe(getViewLifecycleOwner(), new C3814f(this));
        C6388h1<C3846s> t = mo27357D0().mo27344t();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        C13706o.m87928e(viewLifecycleOwner, "viewLifecycleOwner");
        t.observe(viewLifecycleOwner, new C3813e(this));
        C6388h1<Void> v = mo27357D0().mo27345v();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        C13706o.m87928e(viewLifecycleOwner2, "viewLifecycleOwner");
        v.observe(viewLifecycleOwner2, new C3816h(this));
        C6388h1<C3846s> t2 = mo27357D0().mo27344t();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        C13706o.m87928e(viewLifecycleOwner3, "viewLifecycleOwner");
        t2.observe(viewLifecycleOwner3, new C3812d(this));
        C6388h1<C13328m<C3847t, String>> C = mo27357D0().mo27330C();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        C13706o.m87928e(viewLifecycleOwner4, "viewLifecycleOwner");
        C.observe(viewLifecycleOwner4, new C3818j(this));
        C6388h1<C13328m<C3847t, String>> B = mo27357D0().mo27329B();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        C13706o.m87928e(viewLifecycleOwner5, "viewLifecycleOwner");
        B.observe(viewLifecycleOwner5, new C3817i(this));
        C6388h1<Boolean> A = mo27357D0().mo27328A();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        C13706o.m87928e(viewLifecycleOwner6, "viewLifecycleOwner");
        A.observe(viewLifecycleOwner6, new C3815g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public static final void m14964p0(C3819k kVar, C3839r rVar) {
        C13706o.m87929f(kVar, "this$0");
        C13706o.m87928e(rVar, "it");
        kVar.m14962n0(rVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public static final void m14965q0(C3819k kVar, Boolean bool) {
        C13706o.m87929f(kVar, "this$0");
        SwitchCompat switchCompat = kVar.f9969s;
        if (switchCompat != null) {
            C13706o.m87928e(bool, "it");
            switchCompat.setChecked(bool.booleanValue());
        }
        C13706o.m87928e(bool, "it");
        kVar.f9958A = bool.booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public static final void m14966r0(C3819k kVar, C3846s sVar) {
        C13706o.m87929f(kVar, "this$0");
        Dialog dialog = kVar.f9959B;
        if (dialog != null) {
            dialog.hide();
        }
        kVar.f9959B = null;
        if (sVar == C3846s.NO_MACROS) {
            C15626c.m94876a(kVar.requireContext(), kVar.getString(C17541R$string.no_macros_configured), 1).show();
        } else {
            C15626c.m94876a(kVar.requireContext(), kVar.getString(C17541R$string.cloud_backup_failed_error_message), 1).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public static final void m14967s0(C3819k kVar, Void voidR) {
        C13706o.m87929f(kVar, "this$0");
        Dialog dialog = kVar.f9959B;
        if (dialog != null) {
            dialog.hide();
        }
        kVar.f9959B = null;
        C15626c.m94876a(kVar.requireContext(), kVar.getString(C17541R$string.delete_failed), 1).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public static final void m14968u0(C3819k kVar, C3846s sVar) {
        C13706o.m87929f(kVar, "this$0");
        Dialog dialog = kVar.f9959B;
        if (dialog != null) {
            dialog.hide();
        }
        kVar.f9959B = null;
        C15626c.m94876a(kVar.requireContext(), kVar.getString(C17541R$string.backup_file_restore_failed), 1).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public static final void m14969v0(C3819k kVar, C13328m mVar) {
        C13706o.m87929f(kVar, "this$0");
        C13706o.m87926c(mVar);
        kVar.m14943L0((C3847t) mVar.mo70154c(), (String) mVar.mo70155d());
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public static final void m14970y0(C3819k kVar, C13328m mVar) {
        C13706o.m87929f(kVar, "this$0");
        C13706o.m87926c(mVar);
        kVar.m14940I0((C3847t) mVar.mo70154c(), (String) mVar.mo70155d());
    }

    /* renamed from: C0 */
    public final C6353g mo27356C0() {
        C6353g gVar = this.f9965f;
        if (gVar != null) {
            return gVar;
        }
        C13706o.m87945v("signInHelper");
        return null;
    }

    /* renamed from: D0 */
    public final AutoBackupCloudViewModel mo27357D0() {
        AutoBackupCloudViewModel autoBackupCloudViewModel = this.f9964d;
        if (autoBackupCloudViewModel != null) {
            return autoBackupCloudViewModel;
        }
        C13706o.m87945v("viewModel");
        return null;
    }

    /* renamed from: U */
    public void mo26239U() {
        this.f9963F.clear();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            super.onActivityResult(r4, r5, r6)
            com.firebase.ui.auth.IdpResponse r6 = com.firebase.p073ui.auth.IdpResponse.m25763g(r6)
            r0 = 9729(0x2601, float:1.3633E-41)
            if (r4 != r0) goto L_0x007c
            r4 = -1
            r0 = 0
            if (r5 != r4) goto L_0x0028
            com.arlosoft.macrodroid.user.signin.g r4 = r3.mo27356C0()
            z9.a r5 = r3.f9967o
            if (r5 != 0) goto L_0x001d
            java.lang.String r5 = "compositeDisposable"
            kotlin.jvm.internal.C13706o.m87945v(r5)
            goto L_0x001e
        L_0x001d:
            r0 = r5
        L_0x001e:
            com.arlosoft.macrodroid.autobackup.ui.cloud.k$e r5 = new com.arlosoft.macrodroid.autobackup.ui.cloud.k$e
            r5.<init>(r3)
            r1 = 0
            r4.mo32404i(r6, r0, r5, r1)
            goto L_0x007c
        L_0x0028:
            if (r6 == 0) goto L_0x007c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Sign in error: "
            r4.append(r5)
            com.firebase.ui.auth.FirebaseUiException r5 = r6.mo34092j()
            if (r5 == 0) goto L_0x0043
            int r5 = r5.mo34082a()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x0044
        L_0x0043:
            r5 = r0
        L_0x0044:
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r4)
            com.google.firebase.crashlytics.FirebaseCrashlytics r4 = com.google.firebase.crashlytics.FirebaseCrashlytics.m6487a()
            java.lang.Exception r5 = new java.lang.Exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Template store Sign in error: "
            r1.append(r2)
            com.firebase.ui.auth.FirebaseUiException r6 = r6.mo34092j()
            if (r6 == 0) goto L_0x006c
            int r6 = r6.mo34082a()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
        L_0x006c:
            r1.append(r0)
            java.lang.String r6 = r1.toString()
            r5.<init>(r6)
            r4.mo22936d(r5)
            r3.m14945O0()
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.autobackup.p068ui.cloud.C3819k.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9967o = new C17070a();
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        SwitchCompat switchCompat;
        C13706o.m87929f(menu, "menu");
        C13706o.m87929f(menuInflater, "inflater");
        if (this.f9962E || !this.f9970z) {
            this.f9962E = false;
        } else {
            menuInflater.inflate(C17536R$menu.autobackup_cloud_menu, menu);
            View actionView = menu.findItem(C17532R$id.switch_enabled).getActionView();
            C13706o.m87927d(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SwitchCompat");
            this.f9969s = (SwitchCompat) actionView;
            menu.findItem(C17532R$id.sign_out).setVisible(this.f9970z);
            menu.findItem(C17532R$id.delete_all).setVisible(this.f9970z);
            menu.findItem(C17532R$id.switch_enabled).setVisible(this.f9970z);
            SwitchCompat switchCompat2 = this.f9969s;
            if (switchCompat2 != null) {
                switchCompat2.setChecked(this.f9958A);
            }
            if (this.f9970z && (switchCompat = this.f9969s) != null) {
                switchCompat.setOnCheckedChangeListener(new C3810b(this));
            }
        }
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C13706o.m87929f(layoutInflater, "inflater");
        C8030v c = C8030v.m33428c(layoutInflater, viewGroup, false);
        C13706o.m87928e(c, "inflate(inflater, container, false)");
        this.f9966g = c;
        getLifecycle().addObserver(mo27357D0());
        m14963o0();
        C8030v vVar = this.f9966g;
        if (vVar == null) {
            C13706o.m87945v("binding");
            vVar = null;
        }
        return vVar.getRoot();
    }

    public void onDestroy() {
        C17070a aVar = null;
        C15561w1.C15562a.m94723a(this.f9960C, (CancellationException) null, 1, (Object) null);
        C17070a aVar2 = this.f9967o;
        if (aVar2 == null) {
            C13706o.m87945v("compositeDisposable");
        } else {
            aVar = aVar2;
        }
        aVar.mo80337d();
        super.onDestroy();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo26239U();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C13706o.m87929f(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == 2131362033) {
            mo27357D0().mo27339m();
        } else if (itemId == 2131362461) {
            m14935B0();
        } else if (itemId == 2131363795) {
            mo27357D0().mo27338K();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C13706o.m87929f(view, "view");
        super.onViewCreated(view, bundle);
        m14937F0();
    }
}
