public class Main {
    public static void main(String[] args) {
     //Задача 1
     System.out.println("Задача 1");
     int a = 252000;
     byte b = 100;
     short c = 3000;
     long d = 44326626L;
     float e = 56.65f;
     double f = 26.5456d;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

     //Задача 2
     System.out.println( "Задача 2");
     float A = 27.12f;
     long B = 987678965549L;
     byte C = 2;
     short D = 786;
     boolean E = false;
     short F = 569;
     short G = -159;
     short H = 27897;
     byte I = 67;

     //Задача 3
     System.out.println( "Задача 3");
     byte teacherLP = 23;
     byte teacherAS = 27;
     byte teacherEA = 30;
     short allPaper = 480;
     System.out.println("На каждого ученика рассчитано " + (allPaper/(teacherLP+teacherAS+teacherEA)) + " листов бумаги.");

     //Задача 4
     System.out.println("Задача 4");
        byte productionTime = 2;
        byte bottleCount = 16;
        byte productionTime1 = 20;
        int bottleCount1 = productionTime1 / productionTime * bottleCount;
        System.out.println("За 20 минут машина произвела бутылок " + bottleCount1 + " штук.");
        int productionTime2 = 1440;
        int bottleCount2 = productionTime2 / productionTime * bottleCount;
        System.out.println("За сутки машина произвела бутылок " + bottleCount2 + " штук.");
        int bottleCount3 = bottleCount2 * 3;
        System.out.println("За 3 дня машина произвела бутылок " + bottleCount3 + " штук.");
        int bottleCount4 = 10 * bottleCount3;
        System.out.println("За 30 дней машина произвела бутылок " + bottleCount4 + " штук.");

     //Задача 5
        System.out.println("Задача 5");
        byte vsegoKraski = 120;
        byte na1KlassWhite = 2;
        byte na1KlassBrown = 4;
        System.out.println("В школе, где "+ (vsegoKraski / (na1KlassWhite + na1KlassBrown)) + " классов, нужно "
                + ((vsegoKraski / (na1KlassWhite + na1KlassBrown))*2) + " банок белой краски и " +
                ((vsegoKraski / (na1KlassWhite + na1KlassBrown))*4) + " банок коричневой краски.");

     //Задача 6
     System.out.println("Задача 6");
     byte Bananas = 5;
     byte oneBananaWeight = 80;
     short milk100 = 2;
     short milkWeight100 = 105;
     short iceСream = 2;
     short oneIceCreamWeight = 100;
     short eggs = 4;
     short oneEggWeight = 70;
     int breatfestWeight = Bananas * oneBananaWeight + milk100 * milkWeight100 +
             iceСream * oneIceCreamWeight + eggs * oneEggWeight;
     float breatfestWeight1 = breatfestWeight / 1000f;
     System.out.println("Вес готового спорт-завтрака " + breatfestWeight + " грамм, или " +
             breatfestWeight1 + " килограмм.");

     //Задача 7
        System.out.println("Задача 7");
        short overWeight = 7000;
        short weightLoss1 = 250;
        short weightLoss2 = 500;
        System.out.println("Если спортсмен будет терять по 250 грамм в день, " +
                "то для достижения результата ему потребуется " + (overWeight / weightLoss1) + " дней.");
        System.out.println("Если спортсмен будет терять по 500 грамм в день, " +
                "то для достижения результата ему потребуется " + (overWeight / weightLoss2) + " дней.");
        System.out.println("В среднем для достижения результата потребуется " +
                (((overWeight / weightLoss1) + (overWeight / weightLoss2)) / 2) + " дней.");

     //Задача 8
     System.out.println("Задача 8");
        int mashaMonth = 67760;
        int denisMonth = 83690;
        int krisMonth = 76230;
        int mashaMonth1 = mashaMonth / 10 + mashaMonth;
        int denisMonth1 = denisMonth /10 + denisMonth;
        int krisMonth1 = krisMonth /10 + krisMonth;
        int mashaYear = mashaMonth * 12;
        int denisYear = denisMonth * 12;
        int krisYear = krisMonth * 12;
        int mashaYear1 = mashaMonth1 * 12;
        int denisYear1 = denisMonth1 * 12;
        int krisYear1 = krisMonth1 * 12;
        System.out.println("Маша теперь получает " + mashaMonth1 + ". Годовой доход вырос на " + (mashaYear1 - mashaYear) + " рублей.");
        System.out.println("Денис теперь получает " + denisMonth1 + ". Годовой доход вырос на " + (denisYear1 - denisYear) + " рублей.");
        System.out.println("Кристина теперь получает " + krisMonth1 + ". Годовой доход вырос на " + (krisYear1 - krisYear) + " рублей.");







    }
}