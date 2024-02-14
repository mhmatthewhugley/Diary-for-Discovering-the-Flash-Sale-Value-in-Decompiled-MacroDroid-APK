package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.widget.NDSpinner;
import com.google.android.material.textfield.TextInputEditText;

/* renamed from: o1.z */
/* compiled from: FragmentHttpRequestSettingsBinding */
public final class C8034z implements ViewBinding {
    @NonNull

    /* renamed from: A */
    public final ImageButton f19525A;
    @NonNull

    /* renamed from: B */
    public final EditText f19526B;
    @NonNull

    /* renamed from: C */
    public final TextInputEditText f19527C;
    @NonNull

    /* renamed from: D */
    public final Button f19528D;
    @NonNull

    /* renamed from: a */
    private final ScrollView f19529a;
    @NonNull

    /* renamed from: b */
    public final Button f19530b;
    @NonNull

    /* renamed from: c */
    public final Button f19531c;
    @NonNull

    /* renamed from: d */
    public final CheckBox f19532d;
    @NonNull

    /* renamed from: e */
    public final CheckBox f19533e;
    @NonNull

    /* renamed from: f */
    public final EditText f19534f;
    @NonNull

    /* renamed from: g */
    public final Button f19535g;
    @NonNull

    /* renamed from: h */
    public final EditText f19536h;
    @NonNull

    /* renamed from: i */
    public final Button f19537i;
    @NonNull

    /* renamed from: j */
    public final CheckBox f19538j;
    @NonNull

    /* renamed from: k */
    public final RadioButton f19539k;
    @NonNull

    /* renamed from: l */
    public final CheckBox f19540l;
    @NonNull

    /* renamed from: m */
    public final NDSpinner f19541m;
    @NonNull

    /* renamed from: n */
    public final Spinner f19542n;
    @NonNull

    /* renamed from: o */
    public final LinearLayout f19543o;
    @NonNull

    /* renamed from: p */
    public final NDSpinner f19544p;
    @NonNull

    /* renamed from: q */
    public final LinearLayout f19545q;
    @NonNull

    /* renamed from: r */
    public final LinearLayout f19546r;
    @NonNull

    /* renamed from: s */
    public final CheckBox f19547s;
    @NonNull

    /* renamed from: t */
    public final EditText f19548t;
    @NonNull

    /* renamed from: u */
    public final Button f19549u;
    @NonNull

    /* renamed from: v */
    public final RadioButton f19550v;
    @NonNull

    /* renamed from: w */
    public final RadioButton f19551w;
    @NonNull

    /* renamed from: x */
    public final TextView f19552x;
    @NonNull

    /* renamed from: y */
    public final LinearLayout f19553y;
    @NonNull

    /* renamed from: z */
    public final ScrollView f19554z;

    private C8034z(@NonNull ScrollView scrollView, @NonNull Button button, @NonNull Button button2, @NonNull CheckBox checkBox, @NonNull CheckBox checkBox2, @NonNull EditText editText, @NonNull Button button3, @NonNull EditText editText2, @NonNull Button button4, @NonNull CheckBox checkBox3, @NonNull RadioButton radioButton, @NonNull CheckBox checkBox4, @NonNull NDSpinner nDSpinner, @NonNull Spinner spinner, @NonNull LinearLayout linearLayout, @NonNull NDSpinner nDSpinner2, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull CheckBox checkBox5, @NonNull EditText editText3, @NonNull Button button5, @NonNull RadioButton radioButton2, @NonNull RadioButton radioButton3, @NonNull TextView textView, @NonNull LinearLayout linearLayout4, @NonNull ScrollView scrollView2, @NonNull ImageButton imageButton, @NonNull EditText editText4, @NonNull TextInputEditText textInputEditText, @NonNull Button button6) {
        this.f19529a = scrollView;
        this.f19530b = button;
        this.f19531c = button2;
        this.f19532d = checkBox;
        this.f19533e = checkBox2;
        this.f19534f = editText;
        this.f19535g = button3;
        this.f19536h = editText2;
        this.f19537i = button4;
        this.f19538j = checkBox3;
        this.f19539k = radioButton;
        this.f19540l = checkBox4;
        this.f19541m = nDSpinner;
        this.f19542n = spinner;
        this.f19543o = linearLayout;
        this.f19544p = nDSpinner2;
        this.f19545q = linearLayout2;
        this.f19546r = linearLayout3;
        this.f19547s = checkBox5;
        this.f19548t = editText3;
        this.f19549u = button5;
        this.f19550v = radioButton2;
        this.f19551w = radioButton3;
        this.f19552x = textView;
        this.f19553y = linearLayout4;
        this.f19554z = scrollView2;
        this.f19525A = imageButton;
        this.f19526B = editText4;
        this.f19527C = textInputEditText;
        this.f19528D = button6;
    }

