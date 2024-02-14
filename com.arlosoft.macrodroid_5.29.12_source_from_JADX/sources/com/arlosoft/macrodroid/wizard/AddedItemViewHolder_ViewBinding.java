package com.arlosoft.macrodroid.wizard;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17532R$id;

public class AddedItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AddedItemViewHolder f15428a;

    @UiThread
    public AddedItemViewHolder_ViewBinding(AddedItemViewHolder addedItemViewHolder, View view) {
        this.f15428a = addedItemViewHolder;
        addedItemViewHolder.cardView = (CardView) Utils.findRequiredViewAsType(view, C17532R$id.infoCardView, "field 'cardView'", CardView.class);
        addedItemViewHolder.listLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C17532R$id.items_list, "field 'listLayout'", LinearLayout.class);
        addedItemViewHolder.emptyText = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.empty_text, "field 'emptyText'", TextView.class);
        addedItemViewHolder.constraintSpinner = (Spinner) Utils.findRequiredViewAsType(view, C17532R$id.constraint_logic_spinner, "field 'constraintSpinner'", Spinner.class);
        addedItemViewHolder.andOrLayout = (FrameLayout) Utils.findRequiredViewAsType(view, C17532R$id.constraint_and_or_frame, "field 'andOrLayout'", FrameLayout.class);
    }

    @CallSuper
    public void unbind() {
        AddedItemViewHolder addedItemViewHolder = this.f15428a;
        if (addedItemViewHolder != null) {
            this.f15428a = null;
            addedItemViewHolder.cardView = null;
            addedItemViewHolder.listLayout = null;
            addedItemViewHolder.emptyText = null;
            addedItemViewHolder.constraintSpinner = null;
            addedItemViewHolder.andOrLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
