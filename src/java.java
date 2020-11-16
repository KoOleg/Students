
public class ran {
        public int getRandomInteger() {
            Random random = new Random(); //генератор рандомных чисел
            int result = random.nextInt(); //сгенерировать число
            System.out.println(result);
            return result; //возвращение результата
        }
    }
