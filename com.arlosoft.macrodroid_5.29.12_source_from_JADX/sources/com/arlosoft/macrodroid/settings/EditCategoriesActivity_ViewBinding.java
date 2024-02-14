package com.arlosoft.macrodroid.settings;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17532R$id;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class EditCategoriesActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private EditCategoriesActivity f12827a;

    /* renamed from: b */
    private View f12828b;

    /* renamed from: com.arlosoft.macrodroid.settings.EditCategoriesActivity_ViewBinding$a */
    class C5110a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditCategoriesActivity f12829a;

        C5110a(EditCategoriesActivity editCategoriesActivity) {
            this.f12829a = editCategoriesActivity;
        }

        public void doClick(View view) {
            this.f12829a.onPlusButtonClicked();
        }
    }

    @UiThread
    public EditCategoriesActivity_ViewBinding(EditCategoriesActivity editCategoriesActivity, View view) {
        this.f12827a = editCategoriesActivity;
        editCategoriesActivity.infoCardView = (CardView) Utils.findRequiredViewAsType(view, C17532R$id.infoCardView, "field 'infoCardView'", CardView.class);
        editCategoriesActivity.infoCardTitle = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.infoCardTitle, "field 'infoCardTitle'", TextView.class);
        editCategoriesActivity.infoCardDetail = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.infoCardDetail, "field 'infoCardDetail'", TextView.class);
        editCategoriesActivity.infoCardGotIt = (Button) Utils.findRequiredViewAsType(view, C17532R$id.infoCardGotIt, "field 'infoCardGotIt'", Button.class);
        View findRequiredView = Utils.findRequiredView(view, C17532R$id.fab, "field 'plusButton' and method 'onPlusButtonClicked'");
        editCategoriesActivity.plusButton = (FloatingActionButton) Utils.castView(findRequiredView, C17532R$id.fab, "field 'plusButton'", FloatingActionButton.class);
        this.f12828b = findRequiredView;
        findRequiredView.setOnClickListener(new C5110a(editCategoriesActivity));
    }

    @CallSuper
    public void unbind() {
        EditCategoriesActivity editCategoriesActivity = this.f12827a;
        if (editCategoriesActivity != null) {
            this.f12827a = null;
            editCategoriesActivity.infoCardView = null;
            editCategoriesActivity.infoCardTitle = null;
            editCategoriesActivity.infoCardDetail = null;
            editCategoriesActivity.infoCardGotIt = null;
            editCategoriesActivity.plusButton = null;
            this.f12828b.setOnClickListener((View.OnClickListener) null);
            this.f12828b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
