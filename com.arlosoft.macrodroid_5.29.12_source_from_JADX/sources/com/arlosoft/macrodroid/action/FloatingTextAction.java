package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import com.arlosoft.macrodroid.C17525R$array;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.database.C4373a;
import com.arlosoft.macrodroid.extensions.C4657d;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.triggers.services.FloatingTextService;
import com.google.android.material.card.MaterialCardView;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.jaredrummler.android.colorpicker.C11680c;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p057a2.C2224m;
import p128m0.C7714c1;
import p135n1.C7967d;
import p297ja.C13332o;
import p297ja.C13339u;
import p331n6.C15755a;
import p370qa.C16270q;
import p370qa.C16271r;

/* compiled from: FloatingTextAction.kt */
public final class FloatingTextAction extends Action implements C2224m {
    public static final Parcelable.Creator<FloatingTextAction> CREATOR = new C2444a();
    private static final int DEFAULT_CORNERS = 12;
    private static final int DEFAULT_PADDING = 8;
    private static final int DEFAULT_TEXT_SIZE = 14;
    private static final int MIN_TEXT_SIZE = 6;
    private static final int OPTION_HIDE = 1;
    private static final int OPTION_HIDE_ALL = 2;
    private static final int OPTION_SHOW = 0;

    /* renamed from: d */
    public static final C2445b f7259d = new C2445b((C13695i) null);
    private int alignment;
    private int alpha;
    private int bgColor;
    /* access modifiers changed from: private */
    public transient int bgColorDuringConfig;
    private int corners;
    /* access modifiers changed from: private */
    public transient int cornersDuringConfig;
    private String identifier;
    private boolean isInitialised;
    private int option;
    private int padding;
    private int textColor;
    /* access modifiers changed from: private */
    public transient int textColorDuringConfig;
    private int textSize;
    private String textToDisplay;
    private boolean updateLocation;
    private float xPosition;
    private float yPosition;

    /* renamed from: com.arlosoft.macrodroid.action.FloatingTextAction$a */
    /* compiled from: FloatingTextAction.kt */
    public static final class C2444a implements Parcelable.Creator<FloatingTextAction> {
        C2444a() {
        }

