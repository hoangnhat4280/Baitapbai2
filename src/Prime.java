import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Tong so le");
        System.out.println("2. Kiem tra so nguyen");
        System.out.println("3. In so ngay moi thang");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                int n = sc.nextInt();
                while (n <= 10 || n >= 100) {
                    System.out.println("Nhap lai n (n > 10 và n < 100): ");
                    n = sc.nextInt();

                    int sum = 0;
                    for (int i = 1; i <= n; i++) {
                        if (i % 2 != 0) {
                            sum += i;
                        }
                    }
                    System.out.println("Tong so le tu 1 den " + n + " la: " + sum);
                    break;
                }
            case 2:
                int number = sc.nextInt();
                while (number <= 0) {
                    System.out.println("Nhap lai so (n > 0): ");
                    number = sc.nextInt();
                }
                if (number < 2) {
                    System.out.println(number + " không phải là số nguyên tố.");
                } else {
                    boolean check = true;
                    int i = 2;
                    while (i <= Math.sqrt(number)) {
                        if (number % i == 0) {
                            check = false;
                            break;
                        }
                        i++;
                    }
                    if (check) {
                        System.out.println(number + " la so nguyen to.");
                    } else {
                        System.out.println(number + " khong phai la so nguyen to.");
                        break;
                    }
                }
            case 3:
                int month = 0;
                System.out.print("Nhap so thang: ");
                while (month < 1 || month > 12) {
                    System.out.println("Nhap lai so thang (1 - 12): ");
                    month = sc.nextInt();
                    switch (month) {
                        case 2:
                            System.out.println("Thang" + month + " co 28 hoac 29 ngay");
                            break;
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            System.out.println("Thang " + month + " co 31 ngay");
                            break;
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            System.out.println("Thang " + month + " co 30 ngay");
                            break;
                    }

                }
        }
    }
}












