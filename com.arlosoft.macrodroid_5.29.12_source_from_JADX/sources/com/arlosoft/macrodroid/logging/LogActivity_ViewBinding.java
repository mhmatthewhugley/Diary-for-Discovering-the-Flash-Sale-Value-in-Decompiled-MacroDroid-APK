package com.arlosoft.macrodroid.logging;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.airbnb.lottie.LottieAnimationView;
import com.arlosoft.macrodroid.C17532R$id;

public class LogActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private LogActivity f12220a;

    @UiThread
    public LogActivity_ViewBinding(LogActivity logActivity, View view) {
        this.f12220a = logActivity;
        logActivity.recyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, 2131363593, "field 'recyclerView'", RecyclerView.class);
        logActivity.viewFlipper = (ViewFlipper) Utils.findRequiredViewAsType(view, C17532R$id.view_flipper, "field 'viewFlipper'", ViewFlipper.class);
        logActivity.infoCardView = (CardView) Utils.findRequiredViewAsType(view, C17532R$id.infoCardView, "field 'infoCardView'", CardView.class);
        logActivity.infoCardTitle = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.infoCardTitle, "field 'infoCardTitle'", TextView.class);
        logActivity.infoCardDetail = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.infoCardDetail, "field 'infoCardDetail'", TextView.class);
        logActivity.infoCardGotIt = (Button) Utils.findRequiredViewAsType(view, C17532R$id.infoCardGotIt, "field 'infoCardGotIt'", Button.class);
        logActivity.emptyView = (LottieAnimationView) Utils.findRequiredViewAsType(view, C17532R$id.animation_view, "field 'emptyView'", LottieAnimationView.class);
    }

    @CallSuper
    public void unbind() {
        LogActivity logActivity = this.f12220a;
        if (logActivity != null) {
            this.f12220a = null;
            logActivity.recyclerView = null;
            logActivity.viewFlipper = null;
            logActivity.infoCardView = null;
            logActivity.infoCardTitle = null;
            logActivity.infoCardDetail = null;
            logActivity.infoCardGotIt = null;
            logActivity.emptyView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
