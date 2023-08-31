package org.example;

public class Radio {
    private int currentWave;
    private int currentVolume;

    public int getCurrentWave() {
        return currentWave;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentWave(int newCurrentWave) {
        if (newCurrentWave < 0) {
            newCurrentWave = 9;
        }
        if (newCurrentWave > 9) {
            newCurrentWave = 0;
        }
        currentWave = newCurrentWave;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void maxWave() {
        currentWave = 9;
    }

    public void minWave() {
        currentWave = 0;
    }

    public void maxVolume() {
        currentVolume = 100;
    }

    public void minVolume() {
        currentVolume = 0;
    }

    public void increaseWaveOn1() {
        int target = currentWave + 1;
        setCurrentWave(target);
    }

    public void reductionWaveOn1() {
        int target = currentWave - 1;
        setCurrentWave(target);
    }

    public void increaseVolumeOn1() {
        int target = currentVolume + 1;
        setCurrentVolume(target);
    }

    public void reductionVolumeOn1() {
        int target = currentVolume - 1;
        setCurrentVolume(target);
    }
}
