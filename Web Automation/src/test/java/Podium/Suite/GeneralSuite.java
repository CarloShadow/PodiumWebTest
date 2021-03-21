package Podium.Suite;

import Podium.Tests.FillingFormsWithDDTTest;
import Podium.Tests.EnterpriseErrosSimulationTest;
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

}
