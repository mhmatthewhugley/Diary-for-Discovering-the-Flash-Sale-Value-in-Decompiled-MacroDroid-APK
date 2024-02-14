package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;

/* renamed from: o1.t */
/* compiled from: DialogLogcatTextToMatchBinding */
public final class C8027t implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final ScrollView f19444a;
    @NonNull

    /* renamed from: b */
    public final CheckBox f19445b;
    @NonNull

    /* renamed from: c */
    public final CheckBox f19446c;
    @NonNull

    /* renamed from: d */
    public final CheckBox f19447d;
    @NonNull

    /* renamed from: e */
    public final CheckBox f19448e;
    @NonNull

    /* renamed from: f */
    public final CheckBox f19449f;
    @NonNull

    /* renamed from: g */
    public final CheckBox f19450g;
    @NonNull

    /* renamed from: h */
    public final C7996d0 f19451h;
    @NonNull

    /* renamed from: i */
    public final Button f19452i;
    @NonNull

    /* renamed from: j */
    public final Button f19453j;
    @NonNull

    /* renamed from: k */
    public final AppCompatEditText f19454k;
    @NonNull

    /* renamed from: l */
    public final TextView f19455l;
    @NonNull

    /* renamed from: m */
    public final Button f19456m;
    @NonNull

    /* renamed from: n */
    public final AppCompatEditText f19457n;
    @NonNull

    /* renamed from: o */
    public final TextView f19458o;

    private C8027t(@NonNull ScrollView scrollView, @NonNull CheckBox checkBox, @NonNull CheckBox checkBox2, @NonNull CheckBox checkBox3, @NonNull CheckBox checkBox4, @NonNull CheckBox checkBox5, @NonNull CheckBox checkBox6, @NonNull C7996d0 d0Var, @NonNull Button button, @NonNull Button button2, @NonNull AppCompatEditText appCompatEditText, @NonNull TextView textView, @NonNull Button button3, @NonNull AppCompatEditText appCompatEditText2, @NonNull TextView textView2) {
        this.f19444a = scrollView;
        this.f19445b = checkBox;
        this.f19446c = checkBox2;
        this.f19447d = checkBox3;
        this.f19448e = checkBox4;
        this.f19449f = checkBox5;
        this.f19450g = checkBox6;
        this.f19451h = d0Var;
        this.f19452i = button;
        this.f19453j = button2;
        this.f19454k = appCompatEditText;
        this.f19455l = textView;
        this.f19456m = button3;
        this.f19457n = appCompatEditText2;
        this.f19458o = textView2;
    }

    @NonNull
    /* renamed from: a */
    public static C8027t m33416a(@NonNull View view) {
        View view2 = view;
        int i = C17532R$id.bufferCrashCheckbox;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view2, C17532R$id.bufferCrashCheckbox);
        if (checkBox != null) {
            i = C17532R$id.bufferEventsCheckbox;
            CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(view2, C17532R$id.bufferEventsCheckbox);
            if (checkBox2 != null) {
                i = C17532R$id.bufferKernelCheckbox;
                CheckBox checkBox3 = (CheckBox) ViewBindings.findChildViewById(view2, C17532R$id.bufferKernelCheckbox);
                if (checkBox3 != null) {
                    i = C17532R$id.bufferMainCheckbox;
                    CheckBox checkBox4 = (CheckBox) ViewBindings.findChildViewById(view2, C17532R$id.bufferMainCheckbox);
                    if (checkBox4 != null) {
                        i = C17532R$id.bufferRadioCheckbox;
                        CheckBox checkBox5 = (CheckBox) ViewBindings.findChildViewById(view2, C17532R$id.bufferRadioCheckbox);
                        if (checkBox5 != null) {
                            i = C17532R$id.bufferSystemCheckbox;
                            CheckBox checkBox6 = (CheckBox) ViewBindings.findChildViewById(view2, C17532R$id.bufferSystemCheckbox);
                            if (checkBox6 != null) {
                                i = C17532R$id.buttonBar;
                                View findChildViewById = ViewBindings.findChildViewById(view2, C17532R$id.buttonBar);
                                if (findChildViewById != null) {
                                    C7996d0 a = C7996d0.m33310a(findChildViewById);
                                    i = C17532R$id.captureMessagesButton;
                                    Button button = (Button) ViewBindings.findChildViewById(view2, C17532R$id.captureMessagesButton);
                                    if (button != null) {
                                        i = C17532R$id.componentMagicTextButton;
                                        Button button2 = (Button) ViewBindings.findChildViewById(view2, C17532R$id.componentMagicTextButton);
                                        if (button2 != null) {
                                            i = C17532R$id.componentName;
                                            AppCompatEditText appCompatEditText = (AppCompatEditText) ViewBindings.findChildViewById(view2, C17532R$id.componentName);
                                            if (appCompatEditText != null) {
                                                i = C17532R$id.enabledBuffers;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view2, C17532R$id.enabledBuffers);
                                                if (textView != null) {
                                                    i = C17532R$id.magicTextButton;
                                                    Button button3 = (Button) ViewBindings.findChildViewById(view2, C17532R$id.magicTextButton);
                                                    if (button3 != null) {
                                                        i = C17532R$id.textToMatch;
                                                        AppCompatEditText appCompatEditText2 = (AppCompatEditText) ViewBindings.findChildViewById(view2, C17532R$id.textToMatch);
                                                        if (appCompatEditText2 != null) {
                                                            i = C17532R$id.wildcard_Text;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C17532R$id.wildcard_Text);
                                                            if (textView2 != null) {
                                                                return new C8027t((ScrollView) view2, checkBox, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, a, button, button2, appCompatEditText, textView, button3, appCompatEditText2, textView2);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    /* renamed from: c */
    public static C8027t m33417c(@NonNull LayoutInflater layoutInflater) {
        return m33418d(layoutInflater, (ViewGroup) null, false);
    }

    @NonNull
    /* renamed from: d */
    public static C8027t m33418d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.dialog_logcat_text_to_match, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33416a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public ScrollView getRoot() {
        return this.f19444a;
    }
}
