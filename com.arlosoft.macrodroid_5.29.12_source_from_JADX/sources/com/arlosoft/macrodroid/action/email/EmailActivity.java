package com.arlosoft.macrodroid.action.email;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17536R$menu;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.PreferencesActivity;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import p098h0.C12366a;
import p098h0.C12367b;
import p135n1.C7967d;
import p149q1.C8157f;

public class EmailActivity extends MacroDroidBaseActivity {

    /* renamed from: A */
    private EditText f8278A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public MenuItem f8279B;

    /* renamed from: C */
    private Macro f8280C;

    /* renamed from: D */
    private boolean f8281D;

    /* renamed from: E */
    private boolean f8282E;

    /* renamed from: F */
    private CheckBox f8283F;

    /* renamed from: G */
    private boolean f8284G;

    /* renamed from: H */
    private boolean f8285H;

    /* renamed from: I */
    boolean f8286I;

    /* renamed from: J */
    private C4023j0.C4028e f8287J;

    /* renamed from: o */
    private ArrayList<Trigger> f8288o;

    /* renamed from: p */
    private EditText f8289p;

    /* renamed from: s */
    private EditText f8290s;

    /* renamed from: z */
    private EditText f8291z;

    /* renamed from: com.arlosoft.macrodroid.action.email.EmailActivity$a */
    class C3039a implements TextWatcher {
        C3039a() {
        }

