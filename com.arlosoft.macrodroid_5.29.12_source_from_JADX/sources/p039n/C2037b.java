package p039n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.afollestad.materialdialogs.R$attr;
import com.afollestad.materialdialogs.R$drawable;
import java.lang.reflect.Field;
import p040o.C2039a;

/* renamed from: n.b */
/* compiled from: MDTintHelper */
public class C2037b {
    /* renamed from: a */
    private static ColorStateList m8422a(@NonNull Context context, @ColorInt int i) {
        int i2 = R$attr.colorControlNormal;
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{-16842919, -16842908}, new int[0]}, new int[]{C2039a.m8442l(context, i2), C2039a.m8442l(context, i2), i});
    }

    /* renamed from: b */
    private static void m8423b(@NonNull EditText editText, @ColorInt int i) {
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable[] drawableArr = {ContextCompat.getDrawable(editText.getContext(), i2), ContextCompat.getDrawable(editText.getContext(), i2)};
            drawableArr[0].setColorFilter(i, PorterDuff.Mode.SRC_IN);
            drawableArr[1].setColorFilter(i, PorterDuff.Mode.SRC_IN);
            declaredField3.set(obj, drawableArr);
        } catch (NoSuchFieldException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Device issue with cursor tinting: ");
            sb.append(e.getMessage());
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m8424c(@NonNull CheckBox checkBox, @ColorInt int i) {
        int d = C2039a.m8434d(checkBox.getContext());
        m8425d(checkBox, new ColorStateList(new int[][]{new int[]{16842910, -16842912}, new int[]{16842910, 16842912}, new int[]{-16842910, -16842912}, new int[]{-16842910, 16842912}}, new int[]{C2039a.m8442l(checkBox.getContext(), R$attr.colorControlNormal), i, d, d}));
    }

    /* renamed from: d */
    public static void m8425d(@NonNull CheckBox checkBox, @NonNull ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 22) {
            checkBox.setButtonTintList(colorStateList);
            return;
        }
        Drawable wrap = DrawableCompat.wrap(ContextCompat.getDrawable(checkBox.getContext(), R$drawable.abc_btn_check_material));
        DrawableCompat.setTintList(wrap, colorStateList);
        checkBox.setButtonDrawable(wrap);
    }

    /* renamed from: e */
    public static void m8426e(@NonNull EditText editText, @ColorInt int i) {
        ColorStateList a = m8422a(editText.getContext(), i);
        if (editText instanceof AppCompatEditText) {
            ((AppCompatEditText) editText).setSupportBackgroundTintList(a);
        } else {
            editText.setBackgroundTintList(a);
        }
        m8423b(editText, i);
    }

    /* renamed from: f */
    public static void m8427f(@NonNull RadioButton radioButton, @ColorInt int i) {
        int d = C2039a.m8434d(radioButton.getContext());
        m8428g(radioButton, new ColorStateList(new int[][]{new int[]{16842910, -16842912}, new int[]{16842910, 16842912}, new int[]{-16842910, -16842912}, new int[]{-16842910, 16842912}}, new int[]{C2039a.m8442l(radioButton.getContext(), R$attr.colorControlNormal), i, d, d}));
    }

    /* renamed from: g */
    public static void m8428g(@NonNull RadioButton radioButton, @NonNull ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 22) {
            radioButton.setButtonTintList(colorStateList);
            return;
        }
        Drawable wrap = DrawableCompat.wrap(ContextCompat.getDrawable(radioButton.getContext(), R$drawable.abc_btn_radio_material));
        DrawableCompat.setTintList(wrap, colorStateList);
        radioButton.setButtonDrawable(wrap);
    }
}
