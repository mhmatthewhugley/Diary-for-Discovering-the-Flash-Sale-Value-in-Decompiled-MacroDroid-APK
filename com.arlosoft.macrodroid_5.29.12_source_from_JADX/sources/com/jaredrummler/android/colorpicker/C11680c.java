package com.jaredrummler.android.colorpicker;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.jaredrummler.android.colorpicker.C11675b;
import com.jaredrummler.android.colorpicker.ColorPickerView;
import java.util.Arrays;
import java.util.Locale;
import p331n6.C15755a;

/* renamed from: com.jaredrummler.android.colorpicker.c */
/* compiled from: ColorPickerDialog */
public class C11680c extends DialogFragment implements ColorPickerView.C11671c, TextWatcher {

    /* renamed from: L */
    public static final int[] f57446L = {-769226, -1499549, -54125, -6543440, -10011977, -12627531, -14575885, -16537100, -16728876, -16738680, -11751600, -7617718, -3285959, -5317, -16121, -26624, -8825528, -10453621, -6381922};

    /* renamed from: A */
    LinearLayout f57447A;

    /* renamed from: B */
    SeekBar f57448B;

    /* renamed from: C */
    TextView f57449C;

    /* renamed from: D */
    ColorPickerView f57450D;

    /* renamed from: E */
    ColorPanelView f57451E;

    /* renamed from: F */
    EditText f57452F;

    /* renamed from: G */
    boolean f57453G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public int f57454H;

    /* renamed from: I */
    private boolean f57455I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public int f57456J;

    /* renamed from: K */
    private final View.OnTouchListener f57457K = new C11682b();

    /* renamed from: a */
    C15755a f57458a;

    /* renamed from: c */
    FrameLayout f57459c;

    /* renamed from: d */
    int[] f57460d;
    @ColorInt

    /* renamed from: f */
    int f57461f;

    /* renamed from: g */
    int f57462g;

    /* renamed from: o */
    int f57463o;

    /* renamed from: p */
    boolean f57464p;

    /* renamed from: s */
    int f57465s;

    /* renamed from: z */
    C11675b f57466z;

