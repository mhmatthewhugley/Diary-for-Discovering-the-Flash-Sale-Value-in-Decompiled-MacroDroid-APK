package androidx.core.p007os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13328m;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\b"}, mo71668d2 = {"", "Lja/m;", "", "", "pairs", "Landroid/os/Bundle;", "bundleOf", "([Lja/m;)Landroid/os/Bundle;", "core-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* renamed from: androidx.core.os.BundleKt */
/* compiled from: Bundle.kt */
public final class BundleKt {
    public static final Bundle bundleOf(C13328m<String, ? extends Object>... mVarArr) {
        C13706o.m87929f(mVarArr, "pairs");
        Bundle bundle = new Bundle(mVarArr.length);
        for (C13328m<String, ? extends Object> mVar : mVarArr) {
            String a = mVar.mo70152a();
            Object b = mVar.mo70153b();
            if (b == null) {
                bundle.putString(a, (String) null);
            } else if (b instanceof Boolean) {
                bundle.putBoolean(a, ((Boolean) b).booleanValue());
            } else if (b instanceof Byte) {
                bundle.putByte(a, ((Number) b).byteValue());
            } else if (b instanceof Character) {
                bundle.putChar(a, ((Character) b).charValue());
            } else if (b instanceof Double) {
                bundle.putDouble(a, ((Number) b).doubleValue());
            } else if (b instanceof Float) {
                bundle.putFloat(a, ((Number) b).floatValue());
            } else if (b instanceof Integer) {
                bundle.putInt(a, ((Number) b).intValue());
            } else if (b instanceof Long) {
                bundle.putLong(a, ((Number) b).longValue());
            } else if (b instanceof Short) {
                bundle.putShort(a, ((Number) b).shortValue());
            } else if (b instanceof Bundle) {
                bundle.putBundle(a, (Bundle) b);
            } else if (b instanceof CharSequence) {
                bundle.putCharSequence(a, (CharSequence) b);
            } else if (b instanceof Parcelable) {
                bundle.putParcelable(a, (Parcelable) b);
            } else if (b instanceof boolean[]) {
                bundle.putBooleanArray(a, (boolean[]) b);
            } else if (b instanceof byte[]) {
                bundle.putByteArray(a, (byte[]) b);
            } else if (b instanceof char[]) {
                bundle.putCharArray(a, (char[]) b);
            } else if (b instanceof double[]) {
                bundle.putDoubleArray(a, (double[]) b);
            } else if (b instanceof float[]) {
                bundle.putFloatArray(a, (float[]) b);
            } else if (b instanceof int[]) {
                bundle.putIntArray(a, (int[]) b);
            } else if (b instanceof long[]) {
                bundle.putLongArray(a, (long[]) b);
            } else if (b instanceof short[]) {
                bundle.putShortArray(a, (short[]) b);
            } else if (b instanceof Object[]) {
                Class<?> componentType = b.getClass().getComponentType();
                C13706o.m87926c(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    C13706o.m87927d(b, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(a, (Parcelable[]) b);
                } else if (String.class.isAssignableFrom(componentType)) {
                    C13706o.m87927d(b, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(a, (String[]) b);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    C13706o.m87927d(b, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(a, (CharSequence[]) b);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(a, (Serializable) b);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + a + '\"');
                }
            } else if (b instanceof Serializable) {
                bundle.putSerializable(a, (Serializable) b);
            } else if (b instanceof IBinder) {
                BundleApi18ImplKt.putBinder(bundle, a, (IBinder) b);
            } else if (b instanceof Size) {
                BundleApi21ImplKt.putSize(bundle, a, (Size) b);
            } else if (b instanceof SizeF) {
                BundleApi21ImplKt.putSizeF(bundle, a, (SizeF) b);
            } else {
                throw new IllegalArgumentException("Illegal value type " + b.getClass().getCanonicalName() + " for key \"" + a + '\"');
            }
        }
        return bundle;
    }

    public static final Bundle bundleOf() {
        return new Bundle(0);
    }
}
