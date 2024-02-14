package p245de.mustafagercek.library;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.core.view.ViewCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p439y8.C16970a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 $2\u00020\u0001:\u0001\u0003B'\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010!\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u0002R\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006%"}, mo71668d2 = {"Lde/mustafagercek/library/LoadingButton;", "Landroid/widget/FrameLayout;", "Lja/u;", "a", "Landroid/view/View$OnClickListener;", "onClick", "setButtonOnClickListener", "", "color", "setButtonColor", "setTextColor", "", "text", "setButtonText", "b", "c", "Landroid/widget/Button;", "Landroid/widget/Button;", "button", "Landroid/widget/ProgressBar;", "Landroid/widget/ProgressBar;", "progressBar", "d", "Ljava/lang/String;", "f", "I", "buttonColor", "g", "textColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "o", "library_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: de.mustafagercek.library.LoadingButton */
/* compiled from: LoadingButton.kt */
public final class LoadingButton extends FrameLayout {

    /* renamed from: o */
    public static final C12020a f58220o = new C12020a((C13695i) null);

    /* renamed from: a */
    private Button f58221a;

    /* renamed from: c */
    private ProgressBar f58222c;

    /* renamed from: d */
    private String f58223d;

    /* renamed from: f */
    private int f58224f;

    /* renamed from: g */
    private int f58225g;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo71668d2 = {"Lde/mustafagercek/library/LoadingButton$a;", "", "<init>", "()V", "library_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: de.mustafagercek.library.LoadingButton$a */
    /* compiled from: LoadingButton.kt */
    public static final class C12020a {
        private C12020a() {
        }

        public /* synthetic */ C12020a(C13695i iVar) {
            this();
        }
    }

    public LoadingButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C13695i) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoadingButton(Context context, AttributeSet attributeSet, int i, int i2, C13695i iVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: a */
    private final void m82474a() {
        this.f58221a.setText(this.f58223d);
        int i = this.f58224f;
        if (i != 0) {
            this.f58221a.setBackgroundTintList(ColorStateList.valueOf(i));
        }
        int i2 = this.f58225g;
        if (i2 != 0) {
            this.f58221a.setTextColor(i2);
            this.f58222c.setIndeterminateTintList(ColorStateList.valueOf(this.f58225g));
            return;
        }
        int i3 = -1;
        this.f58221a.setTextColor(C16970a.m100209a(this.f58224f) ? -1 : ViewCompat.MEASURED_STATE_MASK);
        ProgressBar progressBar = this.f58222c;
        if (!C16970a.m100209a(this.f58224f)) {
            i3 = ViewCompat.MEASURED_STATE_MASK;
        }
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(i3));
    }

    /* renamed from: b */
    public final void mo67471b() {
        this.f58221a.setText("");
        this.f58221a.setEnabled(false);
        this.f58222c.setVisibility(0);
    }

    /* renamed from: c */
    public final void mo67472c() {
        this.f58221a.setEnabled(true);
        this.f58221a.setText(this.f58223d);
        this.f58222c.setVisibility(8);
    }

    public final void setButtonColor(int i) {
        this.f58224f = i;
        m82474a();
    }

    public final void setButtonOnClickListener(View.OnClickListener onClickListener) {
        this.f58221a.setOnClickListener(onClickListener);
    }

    public final void setButtonText(String str) {
        C13706o.m87930g(str, "text");
        this.f58223d = str;
        this.f58221a.setText(str);
    }

    public final void setTextColor(int i) {
        this.f58225g = i;
        m82474a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadingButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C13706o.m87930g(context, "context");
        LayoutInflater.from(context).inflate(R$layout.loading_button, this, true);
        View findViewById = findViewById(R$id.btn);
        C13706o.m87925b(findViewById, "findViewById(R.id.btn)");
        this.f58221a = (Button) findViewById;
        View findViewById2 = findViewById(R$id.f58226pb);
        C13706o.m87925b(findViewById2, "findViewById(R.id.pb)");
        this.f58222c = (ProgressBar) findViewById2;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.LoadingButton, 0, 0);
        this.f58223d = obtainStyledAttributes.getString(R$styleable.LoadingButton_buttonText);
        this.f58224f = obtainStyledAttributes.getColor(R$styleable.LoadingButton_buttonColor, 0);
        this.f58225g = obtainStyledAttributes.getColor(R$styleable.LoadingButton_textColor, 0);
        m82474a();
    }
}
