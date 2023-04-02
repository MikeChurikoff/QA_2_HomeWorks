package HW_19;


    public class Tree {
        String type;
        int height;
        int countOfSticks;
        String colour;

        public Tree(String type, int height) {
            this.type = type;
            this.height = height;
            this.countOfSticks = 13;
            this.colour = "Зеленый";
        }

        public Tree(int height, int countOfSticks, String colour) {
            this.type = "пихта";
            this.height = height;
            this.countOfSticks = countOfSticks;
            this.colour = colour;
        }

        public Tree() {
            this.height = 350;
            this.countOfSticks = 29;
            this.colour = "Желтый";
        }

        public Tree(String type) {
            this(); // Вызов конструктора по умолчанию
            this.type = type;
        }

        public class main {
        }

            public static void main(String[] args) {
                Tree tree1 = new Tree("Дуб", 200);
                Tree tree2 = new Tree(150, 10, "Красный");
                Tree tree3 = new Tree(" ");
                Tree tree4 = new Tree("Ель");

                System.out.println(tree1.type + " " + tree1.height + " " + tree1.countOfSticks + " " + tree1.colour);
                System.out.println(tree2.type + " " + tree2.height + " " + tree2.countOfSticks + " " + tree2.colour);
                System.out.println(tree3.type + " " + tree3.height + " " + tree3.countOfSticks + " " + tree3.colour);
                System.out.println(tree4.type + " " + tree4.height + " " + tree4.countOfSticks + " " + tree4.colour);

            }

    }