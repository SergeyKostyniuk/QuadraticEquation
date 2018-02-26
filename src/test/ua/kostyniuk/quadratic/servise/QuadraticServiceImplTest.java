package ua.kostyniuk.quadratic.servise;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import ua.kostyniuk.quadratic.model.QuadraticModel;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class QuadraticServiceImplTest {

    @Mock
    QuadraticService quadraticService ;

    @Before
    public void mockito() {
        MockitoAnnotations.initMocks(quadraticService);
    }

    @Test
    public void calcQuadraticTest() {

        String a = "1";
        String b = "4";
        String c = "4";

        QuadraticModel input = new QuadraticModel();
        input.setA(1);
        input.setB(4);
        input.setC(4);
        input.setX1(-2);
        input.setX2(-2);
        when(quadraticService.calcQuadratic(a, b, c)).thenReturn(input);
        QuadraticModel result = quadraticService.calcQuadratic(a, b, c);
        Assert.assertEquals(input, result);
    }

    @Test
    public void calcQuadraticTest2() {

        String a = "2";
        String b = "7";
        String c = "0";

        QuadraticModel input = new QuadraticModel();
        input.setA(2);
        input.setB(7);
        input.setC(0);
        input.setX1(0);
        input.setX2(-3.5);
        when(quadraticService.calcQuadratic(a, b, c)).thenReturn(input);
        QuadraticModel result = quadraticService.calcQuadratic(a, b, c);
        Assert.assertEquals(input, result);
    }

    @Test
    public void calcQuadraticTest3() {

        String a = "8";
        String b = "-6";
        String c = "1";

        QuadraticModel input = new QuadraticModel();
        input.setA(8);
        input.setB(-6);
        input.setC(1);
        input.setX1(0.5);
        input.setX2(0.25);
        when(quadraticService.calcQuadratic(a, b, c)).thenReturn(input);
        QuadraticModel result = quadraticService.calcQuadratic(a, b, c);
        Assert.assertEquals(input, result);
    }

    @Test
    public void calcQuadraticTest4() {

        String a = "2";
        String b = "2";
        String c = "1";

        QuadraticModel input = new QuadraticModel();
        input.setA(2);
        input.setB(2);
        input.setC(1);
        input.setX1(0);
        input.setX2(0);
        when(quadraticService.calcQuadratic(a, b, c)).thenReturn(input);
        QuadraticModel result = quadraticService.calcQuadratic(a, b, c);
        Assert.assertEquals(input, result);
    }

}
