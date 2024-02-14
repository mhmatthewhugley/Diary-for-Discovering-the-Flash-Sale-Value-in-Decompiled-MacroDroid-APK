package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

final class TopicOperation {

    /* renamed from: d */
    private static final Pattern f55040d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a */
    private final String f55041a;

    /* renamed from: b */
    private final String f55042b;

    /* renamed from: c */
    private final String f55043c;

    private TopicOperation(String str, String str2) {
        this.f55041a = m77035d(str2, str);
        this.f55042b = str;
        this.f55043c = str + "!" + str2;
    }

    @Nullable
    /* renamed from: a */
    static TopicOperation m77034a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new TopicOperation(split[0], split[1]);
    }

    @NonNull
    /* renamed from: d */
    private static String m77035d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[]{str2}));
            str = str.substring(8);
        }
        if (str != null && f55040d.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[]{str, "[a-zA-Z0-9-_.~%]{1,900}"}));
    }

    /* renamed from: f */
    public static TopicOperation m77036f(@NonNull String str) {
        return new TopicOperation(ExifInterface.LATITUDE_SOUTH, str);
    }

    /* renamed from: g */
    public static TopicOperation m77037g(@NonNull String str) {
        return new TopicOperation("U", str);
    }

    /* renamed from: b */
    public String mo63420b() {
        return this.f55042b;
    }

    /* renamed from: c */
    public String mo63421c() {
        return this.f55041a;
    }

    /* renamed from: e */
    public String mo63422e() {
        return this.f55043c;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof TopicOperation)) {
            return false;
        }
        TopicOperation topicOperation = (TopicOperation) obj;
        if (!this.f55041a.equals(topicOperation.f55041a) || !this.f55042b.equals(topicOperation.f55042b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.m4471b(this.f55042b, this.f55041a);
    }
}
