package io.appium.java_client.android.nativekey;

public enum KeyEventFlag {
    /**
     * This mask is set if the key event was generated by a software keyboard.
     */
    SOFT_KEYBOARD(0x2),
    /**
     * This mask is set if we don't want the key event to cause us to leave
     * touch mode.
     */
    KEEP_TOUCH_MODE(0x4),
    /**
     * This mask is set if an event was known to come from a trusted part
     * of the system.  That is, the event is known to come from the user,
     * and could not have been spoofed by a third party component.
     */
    FROM_SYSTEM(0x8),
    /**
     * This mask is used for compatibility, to identify enter keys that are
     * coming from an IME whose enter key has been auto-labelled "next" or
     * "done".  This allows TextView to dispatch these as normal enter keys
     * for old applications, but still do the appropriate action when
     * receiving them.
     */
    EDITOR_ACTION(0x10),
    /**
     * When associated with up key events, this indicates that the key press
     * has been canceled.  Typically this is used with virtual touch screen
     * keys, where the user can slide from the virtual key area on to the
     * display: in that case, the application will receive a canceled up
     * event and should not perform the action normally associated with the
     * key.  Note that for this to work, the application can not perform an
     * action for a key until it receives an up or the long press timeout has
     * expired.
     */
    CANCELED(0x20),
    /**
     * This key event was generated by a virtual (on-screen) hard key area.
     * Typically this is an area of the touchscreen, outside of the regular
     * display, dedicated to "hardware" buttons.
     */
    VIRTUAL_HARD_KEY(0x40),
    /**
     * This flag is set for the first key repeat that occurs after the
     * long press timeout.
     */
    LONG_PRESS(0x80),
    /**
     * Set when a key event has {@link #CANCELED} set because a long
     * press action was executed while it was down.
     */
    CANCELED_LONG_PRESS(0x100),
    /**
     * Set for ACTION_UP when this event's key value is still being
     * tracked from its initial down.  That is, somebody requested that tracking
     * started on the key down and a long press has not caused
     * the tracking to be canceled.
     */
    TRACKING(0x200),
    /**
     * Set when a key event has been synthesized to implement default behavior
     * for an event that the application did not handle.
     * Fallback key events are generated by unhandled trackball motions
     * (to emulate a directional keypad) and by certain unhandled key presses
     * that are declared in the key map (such as special function numeric keypad
     * keys when numlock is off).
     */
    FALLBACK(0x400),
    /**
     * Signifies that the key is being predispatched.
     */
    PREDISPATCH(0x20000000),
    /**
     * Private control to determine when an app is tracking a key sequence.
     */
    START_TRACKING(0x40000000),
    /**
     * Private flag that indicates when the system has detected that this key event
     * may be inconsistent with respect to the sequence of previously delivered key events,
     * such as when a key up event is sent but the key was not down.
     */
    TAINTED(0x80000000);

    private final int value;

    KeyEventFlag(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}