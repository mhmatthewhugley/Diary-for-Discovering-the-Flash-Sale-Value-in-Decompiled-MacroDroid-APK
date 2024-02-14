package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Parcel;
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
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.Contact;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.utils.C6413o0;
import java.util.ArrayList;
import java.util.List;
import p129m1.C7893a;
import p129m1.C7897h;
import p135n1.C7966c;
import p135n1.C7967d;

public abstract class CallBasedTrigger extends Trigger {
    private static final int OPTION_SELECT_CONTACT = 0;
    /* access modifiers changed from: private */
    public boolean isExclude;
    private List<String> m_groupIdList;
    private List<String> m_groupNameList;
    /* access modifiers changed from: private */
    public int m_option;
    private String m_phoneNumber;
    private boolean m_phoneNumberExclude;
    /* access modifiers changed from: private */
    public transient int workingOption;

    /* renamed from: com.arlosoft.macrodroid.triggers.CallBasedTrigger$a */
    class C5617a implements C7893a {
        C5617a() {
        }

        /* renamed from: a */
        public void mo31007a(@NonNull List<? extends Contact> list, boolean z) {
            CallBasedTrigger.this.mo31015D3((Contact) null);
            boolean unused = CallBasedTrigger.this.isExclude = z;
            CallBasedTrigger callBasedTrigger = CallBasedTrigger.this;
            int unused2 = callBasedTrigger.m_option = callBasedTrigger.workingOption;
            List<Contact> q3 = CallBasedTrigger.this.mo31017q3();
            q3.clear();
            q3.addAll(list);
            CallBasedTrigger.this.mo24689O1();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.CallBasedTrigger$b */
    class C5618b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f13594a;

        /* renamed from: c */
        final /* synthetic */ EditText f13595c;

        C5618b(Button button, EditText editText) {
            this.f13594a = button;
            this.f13595c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f13594a.setEnabled(this.f13595c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    CallBasedTrigger() {
        m21853D1();
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ void m21850A3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, false, true, C17542R$style.Theme_App_Dialog_Trigger_SmallText, C7967d.NONE);
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void m21851B3(EditText editText, CheckBox checkBox, AppCompatDialog appCompatDialog, View view) {
        this.m_phoneNumber = editText.getText().toString();
        this.m_phoneNumberExclude = checkBox.isChecked();
        appCompatDialog.dismiss();
        this.m_option = this.workingOption;
        mo24689O1();
    }

    /* renamed from: D1 */
    private void m21853D1() {
        this.m_groupIdList = new ArrayList();
        this.m_groupNameList = new ArrayList();
        this.workingOption = this.m_option;
    }

    /* renamed from: E3 */
    private void m21854E3() {
        List<C7966c> B = C4061t1.m15946B(mo27827K0());
        boolean[] zArr = new boolean[B.size()];
        String[] strArr = new String[B.size()];
        boolean z = false;
        for (int i = 0; i < B.size(); i++) {
            if (B.get(i).f19107b != null) {
                strArr[i] = B.get(i).f19107b;
                if (this.m_groupIdList.contains(B.get(i).f19106a)) {
                    zArr[i] = true;
                    z = true;
                }
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.select_groups);
        builder.setMultiChoiceItems((CharSequence[]) strArr, zArr, (DialogInterface.OnMultiChoiceClickListener) C6062r1.f14332a);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6050q1(this, B));
        AlertDialog create = builder.create();
        create.show();
        if (!z) {
            create.getButton(-1).setEnabled(false);
        }
    }

    /* renamed from: F3 */
    private void m21855F3() {
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
            editText.addTextChangedListener(new C5618b(button, editText));
            button3.setOnClickListener(new C6135t1(this, j0, new C6159v1(editText)));
            button.setOnClickListener(new C6147u1(this, editText, checkBox, appCompatDialog));
            if (editText.getText().length() > 0) {
                z = true;
            }
            button.setEnabled(z);
            button2.setOnClickListener(new C6083s1(appCompatDialog));
            appCompatDialog.show();
        }
    }

    /* renamed from: v3 */
    private String[] m21865v3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.select_contacts), SelectableItem.m15535j1(C17541R$string.select_groups), SelectableItem.m15535j1(C17541R$string.select_number), SelectableItem.m15535j1(C17541R$string.any_number)};
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public static /* synthetic */ void m21866x3(DialogInterface dialogInterface, int i, boolean z) {
        AlertDialog alertDialog = (AlertDialog) dialogInterface;
        alertDialog.getButton(-1).setEnabled(alertDialog.getListView().getCheckedItemCount() > 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void m21867y3(List list, DialogInterface dialogInterface, int i) {
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
    /* renamed from: z3 */
    public static /* synthetic */ void m21868z3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        if (this.workingOption == 0) {
            List<Contact> q3 = mo31017q3();
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= q3.size()) {
                    break;
                } else if (q3.get(i2).mo27709b().equals("-2")) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            if (i >= 0) {
                q3.remove(i);
                this.workingOption = 3;
                return 3;
            }
        }
        return this.workingOption;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D3 */
    public abstract void mo31015D3(Contact contact);

    /* renamed from: M1 */
    public boolean mo24824M1() {
        int i = this.m_option;
        if (i != 0) {
            return (i == 1 && this.m_groupIdList.size() == 0) ? false : true;
        }
        if (mo31016p3() == null && mo31017q3().size() == 0) {
            return false;
        }
        return true;
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
            if (mo31016p3() != null) {
                return str + mo31016p3().mo27713g();
            } else if (mo31017q3().size() == 1) {
                return str + mo31017q3().get(0).mo27713g();
            } else if (mo31017q3().size() == 0) {
                return Contact.m15400i();
            } else {
                return str + mo31017q3().toString();
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

    /* renamed from: U */
    public void mo25131U() {
        super.mo25131U();
        this.m_groupIdList = new ArrayList();
        this.m_groupNameList = new ArrayList();
        String str = this.m_phoneNumber;
        if (str == null || !str.startsWith("[")) {
            this.m_phoneNumber = "123456789";
        }
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + C6413o0.m24694c(mo24672O0(), 15) + ")";
    }

    /* renamed from: Y2 */
    public TriggerContextInfo mo30911Y2() {
        return new TriggerContextInfo((Trigger) this, "01234567890");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x003c A[EDGE_INSN: B:49:0x003c->B:45:0x003c ?: BREAK  , SYNTHETIC] */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo24825a0() {
        /*
            r10 = this;
            int r0 = r10.m_option
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x00b6
            android.content.Context r0 = r10.mo27827K0()
            java.util.List r0 = com.arlosoft.macrodroid.common.C4061t1.m15950D(r0)
            com.arlosoft.macrodroid.common.Contact r3 = new com.arlosoft.macrodroid.common.Contact
            java.lang.String r4 = com.arlosoft.macrodroid.common.C4061t1.f10624d
            java.lang.String r5 = "-1"
            r3.<init>(r5, r4, r5)
            r0.add(r1, r3)
            com.arlosoft.macrodroid.common.Contact r3 = new com.arlosoft.macrodroid.common.Contact
            java.lang.String r4 = com.arlosoft.macrodroid.common.C4061t1.f10625e
            java.lang.String r6 = "-2"
            r3.<init>(r6, r4, r6)
            r0.add(r1, r3)
            com.arlosoft.macrodroid.common.Contact r3 = new com.arlosoft.macrodroid.common.Contact
            java.lang.String r4 = com.arlosoft.macrodroid.common.C4061t1.f10626f
            java.lang.String r7 = "-3"
            r3.<init>(r7, r4, r7)
            r0.add(r1, r3)
            int r3 = r0.size()
            if (r3 <= 0) goto L_0x00b4
            java.util.Iterator r0 = r0.iterator()
        L_0x003c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00a7
            java.lang.Object r3 = r0.next()
            com.arlosoft.macrodroid.common.Contact r3 = (com.arlosoft.macrodroid.common.Contact) r3
            com.arlosoft.macrodroid.common.Contact r4 = r10.mo31016p3()
            if (r4 == 0) goto L_0x0065
            java.lang.String r4 = r3.mo27713g()
            com.arlosoft.macrodroid.common.Contact r8 = r10.mo31016p3()
            java.lang.String r8 = r8.mo27713g()
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x003c
            r10.mo31015D3(r3)
            r1 = 1
            goto L_0x00a7
        L_0x0065:
            java.util.List r4 = r10.mo31017q3()
            java.util.Iterator r4 = r4.iterator()
        L_0x006d:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x003c
            java.lang.Object r8 = r4.next()
            com.arlosoft.macrodroid.common.Contact r8 = (com.arlosoft.macrodroid.common.Contact) r8
            java.lang.String r9 = r3.mo27709b()
            boolean r9 = r9.equals(r5)
            if (r9 != 0) goto L_0x00a5
            java.lang.String r9 = r3.mo27709b()
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L_0x00a5
            java.lang.String r9 = r3.mo27709b()
            boolean r9 = r9.equals(r7)
            if (r9 != 0) goto L_0x00a5
            java.lang.String r9 = r3.mo27713g()
            java.lang.String r8 = r8.mo27713g()
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x006d
        L_0x00a5:
            r1 = 1
            goto L_0x003c
        L_0x00a7:
            if (r1 != 0) goto L_0x00b4
            r0 = 0
            r10.mo31015D3(r0)
            java.util.List r0 = r10.mo31017q3()
            r0.clear()
        L_0x00b4:
            r2 = r1
            goto L_0x0114
        L_0x00b6:
            if (r0 != r2) goto L_0x0114
            android.content.Context r0 = r10.mo27827K0()
            java.util.List r0 = com.arlosoft.macrodroid.common.C4061t1.m15946B(r0)
            int r3 = r0.size()
            if (r3 <= 0) goto L_0x00b4
            r3 = 0
        L_0x00c7:
            java.util.List<java.lang.String> r4 = r10.m_groupIdList
            int r4 = r4.size()
            if (r1 >= r4) goto L_0x0104
            java.util.List<java.lang.String> r4 = r10.m_groupIdList
            java.lang.Object r4 = r4.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            java.util.List<java.lang.String> r5 = r10.m_groupNameList
            java.lang.Object r5 = r5.get(r1)
            java.lang.String r5 = (java.lang.String) r5
            java.util.Iterator r6 = r0.iterator()
        L_0x00e3:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0101
            java.lang.Object r7 = r6.next()
            n1.c r7 = (p135n1.C7966c) r7
            java.lang.String r8 = r7.f19106a
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L_0x00e3
            java.lang.String r7 = r7.f19107b
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L_0x00e3
            r3 = 1
            goto L_0x00e3
        L_0x0101:
            int r1 = r1 + 1
            goto L_0x00c7
        L_0x0104:
            if (r3 != 0) goto L_0x0112
            java.util.List<java.lang.String> r0 = r10.m_groupNameList
            r0.clear()
            java.util.List<java.lang.String> r0 = r10.m_groupIdList
            r0.clear()
            r1 = r3
            goto L_0x00b4
        L_0x0112:
            r1 = 1
            goto L_0x00b4
        L_0x0114:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.CallBasedTrigger.mo24825a0():boolean");
    }

    /* renamed from: d1 */
    public String[] mo24826d1() {
        return new String[]{"android.permission.READ_CONTACTS"};
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m21865v3();
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo24738G0() + " (" + C6413o0.m24694c(mo24672O0(), 150) + ")";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p3 */
    public abstract Contact mo31016p3();

    /* renamed from: q3 */
    public abstract List<Contact> mo31017q3();

    /* renamed from: r3 */
    public boolean mo31018r3() {
        return this.m_phoneNumberExclude;
    }

    /* renamed from: s3 */
    public List<String> mo31019s3() {
        return this.m_groupIdList;
    }

    /* renamed from: t3 */
    public String mo31020t3() {
        return this.m_phoneNumber;
    }

    /* renamed from: u3 */
    public int mo31021u3() {
        return this.m_option;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        int i = this.workingOption;
        if (i == 0) {
            C7897h.m33052c(mo27850j0(), mo24688L0(), mo31017q3(), mo31016p3(), this.isExclude, true, false, new C5617a());
        } else if (i == 1) {
            m21854E3();
        } else if (i == 2) {
            m21855F3();
        } else if (i == 3) {
            this.m_option = i;
            mo24689O1();
        }
    }

    /* renamed from: w3 */
    public boolean mo31022w3() {
        return this.isExclude;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_option);
        parcel.writeStringList(this.m_groupIdList);
        parcel.writeStringList(this.m_groupNameList);
        parcel.writeString(this.m_phoneNumber);
        parcel.writeInt(this.m_phoneNumberExclude ? 1 : 0);
        parcel.writeInt(this.isExclude ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.workingOption = i;
    }

    CallBasedTrigger(Parcel parcel) {
        super(parcel);
        m21853D1();
        this.m_option = parcel.readInt();
        parcel.readStringList(this.m_groupIdList);
        parcel.readStringList(this.m_groupNameList);
        this.m_phoneNumber = parcel.readString();
        boolean z = true;
        this.m_phoneNumberExclude = parcel.readInt() != 0;
        this.isExclude = parcel.readInt() == 0 ? false : z;
    }
}
