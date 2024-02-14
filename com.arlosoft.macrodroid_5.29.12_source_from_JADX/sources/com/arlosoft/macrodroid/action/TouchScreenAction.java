package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4031k;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.HelperSystemCommands;
import p112j2.C7439d0;
import p128m0.C7843s4;
import p150q2.C8164a;

public class TouchScreenAction extends Action {
    public static final Parcelable.Creator<TouchScreenAction> CREATOR = new C2736c();
    private static final int REQUEST_CODE = 3245;
    private int m_xLocation;
    private int m_yLocation;

    /* renamed from: com.arlosoft.macrodroid.action.TouchScreenAction$a */
    class C2734a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f7658a;

        C2734a(Activity activity) {
            this.f7658a = activity;
        }

        public void onClick(View view) {
            int i;
            try {
                i = Settings.System.getInt(TouchScreenAction.this.mo27827K0().getContentResolver(), "pointer_location");
            } catch (Exception unused) {
                i = 0;
            }
            String str = i == 0 ? "1" : "0";
            try {
                if (C8164a.m33886a()) {
                    C4061t1.m15947B0(new String[]{"settings put system pointer_location " + str});
                } else if (C4031k.m15910j()) {
                    HelperSystemCommands.m24582e(TouchScreenAction.this.mo27827K0(), "system", "int", "pointer_location", str);
                } else {
                    C7439d0.m30905m0(this.f7658a, false, false, SelectableItem.m15535j1(C17541R$string.helper_apk_required), String.format(SelectableItem.m15535j1(C17541R$string.helper_app_required_setting), new Object[]{"https://macrodroidforum.com/index.php?threads/macrodroid-helper-apk.1/"}));
                }
            } catch (Exception e) {
                C4878b.m18868g("Could not set pointer_location system setting: " + e);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.TouchScreenAction$b */
    class C2735b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7660a;

        /* renamed from: c */
        final /* synthetic */ EditText f7661c;

        /* renamed from: d */
        final /* synthetic */ EditText f7662d;

        C2735b(Button button, EditText editText, EditText editText2) {
            this.f7660a = button;
            this.f7661c = editText;
            this.f7662d = editText2;
        }

        public void afterTextChanged(Editable editable) {
            this.f7660a.setEnabled(this.f7661c.getText().length() > 0 && this.f7662d.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.TouchScreenAction$c */
    class C2736c implements Parcelable.Creator<TouchScreenAction> {
        C2736c() {
        }

        /* renamed from: a */
        public TouchScreenAction createFromParcel(Parcel parcel) {
            return new TouchScreenAction(parcel, (C2734a) null);
        }

        /* renamed from: b */
        public TouchScreenAction[] newArray(int i) {
            return new TouchScreenAction[i];
        }
    }

    /* synthetic */ TouchScreenAction(Parcel parcel, C2734a aVar) {
        this(parcel);
    }

    /* renamed from: n3 */
    private void m13432n3() {
        int i;
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_ui_interaction_touch_screen_config);
        appCompatDialog.setTitle((int) C17541R$string.action_touch_screen);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.touch_screen_config_x_location);
        EditText editText2 = (EditText) appCompatDialog.findViewById(C17532R$id.touch_screen_config_y_location);
        TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.touch_screen_resolution_label);
        ((Button) appCompatDialog.findViewById(C17532R$id.showTouchOverlayButton)).setOnClickListener(new C2734a(j0));
        editText.setText("" + this.m_xLocation);
        editText.setSelection(editText.length());
        editText2.setText("" + this.m_yLocation);
        editText2.setSelection(editText2.length());
        DisplayMetrics displayMetrics = new DisplayMetrics();
        int i2 = 0;
        try {
            j0.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            i = displayMetrics.widthPixels;
            try {
                i2 = displayMetrics.heightPixels;
            } catch (NoSuchMethodException e) {
                e = e;
            }
        } catch (NoSuchMethodException e2) {
            e = e2;
            i = 0;
            e.printStackTrace();
            textView.setText(SelectableItem.m15535j1(C17541R$string.screen_resolution) + ": " + i + ", " + i2);
            C2735b bVar = new C2735b(button, editText, editText2);
            editText.addTextChangedListener(bVar);
            editText2.addTextChangedListener(bVar);
            button.setOnClickListener(new C3525un(this, appCompatDialog, editText, editText2));
            button2.setOnClickListener(new C3498tn(appCompatDialog));
            appCompatDialog.show();
        }
        textView.setText(SelectableItem.m15535j1(C17541R$string.screen_resolution) + ": " + i + ", " + i2);
        C2735b bVar2 = new C2735b(button, editText, editText2);
        editText.addTextChangedListener(bVar2);
        editText2.addTextChangedListener(bVar2);
        button.setOnClickListener(new C3525un(this, appCompatDialog, editText, editText2));
        button2.setOnClickListener(new C3498tn(appCompatDialog));
        appCompatDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public /* synthetic */ void m13433o3(AppCompatDialog appCompatDialog, EditText editText, EditText editText2, View view) {
        appCompatDialog.cancel();
        try {
            this.m_xLocation = Integer.valueOf(editText.getText().toString()).intValue();
        } catch (Exception unused) {
            this.m_xLocation = 0;
        }
        try {
            this.m_yLocation = Integer.valueOf(editText2.getText().toString()).intValue();
        } catch (Exception unused2) {
            this.m_yLocation = 0;
        }
        mo24689O1();
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_xLocation + "," + this.m_yLocation;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7843s4.m32788u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        C4061t1.m15947B0(new String[]{"input tap " + this.m_xLocation + " " + this.m_yLocation});
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return SelectableItem.m15535j1(C17541R$string.select_application);
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        if (i == REQUEST_CODE && i2 != 0) {
            m13432n3();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        m13432n3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_xLocation);
        parcel.writeInt(this.m_yLocation);
    }

    public TouchScreenAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private TouchScreenAction() {
    }

    private TouchScreenAction(Parcel parcel) {
        super(parcel);
        this.m_xLocation = parcel.readInt();
        this.m_yLocation = parcel.readInt();
    }
}
