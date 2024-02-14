package p313l6;

import android.widget.TextView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import p283i6.C12443a;
import p293j6.C13290b;

/* renamed from: l6.a */
/* compiled from: RxTextView */
public final class C15584a {
    @CheckResult
    @NonNull
    /* renamed from: a */
    public static C12443a<CharSequence> m94764a(@NonNull TextView textView) {
        C13290b.m85615b(textView, "view == null");
        return new C15585b(textView);
    }
}
