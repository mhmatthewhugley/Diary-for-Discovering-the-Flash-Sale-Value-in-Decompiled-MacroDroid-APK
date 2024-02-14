package p138n5;

import android.os.Bundle;
import android.os.Handler;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.p073ui.auth.R$id;
import p329me.zhanghai.android.materialprogressbar.MaterialProgressBar;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: n5.b */
/* compiled from: InvisibleFragmentBase */
public class C7986b extends C7985a {

    /* renamed from: c */
    protected FrameLayout f19146c;

    /* renamed from: d */
    private Handler f19147d = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public MaterialProgressBar f19148f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f19149g = 0;

    /* renamed from: n5.b$a */
    /* compiled from: InvisibleFragmentBase */
    class C7987a implements Runnable {
        C7987a() {
        }

        public void run() {
            long unused = C7986b.this.f19149g = 0;
            C7986b.this.f19148f.setVisibility(8);
            C7986b.this.f19146c.setVisibility(8);
        }
    }

    /* renamed from: E */
    public void mo34183E() {
        mo37889Z(new C7987a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public void mo37889Z(Runnable runnable) {
        this.f19147d.postDelayed(runnable, Math.max(750 - (System.currentTimeMillis() - this.f19149g), 0));
    }

    /* renamed from: b1 */
    public void mo34184b1(int i) {
        if (this.f19148f.getVisibility() == 0) {
            this.f19147d.removeCallbacksAndMessages((Object) null);
            return;
        }
        this.f19149g = System.currentTimeMillis();
        this.f19148f.setVisibility(0);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        MaterialProgressBar materialProgressBar = new MaterialProgressBar(new ContextThemeWrapper(getContext(), mo37887U().f15987f));
        this.f19148f = materialProgressBar;
        materialProgressBar.setIndeterminate(true);
        this.f19148f.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R$id.invisible_frame);
        this.f19146c = frameLayout;
        frameLayout.addView(this.f19148f, layoutParams);
    }
}
