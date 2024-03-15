package Modpack;

public class TestEmployee {
    public static void main(String[] args) {
        Manager manager = new Manager("Alex",33,"Manager");
        Manager manager1 = new Manager("Raymond",30,"Manager");
        Manager manager2 = new Manager("Ray",23,"Manager");
        Manager manager3 = new Manager("Steve",24,"Manager");
        Manager manager4 = new Manager("Rose",20,"Manager");
        Manager manager5 = new Manager("Sophia",10,"Manager");

        Manager[] arrayManager = new Manager[0];
        Manager[] resultArray;
        // Thêm vào đầu mảng
        resultArray = addManagerToStartArray(arrayManager, manager1);
        resultArray = addManagerToStartArray(resultArray, manager2);
        resultArray = addManagerToStartArray(resultArray, manager3);
        resultArray = addManagerToStartArray(resultArray, manager4);

        // Thêm vào cuối mảng
        resultArray = addManagerToEndArray(resultArray, manager5);

        // Xóa ở đầu mảng
        resultArray = removeManagerFromStartArray(resultArray);

        // Xóa ở cuối mảng
        resultArray = removeManagerFromEndArray(resultArray);

        // Tìm kiếm theo tên
        String nameSearch = "Rose";
        Manager resultArrays = searchManagerWithName(resultArray, nameSearch);
        if (resultArrays != null) {
            System.out.println("Found manager. Information is " + resultArrays);
        } else {
            System.out.println("Not found manager !");
        }

        for (int i = 0; i < resultArray.length; i++) {
            System.out.println(resultArray[i]);
        }

    }


    // Hàm tìm theo tên
    public static Manager searchManagerWithName(Manager[] oldArray, String name) {
        for (Manager item : oldArray) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    // Hàm xóa ở cuối mảng
    public static Manager[] removeManagerFromEndArray(Manager[] oldArray) {
        Manager[] newArrays = new Manager[oldArray.length - 1];

        System.arraycopy(oldArray,0, newArrays,0, newArrays.length);

        return newArrays;
    }

    // Hàm xóa ở đầu mảng
    public static Manager[] removeManagerFromStartArray(Manager[] oldArray) {
        Manager[] newArray = new Manager[oldArray.length - 1];

        System.arraycopy(oldArray, 1, newArray, 0, newArray.length);

        return newArray;
    }

    // Hàm thêm vào cuối mảng
    public static Manager[] addManagerToEndArray(Manager[] oldArray, Manager managers) {
        Manager[] newArray = new Manager[oldArray.length + 1];
        newArray[newArray.length - 1] = managers;

        System.arraycopy(oldArray,0,newArray,0, oldArray.length);

        return newArray;
    }

    // Hàm thêm vào đầu mảng
    public static Manager[] addManagerToStartArray(Manager[] oldArray, Manager newManager) {
        Manager[] newArray = new Manager[oldArray.length + 1];
        newArray[0] = newManager;

        System.arraycopy(oldArray, 0,newArray,1, oldArray.length);

        return newArray;
    }
}
