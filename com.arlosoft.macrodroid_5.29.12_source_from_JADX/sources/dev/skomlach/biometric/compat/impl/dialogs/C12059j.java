package dev.skomlach.biometric.compat.impl.dialogs;

import android.graphics.ImageDecoder;
import dev.skomlach.biometric.compat.impl.dialogs.FingerprintIconView;

/* renamed from: dev.skomlach.biometric.compat.impl.dialogs.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12059j implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a */
    public static final /* synthetic */ C12059j f58282a = new C12059j();

    private /* synthetic */ C12059j() {
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        FingerprintIconView.Companion.m101344getDrawableAndroidR$lambda0(imageDecoder, imageInfo, source);
    }
}
