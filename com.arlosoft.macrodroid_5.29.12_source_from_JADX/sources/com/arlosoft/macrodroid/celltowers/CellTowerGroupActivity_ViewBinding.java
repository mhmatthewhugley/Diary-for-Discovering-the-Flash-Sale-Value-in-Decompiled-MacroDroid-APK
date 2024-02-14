package com.arlosoft.macrodroid.celltowers;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17532R$id;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CellTowerGroupActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CellTowerGroupActivity f10139a;

    /* renamed from: b */
    private View f10140b;

    /* renamed from: c */
    private View f10141c;

    /* renamed from: com.arlosoft.macrodroid.celltowers.CellTowerGroupActivity_ViewBinding$a */
    class C3905a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CellTowerGroupActivity f10142a;

        C3905a(CellTowerGroupActivity cellTowerGroupActivity) {
            this.f10142a = cellTowerGroupActivity;
        }

        public void doClick(View view) {
            this.f10142a.onCellTowerBgScanPressed(view);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.celltowers.CellTowerGroupActivity_ViewBinding$b */
    class C3906b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CellTowerGroupActivity f10144a;

        C3906b(CellTowerGroupActivity cellTowerGroupActivity) {
            this.f10144a = cellTowerGroupActivity;
        }

        public void doClick(View view) {
            this.f10144a.onScanningStopPressed(view);
        }
    }

    @UiThread
    public CellTowerGroupActivity_ViewBinding(CellTowerGroupActivity cellTowerGroupActivity, View view) {
        this.f10139a = cellTowerGroupActivity;
        cellTowerGroupActivity.m_cellTowerList = (ListView) Utils.findRequiredViewAsType(view, C17532R$id.cell_tower_list, "field 'm_cellTowerList'", ListView.class);
        cellTowerGroupActivity.m_fab = (FloatingActionButton) Utils.findRequiredViewAsType(view, C17532R$id.cell_tower_done_button, "field 'm_fab'", FloatingActionButton.class);
        cellTowerGroupActivity.m_scanningLayout = (ViewGroup) Utils.findRequiredViewAsType(view, C17532R$id.cell_tower_scanning_layout, "field 'm_scanningLayout'", ViewGroup.class);
        cellTowerGroupActivity.m_cellTowerCountText = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.cell_tower_count_text, "field 'm_cellTowerCountText'", TextView.class);
        cellTowerGroupActivity.m_scanningText = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.scanning_text, "field 'm_scanningText'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, C17532R$id.cell_tower_scan_bg_button, "field 'm_scanBgButton' and method 'onCellTowerBgScanPressed'");
        cellTowerGroupActivity.m_scanBgButton = (Button) Utils.castView(findRequiredView, C17532R$id.cell_tower_scan_bg_button, "field 'm_scanBgButton'", Button.class);
        this.f10140b = findRequiredView;
        findRequiredView.setOnClickListener(new C3905a(cellTowerGroupActivity));
        View findRequiredView2 = Utils.findRequiredView(view, C17532R$id.cell_tower_stop_scanning_button, "method 'onScanningStopPressed'");
        this.f10141c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C3906b(cellTowerGroupActivity));
    }

    @CallSuper
    public void unbind() {
        CellTowerGroupActivity cellTowerGroupActivity = this.f10139a;
        if (cellTowerGroupActivity != null) {
            this.f10139a = null;
            cellTowerGroupActivity.m_cellTowerList = null;
            cellTowerGroupActivity.m_fab = null;
            cellTowerGroupActivity.m_scanningLayout = null;
            cellTowerGroupActivity.m_cellTowerCountText = null;
            cellTowerGroupActivity.m_scanningText = null;
            cellTowerGroupActivity.m_scanBgButton = null;
            this.f10140b.setOnClickListener((View.OnClickListener) null);
            this.f10140b = null;
            this.f10141c.setOnClickListener((View.OnClickListener) null);
            this.f10141c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
