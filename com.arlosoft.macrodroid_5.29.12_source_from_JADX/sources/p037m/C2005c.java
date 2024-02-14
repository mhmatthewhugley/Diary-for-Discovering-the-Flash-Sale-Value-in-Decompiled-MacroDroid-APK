package p037m;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.afollestad.materialdialogs.internal.MDRootLayout;

/* renamed from: m.c */
/* compiled from: DialogBase */
class C2005c extends Dialog implements DialogInterface.OnShowListener {

    /* renamed from: a */
    protected MDRootLayout f6114a;

    /* renamed from: c */
    private DialogInterface.OnShowListener f6115c;

    C2005c(Context context, int i) {
        super(context, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo24049b() {
        super.setOnShowListener(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo24050d(View view) {
        super.setContentView(view);
    }

    public View findViewById(int i) {
        return this.f6114a.findViewById(i);
    }

    public void onShow(DialogInterface dialogInterface) {
        DialogInterface.OnShowListener onShowListener = this.f6115c;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    @Deprecated
    public void setContentView(int i) throws IllegalAccessError {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f6115c = onShowListener;
    }

    @Deprecated
    public void setContentView(@NonNull View view) throws IllegalAccessError {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Deprecated
    public void setContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessError {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }
}
