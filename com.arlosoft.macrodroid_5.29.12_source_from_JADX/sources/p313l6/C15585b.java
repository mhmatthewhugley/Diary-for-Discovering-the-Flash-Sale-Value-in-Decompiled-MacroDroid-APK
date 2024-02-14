package p313l6;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import p283i6.C12443a;
import p414v9.C16741n;
import p423w9.C16780a;

/* renamed from: l6.b */
/* compiled from: TextViewTextObservable */
final class C15585b extends C12443a<CharSequence> {

    /* renamed from: a */
    private final TextView f64824a;

    /* renamed from: l6.b$a */
    /* compiled from: TextViewTextObservable */
    static final class C15586a extends C16780a implements TextWatcher {

        /* renamed from: c */
        private final TextView f64825c;

        /* renamed from: d */
        private final C16741n<? super CharSequence> f64826d;

        C15586a(TextView textView, C16741n<? super CharSequence> nVar) {
            this.f64825c = textView;
            this.f64826d = nVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo70802a() {
            this.f64825c.removeTextChangedListener(this);
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!isDisposed()) {
                this.f64826d.onNext(charSequence);
            }
        }
    }

    C15585b(TextView textView) {
        this.f64824a = textView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public void mo68829i0(C16741n<? super CharSequence> nVar) {
        C15586a aVar = new C15586a(this.f64824a, nVar);
        nVar.onSubscribe(aVar);
        this.f64824a.addTextChangedListener(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public CharSequence mo68828h0() {
        return this.f64824a.getText();
    }
}
