package p475tf;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p479vf.C17490a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u001a'\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a(\u0010\f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0002\b\u00030\nj\u0006\u0012\u0002\b\u0003`\u000bH\u0002\u001a \u0010\u000e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¨\u0006\u000f"}, mo71668d2 = {"Landroid/os/Bundle;", "", "key", "", "value", "Lja/u;", "a", "", "b", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/lang/Object;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "Landroid/util/SparseArray;", "d", "bundle_release"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* renamed from: tf.b */
/* compiled from: Bundle.kt */
public final class C17457b {
    /* renamed from: a */
    public static final void m101241a(Bundle bundle, String str, Object obj) {
        C13706o.m87929f(bundle, "$this$put");
        C13706o.m87929f(str, "key");
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
        } else if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
        } else if (obj instanceof short[]) {
            bundle.putShortArray(str, (short[]) obj);
        } else if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
        } else if (obj instanceof byte[]) {
            bundle.putByteArray(str, (byte[]) obj);
        } else if (obj instanceof float[]) {
            bundle.putFloatArray(str, (float[]) obj);
        } else if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
        } else if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
        } else if (obj instanceof char[]) {
            bundle.putCharArray(str, (char[]) obj);
        } else if (obj instanceof CharSequence) {
            bundle.putCharSequence(str, (CharSequence) obj);
        } else if (obj instanceof Bundle) {
            bundle.putBundle(str, (Bundle) obj);
        } else if (obj instanceof Object[]) {
            m101242b(bundle, str, (Object[]) obj);
        } else if (obj instanceof ArrayList) {
            m101243c(bundle, str, (ArrayList) obj);
        } else if (obj instanceof SparseArray) {
            m101244d(bundle, str, (SparseArray) obj);
        } else if (obj instanceof Binder) {
            bundle.putBinder(str, (IBinder) obj);
        } else if (obj instanceof Parcelable) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        } else if (obj == null) {
            bundle.putString(str, (String) obj);
        } else {
            C17490a.m101261a("Type " + obj.getClass().getCanonicalName() + " is not supported");
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: b */
    private static final void m101242b(Bundle bundle, String str, Object[] objArr) {
        if (objArr instanceof CharSequence[]) {
            bundle.putCharSequenceArray(str, (CharSequence[]) objArr);
        } else if (objArr instanceof String[]) {
            bundle.putStringArray(str, (String[]) objArr);
        } else if (objArr instanceof Parcelable[]) {
            bundle.putParcelableArray(str, (Parcelable[]) objArr);
        } else {
            C17490a.m101261a("Array type " + objArr.getClass().getCanonicalName() + " is not supported");
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: c */
    private static final void m101243c(Bundle bundle, String str, ArrayList<?> arrayList) {
        Object Y = C13566b0.m87424Y(arrayList);
        if (Y instanceof CharSequence) {
            bundle.putCharSequenceArrayList(str, arrayList);
        } else if (Y instanceof String) {
            bundle.putStringArrayList(str, arrayList);
        } else if (Y instanceof Parcelable) {
            bundle.putParcelableArrayList(str, arrayList);
        } else if (!(Y instanceof Integer) && Y != null) {
            C17490a.m101261a("Type " + C13566b0.m87422W(arrayList).getClass().getCanonicalName() + " in ArrayList is not supported");
            throw new KotlinNothingValueException();
        } else {
            bundle.putIntegerArrayList(str, arrayList);
        }
    }

    /* renamed from: d */
    private static final void m101244d(Bundle bundle, String str, SparseArray<?> sparseArray) {
        bundle.putSparseParcelableArray(str, sparseArray);
    }
}
