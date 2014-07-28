package me.xyzlast.utils;

/**
 * Created with IntelliJ IDEA.
 * User: ykyoon
 * Date: 10/28/13
 * Time: 8:35 PM
 * To change this template use File | Settings | File Templates.
 */

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

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
