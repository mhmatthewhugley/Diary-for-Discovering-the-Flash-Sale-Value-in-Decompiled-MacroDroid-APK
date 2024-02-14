package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.Editable;
import android.text.Html;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17525R$array;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.activities.PopUpActionActivity;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6362a0;
import com.arlosoft.macrodroid.utils.C6395j0;
import com.arlosoft.macrodroid.utils.C6413o0;
import com.google.android.material.card.MaterialCardView;
import com.thebluealliance.spectrum.C11766a;
import java.io.FileNotFoundException;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import org.apache.commons.p353io.IOUtils;
import p057a2.C2224m;
import p112j2.C7439d0;
import p128m0.C7835r4;
import p148q0.C8151a;
import p277h9.C12408a;
import p319lc.C15626c;

public class ToastAction extends Action implements C2224m {
    public static final Parcelable.Creator<ToastAction> CREATOR = new C2733d();
    private static final int REQUEST_CODE_SELECT_ICON = 837834;

    /* renamed from: d */
    public static SoftReference<Toast> f7648d;
    private boolean cancelPrevious;
    private transient WeakReference<ImageView> iconImageRef;
    private int m_backgroundColor;
    private transient int m_backgroundDuringConfig;
    private boolean m_displayIcon;
    private int m_duration;
    private int m_horizontalPosition;
    private String m_imageName;
    private String m_imagePackageName;
    private transient int m_imageResourceId;
    private String m_imageResourceName;
    private String m_imageUri;
    private String m_messageText;
    private int m_position;
    private int m_textColor;
    /* access modifiers changed from: private */
    public transient int m_textDuringConfig;
    private boolean m_tintIcon;
    private boolean maintainSpaces;
    private boolean useTextOnly;

    /* renamed from: com.arlosoft.macrodroid.action.ToastAction$a */
    class C2730a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f7649a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f7650b;

        /* renamed from: c */
        final /* synthetic */ Activity f7651c;

