package com.srm.dixitsoham.testcases;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Soham Dixit on 06-03-2018.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTests {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLogin() {
        onView(withId(R.id.u_name))
                .perform(typeText("Soham"), closeSoftKeyboard());
        onView(withId(R.id.u_pwd))
                .perform(typeText("Dixit"), closeSoftKeyboard());
        onView(withText("Login")).perform(click());
        onView(withId(R.id.text))
                .check(matches(withText("Hello Soham Login Successful !")));
    }



}


