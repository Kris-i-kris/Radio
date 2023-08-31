package org.example;

public class Radio {
    private int maxWave = 9;
    private int minWave = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentWave;
    private int currentVolume;

    public Radio(int maxWave) {
        this.maxWave = maxWave;
        this.currentWave = maxWave;
    }

    public Radio() {
        this.maxWave = maxWave;
    }

    public int getCurrentWave() {
        return currentWave;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxWave() {
        return maxWave;
    }

    public int getMinWave() {
        return minWave;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setCurrentWave(int newCurrentWave) {
        if (newCurrentWave < minWave) {
            newCurrentWave = maxWave;
        }
        if (newCurrentWave > maxWave) {
            newCurrentWave = minWave;
        }
        currentWave = newCurrentWave;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
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
     // public void maxWave() {
    //     currentWave = 9;
    // }

    // public void minWave() {
    //     currentWave = 0;
    // }

    // public void maxVolume() {
    //     currentVolume = 100;
    // }

    // public void minVolume() {
    //     currentVolume = 0;
    // }
}
