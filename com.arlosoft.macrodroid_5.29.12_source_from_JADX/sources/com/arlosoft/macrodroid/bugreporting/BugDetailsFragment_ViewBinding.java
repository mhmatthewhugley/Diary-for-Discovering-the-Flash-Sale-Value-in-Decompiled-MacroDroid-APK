package com.arlosoft.macrodroid.bugreporting;

import android.view.View;
import android.widget.EditText;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17532R$id;
import org.apmem.tools.layouts.FlowLayout;

public final class BugDetailsFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BugDetailsFragment f10069a;

    /* renamed from: b */
    private View f10070b;

    /* renamed from: com.arlosoft.macrodroid.bugreporting.BugDetailsFragment_ViewBinding$a */
    class C3883a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ BugDetailsFragment f10071a;

        C3883a(BugDetailsFragment bugDetailsFragment) {
            this.f10071a = bugDetailsFragment;
        }

        public void doClick(View view) {
            this.f10071a.onFabClicked();
        }
    }

    @UiThread
    public BugDetailsFragment_ViewBinding(BugDetailsFragment bugDetailsFragment, View view) {
        this.f10069a = bugDetailsFragment;
        bugDetailsFragment.descriptionText = (EditText) Utils.findRequiredViewAsType(view, C17532R$id.description_text, "field 'descriptionText'", EditText.class);
        bugDetailsFragment.screenshotsContainer = (FlowLayout) Utils.findRequiredViewAsType(view, C17532R$id.screenshotsContainer, "field 'screenshotsContainer'", FlowLayout.class);
        View findRequiredView = Utils.findRequiredView(view, C17532R$id.continueButton, "method 'onFabClicked'");
        this.f10070b = findRequiredView;
        findRequiredView.setOnClickListener(new C3883a(bugDetailsFragment));
    }

    public void unbind() {
        BugDetailsFragment bugDetailsFragment = this.f10069a;
        if (bugDetailsFragment != null) {
            this.f10069a = null;
            bugDetailsFragment.descriptionText = null;
            bugDetailsFragment.screenshotsContainer = null;
            this.f10070b.setOnClickListener((View.OnClickListener) null);
            this.f10070b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
