package training5;

public class WordEntryCount {
    public static void main(String[] args) {
        String str = "Однажды весною, в час небывало жаркого заката, в Москве, на Патриарших прудах, появились два гражданина. \n" +
                "Первый из них, одетый в летнюю серенькую пару, был маленького роста, упитан, лыс, свою приличную шляпу пирожком нес в руке, \n" +
                "а на хорошо выбритом лице его помещались сверхъестественных размеров очки в черной роговой оправе. Второй – плечистый, рыжеватый, \n" +
                "вихрастый молодой человек в заломленной на затылок клетчатой кепке – был в ковбойке, жеваных белых брюках и в черных тапочках.\n";
        String entry = "был";


        // вариант через сплит
        String[] splitArray = str.split(entry);
        System.out.println("Вхождений подстроки : " + entry + " " + (splitArray.length - 1));


        //через indexOf String
        int count =0;
        for (int i = str.indexOf(entry); i>=0; i=str.indexOf(entry, i+1))
            count++;

        System.out.println("Вхождений подстроки : " + entry + " "+ count);



    }
}
