package Podium.Suite;

import Podium.Core.DriverFactory;
import Podium.Tests.FillingFormsWithDDTTest;
import Podium.Tests.EnterpriseErrosSimulationTest;
import org.junit.AfterClass;
import org.junit.runners.Suite;
import Podium.Tests.ProductsTest;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runner.RunWith;

@RunWith(Suite.class)
@SuiteClasses({
        ProductsTest.class,
        EnterpriseErrosSimulationTest.class,
        FillingFormsWithDDTTest.class
})

public class GeneralSuite {

    @AfterClass
    public static void testEnd(){
        DriverFactory.killDriver();
    }
}