package org.example;

public class Radio {
    public int currentWave;

    public int getCurrentWave() {
        return currentWave;
    }

    public void setCurrentWave(int newCurrentWave) {
        if (newCurrentWave < 0) {
            return;
        }
        if (newCurrentWave > 9) {
            return;
        }
        currentWave = newCurrentWave;
    }

    public void setCurrentWaveNext(int newCurrentWave) {
        if (newCurrentWave == 9) {
            newCurrentWave = 0;
        } else {
            newCurrentWave += 1;
        }
        currentWave = newCurrentWave;

    }

    public void setCurrentWavePrev(int newCurrentWave) {
        if (newCurrentWave == 0) {
            newCurrentWave = 9;
        } else {
            newCurrentWave -= 1;
        }
        currentWave = newCurrentWave;
    }

    public int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume > 100) {
            newVolume = 100;
        }
        if (newVolume < 0) {
            newVolume = 0;
        }
        volume = newVolume;
    }

    public void setVolumePlus(int newVolume) {
        if (newVolume < 100) {
            newVolume += 1;
        }
        volume = newVolume;
    }

    public void setVolumeMinus(int newVolume) {
        if (newVolume > 0) {
            newVolume -= 1;
        }
        volume = newVolume;
    }
}