    @NonNull
    /* renamed from: a */
    public static C8034z m33438a(@NonNull View view) {
        View view2 = view;
        int i = C17532R$id.addIntegerVariableButton;
        Button button = (Button) ViewBindings.findChildViewById(view2, C17532R$id.addIntegerVariableButton);
        if (button != null) {
            i = C17532R$id.addStringVariableButton;
            Button button2 = (Button) ViewBindings.findChildViewById(view2, C17532R$id.addStringVariableButton);
            if (button2 != null) {
                i = C17532R$id.allowAnyCertificateCheckBox;
                CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view2, C17532R$id.allowAnyCertificateCheckBox);
                if (checkBox != null) {
                    i = C17532R$id.basicAuthCheckbox;
                    CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(view2, C17532R$id.basicAuthCheckbox);
                    if (checkBox2 != null) {
                        i = C17532R$id.basicAuthPassword;
                        EditText editText = (EditText) ViewBindings.findChildViewById(view2, C17532R$id.basicAuthPassword);
                        if (editText != null) {
                            i = C17532R$id.basicAuthPasswordMagicTextButton;
                            Button button3 = (Button) ViewBindings.findChildViewById(view2, C17532R$id.basicAuthPasswordMagicTextButton);
                            if (button3 != null) {
                                i = C17532R$id.basicAuthUsername;
                                EditText editText2 = (EditText) ViewBindings.findChildViewById(view2, C17532R$id.basicAuthUsername);
                                if (editText2 != null) {
                                    i = C17532R$id.basicAuthUsernameMagicTextButton;
                                    Button button4 = (Button) ViewBindings.findChildViewById(view2, C17532R$id.basicAuthUsernameMagicTextButton);
                                    if (button4 != null) {
                                        i = C17532R$id.blockNextActionCheckBox;
                                        CheckBox checkBox3 = (CheckBox) ViewBindings.findChildViewById(view2, C17532R$id.blockNextActionCheckBox);
                                        if (checkBox3 != null) {
                                            i = C17532R$id.dontSaveResponseRadioButton;
                                            RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view2, C17532R$id.dontSaveResponseRadioButton);
                                            if (radioButton != null) {
                                                i = C17532R$id.followRedirectsCheckbox;
                                                CheckBox checkBox4 = (CheckBox) ViewBindings.findChildViewById(view2, C17532R$id.followRedirectsCheckbox);
                                                if (checkBox4 != null) {
                                                    i = C17532R$id.httpResponseVariableSpinner;
                                                    NDSpinner nDSpinner = (NDSpinner) ViewBindings.findChildViewById(view2, C17532R$id.httpResponseVariableSpinner);
                                                    if (nDSpinner != null) {
                                                        i = C17532R$id.requestTypeSpinner;
                                                        Spinner spinner = (Spinner) ViewBindings.findChildViewById(view2, C17532R$id.requestTypeSpinner);
                                                        if (spinner != null) {
                                                            i = C17532R$id.responseCodeSelectionLayout;
                                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view2, C17532R$id.responseCodeSelectionLayout);
                                                            if (linearLayout != null) {
                                                                i = C17532R$id.responseCodeVariableSpinner;
                                                                NDSpinner nDSpinner2 = (NDSpinner) ViewBindings.findChildViewById(view2, C17532R$id.responseCodeVariableSpinner);
                                                                if (nDSpinner2 != null) {
                                                                    i = C17532R$id.responseFileLayout;
                                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view2, C17532R$id.responseFileLayout);
                                                                    if (linearLayout2 != null) {
                                                                        i = C17532R$id.responseVariableLayout;
                                                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view2, C17532R$id.responseVariableLayout);
                                                                        if (linearLayout3 != null) {
                                                                            i = C17532R$id.saveHttpResponseCodeCheckbox;
                                                                            CheckBox checkBox5 = (CheckBox) ViewBindings.findChildViewById(view2, C17532R$id.saveHttpResponseCodeCheckbox);
                                                                            if (checkBox5 != null) {
                                                                                i = C17532R$id.saveResponseFilename;
                                                                                EditText editText3 = (EditText) ViewBindings.findChildViewById(view2, C17532R$id.saveResponseFilename);
                                                                                if (editText3 != null) {
                                                                                    i = C17532R$id.saveResponseFilenameMagicTextButton;
                                                                                    Button button5 = (Button) ViewBindings.findChildViewById(view2, C17532R$id.saveResponseFilenameMagicTextButton);
                                                                                    if (button5 != null) {
                                                                                        i = C17532R$id.saveResponseInFileRadioButton;
                                                                                        RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view2, C17532R$id.saveResponseInFileRadioButton);
                                                                                        if (radioButton2 != null) {
                                                                                            i = C17532R$id.saveResponseInVariableRadioButton;
                                                                                            RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view2, C17532R$id.saveResponseInVariableRadioButton);
                                                                                            if (radioButton3 != null) {
                                                                                                i = C17532R$id.saveResponsePath;
                                                                                                TextView textView = (TextView) ViewBindings.findChildViewById(view2, C17532R$id.saveResponsePath);
                                                                                                if (textView != null) {
                                                                                                    i = C17532R$id.saveResponsePathLayout;
                                                                                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view2, C17532R$id.saveResponsePathLayout);
                                                                                                    if (linearLayout4 != null) {
                                                                                                        ScrollView scrollView = (ScrollView) view2;
                                                                                                        i = C17532R$id.selectFolderButton;
                                                                                                        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view2, C17532R$id.selectFolderButton);
                                                                                                        if (imageButton != null) {
                                                                                                            i = C17532R$id.timeoutSecondsText;
                                                                                                            EditText editText4 = (EditText) ViewBindings.findChildViewById(view2, C17532R$id.timeoutSecondsText);
                                                                                                            if (editText4 != null) {
                                                                                                                i = 2131364162;
                                                                                                                TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view2, 2131364162);
                                                                                                                if (textInputEditText != null) {
                                                                                                                    i = C17532R$id.urlMagicTextButton;
                                                                                                                    Button button6 = (Button) ViewBindings.findChildViewById(view2, C17532R$id.urlMagicTextButton);
                                                                                                                    if (button6 != null) {
                                                                                                                        return new C8034z(scrollView, button, button2, checkBox, checkBox2, editText, button3, editText2, button4, checkBox3, radioButton, checkBox4, nDSpinner, spinner, linearLayout, nDSpinner2, linearLayout2, linearLayout3, checkBox5, editText3, button5, radioButton2, radioButton3, textView, linearLayout4, scrollView, imageButton, editText4, textInputEditText, button6);
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
    public static C8034z m33439c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.fragment_http_request_settings, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33438a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public ScrollView getRoot() {
        return this.f19529a;
    }
}
