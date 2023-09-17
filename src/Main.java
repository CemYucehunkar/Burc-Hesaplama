import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int month, day;

        Scanner input = new Scanner(System.in);

        System.out.print("Ay Seçiniz:");
        month = input.nextInt();

        System.out.print("Gün Seçiniz:");
        day = input.nextInt();


        if (month == 1) {
            if (day >= 1 && day <= 21) {
                System.out.print("Oğlak Burcu");
            } else if (day >= 22 && day <= 31) {
                System.out.print("Kova Burcu");
            }

        }
        if (month == 2) {
            if (day >= 1 && day <= 19) {
                System.out.print("Kova Burcu");
            } else if (day >= 20 && day <= 29) {
                System.out.print("Balık Burcu");
            }

        }
        if (month == 3) {
            if (day >= 1 && day <= 20) {
                System.out.print("Balık Burcu");
            } else if (day >= 21 && day <= 31) {
                System.out.print("Koç Burcu");
            }

        }
        if (month == 4) {
            if (day >= 1 && day <= 20) {
                System.out.print("Koç Burcu");
            } else if (day >= 21 && day <= 31) {
                System.out.print(" Boğa Burcu");
            }

        }
        if (month == 5) {
            if (day >= 1 && day <= 21) {
                System.out.print("Boğa Burcu");
            } else if (day >= 22 && day <= 31) {
                System.out.print("İkizler Burcu");
            }

        }
        if (month == 6) {
            if (day >= 1 && day <= 22) {
                System.out.print("İkizler Burcu");
            } else if (day >= 23 && day <= 31) {
                System.out.print("Yengeç Burcu");
            }

        }
        if (month == 7) {
            if (day >= 1 && day <= 23) {
                System.out.print("Yengeç Burcu");
            } else if (day >= 24 && day <= 31) {
                System.out.print("Aslan Burcu");
            }


        }
        if (month == 8) {
            if (day >= 1 && day <= 22) {
                System.out.print("Aslan Burcu");
            } else if (day >= 23 && day <= 31) {
                System.out.print("Başak Burcu");
            }

        }
        if (month == 9) {
            if (day >= 1 && day <= 22) {
                System.out.print("Başak Burcu");
            } else if (day >= 23 && day <= 31) {
                System.out.print("Terazi Burcu");
            }


        }
        if (month == 10) {
            if (day >= 1 && day <= 22) {
                System.out.print("Terazi Burcu");
            } else if (day >= 23 && day <= 31) {
                System.out.print("Akrep Burcu");
            }

        }
        if (month == 11) {
            if (day >= 1 && day <= 21) {
                System.out.print("Akrep Burcu");
            } else if (day >= 22 && day <= 31) {
                System.out.print("Yay Burcu");
            }

        }
        if (month == 12) {
            if (day >= 1 && day <= 21) {
                System.out.print("Yay Burcu");
            } else if (day >= 22 && day <= 31) {
                System.out.print("Oğlak Burcu");
            }

        }

    }
}