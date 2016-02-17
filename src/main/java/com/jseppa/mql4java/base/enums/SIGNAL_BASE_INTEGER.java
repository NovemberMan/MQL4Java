package com.jseppa.mql4java.base.enums;

/**
 * Created by Jason on 2/15/2016.
 */
public enum SIGNAL_BASE_INTEGER
{

    SIGNAL_BASE_DATE_PUBLISHED(1),
    SIGNAL_BASE_DATE_STARTED(2),
    SIGNAL_BASE_ID(3),
    SIGNAL_BASE_LEVERAGE(4),
    SIGNAL_BASE_PIPS(5),
    SIGNAL_BASE_RATING(6),
    SIGNAL_BASE_SUBSCRIBERS(7),
    SIGNAL_BASE_TRADES(8),
    SIGNAL_BASE_TRADE_MODE(9);

    int value;
    SIGNAL_BASE_INTEGER(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }
}
