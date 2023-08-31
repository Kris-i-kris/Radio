package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    
    @Test
    public void shodSetWave() {
        Radio rad = new Radio();

        rad.setCurrentWave(5);

        Assertions.assertEquals(5, rad.getCurrentWave());
    }

     @Test
    public void shodSetWave() {
        Radio rad = new Radio(101);

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
        
        Assertions.assertEquals(9, rad.maxWave());
    }

     @Test
    public void shouldSetMaxWave() {
        Radio rad = new Radio(101);

        Assertions.assertEquals(100, rad.maxWave());
    }

    @Test
    public void shouldSetMinWave() {
        Radio rad = new Radio();

        Assertions.assertEquals(0, rad.minWave());
    }


    @Test
    public void shouldSetMaxVolume() {
        Radio rad = new Radio();

        Assertions.assertEquals(100, rad.maxVolume());
    }

    @Test
    public void shouldSetMinVolume() {
        Radio rad = new Radio();

        Assertions.assertEquals(0, rad.minVolume());
    }

    @Test
    public void shouldNotSetWaveAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentWave(10);

        Assertions.assertEquals(0, rad.getCurrentWave());

    }

    @Test
    public void shouldNotSetWaveAboveMax() {
        Radio rad = new Radio(101);

        rad.setCurrentWave(101);

        Assertions.assertEquals(0, rad.getCurrentWave());

    }

    @Test
    public void increaseWaveOn1() {
        Radio rad = new Radio();
        rad.setCurrentWave(9);

        Assertions.assertEquals(0, rad.increaseWaveOn1());
    }

    @Test
    public void increaseWaveOn1() {
        Radio rad = new Radio(101);
        rad.setCurrentWave(100);

        Assertions.assertEquals(0, rad.increaseWaveOn1());
    }

    @Test
    public void reductionWaveOn1() {
        Radio rad = new Radio();
        rad.setCurrentWave(0);

        Assertions.assertEquals(9, rad.reductionWaveOn1());
    }

     @Test
    public void reductionWaveOn1() {
        Radio rad = new Radio(101);
        rad.setCurrentWave(0);

        Assertions.assertEquals(100, rad.reductionWaveOn1());
    }

    @Test
    public void increaseVolumeOn1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        
        Assertions.assertEquals(100, rad.increaseVolumeOn1());
    }

    @Test
    public void reductionVolumeOn1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        Assertions.assertEquals(0, rad.reductionVolumeOn1());
    }
}


