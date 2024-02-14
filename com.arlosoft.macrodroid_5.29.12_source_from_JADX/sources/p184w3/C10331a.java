package p184w3;

/* renamed from: w3.a */
/* compiled from: ProUserStatus.kt */
public enum C10331a {
    PRO_USER_PLAY_STORE_VALID(0),
    PRO_USER_SERIAL_VALID(1),
    PRO_USER_NO_INFO_IN_APP(2),
    PRO_USER_PLAY_STORE_INVALID(3),
    PRO_USER_PLAY_STORE_VOIDED(4),
    PRO_USER_SERIAL_NOT_VERIFIED(5),
    PRO_USER_STATUS_UNAVAILABLE(6),
    PRO_USER_STAUTUS_AUTH_FAILED(7);
    
    private final int code;

    private C10331a(int i) {
        this.code = i;
    }
}
