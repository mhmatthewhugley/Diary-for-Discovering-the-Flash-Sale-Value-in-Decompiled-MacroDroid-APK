package androidx.core.content;

import android.content.ContentValues;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13328m;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo71668d2 = {"", "Lja/m;", "", "", "pairs", "Landroid/content/ContentValues;", "contentValuesOf", "([Lja/m;)Landroid/content/ContentValues;", "core-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* compiled from: ContentValues.kt */
public final class ContentValuesKt {
    public static final ContentValues contentValuesOf(C13328m<String, ? extends Object>... mVarArr) {
        C13706o.m87929f(mVarArr, "pairs");
        ContentValues contentValues = new ContentValues(mVarArr.length);
        for (C13328m<String, ? extends Object> mVar : mVarArr) {
            String a = mVar.mo70152a();
            Object b = mVar.mo70153b();
            if (b == null) {
                contentValues.putNull(a);
            } else if (b instanceof String) {
                contentValues.put(a, (String) b);
            } else if (b instanceof Integer) {
                contentValues.put(a, (Integer) b);
            } else if (b instanceof Long) {
                contentValues.put(a, (Long) b);
            } else if (b instanceof Boolean) {
                contentValues.put(a, (Boolean) b);
            } else if (b instanceof Float) {
                contentValues.put(a, (Float) b);
            } else if (b instanceof Double) {
                contentValues.put(a, (Double) b);
            } else if (b instanceof byte[]) {
                contentValues.put(a, (byte[]) b);
            } else if (b instanceof Byte) {
                contentValues.put(a, (Byte) b);
            } else if (b instanceof Short) {
                contentValues.put(a, (Short) b);
            } else {
                throw new IllegalArgumentException("Illegal value type " + b.getClass().getCanonicalName() + " for key \"" + a + '\"');
            }
        }
        return contentValues;
    }
}
