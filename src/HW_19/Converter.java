package HW_19;

public class Converter {
    private String name;
    public Converter(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int convertToInt(Object obj) {
        if (obj instanceof Byte) {
            return (int) (Byte) obj;
        } else if (obj instanceof Short) {
            return (int) (Short) obj;
        } else if (obj instanceof Integer) {
            return (int) obj;
        } else if (obj instanceof Long) {
            return (int) (long) obj;
        } else if (obj instanceof Character) {
            return (int) (char) obj;
        } else if (obj instanceof Float) {
            return (int) (float) obj;
        } else if (obj instanceof Double) {
            return (int) (double) obj;
        } else if (obj instanceof String) {
            return Integer.parseInt((String) obj);
        } else if (obj instanceof Boolean) {
            System.out.println("Введен тип boolean");
            return 0;
        } else {
            throw new IllegalArgumentException("Неподдерживаемый тип данных");
        }
    }
    public double convertToDouble(Object obj) {
        if (obj instanceof Byte) {
            return (double) (Byte) obj;
        } else if (obj instanceof Short) {
            return (double) (Short) obj;
        } else if (obj instanceof Integer) {
            return (double) (int) obj;
        } else if (obj instanceof Long) {
            return (double) (long) obj;
        } else if (obj instanceof Character) {
            return (double) (char) obj;
        } else if (obj instanceof Float) {
            return (double) (float) obj;
        } else if (obj instanceof Double) {
            return (double) obj;
        } else if (obj instanceof String) {
            return Double.parseDouble((String) obj);
        } else if (obj instanceof Boolean) {
            System.out.println("Введен тип boolean");
            return 0.0;
        } else {
            throw new IllegalArgumentException("Неподдерживаемый тип данных");
        }
    }
    public String convertToString(Object obj) {
        return String.valueOf(obj);
    }
    public static void main(String[] args) {
        Converter converter = new Converter("My Converter");
        System.out.println(converter.getName());
        int intValue = converter.convertToInt(10);
        double doubleValue = converter.convertToDouble("3.14");
        String stringValue = converter.convertToString(false);
        System.out.println(converter.convertToString("Проверка" ));
        System.out.println(converter.convertToDouble(false));
        System.out.println(10 +converter.convertToInt(120));
    }
}


