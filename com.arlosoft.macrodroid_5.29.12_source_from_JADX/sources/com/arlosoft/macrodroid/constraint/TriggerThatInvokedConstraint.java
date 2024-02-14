package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ListView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.p353io.IOUtils;
import p123l1.C7604d1;
import p319lc.C15626c;

public class TriggerThatInvokedConstraint extends Constraint {
    public static final Parcelable.Creator<TriggerThatInvokedConstraint> CREATOR = new C4208b();
    private boolean m_not;
    private long m_siGuidThatInvoked;
    private String m_triggerName;
    private transient boolean notSetting;

    /* renamed from: com.arlosoft.macrodroid.constraint.TriggerThatInvokedConstraint$a */
    class C4207a extends ArrayAdapter<String> {

        /* renamed from: a */
        final /* synthetic */ int f10773a;

        /* renamed from: c */
        final /* synthetic */ int f10774c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4207a(Context context, int i, int i2, String[] strArr, int i3, int i4) {
            super(context, i, i2, strArr);
            this.f10773a = i3;
            this.f10774c = i4;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            CheckedTextView checkedTextView = (CheckedTextView) view2.findViewById(16908308);
            String str = (String) getItem(i);
            SpannableString spannableString = new SpannableString((CharSequence) getItem(i));
            if (str.contains(IOUtils.LINE_SEPARATOR_UNIX)) {
                spannableString.setSpan(new RelativeSizeSpan(0.7f), str.indexOf(IOUtils.LINE_SEPARATOR_UNIX), str.length(), 33);
            }
            checkedTextView.setText(spannableString);
            int i2 = this.f10773a;
            int i3 = this.f10774c;
            checkedTextView.setPadding(i2, i3, i2, i3);
            checkedTextView.setTextSize(18.0f);
            return view2;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.TriggerThatInvokedConstraint$b */
    class C4208b implements Parcelable.Creator<TriggerThatInvokedConstraint> {
        C4208b() {
        }

        /* renamed from: a */
        public TriggerThatInvokedConstraint createFromParcel(Parcel parcel) {
            return new TriggerThatInvokedConstraint(parcel, (C4207a) null);
        }

        /* renamed from: b */
        public TriggerThatInvokedConstraint[] newArray(int i) {
            return new TriggerThatInvokedConstraint[i];
        }
    }

    /* synthetic */ TriggerThatInvokedConstraint(Parcel parcel, C4207a aVar) {
        this(parcel);
    }

    /* renamed from: i3 */
    private String[] m17140i3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.constraint_trigger_that_invoked), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_trigger_that_invoked_not)};
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public /* synthetic */ void m17141k3(DialogInterface dialogInterface, int i) {
        String str;
        Trigger trigger = mo27837X0().getTriggerList().get(((AlertDialog) dialogInterface).getListView().getCheckedItemPosition());
        this.m_siGuidThatInvoked = trigger.mo27847f1();
        String O0 = trigger.mo24672O0();
        StringBuilder sb = new StringBuilder();
        sb.append(trigger.mo24738G0());
        if (TextUtils.isEmpty(O0)) {
            str = "";
        } else {
            str = ": " + O0;
        }
        sb.append(str);
        this.m_triggerName = sb.toString();
        this.m_not = this.notSetting;
        mo24689O1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_not ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return SelectableItem.m15535j1(this.m_not ? C17541R$string.constraint_trigger_that_invoked_not : C17541R$string.constraint_trigger_that_invoked);
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        Macro X0 = mo27837X0();
        if (X0 == null) {
            return true;
        }
        Iterator<Trigger> it = X0.getTriggerList().iterator();
        while (it.hasNext()) {
            if (it.next().mo27847f1() == this.m_siGuidThatInvoked) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str;
        try {
            Iterator<Trigger> it = mo27837X0().getTriggerList().iterator();
            while (it.hasNext()) {
                Trigger next = it.next();
                if (next.mo27847f1() == this.m_siGuidThatInvoked) {
                    String O0 = next.mo24672O0();
                    StringBuilder sb = new StringBuilder();
                    sb.append(next.mo24738G0());
                    if (TextUtils.isEmpty(O0)) {
                        str = "";
                    } else {
                        str = ": " + O0;
                    }
                    sb.append(str);
                    return sb.toString();
                }
            }
        } catch (Exception unused) {
        }
        return this.m_triggerName;
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        if (mo27837X0() == null || mo27837X0().getTriggerThatInvoked() == null) {
            return this.m_not;
        }
        return ((mo27837X0().getTriggerThatInvoked().mo27847f1() > this.m_siGuidThatInvoked ? 1 : (mo27837X0().getTriggerThatInvoked().mo27847f1() == this.m_siGuidThatInvoked ? 0 : -1)) == 0) != this.m_not;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7604d1.m31655u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + ": " + mo24672O0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m17140i3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h3 */
    public AlertDialog mo28349h3() {
        String str;
        int dimensionPixelOffset = mo27827K0().getResources().getDimensionPixelOffset(C17529R$dimen.margin_medium);
        int dimensionPixelOffset2 = mo27827K0().getResources().getDimensionPixelOffset(C17529R$dimen.margin_tiny);
        ArrayList<Trigger> triggerList = mo27837X0().getTriggerList();
        int size = triggerList.size();
        String[] strArr = new String[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Trigger trigger = triggerList.get(i2);
            String O0 = trigger.mo24672O0();
            StringBuilder sb = new StringBuilder();
            sb.append(trigger.mo24738G0());
            if (TextUtils.isEmpty(O0)) {
                str = "";
            } else {
                str = IOUtils.LINE_SEPARATOR_UNIX + trigger.mo24672O0();
            }
            sb.append(str);
            strArr[i2] = sb.toString();
            if (triggerList.get(i2).mo27847f1() == this.m_siGuidThatInvoked) {
                i = i2;
            }
        }
        if (size == 0) {
            C15626c.makeText(mo27827K0().getApplicationContext(), C17541R$string.please_add_a_trigger, 1).show();
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) mo24772h1());
        builder.setSingleChoiceItems((CharSequence[]) strArr, i, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4310q3(this));
        AlertDialog create = builder.create();
        create.show();
        ListView listView = create.getListView();
        listView.setAdapter(new C4207a(new ContextThemeWrapper((Context) mo27850j0(), mo24705l0()), C17535R$layout.single_choice_list_item, 16908308, strArr, dimensionPixelOffset, dimensionPixelOffset2));
        listView.setItemChecked(i, true);
        return create;
    }

    /* renamed from: j3 */
    public long mo28350j3() {
        return this.m_siGuidThatInvoked;
    }

    /* renamed from: l3 */
    public void mo28351l3(long j) {
        this.m_siGuidThatInvoked = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        this.notSetting = this.m_not;
        super.mo24714u1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        mo28349h3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.m_siGuidThatInvoked);
        parcel.writeString(this.m_triggerName);
        parcel.writeInt(this.m_not ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.notSetting = z;
    }

    public TriggerThatInvokedConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private TriggerThatInvokedConstraint() {
    }

    private TriggerThatInvokedConstraint(Parcel parcel) {
        super(parcel);
        this.m_siGuidThatInvoked = parcel.readLong();
        this.m_triggerName = parcel.readString();
        this.m_not = parcel.readInt() != 0;
    }
}
