package com.ravirsoni.eventlistenerlesson;

import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by ravirsoni on 12/2/16. Test to Check TextGetsUpdated.
 * Text is getting updated properly or not.
 *
 */

public class EspressoUIsTextGetsUpdated {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkTextGetsUpdated (){

        onView(withId(R.id.tv_activity_main))
                .check(matches(withText("Click to change Text !!!")));


        onView(withId(R.id.bt_clicktochange_change_text))
                .perform(click());

         onView(withText(R.string.tx_updated_Text))
                .check(matches(withText("This is Updated Text")));

    }

}
