public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setGender('M');
        person1.setCharacter("Ак конул");
        person1.setWeight(60);

        Person person2 = new Person();
        person2.setGender('Ж');
        person2.setCharacter("Мееримдуу");
        person2.setWeight(48);

        Person person3 = new Person();
        person3.setGender('M');
        person3.setCharacter("Сынчы");
        person3.setWeight(50);

        Address address1 = new Address();
        address1.setGmail("halikovamadina456@gmail.com");
        address1.setHouseNumber(12);

        Address address2 = new Address();
        address2.setGmail("Baltabaeva354@gmail.com");
        address2.setHouseNumber(9);

        Address address3 = new Address();
        address3.setGmail("Asema712A@gmail.com");
        address3.setHouseNumber(3);


        Country country1 = new Country();
        country1.setName("Гондурас");
        country1.setPopulationNumberOf( 9890400);

        Country country2 = new Country();
        country2.setName("Ливия");
        country2.setPopulationNumberOf( 6871287);

        Country country3 = new Country();
        country3.setName("Сальвадор");
        country3.setPopulationNumberOf( 6486201);



        City city1 = new City();
        city1.setNames("Баткен");

        City city2 = new City();
        city2.setNames("Раззаков");

        City city3 = new City();
        city3.setNames("Кадамжай");

        Person[] arreyperson= {person1,person2,person3};
        for (Person i:arreyperson) {
            System.out.println("Gender is: "+i.getGender()+" Character is: "+i.getCharacter()+" Weight is:"+i.getWeight());
        }
        System.out.println("_________________________________________________________________________");
        Address[] arreyaddress = {address1,address2,address3};
        for (Address y:arreyaddress) {
            System.out.println("Gmail is: "+y.getGmail()+" HouseNumber is: "+y.getHouseNumber());
        }
        System.out.println("__________________________________________________________________________");
        Country[] arreycountry = {country1,country2,country3};
        for (Country w:arreycountry) {
            System.out.println("Name is: "+w.getName()+" PopulationNumberOf is: "+w.getPopulationNumberOf());
        }
        System.out.println("--------------------------------------------------------------------------");
        City[] arreycity = {city1,city2,city3};
        for (City v:arreycity) {
            System.out.println("Names is: "+v.getNames());
        }
    }
}