package com.arlosoft.macrodroid.wizard;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17532R$id;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class WizardActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private WizardActivity f15449a;

    /* renamed from: b */
    private View f15450b;

    /* renamed from: com.arlosoft.macrodroid.wizard.WizardActivity_ViewBinding$a */
    class C6651a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ WizardActivity f15451a;

        C6651a(WizardActivity wizardActivity) {
            this.f15451a = wizardActivity;
        }

        public void doClick(View view) {
            this.f15451a.onFabClicked();
        }
    }

    @UiThread
    public WizardActivity_ViewBinding(WizardActivity wizardActivity, View view) {
        this.f15449a = wizardActivity;
        wizardActivity.toolbarContainer = (ViewGroup) Utils.findRequiredViewAsType(view, C17532R$id.toolbar_container, "field 'toolbarContainer'", ViewGroup.class);
        wizardActivity.tabLayout = (TabLayout) Utils.findRequiredViewAsType(view, C17532R$id.tabbar, "field 'tabLayout'", TabLayout.class);
        wizardActivity.viewPager = (ViewPager) Utils.findRequiredViewAsType(view, C17532R$id.viewpager, "field 'viewPager'", ViewPager.class);
        wizardActivity.toolBar = (Toolbar) Utils.findRequiredViewAsType(view, 2131364057, "field 'toolBar'", Toolbar.class);
        View findRequiredView = Utils.findRequiredView(view, C17532R$id.fab, "field 'fab' and method 'onFabClicked'");
        wizardActivity.fab = (FloatingActionButton) Utils.castView(findRequiredView, C17532R$id.fab, "field 'fab'", FloatingActionButton.class);
        this.f15450b = findRequiredView;
        findRequiredView.setOnClickListener(new C6651a(wizardActivity));
        Resources resources = view.getContext().getResources();
        wizardActivity.wizardTabIconSize = resources.getDimensionPixelSize(C17529R$dimen.wizard_tab_icon_size);
        wizardActivity.wizardTabIconPadding = resources.getDimensionPixelSize(C17529R$dimen.wizard_tab_icon_padding);
    }

    @CallSuper
    public void unbind() {
        WizardActivity wizardActivity = this.f15449a;
        if (wizardActivity != null) {
            this.f15449a = null;
            wizardActivity.toolbarContainer = null;
            wizardActivity.tabLayout = null;
            wizardActivity.viewPager = null;
            wizardActivity.toolBar = null;
            wizardActivity.fab = null;
            this.f15450b.setOnClickListener((View.OnClickListener) null);
            this.f15450b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
