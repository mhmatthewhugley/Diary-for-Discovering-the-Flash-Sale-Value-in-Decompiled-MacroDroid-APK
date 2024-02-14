package com.firebase.p073ui.auth.util.p075ui;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.util.ui.c */
/* compiled from: ImeHelper */
public class C6898c {

    /* renamed from: com.firebase.ui.auth.util.ui.c$a */
    /* compiled from: ImeHelper */
    static class C6899a implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ C6900b f16143a;

        C6899a(C6900b bVar) {
            this.f16143a = bVar;
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (keyEvent != null && keyEvent.getKeyCode() == 66) {
                if (keyEvent.getAction() == 1) {
                    this.f16143a.mo34200j1();
                }
                return true;
            } else if (i != 6) {
                return false;
            } else {
                this.f16143a.mo34200j1();
                return true;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: com.firebase.ui.auth.util.ui.c$b */
    /* compiled from: ImeHelper */
    public interface C6900b {
        /* renamed from: j1 */
        void mo34200j1();
    }

    /* renamed from: a */
    public static void m26058a(EditText editText, C6900b bVar) {
        editText.setOnEditorActionListener(new C6899a(bVar));
    }
}
