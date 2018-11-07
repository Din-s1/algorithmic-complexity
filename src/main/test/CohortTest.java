import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.sample.Cohort;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class CohortTest {
        @Test
        void test() {
            //****************************************************
            ArrayList<Integer> cohortTest = new ArrayList<>();
            cohortTest.add(5);
            cohortTest.add(5);
            cohortTest.add(5);
            //****************************************************
            ArrayList<Integer> finalgroupTest = new ArrayList<>();
            finalgroupTest.add(6);
            finalgroupTest.add(5);
            finalgroupTest.add(5);
            //****************************************************
            assertThat(16, equalTo(Cohort.cohortDetails()));
            assertThat(3, equalTo(Cohort.theDivision()));
            assertThat(1, equalTo(Cohort.remainder()));
            Assert.assertEquals(cohortTest, Cohort.cohortGrouping());
            Assert.assertEquals(finalgroupTest, Cohort.finalCohortGrouping());
        }
    }