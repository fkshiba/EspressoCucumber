package br.com.dextra.felipeshiba.espressocucumber.test;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.runner.RunWith;

import br.com.dextra.felipeshiba.espressocucumber.MainActivity;
import br.com.dextra.felipeshiba.espressocucumber.R;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivitySteps {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() throws Exception {
        mActivityRule.launchActivity(null);
        mActivityRule.getActivity();
    }

    /**
     * All the clean up of application's data and state after each scenario must happen here
     */
    @After
    public void tearDown() throws Exception {

    }

    @Given("^I see the main screen$")
    public void i_see_the_main_screen() throws Throwable {
    }

    @When("^I click fab button$")
    public void i_click_fab_button() throws Throwable {
        onView(withId(R.id.fab)).perform(click());
    }

    @Then("^I should see text \"(.+)\" on display$")
    public void i_should_see_text_on_display(final String text) throws Throwable {
        onView(withId(R.id.txtMsg)).check(matches(withText(text)));
    }

}