        C2730a(ViewGroup viewGroup, ViewGroup viewGroup2, Activity activity) {
            this.f7649a = viewGroup;
            this.f7650b = viewGroup2;
            this.f7651c = activity;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            int i = 8;
            this.f7649a.setVisibility(z ? 8 : 0);
            ViewGroup viewGroup = this.f7650b;
            if (!z) {
                i = 0;
            }
            viewGroup.setVisibility(i);
            if (!z && Build.VERSION.SDK_INT >= 30 && !Settings.canDrawOverlays(this.f7651c)) {
                C7439d0.m30887d0(this.f7651c, false, false);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ToastAction$b */
    class C2731b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ ImageView f7653a;

        C2731b(ImageView imageView) {
            this.f7653a = imageView;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                this.f7653a.setImageTintList(ColorStateList.valueOf(ToastAction.this.m_textDuringConfig));
            } else {
                this.f7653a.setImageTintList((ColorStateList) null);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ToastAction$c */
    class C2732c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7655a;

        /* renamed from: c */
        final /* synthetic */ EditText f7656c;

        C2732c(Button button, EditText editText) {
            this.f7655a = button;
            this.f7656c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f7655a.setEnabled(this.f7656c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ToastAction$d */
    class C2733d implements Parcelable.Creator<ToastAction> {
        C2733d() {
        }

        /* renamed from: a */
        public ToastAction createFromParcel(Parcel parcel) {
            return new ToastAction(parcel, (C2730a) null);
        }

        /* renamed from: b */
        public ToastAction[] newArray(int i) {
            return new ToastAction[i];
        }
    }

    /* synthetic */ ToastAction(Parcel parcel, C2730a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ void m13391A3(EditText editText, CheckBox checkBox, CheckBox checkBox2, Spinner spinner, Spinner spinner2, Spinner spinner3, RadioButton radioButton, CheckBox checkBox3, View view) {
        m13411v3((TriggerContextInfo) null, editText.getText().toString(), checkBox.isChecked(), checkBox2.isChecked(), this.m_imageUri, this.m_imagePackageName, this.m_imageName, this.m_imageResourceName, spinner.getSelectedItemPosition(), spinner2.getSelectedItemPosition(), spinner3.getSelectedItemPosition(), this.m_textDuringConfig, this.m_backgroundDuringConfig, radioButton.isChecked(), checkBox3.isChecked(), true);
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public /* synthetic */ void m13393C3(CheckBox checkBox, CheckBox checkBox2, EditText editText, Spinner spinner, Spinner spinner2, Spinner spinner3, RadioButton radioButton, CheckBox checkBox3, CheckBox checkBox4, AppCompatDialog appCompatDialog, View view) {
        this.m_displayIcon = checkBox.isChecked();
        this.m_tintIcon = checkBox2.isChecked();
        this.m_messageText = editText.getText().toString();
        this.m_backgroundColor = this.m_backgroundDuringConfig;
        this.m_textColor = this.m_textDuringConfig;
        this.m_duration = spinner.getSelectedItemPosition();
        this.m_position = spinner2.getSelectedItemPosition();
        this.m_horizontalPosition = spinner3.getSelectedItemPosition();
        this.useTextOnly = radioButton.isChecked();
        this.cancelPrevious = checkBox3.isChecked();
        this.maintainSpaces = checkBox4.isChecked();
        appCompatDialog.dismiss();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public static /* synthetic */ void m13395E3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public /* synthetic */ void m13396F3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* renamed from: G3 */
    private void m13397G3(Toast toast, int i, int i2) {
        int dimensionPixelOffset = mo27827K0().getResources().getDimensionPixelOffset(C17529R$dimen.toast_margin);
        int i3 = 1;
        int i4 = i != 0 ? i != 1 ? i != 2 ? 0 : 48 : 16 : 80;
        if (i2 != 0) {
            i3 = i2 != 1 ? i2 != 2 ? 0 : 5 : 3;
        }
        toast.setGravity(i4 | i3, 0, dimensionPixelOffset);
    }

    /* renamed from: H3 */
    private void m13398H3(TriggerContextInfo triggerContextInfo, String str, boolean z, boolean z2, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4, int i5) {
        Drawable drawable;
        String str6 = str2;
        String str7 = str3;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        Toast toast = null;
        if (str6 != null) {
            try {
                drawable = Drawable.createFromStream(mo27827K0().getContentResolver().openInputStream(Uri.parse(str2)), str6);
            } catch (FileNotFoundException unused) {
            }
        } else if (str7 == null || !str7.equals("UserIcon")) {
            drawable = C4061t1.m15960I(mo27827K0(), str7, str5);
        } else {
            Bitmap f = C6362a0.m24600f(str4);
            if (f != null) {
                drawable = new BitmapDrawable(mo27827K0().getResources(), f);
            }
            drawable = null;
        }
        if (drawable == null) {
            drawable = mo27827K0().getResources().getDrawable(C17530R$drawable.launcher_no_border);
        }
        if (!NotificationManagerCompat.from(mo27827K0()).areNotificationsEnabled()) {
            C4878b.m18869h("Pop up message failed because notifications are disabled for MacroDroid.", mo27840Y0().longValue());
            return;
        }
        C12408a.C12409a.m83286b().mo68758c(i4).mo68759d(z2).mo68757a();
        Spanned fromHtml = Html.fromHtml(str);
        if (i6 == 0) {
            toast = C12408a.m83284r(mo27827K0(), fromHtml, drawable, i5, 1, z, true);
            m13397G3(toast, i7, i8);
            toast.show();
        } else if (i6 == 1) {
            for (int i9 = 0; i9 < 2; i9++) {
                toast = C12408a.m83284r(mo27827K0(), fromHtml, drawable, i5, 0, z, true);
                m13397G3(toast, i7, i8);
                toast.show();
            }
        } else if (i6 == 2) {
            toast = C12408a.m83284r(mo27827K0(), fromHtml, drawable, i5, 0, z, true);
            m13397G3(toast, i7, i8);
            toast.show();
        }
        f7648d = new SoftReference<>(toast);
    }

    /* renamed from: u3 */
    private int m13410u3() {
        int i = this.m_backgroundColor;
        return i == 0 ? ContextCompat.getColor(mo27827K0(), 2131100669) : i;
    }

    /* renamed from: v3 */
    private void m13411v3(TriggerContextInfo triggerContextInfo, String str, boolean z, boolean z2, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4, int i5, boolean z3, boolean z4, boolean z5) {
        SoftReference<Toast> softReference;
        Toast toast;
        String replaceAll = mo24690R2(str, triggerContextInfo).replaceAll(IOUtils.LINE_SEPARATOR_UNIX, "<br/>");
        if (z4) {
            replaceAll = replaceAll.replaceAll(" ", "&nbsp;");
        }
        String str6 = replaceAll;
        if (!(!this.cancelPrevious || (softReference = f7648d) == null || (toast = softReference.get()) == null)) {
            toast.cancel();
        }
        if (z3) {
            C15626c a = C15626c.m94876a(mo27827K0(), Html.fromHtml(str6), i == 2 ? 0 : 1);
            a.show();
            f7648d = new SoftReference<>(a);
            return;
        }
        int i6 = i;
        if (z5 || Build.VERSION.SDK_INT < 30) {
            m13398H3(triggerContextInfo, str6, z, z2, str2, str3, str4, str5, i, i2, i3, i4, i5);
        } else {
            PopUpActionActivity.m13975S1(mo27827K0(), mo27840Y0().longValue(), str6, z, z2, str2, str3, str4, str5, i, i2, i3, i4, i5);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public /* synthetic */ void m13412w3(MaterialCardView materialCardView, MaterialCardView materialCardView2, ImageView imageView, boolean z, int i) {
        if (z) {
            this.m_backgroundDuringConfig = i;
            materialCardView.setCardBackgroundColor(i);
            materialCardView2.setCardBackgroundColor(this.m_textDuringConfig);
            imageView.setBackgroundColor(this.m_backgroundDuringConfig);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public /* synthetic */ void m13413x3(MaterialCardView materialCardView, MaterialCardView materialCardView2, ImageView imageView, Activity activity, View view) {
        new C11766a.C11769c(mo27827K0()).mo66987g(C17541R$string.select_color).mo66982b(C17525R$array.toast_colors).mo66986f(this.m_backgroundDuringConfig).mo66983c(true).mo66985e(1).mo66984d(new C3461sn(this, materialCardView, materialCardView2, imageView)).mo66981a().show(((AppCompatActivity) activity).getSupportFragmentManager(), "");
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void m13414y3(MaterialCardView materialCardView, MaterialCardView materialCardView2, boolean z, int i) {
        if (z) {
            this.m_textDuringConfig = i;
            materialCardView.setCardBackgroundColor(this.m_backgroundDuringConfig);
            materialCardView2.setCardBackgroundColor(this.m_textDuringConfig);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public /* synthetic */ void m13415z3(MaterialCardView materialCardView, MaterialCardView materialCardView2, Activity activity, View view) {
        new C11766a.C11769c(mo27827K0()).mo66987g(C17541R$string.select_color).mo66982b(C17525R$array.toast_colors).mo66986f(this.m_backgroundDuringConfig).mo66983c(true).mo66985e(1).mo66984d(new C3407rn(this, materialCardView, materialCardView2)).mo66981a().show(((AppCompatActivity) activity).getSupportFragmentManager(), "");
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_messageText};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 1) {
            this.m_messageText = strArr[0];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_messageText;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7835r4.m32754u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " '" + C6413o0.m24694c(mo24672O0(), 15) + "'";
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        m13411v3(triggerContextInfo, this.m_messageText, this.m_displayIcon, this.m_tintIcon, this.m_imageUri, this.m_imagePackageName, this.m_imageName, this.m_imageResourceName, this.m_duration, this.m_position, this.m_horizontalPosition, this.m_textColor, m13410u3(), this.useTextOnly, this.maintainSpaces, false);
    }

    /* renamed from: h2 */
    public boolean mo24893h2() {
        if (this.useTextOnly || Build.VERSION.SDK_INT < 30) {
            return false;
        }
        return true;
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo25559a1() + " '" + mo24690R2(this.m_messageText, triggerContextInfo) + "'";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: android.widget.ImageView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24713q1(android.app.Activity r7, int r8, int r9, android.content.Intent r10) {
        /*
            r6 = this;
            r6.mo27877y2(r7)
            r7 = 837834(0xcc8ca, float:1.174055E-39)
            if (r8 != r7) goto L_0x0056
            if (r9 == 0) goto L_0x0056
            java.lang.String r7 = "drawableName"
            java.lang.String r8 = r10.getStringExtra(r7)
            r6.m_imageResourceName = r8
            java.lang.String r8 = "drawablePackageName"
            java.lang.String r8 = r10.getStringExtra(r8)
            r6.m_imagePackageName = r8
            java.lang.String r7 = r10.getStringExtra(r7)
            r6.m_imageName = r7
            r7 = 0
            java.lang.String r8 = "drawableId"
            int r7 = r10.getIntExtra(r8, r7)
            r6.m_imageResourceId = r7
            android.net.Uri r7 = r10.getData()
            r8 = 0
            if (r7 == 0) goto L_0x0037
            java.lang.String r7 = r7.toString()
            r6.m_imageUri = r7
            goto L_0x0039
        L_0x0037:
            r6.m_imageUri = r8
        L_0x0039:
            java.lang.ref.WeakReference<android.widget.ImageView> r7 = r6.iconImageRef
            if (r7 == 0) goto L_0x0044
            java.lang.Object r7 = r7.get()
            r8 = r7
            android.widget.ImageView r8 = (android.widget.ImageView) r8
        L_0x0044:
            r1 = r8
            if (r1 == 0) goto L_0x0056
            android.content.Context r0 = r6.mo27827K0()
            java.lang.String r2 = r6.m_imageName
            java.lang.String r3 = r6.m_imagePackageName
            int r4 = r6.m_imageResourceId
            java.lang.String r5 = r6.m_imageUri
            com.arlosoft.macrodroid.utils.C6395j0.m24650b(r0, r1, r2, r3, r4, r5)
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.ToastAction.mo24713q1(android.app.Activity, int, int, android.content.Intent):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        Button button;
        EditText editText;
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(new ContextThemeWrapper(j0, mo24688L0()), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.toast_message_dialog);
        appCompatDialog.setTitle((int) C17541R$string.action_toast);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.background_color_button);
        TextView textView2 = (TextView) appCompatDialog.findViewById(C17532R$id.text_color_button);
        MaterialCardView materialCardView = (MaterialCardView) appCompatDialog.findViewById(C17532R$id.backgroundColorCircle);
        MaterialCardView materialCardView2 = (MaterialCardView) appCompatDialog.findViewById(C17532R$id.textColorCircle);
        CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.display_icon_checkbox);
        CheckBox checkBox2 = (CheckBox) appCompatDialog.findViewById(C17532R$id.tint_icon_checkbox);
        ImageView imageView = (ImageView) appCompatDialog.findViewById(2131362906);
        Spinner spinner = (Spinner) appCompatDialog.findViewById(C17532R$id.position_spinner);
        Spinner spinner2 = (Spinner) appCompatDialog.findViewById(C17532R$id.position_spinner_horizontal);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.testButton);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.customizableRadioButton);
        Spinner spinner3 = (Spinner) appCompatDialog.findViewById(C17532R$id.duration_spinner);
        RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.standardRadioButton);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.toast_message_dialog_magic_text_button);
        ViewGroup viewGroup = (ViewGroup) appCompatDialog.findViewById(C17532R$id.customizationsContainer);
        Button button4 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        ViewGroup viewGroup2 = (ViewGroup) appCompatDialog.findViewById(C17532R$id.positionContainer);
        Button button5 = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        CheckBox checkBox3 = (CheckBox) appCompatDialog.findViewById(C17532R$id.cancelPreviousCheckbox);
        EditText editText2 = (EditText) appCompatDialog.findViewById(C17532R$id.toast_message_dialog_text_content);
        CheckBox checkBox4 = (CheckBox) appCompatDialog.findViewById(C17532R$id.maintain_spaces_checkbox);
        AppCompatDialog appCompatDialog2 = appCompatDialog;
        this.iconImageRef = new WeakReference<>(imageView);
        checkBox4.setChecked(this.maintainSpaces);
        checkBox.setChecked(this.m_displayIcon);
        checkBox2.setChecked(this.m_tintIcon);
        CheckBox checkBox5 = checkBox4;
        viewGroup.setVisibility(this.useTextOnly ? 8 : 0);
        viewGroup2.setVisibility(this.useTextOnly ? 8 : 0);
        checkBox3.setChecked(this.cancelPrevious);
        radioButton.setChecked(!this.useTextOnly);
        radioButton2.setChecked(this.useTextOnly);
        int u3 = m13410u3();
        this.m_backgroundDuringConfig = u3;
        this.m_textDuringConfig = this.m_textColor;
        imageView.setBackgroundColor(u3);
        if (this.m_tintIcon) {
            imageView.setImageTintList(ColorStateList.valueOf(this.m_textDuringConfig));
        } else {
            imageView.setImageTintList((ColorStateList) null);
        }
        radioButton2.setOnCheckedChangeListener(new C2730a(viewGroup, viewGroup2, j0));
        materialCardView.setCardBackgroundColor(m13410u3());
        materialCardView2.setCardBackgroundColor(this.m_textColor);
        Spinner spinner4 = spinner;
        Spinner spinner5 = spinner2;
        Button button6 = button2;
        RadioButton radioButton3 = radioButton2;
        ImageView imageView2 = imageView;
        CheckBox checkBox6 = checkBox3;
        CheckBox checkBox7 = checkBox2;
        CheckBox checkBox8 = checkBox;
        MaterialCardView materialCardView3 = materialCardView2;
        C3350pn pnVar = new C3350pn(this, materialCardView, materialCardView2, imageView2, j0);
        textView.setOnClickListener(pnVar);
        materialCardView.setOnClickListener(pnVar);
        C3320on onVar = new C3320on(this, materialCardView, materialCardView3, j0);
        textView2.setOnClickListener(onVar);
        materialCardView3.setOnClickListener(onVar);
        ImageView imageView3 = imageView2;
        checkBox7.setOnCheckedChangeListener(new C2731b(imageView3));
        Spinner spinner6 = spinner3;
        CheckBox checkBox9 = checkBox7;
        Button button7 = button3;
        C3292nn nnVar = r0;
        C3292nn nnVar2 = new C3292nn(this, editText2, checkBox8, checkBox7, spinner6, spinner4, spinner5, radioButton3, checkBox5);
        button2.setOnClickListener(nnVar);
        spinner6.setSelection(this.m_duration);
        spinner4.setSelection(this.m_position);
        spinner5.setSelection(this.m_horizontalPosition);
        imageView3.setOnClickListener(new C3180jn(j0));
        C6395j0.m24650b(mo27827K0(), imageView2, this.m_imageName, this.m_imagePackageName, this.m_imageResourceId, this.m_imageUri);
        String str = this.m_messageText;
        if (str != null) {
            editText = editText2;
            editText.setText(str);
            editText.setSelection(editText.length());
            button = button5;
            button.setEnabled(true);
        } else {
            button = button5;
            editText = editText2;
            button.setEnabled(false);
        }
        editText.addTextChangedListener(new C2732c(button, editText));
        C3264mn mnVar = r0;
        C3264mn mnVar2 = new C3264mn(this, checkBox8, checkBox9, editText, spinner6, spinner4, spinner5, radioButton3, checkBox6, checkBox5, appCompatDialog2);
        button.setOnClickListener(mnVar);
        AppCompatDialog appCompatDialog3 = appCompatDialog2;
        button4.setOnClickListener(new C3208kn(appCompatDialog3));
        button7.setOnClickListener(new C3236ln(this, j0, new C3378qn(editText)));
        appCompatDialog3.show();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_messageText);
        parcel.writeInt(this.m_backgroundColor);
        parcel.writeString(this.m_imageResourceName);
        parcel.writeString(this.m_imagePackageName);
        parcel.writeString(this.m_imageUri);
        parcel.writeString(this.m_imageName);
        parcel.writeInt(this.m_displayIcon ? 1 : 0);
        parcel.writeInt(this.m_tintIcon ? 1 : 0);
        parcel.writeInt(this.m_duration);
        parcel.writeInt(this.m_position);
        parcel.writeInt(this.m_horizontalPosition);
        parcel.writeInt(this.m_textColor);
        parcel.writeInt(this.useTextOnly ? 1 : 0);
        parcel.writeInt(this.cancelPrevious ? 1 : 0);
        parcel.writeInt(this.maintainSpaces ? 1 : 0);
    }

    public ToastAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private ToastAction() {
        this.m_textColor = -1;
        this.m_imageResourceName = "launcher_no_border";
        this.m_imagePackageName = "com.arlosoft.macrodroid";
        this.m_imageName = "launcher_no_border";
        this.useTextOnly = true;
    }

    private ToastAction(Parcel parcel) {
        super(parcel);
        this.m_textColor = -1;
        this.m_imageResourceName = "launcher_no_border";
        this.m_imagePackageName = "com.arlosoft.macrodroid";
        this.m_imageName = "launcher_no_border";
        boolean z = true;
        this.useTextOnly = true;
        this.m_messageText = parcel.readString();
        this.m_backgroundColor = parcel.readInt();
        this.m_imageResourceName = parcel.readString();
        this.m_imagePackageName = parcel.readString();
        this.m_imageUri = parcel.readString();
        this.m_imageName = parcel.readString();
        this.m_displayIcon = parcel.readInt() != 0;
        this.m_tintIcon = parcel.readInt() != 0;
        this.m_duration = parcel.readInt();
        this.m_position = parcel.readInt();
        this.m_horizontalPosition = parcel.readInt();
        this.m_textColor = parcel.readInt();
        this.useTextOnly = parcel.readInt() != 0;
        this.cancelPrevious = parcel.readInt() != 0;
        this.maintainSpaces = parcel.readInt() == 0 ? false : z;
    }
}
