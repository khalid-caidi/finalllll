package icora.icl.impl;

import junit.framework.TestCase;
import icora.icl.Bean;

public class BeanImplTest extends TestCase {

    public void testBeanIsABean() {
	Bean aBean = new BeanImpl();
        assertTrue(aBean.isABean());
    }

}