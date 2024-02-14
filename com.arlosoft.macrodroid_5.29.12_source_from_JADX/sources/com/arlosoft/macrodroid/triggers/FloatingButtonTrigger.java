package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17525R$array;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.events.FloatingButtonsUpdateEvent;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectActivity;
import com.arlosoft.macrodroid.triggers.services.FloatingButtonService;
import com.arlosoft.macrodroid.utils.C6362a0;
import com.melnykov.fab.FloatingActionButton;
import com.thebluealliance.spectrum.C11766a;
import com.twofortyfouram.locale.sdk.host.TaskerPlugin;
import java.lang.ref.WeakReference;
import p119k3.C7503g0;
import p161s1.C10180a;

public class FloatingButtonTrigger extends Trigger {
    public static final Parcelable.Creator<FloatingButtonTrigger> CREATOR = new C5650c();
    private static final int REQUEST_CODE_ICON_SELECT = 249232;
    private static int s_triggerCounter;
    private boolean disableTriggerOnRemove;
    private boolean forceLocation;
    private String identifier;
    private int m_alpha;
    private transient WeakReference<FloatingActionButton> m_fabRef;
    private int m_iconBgColor;
    private String m_imagePackageName;
    protected int m_imageResourceId;
    protected String m_imageResourceName;
    private String m_imageUri;
    private int m_padding;
    private transient WeakReference<SeekBar> m_paddingSeekBarRef;
    private boolean m_showOnLockScreen;
    private int m_size;
    private boolean m_transparentBackground;
    private transient boolean normalSizeSelected;
    private int overridenAlpha;
    private int overridenBgColor;
    private int overridenSize;
    private boolean overridenTransparentBackground;
    private int xLocation;
    private int yLocation;

    /* renamed from: com.arlosoft.macrodroid.triggers.FloatingButtonTrigger$a */
    class C5648a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ FloatingActionButton f13614a;

        /* renamed from: b */
        final /* synthetic */ SeekBar f13615b;

