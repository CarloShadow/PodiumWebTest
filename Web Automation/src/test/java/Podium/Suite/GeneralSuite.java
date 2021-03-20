package Podium.Suite;

import Podium.Tests.FormsFillingTest;
import org.junit.runners.Suite;
import Podium.Tests.ProductsTest;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runner.RunWith;

@RunWith(Suite.class)
@SuiteClasses({
        ProductsTest.class,
        FormsFillingTest.class
})

public class GeneralSuite {

}
