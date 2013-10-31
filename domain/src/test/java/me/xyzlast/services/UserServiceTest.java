package me.xyzlast.services;

import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsNull.*;
import static org.hamcrest.core.IsNot.*;
import static org.junit.Assert.*;

import me.xyzlast.utils.Logger;
import org.junit.*;
import org.junit.runner.RunWith;


/**
 * Created with IntelliJ IDEA.
 * User: ykyoon
 * Date: 10/29/13
 * Time: 8:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class UserServiceTest {

    private Logger logger;
    private UserService userService;

    @Before
    public void setUp() {
        logger = new Logger();
        assertThat(logger, is(not(nullValue())));
        userService = new UserService();
        assertThat(userService, is(not(nullValue())));
    }

    @Test
    public void testSetLogger() throws Exception {
        userService.setLogger(logger);
        assertThat(userService.getLogger(), is(logger));
    }
}
