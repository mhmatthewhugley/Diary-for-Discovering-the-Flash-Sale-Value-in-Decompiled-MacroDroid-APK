package androidx.core.view.inputmethod;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.inputmethod.InputConnectionCompat;

/* renamed from: androidx.core.view.inputmethod.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0506a implements InputConnectionCompat.OnCommitContentListener {

    /* renamed from: a */
    public final /* synthetic */ View f512a;

    public /* synthetic */ C0506a(View view) {
        this.f512a = view;
    }

    public final boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        return InputConnectionCompat.lambda$createOnCommitContentListenerUsingPerformReceiveContent$0(this.f512a, inputContentInfoCompat, i, bundle);
    }
}
