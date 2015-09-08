/*
 * Copyright 2014 Moses.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.liuxuan.utils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Moses
 */
public class RandomerTest {
    
    public RandomerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println("setUp() method");
    }
    
    @After
    public void tearDown() {
        System.out.println("tearDown() method");
    }

    /**
     * Test of resetInt method, of class Randomer.
     */
    @Test
    public void testResetInt() {
        System.out.println("resetInt");
        Randomer instance = new Randomer();
        instance.resetInt();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetLong method, of class Randomer.
     */
    @Test
    public void testResetLong() {
        System.out.println("resetLong");
        Randomer instance = new Randomer();
        instance.resetLong();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nextInt method, of class Randomer.
     */
    @Test
    public void testNextInt_0args() {
        System.out.println("nextInt");
        Randomer instance = new Randomer();
        int expResult = 0;
        int result = instance.nextInt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nextInt method, of class Randomer.
     */
    @Test
    public void testNextInt_int() {
        System.out.println("nextInt");
        int n = 0;
        Randomer instance = new Randomer();
        int expResult = 0;
        int result = instance.nextInt(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nextInt method, of class Randomer.
     */
    @Test
    public void testNextInt_int_int() {
        System.out.println("nextInt");
        int a = 0;
        int b = 0;
        Randomer instance = new Randomer();
        int expResult = 0;
        int result = instance.nextInt(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRange method, of class Randomer.
     */
    @Test
    public void testSetRange() {
        System.out.println("setRange");
        long a = 0L;
        long b = 0L;
        Randomer instance = new Randomer();
        instance.setRange(a, b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMax method, of class Randomer.
     */
    @Test
    public void testGetMax() {
        System.out.println("getMax");
        Randomer instance = new Randomer();
        long expResult = 0L;
        long result = instance.getMax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMax method, of class Randomer.
     */
    @Test
    public void testSetMax() {
        System.out.println("setMax");
        long aMax = 0L;
        Randomer instance = new Randomer();
        instance.setMax(aMax);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMin method, of class Randomer.
     */
    @Test
    public void testGetMin() {
        System.out.println("getMin");
        Randomer instance = new Randomer();
        long expResult = 0L;
        long result = instance.getMin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMin method, of class Randomer.
     */
    @Test
    public void testSetMin() {
        System.out.println("setMin");
        long aMin = 0L;
        Randomer instance = new Randomer();
        instance.setMin(aMin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
