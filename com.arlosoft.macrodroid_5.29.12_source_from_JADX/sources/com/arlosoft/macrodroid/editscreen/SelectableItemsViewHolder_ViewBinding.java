package com.arlosoft.macrodroid.editscreen;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17532R$id;

public final class SelectableItemsViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SelectableItemsViewHolder f11639a;

    @UiThread
    public SelectableItemsViewHolder_ViewBinding(SelectableItemsViewHolder selectableItemsViewHolder, View view) {
        this.f11639a = selectableItemsViewHolder;
        selectableItemsViewHolder.topLevelContainer = (ViewGroup) Utils.findRequiredViewAsType(view, C17532R$id.topLevelContainer, "field 'topLevelContainer'", ViewGroup.class);
        selectableItemsViewHolder.topLevelExtrasContainer = (ViewGroup) Utils.findRequiredViewAsType(view, C17532R$id.topLevelExtrasContainer, "field 'topLevelExtrasContainer'", ViewGroup.class);
        selectableItemsViewHolder.constraintContainer = (ViewGroup) Utils.findRequiredViewAsType(view, C17532R$id.constraintContainer, "field 'constraintContainer'", ViewGroup.class);
        selectableItemsViewHolder.constraintLinkUnderAction = Utils.findRequiredView(view, C17532R$id.constraintLinkUnderAction, "field 'constraintLinkUnderAction'");
        selectableItemsViewHolder.dragHandle = Utils.findRequiredView(view, C17532R$id.dragHandle, "field 'dragHandle'");
        selectableItemsViewHolder.collapseExpandButton = (ImageView) Utils.findRequiredViewAsType(view, C17532R$id.collapse_expand_button, "field 'collapseExpandButton'", ImageView.class);
    }

    public void unbind() {
        SelectableItemsViewHolder selectableItemsViewHolder = this.f11639a;
        if (selectableItemsViewHolder != null) {
            this.f11639a = null;
            selectableItemsViewHolder.topLevelContainer = null;
            selectableItemsViewHolder.topLevelExtrasContainer = null;
            selectableItemsViewHolder.constraintContainer = null;
            selectableItemsViewHolder.constraintLinkUnderAction = null;
            selectableItemsViewHolder.dragHandle = null;
            selectableItemsViewHolder.collapseExpandButton = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
