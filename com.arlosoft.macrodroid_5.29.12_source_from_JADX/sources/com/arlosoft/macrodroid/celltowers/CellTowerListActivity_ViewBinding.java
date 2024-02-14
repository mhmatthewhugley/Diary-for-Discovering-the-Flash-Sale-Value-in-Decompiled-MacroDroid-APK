package com.arlosoft.macrodroid.celltowers;

import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17532R$id;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CellTowerListActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CellTowerListActivity f10159a;

    /* renamed from: b */
    private View f10160b;

    /* renamed from: com.arlosoft.macrodroid.celltowers.CellTowerListActivity_ViewBinding$a */
    class C3911a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CellTowerListActivity f10161a;

        C3911a(CellTowerListActivity cellTowerListActivity) {
            this.f10161a = cellTowerListActivity;
        }

        public void doClick(View view) {
            this.f10161a.addGeofenceButtonClick();
        }
    }

    @UiThread
    public CellTowerListActivity_ViewBinding(CellTowerListActivity cellTowerListActivity, View view) {
        this.f10159a = cellTowerListActivity;
        View findRequiredView = Utils.findRequiredView(view, C17532R$id.cell_tower_add_button, "field 'm_addCellTowerButton' and method 'addGeofenceButtonClick'");
        cellTowerListActivity.m_addCellTowerButton = (FloatingActionButton) Utils.castView(findRequiredView, C17532R$id.cell_tower_add_button, "field 'm_addCellTowerButton'", FloatingActionButton.class);
        this.f10160b = findRequiredView;
        findRequiredView.setOnClickListener(new C3911a(cellTowerListActivity));
        cellTowerListActivity.m_groupList = (ListView) Utils.findRequiredViewAsType(view, C17532R$id.cell_tower_group_list, "field 'm_groupList'", ListView.class);
        cellTowerListActivity.infoCardView = (CardView) Utils.findRequiredViewAsType(view, C17532R$id.infoCardView, "field 'infoCardView'", CardView.class);
        cellTowerListActivity.infoCardTitle = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.infoCardTitle, "field 'infoCardTitle'", TextView.class);
        cellTowerListActivity.infoCardDetail = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.infoCardDetail, "field 'infoCardDetail'", TextView.class);
        cellTowerListActivity.infoCardGotIt = (Button) Utils.findRequiredViewAsType(view, C17532R$id.infoCardGotIt, "field 'infoCardGotIt'", Button.class);
    }

    @CallSuper
    public void unbind() {
        CellTowerListActivity cellTowerListActivity = this.f10159a;
        if (cellTowerListActivity != null) {
            this.f10159a = null;
            cellTowerListActivity.m_addCellTowerButton = null;
            cellTowerListActivity.m_groupList = null;
            cellTowerListActivity.infoCardView = null;
            cellTowerListActivity.infoCardTitle = null;
            cellTowerListActivity.infoCardDetail = null;
            cellTowerListActivity.infoCardGotIt = null;
            this.f10160b.setOnClickListener((View.OnClickListener) null);
            this.f10160b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
