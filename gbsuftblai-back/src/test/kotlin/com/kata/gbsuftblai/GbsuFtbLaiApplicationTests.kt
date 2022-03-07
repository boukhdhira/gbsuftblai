package com.kata.gbsuftblai

import com.kata.gbsuftblai.services.GbsuFtbLaiService
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.util.AssertionErrors.assertEquals

@SpringBootTest
class GbsuFtbLaiApplicationTests {
    val service = GbsuFtbLaiService();
    @Test
    fun shouldReturnInputNumberWhenNoMutchString() {
       val retour = service.convertNumber(1);
        assertEquals("1", "1",retour);
    }

    @Test
    fun when_3_should_return_GbsuGbsu() {
        val retour = service.convertNumber(3);
        assertEquals("GbsuGbsu", "GbsuGbsu",retour);
    }

    @Test
    fun when_5_should_return_FtbFtb() {
        val retour = service.convertNumber(5);
        assertEquals("FtbFtb", "FtbFtb",retour);
    }

    @Test
    fun when_7_should_return_Lai() {
        val retour = service.convertNumber(7);
        assertEquals("Lai", "Lai",retour);
    }

    @Test
    fun when_9_should_return_Gbsu() {
        val retour = service.convertNumber(9);
        assertEquals("Gbsu", "Gbsu",retour);
    }

    @Test
    fun when_51_should_return_GbsuFtb() {
        val retour = service.convertNumber(51);
        assertEquals("GbsuFtb", "GbsuFtb",retour);
    }
    @Test
    fun when_53_should_return_FtbGbsu() {
        val retour = service.convertNumber(53);
        assertEquals("FtbGbsu", "FtbGbsu",retour);
    }

    @Test
    fun when_33_should_return_GbsuGbsuGbsu() {
        val retour = service.convertNumber(33);
        assertEquals("GbsuGbsuGbsu", "GbsuGbsuGbsu",retour);
    }

    @Test
    fun when_27_should_return_GbsuLai() {
        val retour = service.convertNumber(27);
        assertEquals("GbsuLai", "GbsuLai",retour);
    }

    @Test
    fun when_15_should_return_GbsuFtbFtb() {
        val retour = service.convertNumber(15);
        assertEquals("GbsuFtbFtb", "GbsuFtbFtb",retour);
    }
}
