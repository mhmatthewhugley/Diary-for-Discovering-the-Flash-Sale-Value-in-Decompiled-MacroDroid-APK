package com.google.android.gms.ads.formats;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.MediaContent;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class MediaView extends FrameLayout {

    /* renamed from: a */
    private MediaContent f1745a;

    /* renamed from: c */
    private ImageView.ScaleType f1746c;

    public MediaView(@NonNull Context context) {
        super(context);
    }

    public void setImageScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.f1746c = scaleType;
    }

    public void setMediaContent(@NonNull MediaContent mediaContent) {
        this.f1745a = mediaContent;
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
