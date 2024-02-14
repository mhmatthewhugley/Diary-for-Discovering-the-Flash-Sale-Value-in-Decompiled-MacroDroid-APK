package com.thebluealliance.spectrum;

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
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import com.thebluealliance.spectrum.SpectrumPalette;

/* renamed from: com.thebluealliance.spectrum.a */
/* compiled from: SpectrumDialog */
public class C11766a extends DialogFragment implements SpectrumPalette.C11762a {

    /* renamed from: A */
    private int f57690A = -1;

    /* renamed from: B */
    private int f57691B = 0;

    /* renamed from: a */
    private CharSequence f57692a;

    /* renamed from: c */
    private CharSequence f57693c;

    /* renamed from: d */
    private CharSequence f57694d;
    @ColorInt

    /* renamed from: f */
    private int[] f57695f;
    /* access modifiers changed from: private */
    @ColorInt

    /* renamed from: g */
    public int f57696g = -1;
    /* access modifiers changed from: private */
    @ColorInt

    /* renamed from: o */
    public int f57697o = -1;

    /* renamed from: p */
    private boolean f57698p = true;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C11770d f57699s;

    /* renamed from: z */
    private int f57700z = 0;

    /* renamed from: com.thebluealliance.spectrum.a$a */
    /* compiled from: SpectrumDialog */
    class C11767a implements DialogInterface.OnClickListener {
        C11767a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (C11766a.this.f57699s != null) {
                C11766a.this.f57699s.mo26451a(true, C11766a.this.f57697o);
            }
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.thebluealliance.spectrum.a$b */
    /* compiled from: SpectrumDialog */
    class C11768b implements DialogInterface.OnClickListener {
        C11768b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (C11766a.this.f57699s != null) {
                C11766a.this.f57699s.mo26451a(false, C11766a.this.f57696g);
            }
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.thebluealliance.spectrum.a$c */
    /* compiled from: SpectrumDialog */
    public static class C11769c {

        /* renamed from: a */
        private Context f57703a;

        /* renamed from: b */
        private Bundle f57704b = new Bundle();

        /* renamed from: c */
        private C11770d f57705c;

        public C11769c(Context context) {
            this.f57703a = context;
        }

        /* renamed from: a */
        public C11766a mo66981a() {
            C11766a aVar = new C11766a();
            aVar.setArguments(this.f57704b);
            aVar.mo66978X(this.f57705c);
            return aVar;
        }

        /* renamed from: b */
        public C11769c mo66982b(@ArrayRes int i) {
            this.f57704b.putIntArray("colors", this.f57703a.getResources().getIntArray(i));
            return this;
        }

        /* renamed from: c */
        public C11769c mo66983c(boolean z) {
            this.f57704b.putBoolean("should_dismiss_on_color_selected", z);
            return this;
        }

        /* renamed from: d */
        public C11769c mo66984d(C11770d dVar) {
            this.f57705c = dVar;
            return this;
        }

        /* renamed from: e */
        public C11769c mo66985e(int i) {
            this.f57704b.putInt("border_width", i);
            return this;
        }

        /* renamed from: f */
        public C11769c mo66986f(@ColorInt int i) {
            this.f57704b.putInt("selected_color", i);
            this.f57704b.putInt("origina_selected_color", i);
            return this;
        }

        /* renamed from: g */
        public C11769c mo66987g(@StringRes int i) {
            this.f57704b.putCharSequence("title", this.f57703a.getText(i));
            return this;
        }
    }

    /* renamed from: com.thebluealliance.spectrum.a$d */
    /* compiled from: SpectrumDialog */
    public interface C11770d {
        /* renamed from: a */
        void mo26451a(boolean z, @ColorInt int i);
    }

    /* renamed from: X */
    public void mo66978X(C11770d dVar) {
        this.f57699s = dVar;
    }

    /* renamed from: f */
    public void mo28902f(@ColorInt int i) {
        this.f57697o = i;
        if (this.f57698p) {
            C11770d dVar = this.f57699s;
            if (dVar != null) {
                dVar.mo26451a(true, i);
            }
            dismiss();
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        C11770d dVar = this.f57699s;
        if (dVar != null) {
            dVar.mo26451a(false, this.f57696g);
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey("title")) {
            this.f57692a = getContext().getText(R$string.default_dialog_title);
        } else {
            this.f57692a = arguments.getCharSequence("title");
        }
        if (arguments == null || !arguments.containsKey("colors")) {
            this.f57695f = new int[]{-16777216};
        } else {
            this.f57695f = arguments.getIntArray("colors");
        }
        int[] iArr = this.f57695f;
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("SpectrumDialog must be created with an array of colors");
        }
        if (arguments == null || !arguments.containsKey("selected_color")) {
            this.f57697o = this.f57695f[0];
        } else {
            this.f57697o = arguments.getInt("selected_color");
        }
        if (arguments == null || !arguments.containsKey("origina_selected_color")) {
            this.f57696g = this.f57697o;
        } else {
            this.f57696g = arguments.getInt("origina_selected_color");
        }
        if (arguments == null || !arguments.containsKey("should_dismiss_on_color_selected")) {
            this.f57698p = true;
        } else {
            this.f57698p = arguments.getBoolean("should_dismiss_on_color_selected");
        }
        if (arguments == null || !arguments.containsKey("positive_button_text")) {
            this.f57693c = getContext().getText(17039370);
        } else {
            this.f57693c = arguments.getCharSequence("positive_button_text");
        }
        if (arguments == null || !arguments.containsKey("negative_button_text")) {
            this.f57694d = getContext().getText(17039360);
        } else {
            this.f57694d = arguments.getCharSequence("negative_button_text");
        }
        if (arguments != null && arguments.containsKey("border_width")) {
            this.f57700z = arguments.getInt("border_width");
        }
        if (arguments != null && arguments.containsKey("fixed_column_count")) {
            this.f57690A = arguments.getInt("fixed_column_count");
        }
        if (arguments != null && arguments.containsKey("theme_res_id")) {
            this.f57691B = arguments.getInt("theme_res_id");
        }
        if (bundle != null && bundle.containsKey("selected_color")) {
            this.f57697o = bundle.getInt("selected_color");
        }
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder;
        if (this.f57691B != 0) {
            builder = new AlertDialog.Builder(getContext(), this.f57691B);
        } else {
            builder = new AlertDialog.Builder(getContext());
        }
        builder.setTitle(this.f57692a);
        if (this.f57698p) {
            builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton(this.f57693c, (DialogInterface.OnClickListener) new C11767a());
        }
        builder.setNegativeButton(this.f57694d, (DialogInterface.OnClickListener) new C11768b());
        View inflate = LayoutInflater.from(getContext()).inflate(R$layout.dialog_color_picker, (ViewGroup) null);
        SpectrumPalette spectrumPalette = (SpectrumPalette) inflate.findViewById(R$id.palette);
        spectrumPalette.setColors(this.f57695f);
        spectrumPalette.setSelectedColor(this.f57697o);
        spectrumPalette.setOnColorSelectedListener(this);
        int i = this.f57700z;
        if (i != 0) {
            spectrumPalette.setOutlineWidth(i);
        }
        int i2 = this.f57690A;
        if (i2 > 0) {
            spectrumPalette.setFixedColumnCount(i2);
        }
        builder.setView(inflate);
        return builder.create();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f57699s = null;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("selected_color", this.f57697o);
    }
}
