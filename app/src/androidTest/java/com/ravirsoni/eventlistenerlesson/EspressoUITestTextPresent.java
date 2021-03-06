package com.ravirsoni.eventlistenerlesson;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import javax.annotation.Priority;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by ravirsoni on 12/2/16.  EspressoUITextPresent
 */

public class EspressoUITestTextPresent {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkTextIsPresent(){

        // validate that the Correct Text is Present.

        onView(withId(R.id.tv_activity_main))
                .check(matches(withText("Click to change Text !!!")));
    }

//    @Test
//    public void checkTextGetsUpdated(){
//
//        onView(withId(R.id.bt_clicktochange_change_text))
//                .perform(click())
//                .check(matches(withText("This is Updated Text")));
//    }



}
