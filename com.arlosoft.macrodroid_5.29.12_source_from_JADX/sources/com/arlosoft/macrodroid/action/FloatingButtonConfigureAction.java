package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
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
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17525R$array;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.database.C4373a;
import com.arlosoft.macrodroid.events.FloatingButtonsUpdateEvent;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.FloatingButtonTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectActivity;
import com.arlosoft.macrodroid.utils.C6362a0;
import com.google.android.material.textfield.TextInputLayout;
import com.melnykov.fab.FloatingActionButton;
import com.thebluealliance.spectrum.C11766a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import p128m0.C7703b1;
import p161s1.C10180a;
import p319lc.C15626c;

/* compiled from: FloatingButtonConfigureAction.kt */
public final class FloatingButtonConfigureAction extends Action {
    public static final Parcelable.Creator<FloatingButtonConfigureAction> CREATOR = new C2440a();
    private static final int ENABLE_OPTION_DISABLE = 2;
    private static final int ENABLE_OPTION_DONT_CHANGE = 0;
    private static final int ENABLE_OPTION_ENABLE = 1;
    private static final int REQUEST_CODE_ICON_SELECT = 249232;

    /* renamed from: d */
    public static final C2441b f7253d = new C2441b((C13695i) null);
    private int alpha;
    private int enableOption;
    private transient WeakReference<FloatingActionButton> fabRef;
    private int iconBgColor;
    private String identifier;
    private String imagePackageName;
    private int imageResourceId;
    private String imageResourceName;
    private String imageUri;
    private boolean isInitialised;
    private long macroGuid;
    private String macroName;
    private transient boolean normalSizeSelected;
    private int padding;
    private transient WeakReference<SeekBar> paddingSeekBarRef;
    private int size;
    private boolean transparentBackground;
    private long triggerGuid;
    private boolean updateLocation;
    private int xLocation;
    private int yLocation;

    /* renamed from: com.arlosoft.macrodroid.action.FloatingButtonConfigureAction$a */
    /* compiled from: FloatingButtonConfigureAction.kt */
    public static final class C2440a implements Parcelable.Creator<FloatingButtonConfigureAction> {
        C2440a() {
        }

