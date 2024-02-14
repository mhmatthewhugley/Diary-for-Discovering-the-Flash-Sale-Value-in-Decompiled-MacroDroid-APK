package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.C13678a0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p123l1.C7593a0;

/* compiled from: IsAdbHackedConstraint.kt */
public final class IsAdbHackedConstraint extends Constraint {
    public static final Parcelable.Creator<IsAdbHackedConstraint> CREATOR = new C4151a();

    /* renamed from: f */
    public static final C4152b f10723f = new C4152b((C13695i) null);
    private final boolean[] adbOptionStates;
    private boolean isAdbHacked;
    private transient boolean[] tempAdbOptionStates;

    /* renamed from: com.arlosoft.macrodroid.constraint.IsAdbHackedConstraint$a */
    /* compiled from: IsAdbHackedConstraint.kt */
    public static final class C4151a implements Parcelable.Creator<IsAdbHackedConstraint> {
        C4151a() {
        }

        /* renamed from: a */
        public IsAdbHackedConstraint createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new IsAdbHackedConstraint(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public IsAdbHackedConstraint[] newArray(int i) {
            return new IsAdbHackedConstraint[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.IsAdbHackedConstraint$b */
    /* compiled from: IsAdbHackedConstraint.kt */
    public static final class C4152b {
        private C4152b() {
        }

        public /* synthetic */ C4152b(C13695i iVar) {
            this();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IsAdbHackedConstraint(Activity activity, Macro macro) {
        this();
        C13706o.m87929f(macro, "macro");
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ IsAdbHackedConstraint(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: i3 */
    private final String[] m16586i3() {
        return new String[]{"WRITE_SECURE_SETTINGS", "READ_LOGS", "SET_VOLUME_KEY_LONG_PRESS_LISTENER", "CHANGE_CONFIGURATION", "DUMP"};
    }

    /* renamed from: j3 */
    private final String[] m16587j3() {
        return new String[]{"android.permission.WRITE_SECURE_SETTINGS", "android.permission.READ_LOGS", "android.permission.SET_VOLUME_KEY_LONG_PRESS_LISTENER", "android.permission.CHANGE_CONFIGURATION", "android.permission.DUMP"};
    }

    /* renamed from: k3 */
    private final String[] m16588k3() {
        MacroDroidApplication.C3787a aVar = MacroDroidApplication.f9883I;
        String string = aVar.mo27303b().getString(C17541R$string.constraint_is_adb_hacked_option_hacked);
        C13706o.m87928e(string, "MacroDroidApplication.in…adb_hacked_option_hacked)");
        String string2 = aVar.mo27303b().getString(C17541R$string.constraint_is_adb_hacked_option_not_hacked);
        C13706o.m87928e(string2, "MacroDroidApplication.in…hacked_option_not_hacked)");
        return new String[]{string, string2};
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public static final void m16589l3(IsAdbHackedConstraint isAdbHackedConstraint, C13678a0 a0Var, DialogInterface dialogInterface, int i, boolean z) {
        C13706o.m87929f(isAdbHackedConstraint, "this$0");
        C13706o.m87929f(a0Var, "$anyChecked");
        C13706o.m87929f(dialogInterface, "dialog");
        boolean[] zArr = isAdbHackedConstraint.tempAdbOptionStates;
        boolean[] zArr2 = null;
        if (zArr == null) {
            C13706o.m87945v("tempAdbOptionStates");
            zArr = null;
        }
        zArr[i] = z;
        boolean[] zArr3 = isAdbHackedConstraint.tempAdbOptionStates;
        if (zArr3 == null) {
            C13706o.m87945v("tempAdbOptionStates");
        } else {
            zArr2 = zArr3;
        }
        ArrayList arrayList = new ArrayList();
        int length = zArr2.length;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 < length) {
                boolean z3 = zArr2[i2];
                if (!z3) {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(Boolean.valueOf(z3));
                }
                i2++;
            } else {
                a0Var.element = !arrayList.isEmpty();
                ((AlertDialog) dialogInterface).getButton(-1).setEnabled(a0Var.element);
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public static final void m16590m3(IsAdbHackedConstraint isAdbHackedConstraint, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(isAdbHackedConstraint, "this$0");
        boolean[] zArr = isAdbHackedConstraint.tempAdbOptionStates;
        if (zArr == null) {
            C13706o.m87945v("tempAdbOptionStates");
            zArr = null;
        }
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            isAdbHackedConstraint.adbOptionStates[i3] = zArr[i2];
            i2++;
            i3++;
        }
        isAdbHackedConstraint.mo24689O1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.isAdbHacked ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return this.isAdbHacked ? m16588k3()[0] : m16588k3()[1];
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        boolean[] zArr = this.adbOptionStates;
        int length = zArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            int i3 = i2 + 1;
            if (zArr[i]) {
                if (ContextCompat.checkSelfPermission(mo27827K0(), m16587j3()[i2]) != 0) {
                    z = false;
                }
                boolean z2 = this.isAdbHacked;
                if (!z2 && z) {
                    return false;
                }
                if (z2 && !z) {
                    return false;
                }
            }
            i++;
            i2 = i3;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        C4001c1 u = C7593a0.m31602u();
        C13706o.m87928e(u, "getInstance()");
        return u;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16588k3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        C13678a0 a0Var = new C13678a0();
        boolean[] zArr = this.adbOptionStates;
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                break;
            }
            boolean z2 = zArr[i];
            if (!z2) {
                z = false;
            }
            if (z) {
                arrayList.add(Boolean.valueOf(z2));
            }
            i++;
        }
        a0Var.element = !arrayList.isEmpty();
        this.tempAdbOptionStates = (boolean[]) this.adbOptionStates.clone();
        AlertDialog.Builder title = new AlertDialog.Builder(mo27850j0(), C17542R$style.Theme_App_Dialog_Constraint_SmallerText).setTitle((CharSequence) mo24738G0());
        CharSequence[] charSequenceArr = (CharSequence[]) m16586i3();
        boolean[] zArr2 = this.tempAdbOptionStates;
        if (zArr2 == null) {
            C13706o.m87945v("tempAdbOptionStates");
            zArr2 = null;
        }
        AlertDialog.Builder positiveButton = title.setMultiChoiceItems(charSequenceArr, zArr2, (DialogInterface.OnMultiChoiceClickListener) new C4234c1(this, a0Var)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4228b1(this));
        C13706o.m87928e(positiveButton, "Builder(activity, R.styl…lete()\n                })");
        AlertDialog create = positiveButton.create();
        C13706o.m87928e(create, "builder.create()");
        create.show();
        create.getButton(-1).setEnabled(a0Var.element);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.isAdbHacked ? 1 : 0);
        parcel.writeBooleanArray(this.adbOptionStates);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.isAdbHacked = i == 0;
    }

    private IsAdbHackedConstraint() {
        this.adbOptionStates = new boolean[]{true, true, true, true, true};
        this.isAdbHacked = true;
    }

    private IsAdbHackedConstraint(Parcel parcel) {
        super(parcel);
        boolean[] zArr = {true, true, true, true, true};
        this.adbOptionStates = zArr;
        this.isAdbHacked = parcel.readInt() != 0;
        parcel.readBooleanArray(zArr);
    }
}
