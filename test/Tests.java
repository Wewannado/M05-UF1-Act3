/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import matriculadam.ComprobaMatricula;

/**
 *
 * @author Roger G. Coscojuela
 */
public class Tests {

    public Tests() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test(expected = Exception.class)
    public final void testComprobaMatriculaString() throws Exception {
        String expected = "";
        String input = "a";
        ComprobaMatricula matricula = new ComprobaMatricula();
        assertEquals(expected, matricula.comprobaMatricula(input));
        fail("Si introducimos un String el TEST debe pasar.");
    }

    @Test(expected = Exception.class)
    public final void testComprobaMatriculaZero() throws Exception {
        String expected = "";
        String input = "a";
        ComprobaMatricula matricula = new ComprobaMatricula();
        assertEquals(expected, matricula.comprobaMatricula(input));
        fail("Si introducimos 0 matriculas el TEST debe pasar.");
    }

    @Test(expected = Exception.class)
    public final void testComprobaMatriculaNegativa() throws Exception {
        String expected = "";
        String input = "a";
        ComprobaMatricula matricula = new ComprobaMatricula();
        assertEquals(expected, matricula.comprobaMatricula(input));
        fail("Si introducimos un numero de matriculas negativas el TEST debe pasar.");
    }

    @Test
    public final void testComprobaMatriculaOk() throws Exception {
        String expected = "60 €";
        String input = "2";
        ComprobaMatricula matricula = new ComprobaMatricula();
        assertEquals(expected, matricula.comprobaMatricula(input));
    }
        @Test
    public final void testComprobaMatriculaOkSuperiorA12UF() throws Exception {
        String expected = "360 €";
        String input = "13";
        ComprobaMatricula matricula = new ComprobaMatricula();
        assertEquals(expected, matricula.comprobaMatricula(input));
    }
}
