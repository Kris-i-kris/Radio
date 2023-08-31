package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shodSetWave() {
        Radio rad = new Radio();

        rad.setCurrentWave(5);

        int expected = 5;
        int actual = rad.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(25);

        int expected = 25;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxWave() {
        Radio rad = new Radio();

        rad.maxWave();

        int expected = 9;
        int actual = rad.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinWave() {
        Radio rad = new Radio();

        rad.minWave();

        int expected = 0;
        int actual = rad.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio rad = new Radio();

        rad.maxVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        Radio rad = new Radio();

        rad.minVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetWaveAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentWave(10);

        int expected = 0;
        int actual = rad.getCurrentWave();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseWaveOn1() {
        Radio rad = new Radio();
        rad.setCurrentWave(9);

        rad.increaseWaveOn1();

        int expected = 0;
        int actual = rad.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionWaveOn1() {
        Radio rad = new Radio();
        rad.setCurrentWave(0);

        rad.reductionWaveOn1();

        int expected = 9;
        int actual = rad.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeOn1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.increaseVolumeOn1();

        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionVolumeOn1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.reductionVolumeOn1();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}


