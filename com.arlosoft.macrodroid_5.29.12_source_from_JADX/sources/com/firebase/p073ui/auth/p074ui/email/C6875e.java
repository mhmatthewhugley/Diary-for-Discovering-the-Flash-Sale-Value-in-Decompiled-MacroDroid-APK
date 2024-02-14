package com.firebase.p073ui.auth.p074ui.email;

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
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.firebase.p073ui.auth.FirebaseAuthAnonymousUpgradeException;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.R$id;
import com.firebase.p073ui.auth.R$integer;
import com.firebase.p073ui.auth.R$layout;
import com.firebase.p073ui.auth.R$plurals;
import com.firebase.p073ui.auth.R$string;
import com.firebase.p073ui.auth.data.model.User;
import com.firebase.p073ui.auth.util.p075ui.C6898c;
import com.firebase.p073ui.auth.viewmodel.C6905d;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;
import p138n5.C7985a;
import p159r5.C8205f;
import p159r5.C8207h;
import p165s5.C10233a;
import p165s5.C10234b;
import p165s5.C10235c;
import p165s5.C10236d;
import p165s5.C10237e;
import p170t5.C10266c;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.ui.email.e */
/* compiled from: RegisterEmailFragment */
public class C6875e extends C7985a implements View.OnClickListener, View.OnFocusChangeListener, C6898c.C6900b {

    /* renamed from: A */
    private C10234b f16061A;

    /* renamed from: B */
    private C10236d f16062B;

    /* renamed from: C */
    private C10233a f16063C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C6878c f16064D;

    /* renamed from: E */
    private User f16065E;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C10266c f16066c;

    /* renamed from: d */
    private Button f16067d;

    /* renamed from: f */
    private ProgressBar f16068f;

    /* renamed from: g */
    private EditText f16069g;

    /* renamed from: o */
    private EditText f16070o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public EditText f16071p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public TextInputLayout f16072s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public TextInputLayout f16073z;

