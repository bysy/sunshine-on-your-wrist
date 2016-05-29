/*
 * Copyright (c) 2016. Benjamin Schulz (github.com/bysy)
 */

package com.github.bysy.sunshine.watchface.common;

import me.denley.courier.Deliverable;

/**
 * Created by Ben on 5/28/16.
 */

@Deliverable
public class WeatherData {
    public int high;
    public int low;
    public int iconIx;
    public String toString() {
        return String.format("WeatherData(%d, %d, %d", high, low, iconIx);
    }
}
