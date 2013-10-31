package me.xyzlast.utils;

/**
 * Created with IntelliJ IDEA.
 * User: ykyoon
 * Date: 10/28/13
 * Time: 8:35 PM
 * To change this template use File | Settings | File Templates.
 */

import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsNull.*;
import static org.hamcrest.core.IsNot.*;
import static org.junit.Assert.*;

import org.junit.*;
import org.junit.runner.RunWith;

public class LoggerTest {
    private Logger logger;

    @Before
    public void setUp() {
        logger = new Logger();
        assertThat(logger, is(not(nullValue())));
    }

    @Test
    public void debug() {
        logger.debug("message");
        System.out.println("test");
    }
}