        C5648a(FloatingActionButton floatingActionButton, SeekBar seekBar) {
            this.f13614a = floatingActionButton;
            this.f13615b = seekBar;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            FloatingButtonTrigger.this.m22204R3(this.f13614a, this.f13615b.getProgress());
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.FloatingButtonTrigger$b */
    class C5649b implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ TextView f13617a;

        /* renamed from: b */
        final /* synthetic */ FloatingActionButton f13618b;

        C5649b(TextView textView, FloatingActionButton floatingActionButton) {
            this.f13617a = textView;
            this.f13618b = floatingActionButton;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                TextView textView = this.f13617a;
                textView.setText(i + TaskerPlugin.VARIABLE_PREFIX);
                this.f13618b.setAlpha(((float) i) / 100.0f);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.FloatingButtonTrigger$c */
    class C5650c implements Parcelable.Creator<FloatingButtonTrigger> {
        C5650c() {
        }

        /* renamed from: a */
        public FloatingButtonTrigger createFromParcel(Parcel parcel) {
            return new FloatingButtonTrigger(parcel, (C5648a) null);
        }

        /* renamed from: b */
        public FloatingButtonTrigger[] newArray(int i) {
            return new FloatingButtonTrigger[i];
        }
    }

    /* synthetic */ FloatingButtonTrigger(Parcel parcel, C5648a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public static /* synthetic */ void m22195E3(EditText editText, EditText editText2, CompoundButton compoundButton, boolean z) {
        editText.setEnabled(z);
        editText2.setEnabled(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public /* synthetic */ void m22196F3(FloatingActionButton floatingActionButton, CompoundButton compoundButton, boolean z) {
        floatingActionButton.setColorNormal(z ? 0 : this.m_iconBgColor);
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public /* synthetic */ void m22197G3(FloatingActionButton floatingActionButton, boolean z, int i) {
        if (z) {
            this.m_iconBgColor = i;
            floatingActionButton.setColorNormal(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public /* synthetic */ void m22198H3(FloatingActionButton floatingActionButton, Activity activity, View view) {
        new C11766a.C11769c(mo27827K0()).mo66987g(C17541R$string.select_color).mo66982b(C17525R$array.notification_colors).mo66986f(this.m_iconBgColor).mo66983c(true).mo66985e(1).mo66984d(new C5809a3(this, floatingActionButton)).mo66981a().show(((AppCompatActivity) activity).getSupportFragmentManager(), "");
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public /* synthetic */ void m22199I3(FloatingActionButton floatingActionButton, SeekBar seekBar, CompoundButton compoundButton, boolean z) {
        floatingActionButton.setPadding(0, 0, 0, 0);
        floatingActionButton.setType(z ? 1 : 0);
        int M3 = (int) m22203M3((float) seekBar.getProgress());
        floatingActionButton.setPadding(M3, M3, M3, M3);
        this.normalSizeSelected = !z;
        m22204R3(floatingActionButton, seekBar.getProgress());
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public static /* synthetic */ void m22200J3(Activity activity, View view) {
        Intent intent = new Intent(activity, IconSelectActivity.class);
        intent.putExtra("DisplayAppIcons", true);
        activity.startActivityForResult(intent, REQUEST_CODE_ICON_SELECT);
    }

    /* access modifiers changed from: private */
    /* renamed from: K3 */
    public /* synthetic */ void m22201K3(AppCompatDialog appCompatDialog, SeekBar seekBar, SeekBar seekBar2, RadioButton radioButton, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, Spinner spinner, EditText editText, EditText editText2, EditText editText3, View view) {
        appCompatDialog.dismiss();
        this.m_alpha = seekBar.getProgress();
        this.m_padding = seekBar2.getProgress();
        boolean z = true;
        this.m_size = radioButton.isChecked() ^ true ? 1 : 0;
        this.m_showOnLockScreen = checkBox.isChecked();
        this.m_transparentBackground = checkBox2.isChecked();
        this.forceLocation = checkBox3.isChecked();
        if (spinner.getSelectedItemPosition() == 0) {
            z = false;
        }
        this.disableTriggerOnRemove = z;
        this.identifier = editText.getText().toString();
        try {
            this.xLocation = TextUtils.isEmpty(editText2.getText().toString()) ? 0 : Integer.valueOf(editText2.getText().toString()).intValue();
        } catch (Exception unused) {
            this.xLocation = 0;
        }
        try {
            this.yLocation = TextUtils.isEmpty(editText3.getText().toString()) ? 0 : Integer.valueOf(editText3.getText().toString()).intValue();
        } catch (Exception unused2) {
            this.yLocation = 0;
        }
        mo24689O1();
        C10180a.m40075a().mo80018i(new FloatingButtonsUpdateEvent());
    }

    /* renamed from: M3 */
    private float m22203M3(float f) {
        return f * mo27827K0().getResources().getDisplayMetrics().density;
    }

    /* access modifiers changed from: private */
    /* renamed from: R3 */
    public void m22204R3(FloatingActionButton floatingActionButton, int i) {
        int M3 = (int) m22203M3((float) (i - 8));
        floatingActionButton.setPadding(M3, M3, M3, M3);
        String str = this.m_imageUri;
        if (str != null) {
            floatingActionButton.setImageURI(Uri.parse(str));
            return;
        }
        String str2 = this.m_imagePackageName;
        if (str2 == null) {
            int V = this.m_imageResourceName != null ? C4061t1.m15976V(mo27827K0(), this.m_imageResourceName) : -1;
            if (V != -1) {
                floatingActionButton.setImageResource(V);
                return;
            }
            int i2 = this.m_imageResourceId;
            if (i2 == 0) {
                floatingActionButton.setImageResource(C17530R$drawable.not_icon_setup);
            } else {
                floatingActionButton.setImageResource(i2);
            }
        } else if (str2.equals("UserIcon")) {
            Bitmap f = C6362a0.m24600f(this.m_imageResourceName);
            if (f != null) {
                floatingActionButton.setImageBitmap(f);
            } else {
                floatingActionButton.setImageResource(C17530R$drawable.launcher_no_border);
            }
        } else {
            Drawable I = C4061t1.m15960I(mo27827K0(), this.m_imagePackageName, this.m_imageResourceName);
            if (I == null) {
                I = C4061t1.m15958H(mo27827K0(), this.m_imagePackageName, this.m_imageResourceId);
            }
            if (I != null) {
                floatingActionButton.setImageDrawable(I);
            } else {
                floatingActionButton.setImageResource(C17530R$drawable.not_icon_setup);
            }
        }
    }

    /* renamed from: p3 */
    private void m22214p3() {
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_floating_button);
        appCompatDialog.setTitle((CharSequence) mo25559a1());
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.floating_button_change_background);
        SeekBar seekBar = (SeekBar) appCompatDialog.findViewById(C17532R$id.floating_button_alpha_seekbar);
        SeekBar seekBar2 = (SeekBar) appCompatDialog.findViewById(C17532R$id.padding_seekbar);
        TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.alpha_percent_text);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.normal_size);
        RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.mini_size);
        FloatingActionButton floatingActionButton = (FloatingActionButton) appCompatDialog.findViewById(C17532R$id.fab);
        CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.transparent_background_checkbox);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        CheckBox checkBox2 = (CheckBox) appCompatDialog.findViewById(C17532R$id.force_location_on_enable);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.x_location);
        Button button4 = (Button) appCompatDialog.findViewById(C17532R$id.floating_button_change_icon);
        EditText editText2 = (EditText) appCompatDialog.findViewById(C17532R$id.y_location);
        CheckBox checkBox3 = (CheckBox) appCompatDialog.findViewById(C17532R$id.show_on_lock_screen);
        Spinner spinner = (Spinner) appCompatDialog.findViewById(C17532R$id.disable_options_spinner);
        ImageView imageView = (ImageView) appCompatDialog.findViewById(C17532R$id.floating_button_image);
        EditText editText3 = (EditText) appCompatDialog.findViewById(C17532R$id.identifier_text);
        AppCompatDialog appCompatDialog2 = appCompatDialog;
        editText3.setText(this.identifier);
        checkBox2.setOnCheckedChangeListener(new C6184x2(editText, editText2));
        editText.setEnabled(this.forceLocation);
        editText2.setEnabled(this.forceLocation);
        editText.setText(String.valueOf(this.xLocation));
        editText2.setText(String.valueOf(this.yLocation));
        checkBox2.setChecked(this.forceLocation);
        this.m_fabRef = new WeakReference<>(floatingActionButton);
        this.m_paddingSeekBarRef = new WeakReference<>(seekBar2);
        int i = this.m_size;
        EditText editText4 = editText2;
        this.normalSizeSelected = i == 0;
        if (i == 0) {
            radioButton.setChecked(true);
            floatingActionButton.setType(0);
        } else {
            radioButton2.setChecked(true);
            floatingActionButton.setType(1);
        }
        checkBox.setChecked(this.m_transparentBackground);
        checkBox.setOnCheckedChangeListener(new C6196y2(this, floatingActionButton));
        spinner.setSelection(this.disableTriggerOnRemove ? 1 : 0);
        button.setOnClickListener(new C6172w2(this, floatingActionButton, j0));
        seekBar2.setMax(28);
        seekBar2.setProgress(this.m_padding);
        seekBar2.setOnSeekBarChangeListener(new C5648a(floatingActionButton, seekBar2));
        seekBar.setProgress(this.m_alpha);
        textView.setText(this.m_alpha + TaskerPlugin.VARIABLE_PREFIX);
        imageView.setAlpha(((float) this.m_alpha) / 100.0f);
        CheckBox checkBox4 = checkBox3;
        checkBox4.setChecked(this.m_showOnLockScreen);
        if (Build.VERSION.SDK_INT >= 26) {
            checkBox4.setVisibility(8);
        }
        seekBar.setOnSeekBarChangeListener(new C5649b(textView, floatingActionButton));
        radioButton2.setOnCheckedChangeListener(new C6208z2(this, floatingActionButton, seekBar2));
        m22204R3(floatingActionButton, this.m_padding);
        floatingActionButton.setColorNormal(this.m_transparentBackground ? 0 : this.m_iconBgColor);
        button4.setOnClickListener(new C6136t2(j0));
        button3.setOnClickListener(new C6160v2(this, appCompatDialog2, seekBar, seekBar2, radioButton, checkBox4, checkBox, checkBox2, spinner, editText3, editText, editText4));
        AppCompatDialog appCompatDialog3 = appCompatDialog2;
        button2.setOnClickListener(new C6148u2(appCompatDialog3));
        appCompatDialog3.show();
    }

    /* renamed from: s3 */
    private int m22215s3() {
        return this.normalSizeSelected ? 20 : 16;
    }

    /* renamed from: A3 */
    public int mo31136A3() {
        return this.m_padding;
    }

    /* renamed from: B3 */
    public boolean mo31137B3() {
        return this.m_showOnLockScreen;
    }

    /* renamed from: C3 */
    public int mo31138C3() {
        return this.m_size;
    }

    /* renamed from: D3 */
    public boolean mo31139D3() {
        return this.m_transparentBackground;
    }

    /* renamed from: N3 */
    public void mo31140N3(int i) {
        this.m_alpha = i;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.identifier;
    }

    /* renamed from: O3 */
    public void mo31141O3(int i) {
        this.m_iconBgColor = i;
    }

    /* renamed from: P3 */
    public void mo31142P3(String str, String str2, int i, String str3) {
        this.m_imagePackageName = str;
        this.m_imageResourceName = str2;
        this.m_imageResourceId = i;
        this.m_imageUri = str3;
    }

    /* renamed from: Q3 */
    public void mo31143Q3(FloatingActionButton floatingActionButton) {
        m22204R3(floatingActionButton, this.m_padding);
    }

    /* access modifiers changed from: protected */
    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i < 0) {
            s_triggerCounter = 0;
        }
        if (s_triggerCounter == 0) {
            mo27827K0().stopService(new Intent(mo27827K0(), FloatingButtonService.class));
        } else {
            C10180a.m40075a().mo80018i(new FloatingButtonsUpdateEvent());
        }
    }

    /* renamed from: S3 */
    public void mo31144S3(int i) {
        this.m_padding = i;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7503g0.m31200u();
    }

    /* renamed from: T3 */
    public void mo31145T3(int i) {
        this.m_size = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: U2 */
    public void mo30886U2() {
        int i = s_triggerCounter + 1;
        s_triggerCounter = i;
        if (i == 1) {
            mo27827K0().startService(new Intent(mo27827K0(), FloatingButtonService.class));
        } else {
            C10180a.m40075a().mo80018i(new FloatingButtonsUpdateEvent());
        }
    }

    /* renamed from: U3 */
    public void mo31146U3(boolean z) {
        this.m_transparentBackground = z;
    }

    /* renamed from: V3 */
    public void mo31147V3(int i, int i2) {
        this.xLocation = i;
        this.yLocation = i2;
    }

    /* renamed from: h2 */
    public boolean mo24893h2() {
        return true;
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        WeakReference<FloatingActionButton> weakReference;
        mo27877y2(activity);
        if (i == REQUEST_CODE_ICON_SELECT && i2 != 0 && (weakReference = this.m_fabRef) != null) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) weakReference.get();
            SeekBar seekBar = (SeekBar) this.m_paddingSeekBarRef.get();
            if (floatingActionButton != null && seekBar != null) {
                this.m_imageResourceId = intent.getIntExtra("drawableId", 0);
                this.m_imageResourceName = intent.getStringExtra("drawableName");
                this.m_imagePackageName = intent.getStringExtra("drawablePackageName");
                Uri data = intent.getData();
                if (data != null) {
                    this.m_imageUri = data.toString();
                }
                this.m_padding = m22215s3();
                seekBar.setProgress(m22215s3());
                m22204R3(floatingActionButton, this.m_padding);
            }
        }
    }

    /* renamed from: q3 */
    public int mo31148q3() {
        return this.m_alpha;
    }

    /* renamed from: r3 */
    public int mo31149r3() {
        if (this.m_transparentBackground) {
            return 0;
        }
        return this.m_iconBgColor;
    }

    @Nullable
    /* renamed from: t3 */
    public Point mo31150t3() {
        if (this.forceLocation) {
            return new Point(this.xLocation, this.yLocation);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        m22214p3();
    }

    @Nullable
    /* renamed from: u3 */
    public String mo31151u3() {
        return this.identifier;
    }

    /* renamed from: v3 */
    public String mo31152v3() {
        return this.m_imagePackageName;
    }

    /* renamed from: w3 */
    public int mo31153w3() {
        return this.m_imageResourceId;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_iconBgColor);
        parcel.writeInt(this.overridenBgColor);
        parcel.writeString(this.m_imageResourceName);
        parcel.writeString(this.m_imagePackageName);
        parcel.writeString(this.m_imageUri);
        parcel.writeInt(this.m_alpha);
        parcel.writeInt(this.overridenAlpha);
        parcel.writeInt(this.m_size);
        parcel.writeInt(this.overridenSize);
        parcel.writeInt(this.m_showOnLockScreen ? 1 : 0);
        parcel.writeInt(this.m_padding);
        parcel.writeInt(this.m_transparentBackground ? 1 : 0);
        parcel.writeInt(this.overridenTransparentBackground ? 1 : 0);
        parcel.writeInt(this.forceLocation ? 1 : 0);
        parcel.writeInt(this.xLocation);
        parcel.writeInt(this.yLocation);
        parcel.writeInt(this.disableTriggerOnRemove ? 1 : 0);
        parcel.writeString(this.identifier);
    }

    /* renamed from: x3 */
    public String mo31154x3() {
        return this.m_imageResourceName;
    }

    /* renamed from: y3 */
    public String mo31155y3() {
        return this.m_imageUri;
    }

    /* renamed from: z3 */
    public boolean mo31156z3() {
        return this.disableTriggerOnRemove;
    }

    public FloatingButtonTrigger(Activity activity, Macro macro) {
        this();
        this.m_macro = macro;
        mo27877y2(activity);
    }

    public FloatingButtonTrigger() {
        this.identifier = "";
        this.m_padding = 20;
        this.normalSizeSelected = true;
        this.m_alpha = 100;
        this.m_iconBgColor = ContextCompat.getColor(mo27827K0(), 2131100665);
    }

    private FloatingButtonTrigger(Parcel parcel) {
        super(parcel);
        this.identifier = "";
        this.m_padding = 20;
        boolean z = true;
        this.normalSizeSelected = true;
        this.m_iconBgColor = parcel.readInt();
        this.overridenBgColor = parcel.readInt();
        this.m_imageResourceName = parcel.readString();
        this.m_imagePackageName = parcel.readString();
        this.m_imageUri = parcel.readString();
        this.m_alpha = parcel.readInt();
        this.overridenAlpha = parcel.readInt();
        this.m_size = parcel.readInt();
        this.overridenSize = parcel.readInt();
        this.m_showOnLockScreen = parcel.readInt() != 0;
        this.m_padding = parcel.readInt();
        this.m_transparentBackground = parcel.readInt() != 0;
        this.overridenTransparentBackground = parcel.readInt() != 0;
        this.forceLocation = parcel.readInt() != 0;
        this.xLocation = parcel.readInt();
        this.yLocation = parcel.readInt();
        this.disableTriggerOnRemove = parcel.readInt() == 0 ? false : z;
        this.identifier = parcel.readString();
    }
}
