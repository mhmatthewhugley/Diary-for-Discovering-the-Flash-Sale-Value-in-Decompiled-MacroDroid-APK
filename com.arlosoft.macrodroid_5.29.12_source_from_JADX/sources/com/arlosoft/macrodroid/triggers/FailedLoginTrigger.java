package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17525R$array;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import p119k3.C7488d0;

public class FailedLoginTrigger extends Trigger {
    public static final Parcelable.Creator<FailedLoginTrigger> CREATOR = new C5644b();
    private int m_numFailures;
    private int m_timeIndex;

    /* renamed from: com.arlosoft.macrodroid.triggers.FailedLoginTrigger$a */
    class C5643a implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ Spinner f13612a;

        C5643a(Spinner spinner) {
            this.f13612a = spinner;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            this.f13612a.setEnabled(i > 0);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.FailedLoginTrigger$b */
    class C5644b implements Parcelable.Creator<FailedLoginTrigger> {
        C5644b() {
        }

        /* renamed from: a */
        public FailedLoginTrigger createFromParcel(Parcel parcel) {
            return new FailedLoginTrigger(parcel, (C5643a) null);
        }

        /* renamed from: b */
        public FailedLoginTrigger[] newArray(int i) {
            return new FailedLoginTrigger[i];
        }
    }

    /* synthetic */ FailedLoginTrigger(Parcel parcel, C5643a aVar) {
        this(parcel);
    }

    /* renamed from: i3 */
    private void m22142i3() {
        if (mo27836X()) {
            AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
            appCompatDialog.setContentView((int) C17535R$layout.failed_login_configuration);
            appCompatDialog.setTitle((int) C17541R$string.trigger_failed_login_configure);
            Spinner spinner = (Spinner) appCompatDialog.findViewById(C17532R$id.failed_login_config_count_spinner);
            Spinner spinner2 = (Spinner) appCompatDialog.findViewById(C17532R$id.failed_login_config_timespan_spinner);
            spinner.setSelection(this.m_numFailures - 1);
            spinner2.setSelection(this.m_timeIndex);
            spinner.setOnItemSelectedListener(new C5643a(spinner2));
            ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C6063r2(this, spinner, spinner2, appCompatDialog));
            ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C6051q2(appCompatDialog));
            appCompatDialog.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public /* synthetic */ void m22143l3(Spinner spinner, Spinner spinner2, AppCompatDialog appCompatDialog, View view) {
        this.m_numFailures = spinner.getSelectedItemPosition() + 1;
        this.m_timeIndex = spinner2.getSelectedItemPosition();
        appCompatDialog.dismiss();
        mo24689O1();
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        if (this.m_numFailures == 1) {
            return SelectableItem.m15535j1(C17541R$string.trigger_failed_login_any);
        }
        String[] stringArray = mo27827K0().getResources().getStringArray(C17525R$array.failed_login_attempt_timespan_options);
        return this.m_numFailures + " " + SelectableItem.m15535j1(C17541R$string.trigger_failed_login_failures_in) + " " + stringArray[this.m_timeIndex];
    }

    /* renamed from: S2 */
    public void mo30885S2() {
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7488d0.m31127u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
    }

    /* renamed from: j2 */
    public boolean mo24958j2() {
        return true;
    }

    /* renamed from: j3 */
    public int mo31116j3() {
        return this.m_numFailures;
    }

    /* renamed from: k3 */
    public int mo31117k3() {
        int i = this.m_timeIndex;
        if (i == 0) {
            return 60;
        }
        if (i == 1) {
            return 120;
        }
        if (i == 2) {
            return 300;
        }
        if (i != 3) {
            return i != 4 ? 3600 : 1800;
        }
        return 600;
    }

    /* renamed from: u1 */
    public void mo24714u1() {
        m22142i3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_numFailures);
        parcel.writeInt(this.m_timeIndex);
    }

    public FailedLoginTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private FailedLoginTrigger() {
        this.m_numFailures = 1;
    }

    private FailedLoginTrigger(Parcel parcel) {
        super(parcel);
        this.m_numFailures = parcel.readInt();
        this.m_timeIndex = parcel.readInt();
    }
}
