package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.List;
import p057a2.C2218g;
import p128m0.C7791l4;
import p183w2.C10330a;

public class StopWatchAction extends Action implements C2218g {
    public static final Parcelable.Creator<StopWatchAction> CREATOR = new C2706b();
    private static final int OPTION_PAUSE = 1;
    private static final int OPTION_RESET = 2;
    private static final int OPTION_RESET_AND_START = 3;
    private static final int OPTION_START = 0;
    private int m_option;
    private String m_stopwatchName;

    /* renamed from: com.arlosoft.macrodroid.action.StopWatchAction$a */
    class C2705a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7611a;

        /* renamed from: c */
        final /* synthetic */ EditText f7612c;

        C2705a(Button button, EditText editText) {
            this.f7611a = button;
            this.f7612c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f7611a.setEnabled(this.f7612c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.StopWatchAction$b */
    class C2706b implements Parcelable.Creator<StopWatchAction> {
        C2706b() {
        }

        /* renamed from: a */
        public StopWatchAction createFromParcel(Parcel parcel) {
            return new StopWatchAction(parcel, (C2705a) null);
        }

        /* renamed from: b */
        public StopWatchAction[] newArray(int i) {
            return new StopWatchAction[i];
        }
    }

    /* synthetic */ StopWatchAction(Parcel parcel, C2705a aVar) {
        this(parcel);
    }

    /* renamed from: o3 */
    private void m13157o3(@NonNull List<String> list) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_new_stopwatch);
        appCompatDialog.setTitle((int) C17541R$string.action_stop_watch_create_new);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        EditText editText = (EditText) appCompatDialog.findViewById(2131363335);
        editText.addTextChangedListener(new C2705a(button, editText));
        button.setOnClickListener(new C3578wl(this, editText, list, appCompatDialog));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C3550vl(appCompatDialog));
        appCompatDialog.show();
    }

    /* renamed from: p3 */
    private void m13158p3() {
        List<String> e = C10330a.m40553e(mo27827K0());
        String[] strArr = new String[(e.size() + 1)];
        int i = 0;
        strArr[0] = "<" + SelectableItem.m15535j1(C17541R$string.action_stop_watch_create_new) + ">";
        for (int i2 = 1; i2 < e.size() + 1; i2++) {
            strArr[i2] = e.get(i2 - 1);
            String str = this.m_stopwatchName;
            if (str != null && str.equals(strArr[i2])) {
                i = i2;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setSingleChoiceItems((CharSequence[]) strArr, i, (DialogInterface.OnClickListener) null);
        builder.setTitle((CharSequence) mo24772h1());
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3496tl(this, e));
        builder.create().show();
    }

    /* renamed from: q3 */
    private void m13159q3(@NonNull String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setSingleChoiceItems((CharSequence[]) m13160r3(), this.m_option, (DialogInterface.OnClickListener) null);
        builder.setTitle((CharSequence) mo24772h1());
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3456sl(this, str));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.create().show();
    }

    /* renamed from: r3 */
    private String[] m13160r3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.start), SelectableItem.m15535j1(C17541R$string.action_control_media_pause), SelectableItem.m15535j1(C17541R$string.reset), SelectableItem.m15535j1(C17541R$string.reset_and_restart)};
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public /* synthetic */ void m13161s3(EditText editText, List list, AppCompatDialog appCompatDialog, View view) {
        String obj = editText.getText().toString();
        if (list.contains(obj)) {
            m13166x3();
            return;
        }
        list.add(obj);
        C10330a.m40557i(mo27827K0(), list);
        appCompatDialog.dismiss();
        m13159q3(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public /* synthetic */ void m13163u3(List list, DialogInterface dialogInterface, int i) {
        ListView listView = ((AlertDialog) dialogInterface).getListView();
        int checkedItemPosition = listView.getCheckedItemPosition();
        if (checkedItemPosition == 0) {
            m13157o3(list);
        } else {
            m13159q3((String) listView.getAdapter().getItem(checkedItemPosition));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public /* synthetic */ void m13164v3(String str, DialogInterface dialogInterface, int i) {
        this.m_option = ((AlertDialog) dialogInterface).getListView().getCheckedItemPosition();
        this.m_stopwatchName = str;
        mo24689O1();
    }

    /* renamed from: x3 */
    private void m13166x3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), C17542R$style.Theme_App_Dialog_Variables);
        builder.setTitle((int) C17541R$string.error);
        builder.setMessage((int) C17541R$string.action_stop_watch_already_exists);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) C3523ul.f9378a);
        builder.show();
    }

    /* renamed from: G */
    public String mo24430G() {
        return this.m_stopwatchName;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return SelectableItem.m15535j1(C17541R$string.action_stop_watch) + " (" + m13160r3()[this.m_option] + ")";
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        Macro macro = this.m_macro;
        return (macro != null && !macro.isCompleted()) || C10330a.m40553e(mo27827K0()).contains(this.m_stopwatchName);
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_stopwatchName;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7791l4.m32535u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return SelectableItem.m15535j1(C17541R$string.action_stop_watch) + " - " + mo24672O0() + " (" + m13160r3()[this.m_option] + ")";
    }

    /* renamed from: V */
    public void mo25810V() {
        List<String> e = C10330a.m40553e(mo27827K0());
        if (!e.contains(this.m_stopwatchName)) {
            e.add(this.m_stopwatchName);
            C10330a.m40557i(mo27827K0(), e);
        }
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        int i = this.m_option;
        if (i == 0) {
            C10330a.m40558j(mo27827K0(), this.m_stopwatchName);
        } else if (i == 1) {
            C10330a.m40555g(mo27827K0(), this.m_stopwatchName);
        } else if (i == 2) {
            C10330a.m40556h(mo27827K0(), this.m_stopwatchName);
        } else if (i == 3) {
            C10330a.m40556h(mo27827K0(), this.m_stopwatchName);
            C10330a.m40558j(mo27827K0(), this.m_stopwatchName);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        m13158p3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_option);
        parcel.writeString(this.m_stopwatchName);
    }

    /* renamed from: x */
    public void mo24431x(String str) {
        this.m_stopwatchName = str;
    }

    public StopWatchAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private StopWatchAction() {
    }

    private StopWatchAction(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
        this.m_stopwatchName = parcel.readString();
    }
}
