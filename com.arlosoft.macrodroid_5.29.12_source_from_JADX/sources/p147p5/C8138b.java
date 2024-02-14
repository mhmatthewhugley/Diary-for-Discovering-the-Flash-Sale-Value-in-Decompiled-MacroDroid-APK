package p147p5;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.ViewModelProvider;
import com.firebase.p073ui.auth.R$id;
import com.firebase.p073ui.auth.R$layout;
import com.firebase.p073ui.auth.R$string;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.p074ui.phone.CountryListSpinner;
import com.firebase.p073ui.auth.util.p075ui.C6898c;
import com.firebase.p073ui.auth.viewmodel.C6905d;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;
import p127l5.C7687a;
import p138n5.C7985a;
import p159r5.C8204e;
import p159r5.C8205f;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: p5.b */
/* compiled from: CheckPhoneNumberFragment */
public class C8138b extends C7985a implements View.OnClickListener {

    /* renamed from: A */
    private TextView f19750A;

    /* renamed from: B */
    private TextView f19751B;

    /* renamed from: c */
    private C8142c f19752c;

    /* renamed from: d */
    private C8137a f19753d;

    /* renamed from: f */
    private boolean f19754f;

    /* renamed from: g */
    private ProgressBar f19755g;

    /* renamed from: o */
    private Button f19756o;

    /* renamed from: p */
    private CountryListSpinner f19757p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public TextInputLayout f19758s;

    /* renamed from: z */
    private EditText f19759z;

    /* renamed from: p5.b$a */
    /* compiled from: CheckPhoneNumberFragment */
    class C8139a implements C6898c.C6900b {
        C8139a() {
        }

        /* renamed from: j1 */
        public void mo34200j1() {
            C8138b.this.m33804f0();
        }
    }

    /* renamed from: p5.b$b */
    /* compiled from: CheckPhoneNumberFragment */
    class C8140b extends C6905d<C7687a> {
        C8140b(C7985a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo34115b(@NonNull Exception exc) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo34116c(@NonNull C7687a aVar) {
            C8138b.this.m33809m0(aVar);
        }
    }

    /* renamed from: p5.b$c */
    /* compiled from: CheckPhoneNumberFragment */
    class C8141c implements View.OnClickListener {
        C8141c() {
        }

        public void onClick(View view) {
            C8138b.this.f19758s.setError((CharSequence) null);
        }
    }

    @Nullable
    /* renamed from: a0 */
    private String m33802a0() {
        String obj = this.f19759z.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            return null;
        }
        return C8204e.m34049b(obj, this.f19757p.getSelectedCountryInfo());
    }

    /* renamed from: e0 */
    public static C8138b m33803e0(Bundle bundle) {
        C8138b bVar = new C8138b();
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("extra_params", bundle);
        bVar.setArguments(bundle2);
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public void m33804f0() {
        String a0 = m33802a0();
        if (a0 == null) {
            this.f19758s.setError(getString(R$string.fui_invalid_phone_number));
        } else {
            this.f19752c.mo38156v(requireActivity(), a0, false);
        }
    }

    /* renamed from: g0 */
    private void m33805g0(C7687a aVar) {
        this.f19757p.mo34238t(new Locale("", aVar.mo37730b()), aVar.mo37729a());
    }

    /* renamed from: h0 */
    private void m33806h0() {
        String str;
        String str2;
        Bundle bundle = getArguments().getBundle("extra_params");
        String str3 = null;
        if (bundle != null) {
            str3 = bundle.getString("extra_phone_number");
            str = bundle.getString("extra_country_iso");
            str2 = bundle.getString("extra_national_number");
        } else {
            str2 = null;
            str = null;
        }
        if (!TextUtils.isEmpty(str3)) {
            m33809m0(C8204e.m34059l(str3));
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            m33809m0(C8204e.m34060m(str, str2));
        } else if (!TextUtils.isEmpty(str)) {
            m33805g0(new C7687a("", str, String.valueOf(C8204e.m34051d(str))));
        } else if (mo37887U().f15979B) {
            this.f19753d.mo38148n();
        }
    }

    /* renamed from: i0 */
    private void m33807i0() {
        this.f19757p.mo34233p(getArguments().getBundle("extra_params"));
        this.f19757p.setOnClickListener(new C8141c());
    }

    /* renamed from: j0 */
    private void m33808j0() {
        FlowParameters U = mo37887U();
        boolean z = U.mo34146h() && U.mo34143e();
        if (U.mo34147i() || !z) {
            C8205f.m34072f(requireContext(), U, this.f19751B);
            this.f19750A.setText(getString(R$string.fui_sms_terms_of_service, getString(R$string.fui_verify_phone_number)));
            return;
        }
        C8205f.m34070d(requireContext(), U, this.f19750A);
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public void m33809m0(C7687a aVar) {
        if (!C7687a.m32054e(aVar)) {
            this.f19758s.setError(getString(R$string.fui_invalid_phone_number));
            return;
        }
        this.f19759z.setText(aVar.mo37731c());
        this.f19759z.setSelection(aVar.mo37731c().length());
        String b = aVar.mo37730b();
        if (C7687a.m32053d(aVar) && this.f19757p.mo34234r(b)) {
            m33805g0(aVar);
            m33804f0();
        }
    }

    /* renamed from: E */
    public void mo34183E() {
        this.f19756o.setEnabled(true);
        this.f19755g.setVisibility(4);
    }

    /* renamed from: b1 */
    public void mo34184b1(int i) {
        this.f19756o.setEnabled(false);
        this.f19755g.setVisibility(0);
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f19753d.mo34267i().observe(getViewLifecycleOwner(), new C8140b(this));
        if (bundle == null && !this.f19754f) {
            this.f19754f = true;
            m33806h0();
        }
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        this.f19753d.mo38149o(i, i2, intent);
    }

    public void onClick(View view) {
        m33804f0();
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f19752c = (C8142c) new ViewModelProvider(requireActivity()).get(C8142c.class);
        this.f19753d = (C8137a) new ViewModelProvider(this).get(C8137a.class);
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R$layout.fui_phone_layout, viewGroup, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        this.f19755g = (ProgressBar) view.findViewById(R$id.top_progress_bar);
        this.f19756o = (Button) view.findViewById(R$id.send_code);
        this.f19757p = (CountryListSpinner) view.findViewById(R$id.country_list);
        this.f19758s = (TextInputLayout) view.findViewById(R$id.phone_layout);
        this.f19759z = (EditText) view.findViewById(R$id.phone_number);
        this.f19750A = (TextView) view.findViewById(R$id.send_sms_tos);
        this.f19751B = (TextView) view.findViewById(R$id.email_footer_tos_and_pp_text);
        this.f19750A.setText(getString(R$string.fui_sms_terms_of_service, getString(R$string.fui_verify_phone_number)));
        if (Build.VERSION.SDK_INT >= 26 && mo37887U().f15979B) {
            this.f19759z.setImportantForAutofill(2);
        }
        requireActivity().setTitle(getString(R$string.fui_verify_phone_number_title));
        C6898c.m26058a(this.f19759z, new C8139a());
        this.f19756o.setOnClickListener(this);
        m33808j0();
        m33807i0();
    }
}
