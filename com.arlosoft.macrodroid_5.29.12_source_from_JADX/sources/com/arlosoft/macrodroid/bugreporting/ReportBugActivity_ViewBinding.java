package com.arlosoft.macrodroid.bugreporting;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.UiThread;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17532R$id;

public final class ReportBugActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ReportBugActivity f10086a;

    @UiThread
    public ReportBugActivity_ViewBinding(ReportBugActivity reportBugActivity, View view) {
        this.f10086a = reportBugActivity;
        reportBugActivity.viewPager = (ViewPager) Utils.findRequiredViewAsType(view, C17532R$id.viewPager, "field 'viewPager'", ViewPager.class);
        reportBugActivity.loadingView = (ViewGroup) Utils.findRequiredViewAsType(view, C17532R$id.loading_view, "field 'loadingView'", ViewGroup.class);
    }

    public void unbind() {
        ReportBugActivity reportBugActivity = this.f10086a;
        if (reportBugActivity != null) {
            this.f10086a = null;
            reportBugActivity.viewPager = null;
            reportBugActivity.loadingView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
