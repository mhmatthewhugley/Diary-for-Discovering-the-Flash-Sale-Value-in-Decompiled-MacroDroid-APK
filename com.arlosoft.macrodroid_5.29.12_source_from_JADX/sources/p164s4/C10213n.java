package p164s4;

import android.media.ExifInterface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p126l4.C7667b;

@RequiresApi(27)
/* renamed from: s4.n */
/* compiled from: ExifInterfaceImageHeaderParser */
public final class C10213n implements ImageHeaderParser {
    /* renamed from: a */
    public int mo32976a(@NonNull InputStream inputStream, @NonNull C7667b bVar) throws IOException {
        int attributeInt = new ExifInterface(inputStream).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }

    @NonNull
    /* renamed from: b */
    public ImageHeaderParser.ImageType mo32977b(@NonNull ByteBuffer byteBuffer) throws IOException {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @NonNull
    /* renamed from: c */
    public ImageHeaderParser.ImageType mo32978c(@NonNull InputStream inputStream) throws IOException {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