        /* renamed from: a */
        public FloatingTextAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new FloatingTextAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public FloatingTextAction[] newArray(int i) {
            return new FloatingTextAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.FloatingTextAction$b */
    /* compiled from: FloatingTextAction.kt */
    public static final class C2445b {
        private C2445b() {
        }

        public /* synthetic */ C2445b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.FloatingTextAction$c */
    /* compiled from: TextView.kt */
    public static final class C2446c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7260a;

        /* renamed from: c */
        final /* synthetic */ RadioButton f7261c;

        /* renamed from: d */
        final /* synthetic */ EditText f7262d;

        /* renamed from: f */
        final /* synthetic */ RadioButton f7263f;

        /* renamed from: g */
        final /* synthetic */ EditText f7264g;

        public C2446c(Button button, RadioButton radioButton, EditText editText, RadioButton radioButton2, EditText editText2) {
            this.f7260a = button;
            this.f7261c = radioButton;
            this.f7262d = editText;
            this.f7263f = radioButton2;
            this.f7264g = editText2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
            if ((r0.length() > 0) != false) goto L_0x0040;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void afterTextChanged(android.text.Editable r5) {
            /*
                r4 = this;
                android.widget.Button r5 = r4.f7260a
                android.widget.RadioButton r0 = r4.f7261c
                boolean r0 = r0.isChecked()
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x0040
                android.widget.EditText r0 = r4.f7262d
                android.text.Editable r0 = r0.getText()
                java.lang.String r3 = "identifierTextView.text"
                kotlin.jvm.internal.C13706o.m87928e(r0, r3)
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x001f
                r0 = 1
                goto L_0x0020
            L_0x001f:
                r0 = 0
            L_0x0020:
                if (r0 == 0) goto L_0x0041
                android.widget.RadioButton r0 = r4.f7263f
                boolean r0 = r0.isChecked()
                if (r0 != 0) goto L_0x0040
                android.widget.EditText r0 = r4.f7264g
                android.text.Editable r0 = r0.getText()
                java.lang.String r3 = "text.text"
                kotlin.jvm.internal.C13706o.m87928e(r0, r3)
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x003d
                r0 = 1
                goto L_0x003e
            L_0x003d:
                r0 = 0
            L_0x003e:
                if (r0 == 0) goto L_0x0041
            L_0x0040:
                r1 = 1
            L_0x0041:
                r5.setEnabled(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.FloatingTextAction.C2446c.afterTextChanged(android.text.Editable):void");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.FloatingTextAction$d */
    /* compiled from: TextView.kt */
    public static final class C2447d implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ FloatingTextAction f7265a;

        /* renamed from: c */
        final /* synthetic */ TextView f7266c;

        /* renamed from: d */
        final /* synthetic */ Button f7267d;

        /* renamed from: f */
        final /* synthetic */ RadioButton f7268f;

        /* renamed from: g */
        final /* synthetic */ EditText f7269g;

        /* renamed from: o */
        final /* synthetic */ RadioButton f7270o;

        /* renamed from: p */
        final /* synthetic */ EditText f7271p;

        public C2447d(FloatingTextAction floatingTextAction, TextView textView, Button button, RadioButton radioButton, EditText editText, RadioButton radioButton2, EditText editText2) {
            this.f7265a = floatingTextAction;
            this.f7266c = textView;
            this.f7267d = button;
            this.f7268f = radioButton;
            this.f7269g = editText;
            this.f7270o = radioButton2;
            this.f7271p = editText2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
            if ((r0.length() > 0) != false) goto L_0x004b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void afterTextChanged(android.text.Editable r5) {
            /*
                r4 = this;
                com.arlosoft.macrodroid.action.FloatingTextAction r0 = r4.f7265a
                android.widget.TextView r1 = r4.f7266c
                java.lang.String r5 = java.lang.String.valueOf(r5)
                r0.m10778J3(r1, r5)
                android.widget.Button r5 = r4.f7267d
                android.widget.RadioButton r0 = r4.f7268f
                boolean r0 = r0.isChecked()
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x004b
                android.widget.EditText r0 = r4.f7269g
                android.text.Editable r0 = r0.getText()
                java.lang.String r3 = "identifierTextView.text"
                kotlin.jvm.internal.C13706o.m87928e(r0, r3)
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x002a
                r0 = 1
                goto L_0x002b
            L_0x002a:
                r0 = 0
            L_0x002b:
                if (r0 == 0) goto L_0x004c
                android.widget.RadioButton r0 = r4.f7270o
                boolean r0 = r0.isChecked()
                if (r0 != 0) goto L_0x004b
                android.widget.EditText r0 = r4.f7271p
                android.text.Editable r0 = r0.getText()
                java.lang.String r3 = "text.text"
                kotlin.jvm.internal.C13706o.m87928e(r0, r3)
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0048
                r0 = 1
                goto L_0x0049
            L_0x0048:
                r0 = 0
            L_0x0049:
                if (r0 == 0) goto L_0x004c
            L_0x004b:
                r1 = 1
            L_0x004c:
                r5.setEnabled(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.FloatingTextAction.C2447d.afterTextChanged(android.text.Editable):void");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.FloatingTextAction$e */
    /* compiled from: FloatingTextAction.kt */
    public static final class C2448e implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ TextView f7272a;

        C2448e(TextView textView) {
            this.f7272a = textView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C13706o.m87929f(seekBar, "seekBar");
            TextView textView = this.f7272a;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append('%');
            textView.setText(sb.toString());
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.FloatingTextAction$f */
    /* compiled from: FloatingTextAction.kt */
    public static final class C2449f implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ TextView f7273a;

        /* renamed from: b */
        final /* synthetic */ TextView f7274b;

        C2449f(TextView textView, TextView textView2) {
            this.f7273a = textView;
            this.f7274b = textView2;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C13706o.m87929f(seekBar, "seekBar");
            if (z) {
                int i2 = i + 6;
                this.f7273a.setTextSize(2, (float) i2);
                this.f7274b.setText(String.valueOf(i2));
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            C13706o.m87929f(seekBar, "seekBar");
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            C13706o.m87929f(seekBar, "seekBar");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.FloatingTextAction$g */
    /* compiled from: FloatingTextAction.kt */
    public static final class C2450g implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ TextView f7275a;

        /* renamed from: b */
        final /* synthetic */ TextView f7276b;

        C2450g(TextView textView, TextView textView2) {
            this.f7275a = textView;
            this.f7276b = textView2;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C13706o.m87929f(seekBar, "seekBar");
            if (z) {
                TextView textView = this.f7275a;
                int b = C4657d.m18117b(i);
                textView.setPadding(b, b, b, b);
                this.f7276b.setText(String.valueOf(i));
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            C13706o.m87929f(seekBar, "seekBar");
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            C13706o.m87929f(seekBar, "seekBar");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.FloatingTextAction$h */
    /* compiled from: FloatingTextAction.kt */
    public static final class C2451h implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ TextView f7277a;

        /* renamed from: b */
        final /* synthetic */ TextView f7278b;

        C2451h(TextView textView, TextView textView2) {
            this.f7277a = textView;
            this.f7278b = textView2;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C13706o.m87929f(seekBar, "seekBar");
            if (z) {
                this.f7277a.setAlpha(((float) i) / 100.0f);
                this.f7278b.setText(String.valueOf(i));
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            C13706o.m87929f(seekBar, "seekBar");
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            C13706o.m87929f(seekBar, "seekBar");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.FloatingTextAction$i */
    /* compiled from: FloatingTextAction.kt */
    public static final class C2452i implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ FloatingTextAction f7279a;

        /* renamed from: b */
        final /* synthetic */ TextView f7280b;

        /* renamed from: c */
        final /* synthetic */ TextView f7281c;

        C2452i(FloatingTextAction floatingTextAction, TextView textView, TextView textView2) {
            this.f7279a = floatingTextAction;
            this.f7280b = textView;
            this.f7281c = textView2;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C13706o.m87929f(seekBar, "seekBar");
            if (z) {
                this.f7279a.cornersDuringConfig = i;
                FloatingTextAction floatingTextAction = this.f7279a;
                floatingTextAction.m10777I3(this.f7280b, i, floatingTextAction.bgColorDuringConfig);
                this.f7281c.setText(String.valueOf(i));
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            C13706o.m87929f(seekBar, "seekBar");
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            C13706o.m87929f(seekBar, "seekBar");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.FloatingTextAction$j */
    /* compiled from: FloatingTextAction.kt */
    static final class C2453j extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ ImageButton $alignCenterButton;
        final /* synthetic */ ImageButton $alignLeftButton;
        final /* synthetic */ ImageButton $alignRightButton;
        final /* synthetic */ TextView $previewText;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2453j(ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, TextView textView, C13635d<? super C2453j> dVar) {
            super(3, dVar);
            this.$alignLeftButton = imageButton;
            this.$alignCenterButton = imageButton2;
            this.$alignRightButton = imageButton3;
            this.$previewText = textView;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2453j(this.$alignLeftButton, this.$alignCenterButton, this.$alignRightButton, this.$previewText, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.$alignLeftButton.setSelected(true);
                this.$alignCenterButton.setSelected(false);
                this.$alignRightButton.setSelected(false);
                this.$previewText.setGravity(3);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.FloatingTextAction$k */
    /* compiled from: FloatingTextAction.kt */
    static final class C2454k extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ ImageButton $alignCenterButton;
        final /* synthetic */ ImageButton $alignLeftButton;
        final /* synthetic */ ImageButton $alignRightButton;
        final /* synthetic */ TextView $previewText;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2454k(ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, TextView textView, C13635d<? super C2454k> dVar) {
            super(3, dVar);
            this.$alignCenterButton = imageButton;
            this.$alignLeftButton = imageButton2;
            this.$alignRightButton = imageButton3;
            this.$previewText = textView;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2454k(this.$alignCenterButton, this.$alignLeftButton, this.$alignRightButton, this.$previewText, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.$alignCenterButton.setSelected(true);
                this.$alignLeftButton.setSelected(false);
                this.$alignRightButton.setSelected(false);
                this.$previewText.setGravity(1);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.FloatingTextAction$l */
    /* compiled from: FloatingTextAction.kt */
    static final class C2455l extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ ImageButton $alignCenterButton;
        final /* synthetic */ ImageButton $alignLeftButton;
        final /* synthetic */ ImageButton $alignRightButton;
        final /* synthetic */ TextView $previewText;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2455l(ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, TextView textView, C13635d<? super C2455l> dVar) {
            super(3, dVar);
            this.$alignLeftButton = imageButton;
            this.$alignCenterButton = imageButton2;
            this.$alignRightButton = imageButton3;
            this.$previewText = textView;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2455l(this.$alignLeftButton, this.$alignCenterButton, this.$alignRightButton, this.$previewText, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.$alignLeftButton.setSelected(false);
                this.$alignCenterButton.setSelected(false);
                this.$alignRightButton.setSelected(true);
                this.$previewText.setGravity(5);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.FloatingTextAction$m */
    /* compiled from: FloatingTextAction.kt */
    static final class C2456m extends C13665l implements C16271r<C15478k0, CompoundButton, Boolean, C13635d<? super C13339u>, Object> {
        final /* synthetic */ ViewGroup $identifierLayout;
        final /* synthetic */ EditText $identifierTextView;
        final /* synthetic */ Button $okButton;
        final /* synthetic */ ViewGroup $showConfigLayout;
        final /* synthetic */ EditText $text;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2456m(ViewGroup viewGroup, ViewGroup viewGroup2, Button button, EditText editText, EditText editText2, C13635d<? super C2456m> dVar) {
            super(4, dVar);
            this.$showConfigLayout = viewGroup;
            this.$identifierLayout = viewGroup2;
            this.$okButton = button;
            this.$identifierTextView = editText;
            this.$text = editText2;
        }

        /* renamed from: h */
        public final Object mo25097h(C15478k0 k0Var, CompoundButton compoundButton, boolean z, C13635d<? super C13339u> dVar) {
            C2456m mVar = new C2456m(this.$showConfigLayout, this.$identifierLayout, this.$okButton, this.$identifierTextView, this.$text, dVar);
            mVar.Z$0 = z;
            return mVar.invokeSuspend(C13339u.f61331a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return mo25097h((C15478k0) obj, (CompoundButton) obj2, ((Boolean) obj3).booleanValue(), (C13635d) obj4);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                if (this.Z$0) {
                    boolean z = false;
                    this.$showConfigLayout.setVisibility(0);
                    this.$identifierLayout.setVisibility(0);
                    Button button = this.$okButton;
                    Editable text = this.$identifierTextView.getText();
                    C13706o.m87928e(text, "identifierTextView.text");
                    if (text.length() > 0) {
                        Editable text2 = this.$text.getText();
                        C13706o.m87928e(text2, "text.text");
                        if (text2.length() > 0) {
                            z = true;
                        }
                    }
                    button.setEnabled(z);
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.FloatingTextAction$n */
    /* compiled from: FloatingTextAction.kt */
    static final class C2457n extends C13665l implements C16271r<C15478k0, CompoundButton, Boolean, C13635d<? super C13339u>, Object> {
        final /* synthetic */ ViewGroup $identifierLayout;
        final /* synthetic */ EditText $identifierTextView;
        final /* synthetic */ Button $okButton;
        final /* synthetic */ ViewGroup $showConfigLayout;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2457n(ViewGroup viewGroup, ViewGroup viewGroup2, Button button, EditText editText, C13635d<? super C2457n> dVar) {
            super(4, dVar);
            this.$showConfigLayout = viewGroup;
            this.$identifierLayout = viewGroup2;
            this.$okButton = button;
            this.$identifierTextView = editText;
        }

        /* renamed from: h */
        public final Object mo25098h(C15478k0 k0Var, CompoundButton compoundButton, boolean z, C13635d<? super C13339u> dVar) {
            C2457n nVar = new C2457n(this.$showConfigLayout, this.$identifierLayout, this.$okButton, this.$identifierTextView, dVar);
            nVar.Z$0 = z;
            return nVar.invokeSuspend(C13339u.f61331a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return mo25098h((C15478k0) obj, (CompoundButton) obj2, ((Boolean) obj3).booleanValue(), (C13635d) obj4);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                if (this.Z$0) {
                    this.$showConfigLayout.setVisibility(8);
                    boolean z = false;
                    this.$identifierLayout.setVisibility(0);
                    Button button = this.$okButton;
                    Editable text = this.$identifierTextView.getText();
                    C13706o.m87928e(text, "identifierTextView.text");
                    if (text.length() > 0) {
                        z = true;
                    }
                    button.setEnabled(z);
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.FloatingTextAction$o */
    /* compiled from: FloatingTextAction.kt */
    static final class C2458o extends C13665l implements C16271r<C15478k0, CompoundButton, Boolean, C13635d<? super C13339u>, Object> {
        final /* synthetic */ ViewGroup $identifierLayout;
        final /* synthetic */ Button $okButton;
        final /* synthetic */ ViewGroup $showConfigLayout;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2458o(ViewGroup viewGroup, ViewGroup viewGroup2, Button button, C13635d<? super C2458o> dVar) {
            super(4, dVar);
            this.$showConfigLayout = viewGroup;
            this.$identifierLayout = viewGroup2;
            this.$okButton = button;
        }

        /* renamed from: h */
        public final Object mo25099h(C15478k0 k0Var, CompoundButton compoundButton, boolean z, C13635d<? super C13339u> dVar) {
            C2458o oVar = new C2458o(this.$showConfigLayout, this.$identifierLayout, this.$okButton, dVar);
            oVar.Z$0 = z;
            return oVar.invokeSuspend(C13339u.f61331a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return mo25099h((C15478k0) obj, (CompoundButton) obj2, ((Boolean) obj3).booleanValue(), (C13635d) obj4);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                if (this.Z$0) {
                    this.$showConfigLayout.setVisibility(8);
                    this.$identifierLayout.setVisibility(8);
                    this.$okButton.setEnabled(true);
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.FloatingTextAction$p */
    /* compiled from: FloatingTextAction.kt */
    public static final class C2459p implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ TextView f7282a;

        C2459p(TextView textView) {
            this.f7282a = textView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C13706o.m87929f(seekBar, "seekBar");
            TextView textView = this.f7282a;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append('%');
            textView.setText(sb.toString());
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.FloatingTextAction$q */
    /* compiled from: FloatingTextAction.kt */
    public static final class C2460q implements C15755a {

        /* renamed from: a */
        final /* synthetic */ FloatingTextAction f7283a;

        /* renamed from: c */
        final /* synthetic */ MaterialCardView f7284c;

        /* renamed from: d */
        final /* synthetic */ MaterialCardView f7285d;

        /* renamed from: f */
        final /* synthetic */ TextView f7286f;

        C2460q(FloatingTextAction floatingTextAction, MaterialCardView materialCardView, MaterialCardView materialCardView2, TextView textView) {
            this.f7283a = floatingTextAction;
            this.f7284c = materialCardView;
            this.f7285d = materialCardView2;
            this.f7286f = textView;
        }

        /* renamed from: U */
        public void mo24603U(int i, int i2) {
            this.f7283a.bgColorDuringConfig = i2;
            this.f7284c.setCardBackgroundColor(this.f7283a.bgColorDuringConfig);
            this.f7285d.setCardBackgroundColor(this.f7283a.textColorDuringConfig);
            FloatingTextAction floatingTextAction = this.f7283a;
            floatingTextAction.m10777I3(this.f7286f, floatingTextAction.cornersDuringConfig, this.f7283a.bgColorDuringConfig);
        }

        /* renamed from: V0 */
        public void mo24604V0(int i) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.FloatingTextAction$r */
    /* compiled from: FloatingTextAction.kt */
    public static final class C2461r implements C15755a {

        /* renamed from: a */
        final /* synthetic */ FloatingTextAction f7287a;

        /* renamed from: c */
        final /* synthetic */ MaterialCardView f7288c;

        /* renamed from: d */
        final /* synthetic */ MaterialCardView f7289d;

        /* renamed from: f */
        final /* synthetic */ TextView f7290f;

        C2461r(FloatingTextAction floatingTextAction, MaterialCardView materialCardView, MaterialCardView materialCardView2, TextView textView) {
            this.f7287a = floatingTextAction;
            this.f7288c = materialCardView;
            this.f7289d = materialCardView2;
            this.f7290f = textView;
        }

        /* renamed from: U */
        public void mo24603U(int i, int i2) {
            this.f7287a.textColorDuringConfig = i2;
            this.f7288c.setCardBackgroundColor(this.f7287a.bgColorDuringConfig);
            this.f7289d.setCardBackgroundColor(this.f7287a.textColorDuringConfig);
            this.f7290f.setTextColor(i2);
        }

        /* renamed from: V0 */
        public void mo24604V0(int i) {
        }
    }

    public FloatingTextAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ FloatingTextAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public static final void m10769A3(FloatingTextAction floatingTextAction, Activity activity, MaterialCardView materialCardView, MaterialCardView materialCardView2, TextView textView, View view) {
        C13706o.m87929f(floatingTextAction, "this$0");
        C13706o.m87929f(materialCardView, "$bgColorCircle");
        C13706o.m87929f(materialCardView2, "$textColorCircle");
        C13706o.m87929f(textView, "$previewText");
        int[] intArray = floatingTextAction.mo27827K0().getResources().getIntArray(C17525R$array.toast_colors);
        C13706o.m87928e(intArray, "context.resources.getInt…ray(R.array.toast_colors)");
        C11680c a = C11680c.m81798g0().mo65734d(floatingTextAction.bgColorDuringConfig).mo65738h(1).mo65739i(intArray).mo65732b(true).mo65742l(true).mo65733c(false).mo65731a();
        a.mo65718m0(new C2460q(floatingTextAction, materialCardView, materialCardView2, textView));
        C13706o.m87927d(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        a.show(((FragmentActivity) activity).getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public static final void m10770B3(FloatingTextAction floatingTextAction, Activity activity, MaterialCardView materialCardView, MaterialCardView materialCardView2, TextView textView, View view) {
        C13706o.m87929f(floatingTextAction, "this$0");
        C13706o.m87929f(materialCardView, "$bgColorCircle");
        C13706o.m87929f(materialCardView2, "$textColorCircle");
        C13706o.m87929f(textView, "$previewText");
        int[] intArray = floatingTextAction.mo27827K0().getResources().getIntArray(C17525R$array.toast_colors);
        C13706o.m87928e(intArray, "context.resources.getInt…ray(R.array.toast_colors)");
        C11680c a = C11680c.m81798g0().mo65734d(floatingTextAction.textColorDuringConfig).mo65738h(1).mo65739i(intArray).mo65732b(true).mo65742l(true).mo65733c(false).mo65731a();
        a.mo65718m0(new C2461r(floatingTextAction, materialCardView, materialCardView2, textView));
        C13706o.m87927d(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        a.show(((FragmentActivity) activity).getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public static final void m10771C3(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$identifierTextView");
        C13706o.m87929f(fVar, "pair");
        int b = C16792h.m99540b(editText.getSelectionStart(), 0);
        int b2 = C16792h.m99540b(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int d = C16792h.m99542d(b, b2);
        int b3 = C16792h.m99540b(b, b2);
        String str = fVar.f10575a;
        text.replace(d, b3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public static final void m10772D3(FloatingTextAction floatingTextAction, C4023j0.C4028e eVar, View view) {
        C13706o.m87929f(floatingTextAction, "this$0");
        C13706o.m87929f(eVar, "$magicTextIdentifierListener");
        C4023j0.m15700F(floatingTextAction.mo27850j0(), eVar, floatingTextAction.mo27837X0(), false, true, false, C17542R$style.Theme_App_Dialog_SmallText, C7967d.NONE);
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public static final void m10773E3(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$text");
        C13706o.m87929f(fVar, "pair");
        int b = C16792h.m99540b(editText.getSelectionStart(), 0);
        int b2 = C16792h.m99540b(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int d = C16792h.m99542d(b, b2);
        int b3 = C16792h.m99540b(b, b2);
        String str = fVar.f10575a;
        text.replace(d, b3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public static final void m10774F3(FloatingTextAction floatingTextAction, C4023j0.C4028e eVar, View view) {
        C13706o.m87929f(floatingTextAction, "this$0");
        C13706o.m87929f(eVar, "$magicTextListener");
        C4023j0.m15700F(floatingTextAction.mo27850j0(), eVar, floatingTextAction.mo27837X0(), false, true, false, C17542R$style.Theme_App_Dialog_SmallText, C7967d.NONE);
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public static final void m10775G3(AppCompatDialog appCompatDialog, FloatingTextAction floatingTextAction, RadioButton radioButton, RadioButton radioButton2, SeekBar seekBar, SeekBar seekBar2, SeekBar seekBar3, EditText editText, EditText editText2, SeekBar seekBar4, SeekBar seekBar5, CheckBox checkBox, ImageButton imageButton, ImageButton imageButton2, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        C13706o.m87929f(floatingTextAction, "this$0");
        C13706o.m87929f(radioButton, "$showRadioButton");
        C13706o.m87929f(radioButton2, "$hideRadioButton");
        C13706o.m87929f(seekBar, "$textSizeSeekBar");
        C13706o.m87929f(seekBar2, "$alphaSeekBar");
        C13706o.m87929f(seekBar3, "$paddingSeekBar");
        C13706o.m87929f(editText, "$text");
        C13706o.m87929f(editText2, "$identifierTextView");
        C13706o.m87929f(seekBar4, "$horizontalPosSeekBar");
        C13706o.m87929f(seekBar5, "$verticalPosSeekBar");
        C13706o.m87929f(checkBox, "$forceLocationCheckBox");
        C13706o.m87929f(imageButton, "$alignLeftButton");
        C13706o.m87929f(imageButton2, "$alignRightButton");
        appCompatDialog.dismiss();
        boolean isChecked = radioButton.isChecked();
        int i = 2;
        floatingTextAction.option = isChecked ? 0 : radioButton2.isChecked() ? 1 : 2;
        floatingTextAction.textSize = seekBar.getProgress() + 6;
        floatingTextAction.alpha = seekBar2.getProgress();
        floatingTextAction.padding = seekBar3.getProgress();
        floatingTextAction.textToDisplay = editText.getText().toString();
        floatingTextAction.identifier = editText2.getText().toString();
        floatingTextAction.bgColor = floatingTextAction.bgColorDuringConfig;
        floatingTextAction.textColor = floatingTextAction.textColorDuringConfig;
        floatingTextAction.xPosition = ((float) seekBar4.getProgress()) / 100.0f;
        floatingTextAction.yPosition = ((float) seekBar5.getProgress()) / 100.0f;
        floatingTextAction.isInitialised = true;
        floatingTextAction.updateLocation = checkBox.isChecked();
        floatingTextAction.corners = floatingTextAction.cornersDuringConfig;
        if (imageButton.isSelected()) {
            i = 1;
        } else if (!imageButton2.isSelected()) {
            i = 0;
        }
        floatingTextAction.alignment = i;
        floatingTextAction.mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public static final void m10776H3(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public final void m10777I3(TextView textView, int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius((float) C4657d.m18117b(i));
        gradientDrawable.setColor(i2);
        textView.setBackground(gradientDrawable);
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public final void m10778J3(TextView textView, String str) {
        if (str.length() == 0) {
            textView.setText(SelectableItem.m15535j1(C17541R$string.text));
        } else {
            textView.setText(C4023j0.m15760t0(MacroDroidApplication.f9883I.mo27303b(), str, (TriggerContextInfo) null, mo27837X0()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0372, code lost:
        if ((r0.length() > 0) != false) goto L_0x0377;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0381  */
    /* renamed from: z3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m10795z3() {
        /*
            r66 = this;
            r15 = r66
            android.app.Activity r8 = r66.mo27850j0()
            androidx.appcompat.app.AppCompatDialog r14 = new androidx.appcompat.app.AppCompatDialog
            int r0 = r66.mo24688L0()
            r14.<init>(r8, r0)
            r0 = 2131558589(0x7f0d00bd, float:1.8742498E38)
            r14.setContentView((int) r0)
            java.lang.String r0 = r66.mo25559a1()
            r14.setTitle((java.lang.CharSequence) r0)
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r0.<init>()
            android.view.Window r1 = r14.getWindow()
            kotlin.jvm.internal.C13706o.m87926c(r1)
            android.view.WindowManager$LayoutParams r1 = r1.getAttributes()
            r0.copyFrom(r1)
            r1 = -1
            r0.width = r1
            android.view.Window r1 = r14.getWindow()
            kotlin.jvm.internal.C13706o.m87926c(r1)
            r1.setAttributes(r0)
            r0 = 2131363406(0x7f0a064e, float:1.834662E38)
            android.view.View r0 = r14.findViewById(r0)
            kotlin.jvm.internal.C13706o.m87926c(r0)
            r13 = r0
            android.widget.Button r13 = (android.widget.Button) r13
            r0 = 2131362173(0x7f0a017d, float:1.834412E38)
            android.view.View r0 = r14.findViewById(r0)
            kotlin.jvm.internal.C13706o.m87926c(r0)
            r12 = r0
            android.widget.Button r12 = (android.widget.Button) r12
            r0 = 2131361942(0x7f0a0096, float:1.834365E38)
            android.view.View r0 = r14.findViewById(r0)
            kotlin.jvm.internal.C13706o.m87926c(r0)
            r9 = r0
            android.widget.SeekBar r9 = (android.widget.SeekBar) r9
            r0 = 2131361941(0x7f0a0095, float:1.8343649E38)
            android.view.View r0 = r14.findViewById(r0)
            kotlin.jvm.internal.C13706o.m87926c(r0)
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 2131363443(0x7f0a0673, float:1.8346695E38)
            android.view.View r0 = r14.findViewById(r0)
            kotlin.jvm.internal.C13706o.m87926c(r0)
            r11 = r0
            android.widget.SeekBar r11 = (android.widget.SeekBar) r11
            r0 = 2131363444(0x7f0a0674, float:1.8346697E38)
            android.view.View r0 = r14.findViewById(r0)
            kotlin.jvm.internal.C13706o.m87926c(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 2131363801(0x7f0a07d9, float:1.8347421E38)
            android.view.View r1 = r14.findViewById(r1)
            kotlin.jvm.internal.C13706o.m87926c(r1)
            r7 = r1
            android.widget.SeekBar r7 = (android.widget.SeekBar) r7
            r1 = 2131363802(0x7f0a07da, float:1.8347423E38)
            android.view.View r1 = r14.findViewById(r1)
            kotlin.jvm.internal.C13706o.m87926c(r1)
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1 = 2131362398(0x7f0a025e, float:1.8344575E38)
            android.view.View r1 = r14.findViewById(r1)
            kotlin.jvm.internal.C13706o.m87926c(r1)
            r5 = r1
            android.widget.SeekBar r5 = (android.widget.SeekBar) r5
            r1 = 2131362399(0x7f0a025f, float:1.8344577E38)
            android.view.View r1 = r14.findViewById(r1)
            kotlin.jvm.internal.C13706o.m87926c(r1)
            r4 = r1
            android.widget.TextView r4 = (android.widget.TextView) r4
            r1 = 2131362892(0x7f0a044c, float:1.8345577E38)
            android.view.View r1 = r14.findViewById(r1)
            kotlin.jvm.internal.C13706o.m87926c(r1)
            r3 = r1
            android.widget.SeekBar r3 = (android.widget.SeekBar) r3
            r1 = 2131364292(0x7f0a09c4, float:1.8348417E38)
            android.view.View r1 = r14.findViewById(r1)
            kotlin.jvm.internal.C13706o.m87926c(r1)
            r2 = r1
            android.widget.SeekBar r2 = (android.widget.SeekBar) r2
            r1 = 2131362651(0x7f0a035b, float:1.8345089E38)
            android.view.View r1 = r14.findViewById(r1)
            kotlin.jvm.internal.C13706o.m87926c(r1)
            com.google.android.material.textfield.TextInputLayout r1 = (com.google.android.material.textfield.TextInputLayout) r1
            r1 = 2131362919(0x7f0a0467, float:1.8345632E38)
            android.view.View r1 = r14.findViewById(r1)
            kotlin.jvm.internal.C13706o.m87926c(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r16 = r0
            r0 = 2131363786(0x7f0a07ca, float:1.834739E38)
            android.view.View r0 = r14.findViewById(r0)
            kotlin.jvm.internal.C13706o.m87926c(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r17 = r1
            r1 = 2131362570(0x7f0a030a, float:1.8344924E38)
            android.view.View r1 = r14.findViewById(r1)
            kotlin.jvm.internal.C13706o.m87926c(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r18 = r1
            r1 = 2131363790(0x7f0a07ce, float:1.8347399E38)
            android.view.View r1 = r14.findViewById(r1)
            kotlin.jvm.internal.C13706o.m87926c(r1)
            android.widget.RadioButton r1 = (android.widget.RadioButton) r1
            r19 = r2
            r2 = 2131362883(0x7f0a0443, float:1.834556E38)
            android.view.View r2 = r14.findViewById(r2)
            kotlin.jvm.internal.C13706o.m87926c(r2)
            android.widget.RadioButton r2 = (android.widget.RadioButton) r2
            r20 = r3
            r3 = 2131362881(0x7f0a0441, float:1.8345555E38)
            android.view.View r3 = r14.findViewById(r3)
            kotlin.jvm.internal.C13706o.m87926c(r3)
            android.widget.RadioButton r3 = (android.widget.RadioButton) r3
            r21 = r4
            r4 = 2131362054(0x7f0a0106, float:1.8343878E38)
            android.view.View r4 = r14.findViewById(r4)
            kotlin.jvm.internal.C13706o.m87926c(r4)
            com.google.android.material.card.MaterialCardView r4 = (com.google.android.material.card.MaterialCardView) r4
            r22 = r4
            r4 = 2131362216(0x7f0a01a8, float:1.8344206E38)
            android.view.View r4 = r14.findViewById(r4)
            kotlin.jvm.internal.C13706o.m87926c(r4)
            android.widget.Button r4 = (android.widget.Button) r4
            r23 = r4
            r4 = 2131363995(0x7f0a089b, float:1.8347815E38)
            android.view.View r4 = r14.findViewById(r4)
            kotlin.jvm.internal.C13706o.m87926c(r4)
            com.google.android.material.card.MaterialCardView r4 = (com.google.android.material.card.MaterialCardView) r4
            r24 = r4
            r4 = 2131362217(0x7f0a01a9, float:1.8344208E38)
            android.view.View r4 = r14.findViewById(r4)
            kotlin.jvm.internal.C13706o.m87926c(r4)
            android.widget.Button r4 = (android.widget.Button) r4
            r25 = r4
            r4 = 2131363536(0x7f0a06d0, float:1.8346884E38)
            android.view.View r4 = r14.findViewById(r4)
            kotlin.jvm.internal.C13706o.m87926c(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r32 = r5
            r5 = 2131363134(0x7f0a053e, float:1.8346068E38)
            android.view.View r5 = r14.findViewById(r5)
            kotlin.jvm.internal.C13706o.m87926c(r5)
            android.widget.Button r5 = (android.widget.Button) r5
            r33 = r5
            r5 = 2131363133(0x7f0a053d, float:1.8346066E38)
            android.view.View r5 = r14.findViewById(r5)
            kotlin.jvm.internal.C13706o.m87926c(r5)
            android.widget.Button r5 = (android.widget.Button) r5
            r34 = r5
            r5 = 2131362891(0x7f0a044b, float:1.8345575E38)
            android.view.View r5 = r14.findViewById(r5)
            kotlin.jvm.internal.C13706o.m87926c(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r35 = r5
            r5 = 2131364291(0x7f0a09c3, float:1.8348415E38)
            android.view.View r5 = r14.findViewById(r5)
            kotlin.jvm.internal.C13706o.m87926c(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r36 = r5
            r5 = 2131362824(0x7f0a0408, float:1.834544E38)
            android.view.View r5 = r14.findViewById(r5)
            kotlin.jvm.internal.C13706o.m87926c(r5)
            android.widget.CheckBox r5 = (android.widget.CheckBox) r5
            r37 = r6
            r6 = 2131362918(0x7f0a0466, float:1.834563E38)
            android.view.View r6 = r14.findViewById(r6)
            kotlin.jvm.internal.C13706o.m87926c(r6)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r38 = r7
            r7 = 2131363037(0x7f0a04dd, float:1.8345872E38)
            android.view.View r7 = r14.findViewById(r7)
            kotlin.jvm.internal.C13706o.m87926c(r7)
            android.widget.ImageButton r7 = (android.widget.ImageButton) r7
            r39 = r12
            r12 = 2131362211(0x7f0a01a3, float:1.8344196E38)
            android.view.View r12 = r14.findViewById(r12)
            kotlin.jvm.internal.C13706o.m87926c(r12)
            android.widget.ImageButton r12 = (android.widget.ImageButton) r12
            r40 = r8
            r8 = 2131363635(0x7f0a0733, float:1.8347084E38)
            android.view.View r8 = r14.findViewById(r8)
            kotlin.jvm.internal.C13706o.m87926c(r8)
            android.widget.ImageButton r8 = (android.widget.ImageButton) r8
            r41 = r14
            boolean r14 = r15.updateLocation
            r5.setChecked(r14)
            int r14 = r15.option
            r42 = 0
            r43 = r9
            r9 = 1
            if (r14 != 0) goto L_0x020b
            r14 = 1
            goto L_0x020c
        L_0x020b:
            r14 = 0
        L_0x020c:
            r1.setChecked(r14)
            int r14 = r15.option
            if (r14 != r9) goto L_0x0215
            r14 = 1
            goto L_0x0216
        L_0x0215:
            r14 = 0
        L_0x0216:
            r2.setChecked(r14)
            int r14 = r15.option
            r9 = 2
            if (r14 != r9) goto L_0x0220
            r14 = 1
            goto L_0x0221
        L_0x0220:
            r14 = 0
        L_0x0221:
            r3.setChecked(r14)
            int r14 = r15.option
            if (r14 != 0) goto L_0x022a
            r14 = 1
            goto L_0x022b
        L_0x022a:
            r14 = 0
        L_0x022b:
            if (r14 == 0) goto L_0x022f
            r14 = 0
            goto L_0x0231
        L_0x022f:
            r14 = 8
        L_0x0231:
            r0.setVisibility(r14)
            int r14 = r15.alignment
            r9 = 1
            if (r14 != r9) goto L_0x023b
            r9 = 1
            goto L_0x023c
        L_0x023b:
            r9 = 0
        L_0x023c:
            r7.setSelected(r9)
            int r9 = r15.alignment
            if (r9 != 0) goto L_0x0245
            r9 = 1
            goto L_0x0246
        L_0x0245:
            r9 = 0
        L_0x0246:
            r12.setSelected(r9)
            int r9 = r15.alignment
            r14 = 2
            if (r9 != r14) goto L_0x0250
            r9 = 1
            goto L_0x0251
        L_0x0250:
            r9 = 0
        L_0x0251:
            r8.setSelected(r9)
            int r9 = r15.alignment
            r14 = 1
            if (r9 != r14) goto L_0x025b
            r9 = 3
            goto L_0x0261
        L_0x025b:
            r14 = 2
            if (r9 != r14) goto L_0x0260
            r9 = 5
            goto L_0x0261
        L_0x0260:
            r9 = 1
        L_0x0261:
            r4.setGravity(r9)
            com.arlosoft.macrodroid.action.FloatingTextAction$j r9 = new com.arlosoft.macrodroid.action.FloatingTextAction$j
            r31 = 0
            r26 = r9
            r27 = r7
            r28 = r12
            r29 = r8
            r30 = r4
            r26.<init>(r27, r28, r29, r30, r31)
            r14 = 0
            r44 = r10
            r10 = 1
            com.arlosoft.macrodroid.extensions.C4666m.m18147o(r7, r14, r9, r10, r14)
            com.arlosoft.macrodroid.action.FloatingTextAction$k r9 = new com.arlosoft.macrodroid.action.FloatingTextAction$k
            r26 = r9
            r27 = r12
            r28 = r7
            r26.<init>(r27, r28, r29, r30, r31)
            com.arlosoft.macrodroid.extensions.C4666m.m18147o(r12, r14, r9, r10, r14)
            com.arlosoft.macrodroid.action.FloatingTextAction$l r9 = new com.arlosoft.macrodroid.action.FloatingTextAction$l
            r26 = r9
            r27 = r7
            r28 = r12
            r26.<init>(r27, r28, r29, r30, r31)
            com.arlosoft.macrodroid.extensions.C4666m.m18147o(r8, r14, r9, r10, r14)
            com.arlosoft.macrodroid.action.FloatingTextAction$m r9 = new com.arlosoft.macrodroid.action.FloatingTextAction$m
            r12 = 0
            r45 = r1
            r26 = r17
            r1 = r9
            r47 = r2
            r46 = r19
            r2 = r0
            r49 = r3
            r48 = r20
            r3 = r6
            r55 = r4
            r50 = r21
            r51 = r22
            r52 = r23
            r53 = r24
            r54 = r25
            r4 = r13
            r17 = r5
            r56 = r32
            r57 = r33
            r58 = r34
            r59 = r35
            r60 = r36
            r5 = r26
            r19 = r6
            r61 = r37
            r6 = r18
            r20 = r7
            r62 = r38
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r12 = r45
            org.jetbrains.anko.sdk27.coroutines.C16061a.m96671b(r12, r14, r9, r10, r14)
            com.arlosoft.macrodroid.action.FloatingTextAction$n r7 = new com.arlosoft.macrodroid.action.FloatingTextAction$n
            r6 = 0
            r1 = r7
            r3 = r19
            r1.<init>(r2, r3, r4, r5, r6)
            r9 = r47
            org.jetbrains.anko.sdk27.coroutines.C16061a.m96671b(r9, r14, r7, r10, r14)
            com.arlosoft.macrodroid.action.FloatingTextAction$o r1 = new com.arlosoft.macrodroid.action.FloatingTextAction$o
            r7 = r19
            r1.<init>(r0, r7, r13, r14)
            r0 = r49
            org.jetbrains.anko.sdk27.coroutines.C16061a.m96671b(r0, r14, r1, r10, r14)
            java.lang.String r1 = r15.textToDisplay
            r14 = r18
            r14.setText(r1)
            java.lang.String r1 = r15.identifier
            r6 = r26
            r6.setText(r1)
            int r1 = r15.bgColor
            r15.bgColorDuringConfig = r1
            int r1 = r15.textColor
            r15.textColorDuringConfig = r1
            int r1 = r15.corners
            r15.cornersDuringConfig = r1
            java.lang.String r1 = r15.textToDisplay
            r5 = r55
            r15.m10778J3(r5, r1)
            com.arlosoft.macrodroid.action.FloatingTextAction$c r4 = new com.arlosoft.macrodroid.action.FloatingTextAction$c
            r1 = r4
            r2 = r13
            r3 = r0
            r10 = r4
            r4 = r6
            r5 = r9
            r18 = r8
            r8 = r6
            r6 = r14
            r1.<init>(r2, r3, r4, r5, r6)
            r8.addTextChangedListener(r10)
            com.arlosoft.macrodroid.action.FloatingTextAction$d r10 = new com.arlosoft.macrodroid.action.FloatingTextAction$d
            r6 = r16
            r16 = r0
            r0 = r10
            r1 = r66
            r2 = r55
            r3 = r13
            r4 = r16
            r5 = r8
            r12 = r6
            r6 = r9
            r19 = r12
            r12 = r7
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r14.addTextChangedListener(r10)
            boolean r0 = r16.isChecked()
            if (r0 != 0) goto L_0x0377
            android.text.Editable r0 = r8.getText()
            java.lang.String r1 = "identifierTextView.text"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0357
            r0 = 1
            goto L_0x0358
        L_0x0357:
            r0 = 0
        L_0x0358:
            if (r0 == 0) goto L_0x0375
            boolean r0 = r9.isChecked()
            if (r0 != 0) goto L_0x0377
            android.text.Editable r0 = r14.getText()
            java.lang.String r1 = "text.text"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0371
            r0 = 1
            goto L_0x0372
        L_0x0371:
            r0 = 0
        L_0x0372:
            if (r0 == 0) goto L_0x0375
            goto L_0x0377
        L_0x0375:
            r0 = 0
            goto L_0x0378
        L_0x0377:
            r0 = 1
        L_0x0378:
            r13.setEnabled(r0)
            boolean r0 = r16.isChecked()
            if (r0 == 0) goto L_0x0386
            r0 = 8
            r12.setVisibility(r0)
        L_0x0386:
            com.arlosoft.macrodroid.action.FloatingTextAction$p r0 = new com.arlosoft.macrodroid.action.FloatingTextAction$p
            r5 = r59
            r0.<init>(r5)
            r10 = r48
            r10.setOnSeekBarChangeListener(r0)
            com.arlosoft.macrodroid.action.FloatingTextAction$e r0 = new com.arlosoft.macrodroid.action.FloatingTextAction$e
            r5 = r60
            r0.<init>(r5)
            r12 = r46
            r12.setOnSeekBarChangeListener(r0)
            float r0 = r15.xPosition
            r1 = 100
            float r1 = (float) r1
            float r0 = r0 * r1
            int r0 = (int) r0
            r10.setProgress(r0)
            float r0 = r15.yPosition
            float r0 = r0 * r1
            int r0 = (int) r0
            r12.setProgress(r0)
            int r0 = r15.bgColor
            r6 = r51
            r6.setCardBackgroundColor((int) r0)
            int r0 = r15.textColor
            r7 = r53
            r7.setCardBackgroundColor((int) r0)
            int r0 = r15.textColor
            r5 = r55
            r5.setTextColor(r0)
            int r0 = r15.bgColor
            r5.setBackgroundColor(r0)
            int r0 = r15.textSize
            float r0 = (float) r0
            r1 = 2
            r5.setTextSize(r1, r0)
            int r0 = r15.textSize
            int r0 = r0 + -6
            r4 = r62
            r4.setProgress(r0)
            int r0 = r15.textSize
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1 = r61
            r1.setText(r0)
            com.arlosoft.macrodroid.action.FloatingTextAction$f r0 = new com.arlosoft.macrodroid.action.FloatingTextAction$f
            r0.<init>(r5, r1)
            r4.setOnSeekBarChangeListener(r0)
            int r0 = r15.padding
            r11.setProgress(r0)
            int r0 = r15.padding
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1 = r19
            r1.setText(r0)
            int r0 = r15.padding
            int r0 = com.arlosoft.macrodroid.extensions.C4657d.m18117b(r0)
            r5.setPadding(r0, r0, r0, r0)
            com.arlosoft.macrodroid.action.FloatingTextAction$g r0 = new com.arlosoft.macrodroid.action.FloatingTextAction$g
            r0.<init>(r5, r1)
            r11.setOnSeekBarChangeListener(r0)
            int r0 = r15.alpha
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1 = r44
            r1.setText(r0)
            int r0 = r15.alpha
            r3 = r43
            r3.setProgress(r0)
            int r0 = r15.alpha
            float r0 = (float) r0
            r2 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r2
            r5.setAlpha(r0)
            com.arlosoft.macrodroid.action.FloatingTextAction$h r0 = new com.arlosoft.macrodroid.action.FloatingTextAction$h
            r0.<init>(r5, r1)
            r3.setOnSeekBarChangeListener(r0)
            int r0 = r15.corners
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1 = r50
            r1.setText(r0)
            int r0 = r15.corners
            r2 = r56
            r2.setProgress(r0)
            int r0 = r15.corners
            int r3 = r15.bgColor
            r15.m10777I3(r5, r0, r3)
            com.arlosoft.macrodroid.action.FloatingTextAction$i r0 = new com.arlosoft.macrodroid.action.FloatingTextAction$i
            r0.<init>(r15, r5, r1)
            r2.setOnSeekBarChangeListener(r0)
            com.arlosoft.macrodroid.action.b6 r3 = new com.arlosoft.macrodroid.action.b6
            r0 = r3
            r1 = r66
            r2 = r40
            r19 = r13
            r16 = r43
            r13 = r3
            r3 = r6
            r21 = r4
            r4 = r7
            r22 = r5
            r0.<init>(r1, r2, r3, r4, r5)
            r4 = r52
            r4.setOnClickListener(r13)
            r6.setOnClickListener(r13)
            com.arlosoft.macrodroid.action.c6 r13 = new com.arlosoft.macrodroid.action.c6
            r0 = r13
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            com.arlosoft.macrodroid.action.g6 r0 = new com.arlosoft.macrodroid.action.g6
            r0.<init>(r8)
            com.arlosoft.macrodroid.action.d6 r1 = new com.arlosoft.macrodroid.action.d6
            r1.<init>(r15, r0)
            r5 = r57
            r5.setOnClickListener(r1)
            com.arlosoft.macrodroid.action.f6 r0 = new com.arlosoft.macrodroid.action.f6
            r0.<init>(r14)
            com.arlosoft.macrodroid.action.e6 r1 = new com.arlosoft.macrodroid.action.e6
            r1.<init>(r15, r0)
            r5 = r58
            r5.setOnClickListener(r1)
            r4 = r54
            r4.setOnClickListener(r13)
            r7.setOnClickListener(r13)
            com.arlosoft.macrodroid.action.a6 r13 = new com.arlosoft.macrodroid.action.a6
            r0 = r13
            r1 = r41
            r2 = r66
            r3 = r45
            r4 = r9
            r5 = r21
            r6 = r16
            r7 = r11
            r9 = r8
            r16 = r18
            r8 = r14
            r11 = r12
            r14 = r39
            r12 = r17
            r63 = r13
            r15 = r19
            r13 = r20
            r65 = r14
            r64 = r41
            r14 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r63
            r15.setOnClickListener(r0)
            com.arlosoft.macrodroid.action.z5 r0 = new com.arlosoft.macrodroid.action.z5
            r1 = r64
            r0.<init>(r1)
            r2 = r65
            r2.setOnClickListener(r0)
            r1.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.FloatingTextAction.m10795z3():void");
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.identifier, this.textToDisplay};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        C13706o.m87929f(strArr, "magicText");
        if (strArr.length == 2) {
            this.identifier = strArr[0];
            this.textToDisplay = strArr[1];
            return;
        }
        FirebaseCrashlytics a = FirebaseCrashlytics.m6487a();
        a.mo22936d(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ')'));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        int i = this.option;
        if (i == 0) {
            return this.identifier + ": " + this.textToDisplay;
        } else if (i == 1) {
            return SelectableItem.m15535j1(C17541R$string.action_floating_text_option_hide) + " (" + this.identifier + ')';
        } else if (i != 2) {
            return this.identifier;
        } else {
            String j1 = SelectableItem.m15535j1(C17541R$string.action_floating_text_option_hide_all);
            C13706o.m87928e(j1, "getString(R.string.actio…ing_text_option_hide_all)");
            return j1;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7714c1.f18682j.mo37747a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        TriggerContextInfo triggerContextInfo2 = triggerContextInfo;
        int i = this.option;
        if (i == 2) {
            C4373a.m17336h().mo28647p();
        } else if (i == 1) {
            C4373a.m17336h().mo28648q(C4023j0.m15760t0(mo27827K0(), this.identifier, triggerContextInfo2, mo27837X0()));
        } else if (i == 0) {
            String t0 = C4023j0.m15760t0(mo27827K0(), this.identifier, triggerContextInfo2, mo27837X0());
            if (triggerContextInfo2 != null) {
                triggerContextInfo.mo31549a();
            }
            C4373a h = C4373a.m17336h();
            String str = this.textToDisplay;
            float f = this.xPosition;
            float f2 = this.yPosition;
            int i2 = this.textColor;
            int i3 = this.bgColor;
            int i4 = this.padding;
            int i5 = this.textSize;
            int i6 = this.corners;
            int i7 = this.alignment;
            int i8 = this.alpha;
            boolean z = this.updateLocation;
            Long Y0 = mo27840Y0();
            C13706o.m87928e(Y0, "macroGuid");
            h.mo28637c(t0, str, f, f2, i2, i3, i4, i5, i6, i7, i8, true, z, Y0.longValue(), triggerContextInfo);
        }
        FloatingTextService.C6099a aVar = FloatingTextService.f14458E;
        Context K0 = mo27827K0();
        C13706o.m87928e(K0, "context");
        aVar.mo32048a(K0);
    }

    /* renamed from: h2 */
    public boolean mo24893h2() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        m10795z3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.option);
        parcel.writeInt(this.bgColor);
        parcel.writeInt(this.textColor);
        parcel.writeInt(this.alpha);
        parcel.writeInt(this.updateLocation ? 1 : 0);
        parcel.writeFloat(this.xPosition);
        parcel.writeFloat(this.yPosition);
        parcel.writeInt(this.padding);
        parcel.writeString(this.identifier);
        parcel.writeString(this.textToDisplay);
        parcel.writeInt(this.isInitialised ? 1 : 0);
        parcel.writeInt(this.textSize);
        parcel.writeInt(this.corners);
        parcel.writeInt(this.alignment);
    }

    public FloatingTextAction() {
        this.identifier = "";
        this.textToDisplay = "";
        this.bgColor = ViewCompat.MEASURED_STATE_MASK;
        this.textColor = -1;
        this.alpha = 100;
        this.corners = 12;
        this.xPosition = 0.5f;
        this.yPosition = 0.5f;
        this.padding = 8;
        this.textSize = 14;
    }

    private FloatingTextAction(Parcel parcel) {
        super(parcel);
        String str = "";
        this.identifier = str;
        this.textToDisplay = str;
        this.bgColor = ViewCompat.MEASURED_STATE_MASK;
        this.textColor = -1;
        this.alpha = 100;
        this.corners = 12;
        this.xPosition = 0.5f;
        this.yPosition = 0.5f;
        this.padding = 8;
        this.textSize = 14;
        this.option = parcel.readInt();
        this.bgColor = parcel.readInt();
        this.textColor = parcel.readInt();
        this.alpha = parcel.readInt();
        boolean z = true;
        this.updateLocation = parcel.readInt() != 0;
        this.xPosition = parcel.readFloat();
        this.yPosition = parcel.readFloat();
        this.padding = parcel.readInt();
        String readString = parcel.readString();
        this.identifier = readString == null ? str : readString;
        String readString2 = parcel.readString();
        this.textToDisplay = readString2 != null ? readString2 : str;
        this.isInitialised = parcel.readInt() == 0 ? false : z;
        this.textSize = parcel.readInt();
        this.corners = parcel.readInt();
        this.alignment = parcel.readInt();
    }
}
