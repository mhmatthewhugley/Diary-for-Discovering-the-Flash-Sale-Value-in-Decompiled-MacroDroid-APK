package p000a;

import agency.tango.materialintroscreen.R$color;
import agency.tango.materialintroscreen.R$layout;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* renamed from: a.a */
/* compiled from: LastEmptySlideFragment */
public class C0000a extends C0002c {
    /* renamed from: W */
    public int mo1W() {
        return R$color.transparent;
    }

    /* renamed from: X */
    public int mo2X() {
        return R$color.transparent;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R$layout.empty_fragment_slide, viewGroup, false);
    }
}
