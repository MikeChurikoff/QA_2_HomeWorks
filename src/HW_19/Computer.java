package HW_19;


    public class Computer {
        private String brand;
        private int price;
        private int ram;
        private int cpu;

        public Computer(String brand, int price, int ram, int cpu) {
            this.brand = brand;
            this.price = price;
            this.ram = ram;
            this.cpu = cpu;

            System.out.println("Создан PC.");
            System.out.println("Имя = " + brand);
            System.out.println("Цена = " + price);
            System.out.println("Видеокарта = " + cpu);
            System.out.println("ОЗУ = " + ram);
        }

        public String getBrand() {
            return brand;
        }
        public void setBrand(String brand) {
            this.brand = brand;
        }
        public int getPrice() {
            return price;
        }
        public void setPrice(int price) {
            this.price = price;
        }
        public int getRam() {
            return ram;
        }
        public void setRam(int ram) {
            this.ram = ram;
        }
        public int getGpu() {
            return cpu;
        }
        public void setcpu(int gpu) {
            this.cpu = cpu;
        }
        public String getInfo() {
            return "Имя: " + brand + ", Цена: " + price + ", Видеокарта: " + cpu + ", ОЗУ: " + ram;
        }
        public static void main(String[] args) {
            Computer pc = new Computer("HP", 800, 8, 4);
            System.out.println(pc.getInfo());

            pc.setPrice(1000);
            pc.setcpu(8);
            System.out.println(pc.getInfo());
        }
    }

