package com.arlosoft.macrodroid.stopwatch;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17532R$id;

public class StopWatchesActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private StopWatchesActivity f13031a;

    /* renamed from: b */
    private View f13032b;

    /* renamed from: com.arlosoft.macrodroid.stopwatch.StopWatchesActivity_ViewBinding$a */
    class C5217a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ StopWatchesActivity f13033a;

        C5217a(StopWatchesActivity stopWatchesActivity) {
            this.f13033a = stopWatchesActivity;
        }

        public void doClick(View view) {
            this.f13033a.onPlusButtonClicked();
        }
    }

    @UiThread
    public StopWatchesActivity_ViewBinding(StopWatchesActivity stopWatchesActivity, View view) {
        this.f13031a = stopWatchesActivity;
        stopWatchesActivity.recyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, 2131363593, "field 'recyclerView'", RecyclerView.class);
        stopWatchesActivity.viewFlipper = (ViewFlipper) Utils.findRequiredViewAsType(view, C17532R$id.view_flipper, "field 'viewFlipper'", ViewFlipper.class);
        stopWatchesActivity.infoCardView = (CardView) Utils.findRequiredViewAsType(view, C17532R$id.infoCardView, "field 'infoCardView'", CardView.class);
        stopWatchesActivity.infoCardTitle = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.infoCardTitle, "field 'infoCardTitle'", TextView.class);
        stopWatchesActivity.infoCardDetail = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.infoCardDetail, "field 'infoCardDetail'", TextView.class);
        stopWatchesActivity.infoCardGotIt = (Button) Utils.findRequiredViewAsType(view, C17532R$id.infoCardGotIt, "field 'infoCardGotIt'", Button.class);
        View findRequiredView = Utils.findRequiredView(view, C17532R$id.fab, "method 'onPlusButtonClicked'");
        this.f13032b = findRequiredView;
        findRequiredView.setOnClickListener(new C5217a(stopWatchesActivity));
    }

    @CallSuper
    public void unbind() {
        StopWatchesActivity stopWatchesActivity = this.f13031a;
        if (stopWatchesActivity != null) {
            this.f13031a = null;
            stopWatchesActivity.recyclerView = null;
            stopWatchesActivity.viewFlipper = null;
            stopWatchesActivity.infoCardView = null;
            stopWatchesActivity.infoCardTitle = null;
            stopWatchesActivity.infoCardDetail = null;
            stopWatchesActivity.infoCardGotIt = null;
            this.f13032b.setOnClickListener((View.OnClickListener) null);
            this.f13032b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
