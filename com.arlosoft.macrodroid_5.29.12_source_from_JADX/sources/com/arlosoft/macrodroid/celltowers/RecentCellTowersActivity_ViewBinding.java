package com.arlosoft.macrodroid.celltowers;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17532R$id;

public final class RecentCellTowersActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RecentCellTowersActivity f10194a;

    @UiThread
    public RecentCellTowersActivity_ViewBinding(RecentCellTowersActivity recentCellTowersActivity, View view) {
        this.f10194a = recentCellTowersActivity;
        recentCellTowersActivity.recyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, 2131363593, "field 'recyclerView'", RecyclerView.class);
        recentCellTowersActivity.infoCard = (CardView) Utils.findRequiredViewAsType(view, C17532R$id.infoCard, "field 'infoCard'", CardView.class);
        recentCellTowersActivity.infoCardTitle = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.infoCardTitle, "field 'infoCardTitle'", TextView.class);
        recentCellTowersActivity.infoCardDetail = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.infoCardDetail, "field 'infoCardDetail'", TextView.class);
        recentCellTowersActivity.infoCardGotit = (Button) Utils.findRequiredViewAsType(view, C17532R$id.infoCardGotIt, "field 'infoCardGotit'", Button.class);
        recentCellTowersActivity.emptyView = (ViewGroup) Utils.findRequiredViewAsType(view, C17532R$id.emptyView, "field 'emptyView'", ViewGroup.class);
        recentCellTowersActivity.loadingView = (ViewGroup) Utils.findRequiredViewAsType(view, C17532R$id.loadingView, "field 'loadingView'", ViewGroup.class);
    }

    public void unbind() {
        RecentCellTowersActivity recentCellTowersActivity = this.f10194a;
        if (recentCellTowersActivity != null) {
            this.f10194a = null;
            recentCellTowersActivity.recyclerView = null;
            recentCellTowersActivity.infoCard = null;
            recentCellTowersActivity.infoCardTitle = null;
            recentCellTowersActivity.infoCardDetail = null;
            recentCellTowersActivity.infoCardGotit = null;
            recentCellTowersActivity.emptyView = null;
            recentCellTowersActivity.loadingView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
