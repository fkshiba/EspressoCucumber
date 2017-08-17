package br.com.dextra.felipeshiba.espressocucumber.test.util;

import android.os.Bundle;
import android.support.test.runner.AndroidJUnitRunner;
import cucumber.api.android.CucumberInstrumentationCore;

/**
 * Created by felipe.shiba on 10/08/17.
 */

public class Instrumentation extends AndroidJUnitRunner {
    private final CucumberInstrumentationCore mInstrumentationCore = new CucumberInstrumentationCore(this);

    @Override
    public void onCreate(Bundle arguments) {
        super.onCreate(arguments);
        mInstrumentationCore.create(arguments);
    }

    @Override
    public void onStart() {
        waitForIdleSync();
        mInstrumentationCore.start();
    }

}
