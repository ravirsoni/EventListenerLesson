package com.ravirsoni.eventlistenerlesson;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by ravirsoni on 12/2/16.  EspressoUITextPresent
 */

public class EspressoUITestTextPresent {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkTextIsPresent(){

        onView(withId(R.id.tv_activity_main))
                .check(matches(withId(R.id.tv_activity_main)));

    }


}
