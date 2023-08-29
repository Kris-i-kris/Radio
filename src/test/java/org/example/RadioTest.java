package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void currentWaveMax() {
        Radio radio = new Radio();
        radio.setCurrentWave(10);

        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void currentWaveMin() {
        Radio radio = new Radio();
        radio.setCurrentWave(-1);

        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void currentWave() {
        Radio radio = new Radio();
        radio.setCurrentWave(9);

        int expected = 9;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void currentWaveNextMax() {
        Radio radio = new Radio();
        radio.setCurrentWaveNext(9);

        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentWaveNext() {
        Radio radio = new Radio();
        radio.setCurrentWaveNext(5);

        int expected = 6;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void currentWavePrevMin() {
        Radio radio = new Radio();
        radio.setCurrentWavePrev(0);

        int expected = 9;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentWavePrev() {
        Radio radio = new Radio();
        radio.setCurrentWavePrev(5);

        int expected = 4;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeMax() {
        Radio radio = new Radio();
        radio.setVolume(120);

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volumeMin() {
        Radio radio = new Radio();
        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volume() {
        Radio radio = new Radio();
        radio.setVolume(80);

        int expected = 80;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volumePlusMax() {
        Radio radio = new Radio();
        radio.setVolumePlus(100);

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumePlus() {
        Radio radio = new Radio();
        radio.setVolumePlus(80);

        int expected = 81;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volumeMinus() {
        Radio radio = new Radio();
        radio.setVolumeMinus(81);

        int expected = 80;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volumeMinusMin() {
        Radio radio = new Radio();
        radio.setVolumeMinus(0);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }
}


