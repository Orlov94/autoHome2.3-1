package ru.netology.delivery.data;

import com.github.javafaker.Faker;
import lombok.Value;
import lombok.val;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public class DataGenerator {
    private DataGenerator() {
    }

    public static String generateDate(int day) {
        return LocalDate.now().plusDays(day).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public static String generateAddress(String local) {
        Faker faker = new Faker(new Locale(local));
        return faker.address().cityName();
    }

    public static String generateName(String local) {
        Faker faker = new Faker(new Locale(local));
        return faker.name().fullName();

    }

    public static String generatePhone(String local) {
        Faker faker = new Faker(new Locale(local));
        return faker.phoneNumber().phoneNumber();
    }


}
