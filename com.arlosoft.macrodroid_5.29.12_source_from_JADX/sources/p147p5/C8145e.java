package p147p5;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.R$id;
import com.firebase.p073ui.auth.R$layout;
import com.firebase.p073ui.auth.R$string;
import com.firebase.p073ui.auth.p074ui.phone.SpacedEditText;
import com.firebase.p073ui.auth.util.p075ui.C6895a;
import java.util.concurrent.TimeUnit;
import org.apache.commons.cli.HelpFormatter;
import p127l5.C7688b;
import p127l5.C7689c;
import p138n5.C7985a;
import p159r5.C8205f;
import p180v5.C10323a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: p5.e */
/* compiled from: SubmitConfirmationCodeFragment */
public class C8145e extends C7985a {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public SpacedEditText f19770A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public long f19771B = 60000;

    /* renamed from: C */
    private boolean f19772C;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Handler f19773c = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Runnable f19774d = new C8146a();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C8142c f19775f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f19776g;

    /* renamed from: o */
    private ProgressBar f19777o;

    /* renamed from: p */
    private TextView f19778p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public TextView f19779s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public TextView f19780z;

    /* renamed from: p5.e$a */
    /* compiled from: SubmitConfirmationCodeFragment */
    class C8146a implements Runnable {
        C8146a() {
        }

        public void run() {
            C8145e.this.m33842n0();
        }
    }

    /* renamed from: p5.e$b */
    /* compiled from: SubmitConfirmationCodeFragment */
    class C8147b implements Observer<C7688b<IdpResponse>> {
        C8147b() {
        }

        /* renamed from: a */
        public void onChanged(@Nullable C7688b<IdpResponse> bVar) {
            if (bVar.mo37733e() == C7689c.FAILURE) {
                C8145e.this.f19770A.setText("");
            }
        }
    }

    /* renamed from: p5.e$c */
    /* compiled from: SubmitConfirmationCodeFragment */
    class C8148c implements C6895a.C6896a {
        C8148c() {
        }

        /* renamed from: a */
        public void mo34260a() {
        }

        /* renamed from: b */
        public void mo34261b() {
            C8145e.this.m33846r0();
        }
    }

    /* renamed from: p5.e$d */
    /* compiled from: SubmitConfirmationCodeFragment */
    class C8149d implements View.OnClickListener {
        C8149d() {
        }

        public void onClick(View view) {
            C8145e.this.requireActivity().getSupportFragmentManager().popBackStack();
        }
    }

    /* renamed from: p5.e$e */
    /* compiled from: SubmitConfirmationCodeFragment */
    class C8150e implements View.OnClickListener {
        C8150e() {
        }

        public void onClick(View view) {
            C8145e.this.f19775f.mo38156v(C8145e.this.requireActivity(), C8145e.this.f19776g, true);
            C8145e.this.f19779s.setVisibility(8);
            C8145e.this.f19780z.setVisibility(0);
            C8145e.this.f19780z.setText(String.format(C8145e.this.getString(R$string.fui_resend_code_in), new Object[]{60L}));
            long unused = C8145e.this.f19771B = 60000;
            C8145e.this.f19773c.postDelayed(C8145e.this.f19774d, 500);
        }
    }

    /* renamed from: m0 */
    public static C8145e m33841m0(String str) {
        C8145e eVar = new C8145e();
        Bundle bundle = new Bundle();
        bundle.putString("extra_phone_number", str);
        eVar.setArguments(bundle);
        return eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public void m33842n0() {
        long j = this.f19771B - 500;
        this.f19771B = j;
        if (j <= 0) {
            this.f19780z.setText("");
            this.f19780z.setVisibility(8);
            this.f19779s.setVisibility(0);
            return;
        }
        this.f19780z.setText(String.format(getString(R$string.fui_resend_code_in), new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.f19771B) + 1)}));
        this.f19773c.postDelayed(this.f19774d, 500);
    }

    /* renamed from: o0 */
    private void m33843o0() {
        this.f19770A.setText("------");
        SpacedEditText spacedEditText = this.f19770A;
        spacedEditText.addTextChangedListener(new C6895a(spacedEditText, 6, HelpFormatter.DEFAULT_OPT_PREFIX, new C8148c()));
    }

    /* renamed from: p0 */
    private void m33844p0() {
        this.f19778p.setText(this.f19776g);
        this.f19778p.setOnClickListener(new C8149d());
    }

    /* renamed from: q0 */
    private void m33845q0() {
        this.f19779s.setOnClickListener(new C8150e());
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public void m33846r0() {
        this.f19775f.mo38155u(this.f19776g, this.f19770A.getUnspacedText().toString());
    }

    /* renamed from: E */
    public void mo34183E() {
        this.f19777o.setVisibility(4);
    }

    /* renamed from: b1 */
    public void mo34184b1(int i) {
        this.f19777o.setVisibility(0);
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        ((C10323a) new ViewModelProvider(requireActivity()).get(C10323a.class)).mo34267i().observe(getViewLifecycleOwner(), new C8147b());
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f19775f = (C8142c) new ViewModelProvider(requireActivity()).get(C8142c.class);
        this.f19776g = getArguments().getString("extra_phone_number");
        if (bundle != null) {
            this.f19771B = bundle.getLong("millis_until_finished");
        }
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R$layout.fui_confirmation_code_layout, viewGroup, false);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f19773c.removeCallbacks(this.f19774d);
    }

    public void onResume() {
        CharSequence text;
        super.onResume();
        if (!this.f19772C) {
            this.f19772C = true;
            return;
        }
        ClipData primaryClip = ((ClipboardManager) ContextCompat.getSystemService(requireContext(), ClipboardManager.class)).getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() == 1 && (text = primaryClip.getItemAt(0).getText()) != null && text.length() == 6) {
            try {
                Integer.parseInt(text.toString());
                this.f19770A.setText(text);
            } catch (NumberFormatException unused) {
            }
        }
        this.f19773c.removeCallbacks(this.f19774d);
        this.f19773c.postDelayed(this.f19774d, 500);
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        this.f19773c.removeCallbacks(this.f19774d);
        bundle.putLong("millis_until_finished", this.f19771B);
    }

    public void onStart() {
        super.onStart();
        this.f19770A.requestFocus();
        ((InputMethodManager) requireActivity().getSystemService("input_method")).showSoftInput(this.f19770A, 0);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        this.f19777o = (ProgressBar) view.findViewById(R$id.top_progress_bar);
        this.f19778p = (TextView) view.findViewById(R$id.edit_phone_number);
        this.f19780z = (TextView) view.findViewById(R$id.ticker);
        this.f19779s = (TextView) view.findViewById(R$id.resend_code);
        this.f19770A = (SpacedEditText) view.findViewById(R$id.confirmation_code);
        requireActivity().setTitle(getString(R$string.fui_verify_your_phone_title));
        m33842n0();
        m33843o0();
        m33844p0();
        m33845q0();
        C8205f.m34072f(requireContext(), mo37887U(), (TextView) view.findViewById(R$id.email_footer_tos_and_pp_text));
    }
}
