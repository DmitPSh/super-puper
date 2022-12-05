

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;



public class MyClass {

    static String [] rome = {"0","I", "II", "III", "IV", "V", "VI", "VII",
            "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII",
            "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII",
            "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI",
            "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV",
            "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV",
            "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV",
            "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV",
            "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII",
            "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX",
            "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII",
            "XCIX","C"};

    static String [] arab={"0","1", "2", "3","4","5","6","7","8","9","10", "11",
            "12", "13","14","15","16","17","18","19","20", "21", "22",
            "23","24","25","26","27","28","29","30", "31", "32",
            "33","34","35","36","37","38","39","40", "41", "42",
            "43","44","45","46","47","48","49","50", "51", "52",
            "53","54","55","56","57","58","59","60", "61", "62",
            "63","64","65","66","67","68","69","70", "71", "72",
            "73","74","75","76","77","78","79","80", "81", "82",
            "83","84","85","86","87","88","89","90", "91", "92",
            "93","94","95","96","97","98","99","100",};





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        int number1 = 0; int number2=0;
        String s, strNumber1, strOperator,strNumber2;
        String [] a = arab.clone();  String [] b = rome.clone(); // клоны...типа ...на всякий случай...и из любопытства :-)
        List<String> arabList = Arrays.asList(a); List<String> romeList = Arrays.asList(b);// C коллекциями до сих пор  :-0..только из-за метода 'contains'

        System.out.println("Условия тестового задания:"
                + "\r\n"
                + "1. Калькулятор умеет выполнять операции:\r\n"
                + "   сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b. \r\n"
                + "   Данные передаются в одну строку . \r\n"
                + "2. Решения, в которых каждое число и арифмитеческая операция передаются с новой строки считаются неверными.\r\n"
                + "3. Калькулятор умеет работать как с арабскими (1,2,3,4,5…), так и с римскими (I,II,III,IV,V…) числами.\r\n"
                + "4. Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.(коммент.исполнителя ..возможно <=100.) \r\n"
                + "   На выходе числа не ограничиваются по величине и могут быть любыми.\r\n"
                + "5. Калькулятор умеет работать только с целыми числами.\r\n"
                + "6. Калькулятор умеет работать только с арабскими или римскими цифрами одновременно, \r\n"
                + "   при вводе пользователем строки вроде 3 + II калькулятор должен выбросить исключение и прекратить свою работу.\r\n"
                + "7. При вводе римских чисел, ответ должен быть выведен римскими цифрами, \r\n"
                + "   соответственно, при вводе арабских - ответ ожидается арабскими.\r\n"
                + "8. При вводе пользователем неподходящих чисел приложение выбрасывает исключение и завершает свою работу.\r\n"
                + "9. При вводе пользователем строки, не соответствующей одной из вышеописанных арифметических операций, \r\n"
                + "   приложение выбрасывает исключение и завершает свою работу.\r\n"
                + "10.Результатом операции деления является целое число, остаток отбрасывается. \r\n"
                + "11.Результатом работы калькулятора с арабскими числами могут быть отрицательные числа и ноль. \r\n"
                + "   Результатом работы калькулятора с римскими числами могут быть только положительные числа, \r\n"
                + "   если результат работы меньше единицы, выбрасывается исключение.\r\n"
                + " ********  P.S.(от исполнителя)   код без рекурсии - прог..у перезапускать.******* ");

        System.out.println("\n\nДля продолжения нажмите \"Enter\" ");
        try
        {
            System.in.read();
            sc.nextLine();
        }
        catch(Exception e)
        {}
        System.out.println("Введите арифметическое выражение ");
        s =  sc.nextLine();


        char[] arr = s.toCharArray(); int indexOperator = 0; int x = 0;

        for(char j: arr) {
            if(j=='*'|| j=='/'||j=='+' || j=='-') {
                indexOperator= x;
            } else x++; }

        int indexRomeNumber1=0;
        int indexRomeNumber2=0;
        strNumber1 = s.substring(0, indexOperator);
        strNumber2 = s.substring(indexOperator+1, s.length());
        strOperator = s.substring(indexOperator,indexOperator+1);



// первое включение!	
        if (romeList.contains(strNumber1) && romeList.contains(strNumber2)){
            int indexstrNumber1;
           // int y=0;

            int x1 = 0;
            for (int i=0; i<100; i++) {
                if(strNumber1.equals(rome[i])) {
                    indexRomeNumber1 = x1 ;

                    break;
                }
                else x1++;
            }
            int x2 = 0;
            for (int i=0; i<100; i++) {
                if(strNumber2.equals(rome[i])) {
                    indexRomeNumber2 = x2;

                    break;
                }
                else x2++;
            }


            switch (strOperator){
                case "+":
                    result = Integer.parseInt(arab[indexRomeNumber1]) + Integer.parseInt(arab[indexRomeNumber2]);
                    break;
                case "-":
                    result = Integer.parseInt(arab[indexRomeNumber1]) - Integer.parseInt(arab[indexRomeNumber2]);
                    break;
                case "*":
                    result = Integer.parseInt(arab[indexRomeNumber1]) * Integer.parseInt(arab[indexRomeNumber2]);
                    break;
                case "/":
                    result = Integer.parseInt(arab[indexRomeNumber1]) / Integer.parseInt(arab[indexRomeNumber2]);
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");
            }

            System.out.println("Результат выражения "+strNumber1+strOperator+strNumber2+" = "+ rome[result] );
            System.out.println("Для  повторения -  перезапустить код.");
        }
        // второе  включение!
        else if(arabList.contains(strNumber1) && arabList.contains(strNumber2)) {
            // System.out.println ((arabList.contains(strNumber1) && arabList.contains(strNumber2)));


            number1=Integer.parseInt(strNumber1,10);
            number2=Integer.parseInt(strNumber2,10);

            switch (strOperator){
                case "+":
                    result = number1+number2;
                    break;
                case "-":
                    result = number1-number2;
                    break;
                case "*":
                    result = number1*number2;
                    break;
                case "/":

                    if(number2 == 0) {
                        try {
                            result=number1/number2;
                            System.out.println("number2 = " + number2);
                        }
                        catch (ArithmeticException e) {
                            System.out.println("Нельзя делить на 0.\n Перезапустите код и введите корректное выражение.");
                        }
                    }
                    result=number1/number2;
						
                    break;
                    default:
                    System.out.println("Операция не распознана. Повторите ввод.");
            }

            System.out.printf("Результат операции %d  %s  %d  = %d", number1,strOperator,number2,result);
            System.out.println("\nДля  повторения -  перезапустить код.");
        }

        else

            System.out.println("Операция не распознана. Повторите ввод.");
        sc.close();


    }

}		 

