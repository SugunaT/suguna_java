package day14;

import com.github.javafaker.Faker;

public class FakerLibraries
{
    public static void main(String[] args)
    {
        // Java faker -gives you realtime look like data

        Faker faker = new Faker();
        System.out.println(faker.name().firstName());
        System.out.println(faker.name().lastName());
        System.out.println(faker.name().fullName());
        System.out.println(faker.address().fullAddress());
        System.out.println(faker.address().secondaryAddress());
        System.out.println(faker.address().city());
        System.out.println(faker.address().zipCode());
        System.out.println(faker.address().timeZone());
        System.out.println(faker.business().creditCardType());
        System.out.println(faker.business().creditCardNumber());
        System.out.println(faker.business().creditCardExpiry());
        System.out.println(faker.company().name());
        System.out.println(faker.avatar().image());
        System.out.println(faker.demographic().educationalAttainment());
    }
}
