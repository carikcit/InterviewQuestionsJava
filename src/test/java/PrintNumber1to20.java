public class PrintNumber1to20 {
    /*
    Write a program that prints number 1 to 20
    For multiples of 3 print usb instead of number and
    multiples of 5 print device,
    For number multiples of both 3 and 5 print usbdevice



     */
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("usbdevice");
            } else if (i % 3 == 0) {
                System.out.println("usb");
            } else if (i % 5 == 0) {
                System.out.println("device");
            } else {
                System.out.println(i);
            }
        }
    }
}


