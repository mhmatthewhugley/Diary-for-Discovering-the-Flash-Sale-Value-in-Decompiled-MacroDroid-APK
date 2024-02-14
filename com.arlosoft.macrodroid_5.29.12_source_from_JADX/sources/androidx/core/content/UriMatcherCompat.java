package androidx.core.content;

import android.content.UriMatcher;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.core.util.Predicate;

public class UriMatcherCompat {
    private UriMatcherCompat() {
    }

    @NonNull
    public static Predicate<Uri> asPredicate(@NonNull UriMatcher uriMatcher) {
        return new C0436w(uriMatcher);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$asPredicate$0(UriMatcher uriMatcher, Uri uri) {
        return uriMatcher.match(uri) != -1;
    }
}
