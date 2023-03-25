package skypro;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestDailyPlanner {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        System.out.println("=====Ежедневник. Записывайте свои планы на будущие=====");
        String choiceClose = "н";
        String answer;
//        Task diary = new Task("kkpp","kkkkk", Type.work,Appearsln.DailyTask);

        Map<Integer, String> choise = new HashMap<>();
        do {

            System.out.println();
            System.out.println("Выберите события: \n" +
                    "1. Здоровье, \n" +
                    "2. Отдых, \n" +
                    "3. Работа, \n" +
                    "4. Семья, \n" +
                    "5. Хобби.\n");

            Map<Integer, String> choiseTitle = new HashMap<>();
            choiseTitle.put(1, "Здоровье");
            choiseTitle.put(2, "Отдых");
            choiseTitle.put(3, "Работа");
            choiseTitle.put(4, "Семья");
            choiseTitle.put(5, "Хобби");

            int titles = skanner.nextInt();

            choise.put(1, choiseTitle.get(titles));

            String elementTitles = choiseTitle.get(titles);
            System.out.println("Вы выбрали " + choiseTitle.get(titles) + " \n");
            /////////////////////////////////////////////////////////////////////////////////
            System.out.println("Описание события\n");

            String descriptors = skanner.next();
            choise.put(2, descriptors);

            /////////////////////////////////////////////////////////////////////////////////
            Map<Integer, String> choiseType = new HashMap<>();
            choiseType.put(1, "Работа");
            choiseType.put(2, "Личное");

            System.out.println("Выберите тип события: \n" +
                    "1.Работа, \n" +
                    "2.Личное \n");

            int types = skanner.nextInt();

            choise.put(3, choiseType.get(types));
            String elementTypes = choiseType.get(types);
            System.out.println(elementTypes+"------");

            System.out.println("Вы выбрали " + choiseType.get(types));
            ///////////////////////////////////////////////////////////////////////////////////

            Map<Integer, String> choiseAppears = new HashMap<>();
            choiseAppears.put(1, "Здоровье");
            choiseAppears.put(2, "Отдых");
            choiseAppears.put(3, "Работа");
            choiseAppears.put(4, "Семья");
            choiseAppears.put(5, "Хобби");
            System.out.println("Выберите тип события: \n" +
                    "1.Однократная, \n" +
                    "2.Ежедневная \n" +
                    "3.Еженедельная, \n" +
                    "4.Ежемесячная, \n" +
                    "5.Ежегодная, \n");

            int appearslns = skanner.nextInt();
            choise.put(4, choiseAppears.get(appearslns));
            String elementAppearslns = choiseTitle.get(appearslns);

            System.out.println("Вы выбрали " + choiseAppears.get(appearslns) + "\n");
            ////////////////////////

            System.out.println("Если вы закончили напишите 'д'. если нет напишите 'н' ");
            answer = skanner.next();

            Task diary = new Task(choiseTitle.get(titles), choiseTitle.get(descriptors), Type.valueOf(choiseType.get(elementTypes)), Appearsln.valueOf(choiseAppears.get(appearslns)));
        } while (choiceClose.equals(answer));

        for (Map.Entry m : choise.entrySet())
            System.out.println(m.getKey() + " ," + m.getValue());
    }

}
