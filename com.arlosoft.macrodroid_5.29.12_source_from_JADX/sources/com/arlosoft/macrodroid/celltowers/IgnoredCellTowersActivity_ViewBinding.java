package com.arlosoft.macrodroid.celltowers;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17532R$id;

public class IgnoredCellTowersActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private IgnoredCellTowersActivity f10174a;

    /* renamed from: b */
    private View f10175b;

    /* renamed from: com.arlosoft.macrodroid.celltowers.IgnoredCellTowersActivity_ViewBinding$a */
    class C3913a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ IgnoredCellTowersActivity f10176a;

        C3913a(IgnoredCellTowersActivity ignoredCellTowersActivity) {
            this.f10176a = ignoredCellTowersActivity;
        }

        public void doClick(View view) {
            this.f10176a.onAddTowerButtonClick();
        }
    }

    @UiThread
    public IgnoredCellTowersActivity_ViewBinding(IgnoredCellTowersActivity ignoredCellTowersActivity, View view) {
        this.f10174a = ignoredCellTowersActivity;
        ignoredCellTowersActivity.recyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, 2131363593, "field 'recyclerView'", RecyclerView.class);
        ignoredCellTowersActivity.infoCard = (CardView) Utils.findRequiredViewAsType(view, C17532R$id.infoCard, "field 'infoCard'", CardView.class);
        ignoredCellTowersActivity.infoCardTitle = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.infoCardTitle, "field 'infoCardTitle'", TextView.class);
        ignoredCellTowersActivity.infoCardDetail = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.infoCardDetail, "field 'infoCardDetail'", TextView.class);
        ignoredCellTowersActivity.infoCardGotit = (Button) Utils.findRequiredViewAsType(view, C17532R$id.infoCardGotIt, "field 'infoCardGotit'", Button.class);
        ignoredCellTowersActivity.emptyView = (ViewGroup) Utils.findRequiredViewAsType(view, C17532R$id.emptyView, "field 'emptyView'", ViewGroup.class);
        View findRequiredView = Utils.findRequiredView(view, C17532R$id.addTowerButton, "method 'onAddTowerButtonClick'");
        this.f10175b = findRequiredView;
        findRequiredView.setOnClickListener(new C3913a(ignoredCellTowersActivity));
    }

    @CallSuper
    public void unbind() {
        IgnoredCellTowersActivity ignoredCellTowersActivity = this.f10174a;
        if (ignoredCellTowersActivity != null) {
            this.f10174a = null;
            ignoredCellTowersActivity.recyclerView = null;
            ignoredCellTowersActivity.infoCard = null;
            ignoredCellTowersActivity.infoCardTitle = null;
            ignoredCellTowersActivity.infoCardDetail = null;
            ignoredCellTowersActivity.infoCardGotit = null;
            ignoredCellTowersActivity.emptyView = null;
            this.f10175b.setOnClickListener((View.OnClickListener) null);
            this.f10175b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
