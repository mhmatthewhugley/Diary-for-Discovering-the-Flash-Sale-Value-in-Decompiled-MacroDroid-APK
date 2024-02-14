package com.arlosoft.macrodroid.bugreporting;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.extensions.C4657d;
import com.arlosoft.macrodroid.extensions.C4666m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import org.apmem.tools.layouts.FlowLayout;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16270q;

/* compiled from: BugDetailsFragment.kt */
public final class BugDetailsFragment extends Fragment {

    /* renamed from: d */
    public static final C3880a f10066d = new C3880a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ArrayList<Uri> f10067a = new ArrayList<>();

    /* renamed from: c */
    public Map<Integer, View> f10068c = new LinkedHashMap();
    @BindView(2131362475)
    public EditText descriptionText;
    @BindView(2131363675)
    public FlowLayout screenshotsContainer;

    /* renamed from: com.arlosoft.macrodroid.bugreporting.BugDetailsFragment$a */
    /* compiled from: BugDetailsFragment.kt */
    public static final class C3880a {
        private C3880a() {
        }

        public /* synthetic */ C3880a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final BugDetailsFragment mo27483a() {
            return new BugDetailsFragment();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.bugreporting.BugDetailsFragment$b */
    /* compiled from: BugDetailsFragment.kt */
    static final class C3881b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Uri $uri;
        int label;
        final /* synthetic */ BugDetailsFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3881b(BugDetailsFragment bugDetailsFragment, Uri uri, C13635d<? super C3881b> dVar) {
            super(3, dVar);
            this.this$0 = bugDetailsFragment;
            this.$uri = uri;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3881b(this.this$0, this.$uri, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.f10067a.remove(this.$uri);
                this.this$0.m15125g0();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.bugreporting.BugDetailsFragment$c */
    /* compiled from: BugDetailsFragment.kt */
    static final class C3882c extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ BugDetailsFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3882c(BugDetailsFragment bugDetailsFragment, C13635d<? super C3882c> dVar) {
            super(3, dVar);
            this.this$0 = bugDetailsFragment;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3882c(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m15124f0();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: Z */
    private final void m15123Z() {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        builder.setTitle((CharSequence) getString(C17541R$string.error));
        builder.setMessage((int) C17541R$string.please_enter_a_detailed_description);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) null);
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public final void m15124f0() {
        Intent intent = new Intent();
        intent.setType("image/*");
        C13706o.m87928e(intent.setAction("android.intent.action.GET_CONTENT"), "i.setAction(Intent.ACTION_GET_CONTENT)");
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public final void m15125g0() {
        mo27481e0().removeAllViews();
        Iterator<Uri> it = this.f10067a.iterator();
        while (it.hasNext()) {
            Uri next = it.next();
            View inflate = getLayoutInflater().inflate(C17535R$layout.view_report_bug_screenshot, mo27481e0(), false);
            ((ImageView) inflate.findViewById(C17532R$id.screenshotImage)).setImageURI(next);
            C13706o.m87928e(inflate, "screenshotButton");
            C4666m.m18147o(inflate, (C13640g) null, new C3881b(this, next, (C13635d<? super C3881b>) null), 1, (Object) null);
            mo27481e0().addView(inflate);
        }
        ImageButton imageButton = new ImageButton(getContext());
        imageButton.setLayoutParams(new LinearLayout.LayoutParams(C4657d.m18117b(56), C4657d.m18117b(56)));
        imageButton.setImageResource(C17530R$drawable.ic_plus_white_24dp);
        C4666m.m18147o(imageButton, (C13640g) null, new C3882c(this, (C13635d<? super C3882c>) null), 1, (Object) null);
        mo27481e0().addView(imageButton);
    }

    /* renamed from: U */
    public void mo27479U() {
        this.f10068c.clear();
    }

    /* renamed from: a0 */
    public final EditText mo27480a0() {
        EditText editText = this.descriptionText;
        if (editText != null) {
            return editText;
        }
        C13706o.m87945v("descriptionText");
        return null;
    }

    /* renamed from: e0 */
    public final FlowLayout mo27481e0() {
        FlowLayout flowLayout = this.screenshotsContainer;
        if (flowLayout != null) {
            return flowLayout;
        }
        C13706o.m87945v("screenshotsContainer");
        return null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            Uri data = intent != null ? intent.getData() : null;
            if (data != null) {
                this.f10067a.add(data);
                m15125g0();
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C13706o.m87929f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C17535R$layout.fragment_bug_detail, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        m15125g0();
        return inflate;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo27479U();
    }

    @OnClick({2131362390})
    public final void onFabClicked() {
        if (mo27480a0().length() < 50) {
            m15123Z();
            return;
        }
        ReportBugActivity reportBugActivity = (ReportBugActivity) getActivity();
        C13706o.m87926c(reportBugActivity);
        reportBugActivity.mo27486X1(mo27480a0().getText().toString(), this.f10067a);
    }
}
