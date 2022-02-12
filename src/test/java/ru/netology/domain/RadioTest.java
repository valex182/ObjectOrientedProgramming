package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    ru.netology.domain.Radio radio2 = new ru.netology.domain.Radio();

    @Test
    public void shouldSelectCorrectStation() {
        radio2.setCurrentStation(6);
        assertEquals(6, radio2.getCurrentStation());
    }

    @Test
    public void shouldSelectFirstStation() {
        radio2.setCurrentStation(11);
        assertEquals(0, radio2.getCurrentStation());
    }

    @Test
    public void shouldSelectLastStation() {
        radio2.setCurrentStation(9);
        assertEquals(9, radio2.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStationForMinBoundaryValues1() {
        radio2.setCurrentStation(1);
        assertEquals(1, radio2.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStationForMinBoundaryValues2() {
        radio2.setCurrentStation(-1);
        assertEquals(0, radio2.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStationForMaxBoundaryValues1() {
        radio2.setCurrentStation(8);
        assertEquals(8, radio2.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStationForMaxBoundaryValues2() {
        radio2.setCurrentStation(10);
        assertEquals(0, radio2.getCurrentStation());
    }

    @Test
    public void shouldSwitchForwardToCorrectStation() {
        radio2.setCurrentStation(4);
        radio2.nextStation();
        assertEquals(5, radio2.getCurrentStation());
    }

    @Test
    public void shouldSwitchForwardToCorrectStationForBoundaryValues1() {
        radio2.setCurrentStation(9);
        radio2.nextStation();
        assertEquals(0, radio2.getCurrentStation());
    }

    @Test
    public void shouldSwitchForwardToCorrectStationForBoundaryValues2() {
        radio2.setCurrentStation(8);
        radio2.nextStation();
        assertEquals(9, radio2.getCurrentStation());
    }

    @Test
    public void shouldSwitchBackToCorrectStation() {
        radio2.setCurrentStation(5);
        radio2.prevStation();
        assertEquals(4, radio2.getCurrentStation());
    }

    @Test
    public void shouldSwitchBackToCorrectStationForBoundaryValues1() {
        radio2.setCurrentStation(1);
        radio2.prevStation();
        assertEquals(0, radio2.getCurrentStation());
    }

    @Test
    public void shouldSwitchBackToCorrectStationForBoundaryValues2() {
        radio2.setCurrentStation(0);
        radio2.prevStation();
        assertEquals(9, radio2.getCurrentStation());
    }

    @Test
    public void shouldSelectCorrectVolume() {
        radio2.setCurrentVolume(4);
        assertEquals(4, radio2.getCurrentVolume());
    }

    @Test
    public void shouldSelectCurrentVolumeForMinBoundaryValues1() {
        radio2.setCurrentVolume(-1);
        assertEquals(0, radio2.getCurrentVolume());
    }

    @Test
    public void shouldSelectCurrentVolumeForMinBoundaryValues2() {
        radio2.setCurrentVolume(1);
        assertEquals(1, radio2.getCurrentVolume());
    }

    @Test
    public void shouldSelectCurrentVolumeForMaxBoundaryValues1() {
        radio2.setCurrentVolume(9);
        assertEquals(9, radio2.getCurrentVolume());
    }

    @Test
    public void shouldSelectCurrentVolumeForMaxBoundaryValues2() {
        radio2.setCurrentVolume(101);
        assertEquals(0, radio2.getCurrentVolume());
    }

    @Test
    public void shouldSetMaxVolume() {
        radio2.setCurrentVolume(100);
        assertEquals(100, radio2.getCurrentVolume());
    }

    @Test
    public void shouldMute() {
        radio2.setCurrentVolume(0);
        assertEquals(0, radio2.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeToCorrect() {
        radio2.setCurrentVolume(55);
        radio2.increaseVolume();
        assertEquals(56, radio2.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeToCorrectForBoundaryValues1() {
        radio2.setCurrentVolume(100);
        radio2.increaseVolume();
        assertEquals(100, radio2.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeToCorrectForBoundaryValues2() {
        radio2.setCurrentVolume(0);
        radio2.increaseVolume();
        assertEquals(1, radio2.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeToCorrect() {
        radio2.setCurrentVolume(56);
        radio2.decreaseVolume();
        assertEquals(55, radio2.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeToCorrectForBoundaryValues1() {
        radio2.setCurrentVolume(0);
        radio2.decreaseVolume();
        assertEquals(0, radio2.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeToCorrectForBoundaryValues2() {
        radio2.setCurrentVolume(100);
        radio2.decreaseVolume();
        assertEquals(99, radio2.getCurrentVolume());
    }
}