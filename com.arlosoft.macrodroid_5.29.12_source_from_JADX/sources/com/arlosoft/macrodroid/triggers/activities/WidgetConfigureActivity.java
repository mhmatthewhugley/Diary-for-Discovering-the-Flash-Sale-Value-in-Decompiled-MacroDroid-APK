package com.arlosoft.macrodroid.triggers.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.MacroDroidDialogBaseActivity;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectActivity;
import com.arlosoft.macrodroid.utils.C6395j0;
import p135n1.C7967d;

public class WidgetConfigureActivity extends MacroDroidDialogBaseActivity {

    /* renamed from: A */
    private int f13818A;

    /* renamed from: B */
    private String f13819B;

    /* renamed from: C */
    private CheckBox f13820C;

    /* renamed from: D */
    private boolean f13821D;

    /* renamed from: f */
    private ImageView f13822f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public TextView f13823g;

    /* renamed from: o */
    private int f13824o;

    /* renamed from: p */
    private String f13825p;

    /* renamed from: s */
    private String f13826s;

    /* renamed from: z */
    private Uri f13827z;

    /* renamed from: com.arlosoft.macrodroid.triggers.activities.WidgetConfigureActivity$a */
    class C5828a implements TextWatcher {
        C5828a() {
        }

        public void afterTextChanged(Editable editable) {
            WidgetConfigureActivity.this.f13823g.setText(editable.toString());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R1 */
    public /* synthetic */ void m23919R1(View view) {
        startActivityForResult(new Intent(this, IconSelectActivity.class), 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public /* synthetic */ void m23920S1(CompoundButton compoundButton, boolean z) {
        this.f13821D = z;
        this.f13822f.setAlpha(z ? 0.25f : 1.0f);
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public /* synthetic */ void m23921T1(View view) {
        Intent intent = new Intent();
        intent.putExtra("drawableId", this.f13824o);
        intent.putExtra("drawableName", this.f13825p);
        intent.putExtra("drawablePackageName", this.f13826s);
        intent.putExtra("fadedImage", this.f13821D);
        intent.setData(this.f13827z);
        intent.putExtra("widgetText", this.f13823g.getText().toString());
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public /* synthetic */ void m23922U1(View view) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public static /* synthetic */ void m23923V1(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public /* synthetic */ void m23924W1(C4023j0.C4028e eVar, Macro macro, View view) {
        C4023j0.m15698D(this, eVar, macro, C17542R$style.Theme_App_Dialog_Action_SmallText, C7967d.NONE);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != 0) {
            this.f13824o = intent.getIntExtra("drawableId", 0);
            this.f13825p = intent.getStringExtra("drawableName");
            this.f13826s = intent.getStringExtra("drawablePackageName");
            Uri data = intent.getData();
            this.f13827z = data;
            C6395j0.m24649a(this, this.f13822f, this.f13825p, this.f13826s, this.f13824o, data);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 0;
        if (getIntent().getIntExtra("item_type", 0) == 1) {
            setTheme(C17542R$style.Theme_App_Dialog_Action);
        }
        setContentView((int) C17535R$layout.widget_configure);
        setTitle(C17541R$string.configure_widget_button);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        getWindow().setAttributes(attributes);
        this.f13820C = (CheckBox) findViewById(C17532R$id.faded_checkbox);
        this.f13822f = (ImageView) findViewById(C17532R$id.widget_configure_preview_image);
        Macro macro = null;
        if (bundle != null) {
            this.f13818A = bundle.getInt("resourceId", 0);
            this.f13819B = bundle.getString("text");
            this.f13825p = bundle.getString("drawableName");
            this.f13821D = bundle.getBoolean("fadedImage");
            this.f13826s = bundle.getString("drawablePackageName");
            String string = bundle.getString("drawableUri");
            if (string != null) {
                this.f13827z = Uri.parse(string);
            }
        } else {
            this.f13818A = getIntent().getExtras().getInt("drawableId", 0);
            this.f13819B = getIntent().getExtras().getString("widgetText");
            this.f13825p = getIntent().getExtras().getString("drawableName");
            this.f13821D = getIntent().getExtras().getBoolean("fadedImage");
            this.f13826s = getIntent().getExtras().getString("drawablePackageName");
            String string2 = getIntent().getExtras().getString("drawableUri");
            macro = C4934n.m18998M().mo29683R(getIntent().getExtras().getInt("MacroId"));
            if (string2 != null) {
                this.f13827z = Uri.parse(string2);
            }
            boolean z = getIntent().getExtras().getBoolean("show_faded_image", false);
            CheckBox checkBox = this.f13820C;
            if (!z) {
                i = 8;
            }
            checkBox.setVisibility(i);
        }
        ((Button) findViewById(C17532R$id.widget_configure_select_icon_button)).setOnClickListener(new C5832b0(this));
        this.f13823g = (TextView) findViewById(C17532R$id.widget_configure_preview_text);
        EditText editText = (EditText) findViewById(C17532R$id.widget_configure_label);
        String str = this.f13819B;
        if (str != null) {
            this.f13823g.setText(str);
            editText.setText(this.f13819B);
        }
        editText.setSelection(editText.getText().length());
        this.f13820C.setChecked(this.f13821D);
        this.f13822f.setAlpha(this.f13821D ? 0.25f : 1.0f);
        this.f13820C.setOnCheckedChangeListener(new C5840f0(this));
        C6395j0.m24649a(this, this.f13822f, this.f13825p, this.f13826s, this.f13824o, this.f13827z);
        editText.addTextChangedListener(new C5828a());
        ((Button) findViewById(C17532R$id.okButton)).setOnClickListener(new C5834c0(this));
        ((Button) findViewById(C17532R$id.cancelButton)).setOnClickListener(new C5836d0(this));
        ((Button) findViewById(C17532R$id.special_text_button)).setOnClickListener(new C5838e0(this, new C5842g0(editText), macro));
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resourceId", this.f13818A);
        bundle.putString("drawablePackageName", this.f13826s);
        bundle.putString("drawableName", this.f13825p);
        bundle.putString("text", this.f13819B);
        bundle.putBoolean("fadedImage", this.f13821D);
        Uri uri = this.f13827z;
        if (uri != null) {
            bundle.putString("drawableUri", uri.toString());
        }
        super.onSaveInstanceState(bundle);
    }
}
