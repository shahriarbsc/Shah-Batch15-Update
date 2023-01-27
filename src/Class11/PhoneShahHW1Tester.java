package Class11;
public class PhoneShahHW1Tester {
    public static void main(String[] args) {

        PhoneShahHW1 iphone =new PhoneShahHW1();
        iphone.name = "Iphone";
        iphone.OperatingSystem = "iOS16";
        iphone.memory = "8GB-256GB";
        iphone.price = 799;
        iphone. display = 6;
        iphone.pixel = "460ppi";

        System.out.println(iphone.name);
        iphone.camera();

        System.out.println("-------------------------------------");

        PhoneShahHW1 samsung = new PhoneShahHW1();
       samsung.name = "Samsung";
       samsung.OperatingSystem = "Android";
       samsung.memory = "8GB-256BG";
       samsung.price = 800;
       samsung.display = 6;
       samsung.pixel = "425ppi";

        System.out.println(samsung.name);
       samsung.directory();

        System.out.println("--------------------------------------");

        PhoneShahHW1 pixel =new PhoneShahHW1();
        pixel.name = "Pixel";
        pixel.OperatingSystem = "Pixel";
        pixel.memory = "8GB-128GB";
        pixel.price = 599;
        pixel.display = 6;
        pixel.pixel = "416ppi";

        System.out.println(pixel.name);
        pixel.internet();

    }


}












