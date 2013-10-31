package me.xyzlast.privateweb;

/**
 * Created with IntelliJ IDEA.
 * User: ykyoon
 * Date: 10/29/13
 * Time: 9:49 AM
 * To change this template use File | Settings | File Templates.
 */

import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsNull.*;
import static org.hamcrest.core.IsNot.*;
import static org.junit.Assert.*;

import org.junit.*;
import org.junit.runner.RunWith;

public class HomeControllerTest {
    private HomeController homeController;

    @Before
    public void setUp() {
        homeController = new HomeController();
        assertThat(homeController, is(not(nullValue())));
    }

    @Test
    public void getHomeController() {
        int hashCode = homeController.hashCode();
        assertThat(hashCode, is(not(0)));
    }

    @Test
    public void getName() {
        String name = homeController.getName();
        assertThat(name, is(nullValue()));

        String newName = "ykyoon";
        homeController.setName(newName);
        assertThat(homeController.getName(), is(newName));
    }
}
