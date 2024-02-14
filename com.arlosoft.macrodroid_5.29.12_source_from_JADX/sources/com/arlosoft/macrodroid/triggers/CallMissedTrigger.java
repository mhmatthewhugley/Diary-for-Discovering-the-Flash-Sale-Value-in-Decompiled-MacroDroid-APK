package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.CallLog;
import android.provider.ContactsContract;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.Contact;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.utils.C6413o0;
import com.arlosoft.macrodroid.utils.C6460y1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p112j2.C7439d0;
import p119k3.C7544q;
import p129m1.C7893a;
import p129m1.C7897h;
import p135n1.C7966c;
import p135n1.C7967d;

public class CallMissedTrigger extends Trigger {
    public static final Parcelable.Creator<CallMissedTrigger> CREATOR = new C5622c();
    private static final int OPTION_SELECT_CONTACT = 0;
    private static int s_callActiveTriggerCounter;
    private static ContentObserver s_contentObserver;
    /* access modifiers changed from: private */
    public static long s_timestamp;
    /* access modifiers changed from: private */
    public boolean isExclude;
    private List<Contact> m_contactList;
    private List<String> m_groupIdList;
    private List<String> m_groupNameList;
    /* access modifiers changed from: private */
    public int m_option;
    private String m_phoneNumber;
    private boolean m_phoneNumberExclude;
    /* access modifiers changed from: private */
    public transient int workingOption;

    /* renamed from: com.arlosoft.macrodroid.triggers.CallMissedTrigger$a */
    class C5620a implements C7893a {
        C5620a() {
        }

