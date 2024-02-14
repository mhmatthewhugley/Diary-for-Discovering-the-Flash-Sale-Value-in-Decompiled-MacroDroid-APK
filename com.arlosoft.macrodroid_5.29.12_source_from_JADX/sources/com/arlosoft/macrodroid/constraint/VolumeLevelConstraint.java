package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.DialogInterface;
import android.media.AudioManager;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.twofortyfouram.locale.sdk.host.TaskerPlugin;
import p123l1.C7610f1;

public class VolumeLevelConstraint extends Constraint {
    public static final Parcelable.Creator<VolumeLevelConstraint> CREATOR = new C4211b();
    private static final int EQUALS = 2;
    private static final int GREATER_THAN = 1;
    private static final int LESS_THAN = 0;
    private static final int MAX_AUDIO_LEVEL = 100;
    private static final int[] s_streamConstants = {4, 3, 5, 2, 1, 0, 6};
    private int m_comparison;
    private boolean[] m_streamIndexArray;
    /* access modifiers changed from: private */
    public int m_volume;

    /* renamed from: com.arlosoft.macrodroid.constraint.VolumeLevelConstraint$a */
    class C4210a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ TextView f10776a;

        C4210a(TextView textView) {
            this.f10776a = textView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int unused = VolumeLevelConstraint.this.m_volume = i;
            TextView textView = this.f10776a;
            textView.setText(VolumeLevelConstraint.this.m_volume + TaskerPlugin.VARIABLE_PREFIX);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.VolumeLevelConstraint$b */
    class C4211b implements Parcelable.Creator<VolumeLevelConstraint> {
        C4211b() {
        }

        /* renamed from: a */
        public VolumeLevelConstraint createFromParcel(Parcel parcel) {
            return new VolumeLevelConstraint(parcel, (C4210a) null);
        }

        /* renamed from: b */
        public VolumeLevelConstraint[] newArray(int i) {
            return new VolumeLevelConstraint[i];
        }
    }

    /* synthetic */ VolumeLevelConstraint(Parcel parcel, C4210a aVar) {
        this(parcel);
    }

    /* renamed from: m3 */
    private String[] m17173m3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_set_volume_alarm), SelectableItem.m15535j1(C17541R$string.action_set_volume_music), SelectableItem.m15535j1(C17541R$string.action_set_volume_notification), SelectableItem.m15535j1(C17541R$string.action_set_volume_ringer), SelectableItem.m15535j1(C17541R$string.action_set_volume_system_sounds), SelectableItem.m15535j1(C17541R$string.action_set_volume_voice_call), SelectableItem.m15535j1(C17541R$string.action_set_volume_bluetooth_voice)};
    }

    /* renamed from: n3 */
    private String m17174n3(int i) {
        return i != 0 ? i != 1 ? "=" : ">" : "<";
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public static /* synthetic */ void m17175o3(DialogInterface dialogInterface, int i, boolean z) {
        AlertDialog alertDialog = (AlertDialog) dialogInterface;
        alertDialog.getButton(-1).setEnabled(alertDialog.getListView().getCheckedItemCount() > 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public /* synthetic */ void m17176p3(DialogInterface dialogInterface, int i) {
        this.m_streamIndexArray = new boolean[s_streamConstants.length];
        SparseBooleanArray checkedItemPositions = ((AlertDialog) dialogInterface).getListView().getCheckedItemPositions();
        for (int i2 = 0; i2 < checkedItemPositions.size(); i2++) {
            if (checkedItemPositions.valueAt(i2)) {
                this.m_streamIndexArray[checkedItemPositions.keyAt(i2)] = true;
            }
        }
        m17179s3();
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public /* synthetic */ void m17177q3(RadioButton radioButton, RadioButton radioButton2, AppCompatDialog appCompatDialog, View view) {
        this.m_comparison = radioButton.isChecked() ? 0 : radioButton2.isChecked() ? 1 : 2;
        appCompatDialog.dismiss();
        mo24689O1();
    }

    /* renamed from: s3 */
    private void m17179s3() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_volume_constraint);
        appCompatDialog.setTitle((int) C17541R$string.constraint_volume_level);
        SeekBar seekBar = (SeekBar) appCompatDialog.findViewById(C17532R$id.levelSeekBar);
        TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.percentLabel);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.greaterThanRadioButton);
        RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.lessThanRadioButton);
        RadioButton radioButton3 = (RadioButton) appCompatDialog.findViewById(C17532R$id.equalsRadioButton);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        seekBar.setProgress(this.m_volume);
        textView.setText(this.m_volume + TaskerPlugin.VARIABLE_PREFIX);
        boolean z = false;
        radioButton2.setChecked(this.m_comparison == 0);
        radioButton.setChecked(this.m_comparison == 1);
        if (this.m_comparison == 2) {
            z = true;
        }
        radioButton3.setChecked(z);
        seekBar.setOnSeekBarChangeListener(new C4210a(textView));
        button.setOnClickListener(new C4330u3(this, radioButton2, radioButton, appCompatDialog));
        button2.setOnClickListener(new C4325t3(appCompatDialog));
        appCompatDialog.show();
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return SelectableItem.m15535j1(C17541R$string.constraint_volume_level) + " " + m17174n3(this.m_comparison) + " " + this.m_volume + TaskerPlugin.VARIABLE_PREFIX;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            boolean[] zArr = this.m_streamIndexArray;
            if (i >= zArr.length) {
                break;
            }
            if (zArr[i]) {
                sb.append(m17173m3()[i]);
                sb.append(", ");
            }
            i++;
        }
        return sb.length() != 0 ? sb.substring(0, sb.length() - 2) : "";
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        AudioManager audioManager = (AudioManager) mo27827K0().getSystemService("audio");
        int i = 0;
        while (true) {
            boolean[] zArr = this.m_streamIndexArray;
            if (i >= zArr.length) {
                return true;
            }
            if (zArr[i]) {
                int[] iArr = s_streamConstants;
                int round = (int) Math.round((((double) audioManager.getStreamVolume(iArr[i])) / ((double) audioManager.getStreamMaxVolume(iArr[i]))) * 100.0d);
                int i2 = this.m_comparison;
                if (i2 == 0 && round >= this.m_volume) {
                    return false;
                }
                if (i2 == 1 && round <= this.m_volume) {
                    return false;
                }
                if (i2 == 2 && round != this.m_volume) {
                    return false;
                }
            }
            i++;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7610f1.m31688u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.select_option);
        builder.setMultiChoiceItems((CharSequence[]) m17173m3(), this.m_streamIndexArray, (DialogInterface.OnMultiChoiceClickListener) C4320s3.f11006a);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4315r3(this));
        AlertDialog create = builder.create();
        create.show();
        create.getButton(-1).setEnabled(false);
        for (boolean z : this.m_streamIndexArray) {
            if (z) {
                create.getButton(-1).setEnabled(true);
                return;
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_streamIndexArray.length);
        parcel.writeBooleanArray(this.m_streamIndexArray);
        parcel.writeInt(this.m_volume);
        parcel.writeInt(this.m_comparison);
    }

    public VolumeLevelConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public VolumeLevelConstraint() {
        this.m_streamIndexArray = new boolean[s_streamConstants.length];
        this.m_volume = 50;
        this.m_comparison = 0;
    }

    private VolumeLevelConstraint(Parcel parcel) {
        super(parcel);
        this.m_streamIndexArray = new boolean[s_streamConstants.length];
        boolean[] zArr = new boolean[parcel.readInt()];
        this.m_streamIndexArray = zArr;
        parcel.readBooleanArray(zArr);
        this.m_volume = parcel.readInt();
        this.m_comparison = parcel.readInt();
    }
}
