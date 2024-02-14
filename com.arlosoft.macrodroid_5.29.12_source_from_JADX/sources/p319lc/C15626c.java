package p319lc;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import java.lang.reflect.Field;

/* renamed from: lc.c */
/* compiled from: ToastCompat */
public final class C15626c extends Toast {
    @NonNull

    /* renamed from: a */
    private final Toast f64898a;

    private C15626c(Context context, @NonNull Toast toast) {
        super(context);
        this.f64898a = toast;
    }

    /* renamed from: a */
    public static C15626c m94876a(Context context, CharSequence charSequence, int i) {
        Toast makeText = Toast.makeText(context, charSequence, i);
        m94877b(makeText.getView(), new C15622b(context, makeText));
        return new C15626c(context, makeText);
    }

    /* renamed from: b */
    private static void m94877b(@NonNull View view, @NonNull Context context) {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                Field declaredField = View.class.getDeclaredField("mContext");
                declaredField.setAccessible(true);
                declaredField.set(view, context);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static Toast makeText(Context context, @StringRes int i, int i2) throws Resources.NotFoundException {
        return m94876a(context, context.getResources().getText(i), i2);
    }

    public void cancel() {
        this.f64898a.cancel();
    }

    public int getDuration() {
        return this.f64898a.getDuration();
    }

    public int getGravity() {
        return this.f64898a.getGravity();
    }

    public float getHorizontalMargin() {
        return this.f64898a.getHorizontalMargin();
    }

    public float getVerticalMargin() {
        return this.f64898a.getVerticalMargin();
    }

    public View getView() {
        return this.f64898a.getView();
    }

    public int getXOffset() {
        return this.f64898a.getXOffset();
    }

    public int getYOffset() {
        return this.f64898a.getYOffset();
    }

    public void setDuration(int i) {
        this.f64898a.setDuration(i);
    }

    public void setGravity(int i, int i2, int i3) {
        this.f64898a.setGravity(i, i2, i3);
    }

    public void setMargin(float f, float f2) {
        this.f64898a.setMargin(f, f2);
    }

    public void setText(int i) {
        this.f64898a.setText(i);
    }

    public void setView(View view) {
        this.f64898a.setView(view);
        m94877b(view, new C15622b(view.getContext(), this));
    }

    public void show() {
        this.f64898a.show();
    }

    public void setText(CharSequence charSequence) {
        this.f64898a.setText(charSequence);
    }
}
