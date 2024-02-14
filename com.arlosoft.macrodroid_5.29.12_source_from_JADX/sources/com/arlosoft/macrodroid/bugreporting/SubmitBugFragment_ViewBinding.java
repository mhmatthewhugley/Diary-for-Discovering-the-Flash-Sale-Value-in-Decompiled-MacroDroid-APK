package com.arlosoft.macrodroid.bugreporting;

import android.view.View;
import android.widget.EditText;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17532R$id;

public class SubmitBugFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SubmitBugFragment f10092a;

    /* renamed from: b */
    private View f10093b;

    /* renamed from: com.arlosoft.macrodroid.bugreporting.SubmitBugFragment_ViewBinding$a */
    class C3891a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ SubmitBugFragment f10094a;

        C3891a(SubmitBugFragment submitBugFragment) {
            this.f10094a = submitBugFragment;
        }

        public void doClick(View view) {
            this.f10094a.onFabClicked();
        }
    }

    @UiThread
    public SubmitBugFragment_ViewBinding(SubmitBugFragment submitBugFragment, View view) {
        this.f10092a = submitBugFragment;
        submitBugFragment.emailAddress = (EditText) Utils.findRequiredViewAsType(view, C17532R$id.email_address, "field 'emailAddress'", EditText.class);
        View findRequiredView = Utils.findRequiredView(view, C17532R$id.submit_bug, "method 'onFabClicked'");
        this.f10093b = findRequiredView;
        findRequiredView.setOnClickListener(new C3891a(submitBugFragment));
    }

    @CallSuper
    public void unbind() {
        SubmitBugFragment submitBugFragment = this.f10092a;
        if (submitBugFragment != null) {
            this.f10092a = null;
            submitBugFragment.emailAddress = null;
            this.f10093b.setOnClickListener((View.OnClickListener) null);
            this.f10093b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
