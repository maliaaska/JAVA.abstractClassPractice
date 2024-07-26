package com.milewskiarkadiuszmodul12abstractTasks;

public interface Alarm {
    //Stwórz interfejs Alarm z dwiema domyślnymi metodami: turnAlarmOn() i turnAlarmOff(). Metody te powinny posiadać domyślną implementację.
    //Dodatkowo w interfejsie zadeklaruj stałą określającą jaki dźwięk wydaje alarm (typ String).
    public static final String sound = "Dryn Dryn";
    void turnAlarmOn();
    void turnAlarmOff();


}
