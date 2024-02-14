package p319lc;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: lc.b */
/* compiled from: SafeToastContext */
final class C15622b extends ContextWrapper {
    /* access modifiers changed from: private */
    @NonNull

    /* renamed from: a */
    public Toast f64893a;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: b */
    public C15621a f64894b;

    /* renamed from: lc.b$b */
    /* compiled from: SafeToastContext */
    private final class C15624b extends ContextWrapper {
        public Object getSystemService(@NonNull String str) {
            if ("window".equals(str)) {
                return new C15625c((WindowManager) getBaseContext().getSystemService(str));
            }
            return super.getSystemService(str);
        }

        private C15624b(@NonNull Context context) {
            super(context);
        }
    }

    /* renamed from: lc.b$c */
    /* compiled from: SafeToastContext */
    private final class C15625c implements WindowManager {
        @NonNull

        /* renamed from: a */
        private final WindowManager f64896a;

        public void addView(View view, ViewGroup.LayoutParams layoutParams) {
            try {
                this.f64896a.addView(view, layoutParams);
            } catch (WindowManager.BadTokenException e) {
                Log.i("WindowManagerWrapper", e.getMessage());
                if (C15622b.this.f64894b != null) {
                    C15622b.this.f64894b.mo74972a(C15622b.this.f64893a);
                }
            } catch (Throwable th) {
                Log.e("WindowManagerWrapper", "[addView]", th);
            }
        }

        public Display getDefaultDisplay() {
            return this.f64896a.getDefaultDisplay();
        }

        public void removeView(View view) {
            this.f64896a.removeView(view);
        }

        public void removeViewImmediate(View view) {
            this.f64896a.removeViewImmediate(view);
        }

        public void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
            this.f64896a.updateViewLayout(view, layoutParams);
        }

        private C15625c(@NonNull WindowManager windowManager) {
            this.f64896a = windowManager;
        }
    }

    C15622b(@NonNull Context context, @NonNull Toast toast) {
        super(context);
        this.f64893a = toast;
    }

    public Context getApplicationContext() {
        return new C15624b(getBaseContext().getApplicationContext());
    }
}