    /* renamed from: com.firebase.ui.auth.ui.email.e$a */
    /* compiled from: RegisterEmailFragment */
    class C6876a extends C6905d<IdpResponse> {
        C6876a(C7985a aVar, int i) {
            super(aVar, i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo34115b(@NonNull Exception exc) {
            if (exc instanceof FirebaseAuthWeakPasswordException) {
                C6875e.this.f16073z.setError(C6875e.this.getResources().getQuantityString(R$plurals.fui_error_weak_password, R$integer.fui_min_password_length));
            } else if (exc instanceof FirebaseAuthInvalidCredentialsException) {
                C6875e.this.f16072s.setError(C6875e.this.getString(R$string.fui_invalid_email_address));
            } else if (exc instanceof FirebaseAuthAnonymousUpgradeException) {
                C6875e.this.f16064D.mo34194y(((FirebaseAuthAnonymousUpgradeException) exc).mo34081a());
            } else {
                C6875e.this.f16072s.setError(C6875e.this.getString(R$string.fui_email_account_creation_error));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo34116c(@NonNull IdpResponse idpResponse) {
            C6875e eVar = C6875e.this;
            eVar.mo37888V(eVar.f16066c.mo34266m(), idpResponse, C6875e.this.f16071p.getText().toString());
        }
    }

    /* renamed from: com.firebase.ui.auth.ui.email.e$b */
    /* compiled from: RegisterEmailFragment */
    class C6877b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f16075a;

        C6877b(View view) {
            this.f16075a = view;
        }

        public void run() {
            this.f16075a.requestFocus();
        }
    }

    /* renamed from: com.firebase.ui.auth.ui.email.e$c */
    /* compiled from: RegisterEmailFragment */
    interface C6878c {
        /* renamed from: y */
        void mo34194y(IdpResponse idpResponse);
    }

    /* renamed from: f0 */
    public static C6875e m25959f0(User user) {
        C6875e eVar = new C6875e();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_user", user);
        eVar.setArguments(bundle);
        return eVar;
    }

    /* renamed from: g0 */
    private void m25960g0(View view) {
        view.post(new C6877b(view));
    }

    /* renamed from: h0 */
    private void m25961h0() {
        String obj = this.f16069g.getText().toString();
        String obj2 = this.f16071p.getText().toString();
        String obj3 = this.f16070o.getText().toString();
        boolean b = this.f16061A.mo40845b(obj);
        boolean b2 = this.f16062B.mo40845b(obj2);
        boolean b3 = this.f16063C.mo40845b(obj3);
        if (b && b2 && b3) {
            this.f16066c.mo40880G(new IdpResponse.C6845b(new User.C6853b("password", obj).mo34172b(obj3).mo34174d(this.f16065E.mo34160c()).mo34171a()).mo34109a(), obj2);
        }
    }

    /* renamed from: E */
    public void mo34183E() {
        this.f16067d.setEnabled(true);
        this.f16068f.setVisibility(4);
    }

    /* renamed from: b1 */
    public void mo34184b1(int i) {
        this.f16067d.setEnabled(false);
        this.f16068f.setVisibility(0);
    }

    /* renamed from: j1 */
    public void mo34200j1() {
        m25961h0();
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity requireActivity = requireActivity();
        requireActivity.setTitle(R$string.fui_title_register_email);
        if (requireActivity instanceof C6878c) {
            this.f16064D = (C6878c) requireActivity;
            return;
        }
        throw new IllegalStateException("Activity must implement CheckEmailListener");
    }

    public void onClick(View view) {
        if (view.getId() == R$id.button_create) {
            m25961h0();
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f16065E = User.m25817f(getArguments());
        } else {
            this.f16065E = User.m25817f(bundle);
        }
        C10266c cVar = (C10266c) new ViewModelProvider(this).get(C10266c.class);
        this.f16066c = cVar;
        cVar.mo34278g(mo37887U());
        this.f16066c.mo34267i().observe(this, new C6876a(this, R$string.fui_progress_dialog_signing_up));
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R$layout.fui_register_email_layout, viewGroup, false);
    }

    public void onFocusChange(View view, boolean z) {
        if (!z) {
            int id = view.getId();
            if (id == R$id.email) {
                this.f16061A.mo40845b(this.f16069g.getText());
            } else if (id == R$id.name) {
                this.f16063C.mo40845b(this.f16070o.getText());
            } else if (id == R$id.password) {
                this.f16062B.mo40845b(this.f16071p.getText());
            }
        }
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        bundle.putParcelable("extra_user", new User.C6853b("password", this.f16069g.getText().toString()).mo34172b(this.f16070o.getText().toString()).mo34174d(this.f16065E.mo34160c()).mo34171a());
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        this.f16067d = (Button) view.findViewById(R$id.button_create);
        this.f16068f = (ProgressBar) view.findViewById(R$id.top_progress_bar);
        this.f16069g = (EditText) view.findViewById(R$id.email);
        this.f16070o = (EditText) view.findViewById(R$id.name);
        this.f16071p = (EditText) view.findViewById(R$id.password);
        this.f16072s = (TextInputLayout) view.findViewById(R$id.email_layout);
        this.f16073z = (TextInputLayout) view.findViewById(R$id.password_layout);
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R$id.name_layout);
        boolean z = C8207h.m34079f(mo37887U().f15985c, "password").mo34056a().getBoolean("extra_require_name", true);
        this.f16062B = new C10236d(this.f16073z, getResources().getInteger(R$integer.fui_min_password_length));
        this.f16063C = z ? new C10237e(textInputLayout, getResources().getString(R$string.fui_missing_first_and_last_name)) : new C10235c(textInputLayout);
        this.f16061A = new C10234b(this.f16072s);
        C6898c.m26058a(this.f16071p, this);
        this.f16069g.setOnFocusChangeListener(this);
        this.f16070o.setOnFocusChangeListener(this);
        this.f16071p.setOnFocusChangeListener(this);
        this.f16067d.setOnClickListener(this);
        textInputLayout.setVisibility(z ? 0 : 8);
        if (Build.VERSION.SDK_INT >= 26 && mo37887U().f15978A) {
            this.f16069g.setImportantForAutofill(2);
        }
        C8205f.m34072f(requireContext(), mo37887U(), (TextView) view.findViewById(R$id.email_footer_tos_and_pp_text));
        if (bundle == null) {
            String a = this.f16065E.mo34158a();
            if (!TextUtils.isEmpty(a)) {
                this.f16069g.setText(a);
            }
            String b = this.f16065E.mo34159b();
            if (!TextUtils.isEmpty(b)) {
                this.f16070o.setText(b);
            }
            if (!z || !TextUtils.isEmpty(this.f16070o.getText())) {
                m25960g0(this.f16071p);
            } else if (!TextUtils.isEmpty(this.f16069g.getText())) {
                m25960g0(this.f16070o);
            } else {
                m25960g0(this.f16069g);
            }
        }
    }
}
