package splitties.initprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p479vf.C17490a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u000e\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004JM\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0010\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0010\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0010\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0017"}, mo71668d2 = {"Lsplitties/initprovider/InitProvider;", "Landroid/content/ContentProvider;", "Landroid/net/Uri;", "uri", "Landroid/content/ContentValues;", "values", "", "c", "", "", "projection", "selection", "selectionArgs", "sortOrder", "d", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;", "e", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Void;", "a", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Void;", "b", "<init>", "()V", "initprovider_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: InitProvider.kt */
public abstract class InitProvider extends ContentProvider {
    /* renamed from: a */
    public final Void mo80782a(Uri uri, String str, String[] strArr) {
        C13706o.m87929f(uri, "uri");
        C17490a.m101262b((String) null, 1, (Object) null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: b */
    public final Void mo80783b(Uri uri) {
        C13706o.m87929f(uri, "uri");
        C17490a.m101262b((String) null, 1, (Object) null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: c */
    public final Void mo80784c(Uri uri, ContentValues contentValues) {
        C13706o.m87929f(uri, "uri");
        C17490a.m101262b((String) null, 1, (Object) null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: d */
    public final Void mo80785d(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C13706o.m87929f(uri, "uri");
        C17490a.m101262b((String) null, 1, (Object) null);
        throw new KotlinNothingValueException();
    }

    public /* bridge */ /* synthetic */ int delete(Uri uri, String str, String[] strArr) {
        return ((Number) mo80782a(uri, str, strArr)).intValue();
    }

    /* renamed from: e */
    public final Void mo80787e(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C13706o.m87929f(uri, "uri");
        C17490a.m101262b((String) null, 1, (Object) null);
        throw new KotlinNothingValueException();
    }

    public /* bridge */ /* synthetic */ String getType(Uri uri) {
        return (String) mo80783b(uri);
    }

    public /* bridge */ /* synthetic */ Uri insert(Uri uri, ContentValues contentValues) {
        return (Uri) mo80784c(uri, contentValues);
    }

    public /* bridge */ /* synthetic */ Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return (Cursor) mo80785d(uri, strArr, str, strArr2, str2);
    }

    public /* bridge */ /* synthetic */ int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return ((Number) mo80787e(uri, contentValues, str, strArr)).intValue();
    }
}
