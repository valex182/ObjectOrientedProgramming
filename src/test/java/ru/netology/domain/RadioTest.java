package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSelectCorrectStation() {
        Radio radio2 = new Radio();
        radio2.setCurrentStation(6);

        int expected = 6;
        int actual = radio2.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSelectFirstStation() {
        Radio radio2 = new Radio();
        radio2.setCurrentStation(0);

        int expected = 0;
        int actual = radio2.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldSelectLastStation() {
        Radio radio2 = new Radio();
        radio2.setCurrentStation(9);

        int expected = 9;
        int actual = radio2.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationForMinBoundaryValues1() {
        Radio radio2 = new Radio();
        radio2.setCurrentStation(1);

        int expected = 1;
        int actual = radio2.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationForMinBoundaryValues2() {
        Radio radio2 = new Radio();
        radio2.setCurrentStation(-1);

        int expected = 0;
        int actual = radio2.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationForMaxBoundaryValues1() {
        Radio radio2 = new Radio();
        radio2.setCurrentStation(8);

        int expected = 8;
        int actual = radio2.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationForMaxBoundaryValues2() {
        Radio radio2 = new Radio();
        radio2.setCurrentStation(10);

        int expected = 0;
        int actual = radio2.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldSwitchForwardToCorrectStation() {
        Radio radio2 = new Radio();
        radio2.setCurrentStation(4);
        radio2.nextStation();

        int expected = 5;
        int actual = radio2.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchForwardToCorrectStationForBoundaryValues1() {
        Radio radio2 = new Radio();
        radio2.setCurrentStation(9);
        radio2.nextStation();

        int expected = 0;
        int actual = radio2.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchForwardToCorrectStationForBoundaryValues2() {
        Radio radio2 = new Radio();
        radio2.setCurrentStation(8);
        radio2.nextStation();

        int expected = 9;
        int actual = radio2.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchBackToCorrectStation() {
        Radio radio2 = new Radio();
        radio2.setCurrentStation(5);
        radio2.prevStation();

        int expected = 4;
        int actual = radio2.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchBackToCorrectStationForBoundaryValues1() {
        Radio radio2 = new Radio();
        radio2.setCurrentStation(1);
        radio2.prevStation();

        int expeceted = 0;
        int actual = radio2.getCurrentStation();
        assertEquals(expeceted, actual);
    }

    @Test
    public void shouldSwitchBackToCorrectStationForBoundaryValues2() {
        Radio radio2 = new Radio();
        radio2.setCurrentStation(0);
        radio2.prevStation();

        int expeceted = 9;
        int actual = radio2.getCurrentStation();
        assertEquals(expeceted, actual);
    }

    @Test
    public void shouldSelectCorrectVolume() {
        Radio radio2 = new Radio();
        radio2.setCurrentVolume(4);

        int expected = 4;
        int actual = radio2.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSelectCurrentVolumeForMinBoundaryValues1() {
        Radio radio2 = new Radio();
        radio2.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio2.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSelectCurrentVolumeForMinBoundaryValues2() {
        Radio radio2 = new Radio();
        radio2.setCurrentVolume(1);

        int expected = 1;
        int actual = radio2.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSelectCurrentVolumeForMaxBoundaryValues1() {
        Radio radio2 = new Radio();
        radio2.setCurrentVolume(9);

        int expected = 9;
        int actual = radio2.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSelectCurrentVolumeForMaxBoundaryValues2() {
        Radio radio2 = new Radio();
        radio2.setCurrentVolume(11);

        int expected = 0;
        int actual = radio2.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio radio2 = new Radio();
        radio2.setCurrentVolume(10);

        int expected = 10;
        int actual = radio2.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMute() {
        Radio radio2 = new Radio();
        radio2.setCurrentVolume(0);

        int expected = 0;
        int actual = radio2.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeToCorrect() {
        Radio radio2 = new Radio();
        radio2.setCurrentVolume(5);
        radio2.increaseVolume();

        int expected = 6;
        int actual = radio2.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeToCorrectForBoundaryValues1() {
        Radio radio2 = new Radio();
        radio2.setCurrentVolume(10);
        radio2.increaseVolume();

        int expected = 10;
        int actual = radio2.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeToCorrectForBoundaryValues2() {
        Radio radio2 = new Radio();
        radio2.setCurrentVolume(0);
        radio2.increaseVolume();

        int expected = 1;
        int actual = radio2.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeToCorrect() {
        Radio radio2 = new Radio();
        radio2.setCurrentVolume(6);
        radio2.decreaseVolume();

        int expected = 5;
        int actual = radio2.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeToCorrectForBoundaryValues1() {
        Radio radio2 = new Radio();
        radio2.setCurrentVolume(0);
        radio2.decreaseVolume();

        int expected = 0;
        int actual = radio2.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeToCorrectForBoundaryValues2() {
        Radio radio2 = new Radio();
        radio2.setCurrentVolume(10);
        radio2.decreaseVolume();

        int expected = 9;
        int actual = radio2.getCurrentVolume();

        assertEquals(expected, actual);
    }
}