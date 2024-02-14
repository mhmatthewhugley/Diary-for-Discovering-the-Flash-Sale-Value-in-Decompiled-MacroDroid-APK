package com.arlosoft.macrodroid.action.activities;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17532R$id;

public class OptionDialogActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private OptionDialogActivity f7825a;

    @UiThread
    public OptionDialogActivity_ViewBinding(OptionDialogActivity optionDialogActivity, View view) {
        this.f7825a = optionDialogActivity;
        optionDialogActivity.button1 = (Button) Utils.findRequiredViewAsType(view, C17532R$id.button_1, "field 'button1'", Button.class);
        optionDialogActivity.button2 = (Button) Utils.findRequiredViewAsType(view, C17532R$id.button_2, "field 'button2'", Button.class);
        optionDialogActivity.button3 = (Button) Utils.findRequiredViewAsType(view, C17532R$id.button_3, "field 'button3'", Button.class);
        optionDialogActivity.messageView = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.option_dialog_message, "field 'messageView'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        OptionDialogActivity optionDialogActivity = this.f7825a;
        if (optionDialogActivity != null) {
            this.f7825a = null;
            optionDialogActivity.button1 = null;
            optionDialogActivity.button2 = null;
            optionDialogActivity.button3 = null;
            optionDialogActivity.messageView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
