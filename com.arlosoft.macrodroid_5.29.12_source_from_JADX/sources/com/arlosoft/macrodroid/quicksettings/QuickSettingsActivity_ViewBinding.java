package com.arlosoft.macrodroid.quicksettings;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17532R$id;

public class QuickSettingsActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private QuickSettingsActivity f12693a;

    @UiThread
    public QuickSettingsActivity_ViewBinding(QuickSettingsActivity quickSettingsActivity, View view) {
        this.f12693a = quickSettingsActivity;
        quickSettingsActivity.infoCardView = (CardView) Utils.findRequiredViewAsType(view, C17532R$id.infoCardView, "field 'infoCardView'", CardView.class);
        quickSettingsActivity.infoCardTitle = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.infoCardTitle, "field 'infoCardTitle'", TextView.class);
        quickSettingsActivity.infoCardDetail = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.infoCardDetail, "field 'infoCardDetail'", TextView.class);
        quickSettingsActivity.infoCardGotIt = (Button) Utils.findRequiredViewAsType(view, C17532R$id.infoCardGotIt, "field 'infoCardGotIt'", Button.class);
    }

    @CallSuper
    public void unbind() {
        QuickSettingsActivity quickSettingsActivity = this.f12693a;
        if (quickSettingsActivity != null) {
            this.f12693a = null;
            quickSettingsActivity.infoCardView = null;
            quickSettingsActivity.infoCardTitle = null;
            quickSettingsActivity.infoCardDetail = null;
            quickSettingsActivity.infoCardGotIt = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