    /* renamed from: com.jaredrummler.android.colorpicker.c$a */
    /* compiled from: ColorPickerDialog */
    class C11681a implements SeekBar.OnSeekBarChangeListener {
        C11681a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C11675b bVar;
            C11680c.this.f57449C.setText(String.format(Locale.ENGLISH, "%d%%", new Object[]{Integer.valueOf((int) ((((double) i) * 100.0d) / 255.0d))}));
            int i2 = 255 - i;
            int i3 = 0;
            while (true) {
                bVar = C11680c.this.f57466z;
                int[] iArr = bVar.f57435c;
                if (i3 >= iArr.length) {
                    break;
                }
                int i4 = iArr[i3];
                C11680c.this.f57466z.f57435c[i3] = Color.argb(i2, Color.red(i4), Color.green(i4), Color.blue(i4));
                i3++;
            }
            bVar.notifyDataSetChanged();
            for (int i5 = 0; i5 < C11680c.this.f57447A.getChildCount(); i5++) {
                FrameLayout frameLayout = (FrameLayout) C11680c.this.f57447A.getChildAt(i5);
                ColorPanelView colorPanelView = (ColorPanelView) frameLayout.findViewById(R$id.cpv_color_panel_view);
                ImageView imageView = (ImageView) frameLayout.findViewById(R$id.cpv_color_image_view);
                if (frameLayout.getTag() == null) {
                    frameLayout.setTag(Integer.valueOf(colorPanelView.getBorderColor()));
                }
                int color = colorPanelView.getColor();
                int argb = Color.argb(i2, Color.red(color), Color.green(color), Color.blue(color));
                if (i2 <= 165) {
                    colorPanelView.setBorderColor(argb | ViewCompat.MEASURED_STATE_MASK);
                } else {
                    colorPanelView.setBorderColor(((Integer) frameLayout.getTag()).intValue());
                }
                if (colorPanelView.getTag() != null && ((Boolean) colorPanelView.getTag()).booleanValue()) {
                    if (i2 <= 165) {
                        imageView.setColorFilter(ViewCompat.MEASURED_STATE_MASK, PorterDuff.Mode.SRC_IN);
                    } else if (ColorUtils.calculateLuminance(argb) >= 0.65d) {
                        imageView.setColorFilter(ViewCompat.MEASURED_STATE_MASK, PorterDuff.Mode.SRC_IN);
                    } else {
                        imageView.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
                    }
                }
                colorPanelView.setColor(argb);
            }
            int red = Color.red(C11680c.this.f57461f);
            int green = Color.green(C11680c.this.f57461f);
            int blue = Color.blue(C11680c.this.f57461f);
            C11680c.this.f57461f = Color.argb(i2, red, green, blue);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.c$b */
    /* compiled from: ColorPickerDialog */
    class C11682b implements View.OnTouchListener {
        C11682b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            EditText editText = C11680c.this.f57452F;
            if (view == editText || !editText.hasFocus()) {
                return false;
            }
            C11680c.this.f57452F.clearFocus();
            ((InputMethodManager) C11680c.this.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(C11680c.this.f57452F.getWindowToken(), 0);
            C11680c.this.f57452F.clearFocus();
            return true;
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.c$c */
    /* compiled from: ColorPickerDialog */
    class C11683c implements DialogInterface.OnClickListener {
        C11683c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C11680c cVar = C11680c.this;
            cVar.m81796f(cVar.f57461f);
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.c$d */
    /* compiled from: ColorPickerDialog */
    class C11684d implements View.OnClickListener {
        C11684d() {
        }

        public void onClick(View view) {
            C11680c.this.f57459c.removeAllViews();
            C11680c cVar = C11680c.this;
            int i = cVar.f57462g;
            if (i == 0) {
                cVar.f57462g = 1;
                ((Button) view).setText(cVar.f57456J != 0 ? C11680c.this.f57456J : R$string.cpv_custom);
                C11680c cVar2 = C11680c.this;
                cVar2.f57459c.addView(cVar2.mo65715a0());
            } else if (i == 1) {
                cVar.f57462g = 0;
                ((Button) view).setText(cVar.f57454H != 0 ? C11680c.this.f57454H : R$string.cpv_presets);
                C11680c cVar3 = C11680c.this;
                cVar3.f57459c.addView(cVar3.mo65714Z());
            }
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.c$e */
    /* compiled from: ColorPickerDialog */
    class C11685e implements View.OnClickListener {
        C11685e() {
        }

        public void onClick(View view) {
            int color = C11680c.this.f57451E.getColor();
            C11680c cVar = C11680c.this;
            int i = cVar.f57461f;
            if (color == i) {
                cVar.m81796f(i);
                C11680c.this.dismiss();
            }
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.c$f */
    /* compiled from: ColorPickerDialog */
    class C11686f implements View.OnFocusChangeListener {
        C11686f() {
        }

        public void onFocusChange(View view, boolean z) {
            if (z) {
                ((InputMethodManager) C11680c.this.getActivity().getSystemService("input_method")).showSoftInput(C11680c.this.f57452F, 1);
            }
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.c$g */
    /* compiled from: ColorPickerDialog */
    class C11687g implements C11675b.C11676a {
        C11687g() {
        }

        /* renamed from: f */
        public void mo65709f(int i) {
            C11680c cVar = C11680c.this;
            int i2 = cVar.f57461f;
            if (i2 == i) {
                cVar.m81796f(i2);
                C11680c.this.dismiss();
                return;
            }
            cVar.f57461f = i;
            if (cVar.f57464p) {
                cVar.mo65713X(i);
            }
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.c$h */
    /* compiled from: ColorPickerDialog */
    class C11688h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ColorPanelView f57474a;

        /* renamed from: c */
        final /* synthetic */ int f57475c;

        C11688h(ColorPanelView colorPanelView, int i) {
            this.f57474a = colorPanelView;
            this.f57475c = i;
        }

        public void run() {
            this.f57474a.setColor(this.f57475c);
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.c$i */
    /* compiled from: ColorPickerDialog */
    class C11689i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ColorPanelView f57477a;

        C11689i(ColorPanelView colorPanelView) {
            this.f57477a = colorPanelView;
        }

        public void onClick(View view) {
            if (!(view.getTag() instanceof Boolean) || !((Boolean) view.getTag()).booleanValue()) {
                C11680c.this.f57461f = this.f57477a.getColor();
                C11680c.this.f57466z.mo65704a();
                for (int i = 0; i < C11680c.this.f57447A.getChildCount(); i++) {
                    FrameLayout frameLayout = (FrameLayout) C11680c.this.f57447A.getChildAt(i);
                    ColorPanelView colorPanelView = (ColorPanelView) frameLayout.findViewById(R$id.cpv_color_panel_view);
                    ImageView imageView = (ImageView) frameLayout.findViewById(R$id.cpv_color_image_view);
                    imageView.setImageResource(colorPanelView == view ? R$drawable.cpv_preset_checked : 0);
                    if ((colorPanelView != view || ColorUtils.calculateLuminance(colorPanelView.getColor()) < 0.65d) && Color.alpha(colorPanelView.getColor()) > 165) {
                        imageView.setColorFilter((ColorFilter) null);
                    } else {
                        imageView.setColorFilter(ViewCompat.MEASURED_STATE_MASK, PorterDuff.Mode.SRC_IN);
                    }
                    colorPanelView.setTag(Boolean.valueOf(colorPanelView == view));
                }
                return;
            }
            C11680c cVar = C11680c.this;
            cVar.m81796f(cVar.f57461f);
            C11680c.this.dismiss();
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.c$j */
    /* compiled from: ColorPickerDialog */
    class C11690j implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ ColorPanelView f57479a;

        C11690j(ColorPanelView colorPanelView) {
            this.f57479a = colorPanelView;
        }

        public boolean onLongClick(View view) {
            this.f57479a.mo65650d();
            return true;
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.c$k */
    /* compiled from: ColorPickerDialog */
    public static final class C11691k {
        @StringRes

        /* renamed from: a */
        int f57481a = R$string.cpv_default_title;
        @StringRes

        /* renamed from: b */
        int f57482b = R$string.cpv_presets;
        @StringRes

        /* renamed from: c */
        int f57483c = R$string.cpv_custom;
        @StringRes

        /* renamed from: d */
        int f57484d = R$string.cpv_select;

        /* renamed from: e */
        int f57485e = 1;

        /* renamed from: f */
        int[] f57486f = C11680c.f57446L;
        @ColorInt

        /* renamed from: g */
        int f57487g = ViewCompat.MEASURED_STATE_MASK;

        /* renamed from: h */
        int f57488h = 0;

        /* renamed from: i */
        boolean f57489i = false;

        /* renamed from: j */
        boolean f57490j = true;

        /* renamed from: k */
        boolean f57491k = true;

        /* renamed from: l */
        boolean f57492l = true;

        /* renamed from: m */
        int f57493m = 1;

        C11691k() {
        }

        /* renamed from: a */
        public C11680c mo65731a() {
            C11680c cVar = new C11680c();
            Bundle bundle = new Bundle();
            bundle.putInt("id", this.f57488h);
            bundle.putInt("dialogType", this.f57485e);
            bundle.putInt(TypedValues.Custom.S_COLOR, this.f57487g);
            bundle.putIntArray("presets", this.f57486f);
            bundle.putBoolean("alpha", this.f57489i);
            bundle.putBoolean("allowCustom", this.f57491k);
            bundle.putBoolean("allowPresets", this.f57490j);
            bundle.putInt("dialogTitle", this.f57481a);
            bundle.putBoolean("showColorShades", this.f57492l);
            bundle.putInt("colorShape", this.f57493m);
            bundle.putInt("presetsButtonText", this.f57482b);
            bundle.putInt("customButtonText", this.f57483c);
            bundle.putInt("selectedButtonText", this.f57484d);
            cVar.setArguments(bundle);
            return cVar;
        }

        /* renamed from: b */
        public C11691k mo65732b(boolean z) {
            this.f57491k = z;
            return this;
        }

        /* renamed from: c */
        public C11691k mo65733c(boolean z) {
            this.f57490j = z;
            return this;
        }

        /* renamed from: d */
        public C11691k mo65734d(int i) {
            this.f57487g = i;
            return this;
        }

        /* renamed from: e */
        public C11691k mo65735e(int i) {
            this.f57493m = i;
            return this;
        }

        /* renamed from: f */
        public C11691k mo65736f(@StringRes int i) {
            this.f57483c = i;
            return this;
        }

        /* renamed from: g */
        public C11691k mo65737g(@StringRes int i) {
            this.f57481a = i;
            return this;
        }

        /* renamed from: h */
        public C11691k mo65738h(int i) {
            this.f57485e = i;
            return this;
        }

        /* renamed from: i */
        public C11691k mo65739i(@NonNull int[] iArr) {
            this.f57486f = iArr;
            return this;
        }

        /* renamed from: j */
        public C11691k mo65740j(@StringRes int i) {
            this.f57482b = i;
            return this;
        }

        /* renamed from: k */
        public C11691k mo65741k(@StringRes int i) {
            this.f57484d = i;
            return this;
        }

        /* renamed from: l */
        public C11691k mo65742l(boolean z) {
            this.f57489i = z;
            return this;
        }

        /* renamed from: m */
        public C11691k mo65743m(boolean z) {
            this.f57492l = z;
            return this;
        }

        /* renamed from: n */
        public void mo65744n(FragmentActivity fragmentActivity) {
            mo65731a().show(fragmentActivity.getSupportFragmentManager(), "color-picker-dialog");
        }
    }

    /* renamed from: e0 */
    private int[] m81795e0(@ColorInt int i) {
        return new int[]{m81804p0(i, 0.9d), m81804p0(i, 0.7d), m81804p0(i, 0.5d), m81804p0(i, 0.333d), m81804p0(i, 0.166d), m81804p0(i, -0.125d), m81804p0(i, -0.25d), m81804p0(i, -0.375d), m81804p0(i, -0.5d), m81804p0(i, -0.675d), m81804p0(i, -0.7d), m81804p0(i, -0.775d)};
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m81796f(int i) {
        if (this.f57458a != null) {
            Log.w("ColorPickerDialog", "Using deprecated listener which may be remove in future releases");
            this.f57458a.mo24603U(this.f57463o, i);
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity instanceof C15755a) {
            ((C15755a) activity).mo24603U(this.f57463o, i);
            return;
        }
        throw new IllegalStateException("The activity must implement ColorPickerDialogListener");
    }

    /* renamed from: f0 */
    private void m81797f0() {
        int alpha = Color.alpha(this.f57461f);
        int[] intArray = getArguments().getIntArray("presets");
        this.f57460d = intArray;
        if (intArray == null) {
            this.f57460d = f57446L;
        }
        int[] iArr = this.f57460d;
        boolean z = iArr == f57446L;
        this.f57460d = Arrays.copyOf(iArr, iArr.length);
        if (alpha != 255) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.f57460d;
                if (i >= iArr2.length) {
                    break;
                }
                int i2 = iArr2[i];
                this.f57460d[i] = Color.argb(alpha, Color.red(i2), Color.green(i2), Color.blue(i2));
                i++;
            }
        }
        this.f57460d = m81805q0(this.f57460d, this.f57461f);
        int i3 = getArguments().getInt(TypedValues.Custom.S_COLOR);
        if (i3 != this.f57461f) {
            this.f57460d = m81805q0(this.f57460d, i3);
        }
        if (z) {
            int[] iArr3 = this.f57460d;
            if (iArr3.length == 19) {
                this.f57460d = m81801j0(iArr3, Color.argb(alpha, 0, 0, 0));
            }
        }
    }

    /* renamed from: g0 */
    public static C11691k m81798g0() {
        return new C11691k();
    }

    private int getSelectedItemPosition() {
        int i = 0;
        while (true) {
            int[] iArr = this.f57460d;
            if (i >= iArr.length) {
                return -1;
            }
            if (iArr[i] == this.f57461f) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: h0 */
    private void m81799h0() {
        if (this.f57458a != null) {
            Log.w("ColorPickerDialog", "Using deprecated listener which may be remove in future releases");
            this.f57458a.mo24604V0(this.f57463o);
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity instanceof C15755a) {
            ((C15755a) activity).mo24604V0(this.f57463o);
        }
    }

    /* renamed from: i0 */
    private int m81800i0(String str) throws NumberFormatException {
        int i;
        int i2;
        int parseInt;
        int parseInt2;
        if (str.startsWith("#")) {
            str = str.substring(1);
        }
        int i3 = -1;
        int i4 = 0;
        if (str.length() == 0) {
            i = 0;
        } else if (str.length() <= 2) {
            i = Integer.parseInt(str, 16);
        } else {
            if (str.length() == 3) {
                parseInt = Integer.parseInt(str.substring(0, 1), 16);
                i2 = Integer.parseInt(str.substring(1, 2), 16);
                parseInt2 = Integer.parseInt(str.substring(2, 3), 16);
            } else if (str.length() == 4) {
                int parseInt3 = Integer.parseInt(str.substring(0, 2), 16);
                i = Integer.parseInt(str.substring(2, 4), 16);
                i2 = parseInt3;
                i3 = 255;
                return Color.argb(i3, i4, i2, i);
            } else if (str.length() == 5) {
                parseInt = Integer.parseInt(str.substring(0, 1), 16);
                i2 = Integer.parseInt(str.substring(1, 3), 16);
                parseInt2 = Integer.parseInt(str.substring(3, 5), 16);
            } else if (str.length() == 6) {
                parseInt = Integer.parseInt(str.substring(0, 2), 16);
                i2 = Integer.parseInt(str.substring(2, 4), 16);
                parseInt2 = Integer.parseInt(str.substring(4, 6), 16);
            } else {
                if (str.length() == 7) {
                    i3 = Integer.parseInt(str.substring(0, 1), 16);
                    int parseInt4 = Integer.parseInt(str.substring(1, 3), 16);
                    int parseInt5 = Integer.parseInt(str.substring(3, 5), 16);
                    i = Integer.parseInt(str.substring(5, 7), 16);
                    i4 = parseInt4;
                    i2 = parseInt5;
                } else if (str.length() == 8) {
                    i3 = Integer.parseInt(str.substring(0, 2), 16);
                    int parseInt6 = Integer.parseInt(str.substring(2, 4), 16);
                    int parseInt7 = Integer.parseInt(str.substring(4, 6), 16);
                    i = Integer.parseInt(str.substring(6, 8), 16);
                    i4 = parseInt6;
                    i2 = parseInt7;
                } else {
                    i = -1;
                    i2 = -1;
                    i4 = -1;
                }
                return Color.argb(i3, i4, i2, i);
            }
            i4 = parseInt;
            i3 = 255;
            return Color.argb(i3, i4, i2, i);
        }
        i2 = 0;
        i3 = 255;
        return Color.argb(i3, i4, i2, i);
    }

    /* renamed from: j0 */
    private int[] m81801j0(int[] iArr, int i) {
        boolean z;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            } else if (iArr[i2] == i) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            return iArr;
        }
        int length2 = iArr.length + 1;
        int[] iArr2 = new int[length2];
        int i3 = length2 - 1;
        iArr2[i3] = i;
        System.arraycopy(iArr, 0, iArr2, 0, i3);
        return iArr2;
    }

    /* renamed from: n0 */
    private void m81802n0(int i) {
        if (this.f57453G) {
            this.f57452F.setText(String.format("%08X", new Object[]{Integer.valueOf(i)}));
            return;
        }
        this.f57452F.setText(String.format("%06X", new Object[]{Integer.valueOf(i & ViewCompat.MEASURED_SIZE_MASK)}));
    }

    /* renamed from: o0 */
    private void m81803o0() {
        int alpha = 255 - Color.alpha(this.f57461f);
        this.f57448B.setMax(255);
        this.f57448B.setProgress(alpha);
        this.f57449C.setText(String.format(Locale.ENGLISH, "%d%%", new Object[]{Integer.valueOf((int) ((((double) alpha) * 100.0d) / 255.0d))}));
        this.f57448B.setOnSeekBarChangeListener(new C11681a());
    }

    /* renamed from: p0 */
    private int m81804p0(@ColorInt int i, double d) {
        long parseLong = Long.parseLong(String.format("#%06X", new Object[]{Integer.valueOf(16777215 & i)}).substring(1), 16);
        double d2 = 0.0d;
        int i2 = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
        if (i2 >= 0) {
            d2 = 255.0d;
        }
        if (i2 < 0) {
            d *= -1.0d;
        }
        long j = parseLong >> 16;
        long j2 = (parseLong >> 8) & 255;
        long j3 = parseLong & 255;
        return Color.argb(Color.alpha(i), (int) (Math.round((d2 - ((double) j)) * d) + j), (int) (Math.round((d2 - ((double) j2)) * d) + j2), (int) (Math.round((d2 - ((double) j3)) * d) + j3));
    }

    /* renamed from: q0 */
    private int[] m81805q0(int[] iArr, int i) {
        boolean z;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            } else if (iArr[i2] == i) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            return iArr;
        }
        int length2 = iArr.length + 1;
        int[] iArr2 = new int[length2];
        iArr2[0] = i;
        System.arraycopy(iArr, 0, iArr2, 1, length2 - 1);
        return iArr2;
    }

    /* renamed from: K */
    public void mo65685K(int i) {
        this.f57461f = i;
        ColorPanelView colorPanelView = this.f57451E;
        if (colorPanelView != null) {
            colorPanelView.setColor(i);
        }
        if (!this.f57455I && this.f57452F != null) {
            m81802n0(i);
            if (this.f57452F.hasFocus()) {
                ((InputMethodManager) getActivity().getSystemService("input_method")).hideSoftInputFromWindow(this.f57452F.getWindowToken(), 0);
                this.f57452F.clearFocus();
            }
        }
        this.f57455I = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo65713X(@ColorInt int i) {
        int i2;
        int[] e0 = m81795e0(i);
        int i3 = 0;
        if (this.f57447A.getChildCount() != 0) {
            while (i3 < this.f57447A.getChildCount()) {
                FrameLayout frameLayout = (FrameLayout) this.f57447A.getChildAt(i3);
                ColorPanelView colorPanelView = (ColorPanelView) frameLayout.findViewById(R$id.cpv_color_panel_view);
                colorPanelView.setColor(e0[i3]);
                colorPanelView.setTag(Boolean.FALSE);
                ((ImageView) frameLayout.findViewById(R$id.cpv_color_image_view)).setImageDrawable((Drawable) null);
                i3++;
            }
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.cpv_item_horizontal_padding);
        int length = e0.length;
        while (i3 < length) {
            int i4 = e0[i3];
            if (this.f57465s == 0) {
                i2 = R$layout.cpv_color_item_square;
            } else {
                i2 = R$layout.cpv_color_item_circle;
            }
            View inflate = View.inflate(getActivity(), i2, (ViewGroup) null);
            ColorPanelView colorPanelView2 = (ColorPanelView) inflate.findViewById(R$id.cpv_color_panel_view);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) colorPanelView2.getLayoutParams();
            marginLayoutParams.rightMargin = dimensionPixelSize;
            marginLayoutParams.leftMargin = dimensionPixelSize;
            colorPanelView2.setLayoutParams(marginLayoutParams);
            colorPanelView2.setColor(i4);
            this.f57447A.addView(inflate);
            colorPanelView2.post(new C11688h(colorPanelView2, i4));
            colorPanelView2.setOnClickListener(new C11689i(colorPanelView2));
            colorPanelView2.setOnLongClickListener(new C11690j(colorPanelView2));
            i3++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public View mo65714Z() {
        View inflate = View.inflate(getActivity(), R$layout.cpv_dialog_color_picker, (ViewGroup) null);
        this.f57450D = (ColorPickerView) inflate.findViewById(R$id.cpv_color_picker_view);
        ColorPanelView colorPanelView = (ColorPanelView) inflate.findViewById(R$id.cpv_color_panel_old);
        this.f57451E = (ColorPanelView) inflate.findViewById(R$id.cpv_color_panel_new);
        ImageView imageView = (ImageView) inflate.findViewById(R$id.cpv_arrow_right);
        this.f57452F = (EditText) inflate.findViewById(R$id.cpv_hex);
        try {
            TypedValue typedValue = new TypedValue();
            TypedArray obtainStyledAttributes = getActivity().obtainStyledAttributes(typedValue.data, new int[]{16842806});
            int color = obtainStyledAttributes.getColor(0, ViewCompat.MEASURED_STATE_MASK);
            obtainStyledAttributes.recycle();
            imageView.setColorFilter(color);
        } catch (Exception unused) {
        }
        this.f57450D.setAlphaSliderVisible(this.f57453G);
        colorPanelView.setColor(getArguments().getInt(TypedValues.Custom.S_COLOR));
        this.f57450D.mo65671n(this.f57461f, true);
        this.f57451E.setColor(this.f57461f);
        m81802n0(this.f57461f);
        if (!this.f57453G) {
            this.f57452F.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
        }
        this.f57451E.setOnClickListener(new C11685e());
        inflate.setOnTouchListener(this.f57457K);
        this.f57450D.setOnColorChangedListener(this);
        this.f57452F.addTextChangedListener(this);
        this.f57452F.setOnFocusChangeListener(new C11686f());
        return inflate;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public View mo65715a0() {
        View inflate = View.inflate(getActivity(), R$layout.cpv_dialog_presets, (ViewGroup) null);
        this.f57447A = (LinearLayout) inflate.findViewById(R$id.shades_layout);
        this.f57448B = (SeekBar) inflate.findViewById(R$id.transparency_seekbar);
        this.f57449C = (TextView) inflate.findViewById(R$id.transparency_text);
        GridView gridView = (GridView) inflate.findViewById(R$id.gridView);
        m81797f0();
        if (this.f57464p) {
            mo65713X(this.f57461f);
        } else {
            this.f57447A.setVisibility(8);
            inflate.findViewById(R$id.shades_divider).setVisibility(8);
        }
        C11675b bVar = new C11675b(new C11687g(), this.f57460d, getSelectedItemPosition(), this.f57465s);
        this.f57466z = bVar;
        gridView.setAdapter(bVar);
        if (this.f57453G) {
            m81803o0();
        } else {
            inflate.findViewById(R$id.transparency_layout).setVisibility(8);
            inflate.findViewById(R$id.transparency_title).setVisibility(8);
        }
        return inflate;
    }

    public void afterTextChanged(Editable editable) {
        int i0;
        if (this.f57452F.isFocused() && (i0 = m81800i0(editable.toString())) != this.f57450D.getColor()) {
            this.f57455I = true;
            this.f57450D.mo65671n(i0, true);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: m0 */
    public void mo65718m0(C15755a aVar) {
        this.f57458a = aVar;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        int i;
        this.f57463o = getArguments().getInt("id");
        this.f57453G = getArguments().getBoolean("alpha");
        this.f57464p = getArguments().getBoolean("showColorShades");
        this.f57465s = getArguments().getInt("colorShape");
        if (bundle == null) {
            this.f57461f = getArguments().getInt(TypedValues.Custom.S_COLOR);
            this.f57462g = getArguments().getInt("dialogType");
        } else {
            this.f57461f = bundle.getInt(TypedValues.Custom.S_COLOR);
            this.f57462g = bundle.getInt("dialogType");
        }
        FrameLayout frameLayout = new FrameLayout(requireActivity());
        this.f57459c = frameLayout;
        int i2 = this.f57462g;
        if (i2 == 0) {
            frameLayout.addView(mo65714Z());
        } else if (i2 == 1) {
            frameLayout.addView(mo65715a0());
        }
        int i3 = getArguments().getInt("selectedButtonText");
        if (i3 == 0) {
            i3 = R$string.cpv_select;
        }
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(requireActivity()).setView((View) this.f57459c).setPositiveButton(i3, (DialogInterface.OnClickListener) new C11683c());
        int i4 = getArguments().getInt("dialogTitle");
        if (i4 != 0) {
            positiveButton.setTitle(i4);
        }
        this.f57454H = getArguments().getInt("presetsButtonText");
        this.f57456J = getArguments().getInt("customButtonText");
        if (this.f57462g == 0 && getArguments().getBoolean("allowPresets")) {
            i = this.f57454H;
            if (i == 0) {
                i = R$string.cpv_presets;
            }
        } else if (this.f57462g != 1 || !getArguments().getBoolean("allowCustom")) {
            i = 0;
        } else {
            i = this.f57456J;
            if (i == 0) {
                i = R$string.cpv_custom;
            }
        }
        if (i != 0) {
            positiveButton.setNeutralButton(i, (DialogInterface.OnClickListener) null);
        }
        return positiveButton.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        m81799h0();
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(TypedValues.Custom.S_COLOR, this.f57461f);
        bundle.putInt("dialogType", this.f57462g);
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        AlertDialog alertDialog = (AlertDialog) getDialog();
        alertDialog.getWindow().clearFlags(131080);
        alertDialog.getWindow().setSoftInputMode(4);
        Button button = alertDialog.getButton(-3);
        if (button != null) {
            button.setOnClickListener(new C11684d());
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
