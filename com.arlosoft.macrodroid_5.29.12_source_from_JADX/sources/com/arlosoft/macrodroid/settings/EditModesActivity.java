package com.arlosoft.macrodroid.settings;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.action.SetModeAction;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.constraint.ModeConstraint;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.ModeEnterExitTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.Iterator;
import java.util.List;

public class EditModesActivity extends MacroDroidBaseActivity {

    /* renamed from: o */
    private List<String> f12831o;

    /* renamed from: p */
    private ListView f12832p;

    /* renamed from: com.arlosoft.macrodroid.settings.EditModesActivity$a */
    class C5111a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f12833a;

        /* renamed from: c */
        final /* synthetic */ EditText f12834c;

        C5111a(Button button, EditText editText) {
            this.f12833a = button;
            this.f12834c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f12833a.setEnabled(this.f12834c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.settings.EditModesActivity$b */
    class C5112b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f12836a;

        /* renamed from: c */
        final /* synthetic */ EditText f12837c;

        C5112b(Button button, EditText editText) {
            this.f12836a = button;
            this.f12837c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f12836a.setEnabled(this.f12837c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: Y1 */
    private void m19736Y1() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(this);
        appCompatDialog.setContentView((int) C17535R$layout.mode_name_dialog);
        appCompatDialog.setTitle((int) C17541R$string.add_macrodroid_mode);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.mode_name_dialog_mode_name);
        editText.setHint(C17541R$string.enter_mode_name);
        editText.addTextChangedListener(new C5112b(button, editText));
        button.setOnClickListener(new C5184q(this, appCompatDialog, editText));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C5178o(appCompatDialog));
        appCompatDialog.show();
    }

    /* renamed from: Z1 */
    private void m19737Z1(int i) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(this);
        appCompatDialog.setContentView((int) C17535R$layout.mode_name_dialog);
        appCompatDialog.setTitle((int) C17541R$string.enter_mode_name);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.mode_name_dialog_mode_name);
        editText.setHint(C17541R$string.enter_mode_name);
        String str = this.f12831o.get(i);
        editText.setText(str);
        editText.addTextChangedListener(new C5111a(button, editText));
        button.setOnClickListener(new C5187r(this, appCompatDialog, editText, i, str));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C5175n(appCompatDialog));
        appCompatDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public /* synthetic */ void m19738a2(AppCompatDialog appCompatDialog, EditText editText, View view) {
        appCompatDialog.cancel();
        this.f12831o.add(editText.getText().toString());
        m19748k2();
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public /* synthetic */ void m19740c2(AppCompatDialog appCompatDialog, EditText editText, int i, String str, View view) {
        appCompatDialog.cancel();
        String obj = editText.getText().toString();
        this.f12831o.set(i, obj);
        boolean z = false;
        for (Macro next : C4934n.m18998M().mo29710z()) {
            Iterator<Trigger> it = next.getTriggerList().iterator();
            while (it.hasNext()) {
                Trigger next2 = it.next();
                if (next2 instanceof ModeEnterExitTrigger) {
                    ModeEnterExitTrigger modeEnterExitTrigger = (ModeEnterExitTrigger) next2;
                    if (modeEnterExitTrigger.mo31334p3().equals(str)) {
                        modeEnterExitTrigger.mo31337x3(obj);
                        z = true;
                    }
                }
            }
            Iterator<Action> it2 = next.getActions().iterator();
            while (it2.hasNext()) {
                Action next3 = it2.next();
                if (next3 instanceof SetModeAction) {
                    SetModeAction setModeAction = (SetModeAction) next3;
                    if (setModeAction.mo25647n3().equals(str)) {
                        setModeAction.mo25648p3(obj);
                        z = true;
                    }
                }
            }
            for (Constraint next4 : next.getConstraints()) {
                if (next4 instanceof ModeConstraint) {
                    ModeConstraint modeConstraint = (ModeConstraint) next4;
                    if (modeConstraint.mo28242n3().equals(str)) {
                        modeConstraint.mo28243s3(obj);
                        z = true;
                    }
                }
            }
        }
        m19748k2();
        if (z) {
            C4934n.m18998M().mo29702s0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e2 */
    public /* synthetic */ void m19742e2(View view) {
        m19736Y1();
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public /* synthetic */ void m19743f2(CardView cardView, View view) {
        C5163j2.m19995J3(this, true);
        cardView.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public /* synthetic */ void m19744g2(AdapterView adapterView, View view, int i, long j) {
        m19747j2(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public /* synthetic */ void m19745h2(int i, DialogInterface dialogInterface, int i2) {
        if (i2 == 0) {
            this.f12831o.remove(i);
            m19748k2();
        } else if (i2 == 1) {
            m19737Z1(i);
        } else if (i2 == 2) {
            m19746i2(this.f12831o.get(i));
        }
    }

    /* renamed from: i2 */
    private void m19746i2(String str) {
        C4061t1.m15955F0(this, str);
    }

    /* renamed from: j2 */
    private void m19747j2(int i) {
        String[] strArr = {getString(C17541R$string.delete), getString(C17541R$string.edit), getString(C17541R$string.action_set_mode_set_mode)};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((CharSequence) this.f12831o.get(i)).setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C5172m(this, i));
        builder.create().show();
    }

    /* renamed from: k2 */
    private void m19748k2() {
        C5163j2.m20017M4(this, C4061t1.m15972R(this.f12831o));
        refresh();
    }

    private void refresh() {
        List<String> Q = C4061t1.m15971Q(C5163j2.m20090X0(this));
        this.f12831o = Q;
        String[] strArr = new String[Q.size()];
        this.f12831o.toArray(strArr);
        this.f12832p.setAdapter(new ArrayAdapter(this, C17535R$layout.list_item_mode, strArr));
        this.f12832p.setDivider((Drawable) null);
        this.f12832p.setEmptyView(findViewById(C17532R$id.edit_modes_no_entries));
        registerForContextMenu(this.f12832p);
        this.f12832p.setOnItemClickListener(new C5193t(this));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C17535R$layout.edit_modes);
        setTitle(C17541R$string.edit_modes);
        this.f12832p = (ListView) findViewById(C17532R$id.edit_modes_list);
        ((TextView) findViewById(C17532R$id.infoCardTitle)).setText(C17541R$string.edit_macrodroid_modes);
        ((TextView) findViewById(C17532R$id.infoCardDetail)).setText(C17541R$string.macrodroid_mode_info_card);
        findViewById(C17532R$id.fab).setOnClickListener(new C5181p(this));
        CardView cardView = (CardView) findViewById(C17532R$id.infoCardView);
        Button button = (Button) findViewById(C17532R$id.infoCardGotIt);
        cardView.setCardBackgroundColor(ContextCompat.getColor(getApplication(), C17528R$color.modes_config_primary));
        if (!C5163j2.m20033P(this)) {
            cardView.setVisibility(0);
        } else {
            cardView.setVisibility(8);
        }
        button.setOnClickListener(new C5190s(this, cardView));
        refresh();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public void onStart() {
        super.onStart();
    }

    public void onStop() {
        super.onStop();
    }
}