        /* renamed from: a */
        public void mo31007a(@NonNull List<? extends Contact> list, boolean z) {
            boolean unused = CallMissedTrigger.this.isExclude = z;
            CallMissedTrigger callMissedTrigger = CallMissedTrigger.this;
            int unused2 = callMissedTrigger.m_option = callMissedTrigger.workingOption;
            List q3 = CallMissedTrigger.this.m21923t3();
            q3.clear();
            q3.addAll(list);
            CallMissedTrigger.this.mo24689O1();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.CallMissedTrigger$b */
    class C5621b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f13598a;

        /* renamed from: c */
        final /* synthetic */ EditText f13599c;

        C5621b(Button button, EditText editText) {
            this.f13598a = button;
            this.f13599c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f13598a.setEnabled(this.f13599c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.CallMissedTrigger$c */
    class C5622c implements Parcelable.Creator<CallMissedTrigger> {
        C5622c() {
        }

        /* renamed from: a */
        public CallMissedTrigger createFromParcel(Parcel parcel) {
            return new CallMissedTrigger(parcel, (C5620a) null);
        }

        /* renamed from: b */
        public CallMissedTrigger[] newArray(int i) {
            return new CallMissedTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.CallMissedTrigger$d */
    public static class C5623d extends ContentObserver {

        /* renamed from: a */
        private final Context f13601a;

        /* synthetic */ C5623d(Context context, C5620a aVar) {
            this(context);
        }

        /* renamed from: b */
        private void m21950b(String str, CallMissedTrigger callMissedTrigger, Macro macro, List<Macro> list) {
            List<String> v3 = callMissedTrigger.mo31031v3();
            if (v3.size() > 0) {
                StringBuilder sb = new StringBuilder("(");
                for (int i = 0; i < v3.size(); i++) {
                    sb.append(v3.get(i));
                    if (i < v3.size() - 1) {
                        sb.append(",");
                    }
                }
                sb.append(")");
                ContentResolver contentResolver = this.f13601a.getContentResolver();
                Cursor query = contentResolver.query(ContactsContract.Data.CONTENT_URI, new String[]{"data1", "contact_id"}, "data1 IN " + sb.toString(), (String[]) null, (String) null);
                ArrayList<String> arrayList = new ArrayList<>();
                while (query.moveToNext()) {
                    String string = query.getString(query.getColumnIndex("contact_id"));
                    if (!arrayList.contains(string)) {
                        arrayList.add(string);
                    }
                }
                query.close();
                for (String T : arrayList) {
                    if (C4061t1.m16011p(str, C4061t1.m15974T(MacroDroidApplication.m14845u(), T)) && callMissedTrigger.mo31374R2()) {
                        macro.setTriggerThatInvoked(callMissedTrigger);
                        macro.setTriggerContextInfo(new TriggerContextInfo((Trigger) callMissedTrigger, str));
                        if (macro.canInvoke(macro.getTriggerContextInfo())) {
                            list.add(macro);
                            return;
                        }
                        return;
                    }
                }
            }
        }

        /* renamed from: c */
        private void m21951c(String str, CallMissedTrigger callMissedTrigger, Macro macro, List<Macro> list) {
            if (str != null) {
                String w3 = callMissedTrigger.mo31032w3();
                boolean compare = PhoneNumberUtils.compare(w3, str);
                if (!compare && C6460y1.m24792d(str, C6460y1.m24791c(C4023j0.m15760t0(this.f13601a, w3, (TriggerContextInfo) null, macro).toLowerCase(), false), false)) {
                    compare = true;
                }
                if (compare != callMissedTrigger.mo31030u3() && callMissedTrigger.mo31374R2()) {
                    macro.setTriggerThatInvoked(callMissedTrigger);
                    macro.setTriggerContextInfo(new TriggerContextInfo((Trigger) callMissedTrigger, str));
                    if (macro.canInvoke(macro.getTriggerContextInfo())) {
                        list.add(macro);
                    }
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static /* synthetic */ void m21952d(ArrayList arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Macro macro = (Macro) it.next();
                macro.invokeActions(macro.getTriggerContextInfo());
            }
        }

        public void onChange(boolean z) {
            boolean o3;
            boolean z2;
            if (ContextCompat.checkSelfPermission(this.f13601a, "android.permission.READ_CALL_LOG") != 0) {
                C7439d0.m30909o0(this.f13601a, "android.permission.READ_CALL_LOG", (String) null, true, false);
                return;
            }
            int i = 3;
            int i2 = 2;
            Cursor query = this.f13601a.getContentResolver().query(CallLog.Calls.CONTENT_URI, new String[]{"number"}, "type = ? AND new = ? AND date > ?", new String[]{Integer.toString(3), "1", String.valueOf(CallMissedTrigger.s_timestamp)}, "date DESC ");
            if ((query != null ? query.getCount() : 0) > 0) {
                long unused = CallMissedTrigger.s_timestamp = System.currentTimeMillis();
                query.moveToFirst();
                String string = query.getString(query.getColumnIndex("number"));
                ArrayList arrayList = new ArrayList();
                for (Macro next : C4934n.m18998M().mo29679I()) {
                    Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Trigger next2 = it.next();
                            if (next2 instanceof CallMissedTrigger) {
                                CallMissedTrigger callMissedTrigger = (CallMissedTrigger) next2;
                                boolean o32 = callMissedTrigger.isExclude;
                                if (callMissedTrigger.mo31033x3() == i) {
                                    if (callMissedTrigger.mo31374R2()) {
                                        next.setTriggerThatInvoked(next2);
                                        next.setTriggerContextInfo(new TriggerContextInfo(next.getTriggerThatInvoked(), string));
                                        if (next.canInvoke(next.getTriggerContextInfo())) {
                                            arrayList.add(next);
                                        }
                                    }
                                } else if (callMissedTrigger.mo31033x3() == i2) {
                                    m21951c(string, callMissedTrigger, next, arrayList);
                                } else if (callMissedTrigger.mo31033x3() == 1) {
                                    m21950b(string, callMissedTrigger, next, arrayList);
                                } else {
                                    Iterator it2 = callMissedTrigger.m21923t3().iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            Contact contact = (Contact) it2.next();
                                            String b = contact.mo27709b();
                                            b.hashCode();
                                            char c = 65535;
                                            switch (b.hashCode()) {
                                                case 1444:
                                                    if (b.equals("-1")) {
                                                        c = 0;
                                                        break;
                                                    }
                                                    break;
                                                case 1445:
                                                    if (b.equals("-2")) {
                                                        c = 1;
                                                        break;
                                                    }
                                                    break;
                                                case 1446:
                                                    if (b.equals("-3")) {
                                                        c = 2;
                                                        break;
                                                    }
                                                    break;
                                                case 1447:
                                                    if (b.equals("-4")) {
                                                        c = 3;
                                                        break;
                                                    }
                                                    break;
                                            }
                                            switch (c) {
                                                case 0:
                                                case 2:
                                                    boolean equals = contact.mo27709b().equals("-1");
                                                    Iterator<Contact> it3 = C4061t1.m15950D(MacroDroidApplication.m14845u()).iterator();
                                                    while (true) {
                                                        if (it3.hasNext()) {
                                                            if (C4061t1.m16011p(string, C4061t1.m15973S(MacroDroidApplication.m14845u(), it3.next()))) {
                                                                z2 = true;
                                                            }
                                                        } else {
                                                            z2 = false;
                                                        }
                                                    }
                                                    if (z2 != equals) {
                                                        break;
                                                    } else {
                                                        o3 = callMissedTrigger.isExclude;
                                                        break;
                                                    }
                                                case 1:
                                                    o3 = callMissedTrigger.isExclude;
                                                    break;
                                                case 3:
                                                    if (string != null) {
                                                        break;
                                                    } else {
                                                        o3 = callMissedTrigger.isExclude;
                                                        break;
                                                    }
                                                default:
                                                    if (!C4061t1.m16011p(string, C4061t1.m15973S(MacroDroidApplication.m14845u(), contact))) {
                                                        break;
                                                    } else {
                                                        o3 = callMissedTrigger.isExclude;
                                                        break;
                                                    }
                                            }
                                        }
                                    }
                                    o32 = !o3;
                                }
                                if (o32 && next2.mo31374R2()) {
                                    next.setTriggerThatInvoked(next2);
                                    next.setTriggerContextInfo(new TriggerContextInfo(next.getTriggerThatInvoked(), string));
                                    if (next.canInvoke(next.getTriggerContextInfo())) {
                                        arrayList.add(next);
                                    }
                                }
                            }
                            i = 3;
                            i2 = 2;
                        }
                    }
                    i = 3;
                    i2 = 2;
                }
                new Handler(Looper.getMainLooper()).post(new C5895d2(arrayList));
            }
            query.close();
        }

        private C5623d(Context context) {
            super((Handler) null);
            this.f13601a = context;
        }
    }

    /* synthetic */ CallMissedTrigger(Parcel parcel, C5620a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ void m21902A3(List list, DialogInterface dialogInterface, int i) {
        AlertDialog alertDialog = (AlertDialog) dialogInterface;
        alertDialog.getListView().getCheckedItemPositions();
        SparseBooleanArray checkedItemPositions = alertDialog.getListView().getCheckedItemPositions();
        this.m_groupIdList.clear();
        this.m_groupNameList.clear();
        for (int i2 = 0; i2 < checkedItemPositions.size(); i2++) {
            if (checkedItemPositions.valueAt(i2)) {
                this.m_groupIdList.add(((C7966c) list.get(checkedItemPositions.keyAt(i2))).f19106a);
                this.m_groupNameList.add(((C7966c) list.get(checkedItemPositions.keyAt(i2))).f19107b);
            }
        }
        this.m_option = this.workingOption;
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public static /* synthetic */ void m21903B3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public /* synthetic */ void m21904C3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, false, true, C17542R$style.Theme_App_Dialog_Trigger_SmallText, C7967d.NONE);
    }

    /* renamed from: D1 */
    private void m21905D1() {
        this.m_groupIdList = new ArrayList();
        this.m_groupNameList = new ArrayList();
        this.workingOption = this.m_option;
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public /* synthetic */ void m21906D3(EditText editText, CheckBox checkBox, AppCompatDialog appCompatDialog, View view) {
        this.m_phoneNumber = editText.getText().toString();
        this.m_phoneNumberExclude = checkBox.isChecked();
        appCompatDialog.dismiss();
        this.m_option = this.workingOption;
        mo24689O1();
    }

    /* renamed from: F3 */
    private void m21908F3() {
        List<C7966c> B = C4061t1.m15946B(mo27827K0());
        boolean[] zArr = new boolean[B.size()];
        String[] strArr = new String[B.size()];
        boolean z = false;
        for (int i = 0; i < B.size(); i++) {
            strArr[i] = B.get(i).f19107b;
            if (this.m_groupIdList.contains(B.get(i).f19106a)) {
                zArr[i] = true;
                z = true;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.select_groups);
        builder.setMultiChoiceItems((CharSequence[]) strArr, zArr, (DialogInterface.OnMultiChoiceClickListener) C6195y1.f14728a);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6183x1(this, B));
        AlertDialog create = builder.create();
        create.show();
        if (!z) {
            create.getButton(-1).setEnabled(false);
        }
    }

    /* renamed from: G3 */
    private void m21909G3() {
        if (mo27836X()) {
            Activity j0 = mo27850j0();
            AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
            appCompatDialog.setContentView((int) C17535R$layout.enter_number_dialog);
            appCompatDialog.setTitle((CharSequence) SelectableItem.m15535j1(C17541R$string.select_number));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
            layoutParams.width = -1;
            appCompatDialog.getWindow().setAttributes(layoutParams);
            Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
            Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
            EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.enter_number_dialog_phone_number);
            Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.enter_number_dialog_magic_text_button);
            CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.exclude_number);
            boolean z = false;
            checkBox.setVisibility(0);
            ((TextView) appCompatDialog.findViewById(C17532R$id.wildcard_Text)).setVisibility(0);
            checkBox.setChecked(this.m_phoneNumberExclude);
            String str = this.m_phoneNumber;
            if (str != null) {
                editText.setText(str);
                editText.setSelection(editText.length());
            }
            editText.addTextChangedListener(new C5621b(button, editText));
            button3.setOnClickListener(new C5808a2(this, j0, new C5883c2(editText)));
            button.setOnClickListener(new C5871b2(this, editText, checkBox, appCompatDialog));
            if (editText.getText().length() > 0) {
                z = true;
            }
            button.setEnabled(z);
            button2.setOnClickListener(new C6207z1(appCompatDialog));
            appCompatDialog.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public List<Contact> m21923t3() {
        if (this.m_contactList == null) {
            this.m_contactList = new ArrayList();
        }
        return this.m_contactList;
    }

    /* renamed from: y3 */
    private String[] m21924y3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.select_contacts), SelectableItem.m15535j1(C17541R$string.select_groups), SelectableItem.m15535j1(C17541R$string.select_number), SelectableItem.m15535j1(C17541R$string.any_number)};
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public static /* synthetic */ void m21925z3(DialogInterface dialogInterface, int i, boolean z) {
        AlertDialog alertDialog = (AlertDialog) dialogInterface;
        alertDialog.getButton(-1).setEnabled(alertDialog.getListView().getCheckedItemCount() > 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        if (this.workingOption == 0) {
            List<Contact> t3 = m21923t3();
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= t3.size()) {
                    break;
                } else if (t3.get(i2).mo27709b().equals("-2")) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            if (i >= 0) {
                t3.remove(i);
                this.workingOption = 3;
                return 3;
            }
        }
        return this.workingOption;
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        int i = this.m_option;
        if (i != 0) {
            return (i == 1 && this.m_groupIdList.size() == 0) ? false : true;
        }
        if (m21923t3().size() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        int i = this.m_option;
        if (i == 3) {
            return SelectableItem.m15535j1(C17541R$string.any_number);
        }
        String str = "";
        if (i == 0) {
            if (this.isExclude) {
                str = SelectableItem.m15535j1(C17541R$string.excludes) + " ";
            }
            if (m21923t3().size() == 1) {
                return str + this.m_contactList.get(0).mo27713g();
            } else if (this.m_contactList.size() == 0) {
                return Contact.m15400i();
            } else {
                return str + this.m_contactList.toString();
            }
        } else if (i == 1) {
            if (this.m_groupNameList.size() == 1) {
                return this.m_groupNameList.get(0);
            }
            return this.m_groupNameList.toString();
        } else if (i != 2) {
            return str;
        } else {
            StringBuilder sb = new StringBuilder();
            if (this.m_phoneNumberExclude) {
                str = SelectableItem.m15535j1(C17541R$string.excludes) + " ";
            }
            sb.append(str);
            sb.append(this.m_phoneNumber);
            return sb.toString();
        }
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_callActiveTriggerCounter - 1;
        s_callActiveTriggerCounter = i;
        if (i == 0 && s_contentObserver != null) {
            mo27827K0().getContentResolver().unregisterContentObserver(s_contentObserver);
            s_contentObserver = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7544q.m31395u();
    }

    /* renamed from: U */
    public void mo25131U() {
        super.mo25131U();
        ArrayList arrayList = new ArrayList();
        for (Contact next : this.m_contactList) {
            if (next.mo27709b().equals("-1")) {
                arrayList.add(0, new Contact("-1", C4061t1.f10624d, "-1"));
            } else if (next.mo27709b().equals("-2")) {
                arrayList.add(0, new Contact("-2", C4061t1.f10625e, "-2"));
            } else if (next.mo27709b().equals("-3")) {
                arrayList.add(0, new Contact("-3", C4061t1.f10626f, "-3"));
            } else if (next.mo27709b().equals("-4")) {
                arrayList.add(0, new Contact("-4", C4061t1.f10627g, "-4"));
            }
        }
        this.m_contactList = arrayList;
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + C6413o0.m24694c(mo24672O0(), 15) + ")";
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_callActiveTriggerCounter == 0) {
            s_timestamp = System.currentTimeMillis();
            s_contentObserver = new C5623d(mo27827K0(), (C5620a) null);
            if (ContextCompat.checkSelfPermission(mo27827K0(), "android.permission.READ_CALL_LOG") != 0) {
                C7439d0.m30909o0(mo27827K0(), "android.permission.READ_CALL_LOG", (String) null, true, false);
                return;
            }
            mo27827K0().getContentResolver().registerContentObserver(CallLog.Calls.CONTENT_URI, true, s_contentObserver);
        }
        s_callActiveTriggerCounter++;
    }

    /* renamed from: Y2 */
    public TriggerContextInfo mo30911Y2() {
        return new TriggerContextInfo((Trigger) this, "01234567890");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo24825a0() {
        /*
            r9 = this;
            int r0 = r9.m_option
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0069
            r9.m21923t3()
            android.content.Context r0 = r9.mo27827K0()
            java.util.List r0 = com.arlosoft.macrodroid.common.C4061t1.m15950D(r0)
            com.arlosoft.macrodroid.common.Contact r3 = new com.arlosoft.macrodroid.common.Contact
            java.lang.String r4 = com.arlosoft.macrodroid.common.C4061t1.f10624d
            java.lang.String r5 = "-1"
            r3.<init>(r5, r4, r5)
            r0.add(r2, r3)
            com.arlosoft.macrodroid.common.Contact r3 = new com.arlosoft.macrodroid.common.Contact
            java.lang.String r4 = com.arlosoft.macrodroid.common.C4061t1.f10625e
            java.lang.String r5 = "-2"
            r3.<init>(r5, r4, r5)
            r0.add(r2, r3)
            com.arlosoft.macrodroid.common.Contact r3 = new com.arlosoft.macrodroid.common.Contact
            java.lang.String r4 = com.arlosoft.macrodroid.common.C4061t1.f10626f
            java.lang.String r5 = "-3"
            r3.<init>(r5, r4, r5)
            r0.add(r2, r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x0039:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0067
            java.lang.Object r3 = r0.next()
            com.arlosoft.macrodroid.common.Contact r3 = (com.arlosoft.macrodroid.common.Contact) r3
            java.util.List<com.arlosoft.macrodroid.common.Contact> r4 = r9.m_contactList
            java.util.Iterator r4 = r4.iterator()
        L_0x004b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0039
            java.lang.Object r5 = r4.next()
            com.arlosoft.macrodroid.common.Contact r5 = (com.arlosoft.macrodroid.common.Contact) r5
            java.lang.String r6 = r3.mo27713g()
            java.lang.String r5 = r5.mo27713g()
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x004b
            r2 = 1
            goto L_0x0039
        L_0x0067:
            r1 = r2
            goto L_0x00c6
        L_0x0069:
            if (r0 != r1) goto L_0x00c6
            android.content.Context r0 = r9.mo27827K0()
            java.util.List r0 = com.arlosoft.macrodroid.common.C4061t1.m15946B(r0)
            int r3 = r0.size()
            if (r3 <= 0) goto L_0x00c5
            r3 = 0
        L_0x007a:
            java.util.List<java.lang.String> r4 = r9.m_groupIdList
            int r4 = r4.size()
            if (r2 >= r4) goto L_0x00b7
            java.util.List<java.lang.String> r4 = r9.m_groupIdList
            java.lang.Object r4 = r4.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            java.util.List<java.lang.String> r5 = r9.m_groupNameList
            java.lang.Object r5 = r5.get(r2)
            java.lang.String r5 = (java.lang.String) r5
            java.util.Iterator r6 = r0.iterator()
        L_0x0096:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00b4
            java.lang.Object r7 = r6.next()
            n1.c r7 = (p135n1.C7966c) r7
            java.lang.String r8 = r7.f19106a
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L_0x0096
            java.lang.String r7 = r7.f19107b
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L_0x0096
            r3 = 1
            goto L_0x0096
        L_0x00b4:
            int r2 = r2 + 1
            goto L_0x007a
        L_0x00b7:
            if (r3 != 0) goto L_0x00c3
            java.util.List<java.lang.String> r0 = r9.m_groupNameList
            r0.clear()
            java.util.List<java.lang.String> r0 = r9.m_groupIdList
            r0.clear()
        L_0x00c3:
            r1 = r3
            goto L_0x00c6
        L_0x00c5:
            r1 = 0
        L_0x00c6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.CallMissedTrigger.mo24825a0():boolean");
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.READ_PHONE_STATE", "android.permission.READ_CONTACTS", "android.permission.READ_CALL_LOG"};
    }

    /* renamed from: d1 */
    public String[] mo24826d1() {
        return new String[]{"android.permission.READ_CONTACTS"};
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m21924y3();
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo24738G0() + " (" + C6413o0.m24694c(mo24672O0(), 150) + ")";
    }

    /* renamed from: u3 */
    public boolean mo31030u3() {
        return this.m_phoneNumberExclude;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        int i = this.workingOption;
        if (i == 0) {
            C7897h.m33052c(mo27850j0(), mo24688L0(), m21923t3(), (Contact) null, this.isExclude, true, false, new C5620a());
        } else if (i == 1) {
            m21908F3();
        } else if (i == 2) {
            m21909G3();
        } else if (i == 3) {
            this.m_option = i;
            mo24689O1();
        }
    }

    /* renamed from: v3 */
    public List<String> mo31031v3() {
        return this.m_groupIdList;
    }

    /* renamed from: w3 */
    public String mo31032w3() {
        return this.m_phoneNumber;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        Contact[] contactArr = new Contact[this.m_contactList.size()];
        this.m_contactList.toArray(contactArr);
        parcel.writeParcelableArray(contactArr, i);
        parcel.writeInt(this.m_option);
        parcel.writeString(this.m_phoneNumber);
        parcel.writeInt(this.m_phoneNumberExclude ? 1 : 0);
        parcel.writeStringList(this.m_groupIdList);
        parcel.writeStringList(this.m_groupNameList);
        parcel.writeInt(this.isExclude ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.workingOption = i;
    }

    /* renamed from: x3 */
    public int mo31033x3() {
        return this.m_option;
    }

    public CallMissedTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public CallMissedTrigger() {
        m21905D1();
        this.m_contactList = new ArrayList();
    }

    private CallMissedTrigger(Parcel parcel) {
        super(parcel);
        m21905D1();
        Parcelable[] readParcelableArray = parcel.readParcelableArray(Contact.class.getClassLoader());
        if (readParcelableArray != null) {
            ArrayList arrayList = new ArrayList();
            this.m_contactList = arrayList;
            Collections.addAll(arrayList, (Contact[]) Arrays.copyOf(readParcelableArray, readParcelableArray.length, Contact[].class));
        }
        this.m_option = parcel.readInt();
        this.m_phoneNumber = parcel.readString();
        boolean z = true;
        this.m_phoneNumberExclude = parcel.readInt() != 0;
        parcel.readStringList(this.m_groupIdList);
        parcel.readStringList(this.m_groupNameList);
        this.isExclude = parcel.readInt() == 0 ? false : z;
    }
}
