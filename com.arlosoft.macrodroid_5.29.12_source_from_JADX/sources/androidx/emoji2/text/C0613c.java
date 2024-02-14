package androidx.emoji2.text;

import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: androidx.emoji2.text.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0613c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ EmojiCompatInitializer.BackgroundDefaultLoader f528a;

    /* renamed from: c */
    public final /* synthetic */ EmojiCompat.MetadataRepoLoaderCallback f529c;

    /* renamed from: d */
    public final /* synthetic */ ThreadPoolExecutor f530d;

    public /* synthetic */ C0613c(EmojiCompatInitializer.BackgroundDefaultLoader backgroundDefaultLoader, EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback, ThreadPoolExecutor threadPoolExecutor) {
        this.f528a = backgroundDefaultLoader;
        this.f529c = metadataRepoLoaderCallback;
        this.f530d = threadPoolExecutor;
    }

    public final void run() {
        this.f528a.lambda$load$0(this.f529c, this.f530d);
    }
}
