package com.example.test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.isEmptyString;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void addTest() {
        onView(withId(R.id.ed_first)).perform().check(matches((withText(isEmptyString()))));
        onView(withId(R.id.ed_first)).perform(typeText("10"));
        onView(withId(R.id.ed_second)).perform().check(matches((withText(isEmptyString()))));
        onView(withId(R.id.ed_second)).perform(typeText("44"));
        onView(withId(R.id.btn_calculation)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("54")));
    }
}
