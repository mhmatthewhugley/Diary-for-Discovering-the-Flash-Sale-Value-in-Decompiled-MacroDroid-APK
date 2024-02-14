package com.arlosoft.macrodroid.autobackup.p068ui.local;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
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
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17536R$menu;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.autobackup.p068ui.C3797b;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.utils.C6362a0;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15478k0;
import p038md.C2025a;
import p038md.C2029c;
import p139o1.C7990a0;
import p154r0.C8184d;
import p193y0.C10392a;
import p277h9.C12408a;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16265l;
import p370qa.C16270q;

/* renamed from: com.arlosoft.macrodroid.autobackup.ui.local.d */
/* compiled from: AutoBackupLocalFragment.kt */
public final class C3855d extends C8184d implements C3872g {

    /* renamed from: p */
    public static final C3856a f10007p = new C3856a((C13695i) null);

    /* renamed from: d */
    public C3865f f10008d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C7990a0 f10009f;

    /* renamed from: g */
    private SwitchCompat f10010g;

    /* renamed from: o */
    public Map<Integer, View> f10011o = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.local.d$a */
    /* compiled from: AutoBackupLocalFragment.kt */
    public static final class C3856a {
        private C3856a() {
        }

        public /* synthetic */ C3856a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C3855d mo27404a() {
            return new C3855d();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.local.d$b */
    /* compiled from: AutoBackupLocalFragment.kt */
    static final class C3857b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ C3855d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3857b(C3855d dVar, C13635d<? super C3857b> dVar2) {
            super(3, dVar2);
            this.this$0 = dVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3857b(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C5163j2.m19987I2(this.this$0.requireContext());
                C7990a0 Z = this.this$0.f10009f;
                if (Z == null) {
                    C13706o.m87945v("binding");
                    Z = null;
                }
                Z.f19204d.f19257f.setVisibility(8);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.local.d$c */
    /* compiled from: AutoBackupLocalFragment.kt */
    static final class C3858c extends C13708q implements C16265l<C2025a<? extends DialogInterface>, C13339u> {
        final /* synthetic */ C3855d this$0;

        /* renamed from: com.arlosoft.macrodroid.autobackup.ui.local.d$c$a */
        /* compiled from: AutoBackupLocalFragment.kt */
        static final class C3859a extends C13708q implements C16265l<DialogInterface, C13339u> {
            final /* synthetic */ C3855d this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3859a(C3855d dVar) {
                super(1);
                this.this$0 = dVar;
            }

            /* renamed from: a */
            public final void mo27407a(DialogInterface dialogInterface) {
                C13706o.m87929f(dialogInterface, "it");
                this.this$0.mo27403e0().mo27414q();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo27407a((DialogInterface) obj);
                return C13339u.f61331a;
            }
        }

        /* renamed from: com.arlosoft.macrodroid.autobackup.ui.local.d$c$b */
        /* compiled from: AutoBackupLocalFragment.kt */
        static final class C3860b extends C13708q implements C16265l<DialogInterface, C13339u> {

            /* renamed from: a */
            public static final C3860b f10012a = new C3860b();

            C3860b() {
                super(1);
            }

            /* renamed from: a */
            public final void mo27408a(DialogInterface dialogInterface) {
                C13706o.m87929f(dialogInterface, "it");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo27408a((DialogInterface) obj);
                return C13339u.f61331a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3858c(C3855d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* renamed from: a */
        public final void mo27406a(C2025a<? extends DialogInterface> aVar) {
            C13706o.m87929f(aVar, "$this$alert");
            aVar.mo24109b(17039379, new C3859a(this.this$0));
            aVar.mo24108a(17039369, C3860b.f10012a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo27406a((C2025a) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.local.d$d */
    /* compiled from: AutoBackupLocalFragment.kt */
    static final class C3861d extends C13708q implements C16265l<C2025a<? extends DialogInterface>, C13339u> {
        final /* synthetic */ C10392a $backupFile;
        final /* synthetic */ C3855d this$0;

        /* renamed from: com.arlosoft.macrodroid.autobackup.ui.local.d$d$a */
        /* compiled from: AutoBackupLocalFragment.kt */
        static final class C3862a extends C13708q implements C16265l<DialogInterface, C13339u> {
            final /* synthetic */ C10392a $backupFile;
            final /* synthetic */ C3855d this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3862a(C3855d dVar, C10392a aVar) {
                super(1);
                this.this$0 = dVar;
                this.$backupFile = aVar;
            }

            /* renamed from: a */
            public final void mo27410a(DialogInterface dialogInterface) {
                C13706o.m87929f(dialogInterface, "it");
                this.this$0.mo27403e0().mo27415r(this.$backupFile);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo27410a((DialogInterface) obj);
                return C13339u.f61331a;
            }
        }

        /* renamed from: com.arlosoft.macrodroid.autobackup.ui.local.d$d$b */
        /* compiled from: AutoBackupLocalFragment.kt */
        static final class C3863b extends C13708q implements C16265l<DialogInterface, C13339u> {

            /* renamed from: a */
            public static final C3863b f10013a = new C3863b();

            C3863b() {
                super(1);
            }

            /* renamed from: a */
            public final void mo27411a(DialogInterface dialogInterface) {
                C13706o.m87929f(dialogInterface, "it");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo27411a((DialogInterface) obj);
                return C13339u.f61331a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3861d(C3855d dVar, C10392a aVar) {
            super(1);
            this.this$0 = dVar;
            this.$backupFile = aVar;
        }

        /* renamed from: a */
        public final void mo27409a(C2025a<? extends DialogInterface> aVar) {
            C13706o.m87929f(aVar, "$this$alert");
            aVar.mo24109b(17039379, new C3862a(this.this$0, this.$backupFile));
            aVar.mo24108a(17039369, C3863b.f10013a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo27409a((C2025a) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: a0 */
    private final void m15010a0() {
        C7990a0 a0Var = null;
        if (C5163j2.m20245q6(requireContext())) {
            C7990a0 a0Var2 = this.f10009f;
            if (a0Var2 == null) {
                C13706o.m87945v("binding");
            } else {
                a0Var = a0Var2;
            }
            a0Var.f19204d.f19257f.setVisibility(8);
            return;
        }
        C7990a0 a0Var3 = this.f10009f;
        if (a0Var3 == null) {
            C13706o.m87945v("binding");
            a0Var3 = null;
        }
        a0Var3.f19204d.f19257f.setCardBackgroundColor(ContextCompat.getColor(requireContext(), C17528R$color.auto_backup_primary));
        C7990a0 a0Var4 = this.f10009f;
        if (a0Var4 == null) {
            C13706o.m87945v("binding");
            a0Var4 = null;
        }
        a0Var4.f19204d.f19256e.setText(getString(C17541R$string.local_backup));
        try {
            C7990a0 a0Var5 = this.f10009f;
            if (a0Var5 == null) {
                C13706o.m87945v("binding");
                a0Var5 = null;
            }
            TextView textView = a0Var5.f19204d.f19254c;
            C13696i0 i0Var = C13696i0.f61931a;
            String string = getString(C17541R$string.auto_backup_info_card);
            C13706o.m87928e(string, "getString(R.string.auto_backup_info_card)");
            String format = String.format(string, Arrays.copyOf(new Object[]{14}, 1));
            C13706o.m87928e(format, "format(format, *args)");
            textView.setText(format);
        } catch (Exception unused) {
            C7990a0 a0Var6 = this.f10009f;
            if (a0Var6 == null) {
                C13706o.m87945v("binding");
                a0Var6 = null;
            }
            a0Var6.f19204d.f19254c.setText(getString(C17541R$string.auto_backup_info_card));
        }
        C7990a0 a0Var7 = this.f10009f;
        if (a0Var7 == null) {
            C13706o.m87945v("binding");
            a0Var7 = null;
        }
        Button button = a0Var7.f19204d.f19255d;
        C13706o.m87928e(button, "binding.infoCard.infoCardGotIt");
        C4666m.m18147o(button, (C13640g) null, new C3857b(this, (C13635d<? super C3857b>) null), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public static final void m15011f0(C3855d dVar, CompoundButton compoundButton, boolean z) {
        C13706o.m87929f(dVar, "this$0");
        dVar.mo27403e0().mo27416t(z);
        Context requireContext = dVar.requireContext();
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.getString(C17541R$string.local_backup));
        sb.append(" - ");
        sb.append(dVar.getString(z ? C17541R$string.enabled : C17541R$string.disabled));
        C15626c.m94876a(requireContext, sb.toString(), 0).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public static final void m15012g0(C3855d dVar, C10392a aVar, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(dVar, "this$0");
        C13706o.m87929f(aVar, "$backupFile");
        dVar.mo27403e0().mo27420y(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public static final void m15013h0(C3855d dVar, C10392a aVar, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(dVar, "this$0");
        C13706o.m87929f(aVar, "$backupFile");
        dVar.mo27403e0().mo27421z(aVar);
    }

    /* renamed from: B */
    public void mo27393B() {
        C7990a0 a0Var = this.f10009f;
        C7990a0 a0Var2 = null;
        if (a0Var == null) {
            C13706o.m87945v("binding");
            a0Var = null;
        }
        RecyclerView recyclerView = a0Var.f19206f;
        C13706o.m87928e(recyclerView, "binding.recyclerView");
        recyclerView.setVisibility(8);
        C7990a0 a0Var3 = this.f10009f;
        if (a0Var3 == null) {
            C13706o.m87945v("binding");
        } else {
            a0Var2 = a0Var3;
        }
        FrameLayout frameLayout = a0Var2.f19203c;
        C13706o.m87928e(frameLayout, "binding.emptyView");
        frameLayout.setVisibility(0);
    }

    /* renamed from: C */
    public void mo27394C() {
        Context context = getContext();
        if (context != null) {
            C12408a.C12409a.m83286b().mo68758c(-1).mo68759d(false).mo68757a();
            C12408a.m83284r(context, getString(C17541R$string.backup_file_restore_failed), (Drawable) null, ContextCompat.getColor(requireContext(), 2131100778), 1, false, true).show();
        }
    }

    /* renamed from: D */
    public void mo27395D(C10392a aVar) {
        C13706o.m87929f(aVar, "backupFile");
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.addFlags(268435456);
            intent.setType("text/plain");
            C6362a0.m24598d(requireContext(), intent, aVar.mo41077a());
            startActivity(Intent.createChooser(intent, getString(C17541R$string.share_file)));
        } catch (Exception e) {
            C15626c.makeText(requireContext(), C17541R$string.export_failed, 0).show();
            C4878b.m18868g("Failed to export file: " + e);
        }
    }

    /* renamed from: F */
    public void mo27396F(C10392a aVar) {
        C13706o.m87929f(aVar, "backupFile");
        String str = getString(C17541R$string.confirm_backup_delete) + "\n\n" + aVar.mo41077a().getName();
        String string = getString(C17541R$string.delete);
        C3861d dVar = new C3861d(this, aVar);
        FragmentActivity requireActivity = requireActivity();
        C13706o.m87925b(requireActivity, "requireActivity()");
        C2029c.m8416a(requireActivity, str, string, dVar).show();
    }

    /* renamed from: H */
    public void mo27397H() {
        String string = getString(C17541R$string.are_you_sure);
        C13706o.m87928e(string, "getString(R.string.are_you_sure)");
        String string2 = getString(C17541R$string.delete_all_backups);
        C3858c cVar = new C3858c(this);
        FragmentActivity requireActivity = requireActivity();
        C13706o.m87925b(requireActivity, "requireActivity()");
        C2029c.m8416a(requireActivity, string, string2, cVar).show();
    }

    /* renamed from: M */
    public void mo27398M(C10392a aVar) {
        C13706o.m87929f(aVar, "backupFile");
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        builder.setTitle(aVar.mo41077a().getName());
        builder.setMessage(C17541R$string.restore_backup_dialog_text);
        builder.setPositiveButton(C17541R$string.restore_backup, new C3852a(this, aVar));
        builder.setNeutralButton(C17541R$string.share_file, new C3853b(this, aVar));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.show();
    }

    /* renamed from: O */
    public void mo27399O() {
        Context context = getContext();
        if (context != null) {
            C12408a.C12409a.m83286b().mo68758c(-1).mo68759d(false).mo68757a();
            C12408a.m83284r(context, getString(C17541R$string.backup_file_restored), (Drawable) null, ContextCompat.getColor(requireContext(), 2131100650), 1, false, true).show();
        }
    }

    /* renamed from: P */
    public void mo27400P(boolean z) {
        C7990a0 a0Var = this.f10009f;
        if (a0Var == null) {
            C13706o.m87945v("binding");
            a0Var = null;
        }
        FrameLayout frameLayout = a0Var.f19205e;
        C13706o.m87928e(frameLayout, "binding.loadingView");
        frameLayout.setVisibility(z ? 0 : 8);
    }

    /* renamed from: Q */
    public void mo27401Q(List<C10392a> list) {
        C13706o.m87929f(list, "backupFiles");
        C7990a0 a0Var = this.f10009f;
        C7990a0 a0Var2 = null;
        if (a0Var == null) {
            C13706o.m87945v("binding");
            a0Var = null;
        }
        RecyclerView recyclerView = a0Var.f19206f;
        C13706o.m87928e(recyclerView, "binding.recyclerView");
        recyclerView.setVisibility(0);
        C7990a0 a0Var3 = this.f10009f;
        if (a0Var3 == null) {
            C13706o.m87945v("binding");
            a0Var3 = null;
        }
        FrameLayout frameLayout = a0Var3.f19203c;
        C13706o.m87928e(frameLayout, "binding.emptyView");
        frameLayout.setVisibility(8);
        C3797b bVar = new C3797b(list, mo27403e0());
        C7990a0 a0Var4 = this.f10009f;
        if (a0Var4 == null) {
            C13706o.m87945v("binding");
        } else {
            a0Var2 = a0Var4;
        }
        a0Var2.f19206f.setAdapter(bVar);
    }

    /* renamed from: S */
    public void mo27402S() {
        requireActivity().finish();
    }

    /* renamed from: U */
    public void mo26239U() {
        this.f10011o.clear();
    }

    /* renamed from: e0 */
    public final C3865f mo27403e0() {
        C3865f fVar = this.f10008d;
        if (fVar != null) {
            return fVar;
        }
        C13706o.m87945v("presenter");
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C13706o.m87929f(menu, "menu");
        C13706o.m87929f(menuInflater, "inflater");
        menuInflater.inflate(C17536R$menu.autobackup_menu, menu);
        View actionView = menu.findItem(C17532R$id.switch_enabled).getActionView();
        C13706o.m87927d(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SwitchCompat");
        SwitchCompat switchCompat = (SwitchCompat) actionView;
        this.f10010g = switchCompat;
        SwitchCompat switchCompat2 = null;
        if (switchCompat == null) {
            C13706o.m87945v("enabledSwitch");
            switchCompat = null;
        }
        switchCompat.setChecked(C5163j2.m20206m(requireContext()));
        SwitchCompat switchCompat3 = this.f10010g;
        if (switchCompat3 == null) {
            C13706o.m87945v("enabledSwitch");
        } else {
            switchCompat2 = switchCompat3;
        }
        switchCompat2.setOnCheckedChangeListener(new C3854c(this));
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C13706o.m87929f(layoutInflater, "inflater");
        C7990a0 c = C7990a0.m33290c(layoutInflater, viewGroup, false);
        C13706o.m87928e(c, "inflate(inflater, container, false)");
        this.f10009f = c;
        if (c == null) {
            C13706o.m87945v("binding");
            c = null;
        }
        return c.getRoot();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo26239U();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C13706o.m87929f(menuItem, "item");
        if (menuItem.getItemId() == 2131362462) {
            mo27403e0().mo27419w();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C13706o.m87929f(view, "view");
        super.onViewCreated(view, bundle);
        m15010a0();
        mo27403e0().mo40891n(this);
    }
}
