package com.arlosoft.macrodroid.plugins.pluginlist;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.arlosoft.macrodroid.C17523R$anim;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.plugins.comments.PluginCommentsActivity;
import com.arlosoft.macrodroid.plugins.data.PluginDetail;
import com.arlosoft.macrodroid.plugins.pluginlist.C5048q;
import com.arlosoft.macrodroid.templatestore.p071ui.profile.C5331h;
import com.arlosoft.macrodroid.user.signin.C6353g;
import com.arlosoft.macrodroid.utils.C6388h1;
import com.google.android.material.snackbar.SnackbarAnimate;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p058a3.C2229c;
import p130m2.C7899a;
import p154r0.C8184d;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16270q;

/* renamed from: com.arlosoft.macrodroid.plugins.pluginlist.j */
/* compiled from: PluginListFragment.kt */
public final class C5039j extends C8184d implements Observer {

    /* renamed from: z */
    public static final C5040a f12633z = new C5040a((C13695i) null);

    /* renamed from: d */
    public C5048q f12634d;

    /* renamed from: f */
    public C5331h f12635f;

    /* renamed from: g */
    public C6353g f12636g;

    /* renamed from: o */
    public C7899a f12637o;

    /* renamed from: p */
    private C5029a f12638p;

    /* renamed from: s */
    public Map<Integer, View> f12639s = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.plugins.pluginlist.j$a */
    /* compiled from: PluginListFragment.kt */
    public static final class C5040a {
        private C5040a() {
        }

