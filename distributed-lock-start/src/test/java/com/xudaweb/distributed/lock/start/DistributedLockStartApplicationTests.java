package com.xudaweb.distributed.lock.start;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DistributedLockStartApplicationTests {

    @Test
    public void contextLoads() {
    }


    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(new Car[]{ new Car("dazhong", "small"), new Car("BMW", "big") });


        cars.stream().map(car -> new CarVo(car.getBand(), car.getSize().equals("small") ? 1 : car.getSize().equals("big") ? 3 : 2)).forEach(carVo -> {System.out.println(carVo);});

    }

    static class Car {
        private String band;
        private String size; // big middle small

        public Car(String band, String size) {
            this.band = band;
            this.size = size;
        }

        public void setBand(String band) {
            this.band = band;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getBand() {
            return band;
        }

        public String getSize() {
            return size;
        }

        @Override
        public String toString() {
            return "car:{band: " + this.band + ", size: " + this.size + "}";
        }
    }

    static class CarVo {
        private String band;
        private int size; // big 3 middle 2 small 1

        public CarVo(String band, int size) {
            this.band = band;
            this.size = size;
        }

        public void setBand(String band) {
            this.band = band;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public String getBand() {
            return band;
        }

        public int getSize() {
            return size;
        }

        @Override
        public String toString() {
            return "car:{band: " + this.band + ", size: " + this.size + "}";
        }
    }
}
