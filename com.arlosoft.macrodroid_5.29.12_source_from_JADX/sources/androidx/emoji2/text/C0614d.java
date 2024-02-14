package androidx.emoji2.text;

import androidx.emoji2.text.FontRequestEmojiCompatConfig;

/* renamed from: androidx.emoji2.text.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0614d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FontRequestEmojiCompatConfig.FontRequestMetadataLoader f531a;

    public /* synthetic */ C0614d(FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader) {
        this.f531a = fontRequestMetadataLoader;
    }

    public final void run() {
        this.f531a.createMetadata();
    }
}
