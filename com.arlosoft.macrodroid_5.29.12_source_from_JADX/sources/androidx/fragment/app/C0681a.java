package androidx.fragment.app;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

/* renamed from: androidx.fragment.app.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0681a implements OnContextAvailableListener {

    /* renamed from: a */
    public final /* synthetic */ FragmentActivity f545a;

    public /* synthetic */ C0681a(FragmentActivity fragmentActivity) {
        this.f545a = fragmentActivity;
    }

    public final void onContextAvailable(Context context) {
        this.f545a.lambda$init$1(context);
    }
}
