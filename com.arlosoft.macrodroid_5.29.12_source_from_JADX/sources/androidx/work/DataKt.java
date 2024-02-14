package androidx.work;

import androidx.exifinterface.media.ExifInterface;
import androidx.work.Data;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13328m;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a@\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\u000b\u001a\u00020\n\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\u0003*\u00020\u00052\u0006\u0010\t\u001a\u00020\u0002H\b¨\u0006\f"}, mo71668d2 = {"", "Lja/m;", "", "", "pairs", "Landroidx/work/Data;", "workDataOf", "([Lja/m;)Landroidx/work/Data;", "T", "key", "", "hasKeyWithValueOfType", "work-runtime-ktx_release"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: Data.kt */
public final class DataKt {
    public static final /* synthetic */ <T> boolean hasKeyWithValueOfType(Data data, String str) {
        C13706o.m87929f(data, "<this>");
        C13706o.m87929f(str, "key");
        C13706o.m87933j(4, ExifInterface.GPS_DIRECTION_TRUE);
        return data.hasKeyWithValueOfType(str, Object.class);
    }

    public static final Data workDataOf(C13328m<String, ? extends Object>... mVarArr) {
        C13706o.m87929f(mVarArr, "pairs");
        Data.Builder builder = new Data.Builder();
        int length = mVarArr.length;
        int i = 0;
        while (i < length) {
            C13328m<String, ? extends Object> mVar = mVarArr[i];
            i++;
            builder.put(mVar.mo70154c(), mVar.mo70155d());
        }
        Data build = builder.build();
        C13706o.m87928e(build, "dataBuilder.build()");
        return build;
    }
}
