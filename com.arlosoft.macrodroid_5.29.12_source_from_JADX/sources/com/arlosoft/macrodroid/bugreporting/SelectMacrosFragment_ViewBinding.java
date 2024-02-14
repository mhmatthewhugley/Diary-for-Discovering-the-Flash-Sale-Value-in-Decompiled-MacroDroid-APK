package com.arlosoft.macrodroid.bugreporting;

import android.view.View;
import android.widget.ListView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17532R$id;

public class SelectMacrosFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SelectMacrosFragment f10088a;

    /* renamed from: b */
    private View f10089b;

    /* renamed from: com.arlosoft.macrodroid.bugreporting.SelectMacrosFragment_ViewBinding$a */
    class C3890a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ SelectMacrosFragment f10090a;

        C3890a(SelectMacrosFragment selectMacrosFragment) {
            this.f10090a = selectMacrosFragment;
        }

        public void doClick(View view) {
            this.f10090a.onFabClicked();
        }
    }

    @UiThread
    public SelectMacrosFragment_ViewBinding(SelectMacrosFragment selectMacrosFragment, View view) {
        this.f10088a = selectMacrosFragment;
        selectMacrosFragment.macroListView = (ListView) Utils.findRequiredViewAsType(view, C17532R$id.macro_list, "field 'macroListView'", ListView.class);
        View findRequiredView = Utils.findRequiredView(view, C17532R$id.continueButton, "method 'onFabClicked'");
        this.f10089b = findRequiredView;
        findRequiredView.setOnClickListener(new C3890a(selectMacrosFragment));
    }

    @CallSuper
    public void unbind() {
        SelectMacrosFragment selectMacrosFragment = this.f10088a;
        if (selectMacrosFragment != null) {
            this.f10088a = null;
            selectMacrosFragment.macroListView = null;
            this.f10089b.setOnClickListener((View.OnClickListener) null);
            this.f10089b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
