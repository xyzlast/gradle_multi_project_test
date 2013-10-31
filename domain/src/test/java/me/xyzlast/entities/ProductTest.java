package me.xyzlast.entities;

import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsNull.*;
import static org.hamcrest.core.IsNot.*;
import static org.junit.Assert.*;

import org.junit.*;
import org.junit.runner.RunWith;

/**
 * Created with IntelliJ IDEA.
 * User: ykyoon
 * Date: 10/31/13
 * Time: 10:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class ProductTest {

    private Product product;
    @Before
    public void setUp() {
        product = new Product();
        assertThat(product, is(not(nullValue())));
    }

    @Test
    public void setId() {
        assertThat(product.getId(), is(0));
        product.setId(10);
        assertThat(product.getId(), is(10));
    }
}