        public /* synthetic */ C5040a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C5039j mo29913a(int i) {
            C5039j jVar = new C5039j();
            Bundle bundle = new Bundle();
            bundle.putSerializable("order_by_type", Integer.valueOf(i));
            jVar.setArguments(bundle);
            return jVar;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.plugins.pluginlist.j$b */
    /* compiled from: PluginListFragment.kt */
    static final class C5041b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ View $rootView;
        int label;
        final /* synthetic */ C5039j this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5041b(View view, C5039j jVar, C13635d<? super C5041b> dVar) {
            super(3, dVar);
            this.$rootView = view;
            this.this$0 = jVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5041b(this.$rootView, this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.$rootView.findViewById(C17532R$id.loadingView);
                C13706o.m87928e(lottieAnimationView, "rootView.loadingView");
                int i = 0;
                lottieAnimationView.setVisibility(0);
                LinearLayout linearLayout = (LinearLayout) this.$rootView.findViewById(C17532R$id.errorView);
                C13706o.m87928e(linearLayout, "rootView.errorView");
                linearLayout.setVisibility(8);
                C5048q B0 = this.this$0.mo29909B0();
                Bundle arguments = this.this$0.getArguments();
                if (arguments != null) {
                    i = arguments.getInt("order_by_type");
                }
                B0.mo29919p(i);
                this.this$0.m19451i0(this.$rootView);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: C0 */
    private final void m19436C0(View view) {
        this.f12638p = new C5029a(mo29909B0(), mo29912y0(), mo29911v0());
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C17532R$id.pluginList);
        C5029a aVar = this.f12638p;
        if (aVar == null) {
            C13706o.m87945v("adapter");
            aVar = null;
        }
        recyclerView.setAdapter(aVar);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(C17532R$id.loadingView);
        C13706o.m87928e(lottieAnimationView, "rootView.loadingView");
        lottieAnimationView.setVisibility(0);
        AppCompatButton appCompatButton = (AppCompatButton) view.findViewById(C17532R$id.retryButton);
        C13706o.m87928e(appCompatButton, "rootView.retryButton");
        C4666m.m18147o(appCompatButton, (C13640g) null, new C5041b(view, this, (C13635d<? super C5041b>) null), 1, (Object) null);
    }

    /* renamed from: D0 */
    private final void m19437D0(PluginDetail pluginDetail) {
        PluginCommentsActivity.C4978a aVar = PluginCommentsActivity.f12552G;
        Context requireContext = requireContext();
        C13706o.m87928e(requireContext, "requireContext()");
        startActivityForResult(aVar.mo29798a(requireContext, pluginDetail), 101);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.overridePendingTransition(C17523R$anim.up_from_bottom, 0);
        }
    }

    /* renamed from: E0 */
    private final void m19438E0(View view, C2229c cVar) {
        if (cVar == C2229c.LOADING) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(C17532R$id.loadingView);
            C13706o.m87928e(lottieAnimationView, "rootView.loadingView");
            lottieAnimationView.setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C17532R$id.errorView);
            C13706o.m87928e(linearLayout, "rootView.errorView");
            linearLayout.setVisibility(8);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(C17532R$id.pluginList);
            C13706o.m87928e(recyclerView, "rootView.pluginList");
            recyclerView.setVisibility(8);
        } else if (cVar == C2229c.ERROR) {
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) view.findViewById(C17532R$id.loadingView);
            C13706o.m87928e(lottieAnimationView2, "rootView.loadingView");
            lottieAnimationView2.setVisibility(8);
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(C17532R$id.errorView);
            C13706o.m87928e(linearLayout2, "rootView.errorView");
            linearLayout2.setVisibility(0);
            RecyclerView recyclerView2 = (RecyclerView) view.findViewById(C17532R$id.pluginList);
            C13706o.m87928e(recyclerView2, "rootView.pluginList");
            recyclerView2.setVisibility(8);
        } else {
            LottieAnimationView lottieAnimationView3 = (LottieAnimationView) view.findViewById(C17532R$id.loadingView);
            C13706o.m87928e(lottieAnimationView3, "rootView.loadingView");
            lottieAnimationView3.setVisibility(8);
            LinearLayout linearLayout3 = (LinearLayout) view.findViewById(C17532R$id.errorView);
            C13706o.m87928e(linearLayout3, "rootView.errorView");
            linearLayout3.setVisibility(8);
            RecyclerView recyclerView3 = (RecyclerView) view.findViewById(C17532R$id.pluginList);
            C13706o.m87928e(recyclerView3, "rootView.pluginList");
            recyclerView3.setVisibility(0);
        }
    }

    /* renamed from: F0 */
    private final void m19439F0(PluginDetail pluginDetail) {
        String string = getString(C17541R$string.edit_macro);
        C13706o.m87928e(string, "getString(R.string.edit_macro)");
        String lowerCase = string.toLowerCase(Locale.ROOT);
        C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String unused = C15176v.m93635p(lowerCase);
        String[] strArr = {getString(C17541R$string.copy_web_link), getString(C17541R$string.plugin_report_broken_download), getString(C17541R$string.plugin_report_non_valid_plugin)};
        new AlertDialog.Builder(requireActivity(), C17542R$style.Theme_App_Dialog_Template).setTitle((CharSequence) pluginDetail.getName()).setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C5033d(strArr, this, pluginDetail)).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: G0 */
    public static final void m19440G0(String[] strArr, C5039j jVar, PluginDetail pluginDetail, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(strArr, "$options");
        C13706o.m87929f(jVar, "this$0");
        C13706o.m87929f(pluginDetail, "$pluginDetail");
        String str = strArr[i];
        C13706o.m87928e(str, "options[index]");
        if (C13706o.m87924a(str, jVar.getString(C17541R$string.copy_web_link))) {
            jVar.m19460u0(pluginDetail.getDownloadLink());
        } else if (C13706o.m87924a(str, jVar.getString(C17541R$string.plugin_report_broken_download))) {
            jVar.m19456p0(pluginDetail);
        } else if (C13706o.m87924a(str, jVar.getString(C17541R$string.plugin_report_non_valid_plugin))) {
            jVar.m19458r0(pluginDetail);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H0 */
    public static final void m19441H0(C5039j jVar, View view) {
        C13706o.m87929f(jVar, "this$0");
        C6353g A0 = jVar.mo29908A0();
        FragmentActivity requireActivity = jVar.requireActivity();
        C13706o.m87928e(requireActivity, "requireActivity()");
        A0.mo32405s(requireActivity);
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public final void m19451i0(View view) {
        mo29909B0().mo29916l().observe(getViewLifecycleOwner(), new C5038i(this, view));
        mo29909B0().mo29917n().observe(getViewLifecycleOwner(), new C5035f(this));
        C6388h1<PluginDetail> k = mo29909B0().mo29915k();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        C13706o.m87928e(viewLifecycleOwner, "viewLifecycleOwner");
        k.observe(viewLifecycleOwner, new C5036g(this));
        C6388h1<C5048q.C5050b> o = mo29909B0().mo29918o();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        C13706o.m87928e(viewLifecycleOwner2, "viewLifecycleOwner");
        o.observe(viewLifecycleOwner2, new C5037h(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public static final void m19452j0(C5039j jVar, View view, C2229c cVar) {
        C13706o.m87929f(jVar, "this$0");
        C13706o.m87929f(view, "$rootView");
        C13706o.m87928e(cVar, "it");
        jVar.m19438E0(view, cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public static final void m19453m0(C5039j jVar, PagedList pagedList) {
        C13706o.m87929f(jVar, "this$0");
        C13706o.m87928e(pagedList, "it");
        if (!pagedList.isEmpty()) {
            C5029a aVar = jVar.f12638p;
            if (aVar == null) {
                C13706o.m87945v("adapter");
                aVar = null;
            }
            aVar.submitList(pagedList);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public static final void m19454n0(C5039j jVar, PluginDetail pluginDetail) {
        C13706o.m87929f(jVar, "this$0");
        if (pluginDetail != null) {
            jVar.m19437D0(pluginDetail);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public static final void m19455o0(C5039j jVar, C5048q.C5050b bVar) {
        C13706o.m87929f(jVar, "this$0");
        C5029a aVar = null;
        if (bVar instanceof C5048q.C5050b.C5055e) {
            jVar.m19461w0();
            C5029a aVar2 = jVar.f12638p;
            if (aVar2 == null) {
                C13706o.m87945v("adapter");
            } else {
                aVar = aVar2;
            }
            aVar.notifyDataSetChanged();
        } else if (bVar instanceof C5048q.C5050b.C5051a) {
            C5029a aVar3 = jVar.f12638p;
            if (aVar3 == null) {
                C13706o.m87945v("adapter");
            } else {
                aVar = aVar3;
            }
            aVar.notifyDataSetChanged();
        } else if (bVar instanceof C5048q.C5050b.C5054d) {
            jVar.m19439F0(((C5048q.C5050b.C5054d) bVar).mo29927a());
        } else if (bVar instanceof C5048q.C5050b.C5053c) {
            C15626c.makeText(jVar.requireActivity().getApplicationContext(), C17541R$string.report_submitted, 1).show();
        } else if (bVar instanceof C5048q.C5050b.C5052b) {
            C15626c.makeText(jVar.requireActivity().getApplicationContext(), C17541R$string.error, 1).show();
        }
    }

    /* renamed from: p0 */
    private final void m19456p0(PluginDetail pluginDetail) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        builder.setTitle((CharSequence) pluginDetail.getName());
        builder.setMessage((int) C17541R$string.plugin_report_broken_download_confirm);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C5032c(this, pluginDetail));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public static final void m19457q0(C5039j jVar, PluginDetail pluginDetail, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(jVar, "this$0");
        C13706o.m87929f(pluginDetail, "$pluginDetail");
        C13706o.m87929f(dialogInterface, "<anonymous parameter 0>");
        jVar.mo29909B0().mo29923t(pluginDetail);
    }

    /* renamed from: r0 */
    private final void m19458r0(PluginDetail pluginDetail) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        builder.setTitle((CharSequence) pluginDetail.getName());
        builder.setMessage((int) C17541R$string.plugin_report_non_valid_plugin_confirm);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C5031b(this, pluginDetail));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public static final void m19459s0(C5039j jVar, PluginDetail pluginDetail, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(jVar, "this$0");
        C13706o.m87929f(pluginDetail, "$pluginDetail");
        C13706o.m87929f(dialogInterface, "<anonymous parameter 0>");
        jVar.mo29909B0().mo29924u(pluginDetail);
    }

    /* renamed from: u0 */
    private final void m19460u0(String str) {
        FragmentActivity activity = getActivity();
        Context context = null;
        Object systemService = activity != null ? activity.getSystemService("clipboard") : null;
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setText(str);
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            context = activity2.getApplicationContext();
        }
        C15626c.makeText(context, C17541R$string.link_copied_to_clipboard, 0).show();
    }

    /* renamed from: w0 */
    private final void m19461w0() {
        SnackbarAnimate h = SnackbarAnimate.m69573h(requireView(), C17541R$string.please_sign_in_to_submit_and_rate_new_plugins, SamsungIrisUnlockModule.IRIS_ERROR_NEED_TO_RETRY);
        C13706o.m87928e(h, "make(requireView(), R.st…d_rate_new_plugins, 5000)");
        h.mo58921e().setBackgroundResource(2131100690);
        View findViewById = h.mo58921e().findViewById(2131363815);
        C13706o.m87927d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setTextColor(-1);
        View findViewById2 = h.mo58921e().findViewById(2131363814);
        C13706o.m87927d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById2).setTextColor(-1);
        h.mo58926l(C17541R$string.sign_in, new C5034e(this));
        h.mo58932r();
    }

    /* renamed from: A0 */
    public final C6353g mo29908A0() {
        C6353g gVar = this.f12636g;
        if (gVar != null) {
            return gVar;
        }
        C13706o.m87945v("signInHelper");
        return null;
    }

    /* renamed from: B0 */
    public final C5048q mo29909B0() {
        C5048q qVar = this.f12634d;
        if (qVar != null) {
            return qVar;
        }
        C13706o.m87945v("viewModel");
        return null;
    }

    /* renamed from: U */
    public void mo26239U() {
        this.f12639s.clear();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 101 && i2 == -1) {
            boolean z = true;
            if (intent == null || !intent.getBooleanExtra("sign_in", false)) {
                z = false;
            }
            if (z) {
                C6353g A0 = mo29908A0();
                FragmentActivity requireActivity = requireActivity();
                C13706o.m87928e(requireActivity, "requireActivity()");
                A0.mo32405s(requireActivity);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C13706o.m87929f(layoutInflater, "inflater");
        int i = 0;
        View inflate = layoutInflater.inflate(C17535R$layout.fragment_plugin_list, viewGroup, false);
        C5048q B0 = mo29909B0();
        Bundle arguments = getArguments();
        if (arguments != null) {
            i = arguments.getInt("order_by_type");
        }
        B0.mo29919p(i);
        C13706o.m87928e(inflate, "view");
        m19436C0(inflate);
        m19451i0(inflate);
        return inflate;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo26239U();
    }

    public void onResume() {
        super.onResume();
        C5029a aVar = this.f12638p;
        if (aVar == null) {
            C13706o.m87945v("adapter");
            aVar = null;
        }
        aVar.notifyDataSetChanged();
    }

    public void update(Observable observable, Object obj) {
        mo29909B0().mo29920q();
    }

    /* renamed from: v0 */
    public final C7899a mo29911v0() {
        C7899a aVar = this.f12637o;
        if (aVar != null) {
            return aVar;
        }
        C13706o.m87945v("pluginListOverrideStore");
        return null;
    }

    /* renamed from: y0 */
    public final C5331h mo29912y0() {
        C5331h hVar = this.f12635f;
        if (hVar != null) {
            return hVar;
        }
        C13706o.m87945v("profileImageProvider");
        return null;
    }
}
