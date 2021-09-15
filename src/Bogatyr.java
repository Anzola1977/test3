public class Bogatyr {
    int golovaB = 1;

    public void idtiBitGorynycha() {
        System.out.println("Выходим из Киева...");
        System.out.println("Идем на Кудыкину гору...");
        System.out.println("Садимся на коня...");
        System.out.println("Где эта змеюка...?");
    }

    public void golovy() {
        if (golovaB > 1) {
            System.out.println("Одна голова хорошо, а три - уже Горыныч.");
        }
    }

    public void Bitva() {
        int udar = 1;
        byte dpt = 0; // Damage Per Turn
        while (dpt <= 3) {
            dpt += udar;
            System.out.println("Минус одна голова...");
            System.out.println("Суммарный урон: " + dpt);

            if (dpt == 3) {
                System.out.println("Горыныч побежден.");
            }
        }
    }
}

