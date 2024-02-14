package com.arlosoft.macrodroid.action.sms;

import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17536R$menu;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.Contact;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.List;
import p135n1.C7967d;
import p149q1.C8157f;
import p319lc.C15626c;
import p341o0.C15796a;
import p341o0.C15797b;
import p341o0.C15798c;
import p341o0.C15799d;
import p341o0.C15800e;

public class SMSActivity extends MacroDroidBaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public MenuItem f9210A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public EditText f9211B;

    /* renamed from: C */
    private Macro f9212C;

    /* renamed from: D */
    private C4023j0.C4028e f9213D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public int f9214E;

    /* renamed from: o */
    private ArrayList<Trigger> f9215o;

    /* renamed from: p */
    private EditText f9216p;

    /* renamed from: s */
    private CheckBox f9217s;

    /* renamed from: z */
    private CheckBox f9218z;

    /* renamed from: com.arlosoft.macrodroid.action.sms.SMSActivity$a */
    class C3458a implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ List f9219a;

        C3458a(List list) {
            this.f9219a = list;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int unused = SMSActivity.this.f9214E = ((SubscriptionInfo) this.f9219a.get(i)).getSubscriptionId();
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.sms.SMSActivity$b */
    class C3459b implements TextWatcher {
        C3459b() {
        }

        public void afterTextChanged(Editable editable) {
            if (SMSActivity.this.f9210A != null) {
                SMSActivity.this.f9210A.setEnabled(SMSActivity.this.f9211B.length() > 0);
                SMSActivity.this.f9210A.getIcon().setAlpha(SMSActivity.this.f9210A.isEnabled() ? 255 : 96);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public /* synthetic */ void m14446Y1(C4023j0.C4029f fVar) {
        int max = Math.max(this.f9211B.getSelectionStart(), 0);
        int max2 = Math.max(this.f9211B.getSelectionEnd(), 0);
        Editable text = this.f9211B.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public /* synthetic */ void m14447Z1(C4023j0.C4028e eVar, View view) {
        C4023j0.m15698D(this, eVar, this.f9212C, C17542R$style.Theme_App_Dialog_Action_SmallText, C7967d.NONE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public /* synthetic */ void m14448a2(View view) {
        C4023j0.m15698D(this, this.f9213D, this.f9212C, C17542R$style.Theme_App_Dialog_Action_SmallText, C7967d.NONE);
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public /* synthetic */ void m14449b2(C4023j0.C4029f fVar) {
        int max = Math.max(this.f9216p.getSelectionStart(), 0);
        int max2 = Math.max(this.f9216p.getSelectionEnd(), 0);
        Editable text = this.f9216p.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public /* synthetic */ void m14450c2(View view) {
        Intent intent = new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI);
        intent.setType("vnd.android.cursor.dir/phone_v2");
        startActivityForResult(intent, 99);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 99 && i2 == -1) {
            Cursor query = getContentResolver().query(intent.getData(), new String[]{"data1"}, (String) null, (String[]) null, (String) null);
            if (query != null && query.getCount() > 0) {
                query.moveToFirst();
                this.f9211B.setText(String.valueOf(query.getString(query.getColumnIndex("data1"))));
            }
            query.close();
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        setContentView(C17535R$layout.send_sms_action);
        setTitle(C17541R$string.action_send_sms);
        this.f9217s = (CheckBox) findViewById(C17532R$id.send_sms_add_to_message_log_checkbox);
        this.f9218z = (CheckBox) findViewById(C17532R$id.send_sms_pre_populate);
        this.f9217s.setVisibility(8);
        if (bundle != null) {
            this.f9215o = bundle.getParcelableArrayList("Trigger");
            str = bundle.getString("Message");
            this.f9217s.setChecked(bundle.getBoolean("AddToMessageLogExtra"));
            this.f9218z.setChecked(bundle.getBoolean("PrePopulate"));
            str2 = bundle.getString("Number");
            this.f9212C = (Macro) bundle.getParcelable(C8157f.ITEM_TYPE);
        } else {
            this.f9215o = getIntent().getExtras().getParcelableArrayList("Trigger");
            str = getIntent().getExtras().getString("Message");
            this.f9217s.setChecked(getIntent().getExtras().getBoolean("AddToMessageLogExtra"));
            this.f9218z.setChecked(getIntent().getExtras().getBoolean("PrePopulate"));
            str2 = getIntent().getExtras().getString("Number");
            this.f9212C = (Macro) getIntent().getExtras().getParcelable(C8157f.ITEM_TYPE);
        }
        this.f9216p = (EditText) findViewById(C17532R$id.smsText);
        EditText editText = (EditText) findViewById(C17532R$id.send_sms_phone_number);
        this.f9211B = editText;
        editText.setText(str2);
        this.f9216p.setText(str);
        if (Build.VERSION.SDK_INT >= 22) {
            List<SubscriptionInfo> activeSubscriptionInfoList = ((SubscriptionManager) getSystemService("telephony_subscription_service")).getActiveSubscriptionInfoList();
            C4878b.m18879r("Multi sim subscriptionInfos = " + activeSubscriptionInfoList);
            if (activeSubscriptionInfoList == null || activeSubscriptionInfoList.size() <= 1) {
                findViewById(C17532R$id.sim_selection_layout).setVisibility(8);
            } else {
                Spinner spinner = (Spinner) findViewById(C17532R$id.sim_selection_spinner);
                ArrayList arrayList = new ArrayList();
                int intExtra = getIntent().getIntExtra("SimId", 0);
                int i = 0;
                int i2 = 0;
                for (SubscriptionInfo next : activeSubscriptionInfoList) {
                    arrayList.add((next.getSimSlotIndex() + 1) + " : " + next.getDisplayName() + " - " + next.getCarrierName());
                    if (next.getSubscriptionId() == intExtra) {
                        this.f9214E = next.getSubscriptionId();
                        i = i2;
                    }
                    i2++;
                }
                if (intExtra == 0) {
                    this.f9214E = activeSubscriptionInfoList.get(0).getSubscriptionId();
                }
                spinner.setAdapter(new ArrayAdapter(this, C17535R$layout.simple_spinner_dropdown_item, arrayList));
                spinner.setSelection(i);
                spinner.setOnItemSelectedListener(new C3458a(activeSubscriptionInfoList));
            }
        }
        ((Button) findViewById(C17532R$id.send_sms_magic_text_button_number)).setOnClickListener(new C15798c(this, new C15800e(this)));
        ((Button) findViewById(C17532R$id.send_sms_magic_text_button)).setOnClickListener(new C15797b(this));
        C3459b bVar = new C3459b();
        this.f9211B.addTextChangedListener(bVar);
        this.f9216p.addTextChangedListener(bVar);
        this.f9213D = new C15799d(this);
        try {
            ((ImageButton) findViewById(C17532R$id.send_sms_select_contact)).setOnClickListener(new C15796a(this));
        } catch (Exception unused) {
            C15626c.makeText(getApplicationContext(), C17541R$string.no_app_available, 0).show();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C17536R$menu.sms_activity, menu);
        MenuItem findItem = menu.findItem(C17532R$id.menu_accept);
        this.f9210A = findItem;
        findItem.setEnabled(this.f9211B.length() > 0);
        this.f9210A.getIcon().setAlpha(this.f9210A.isEnabled() ? 255 : 96);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
            return true;
        } else if (itemId != 2131363208) {
            return true;
        } else {
            Contact contact = new Contact("Hardwired_Number", Contact.m15396a(), "Hardwired_Number");
            String obj = this.f9216p.getText().toString();
            Intent intent = new Intent();
            intent.putExtra("ContactExtra", contact);
            intent.putExtra("MessageExtra", obj);
            intent.putExtra("AddToMessageLogExtra", this.f9217s.isChecked());
            intent.putExtra("PrePopulate", this.f9218z.isChecked());
            intent.putExtra("Number", this.f9211B.getText().toString());
            intent.putExtra("SimId", this.f9214E);
            setResult(-1, intent);
            finish();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        String obj = this.f9216p.getText().toString();
        bundle.putParcelableArrayList("Trigger", this.f9215o);
        bundle.putString("Message", obj);
        bundle.putBoolean("AddToMessageLogExtra", this.f9217s.isChecked());
        bundle.putBoolean("PrePopulate", this.f9218z.isChecked());
        bundle.putString("Number", this.f9211B.getText().toString());
        bundle.putParcelable(C8157f.ITEM_TYPE, this.f9212C);
        super.onSaveInstanceState(bundle);
    }
}
