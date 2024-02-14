package com.arlosoft.macrodroid.wizard;

import android.view.View;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;

public final class WizardFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private WizardFragment f15466a;

    @UiThread
    public WizardFragment_ViewBinding(WizardFragment wizardFragment, View view) {
        this.f15466a = wizardFragment;
        wizardFragment.recyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, 2131363593, "field 'recyclerView'", RecyclerView.class);
    }

    public void unbind() {
        WizardFragment wizardFragment = this.f15466a;
        if (wizardFragment != null) {
            this.f15466a = null;
            wizardFragment.recyclerView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
