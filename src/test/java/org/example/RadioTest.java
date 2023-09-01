package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetWave() {
        Radio rad = new Radio();

        rad.setCurrentWave(5);

        Assertions.assertEquals(5, rad.getCurrentWave());
    }
    
    @Test
    public void shouldSetQuantityRadioWave() {
        Radio rad = new Radio();

        Assertions.assertEquals(10, rad.getQuantityRadioWave());
    }

    @Test
    public void shouldSetQuantityRadioWave() {
        Radio rad = new Radio(100);

        Assertions.assertEquals(100, rad.getQuantityRadioWave());
    }

    @Test
    public void shouldSetWaveCon() {
        Radio rad = new Radio(100);

        rad.setCurrentWave(77);

        Assertions.assertEquals(77, rad.getCurrentWave());
    }

    @Test
    public void shouldSetVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(25);

        Assertions.assertEquals(25, rad.getCurrentVolume());
    }

    @Test
    public void shouldSetMaxWave() {
        Radio rad = new Radio();

        Assertions.assertEquals(9, rad.getMaxWave());
    }

    @Test
    public void shouldSetMaxWaveCon() {
        Radio rad = new Radio(100);

        Assertions.assertEquals(99, rad.getMaxWave());
    }

    @Test
    public void shouldSetMinWave() {
        Radio rad = new Radio();

        Assertions.assertEquals(0, rad.getMinWave());
    }


    @Test
    public void shouldSetMaxVolume() {
        Radio rad = new Radio();

        Assertions.assertEquals(100, rad.getMaxVolume());
    }

    @Test
    public void shouldSetMinVolume() {
        Radio rad = new Radio();

        Assertions.assertEquals(0, rad.getMinVolume());
    }

    @Test
    public void shouldNotSetWaveAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentWave(10);

        Assertions.assertEquals(0, rad.getCurrentWave());

    }

    @Test
    public void shouldNotSetWaveAboveMaxCon() {
        Radio rad = new Radio(101);

        rad.setCurrentWave(101);

        Assertions.assertEquals(0, rad.getCurrentWave());

    }

    @Test
    public void increaseWaveOn1() {
        Radio rad = new Radio();
        rad.setCurrentWave(9);

        rad.increaseWaveOn1();

        Assertions.assertEquals(0, rad.getCurrentWave());
    }

    @Test
    public void increaseWaveOn1Con() {
        Radio rad = new Radio(100);
        rad.setCurrentWave(99);

        rad.increaseWaveOn1();

        Assertions.assertEquals(0, rad.getCurrentWave());
    }

    @Test
    public void reductionWaveOn1() {
        Radio rad = new Radio();
        rad.setCurrentWave(0);

        rad.reductionWaveOn1();

        Assertions.assertEquals(9, rad.getCurrentWave());
    }

    @Test
    public void reductionWaveOn1Con() {
        Radio rad = new Radio(100);
        rad.setCurrentWave(0);

        rad.reductionWaveOn1();

        Assertions.assertEquals(99, rad.getCurrentWave());
    }

    @Test
    public void increaseVolumeOn1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.increaseVolumeOn1();

        Assertions.assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    public void reductionVolumeOn1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.reductionVolumeOn1();

        Assertions.assertEquals(0, rad.getCurrentVolume());
    }
}




