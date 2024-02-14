package com.google.android.gms.maps.model;

public final class CustomCap extends Cap {

    /* renamed from: g */
    public final BitmapDescriptor f46242g;

    /* renamed from: o */
    public final float f46243o;

    public final String toString() {
        String valueOf = String.valueOf(this.f46242g);
        float f = this.f46243o;
        StringBuilder sb = new StringBuilder(valueOf.length() + 55);
        sb.append("[CustomCap: bitmapDescriptor=");
        sb.append(valueOf);
        sb.append(" refWidth=");
        sb.append(f);
        sb.append("]");
        return sb.toString();
    }
}
