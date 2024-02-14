package com.arlosoft.macrodroid.drawer.p069ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ArrayRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.DialogFragment;
import com.thebluealliance.spectrum.SpectrumPalette;

/* renamed from: com.arlosoft.macrodroid.drawer.ui.e1 */
/* compiled from: SpectrumDialogOverlay */
public class C4495e1 extends DialogFragment implements SpectrumPalette.C11762a {

    /* renamed from: A */
    private int f11442A = -1;

    /* renamed from: B */
    private int f11443B = 0;

    /* renamed from: a */
    private CharSequence f11444a;

    /* renamed from: c */
    private CharSequence f11445c;

    /* renamed from: d */
    private CharSequence f11446d;
    @ColorInt

    /* renamed from: f */
    private int[] f11447f;
    /* access modifiers changed from: private */
    @ColorInt

    /* renamed from: g */
    public int f11448g = -1;
    /* access modifiers changed from: private */
    @ColorInt

    /* renamed from: o */
    public int f11449o = -1;

    /* renamed from: p */
    private boolean f11450p = true;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C4499d f11451s;

    /* renamed from: z */
    private int f11452z = 0;

    /* renamed from: com.arlosoft.macrodroid.drawer.ui.e1$a */
    /* compiled from: SpectrumDialogOverlay */
    class C4496a implements DialogInterface.OnClickListener {
        C4496a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (C4495e1.this.f11451s != null) {
                C4495e1.this.f11451s.mo28912a(true, C4495e1.this.f11449o);
            }
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.drawer.ui.e1$b */
    /* compiled from: SpectrumDialogOverlay */
    class C4497b implements DialogInterface.OnClickListener {
        C4497b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (C4495e1.this.f11451s != null) {
                C4495e1.this.f11451s.mo28912a(false, C4495e1.this.f11448g);
            }
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.drawer.ui.e1$c */
    /* compiled from: SpectrumDialogOverlay */
    public static class C4498c {

        /* renamed from: a */
        private Context f11455a;

        /* renamed from: b */
        private Bundle f11456b = new Bundle();

        /* renamed from: c */
        private C4499d f11457c;

        public C4498c(Context context) {
            this.f11455a = context;
        }

        /* renamed from: a */
        public C4495e1 mo28905a() {
            C4495e1 e1Var = new C4495e1();
            e1Var.setArguments(this.f11456b);
            e1Var.mo28901X(this.f11457c);
            return e1Var;
        }

        /* renamed from: b */
        public C4498c mo28906b(@ArrayRes int i) {
            this.f11456b.putIntArray("colors", this.f11455a.getResources().getIntArray(i));
            return this;
        }

        /* renamed from: c */
        public C4498c mo28907c(boolean z) {
            this.f11456b.putBoolean("should_dismiss_on_color_selected", z);
            return this;
        }

        /* renamed from: d */
        public C4498c mo28908d(C4499d dVar) {
            this.f11457c = dVar;
            return this;
        }

        /* renamed from: e */
        public C4498c mo28909e(int i) {
            this.f11456b.putInt("border_width", i);
            return this;
        }

        /* renamed from: f */
        public C4498c mo28910f(@ColorInt int i) {
            this.f11456b.putInt("selected_color", i);
            this.f11456b.putInt("origina_selected_color", i);
            return this;
        }

        /* renamed from: g */
        public C4498c mo28911g(@StringRes int i) {
            this.f11456b.putCharSequence("title", this.f11455a.getText(i));
            return this;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.drawer.ui.e1$d */
    /* compiled from: SpectrumDialogOverlay */
    public interface C4499d {
        /* renamed from: a */
        void mo28912a(boolean z, @ColorInt int i);
    }

    /* renamed from: X */
    public void mo28901X(C4499d dVar) {
        this.f11451s = dVar;
    }

    /* renamed from: f */
    public void mo28902f(@ColorInt int i) {
        this.f11449o = i;
        if (this.f11450p) {
            C4499d dVar = this.f11451s;
            if (dVar != null) {
                dVar.mo28912a(true, i);
            }
            dismiss();
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        C4499d dVar = this.f11451s;
        if (dVar != null) {
            dVar.mo28912a(false, this.f11448g);
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey("title")) {
            this.f11444a = getContext().getText(2131953011);
        } else {
            this.f11444a = arguments.getCharSequence("title");
        }
        if (arguments == null || !arguments.containsKey("colors")) {
            this.f11447f = new int[]{-16777216};
        } else {
            this.f11447f = arguments.getIntArray("colors");
        }
        int[] iArr = this.f11447f;
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("SpectrumDialog must be created with an array of colors");
        }
        if (arguments == null || !arguments.containsKey("selected_color")) {
            this.f11449o = this.f11447f[0];
        } else {
            this.f11449o = arguments.getInt("selected_color");
        }
        if (arguments == null || !arguments.containsKey("origina_selected_color")) {
            this.f11448g = this.f11449o;
        } else {
            this.f11448g = arguments.getInt("origina_selected_color");
        }
        if (arguments == null || !arguments.containsKey("should_dismiss_on_color_selected")) {
            this.f11450p = true;
        } else {
            this.f11450p = arguments.getBoolean("should_dismiss_on_color_selected");
        }
        if (arguments == null || !arguments.containsKey("positive_button_text")) {
            this.f11445c = getContext().getText(17039370);
        } else {
            this.f11445c = arguments.getCharSequence("positive_button_text");
        }
        if (arguments == null || !arguments.containsKey("negative_button_text")) {
            this.f11446d = getContext().getText(17039360);
        } else {
            this.f11446d = arguments.getCharSequence("negative_button_text");
        }
        if (arguments != null && arguments.containsKey("border_width")) {
            this.f11452z = arguments.getInt("border_width");
        }
        if (arguments != null && arguments.containsKey("fixed_column_count")) {
            this.f11442A = arguments.getInt("fixed_column_count");
        }
        if (arguments != null && arguments.containsKey("theme_res_id")) {
            this.f11443B = arguments.getInt("theme_res_id");
        }
        if (bundle != null && bundle.containsKey("selected_color")) {
            this.f11449o = bundle.getInt("selected_color");
        }
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder;
        if (this.f11443B != 0) {
            builder = new AlertDialog.Builder(getContext(), this.f11443B);
        } else {
            builder = new AlertDialog.Builder(getContext());
        }
        builder.setTitle(this.f11444a);
        if (this.f11450p) {
            builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton(this.f11445c, new C4496a());
        }
        builder.setNegativeButton(this.f11446d, new C4497b());
        View inflate = LayoutInflater.from(getContext()).inflate(2131558561, (ViewGroup) null);
        SpectrumPalette spectrumPalette = (SpectrumPalette) inflate.findViewById(2131363445);
        spectrumPalette.setColors(this.f11447f);
        spectrumPalette.setSelectedColor(this.f11449o);
        spectrumPalette.setOnColorSelectedListener(this);
        int i = this.f11452z;
        if (i != 0) {
            spectrumPalette.setOutlineWidth(i);
        }
        int i2 = this.f11442A;
        if (i2 > 0) {
            spectrumPalette.setFixedColumnCount(i2);
        }
        builder.setView(inflate);
        return builder.create();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f11451s = null;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("selected_color", this.f11449o);
    }
}