        /* renamed from: a */
        public FloatingButtonConfigureAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new FloatingButtonConfigureAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public FloatingButtonConfigureAction[] newArray(int i) {
            return new FloatingButtonConfigureAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.FloatingButtonConfigureAction$b */
    /* compiled from: FloatingButtonConfigureAction.kt */
    public static final class C2441b {
        private C2441b() {
        }

        public /* synthetic */ C2441b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.FloatingButtonConfigureAction$c */
    /* compiled from: FloatingButtonConfigureAction.kt */
    public static final class C2442c implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ FloatingButtonConfigureAction f7254a;

        /* renamed from: b */
        final /* synthetic */ FloatingActionButton f7255b;

        /* renamed from: c */
        final /* synthetic */ SeekBar f7256c;

        C2442c(FloatingButtonConfigureAction floatingButtonConfigureAction, FloatingActionButton floatingActionButton, SeekBar seekBar) {
            this.f7254a = floatingButtonConfigureAction;
            this.f7255b = floatingActionButton;
            this.f7256c = seekBar;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C13706o.m87929f(seekBar, "seekBar");
            this.f7254a.m10734I3(this.f7255b, this.f7256c.getProgress());
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            C13706o.m87929f(seekBar, "seekBar");
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            C13706o.m87929f(seekBar, "seekBar");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.FloatingButtonConfigureAction$d */
    /* compiled from: FloatingButtonConfigureAction.kt */
    public static final class C2443d implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ TextView f7257a;

        /* renamed from: b */
        final /* synthetic */ FloatingActionButton f7258b;

        C2443d(TextView textView, FloatingActionButton floatingActionButton) {
            this.f7257a = textView;
            this.f7258b = floatingActionButton;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C13706o.m87929f(seekBar, "seekBar");
            if (z) {
                TextView textView = this.f7257a;
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append('%');
                textView.setText(sb.toString());
                this.f7258b.setAlpha(((float) i) / 100.0f);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            C13706o.m87929f(seekBar, "seekBar");
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            C13706o.m87929f(seekBar, "seekBar");
        }
    }

    public FloatingButtonConfigureAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ FloatingButtonConfigureAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public static final void m10726A3(FloatingActionButton floatingActionButton, FloatingButtonConfigureAction floatingButtonConfigureAction, SeekBar seekBar, CompoundButton compoundButton, boolean z) {
        C13706o.m87929f(floatingActionButton, "$fab");
        C13706o.m87929f(floatingButtonConfigureAction, "this$0");
        C13706o.m87929f(seekBar, "$iconPaddingSeekBar");
        floatingActionButton.setPadding(0, 0, 0, 0);
        floatingActionButton.setType(z ? 1 : 0);
        int H3 = (int) floatingButtonConfigureAction.m10733H3((float) seekBar.getProgress());
        floatingActionButton.setPadding(H3, H3, H3, H3);
        floatingButtonConfigureAction.normalSizeSelected = !z;
        floatingButtonConfigureAction.m10734I3(floatingActionButton, seekBar.getProgress());
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public static final void m10727B3(Activity activity, View view) {
        Intent intent = new Intent(activity, IconSelectActivity.class);
        intent.putExtra("DisplayAppIcons", true);
        activity.startActivityForResult(intent, REQUEST_CODE_ICON_SELECT);
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public static final void m10728C3(AppCompatDialog appCompatDialog, FloatingButtonConfigureAction floatingButtonConfigureAction, SeekBar seekBar, SeekBar seekBar2, RadioButton radioButton, CheckBox checkBox, CheckBox checkBox2, EditText editText, EditText editText2, Spinner spinner, View view) {
        int i;
        int i2;
        C13706o.m87929f(appCompatDialog, "$dialog");
        C13706o.m87929f(floatingButtonConfigureAction, "this$0");
        C13706o.m87929f(seekBar, "$alphaSeekBar");
        C13706o.m87929f(seekBar2, "$iconPaddingSeekBar");
        C13706o.m87929f(radioButton, "$normalSize");
        C13706o.m87929f(checkBox, "$transparentBgCheckbox");
        C13706o.m87929f(checkBox2, "$forceLocationCb");
        C13706o.m87929f(editText, "$xLocationBox");
        C13706o.m87929f(editText2, "$yLocationBox");
        C13706o.m87929f(spinner, "$enableOptionsSpinner");
        appCompatDialog.dismiss();
        floatingButtonConfigureAction.alpha = seekBar.getProgress();
        floatingButtonConfigureAction.padding = seekBar2.getProgress();
        floatingButtonConfigureAction.size = radioButton.isChecked() ^ true ? 1 : 0;
        floatingButtonConfigureAction.transparentBackground = checkBox.isChecked();
        floatingButtonConfigureAction.updateLocation = checkBox2.isChecked();
        try {
            if (TextUtils.isEmpty(editText.getText().toString())) {
                i2 = 0;
            } else {
                Integer valueOf = Integer.valueOf(editText.getText().toString());
                C13706o.m87928e(valueOf, "valueOf(xLocationBox.text.toString())");
                i2 = valueOf.intValue();
            }
            floatingButtonConfigureAction.xLocation = i2;
        } catch (Exception unused) {
            floatingButtonConfigureAction.xLocation = 0;
        }
        try {
            if (TextUtils.isEmpty(editText2.getText().toString())) {
                i = 0;
            } else {
                Integer valueOf2 = Integer.valueOf(editText2.getText().toString());
                C13706o.m87928e(valueOf2, "valueOf(yLocationBox.text.toString())");
                i = valueOf2.intValue();
            }
            floatingButtonConfigureAction.yLocation = i;
        } catch (Exception unused2) {
            floatingButtonConfigureAction.yLocation = 0;
        }
        floatingButtonConfigureAction.enableOption = spinner.getSelectedItemPosition();
        floatingButtonConfigureAction.isInitialised = true;
        floatingButtonConfigureAction.mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public static final void m10729D3(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b6  */
    /* renamed from: E3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<com.arlosoft.macrodroid.macro.Macro> m10730E3() {
        /*
            r10 = this;
            com.arlosoft.macrodroid.macro.n r0 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
            r1 = 0
            java.util.List r0 = r0.mo29672B(r1)
            java.lang.String r2 = "getInstance().getAllCompletedMacrosSorted(false)"
            kotlin.jvm.internal.C13706o.m87928e(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0017:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00be
            java.lang.Object r3 = r0.next()
            r4 = r3
            com.arlosoft.macrodroid.macro.Macro r4 = (com.arlosoft.macrodroid.macro.Macro) r4
            java.util.ArrayList r5 = r4.getTriggerList()
            java.lang.String r6 = "macro.triggerList"
            kotlin.jvm.internal.C13706o.m87928e(r5, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0036:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0048
            java.lang.Object r7 = r5.next()
            boolean r8 = r7 instanceof com.arlosoft.macrodroid.triggers.FloatingButtonTrigger
            if (r8 == 0) goto L_0x0036
            r6.add(r7)
            goto L_0x0036
        L_0x0048:
            boolean r5 = r6.isEmpty()
            r6 = 1
            r5 = r5 ^ r6
            if (r5 != 0) goto L_0x00b7
            java.util.ArrayList r4 = r4.getActions()
            java.lang.String r5 = "macro.actions"
            kotlin.jvm.internal.C13706o.m87928e(r4, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0062:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0074
            java.lang.Object r7 = r4.next()
            boolean r8 = r7 instanceof com.arlosoft.macrodroid.action.WaitUntilTriggerAction
            if (r8 == 0) goto L_0x0062
            r5.add(r7)
            goto L_0x0062
        L_0x0074:
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L_0x007c
        L_0x007a:
            r4 = 0
            goto L_0x00b3
        L_0x007c:
            java.util.Iterator r4 = r5.iterator()
        L_0x0080:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x007a
            java.lang.Object r5 = r4.next()
            com.arlosoft.macrodroid.action.WaitUntilTriggerAction r5 = (com.arlosoft.macrodroid.action.WaitUntilTriggerAction) r5
            java.util.ArrayList r5 = r5.mo26117B3()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0099:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x00ab
            java.lang.Object r8 = r5.next()
            boolean r9 = r8 instanceof com.arlosoft.macrodroid.triggers.FloatingButtonTrigger
            if (r9 == 0) goto L_0x0099
            r7.add(r8)
            goto L_0x0099
        L_0x00ab:
            boolean r5 = r7.isEmpty()
            r5 = r5 ^ r6
            if (r5 == 0) goto L_0x0080
            r4 = 1
        L_0x00b3:
            if (r4 == 0) goto L_0x00b6
            goto L_0x00b7
        L_0x00b6:
            r6 = 0
        L_0x00b7:
            if (r6 == 0) goto L_0x0017
            r2.add(r3)
            goto L_0x0017
        L_0x00be:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.FloatingButtonConfigureAction.m10730E3():java.util.List");
    }

    /* renamed from: F3 */
    private final int m10731F3() {
        return this.normalSizeSelected ? 20 : 16;
    }

    /* renamed from: G3 */
    private final String m10732G3(FloatingButtonTrigger floatingButtonTrigger, int i) {
        String u3 = floatingButtonTrigger.mo31151u3();
        if (!(u3 == null || u3.length() == 0)) {
            return String.valueOf(floatingButtonTrigger.mo31151u3());
        }
        try {
            C13696i0 i0Var = C13696i0.f61931a;
            String j1 = SelectableItem.m15535j1(C17541R$string.floating_button_number_id);
            C13706o.m87928e(j1, "getString(R.string.floating_button_number_id)");
            String format = String.format(j1, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            C13706o.m87928e(format, "format(format, *args)");
            return format;
        } catch (Exception unused) {
            return floatingButtonTrigger.mo27837X0().getName() + ' ' + (i + 1);
        }
    }

    /* renamed from: H3 */
    private final float m10733H3(float f) {
        return f * mo27827K0().getResources().getDisplayMetrics().density;
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public final void m10734I3(FloatingActionButton floatingActionButton, int i) {
        int H3 = (int) m10733H3((float) (i - 8));
        floatingActionButton.setPadding(H3, H3, H3, H3);
        String str = this.imageUri;
        if (str != null) {
            floatingActionButton.setImageURI(Uri.parse(str));
            return;
        }
        String str2 = this.imagePackageName;
        if (str2 == null) {
            int V = this.imageResourceName != null ? C4061t1.m15976V(mo27827K0(), this.imageResourceName) : -1;
            if (V != -1) {
                floatingActionButton.setImageResource(V);
                return;
            }
            int i2 = this.imageResourceId;
            if (i2 == 0) {
                floatingActionButton.setImageResource(C17530R$drawable.not_icon_setup);
            } else {
                floatingActionButton.setImageResource(i2);
            }
        } else if (C13706o.m87924a(str2, "UserIcon")) {
            Bitmap f = C6362a0.m24600f(this.imageResourceName);
            if (f != null) {
                floatingActionButton.setImageBitmap(f);
            } else {
                floatingActionButton.setImageResource(C17530R$drawable.launcher_no_border);
            }
        } else {
            Drawable I = C4061t1.m15960I(mo27827K0(), this.imagePackageName, this.imageResourceName);
            if (I == null) {
                I = C4061t1.m15958H(mo27827K0(), this.imagePackageName, this.imageResourceId);
            }
            if (I != null) {
                floatingActionButton.setImageDrawable(I);
            } else {
                floatingActionButton.setImageResource(C17530R$drawable.not_icon_setup);
            }
        }
    }

    /* renamed from: J3 */
    private final void m10735J3(FloatingButtonTrigger floatingButtonTrigger, int i, int i2) {
        int i3;
        Object systemService = mo27827K0().getSystemService("window");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        WindowManager windowManager = (WindowManager) systemService;
        int width = windowManager.getDefaultDisplay().getWidth();
        int height = windowManager.getDefaultDisplay().getHeight();
        if (this.size == 0) {
            i3 = mo27827K0().getResources().getDimensionPixelSize(C17529R$dimen.floating_button_size);
        } else {
            i3 = mo27827K0().getResources().getDimensionPixelSize(C17529R$dimen.floating_button_size_mini);
        }
        int i4 = width / 2;
        int i5 = i3 / 2;
        int i6 = (i - i4) + i5;
        int i7 = height / 2;
        int i8 = (i2 - i7) + i5;
        int i9 = ((-width) / 2) + i5;
        if (i6 < i9) {
            i6 = i9;
        } else {
            int i10 = i4 - i5;
            if (i6 > i10) {
                i6 = i10;
            }
        }
        int i11 = ((-height) / 2) + i5;
        if (i8 < i11) {
            i8 = i11;
        } else {
            int i12 = i7 - i5;
            if (i8 > i12) {
                i8 = i12;
            }
        }
        if (width < height) {
            C4373a.m17336h().mo28655z(floatingButtonTrigger.mo27847f1(), i6, i8);
        } else {
            C4373a.m17336h().mo28654y(floatingButtonTrigger.mo27847f1(), i6, i8);
        }
    }

    /* renamed from: K3 */
    private final void m10736K3(List<? extends FloatingButtonTrigger> list) {
        ArrayList arrayList = new ArrayList(C13616u.m87774u(list, 10));
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i < 0) {
                C13614t.m87758t();
            }
            arrayList.add(m10732G3((FloatingButtonTrigger) next, i));
            i = i2;
        }
        Object[] array = arrayList.toArray(new String[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        int b = C16792h.m99540b(C13596m.m87586K(strArr, this.identifier), 0);
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.select_trigger);
        builder.setSingleChoiceItems((CharSequence[]) strArr, b, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C3360q5(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3388r5(this, list));
        AlertDialog create = builder.create();
        C13706o.m87928e(create, "builder.create()");
        create.show();
        create.setOnCancelListener(new C3302o5(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: L3 */
    public static final void m10737L3(FloatingButtonConfigureAction floatingButtonConfigureAction, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(floatingButtonConfigureAction, "this$0");
        floatingButtonConfigureAction.mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public static final void m10738M3(FloatingButtonConfigureAction floatingButtonConfigureAction, List list, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(floatingButtonConfigureAction, "this$0");
        C13706o.m87929f(list, "$fbTriggers");
        C13706o.m87927d(dialogInterface, "null cannot be cast to non-null type androidx.appcompat.app.AlertDialog");
        int checkedItemPosition = ((AlertDialog) dialogInterface).getListView().getCheckedItemPosition();
        floatingButtonConfigureAction.triggerGuid = ((FloatingButtonTrigger) list.get(checkedItemPosition)).mo27847f1();
        floatingButtonConfigureAction.identifier = floatingButtonConfigureAction.m10732G3((FloatingButtonTrigger) list.get(checkedItemPosition), checkedItemPosition);
        floatingButtonConfigureAction.m10752v3((FloatingButtonTrigger) list.get(checkedItemPosition));
    }

    /* access modifiers changed from: private */
    /* renamed from: N3 */
    public static final void m10739N3(FloatingButtonConfigureAction floatingButtonConfigureAction, DialogInterface dialogInterface) {
        C13706o.m87929f(floatingButtonConfigureAction, "this$0");
        floatingButtonConfigureAction.mo24706w1();
    }

    /* renamed from: v3 */
    private final void m10752v3(FloatingButtonTrigger floatingButtonTrigger) {
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_floating_button);
        appCompatDialog.setTitle((CharSequence) mo25559a1());
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = appCompatDialog.getWindow();
        C13706o.m87926c(window);
        layoutParams.copyFrom(window.getAttributes());
        layoutParams.width = -1;
        Window window2 = appCompatDialog.getWindow();
        C13706o.m87926c(window2);
        window2.setAttributes(layoutParams);
        View findViewById = appCompatDialog.findViewById(C17532R$id.okButton);
        C13706o.m87926c(findViewById);
        View findViewById2 = appCompatDialog.findViewById(C17532R$id.cancelButton);
        C13706o.m87926c(findViewById2);
        View findViewById3 = appCompatDialog.findViewById(C17532R$id.floating_button_change_background);
        C13706o.m87926c(findViewById3);
        Button button = (Button) findViewById3;
        View findViewById4 = appCompatDialog.findViewById(C17532R$id.floating_button_change_icon);
        C13706o.m87926c(findViewById4);
        View findViewById5 = appCompatDialog.findViewById(C17532R$id.floating_button_alpha_seekbar);
        C13706o.m87926c(findViewById5);
        View findViewById6 = appCompatDialog.findViewById(C17532R$id.padding_seekbar);
        C13706o.m87926c(findViewById6);
        SeekBar seekBar = (SeekBar) findViewById6;
        View findViewById7 = appCompatDialog.findViewById(C17532R$id.alpha_percent_text);
        C13706o.m87926c(findViewById7);
        View findViewById8 = appCompatDialog.findViewById(C17532R$id.normal_size);
        C13706o.m87926c(findViewById8);
        RadioButton radioButton = (RadioButton) findViewById8;
        View findViewById9 = appCompatDialog.findViewById(C17532R$id.mini_size);
        C13706o.m87926c(findViewById9);
        RadioButton radioButton2 = (RadioButton) findViewById9;
        View findViewById10 = appCompatDialog.findViewById(C17532R$id.show_on_lock_screen);
        C13706o.m87926c(findViewById10);
        View findViewById11 = appCompatDialog.findViewById(C17532R$id.floating_button_image);
        C13706o.m87926c(findViewById11);
        View findViewById12 = appCompatDialog.findViewById(C17532R$id.fab);
        C13706o.m87926c(findViewById12);
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById12;
        View findViewById13 = appCompatDialog.findViewById(C17532R$id.transparent_background_checkbox);
        C13706o.m87926c(findViewById13);
        CheckBox checkBox = (CheckBox) findViewById13;
        Button button2 = (Button) findViewById2;
        View findViewById14 = appCompatDialog.findViewById(C17532R$id.force_location_on_enable);
        C13706o.m87926c(findViewById14);
        CheckBox checkBox2 = (CheckBox) findViewById14;
        Button button3 = (Button) findViewById;
        View findViewById15 = appCompatDialog.findViewById(C17532R$id.x_location);
        C13706o.m87926c(findViewById15);
        EditText editText = (EditText) findViewById15;
        Button button4 = (Button) findViewById4;
        View findViewById16 = appCompatDialog.findViewById(C17532R$id.y_location);
        C13706o.m87926c(findViewById16);
        EditText editText2 = (EditText) findViewById16;
        CheckBox checkBox3 = (CheckBox) findViewById10;
        View findViewById17 = appCompatDialog.findViewById(C17532R$id.editable_identifier);
        C13706o.m87926c(findViewById17);
        ImageView imageView = (ImageView) findViewById11;
        View findViewById18 = appCompatDialog.findViewById(C17532R$id.static_identifier);
        C13706o.m87926c(findViewById18);
        TextView textView = (TextView) findViewById18;
        TextView textView2 = (TextView) findViewById7;
        View findViewById19 = appCompatDialog.findViewById(C17532R$id.enabled_state_options);
        C13706o.m87926c(findViewById19);
        Spinner spinner = (Spinner) findViewById19;
        SeekBar seekBar2 = (SeekBar) findViewById5;
        spinner.setVisibility(0);
        spinner.setSelection(this.enableOption);
        ((TextInputLayout) findViewById17).setVisibility(8);
        textView.setVisibility(0);
        textView.setText(SelectableItem.m15535j1(C17541R$string.web_url_identifier) + ": " + this.identifier);
        Spinner spinner2 = (Spinner) appCompatDialog.findViewById(C17532R$id.disable_options_spinner);
        if (spinner2 != null) {
            spinner2.setVisibility(8);
        }
        checkBox2.setOnCheckedChangeListener(new C3562w5(editText, editText2));
        checkBox2.setText(C17541R$string.floating_button_update_location_option);
        editText.setEnabled(this.updateLocation);
        editText2.setEnabled(this.updateLocation);
        editText.setText(String.valueOf(this.xLocation));
        editText2.setText(String.valueOf(this.yLocation));
        checkBox2.setChecked(this.updateLocation);
        this.fabRef = new WeakReference<>(floatingActionButton);
        this.paddingSeekBarRef = new WeakReference<>(seekBar);
        int i = this.size;
        this.normalSizeSelected = i == 0;
        if (i == 0) {
            radioButton.setChecked(true);
            floatingActionButton.setType(0);
        } else {
            radioButton2.setChecked(true);
            floatingActionButton.setType(1);
        }
        checkBox.setChecked(this.transparentBackground);
        checkBox.setOnCheckedChangeListener(new C3589x5(floatingActionButton, this));
        button.setOnClickListener(new C3534v5(this, j0, floatingActionButton));
        seekBar.setMax(28);
        seekBar.setProgress(this.padding);
        seekBar.setOnSeekBarChangeListener(new C2442c(this, floatingActionButton, seekBar));
        SeekBar seekBar3 = seekBar2;
        seekBar3.setProgress(this.alpha);
        StringBuilder sb = new StringBuilder();
        sb.append(this.alpha);
        sb.append('%');
        TextView textView3 = textView2;
        textView3.setText(sb.toString());
        imageView.setAlpha(((float) this.alpha) / 100.0f);
        checkBox3.setVisibility(8);
        seekBar3.setOnSeekBarChangeListener(new C2443d(textView3, floatingActionButton));
        radioButton2.setOnCheckedChangeListener(new C3616y5(floatingActionButton, this, seekBar));
        floatingActionButton.setColorNormal(this.transparentBackground ? 0 : this.iconBgColor);
        button4.setOnClickListener(new C3417s5(j0));
        if (!this.isInitialised) {
            checkBox.setChecked(floatingButtonTrigger.mo31139D3());
            radioButton2.setChecked(floatingButtonTrigger.mo31138C3() == 1);
            seekBar.setProgress(floatingButtonTrigger.mo31136A3());
            seekBar3.setProgress(floatingButtonTrigger.mo31148q3());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(floatingButtonTrigger.mo31148q3());
            sb2.append('%');
            textView3.setText(sb2.toString());
            if (floatingButtonTrigger.mo31138C3() == 0) {
                radioButton.setChecked(true);
                floatingActionButton.setType(0);
            } else {
                radioButton2.setChecked(true);
                floatingActionButton.setType(1);
            }
            this.iconBgColor = floatingButtonTrigger.mo31149r3();
            floatingActionButton.setColorNormal(floatingButtonTrigger.mo31139D3() ? 0 : floatingButtonTrigger.mo31149r3());
            m10734I3(floatingActionButton, floatingButtonTrigger.mo31136A3());
            this.imageUri = floatingButtonTrigger.mo31155y3();
            this.imagePackageName = floatingButtonTrigger.mo31152v3();
            this.imageResourceName = floatingButtonTrigger.mo31154x3();
            this.imageResourceId = floatingButtonTrigger.mo31153w3();
        }
        m10734I3(floatingActionButton, this.padding);
        EditText editText3 = editText;
        C3507u5 u5Var = r0;
        C3507u5 u5Var2 = new C3507u5(appCompatDialog, this, seekBar3, seekBar, radioButton, checkBox, checkBox2, editText3, editText2, spinner);
        button3.setOnClickListener(u5Var);
        button2.setOnClickListener(new C3471t5(appCompatDialog));
        appCompatDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public static final void m10753w3(EditText editText, EditText editText2, CompoundButton compoundButton, boolean z) {
        C13706o.m87929f(editText, "$xLocationBox");
        C13706o.m87929f(editText2, "$yLocationBox");
        editText.setEnabled(z);
        editText2.setEnabled(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public static final void m10754x3(FloatingActionButton floatingActionButton, FloatingButtonConfigureAction floatingButtonConfigureAction, CompoundButton compoundButton, boolean z) {
        C13706o.m87929f(floatingActionButton, "$fab");
        C13706o.m87929f(floatingButtonConfigureAction, "this$0");
        floatingActionButton.setColorNormal(z ? 0 : floatingButtonConfigureAction.iconBgColor);
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public static final void m10755y3(FloatingButtonConfigureAction floatingButtonConfigureAction, Activity activity, FloatingActionButton floatingActionButton, View view) {
        C13706o.m87929f(floatingButtonConfigureAction, "this$0");
        C13706o.m87929f(floatingActionButton, "$fab");
        C11766a a = new C11766a.C11769c(floatingButtonConfigureAction.mo27827K0()).mo66987g(C17541R$string.select_color).mo66982b(C17525R$array.notification_colors).mo66986f(floatingButtonConfigureAction.iconBgColor).mo66983c(true).mo66985e(1).mo66984d(new C3332p5(floatingButtonConfigureAction, floatingActionButton)).mo66981a();
        C13706o.m87927d(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        a.show(((AppCompatActivity) activity).getSupportFragmentManager(), "");
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public static final void m10756z3(FloatingButtonConfigureAction floatingButtonConfigureAction, FloatingActionButton floatingActionButton, boolean z, int i) {
        C13706o.m87929f(floatingButtonConfigureAction, "this$0");
        C13706o.m87929f(floatingActionButton, "$fab");
        if (z) {
            floatingButtonConfigureAction.iconBgColor = i;
            floatingActionButton.setColorNormal(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        int i;
        if (this.macroGuid == 0) {
            return 0;
        }
        List<Macro> E3 = m10730E3();
        Iterator<Macro> it = E3.iterator();
        int i2 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (it.next().getGUID() == this.macroGuid) {
                break;
            }
            i2++;
        }
        int b = C16792h.m99540b(i2, 0);
        if (b == 0) {
            Iterator<Macro> it2 = E3.iterator();
            int i3 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (C13706o.m87924a(it2.next().getName(), this.macroName)) {
                    i = i3;
                    break;
                } else {
                    i3++;
                }
            }
            b = C16792h.m99540b(i, 0);
        }
        if (b == 0) {
            String name = E3.get(0).getName();
            C13706o.m87928e(name, "allMacrosWithFbTrigger[0].name");
            this.macroName = name;
            this.macroGuid = E3.get(0).getGUID();
        }
        return b;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.identifier;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7703b1.f18659j.mo37743a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        Macro S = C4934n.m18998M().mo29684S(this.macroName);
        if (S != null) {
            Trigger trigger = null;
            String str = this.identifier;
            if (!(str == null || str.length() == 0)) {
                Iterator<Trigger> it = S.getTriggerList().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Trigger next = it.next();
                    if ((next instanceof FloatingButtonTrigger) && C13706o.m87924a(((FloatingButtonTrigger) next).mo31151u3(), this.identifier)) {
                        trigger = next;
                        break;
                    }
                }
            }
            if (trigger == null) {
                Iterator<Action> it2 = S.getActions().iterator();
                while (it2.hasNext()) {
                    Action next2 = it2.next();
                    if (next2 instanceof WaitUntilTriggerAction) {
                        Iterator<Trigger> it3 = ((WaitUntilTriggerAction) next2).mo26117B3().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            Trigger next3 = it3.next();
                            if ((next3 instanceof FloatingButtonTrigger) && C13706o.m87924a(((FloatingButtonTrigger) next3).mo31151u3(), this.identifier)) {
                                trigger = next3;
                                break;
                            }
                        }
                    }
                }
            }
            if (trigger == null) {
                trigger = S.findChildByGUID(this.triggerGuid);
            }
            if (trigger != null) {
                FloatingButtonTrigger floatingButtonTrigger = (FloatingButtonTrigger) trigger;
                floatingButtonTrigger.mo31146U3(this.transparentBackground);
                floatingButtonTrigger.mo31141O3(this.iconBgColor);
                floatingButtonTrigger.mo31145T3(this.size);
                floatingButtonTrigger.mo31140N3(this.alpha);
                floatingButtonTrigger.mo31142P3(this.imagePackageName, this.imageResourceName, this.imageResourceId, this.imageUri);
                floatingButtonTrigger.mo31144S3(this.padding);
                if (this.updateLocation) {
                    m10735J3(floatingButtonTrigger, this.xLocation, this.yLocation);
                    floatingButtonTrigger.mo31147V3(this.xLocation, this.yLocation);
                }
                int i = this.enableOption;
                if (i == 1) {
                    floatingButtonTrigger.mo27818D2(true);
                    floatingButtonTrigger.mo31544V2();
                } else if (i == 2) {
                    floatingButtonTrigger.mo27818D2(false);
                    floatingButtonTrigger.mo31543T2();
                }
                C4934n.m18998M().mo29688f0(S);
                C10180a.m40075a().mo80018i(new FloatingButtonsUpdateEvent());
                return;
            }
            C4878b.m18868g("Could not find floating button in macro: " + this.macroName);
            return;
        }
        C4878b.m18868g("Could not find macro: " + this.macroName);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        List<Macro> E3 = m10730E3();
        ArrayList arrayList = new ArrayList(C13616u.m87774u(E3, 10));
        for (Macro name : E3) {
            arrayList.add(name.getName());
        }
        Object[] array = arrayList.toArray(new String[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        if (!(strArr.length == 0)) {
            return strArr;
        }
        C15626c.makeText(mo27827K0(), C17541R$string.no_triggers, 0).show();
        return new String[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        String string = mo27827K0().getString(C17541R$string.select_macro);
        C13706o.m87928e(string, "context.getString(R.string.select_macro)");
        return string;
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        WeakReference<FloatingActionButton> weakReference;
        C13706o.m87929f(activity, "activity");
        mo27877y2(activity);
        if (i == REQUEST_CODE_ICON_SELECT && i2 != 0 && (weakReference = this.fabRef) != null && intent != null) {
            SeekBar seekBar = null;
            FloatingActionButton floatingActionButton = weakReference != null ? (FloatingActionButton) weakReference.get() : null;
            WeakReference<SeekBar> weakReference2 = this.paddingSeekBarRef;
            if (weakReference2 != null) {
                seekBar = (SeekBar) weakReference2.get();
            }
            if (floatingActionButton != null && seekBar != null) {
                this.imageResourceId = intent.getIntExtra("drawableId", 0);
                this.imageResourceName = intent.getStringExtra("drawableName");
                this.imagePackageName = intent.getStringExtra("drawablePackageName");
                Uri data = intent.getData();
                if (data != null) {
                    this.imageUri = data.toString();
                }
                this.padding = m10731F3();
                seekBar.setProgress(m10731F3());
                m10734I3(floatingActionButton, this.padding);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        if (!m10730E3().isEmpty()) {
            mo27848g0();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        String str = this.macroName;
        if ((str == null || str.length() == 0) || this.macroGuid == 0) {
            List<Macro> E3 = m10730E3();
            String name = E3.get(0).getName();
            C13706o.m87928e(name, "allMacros[0].name");
            this.macroName = name;
            this.macroGuid = E3.get(0).getGUID();
        }
        Macro S = C4934n.m18998M().mo29684S(this.macroName);
        if (S != null) {
            ArrayList<Trigger> triggerList = S.getTriggerList();
            C13706o.m87928e(triggerList, "macro.triggerList");
            ArrayList arrayList = new ArrayList();
            for (T next : triggerList) {
                if (next instanceof FloatingButtonTrigger) {
                    arrayList.add(next);
                }
            }
            ArrayList<Action> actions = S.getActions();
            C13706o.m87928e(actions, "macro.actions");
            ArrayList<WaitUntilTriggerAction> arrayList2 = new ArrayList<>();
            for (T next2 : actions) {
                if (next2 instanceof WaitUntilTriggerAction) {
                    arrayList2.add(next2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (WaitUntilTriggerAction B3 : arrayList2) {
                ArrayList<Trigger> B32 = B3.mo26117B3();
                ArrayList arrayList4 = new ArrayList();
                for (T next3 : B32) {
                    if (next3 instanceof FloatingButtonTrigger) {
                        arrayList4.add(next3);
                    }
                }
                boolean unused = C13624y.m87797z(arrayList3, arrayList4);
            }
            List q0 = C13566b0.m87442q0(arrayList, arrayList3);
            if (q0.size() == 1) {
                this.triggerGuid = ((FloatingButtonTrigger) q0.get(0)).mo27847f1();
                this.identifier = m10732G3((FloatingButtonTrigger) q0.get(0), 0);
                m10752v3((FloatingButtonTrigger) q0.get(0));
                return;
            }
            m10736K3(q0);
            return;
        }
        C15626c.m94876a(mo27827K0(), SelectableItem.m15535j1(C17541R$string.error), 0).show();
        C4878b.m18868g("Macro: " + this.macroName + " was not found");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.enableOption);
        parcel.writeLong(this.triggerGuid);
        parcel.writeLong(this.macroGuid);
        parcel.writeString(this.macroName);
        parcel.writeInt(this.iconBgColor);
        parcel.writeInt(this.alpha);
        parcel.writeInt(this.size);
        parcel.writeInt(this.transparentBackground ? 1 : 0);
        parcel.writeInt(this.updateLocation ? 1 : 0);
        parcel.writeInt(this.xLocation);
        parcel.writeInt(this.yLocation);
        parcel.writeInt(this.padding);
        parcel.writeString(this.identifier);
        parcel.writeInt(this.isInitialised ? 1 : 0);
        parcel.writeInt(this.imageResourceId);
        parcel.writeString(this.imageResourceName);
        parcel.writeString(this.imagePackageName);
        parcel.writeString(this.imageUri);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        List<Macro> E3 = m10730E3();
        String name = E3.get(i).getName();
        C13706o.m87928e(name, "allMacros[item].name");
        this.macroName = name;
        this.macroGuid = E3.get(i).getGUID();
    }

    public FloatingButtonConfigureAction() {
        this.identifier = "";
        this.macroName = "";
        this.padding = 20;
        this.normalSizeSelected = true;
    }

    private FloatingButtonConfigureAction(Parcel parcel) {
        super(parcel);
        String str = "";
        this.identifier = str;
        this.macroName = str;
        this.padding = 20;
        boolean z = true;
        this.normalSizeSelected = true;
        this.enableOption = parcel.readInt();
        this.triggerGuid = parcel.readLong();
        this.macroGuid = parcel.readLong();
        String readString = parcel.readString();
        this.macroName = readString == null ? str : readString;
        this.iconBgColor = parcel.readInt();
        this.alpha = parcel.readInt();
        this.size = parcel.readInt();
        this.transparentBackground = parcel.readInt() != 0;
        this.updateLocation = parcel.readInt() != 0;
        this.xLocation = parcel.readInt();
        this.yLocation = parcel.readInt();
        this.padding = parcel.readInt();
        String readString2 = parcel.readString();
        this.identifier = readString2 != null ? readString2 : str;
        this.isInitialised = parcel.readInt() == 0 ? false : z;
        this.imageResourceId = parcel.readInt();
        this.imageResourceName = parcel.readString();
        this.imagePackageName = parcel.readString();
        this.imageUri = parcel.readString();
    }
}
