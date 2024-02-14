package p112j2;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import p215b8.C11102b;
import p440y9.C16971a;

/* renamed from: j2.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C13248a implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Activity f61183a;

    public /* synthetic */ C13248a(Activity activity) {
        this.f61183a = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        new C11102b((FragmentActivity) this.f61183a).mo62231o("android.permission.RECORD_AUDIO").mo79679I(C16971a.m100210a()).mo79685P(new C13255e(this.f61183a));
    }
}