        public void afterTextChanged(Editable editable) {
            if (EmailActivity.this.f8279B == null) {
                return;
            }
            if (editable.length() > 0) {
                EmailActivity.this.f8279B.setEnabled(true);
                EmailActivity.this.f8279B.getIcon().setAlpha(255);
                return;
            }
            EmailActivity.this.f8279B.setEnabled(false);
            EmailActivity.this.f8279B.getIcon().setAlpha(96);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public /* synthetic */ void m14220T1(View view) {
        Intent intent = new Intent(this, PreferencesActivity.class);
        intent.putExtra("shortcut", 2);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public /* synthetic */ void m14221U1(C4023j0.C4029f fVar) {
        EditText editText;
        if (this.f8289p.hasFocus()) {
            editText = this.f8289p;
        } else if (this.f8290s.hasFocus()) {
            editText = this.f8290s;
        } else if (this.f8291z.hasFocus()) {
            editText = this.f8291z;
        } else {
            editText = this.f8278A.hasFocus() ? this.f8278A : null;
        }
        if (editText != null) {
            int max = Math.max(editText.getSelectionStart(), 0);
            int max2 = Math.max(editText.getSelectionEnd(), 0);
            Editable text = editText.getText();
            int min = Math.min(max, max2);
            int max3 = Math.max(max, max2);
            String str = fVar.f10575a;
            text.replace(min, max3, str, 0, str.length());
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        super.onCreate(bundle);
        setContentView(C17535R$layout.send_email_action);
        setTitle(C17541R$string.action_send_email);
        if (bundle != null) {
            this.f8288o = bundle.getParcelableArrayList("Trigger");
            str = bundle.getString("Subject");
            str2 = bundle.getString("Body");
            str3 = bundle.getString("Address");
            str4 = bundle.getString("From");
            this.f8284G = bundle.getBoolean("AttachSystemLog");
            this.f8285H = bundle.getBoolean("AttachUserLog");
            this.f8280C = (Macro) bundle.getParcelable(C8157f.ITEM_TYPE);
            this.f8281D = bundle.getBoolean("SmtpMode");
            this.f8282E = bundle.getBoolean("HtmlMode");
            this.f8286I = bundle.getBoolean("HideMessageText");
        } else {
            this.f8288o = getIntent().getExtras().getParcelableArrayList("Trigger");
            str = getIntent().getExtras().getString("Subject");
            str2 = getIntent().getExtras().getString("Body");
            str3 = getIntent().getExtras().getString("Address");
            str4 = getIntent().getExtras().getString("From");
            this.f8284G = getIntent().getExtras().getBoolean("AttachSystemLog");
            this.f8285H = getIntent().getExtras().getBoolean("AttachUserLog");
            this.f8280C = (Macro) getIntent().getExtras().getParcelable(C8157f.ITEM_TYPE);
            this.f8281D = getIntent().getExtras().getBoolean("SmtpMode");
            this.f8282E = getIntent().getExtras().getBoolean("HtmlMode");
            this.f8286I = getIntent().getExtras().getBoolean("HideMessageText");
        }
        int i = 0;
        findViewById(C17532R$id.fromEmailAddressLayout).setVisibility(this.f8281D ? 0 : 8);
        View findViewById = findViewById(C17532R$id.configure_smtp_server);
        this.f8283F = (CheckBox) findViewById(C17532R$id.html_check_box);
        findViewById.setVisibility(this.f8281D ? 0 : 8);
        this.f8283F.setVisibility(this.f8281D ? 0 : 8);
        findViewById.setOnClickListener(new C12366a(this));
        this.f8283F.setChecked(this.f8282E);
        EditText editText = (EditText) findViewById(C17532R$id.fromAddress);
        this.f8278A = editText;
        editText.setText(str4);
        EditText editText2 = (EditText) findViewById(C17532R$id.body);
        this.f8289p = editText2;
        editText2.setText(str2);
        EditText editText3 = this.f8289p;
        if (this.f8286I) {
            i = 8;
        }
        editText3.setVisibility(i);
        EditText editText4 = (EditText) findViewById(C17532R$id.subject);
        this.f8290s = editText4;
        editText4.setText(str);
        EditText editText5 = (EditText) findViewById(C17532R$id.toAddress);
        this.f8291z = editText5;
        editText5.setText(str3);
        this.f8291z.addTextChangedListener(new C3039a());
        this.f8287J = new C12367b(this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C17536R$menu.compose_email_menu, menu);
        MenuItem findItem = menu.findItem(C17532R$id.menu_accept);
        this.f8279B = findItem;
        findItem.setEnabled(this.f8291z.length() > 0);
        this.f8279B.getIcon().setAlpha(this.f8279B.isEnabled() ? 255 : 96);
        menu.findItem(C17532R$id.menu_attach_system_log).setChecked(this.f8284G);
        menu.findItem(C17532R$id.menu_attach_user_log).setChecked(this.f8285H);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                finish();
                return true;
            case C17532R$id.menu_accept:
                String obj = this.f8278A.getText().toString();
                String obj2 = this.f8291z.getText().toString();
                String obj3 = this.f8289p.getText().toString();
                String obj4 = this.f8290s.getText().toString();
                boolean isChecked = this.f8283F.isChecked();
                Intent intent = new Intent();
                intent.putExtra("From", obj);
                intent.putExtra("Address", obj2);
                intent.putExtra("Body", obj3);
                intent.putExtra("Subject", obj4);
                intent.putExtra("AttachUserLog", this.f8285H);
                intent.putExtra("AttachSystemLog", this.f8284G);
                intent.putExtra("HtmlMode", isChecked);
                setResult(-1, intent);
                finish();
                return true;
            case C17532R$id.menu_attach_system_log:
                boolean z = !this.f8284G;
                this.f8284G = z;
                menuItem.setChecked(z);
                if (this.f8284G) {
                    this.f8285H = false;
                }
                return true;
            case C17532R$id.menu_attach_user_log:
                boolean z2 = !this.f8285H;
                this.f8285H = z2;
                menuItem.setChecked(z2);
                if (this.f8285H) {
                    this.f8284G = false;
                }
                return true;
            case C17532R$id.menu_special_text:
                C4023j0.m15698D(this, this.f8287J, this.f8280C, C17542R$style.Theme_App_Dialog_Action_SmallText, C7967d.NONE);
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        menu.findItem(C17532R$id.menu_attach_system_log).setChecked(this.f8284G);
        menu.findItem(C17532R$id.menu_attach_user_log).setChecked(this.f8285H);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelableArrayList("Trigger", this.f8288o);
        bundle.putString("From", this.f8278A.getText().toString());
        bundle.putString("Body", this.f8289p.getText().toString());
        bundle.putString("Subject", this.f8290s.getText().toString());
        bundle.putString("Address", this.f8291z.getText().toString());
        bundle.putBoolean("AttachSystemLog", this.f8284G);
        bundle.putBoolean("AttachUserLog", this.f8285H);
        bundle.putBoolean("SmtpMode", this.f8281D);
        bundle.putParcelable(C8157f.ITEM_TYPE, this.f8280C);
        bundle.putBoolean("HtmlMode", this.f8282E);
        bundle.putBoolean("HideMessageText", this.f8286I);
        super.onSaveInstanceState(bundle);
    }
}
