package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;

/* renamed from: o1.x */
/* compiled from: FragmentHttpRequestContentBodyBinding */
public final class C8032x implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final ViewFlipper f19508a;
    @NonNull

    /* renamed from: b */
    public final LinearLayout f19509b;
    @NonNull

    /* renamed from: c */
    public final TextView f19510c;
    @NonNull

    /* renamed from: d */
    public final Button f19511d;
    @NonNull

    /* renamed from: e */
    public final LinearLayout f19512e;
    @NonNull

    /* renamed from: f */
    public final AppCompatEditText f19513f;
    @NonNull

    /* renamed from: g */
    public final EditText f19514g;
    @NonNull

    /* renamed from: h */
    public final Spinner f19515h;
    @NonNull

    /* renamed from: i */
    public final RadioButton f19516i;
    @NonNull

    /* renamed from: j */
    public final RadioButton f19517j;
    @NonNull

    /* renamed from: k */
    public final ImageButton f19518k;
    @NonNull

    /* renamed from: l */
    public final ViewFlipper f19519l;

    private C8032x(@NonNull ViewFlipper viewFlipper, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull Button button, @NonNull LinearLayout linearLayout2, @NonNull AppCompatEditText appCompatEditText, @NonNull EditText editText, @NonNull Spinner spinner, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull ImageButton imageButton, @NonNull ViewFlipper viewFlipper2) {
        this.f19508a = viewFlipper;
        this.f19509b = linearLayout;
        this.f19510c = textView;
        this.f19511d = button;
        this.f19512e = linearLayout2;
        this.f19513f = appCompatEditText;
        this.f19514g = editText;
        this.f19515h = spinner;
        this.f19516i = radioButton;
        this.f19517j = radioButton2;
        this.f19518k = imageButton;
        this.f19519l = viewFlipper2;
    }

    @NonNull
    /* renamed from: a */
    public static C8032x m33432a(@NonNull View view) {
        int i = C17532R$id.bodyFileLayout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, C17532R$id.bodyFileLayout);
        if (linearLayout != null) {
            i = C17532R$id.bodyFilePath;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, C17532R$id.bodyFilePath);
            if (textView != null) {
                i = C17532R$id.bodyMagicTextButton;
                Button button = (Button) ViewBindings.findChildViewById(view, C17532R$id.bodyMagicTextButton);
                if (button != null) {
                    i = C17532R$id.bodyTextLayout;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, C17532R$id.bodyTextLayout);
                    if (linearLayout2 != null) {
                        i = C17532R$id.contentBodyText;
                        AppCompatEditText appCompatEditText = (AppCompatEditText) ViewBindings.findChildViewById(view, C17532R$id.contentBodyText);
                        if (appCompatEditText != null) {
                            i = C17532R$id.contentTypeCustom;
                            EditText editText = (EditText) ViewBindings.findChildViewById(view, C17532R$id.contentTypeCustom);
                            if (editText != null) {
                                i = C17532R$id.contentTypeSpinner;
                                Spinner spinner = (Spinner) ViewBindings.findChildViewById(view, C17532R$id.contentTypeSpinner);
                                if (spinner != null) {
                                    i = C17532R$id.radioButtonFile;
                                    RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, C17532R$id.radioButtonFile);
                                    if (radioButton != null) {
                                        i = C17532R$id.radioButtonText;
                                        RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, C17532R$id.radioButtonText);
                                        if (radioButton2 != null) {
                                            i = C17532R$id.selectFileButton;
                                            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, C17532R$id.selectFileButton);
                                            if (imageButton != null) {
                                                ViewFlipper viewFlipper = (ViewFlipper) view;
                                                return new C8032x(viewFlipper, linearLayout, textView, button, linearLayout2, appCompatEditText, editText, spinner, radioButton, radioButton2, imageButton, viewFlipper);
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
    public static C8032x m33433c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.fragment_http_request_content_body, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33432a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public ViewFlipper getRoot() {
        return this.f19508a;
    }
}
