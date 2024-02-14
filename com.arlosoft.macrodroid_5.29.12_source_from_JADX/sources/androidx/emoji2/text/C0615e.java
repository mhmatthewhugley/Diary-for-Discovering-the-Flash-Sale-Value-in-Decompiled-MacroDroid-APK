package androidx.emoji2.text;

import androidx.emoji2.text.FontRequestEmojiCompatConfig;

/* renamed from: androidx.emoji2.text.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0615e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FontRequestEmojiCompatConfig.FontRequestMetadataLoader f532a;

    public /* synthetic */ C0615e(FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader) {
        this.f532a = fontRequestMetadataLoader;
    }

    public final void run() {
        this.f532a.loadInternal();
    }
}
